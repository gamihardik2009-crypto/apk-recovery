#!/usr/bin/env bash
# Quick edit -> verify loop for the recovered project.
#   ./dev.sh compile   # type-check the Kotlin + Room queries (fastest)
#   ./dev.sh apk       # build the full debug APK
#   ./dev.sh clean     # wipe build output
#   ./dev.sh doctor    # check the Android SDK / java / toolchain
set -euo pipefail
unset ANDROID_PREFS_ROOT
cd "$(dirname "$0")"

case "${1:-help}" in
  compile) ./gradlew compileDebugKotlin --no-daemon ;;
  test)    ./gradlew testDebugUnitTest --no-daemon ;;
  apk)     ./gradlew assembleDebug --no-daemon ;;
  clean)   ./gradlew clean --no-daemon ;;
  doctor)
    echo "java: $(java -version 2>&1 | head -1)"
    sdk=$(grep '^sdk.dir=' local.properties 2>/dev/null | cut -d= -f2)
    echo "android sdk.dir: ${sdk:-<not set in local.properties>}"
    [ -d "$sdk" ] && echo "  -> SDK dir present: $sdk" || echo "  -> SDK dir MISSING"
    ;;
  help|*) cat <<'EOF'
usage: ./dev.sh <compile|test|apk|clean|doctor>
  compile - type-check + Room/KSP fast
  test    - run the JVM unit tests (planner timing rules)
  apk     - full debug APK build
  clean   - remove build output
  doctor  - print toolchain status
EOF
    ;;
esac