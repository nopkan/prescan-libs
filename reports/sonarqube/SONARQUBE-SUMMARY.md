# SonarQube library source pre-scan results

Consolidated: 2026-09-28T06:09:06.248858+00:00

All five analyses completed and were processed by the local SonarQube server. Server version and quality-profile metadata are retained in each run. Results below are automated findings requiring review, not bank approval or confirmed exploitable vulnerabilities.

| Library | Version | Java files | Potential bugs | Vulnerability findings | Code smells |
| --- | --- | ---: | ---: | ---: | ---: |
| [poi](poi-5.2.3/) | 5.2.3 | 1234 | 8 | 2 | 4597 |
| [poi-ooxml](poi-ooxml-5.2.3/) | 5.2.3 | 642 | 16 | 4 | 1676 |
| [poi-ooxml-lite](poi-ooxml-lite-5.2.3/) | 5.2.3 | 2291 | 0 | 0 | 6887 |
| [xmlbeans](xmlbeans-5.1.1/) | 5.1.1 | 691 | 110 | 19 | 5931 |
| [curvesapi](curvesapi-1.07/) | 1.07 | 79 | 9 | 0 | 276 |

## Security findings to review

These are SonarQube rule findings, not CVE identifiers. Review context, reachability, and bank policy before deciding disposition. No findings have been suppressed or manually marked safe.

### poi

- **CRITICAL**, `java:S4790`: Make sure this weak hash algorithm is not used in a sensitive context here. [HSSFWorkbook.java:1966](../../sources/poi-5.2.3/scan-src/org/apache/poi/hssf/usermodel/HSSFWorkbook.java:1966)
- **CRITICAL**, `java:S3329`: Use a dynamically-generated, random IV. [AgileDecryptor.java:245](../../sources/poi-5.2.3/scan-src/org/apache/poi/poifs/crypt/agile/AgileDecryptor.java:245)

### poi-ooxml

- **MAJOR**, `java:S6377`: Set the 'org.jcp.xml.dsig.secureValidation' property to "true" on the 'DOMValidateContext' object to validate this XML signature securely. [SignaturePart.java:129](../../sources/poi-ooxml-5.2.3/scan-src/org/apache/poi/poifs/crypt/dsig/SignaturePart.java:129)
- **CRITICAL**, `java:S5527`: Enable server hostname verification on this SSL/TLS connection. [TimeStampSimpleHttpClient.java:271](../../sources/poi-ooxml-5.2.3/scan-src/org/apache/poi/poifs/crypt/dsig/services/TimeStampSimpleHttpClient.java:271)
- **CRITICAL**, `java:S4830`: Enable server certificate validation on this SSL/TLS connection. [TimeStampSimpleHttpClient.java:281](../../sources/poi-ooxml-5.2.3/scan-src/org/apache/poi/poifs/crypt/dsig/services/TimeStampSimpleHttpClient.java:281)
- **CRITICAL**, `java:S4830`: Enable server certificate validation on this SSL/TLS connection. [TimeStampSimpleHttpClient.java:283](../../sources/poi-ooxml-5.2.3/scan-src/org/apache/poi/poifs/crypt/dsig/services/TimeStampSimpleHttpClient.java:283)

### xmlbeans

- **BLOCKER**, `java:S2755`: Disable access to external entities in XML parsing. [DocumentHelper.java:97](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/common/DocumentHelper.java:97)
- **CRITICAL**, `java:S4790`: Make sure this weak hash algorithm is not used in a sensitive context here. [QNameHelper.java:147](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/common/QNameHelper.java:147)
- **BLOCKER**, `java:S2755`: Disable access to external entities in XML parsing. [SAXHelper.java:62](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/common/SAXHelper.java:62)
- **BLOCKER**, `java:S2755`: Disable access to external entities in XML parsing. [StaxHelper.java:38](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/common/StaxHelper.java:38)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [REUtil.java:222](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/regex/REUtil.java:222)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [REUtil.java:235](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/regex/REUtil.java:235)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [SchemaTypeImpl.java:1776](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/schema/SchemaTypeImpl.java:1776)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [SchemaTypeImpl.java:1793](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/schema/SchemaTypeImpl.java:1793)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [SchemaTypeImpl.java:1895](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/schema/SchemaTypeImpl.java:1895)
- **CRITICAL**, `java:S4790`: Make sure this weak hash algorithm is not used in a sensitive context here. [SchemaTypeLoaderBase.java:220](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/schema/SchemaTypeLoaderBase.java:220)
- **CRITICAL**, `java:S4790`: Make sure this weak hash algorithm is not used in a sensitive context here. [BaseSchemaResourceManager.java:323](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/tool/BaseSchemaResourceManager.java:323)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [SchemaCodeGenerator.java:104](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/tool/SchemaCodeGenerator.java:104)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [SchemaResourceManager.java:122](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/tool/SchemaResourceManager.java:122)
- **CRITICAL**, `java:S4790`: Make sure this weak hash algorithm is not used in a sensitive context here. [JavaBase64Holder.java:115](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/values/JavaBase64Holder.java:115)
- **CRITICAL**, `java:S4790`: Make sure this weak hash algorithm is not used in a sensitive context here. [JavaHexBinaryHolder.java:118](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/values/JavaHexBinaryHolder.java:118)
- **MAJOR**, `java:S2245`: Make sure that using this pseudorandom number generator is safe here. [SampleXmlUtil.java:98](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/xsd2inst/SampleXmlUtil.java:98)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [SchemaInstanceGenerator.java:187](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/xsd2inst/SchemaInstanceGenerator.java:187)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [SchemaInstanceGenerator.java:235](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/xsd2inst/SchemaInstanceGenerator.java:235)
- **MINOR**, `java:S4507`: Make sure this debug feature is deactivated before delivering the code in production. [SchemaInstanceGenerator.java:267](../../sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/xsd2inst/SchemaInstanceGenerator.java:267)

## Scope and limitations

- Published sources were paired with the exact release bytecode. No upstream rebuild, unit tests, or test-coverage import was performed.
- The lite schema scan covers only source classes represented in its binary: 2,291 selected, 2,856 source-only files excluded. Generated-code smells require separate interpretation.
- Source level is Java 8 for POI/XMLBeans and Java 5 for CurvesAPI, with Java 8 reference classes. Multi-release variants and non-Java resources are outside the declared scope.
- Debug logs show symbolic-execution step limits for some XMLBeans methods. Completed analysis does not mean every execution path was explored.
- Inspect the saved quality-gate conditions: the default gate can pass despite existing findings. An OK gate does not constitute bank security approval.
- CVE/dependency scans are separate Dependency-Check runs. Zero SonarQube vulnerability findings do not establish that a library has no known vulnerabilities.
- Detailed method and rerun instructions: [SOURCE-SCANS.md](../../SOURCE-SCANS.md).

## Evidence and scanner warnings

### poi

[Evidence directory](poi-5.2.3/) — analysis ID `f4c33853-739e-47bd-885a-302b5b08ecd0`.

All issue records exported; no pagination truncation.

- Retrieving only language associated files, make sure to run the analysis inside a git repository to make use of inclusions specified via "sonar.text.inclusions"

### poi-ooxml

[Evidence directory](poi-ooxml-5.2.3/) — analysis ID `3fcaa2a4-b1b6-4ea4-a808-87cb883fab6b`.

All issue records exported; no pagination truncation.

- Retrieving only language associated files, make sure to run the analysis inside a git repository to make use of inclusions specified via "sonar.text.inclusions"

### poi-ooxml-lite

[Evidence directory](poi-ooxml-lite-5.2.3/) — analysis ID `0d11a37c-9a71-42f3-96dd-49de1fc985d8`.

All issue records exported; no pagination truncation.

- Retrieving only language associated files, make sure to run the analysis inside a git repository to make use of inclusions specified via "sonar.text.inclusions"

### xmlbeans

[Evidence directory](xmlbeans-5.1.1/) — analysis ID `849a3475-073e-40d0-bfc7-291032dd33ea`.

All issue records exported; no pagination truncation.

- Test files were detected using a path heuristic because "sonar.tests" is not set. To improve the analysis accuracy, it is recommended to configure it, e.g.: "sonar.tests=src/test".
- Invalid character encountered in file <workspace>/sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/schema/StscChecker.java at line 330 for encoding UTF-8. Please fix file content or configure the encoding to be used using property 'sonar.sourceEncoding'.
- Invalid character encountered in file <workspace>/sources/xmlbeans-5.1.1/scan-src/org/apache/xmlbeans/impl/schema/StscComplexTypeResolver.java at line 1005 for encoding UTF-8. Please fix file content or configure the encoding to be used using property 'sonar.sourceEncoding'.
- Retrieving only language associated files, make sure to run the analysis inside a git repository to make use of inclusions specified via "sonar.text.inclusions"

### curvesapi

[Evidence directory](curvesapi-1.07/) — analysis ID `fff1c213-0db9-46f3-8d1a-09bbc68fc247`.

All issue records exported; no pagination truncation.

- Retrieving only language associated files, make sure to run the analysis inside a git repository to make use of inclusions specified via "sonar.text.inclusions"

