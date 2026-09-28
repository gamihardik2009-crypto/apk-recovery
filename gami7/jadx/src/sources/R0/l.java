package R0;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.a f5417b;

    public /* synthetic */ l(y2.a aVar, int i2) {
        this.f5416a = i2;
        this.f5417b = aVar;
    }

    public final void onBackInvoked() {
        switch (this.f5416a) {
            case 0:
                y2.a aVar = this.f5417b;
                if (aVar != null) {
                    aVar.c();
                    break;
                }
                break;
            default:
                y2.a aVar2 = this.f5417b;
                z2.h.f(aVar2, "$onBackInvoked");
                aVar2.c();
                break;
        }
    }
}
