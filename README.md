# Library pre-scan

Run OWASP Dependency-Check against five released JARs and SonarQube Community Build against their matching published Java sources. This is a local evaluation project; scans do not grant bank security approval.

| Library | Version |
| --- | --- |
| org.apache.poi:poi | 5.2.3 |
| org.apache.poi:poi-ooxml | 5.2.3 |
| org.apache.poi:poi-ooxml-lite | 5.2.3 |
| org.apache.xmlbeans:xmlbeans | 5.1.1 |
| com.github.virtuald:curvesapi | 1.07 |

## Requirements

The scripts support macOS and Linux x86_64. Windows users can use an x86_64 WSL2 Linux environment. The workflow has been checked on macOS; Linux/WSL2 have not been exercised here.

Install Python 3.12+, Java 21, Maven, SonarScanner CLI, and OWASP Dependency-Check. Use Bash and `shasum` for the shell scripts. Set `JAVA_HOME` to your JDK 21 directory; the launcher can also discover Homebrew's `openjdk@21`.

On macOS with Homebrew:

```sh
brew install python openjdk@21 maven sonar-scanner dependency-check
export JAVA_HOME="$(brew --prefix openjdk@21)/libexec/openjdk.jdk/Contents/Home"
export PATH="$JAVA_HOME/bin:$PATH"
```

On Linux, install equivalent tools from your approved package sources and meet [SonarQube host requirements](https://docs.sonarsource.com/sonarqube-community-build/server-installation/server-host-requirements). Run SonarQube as an ordinary user, not root. Maven and vulnerability updates require network access. Allow several GB of disk space for the local server, source files, and caches.

The original scans used Dependency-Check 13.0.0, SonarScanner 8.1.0.6389, Maven 3.9.16, and Java 21. Package managers may install newer versions; retain tool versions with your evidence. The server installer pins SonarQube 26.9.0.129388 and verifies its SHA-256.

## 1. Verify the inputs

Run all commands from the repository root after cloning:

```sh
python3 scripts/download-libs.py
```

The five binary JARs are committed under `libs/`. This command verifies them against the committed SHA-256 lock file and Maven Central's SHA-1, checks ZIP integrity, and recreates local provenance. If a JAR is missing, it is downloaded from Maven Central.

## 2. Dependency-Check: known vulnerabilities

```sh
./scripts/scan-dependencies.sh
```

Open [`reports/dependency-check/`](reports/dependency-check/) for the stable published report. Raw logs and run evidence are stored under the ignored `reports/raw/dependency-check/` directory. The first NVD database update can take several minutes; later scans reuse its cache.

The default uses official NVD 2.0 feeds and CISA KEV. No NVD key is required in this mode. OSS Index is disabled because it requires separate credentials. The first scan downloads the vulnerability database into the ignored `data/` directory; later scans reuse and update that local cache. For custom settings:

```sh
mkdir -p private
cp config/dependency-check.properties.example private/dependency-check.properties
chmod 600 private/dependency-check.properties
```

This checks only the five JARs in `libs/`; it does not resolve missing transitive dependencies. A successful exit is execution success, not zero findings. No bank severity threshold is assumed. You can supply an agreed threshold, for example `./scripts/scan-dependencies.sh --failOnCVSS 7`.

## 3. SonarQube: source analysis

First-time setup:

```sh
python3 scripts/setup-sonarqube.py
./scripts/sonarqube.sh start
```

Wait until [server status](http://127.0.0.1:9000/api/system/status) says `UP`. Then:

```sh
python3 scripts/configure-sonarqube.py
python3 scripts/prepare-source-scans.py
python3 scripts/scan-sources.py
python3 scripts/summarize-source-scans.py
```

A fresh server starts with `admin` / `admin`. The configuration script prompts privately for the current password and requires replacing the default; each teammate chooses their own password. It creates five private projects and analysis tokens. Credentials stay in ignored `private/`. Existing server state and saved credentials are retained on reruns.

The exact Java files analyzed in the published report are committed under [`sources/`](sources/). The preparation script verifies matching source archives, recreates the source selection and release bytecode, resolves the analysis classpath using Maven, and adds full-schema reference types. No upstream build or tests are run. The setup also downloads a pinned Temurin JDK 8 archive solely for reference classes; its macOS/x64 binaries are never executed, including on Linux or Apple Silicon. You may instead set `JAVA8_REFERENCE_HOME` to an existing JDK 8 directory for the scanner.

Open [SonarQube projects](http://127.0.0.1:9000/projects). Raw JSON and logs are stored under ignored `reports/raw/sonarqube/` runs. The last command publishes the latest complete evidence to [`reports/sonarqube/`](reports/sonarqube/). See [SOURCE-SCANS.md](SOURCE-SCANS.md) for scope and limitations.

For later scans, with the server running:

```sh
python3 scripts/scan-sources.py
# Or select particular libraries:
python3 scripts/scan-sources.py poi xmlbeans
```

Server controls:

```sh
./scripts/sonarqube.sh status
./scripts/sonarqube.sh stop
```

The local server binds to 127.0.0.1:9000 and uses embedded H2. Each teammate runs their own dashboard. The curated report snapshot is committed; raw runs and the local server database are not.

## Repository contents

| Committed | Purpose |
| --- | --- |
| scripts/ | Download, setup, scan, and summarize |
| config/ | Credential-free settings and examples |
| libs/ | The five exact binary JAR scan inputs |
| sources/ | The 4,937 exact Java files analyzed by SonarQube, with upstream licenses |
| reports/ | Stable Dependency-Check and SonarQube report packages |
| metadata/ | Binary provenance, pinned hashes, and release POMs |
| README.md, SOURCE-SCANS.md | Setup and analysis method |

Generated bytecode, source archives, analysis dependencies, raw reports, `tools/`, `data/`, `private/`, and generated metadata are ignored. Do not force-add ignored files: `private/` contains secrets, `tools/` contains the server database, and `data/` contains a large mutable vulnerability cache.

Before committing, inspect `git status --short` and `git diff --cached`. Publish only the stable report folders after reviewing a scan.

## Interpreting results

Dependency-Check finds known vulnerability matches; SonarQube finds source-code issues. A passed default SonarQube gate can coexist with existing bugs and vulnerabilities. Neither tool demonstrates application exploitability or bank approval. For an application pre-scan, also scan its complete resolved dependency graph and application code, and apply the bank's agreed acceptance criteria.
