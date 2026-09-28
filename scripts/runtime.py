"""Locate installed runtimes without hard-coded user or Homebrew paths."""
import os
from pathlib import Path
import re
import shutil
import subprocess

ROOT = Path(__file__).resolve().parent.parent


def java21_home():
    candidates = []
    if os.environ.get('JAVA_HOME'):
        candidates.append(Path(os.environ['JAVA_HOME']))
    if shutil.which('brew'):
        p = subprocess.run(['brew', '--prefix', 'openjdk@21'], capture_output=True, text=True)
        if p.returncode == 0:
            candidates.append(Path(p.stdout.strip()) / 'libexec/openjdk.jdk/Contents/Home')
    if shutil.which('java'):
        p = subprocess.run(['java', '-XshowSettings:properties', '-version'], capture_output=True, text=True)
        m = re.search(r'java.home\s*=\s*(.+)', p.stderr)
        if m:
            candidates.append(Path(m.group(1).strip()))
    for home in candidates:
        java = home / 'bin/java'
        if java.is_file():
            p = subprocess.run([str(java), '-version'], capture_output=True, text=True)
            if re.search(r'version "21[.\"]', p.stderr + p.stdout):
                return home
    raise SystemExit('Install Java 21 and set JAVA_HOME to its installation directory.')


def reference_java_home():
    override = os.environ.get('JAVA8_REFERENCE_HOME')
    candidates = [Path(override)] if override else list((ROOT / 'tools/analysis-jdk8').glob('*/Contents/Home'))
    for home in candidates:
        if (home / 'jre/lib/rt.jar').is_file():
            return home
    raise SystemExit('Run scripts/setup-sonarqube.py or set JAVA8_REFERENCE_HOME to a JDK 8 installation.')


if __name__ == '__main__':
    print(java21_home())
