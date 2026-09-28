package L1;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4664a;

    static {
        String f3 = B1.s.f("WakeLocks");
        z2.h.e(f3, "tagWithPrefix(\"WakeLocks\")");
        f4664a = f3;
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        z2.h.f(context, "context");
        z2.h.f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        z2.h.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (s.f4665a) {
        }
        z2.h.e(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
