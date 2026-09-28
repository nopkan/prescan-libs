#!/usr/bin/env python3
"""Run five local SonarQube analyses and retain API evidence without secrets."""
import base64
import json
import os
from pathlib import Path
import subprocess
import sys
import time
from runtime import java21_home, reference_java_home
from datetime import datetime, timezone
from urllib.parse import urlencode
from urllib.request import Request, urlopen

ROOT = Path(__file__).resolve().parent.parent
URL = 'http://127.0.0.1:9000'


def api(path, params=None):
    creds = json.loads((ROOT / 'private/sonarqube-local.json').read_text())
    req = Request(URL + path + ('?' + urlencode(params) if params else ''))
    req.add_header('Authorization', 'Basic ' + base64.b64encode(
        (creds['login'] + ':' + creds['password']).encode()).decode())
    with urlopen(req, timeout=120) as response:
        return json.load(response)


def save(path, obj):
    path.write_text(json.dumps(obj, indent=2) + '\n')


def main():
    inputs = json.loads((ROOT / 'metadata/source-scans/inputs.json').read_text())
    inputs.sort(key=lambda x: ['curvesapi','poi','poi-ooxml','xmlbeans','poi-ooxml-lite'].index(x['coordinates'].split(':')[1]))
    if len(sys.argv) > 1:
        unknown = set(sys.argv[1:]) - {x['coordinates'].split(':')[1] for x in inputs}
        if unknown:
            raise SystemExit('Unknown artifacts: ' + ', '.join(sorted(unknown)))
        inputs = [x for x in inputs if x['coordinates'].split(':')[1] in sys.argv[1:]]
    jdk8 = reference_java_home()
    classpath = ROOT / 'sources/classpath/deps-complete'
    if not classpath.exists():
        classpath = ROOT / 'sources/classpath/deps'
    run = ROOT / 'reports' / ('sonarqube-' + datetime.now(timezone.utc).strftime('%Y%m%dT%H%M%SZ'))
    run.mkdir(parents=True)
    save(run / 'inputs.json', inputs)
    save(run / 'server-status.json', api('/api/system/status'))
    summaries = []
    for item in inputs:
        group, artifact, version = item['coordinates'].split(':')
        key = item['project_key']
        base = ROOT / 'sources' / f'{artifact}-{version}'
        out = run / f'{artifact}-{version}'
        out.mkdir()
        libraries = f'{classpath}/*.jar'
        if artifact == 'poi-ooxml-lite':
            libraries += f',{ROOT}/sources/classpath/schema-support/*.jar'
        config = [f'sonar.projectKey={key}', f'sonar.projectName={item["coordinates"]}',
                  f'sonar.projectVersion={version}', f'sonar.host.url={URL}',
                  'sonar.sources=scan-src', 'sonar.java.binaries=classes',
                  f'sonar.java.libraries={libraries}',
                  f'sonar.java.jdkHome={jdk8}',
                  f'sonar.java.source={"5" if artifact == "curvesapi" else "8"}',
                  'sonar.sourceEncoding=UTF-8', 'sonar.scm.disabled=true',
                  'sonar.inclusions=**/*.java', 'sonar.java.skipUnchanged=false']
        if os.environ.get('PRESCAN_VERBOSE') == '1':
            config.append('sonar.verbose=true')
        (base / 'sonar-project.properties').write_text('\n'.join(config)+'\n')
        (out / 'sonar-project.properties').write_text('\n'.join(config)+'\n')
        env = dict(os.environ)
        env['SONAR_TOKEN'] = (ROOT / 'private' / f'{key}.token').read_text().strip()
        env['JAVA_HOME'] = str(java21_home())
        env['SONAR_SCANNER_JAVA_OPTS'] = '-Xmx3g'
        print(f'Scanning {item["coordinates"]} ({item["selected_java_files"]} source files)', flush=True)
        with (out / 'scanner.log').open('w') as log:
            result = subprocess.run(['sonar-scanner'], cwd=base, env=env, stdout=log, stderr=subprocess.STDOUT)
        if result.returncode:
            raise RuntimeError(f'Scanner failed for {artifact}; see {out}/scanner.log')
        task = dict(line.split('=', 1) for line in (base / '.scannerwork/report-task.txt').read_text().splitlines() if '=' in line)
        save(out / 'scanner-task.json', task)
        for _ in range(180):
            ce = api('/api/ce/task', {'id': task['ceTaskId']})
            if ce['task']['status'] not in ['PENDING','IN_PROGRESS']:
                break
            time.sleep(2)
        save(out / 'compute-task.json', ce)
        if ce['task']['status'] != 'SUCCESS':
            raise RuntimeError(f'Compute task: {ce["task"]["status"]}')
        metrics = api('/api/measures/component', {'component':key,'metricKeys':
            'ncloc,files,bugs,vulnerabilities,code_smells,security_hotspots,duplicated_lines_density,coverage,reliability_rating,security_rating,sqale_rating'})
        save(out / 'measures.json', metrics)
        gate = api('/api/qualitygates/project_status', {'analysisId':ce['task']['analysisId']})
        save(out / 'quality-gate.json',gate)
        save(out / 'quality-profiles.json',api('/api/qualityprofiles/search',{'project':key}))
        # Query issue types separately to stay below API result-window limits.
        for kind in ['BUG','VULNERABILITY','CODE_SMELL']:
            all_issues = []
            page = 1
            while True:
                response = api('/api/issues/search',{'components':key,'types':kind,'resolved':'false','ps':500,'p':page})
                all_issues.extend(response['issues'])
                total = response['total']
                if len(all_issues) >= total or page >= 20:
                    break
                page += 1
            save(out / f'issues-{kind.lower()}.json',{'total':total,'exported':len(all_issues),'issues':all_issues})
        hotspots=[]
        page=1
        while True:
            response=api('/api/hotspots/search',{'project':key,'ps':500,'p':page})
            hotspots.extend(response['hotspots'])
            if len(hotspots)>=response['paging']['total']:
                break
            page+=1
        save(out/'hotspots.json',{'total':response['paging']['total'],'hotspots':hotspots})
        summary={'coordinates':item['coordinates'],'project_key':key,'url':task['dashboardUrl'],
                 'analysis_id':ce['task']['analysisId'],'selected_java_files':item['selected_java_files'],
                 'measures':{m['metric']:m.get('value') for m in metrics['component']['measures']},
                 'quality_gate':gate['projectStatus']['status']}
        summaries.append(summary)
        save(run/'summary.json', summaries)
        print(json.dumps(summary),flush=True)
    print(f'Reports: {run}',flush=True)


if __name__ == '__main__':
    main()
