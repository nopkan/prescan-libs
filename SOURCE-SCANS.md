# SonarQube scans of the five released libraries

These are **Java source analyses of upstream releases**, not analyses of the banking application and not CVE scans. Dependency-Check remains a separate step.

## Method

The exact `-sources.jar` for each requested Maven coordinate was downloaded from Maven Central and checked against its published SHA-1; SHA-256 values and input details are retained in `metadata/source-scans/inputs.json`. Original source archives and extracted contents are under `sources/<artifact>-<version>/`.

The corresponding `.class` files were extracted from the already verified binary JARs in `libs/`. This supplies the release's actual bytecode to SonarQube. **No upstream build or unit-test suite was executed, and these results do not establish reproducible builds.** Each ordinary top-level binary class has a corresponding source file. Package metadata and multi-release Java 9/11 descriptors/variants are outside that matching check; the analysis targets the base Java implementation.

`scan-src/` contains unmodified copies of the selected Java source files. `poi-ooxml-lite` publishes a source archive that includes a larger schema set than its binary. Its analysis selects the 2,291 Java files matching the lite binary and excludes 2,856 source-only classes; the full exclusion list is retained in the input metadata. Generated code is included and identified as such, so its maintainability/duplication findings need separate interpretation.

| Artifact | Version | Java files selected |
| --- | --- | ---: |
| poi | 5.2.3 | 1,234 |
| poi-ooxml | 5.2.3 | 642 |
| poi-ooxml-lite | 5.2.3 | 2,291 |
| xmlbeans | 5.1.1 | 691 |
| curvesapi | 1.07 | 79 |

The scanner runs on Java 21 (or its automatically provisioned runtime). A verified Temurin Java 8 distribution provides reference JDK classes through `sonar.java.jdkHome`; it is not executed. POI and XMLBeans are analyzed with source level 8. CurvesAPI is analyzed with source level 5, as declared by its original POM, using Java 8 reference classes; differences from a historical Java 5 runtime remain a limitation.

A separate Maven resolver POM collects the libraries' declared dependencies, including optional/provided dependencies needed by their implementations. The initial classpath has 66 JARs. XMLBeans' published POM omits some implementation dependencies and differs from its release Gradle build; the corrected resolver uses that build's Ant 1.10.12, JavaParser symbol solver 3.24.4, Maven 3.8.4, and plugin annotations 3.6.2, resulting in 96 JARs. The matching `poi-ooxml-full:5.2.3` binary provides additional reference types for the selected lite schema sources. Its source is not added to the scan.

All supporting dependencies are analysis classpath entries, not additions to the five-JAR Dependency-Check scope. The generated resolver POM is `sources/classpath/pom.xml`; scanner configurations and inputs are retained with each local run. XMLBeans corrections follow the [official REL_5_1_1 build](https://github.com/apache/xmlbeans/blob/REL_5_1_1/build.gradle). This classpath is not the bank application's dependency graph.

## Open results

Start the local server from the workspace:

```sh
./scripts/sonarqube.sh start
```

Wait until `http://127.0.0.1:9000/api/system/status` returns `UP`, then open [SonarQube projects](http://127.0.0.1:9000/projects). There is one private project per JAR.

Each teammate configures a separate local administrator password. The local login is in `private/sonarqube-local.json` (permissions `600`). Project-scoped scanner tokens are stored separately under `private/`; do not commit or include them with submitted reports.

Each dated directory under `reports/raw/sonarqube/` contains:

- Input manifest and server version.
- Scanner configurations and full logs.
- Server compute-task/analysis identifiers, confirming processing completion.
- Measures, quality-gate status, and quality-profile metadata.
- Exported bug, vulnerability, code-smell, and hotspot records.
- A machine-readable `summary.json` and a readable results summary when generated.

[`reports/sonarqube/SONARQUBE-SUMMARY.md`](reports/sonarqube/SONARQUBE-SUMMARY.md) consolidates the latest completed run per library, with stable per-library evidence folders. Earlier diagnostic runs remain locally under ignored `reports/raw/sonarqube/` for traceability.

## Interpretation

The built-in **Sonar way** Java profile is used. Findings are tool-generated candidates requiring review; hotspots specifically require human security review. A zero vulnerability count is not evidence of no known CVEs or no exploitable issues. The default quality gate is not a bank approval policy; an initial baseline may pass despite existing findings.

No test or coverage reports were supplied. Any displayed 0% coverage means no coverage evidence was imported for this analysis, not that the upstream project has no tests. The scan is scoped to selected Java files. Non-Java resources, build scripts, multi-release variants, the rest of the upstream repository, and the banking application's usage are outside this scope. The scanner's text/secrets warning about not being in a Git repository refers to additional non-language-associated files; those files are outside the declared Java-only scope.

XMLBeans' published source contains U+FFFD replacement characters in comments in `StscChecker.java` and `StscComplexTypeResolver.java`. Those bytes are valid UTF-8 but trigger scanner character warnings. They were verified in the original source archive and preserved unchanged. XMLBeans also triggers a test-path heuristic warning; this run explicitly scopes the shipped Java sources as main source, with no separate test suite. Scanner warnings remain in the evidence and summary.

Debug logs also show the Java analyzer reaching symbolic-execution step limits in some XMLBeans methods. Successful processing does not imply that every possible execution path was examined. The corrected XMLBeans scan resolves the missing-type warnings from the first pass.

## Repeat

With the prepared inputs, dependencies, tokens, and local SonarQube server available:

```sh
python3 scripts/scan-sources.py
# Or select specific artifacts:
python3 scripts/scan-sources.py poi xmlbeans
```

The runner waits for server processing and exports evidence. It raises an error if scanning or server processing fails. Review logs and any export counts before using the results. The issue exporter records both total and exported counts and caps each issue type at the API's 10,000-result window.

For a fresh checkout, follow [README.md](README.md), including local server and credential setup. Repeat preparation with:

```sh
python3 scripts/prepare-source-scans.py
```

This resolves the Maven classpath and full-schema reference automatically. Java 21 is selected from `JAVA_HOME`, Homebrew, or the Java on PATH; no machine-specific user path is required.

Reference: [SonarQube Java source, bytecode, and JDK requirements](https://docs.sonarsource.com/sonarqube-community-build/analyzing-source-code/languages/java).
