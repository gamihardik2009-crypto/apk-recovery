package l;

import J.C0275l;
import J.C0285q;
import J.W0;
import c0.C0603v;
import d0.AbstractC0632c;
import m.AbstractC0835h;
import m.InterfaceC0817A;
import m.x0;
import m.y0;

/* loaded from: classes.dex */
public abstract class M {
    public static final W0 a(long j3, InterfaceC0817A interfaceC0817A, C0285q c0285q, int i2) {
        boolean g3 = c0285q.g(C0603v.f(j3));
        Object K3 = c0285q.K();
        if (g3 || K3 == C0275l.f4150a) {
            AbstractC0632c f3 = C0603v.f(j3);
            C0794c c0794c = C0794c.f8182p;
            A0.n nVar = new A0.n(26, f3);
            x0 x0Var = y0.f8602a;
            x0 x0Var2 = new x0(c0794c, nVar);
            c0285q.e0(x0Var2);
            K3 = x0Var2;
        }
        return AbstractC0835h.b(new C0603v(j3), (x0) K3, interfaceC0817A, null, "ColorAnimation", null, c0285q, (i2 << 3) & 896, 8);
    }
}
