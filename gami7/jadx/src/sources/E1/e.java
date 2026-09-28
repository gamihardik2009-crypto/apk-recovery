package E1;

import B1.s;
import B1.u;
import C1.o;
import L1.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1033h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1034i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1035j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1036k;

    public e(C1.i iVar, o oVar, u uVar) {
        z2.h.f(iVar, "processor");
        this.f1034i = iVar;
        this.f1035j = oVar;
        this.f1036k = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1033h) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f1036k;
                Context context = (Context) this.f1035j;
                Intent intent = (Intent) this.f1034i;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    s.d().a(ConstraintProxyUpdateReceiver.f6948a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    m.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    m.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    m.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    m.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            default:
                ((C1.i) this.f1034i).h((o) this.f1035j, (u) this.f1036k);
                return;
        }
    }

    public e(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.f1034i = intent;
        this.f1035j = context;
        this.f1036k = pendingResult;
    }
}
