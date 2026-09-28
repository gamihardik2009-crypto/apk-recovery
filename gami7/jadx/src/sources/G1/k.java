package G1;

import B1.s;
import J2.B;
import J2.T;
import J2.c0;
import K1.o;
import n2.AbstractC0948C;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1246a;

    static {
        String f3 = s.f("WorkConstraintsTracker");
        z2.h.e(f3, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f1246a = f3;
    }

    public static final c0 a(i iVar, o oVar, T t3, e eVar) {
        z2.h.f(iVar, "<this>");
        z2.h.f(t3, "dispatcher");
        z2.h.f(eVar, "listener");
        c0 b3 = B.b();
        B.r(B.a(AbstractC0948C.n(t3, b3)), null, 0, new j(iVar, oVar, eVar, null), 3);
        return b3;
    }
}
