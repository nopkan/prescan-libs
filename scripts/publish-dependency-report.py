#!/usr/bin/env python3
"""Publish the latest Dependency-Check result in a stable, readable layout."""
import json
from pathlib import Path
import shutil
import sys

ROOT = Path(__file__).resolve().parent.parent


def sanitized_copy(source, destination):
    text = source.read_text(errors='replace').replace(str(ROOT) + '/', '')
    destination.write_text(text)


def main():
    if len(sys.argv) != 2:
        raise SystemExit('Usage: publish-dependency-report.py RUN_DIRECTORY')
    run = Path(sys.argv[1]).resolve()
    if not run.is_relative_to((ROOT / 'reports/raw/dependency-check').resolve()):
        raise SystemExit('Run directory must be under reports/raw/dependency-check.')
    report_path = run / 'dependency-check-report.json'
    report = json.loads(report_path.read_text())
    destination = ROOT / 'reports/dependency-check'
    if destination.exists():
        shutil.rmtree(destination)
    destination.mkdir(parents=True)
    copies = {
        'dependency-check-report.html': 'report.html',
        'dependency-check-report.json': 'report.json',
        'input-libraries.json': 'inputs.json',
        'tool-version.txt': 'tool-version.txt',
        'exit-code.txt': 'exit-code.txt',
        'finished-at.txt': 'finished-at.txt',
        'verification.json': 'verification.json',
    }
    for source_name, target_name in copies.items():
        source = run / source_name
        if source.exists():
            sanitized_copy(source, destination / target_name)

    inputs = json.loads((run / 'input-libraries.json').read_text())
    reported = []
    for dependency in report.get('dependencies', []):
        reported.append((dependency['fileName'], dependency['sha256']))
        reported.extend((item['fileName'], item['sha256'])
                        for item in dependency.get('relatedDependencies', []))
    expected = sorted((Path(item['file']).name, item['sha256']) for item in inputs)
    verification = {
        'report_date': report['projectInfo']['reportDate'],
        'input_jar_count': len(inputs),
        'report_entries_including_related': len(reported),
        'all_input_sha256_values_match_report': sorted(reported) == expected,
        'analysis_exceptions': report.get('scanInfo', {}).get('analysisExceptions', []),
    }
    (destination / 'verification.json').write_text(json.dumps(verification, indent=2) + '\n')

    groups = []
    unique = {}
    for dependency in report.get('dependencies', []):
        files = [dependency['fileName']]
        files.extend(item['fileName'] for item in dependency.get('relatedDependencies', []))
        vulnerabilities = dependency.get('vulnerabilities', [])
        for vulnerability in vulnerabilities:
            unique[vulnerability['name']] = vulnerability
        groups.append((files, vulnerabilities))

    lines = [
        '# OWASP Dependency-Check report', '',
        f'**Report time:** {report["projectInfo"]["reportDate"]}', '',
        'The scan completed and produced the findings below. Completion does not mean security approval.', '',
        '| Dependency-Check group | Findings |', '| --- | --- |'
    ]
    for files, vulnerabilities in groups:
        names = ', '.join(f'`{name}`' for name in files)
        findings = ', '.join(f'[{v["name"]}](https://nvd.nist.gov/vuln/detail/{v["name"]}) ({v["severity"]})' for v in vulnerabilities) or 'No matched CVE'
        lines.append(f'| {names} | {findings} |')
    lines += ['', f'**Unique CVEs:** {len(unique)}', '']
    for name, vulnerability in sorted(unique.items()):
        score = vulnerability.get('cvssv3', {}).get('baseScore', 'not supplied')
        lines += [f'## [{name}](https://nvd.nist.gov/vuln/detail/{name})', '',
                  f'**Severity:** {vulnerability["severity"]}; **CVSS:** {score}', '',
                  vulnerability.get('description', ''), '']
    lines += [
        '## Files', '',
        '- [Interactive HTML](report.html)',
        '- [Machine-readable JSON](report.json)',
        '- [Input manifest](inputs.json)',
        '- [Verification](verification.json)', '',
        '## Scope', '',
        '- The scan covers the five JARs in `libs/`; it does not resolve missing transitive dependencies.',
        '- NVD and CISA KEV analysis were enabled. OSS Index was disabled because credentials were not configured.',
        '- No custom suppression or bank-specific pass/fail threshold was applied.',
        '- Zero matched CVEs does not establish that a component is vulnerability-free.',
        '- SonarQube source findings are reported separately under [`../sonarqube/`](../sonarqube/).',
    ]
    (destination / 'DEPENDENCY-SUMMARY.md').write_text('\n'.join(lines) + '\n')
    print(destination)


if __name__ == '__main__':
    main()
