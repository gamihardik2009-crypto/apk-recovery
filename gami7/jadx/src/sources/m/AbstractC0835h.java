package m;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.W0;
import java.util.Map;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0835h {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f8488a = AbstractC0831e.m(0.0f, null, 7);

    static {
        Map map = E0.f8301a;
        new O0.e(0.1f);
        B1.C.i(0.5f, 0.5f);
        K1.f.e(0.5f, 0.5f);
    }

    public static final W0 a(float f3, w0 w0Var, C0285q c0285q, int i2) {
        return b(new O0.e(f3), y0.f8604c, w0Var, null, "DpAnimation", null, c0285q, (i2 << 3) & 896, 8);
    }

    public static final W0 b(Object obj, x0 x0Var, InterfaceC0840m interfaceC0840m, Float f3, String str, y2.c cVar, C0285q c0285q, int i2, int i3) {
        Object obj2 = C0275l.f4150a;
        if ((i3 & 8) != 0) {
            f3 = null;
        }
        Object K3 = c0285q.K();
        if (K3 == obj2) {
            K3 = C0257c.N(null, J.W.f4109m);
            c0285q.e0(K3);
        }
        InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
        Object K4 = c0285q.K();
        if (K4 == obj2) {
            K4 = new C0829d(obj, x0Var, f3);
            c0285q.e0(K4);
        }
        C0829d c0829d = (C0829d) K4;
        InterfaceC0258c0 R3 = C0257c.R(cVar, c0285q);
        if (f3 != null && (interfaceC0840m instanceof Z)) {
            Z z3 = (Z) interfaceC0840m;
            if (!z2.h.a(z3.f8397c, f3)) {
                interfaceC0840m = new Z(z3.f8395a, z3.f8396b, f3);
            }
        }
        InterfaceC0258c0 R4 = C0257c.R(interfaceC0840m, c0285q);
        Object K5 = c0285q.K();
        if (K5 == obj2) {
            K5 = B2.a.c(-1, 0, 6);
            c0285q.e0(K5);
        }
        L2.k kVar = (L2.k) K5;
        boolean i4 = ((((i2 & 14) ^ 6) > 4 && c0285q.i(obj)) || (6 & i2) == 4) | c0285q.i(kVar);
        Object K6 = c0285q.K();
        if (i4 || K6 == obj2) {
            K6 = new D.c0(kVar, 8, obj);
            c0285q.e0(K6);
        }
        C0257c.g((y2.a) K6, c0285q);
        boolean i5 = c0285q.i(kVar) | c0285q.i(c0829d) | c0285q.g(R4) | c0285q.g(R3);
        Object K7 = c0285q.K();
        if (i5 || K7 == obj2) {
            K7 = new C0834g(kVar, c0829d, R4, R3, null);
            c0285q.e0(K7);
        }
        C0257c.e(c0285q, kVar, (y2.e) K7);
        W0 w02 = (W0) interfaceC0258c0.getValue();
        return w02 == null ? c0829d.f8424c : w02;
    }
}
