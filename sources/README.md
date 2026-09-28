# Source code analyzed by SonarQube

Each versioned directory contains `scan-src/`, the exact Java source set used
for the corresponding SonarQube analysis. The files are unmodified copies from
the matching Maven Central `-sources.jar` release.

[`MANIFEST.json`](MANIFEST.json) records the source archive URLs, published
SHA-1 values, local SHA-256 values, and selected Java-file counts.

The five source sets contain 4,937 Java files. For `poi-ooxml-lite`, the
published source archive contains a larger schema set than the binary JAR, so
only the 2,291 source classes represented in `poi-ooxml-lite-5.2.3.jar` are
included in `scan-src/` and analyzed.

Generated local support files remain excluded from Git:

- `src/`: the complete extracted source archives, duplicated for preparation.
- `classes/`: bytecode extracted from the committed JARs.
- `classpath/`: Maven dependencies used only to resolve types during analysis.
- `published-sources.jar`: downloadable source archives.
- `sonar-project.properties`: machine-generated scanner configuration.

Run `python3 scripts/prepare-source-scans.py` to recreate those support files.
License and notice files beside each source set come from the matching upstream
release or its tagged source repository.
