package L1;

import B1.C0011a;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public static final String f4642l = B1.s.f("ForceStopRunnable");

    /* renamed from: m, reason: collision with root package name */
    public static final long f4643m = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: h, reason: collision with root package name */
    public final Context f4644h;

    /* renamed from: i, reason: collision with root package name */
    public final C1.w f4645i;

    /* renamed from: j, reason: collision with root package name */
    public final i f4646j;

    /* renamed from: k, reason: collision with root package name */
    public int f4647k = 0;

    public f(Context context, C1.w wVar) {
        this.f4644h = context.getApplicationContext();
        this.f4645i = wVar;
        this.f4646j = wVar.f694l;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
        long currentTimeMillis = System.currentTimeMillis() + f4643m;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.f.a():void");
    }

    public final boolean b() {
        C0011a c0011a = this.f4645i.f689g;
        c0011a.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f4642l;
        if (isEmpty) {
            B1.s.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a3 = n.a(this.f4644h, c0011a);
        B1.s.d().a(str, "Is default app process = " + a3);
        return a3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f4644h;
        String str = f4642l;
        C1.w wVar = this.f4645i;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    C1.y.G(context);
                    B1.s.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e3) {
                        int i2 = this.f4647k + 1;
                        this.f4647k = i2;
                        if (i2 >= 3) {
                            String str2 = Y0.h.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            B1.s.d().c(str, str2, e3);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e3);
                            wVar.f689g.getClass();
                            throw illegalStateException;
                        }
                        long j3 = i2 * 300;
                        String str3 = "Retrying after " + j3;
                        if (B1.s.d().f307a <= 3) {
                            Log.d(str, str3, e3);
                        }
                        try {
                            Thread.sleep(this.f4647k * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e4) {
                    B1.s.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e4);
                    wVar.f689g.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            wVar.p0();
        }
    }
}
