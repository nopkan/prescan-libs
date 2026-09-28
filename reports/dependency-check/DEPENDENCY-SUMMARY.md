# OWASP Dependency-Check report

**Report time:** 2026-09-28T05:38:06.213903Z

The scan completed and produced the findings below. Completion does not mean security approval.

| Dependency-Check group | Findings |
| --- | --- |
| `curvesapi-1.07.jar` | No matched CVE |
| `poi-5.2.3.jar`, `poi-ooxml-5.2.3.jar`, `poi-ooxml-lite-5.2.3.jar` | [CVE-2025-31672](https://nvd.nist.gov/vuln/detail/CVE-2025-31672) (MEDIUM) |
| `xmlbeans-5.1.1.jar` | No matched CVE |

**Unique CVEs:** 1

## [CVE-2025-31672](https://nvd.nist.gov/vuln/detail/CVE-2025-31672)

**Severity:** MEDIUM; **CVSS:** 5.3

Improper Input Validation vulnerability in Apache POI. The issue affects the parsing of OOXML format files like xlsx, docx and pptx. These file formats are basically zip files and it is possible for malicious users to add zip entries with duplicate names (including the path) in the zip. In this case, products reading the affected file could read different data because 1 of the zip entries with the duplicate name is selected over another but different products may choose a different zip entry.
This issue affects Apache POI poi-ooxml before 5.4.0. poi-ooxml 5.4.0 has a check that throws an exception if zip entries with duplicate file names are found in the input file.
Users are recommended to upgrade to version poi-ooxml 5.4.0, which fixes the issue. Please read  https://poi.apache.org/security.html  for recommendations about how to use the POI libraries securely.

## Files

- [Interactive HTML](report.html)
- [Machine-readable JSON](report.json)
- [Input manifest](inputs.json)
- [Verification](verification.json)

## Scope

- The scan covers the five JARs in `libs/`; it does not resolve missing transitive dependencies.
- NVD and CISA KEV analysis were enabled. OSS Index was disabled because credentials were not configured.
- No custom suppression or bank-specific pass/fail threshold was applied.
- Zero matched CVEs does not establish that a component is vulnerability-free.
- SonarQube source findings are reported separately under [`../sonarqube/`](../sonarqube/).
