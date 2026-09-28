# Published scan reports

This directory contains one reviewed report set for each tool:

| Tool | Open first | Contents |
| --- | --- | --- |
| OWASP Dependency-Check | [dependency-check/DEPENDENCY-SUMMARY.md](dependency-check/DEPENDENCY-SUMMARY.md) | CVE summary, HTML report, JSON report, inputs, and verification |
| SonarQube | [sonarqube/SONARQUBE-SUMMARY.md](sonarqube/SONARQUBE-SUMMARY.md) | Combined summary plus complete issue exports for each library |

`dependency-check/` and `sonarqube/` have stable names so links remain easy to
use. New scans are written under the ignored `raw/` directory. Publishing a
Dependency-Check run replaces `dependency-check/`; running
`scripts/summarize-source-scans.py` replaces the per-library SonarQube evidence
with the latest completed run for each library.

The SonarQube JSON exports contain bugs, vulnerability findings, code smells,
hotspots, measures, quality-gate results, and quality-profile details. The live
dashboard remains local to each teammate's SonarQube installation.

These reports are automated evidence, not bank security approval. Review the
findings, reachability, false positives, upgrade plan, and acceptance criteria.
