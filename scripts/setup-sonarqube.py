#!/usr/bin/env python3
"""Install the pinned local server and reference classes; preserve existing state."""
import hashlib
import os
from pathlib import Path
import shutil
import tarfile
import tempfile
from urllib.request import urlopen
from zipfile import ZipFile

from runtime import ROOT, java21_home, reference_java_home

VERSION = '26.9.0.129388'
SERVER_URL = f'https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-{VERSION}.zip'
SERVER_SHA256 = 'b7306f5ecfa6806753bc0eb0dc4ea11fe0ddd2c5a346592718814d6ec35b88cb'
JDK_URL = 'https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u504-b01/OpenJDK8U-jdk_x64_mac_hotspot_8u504b01.tar.gz'
JDK_SHA256 = '4b4518a2060c98c0ed195947fa29c8f5aa7f1c608817e8ad1850719517f11ac0'


def download(url, target, expected):
    print(f'Downloading {url.rsplit("/", 1)[-1]}', flush=True)
    with urlopen(url, timeout=180) as response, target.open('wb') as out:
        shutil.copyfileobj(response, out)
    digest = hashlib.sha256()
    with target.open('rb') as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b''):
            digest.update(chunk)
    if digest.hexdigest() != expected:
        raise RuntimeError(f'SHA-256 mismatch: {target.name}')


def main():
    print(f'Java 21: {java21_home()}')
    tools = ROOT / 'tools'
    tools.mkdir(exist_ok=True)
    server = tools / f'sonarqube-{VERSION}'
    with tempfile.TemporaryDirectory(prefix='prescan-install-') as tmp:
        tmp = Path(tmp)
        if not server.exists():
            archive = tmp / 'server.zip'
            download(SERVER_URL, archive, SERVER_SHA256)
            staging = tmp / 'server'
            with ZipFile(archive) as z:
                for member in z.infolist():
                    if not (staging / member.filename).resolve().is_relative_to(staging.resolve()):
                        raise ValueError('Unsafe ZIP path')
                z.extractall(staging)
            extracted = staging / server.name
            for executable in extracted.glob('bin/*/sonar.sh'):
                executable.chmod(0o755)
            # Bundled Elasticsearch shell tools also need their executable bit.
            for executable in (extracted / 'elasticsearch/bin').iterdir():
                if executable.is_file():
                    executable.chmod(0o755)
            config = extracted / 'conf/sonar.properties'
            with config.open('a') as out:
                out.write('\nsonar.web.host=127.0.0.1\nsonar.web.port=9000\n')
            shutil.move(str(extracted), server)
        else:
            print('Existing server retained, including its database and configuration.')
        reference = tools / 'analysis-jdk8'
        if os.environ.get('JAVA8_REFERENCE_HOME'):
            print(f'Using reference JDK: {reference_java_home()}')
        elif not list(reference.glob('*/Contents/Home/jre/lib/rt.jar')):
            archive = tmp / 'reference.tar.gz'
            download(JDK_URL, archive, JDK_SHA256)
            staging = tmp / 'jdk'
            # Python 3.12+ data filter rejects unsafe archive paths and links.
            with tarfile.open(archive) as t:
                t.extractall(staging, filter='data')
            reference.mkdir(exist_ok=True)
            for child in staging.iterdir():
                shutil.move(str(child), reference / child.name)
    print('Ready. Start with ./scripts/sonarqube.sh start; then configure-sonarqube.py.')


if __name__ == '__main__':
    main()
