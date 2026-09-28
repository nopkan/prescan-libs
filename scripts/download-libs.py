#!/usr/bin/env python3
"""Fetch only the five requested binaries; verify Central SHA-1 and record SHA-256."""
import hashlib
import json
from datetime import datetime, timezone
from pathlib import Path
from urllib.request import urlopen
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parent.parent
ARTIFACTS = [
    ("org.apache.poi", "poi", "5.2.3"),
    ("org.apache.poi", "poi-ooxml", "5.2.3"),
    ("org.apache.poi", "poi-ooxml-lite", "5.2.3"),
    ("org.apache.xmlbeans", "xmlbeans", "5.1.1"),
    ("com.github.virtuald", "curvesapi", "1.07"),
]


def fetch(url):
    with urlopen(url, timeout=120) as response:
        return response.read()


def main():
    pinned = {line.split()[1]: line.split()[0] for line in
              (ROOT / 'metadata/SHA256SUMS').read_text().splitlines() if line.strip()}
    (ROOT / "libs").mkdir(exist_ok=True)
    (ROOT / "metadata" / "poms").mkdir(parents=True, exist_ok=True)
    records = []
    for group, artifact, version in ARTIFACTS:
        name = f"{artifact}-{version}"
        base = f"https://repo.maven.apache.org/maven2/{group.replace('.', '/')}/{artifact}/{version}/{name}"
        target = ROOT / "libs" / f"{name}.jar"
        content = target.read_bytes() if target.exists() else fetch(base + ".jar")
        expected = fetch(base + ".jar.sha1").decode().strip().split()[0].lower()
        if hashlib.sha1(content).hexdigest() != expected:
            raise RuntimeError(f"Maven Central checksum mismatch: {target.name}")
        if hashlib.sha256(content).hexdigest() != pinned[f'libs/{name}.jar']:
            raise RuntimeError(f"Pinned SHA-256 mismatch: {target.name}")
        if not target.exists():
            target.write_bytes(content)
        with ZipFile(target) as jar:
            bad = jar.testzip()
            if bad:
                raise RuntimeError(f"Corrupt JAR entry: {bad}")
        pom = fetch(base + ".pom")
        (ROOT / "metadata" / "poms" / f"{name}.pom").write_bytes(pom)
        records.append({
            "file": f"libs/{name}.jar", "coordinates": f"{group}:{artifact}:{version}",
            "url": base + ".jar", "bytes": len(content),
            "central_sha1": expected, "sha256": hashlib.sha256(content).hexdigest(),
            "verified_at_utc": datetime.now(timezone.utc).isoformat(),
        })
        print(f"Verified {target.name} ({len(content):,} bytes)")
    (ROOT / "metadata" / "libraries.json").write_text(json.dumps(records, indent=2) + "\n")
    (ROOT / "metadata" / "SHA256SUMS").write_text(
        "".join(f"{record['sha256']}  {record['file']}\n" for record in records)
    )


if __name__ == "__main__":
    main()
