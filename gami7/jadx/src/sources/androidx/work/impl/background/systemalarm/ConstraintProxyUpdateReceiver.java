package androidx.work.impl.background.systemalarm;

import B1.s;
import C1.w;
import E1.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6948a = s.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            w.o0(context).f691i.a(new e(intent, context, goAsync()));
        } else {
            s.d().a(f6948a, "Ignoring unknown action " + action);
        }
    }
}
