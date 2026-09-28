#!/usr/bin/env python3
"""Prepare exact Maven source/binary pairs, with an explicit dependency resolver."""
import hashlib
import json
import shutil
import subprocess
from pathlib import Path
from urllib.request import urlopen
from xml.etree import ElementTree as ET
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parent.parent


def main():
    (ROOT / 'metadata/source-scans').mkdir(parents=True, exist_ok=True)
    records = []
    dependencies = {}
    for item in json.loads((ROOT / 'metadata/libraries.json').read_text()):
        group, artifact, version = item['coordinates'].split(':')
        base = ROOT / 'sources' / f'{artifact}-{version}'
        base.mkdir(parents=True, exist_ok=True)
        url = item['url'][:-4] + '-sources.jar'
        archive = base / 'published-sources.jar'
        content = archive.read_bytes() if archive.exists() else urlopen(url, timeout=120).read()
        expected = urlopen(url + '.sha1', timeout=60).read().decode().strip().split()[0]
        assert hashlib.sha1(content).hexdigest() == expected, url
        archive.write_bytes(content)
        # Clear only generated extraction directories so reruns cannot retain stale classes.
        for name in ('src', 'scan-src', 'classes'):
            if (base / name).exists():
                shutil.rmtree(base / name)
        with ZipFile(archive) as z:
            assert z.testzip() is None
            for member in z.infolist():
                target = (base / 'src' / member.filename).resolve()
                if not target.is_relative_to((base / 'src').resolve()):
                    raise ValueError('Unsafe archive path')
            z.extractall(base / 'src')
        with ZipFile(ROOT / item['file']) as z:
            for name in z.namelist():
                if name.endswith('.class') and not name.startswith('META-INF/versions/'):
                    target = base / 'classes' / name
                    assert target.resolve().is_relative_to((base / 'classes').resolve())
                    target.parent.mkdir(parents=True, exist_ok=True)
                    target.write_bytes(z.read(name))
        java = list((base / 'src').rglob('*.java'))
        missing = [str(p.relative_to(base / 'src')) for p in java
                   if p.name not in ('package-info.java', 'module-info.java')
                   and not (base / 'classes' / p.relative_to(base / 'src')).with_suffix('.class').exists()]
        selected = []
        for path in java:
            relative = path.relative_to(base / 'src')
            if str(relative) in missing:
                continue
            dest = base / 'scan-src' / relative
            dest.parent.mkdir(parents=True, exist_ok=True)
            shutil.copyfile(path, dest)
            selected.append(str(relative))
        record = {**item, 'source_url': url, 'source_sha1': expected,
                  'source_sha256': hashlib.sha256(content).hexdigest(),
                  'java_files': len(java), 'class_files': len(list((base / 'classes').rglob('*.class'))),
                  'sources_without_same_path_class': missing,
                  'selected_java_files': len(selected),
                  'project_key': f'lib-prescan-{artifact}-{version}',
                  'source_directory': str(base.relative_to(ROOT)), 'generated_schema': artifact == 'poi-ooxml-lite'}
        records.append(record)
        print(f'{artifact}: {len(java)} Java files; {len(missing)} without same-path top-level class', flush=True)
        dependencies[(group, artifact)] = version
        # Also include optional/provided dependencies used by the libraries' own implementation.
        pom = ET.parse(ROOT / 'metadata/poms' / f'{artifact}-{version}.pom').getroot()
        for element in pom.iter():
            element.tag = element.tag.split('}')[-1]
        for dep in pom.findall('dependencies/dependency'):
            if dep.findtext('scope') == 'test':
                continue
            key = (dep.findtext('groupId'), dep.findtext('artifactId'))
            dependencies.setdefault(key, dep.findtext('version'))
    resolver = ROOT / 'sources' / 'classpath'
    resolver.mkdir(exist_ok=True)
    # XMLBeans' release Gradle build declares implementation dependencies omitted
    # or versioned differently in its published POM. These resolve analysis types.
    # Reference: apache/xmlbeans REL_5_1_1/build.gradle (retained in metadata).
    dependencies.update({
        ('org.apache.ant', 'ant'): '1.10.12',
        ('com.github.javaparser', 'javaparser-symbol-solver-core'): '3.24.4',
        ('org.apache.maven', 'maven-core'): '3.8.4',
        ('org.apache.maven', 'maven-model'): '3.8.4',
        ('org.apache.maven', 'maven-plugin-api'): '3.8.4',
        ('org.apache.maven.plugin-tools', 'maven-plugin-annotations'): '3.6.2',
    })
    text = '<project xmlns="http://maven.apache.org/POM/4.0.0"><modelVersion>4.0.0</modelVersion>'
    text += '<groupId>local.prescan</groupId><artifactId>analysis-classpath</artifactId><version>1.0</version><dependencies>'
    for (group, artifact), version in sorted(dependencies.items()):
        text += f'<dependency><groupId>{group}</groupId><artifactId>{artifact}</artifactId><version>{version}</version></dependency>'
    text += '</dependencies></project>\n'
    (resolver / 'pom.xml').write_text(text)
    (ROOT / 'metadata/source-scans/inputs.json').write_text(json.dumps(records, indent=2)+'\n')
    subprocess.run(['mvn', '-B', '-f', str(resolver / 'pom.xml'),
                    'org.apache.maven.plugins:maven-dependency-plugin:3.8.1:copy-dependencies',
                    '-DoutputDirectory=deps-complete'], check=True)
    schema = resolver / 'schema-support/poi-ooxml-full-5.2.3.jar'
    schema.parent.mkdir(exist_ok=True)
    url = 'https://repo.maven.apache.org/maven2/org/apache/poi/poi-ooxml-full/5.2.3/poi-ooxml-full-5.2.3.jar'
    content = schema.read_bytes() if schema.exists() else urlopen(url, timeout=120).read()
    if hashlib.sha256(content).hexdigest() != '0484b712eb63a8872723cafb88004be60f47187baccacddaee12712a1ad2e7b5':
        raise RuntimeError('Full schema reference SHA-256 mismatch')
    schema.write_bytes(content)
    print('Source pairs and analysis classpath ready.')


if __name__ == '__main__':
    main()
