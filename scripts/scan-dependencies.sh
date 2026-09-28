#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
if [[ "${1:-}" == "--help" ]]; then
  printf '%s\n' 'Usage: ./scripts/scan-dependencies.sh [Dependency-Check CLI options]' \
    'Scans only libs/; saves dated HTML, JSON, logs, and the input manifest in reports/.' \
    'Updates vulnerability data by default. Initial download may take a long time.' \
    'Optional credentials: private/dependency-check.properties'
  exit 0
fi
command -v dependency-check >/dev/null || { echo 'Install dependency-check first.' >&2; exit 1; }
cd "$ROOT"
mkdir -p "$ROOT/reports/raw/dependency-check" "$ROOT/private"
shasum -a 256 -c metadata/SHA256SUMS
RUN_DIR="$(mktemp -d "$ROOT/reports/raw/dependency-check/$(date -u +%Y%m%dT%H%M%SZ)-XXXXXX")"
mkdir -p "$ROOT/data/dependency-check"
cp "$ROOT/metadata/libraries.json" "$RUN_DIR/input-libraries.json"
dependency-check --version > "$RUN_DIR/tool-version.txt" 2>&1
PROPERTIES="$ROOT/config/dependency-check.properties.example"
if [[ -f "$ROOT/private/dependency-check.properties" ]]; then
  PROPERTIES="$ROOT/private/dependency-check.properties"
fi
echo "Report directory: $RUN_DIR"
# The tool's exit status is preserved and saved. A successful exit is not bank approval.
set +e
dependency-check \
  --project 'POI library pre-scan — five requested JARs' \
  --scan "$ROOT/libs" \
  --data "$ROOT/data/dependency-check" \
  --out "$RUN_DIR" \
  --format HTML --format JSON --prettyPrint \
  --log "$RUN_DIR/dependency-check.log" \
  --propertyfile "$PROPERTIES" \
  "$@"
SCAN_EXIT=$?
printf '%s\n' "$SCAN_EXIT" > "$RUN_DIR/exit-code.txt"
date -u '+%Y-%m-%dT%H:%M:%SZ' > "$RUN_DIR/finished-at.txt"
if [[ -f "$RUN_DIR/dependency-check-report.json" ]]; then
  python3 "$ROOT/scripts/publish-dependency-report.py" "$RUN_DIR"
fi
exit "$SCAN_EXIT"
