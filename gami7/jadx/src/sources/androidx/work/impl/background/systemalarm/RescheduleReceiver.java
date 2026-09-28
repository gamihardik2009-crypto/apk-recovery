package androidx.work.impl.background.systemalarm;

import B1.s;
import C1.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6949a = s.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        s.d().a(f6949a, "Received intent " + intent);
        try {
            w o02 = w.o0(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (w.f687r) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = o02.f696n;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    o02.f696n = goAsync;
                    if (o02.f695m) {
                        goAsync.finish();
                        o02.f696n = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e3) {
            s.d().c(f6949a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e3);
        }
    }
}
