#!/usr/bin/env python3
"""Consolidate the latest completed source analysis for each requested artifact."""
import json
from pathlib import Path
from datetime import datetime, timezone

ROOT = Path(__file__).resolve().parent.parent


def main():
    latest = {}
    for run in sorted((ROOT / 'reports').glob('sonarqube-*')):
        summary = run / 'summary.json'
        if not summary.exists():
            continue
        for record in json.loads(summary.read_text()):
            artifact, version = record['coordinates'].split(':')[1:]
            latest[artifact] = (record, run / f'{artifact}-{version}')
    order = ['poi','poi-ooxml','poi-ooxml-lite','xmlbeans','curvesapi']
    if set(latest) != set(order):
        raise RuntimeError('Not all five artifacts have completed reports.')
    lines = ['# SonarQube library source pre-scan results', '',
             f'Consolidated: {datetime.now(timezone.utc).isoformat()}', '',
             'All five analyses completed and were processed by the local SonarQube server. Server version and quality-profile metadata are retained in each run. Results below are automated findings requiring review, not bank approval or confirmed exploitable vulnerabilities.', '',
             '| Library | Version | Java files | Potential bugs | Vulnerability findings | Code smells |',
             '| --- | --- | ---: | ---: | ---: | ---: |']
    for artifact in order:
        record, folder = latest[artifact]
        m=record['measures']
        lines.append(f'| [{artifact}]({record["url"]}) | {record["coordinates"].split(":")[-1]} | {m["files"]} | {m["bugs"]} | {m["vulnerabilities"]} | {m["code_smells"]} |')
    lines += ['', '## Security findings to review', '',
              'These are SonarQube rule findings, not CVE identifiers. Review context, reachability, and bank policy before deciding disposition. No findings have been suppressed or manually marked safe.', '']
    for artifact in order:
        record, folder=latest[artifact]
        issues=json.loads((folder/'issues-vulnerability.json').read_text())
        if not issues['issues']:
            continue
        lines += [f'### {artifact}', '']
        for issue in issues['issues']:
            relative=issue['component'].split(':',1)[1]
            source=ROOT/'sources'/f'{artifact}-{record["coordinates"].split(":")[-1]}'/relative
            line=issue.get('line',1)
            lines.append(f'- **{issue["severity"]}**, `{issue["rule"]}`: {issue["message"]} [{source.name}:{line}]({source}:{line})')
        lines.append('')
    lines += ['## Scope and limitations', '',
              '- Published sources were paired with the exact release bytecode. No upstream rebuild, unit tests, or test-coverage import was performed.',
              '- The lite schema scan covers only source classes represented in its binary: 2,291 selected, 2,856 source-only files excluded. Generated-code smells require separate interpretation.',
              '- Source level is Java 8 for POI/XMLBeans and Java 5 for CurvesAPI, with Java 8 reference classes. Multi-release variants and non-Java resources are outside the declared scope.',
              '- Debug logs show symbolic-execution step limits for some XMLBeans methods. Completed analysis does not mean every execution path was explored.',
              '- Inspect the saved quality-gate conditions: the default gate can pass despite existing findings. An OK gate does not constitute bank security approval.',
              '- CVE/dependency scans are separate Dependency-Check runs. Zero SonarQube vulnerability findings do not establish that a library has no known vulnerabilities.',
              f'- Detailed method, login location, and rerun instructions: [SOURCE-SCANS.md]({ROOT}/SOURCE-SCANS.md).', '',
              '## Evidence and scanner warnings', '']
    for artifact in order:
        record, folder=latest[artifact]
        warnings=[l.split('WARN',1)[1].strip() for l in (folder/'scanner.log').read_text().splitlines() if ' WARN ' in l]
        lines += [f'### {artifact}', '', f'[Evidence directory]({folder}) — analysis ID `{record["analysis_id"]}`.', '']
        for kind in ['bug','vulnerability','code_smell']:
            data=json.loads((folder/f'issues-{kind}.json').read_text())
            if data['exported']!=data['total']:
                raise RuntimeError(f'Incomplete {artifact} {kind} export')
        lines.append('All issue records exported; no pagination truncation.')
        if warnings:
            lines.append('')
            lines.extend('- '+w for w in dict.fromkeys(warnings))
        lines.append('')
    output=ROOT/'reports/SONARQUBE-SUMMARY.md'
    output.write_text('\n'.join(lines)+'\n')
    (ROOT/'metadata/source-scans/latest-reports.json').write_text(json.dumps(
        {a:{'summary':r,'evidence':str(p)} for a,(r,p) in latest.items()},indent=2)+'\n')
    print(output)


if __name__=='__main__':
    main()
