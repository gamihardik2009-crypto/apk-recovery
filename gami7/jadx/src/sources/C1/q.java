package C1;

import android.content.Context;
import n2.AbstractC0961m;
import p1.C1058a;
import v1.C1369a;
import v1.InterfaceC1370b;
import w1.C1385g;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC1370b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f677h;

    public /* synthetic */ q(Object obj) {
        this.f677h = obj;
    }

    @Override // v1.InterfaceC1370b
    public v1.c a(C1369a c1369a) {
        Context context = (Context) this.f677h;
        z2.h.f(context, "$context");
        C1058a c1058a = c1369a.f11402c;
        z2.h.f(c1058a, "callback");
        String str = c1369a.f11401b;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
        }
        return new C1385g(context, str, c1058a, true, true);
    }

    public void b() {
        y2.e eVar = (y2.e) this.f677h;
        synchronized (T.n.f5710b) {
            T.n.f5715g = AbstractC0961m.P(T.n.f5715g, eVar);
        }
    }
}
