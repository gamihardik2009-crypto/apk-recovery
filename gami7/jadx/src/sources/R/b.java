package R;

import J.C0275l;
import J.C0285q;
import J.C0291t0;
import m2.InterfaceC0861c;
import z2.h;
import z2.i;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5372a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final f f5373b = new f(0, new long[0], new Object[0]);

    public static final int a(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final a b(C0285q c0285q, int i2, i iVar) {
        a aVar;
        c0285q.Q(Integer.rotateLeft(i2, 1), 0, f5372a, null);
        Object K3 = c0285q.K();
        if (K3 == C0275l.f4150a) {
            aVar = new a(i2, iVar, true);
            c0285q.e0(aVar);
        } else {
            h.d(K3, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            aVar = (a) K3;
            aVar.k(iVar);
        }
        c0285q.r(false);
        return aVar;
    }

    public static final a c(int i2, InterfaceC0861c interfaceC0861c, C0285q c0285q) {
        Object K3 = c0285q.K();
        if (K3 == C0275l.f4150a) {
            K3 = new a(i2, interfaceC0861c, true);
            c0285q.e0(K3);
        }
        a aVar = (a) K3;
        aVar.k(interfaceC0861c);
        return aVar;
    }

    public static final boolean d(C0291t0 c0291t0, C0291t0 c0291t02) {
        return c0291t0 == null || ((c0291t0 instanceof C0291t0) && (!c0291t0.b() || h.a(c0291t0, c0291t02) || h.a(c0291t0.f4234c, c0291t02.f4234c)));
    }
}
