# Keep all classes in the app package so R8 does not strip components or model reflection.
-keep class com.example.bulksmsscheduler.** { *; }

# Room entities are accessed by generated code; keep the recovered model package.
-keep class com.example.bulksmsscheduler.model.** { *; }

# WorkManager instantiates the Worker reflectively.
-keep class com.example.bulksmsscheduler.utils.SmsWorker { *; }
-keep class * extends androidx.work.ListenableWorker {
    public <init>(android.content.Context, androidx.work.WorkerParameters);
}

# Note: the ORIGINAL release APK was minified WITH -repackageclasses (R8 horizontal
# class merging), which destroyed all original class names.  Do NOT re-enable
# repackaging if you ever want to recover this app again from a future APK.
