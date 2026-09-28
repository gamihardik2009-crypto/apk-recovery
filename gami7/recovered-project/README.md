# BulkSmsScheduler – recovered Kotlin/Android project

Recovered from `gami7.apk` (a bulk-SMS scheduler app). This is a normal,
editable **Kotlin + Gradle + Android Compose** project.

## Quick start

```bash
./dev.sh doctor      # toolchain ok?
./dev.sh compile     # type-check Kotlin + Room queries (fast, ~10-20s)
./dev.sh test        # run the JVM unit tests (planner timing rules)
./dev.sh apk         # produce the full debug APK
```

- APK output: `app/build/outputs/apk/debug/app-debug.apk`
- Open the folder in **VS Code** (`code .`) or **Android Studio** to edit.

## Where the code lives

Everything app-specific is under:

```
app/src/main/java/com/example/bulksmsscheduler/
├── MainActivity.kt        # entry activity (arms the periodic SmsWorker, shows UI)
├── SmsApplication.kt      # app root: wires DB -> repository -> engine; SMS_SENT receiver
├── ui/                    # recovered home screen + recovered UI strings
├── model/                 # Room entities: Client, MessageTemplate, Schedule, AppSettings
├── data/                  # AppDatabase + Room DAOs (queries) + enum converters
├── repository/            # SmsRepository: the single access point used by screens
├── engine/                # SmsSender (sends via SmsManager), SmsSentReceiver
└── utils/                 # SmsWorker (background sender), SchedulePlanner, SmsWorkerSchedule
```

## Edit-to-verify loop

1. Edit any `.kt` file (or `app/src/main/res/**/*.xml` resources).
2. Run `./dev.sh compile` — it reports errors/warnings fast.
3. When it's green, `./dev.sh apk` to package.

## Notes

- Release build is **deliberately NOT minified** (the original APK was R8-minified,
  which is why only 6 class names were readable). Keep it that way for debugging.
- Schema identity hash must match Room exactly if you install over the original app;
  otherwise bump `version` in `data/AppDatabase.kt` and add a migration.
- `local.properties` points at the machine SDK and is git-ignored.