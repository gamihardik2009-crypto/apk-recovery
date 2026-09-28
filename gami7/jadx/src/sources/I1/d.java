package I1;

import J2.B;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3940b;

    public /* synthetic */ d(int i2, Object obj) {
        this.f3939a = i2;
        this.f3940b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        switch (this.f3939a) {
            case 0:
                z2.h.f(context, "context");
                z2.h.f(intent, "intent");
                ((a) this.f3940b).f(intent);
                break;
            default:
                if (intent != null && (stringExtra = intent.getStringExtra("scheduleId")) != null) {
                    int intExtra = intent.getIntExtra("partIndex", 0);
                    int resultCode = getResultCode();
                    U1.d dVar = (U1.d) this.f3940b;
                    if (resultCode == -1) {
                        if (intExtra == 0) {
                            B.r(dVar.f5790d, null, 0, new U1.c(dVar, stringExtra, null), 3);
                            break;
                        }
                    } else {
                        B.r(dVar.f5790d, null, 0, new U1.b(dVar, stringExtra, null), 3);
                        break;
                    }
                }
                break;
        }
    }
}
