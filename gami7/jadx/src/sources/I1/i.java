package I1;

import B1.s;
import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f3949f;

    /* renamed from: g, reason: collision with root package name */
    public final h f3950g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, N1.b bVar) {
        super(context, bVar);
        z2.h.f(bVar, "taskExecutor");
        Object systemService = this.f3943b.getSystemService("connectivity");
        z2.h.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f3949f = (ConnectivityManager) systemService;
        this.f3950g = new h(this);
    }

    @Override // I1.f
    public final Object a() {
        return j.a(this.f3949f);
    }

    @Override // I1.f
    public final void c() {
        try {
            s.d().a(j.f3951a, "Registering network callback");
            L1.l.a(this.f3949f, this.f3950g);
        } catch (IllegalArgumentException e3) {
            s.d().c(j.f3951a, "Received exception while registering network callback", e3);
        } catch (SecurityException e4) {
            s.d().c(j.f3951a, "Received exception while registering network callback", e4);
        }
    }

    @Override // I1.f
    public final void d() {
        try {
            s.d().a(j.f3951a, "Unregistering network callback");
            L1.j.c(this.f3949f, this.f3950g);
        } catch (IllegalArgumentException e3) {
            s.d().c(j.f3951a, "Received exception while unregistering network callback", e3);
        } catch (SecurityException e4) {
            s.d().c(j.f3951a, "Received exception while unregistering network callback", e4);
        }
    }
}
