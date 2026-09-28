package androidx.work.impl.diagnostics;

import B1.s;
import B1.v;
import C1.p;
import C1.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6958a = s.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        s d3 = s.d();
        String str = f6958a;
        d3.a(str, "Requesting diagnostics");
        try {
            w o02 = w.o0(context);
            List singletonList = Collections.singletonList((B1.w) new v(DiagnosticsWorker.class, 0).a());
            if (singletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new p(o02, null, 2, singletonList).I();
        } catch (IllegalStateException e3) {
            s.d().c(str, "WorkManager is not initialized", e3);
        }
    }
}
