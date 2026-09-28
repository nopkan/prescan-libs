#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
case "${1:-}" in
  start|stop|status|console|restart) ;;
  *) echo 'Usage: ./scripts/sonarqube.sh {start|stop|status|console|restart}'; exit 2 ;;
esac
JAVA_HOME="$(python3 "$ROOT/scripts/runtime.py")"
export JAVA_HOME
export SONAR_JAVA_PATH="$JAVA_HOME/bin/java"
export PATH="$JAVA_HOME/bin:$PATH"
case "$(uname -s)-$(uname -m)" in
  Darwin-*) PLATFORM=macosx-universal-64 ;;
  Linux-x86_64) PLATFORM=linux-x86-64 ;;
  *) echo 'This launcher supports macOS and Linux x86_64 (including x86_64 WSL2).' >&2; exit 1 ;;
esac
LAUNCHER="$ROOT/tools/sonarqube-26.9.0.129388/bin/$PLATFORM/sonar.sh"
[[ -f "$LAUNCHER" ]] || { echo 'Run python3 scripts/setup-sonarqube.py first.' >&2; exit 1; }
exec "$LAUNCHER" "$@"
