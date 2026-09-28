package m;

import D.C0053w;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import m2.EnumC0863e;
import m2.InterfaceC0862d;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0862d f8587a = B2.a.x(EnumC0863e.f8644i, q0.f8563i);

    public static final j0 a(p0 p0Var, x0 x0Var, String str, C0285q c0285q, int i2, int i3) {
        i0 i0Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z3 = true;
        boolean z4 = (i4 > 4 && c0285q.g(p0Var)) || (i2 & 6) == 4;
        Object K3 = c0285q.K();
        Object obj = C0275l.f4150a;
        if (z4 || K3 == obj) {
            K3 = new j0(p0Var, x0Var, str);
            c0285q.e0(K3);
        }
        j0 j0Var = (j0) K3;
        if ((i4 <= 4 || !c0285q.g(p0Var)) && (i2 & 6) != 4) {
            z3 = false;
        }
        boolean i5 = c0285q.i(j0Var) | z3;
        Object K4 = c0285q.K();
        if (i5 || K4 == obj) {
            K4 = new C0053w(p0Var, 22, j0Var);
            c0285q.e0(K4);
        }
        C0257c.d(j0Var, (y2.c) K4, c0285q);
        if (p0Var.g() && (i0Var = (i0) j0Var.f8504b.getValue()) != null) {
            y2.c cVar = i0Var.f8500j;
            p0 p0Var2 = j0Var.f8505c;
            i0Var.f8498h.g(cVar.l(p0Var2.f().b()), i0Var.f8500j.l(p0Var2.f().c()), (InterfaceC0817A) i0Var.f8499i.l(p0Var2.f()));
        }
        return j0Var;
    }

    public static final m0 b(p0 p0Var, Object obj, Object obj2, InterfaceC0817A interfaceC0817A, x0 x0Var, C0285q c0285q, int i2) {
        boolean g3 = c0285q.g(p0Var);
        Object K3 = c0285q.K();
        Object obj3 = C0275l.f4150a;
        if (g3 || K3 == obj3) {
            AbstractC0845s abstractC0845s = (AbstractC0845s) x0Var.f8600a.l(obj2);
            abstractC0845s.d();
            K3 = new m0(p0Var, obj, abstractC0845s, x0Var);
            c0285q.e0(K3);
        }
        m0 m0Var = (m0) K3;
        if (p0Var.g()) {
            m0Var.g(obj, obj2, interfaceC0817A);
        } else {
            m0Var.h(obj2, interfaceC0817A);
        }
        boolean g4 = c0285q.g(p0Var) | c0285q.g(m0Var);
        Object K4 = c0285q.K();
        if (g4 || K4 == obj3) {
            K4 = new C0053w(p0Var, 23, m0Var);
            c0285q.e0(K4);
        }
        C0257c.d(m0Var, (y2.c) K4, c0285q);
        return m0Var;
    }

    public static final p0 c(W w2, C0285q c0285q) {
        boolean g3 = c0285q.g(w2);
        Object K3 = c0285q.K();
        Object obj = C0275l.f4150a;
        if (g3 || K3 == obj) {
            K3 = new p0(w2, null, "entry");
            c0285q.e0(K3);
        }
        p0 p0Var = (p0) K3;
        if (w2 instanceof W) {
            c0285q.U(1030282692);
            Object value = w2.f8373j.getValue();
            Object value2 = w2.f8372i.getValue();
            boolean g4 = c0285q.g(w2);
            Object K4 = c0285q.K();
            if (g4 || K4 == obj) {
                K4 = new s0(w2, null);
                c0285q.e0(K4);
            }
            C0257c.f(value, value2, (y2.e) K4, c0285q);
            c0285q.r(false);
        } else {
            c0285q.U(1030744251);
            p0Var.a(w2.f8372i.getValue(), c0285q, 0);
            c0285q.r(false);
        }
        boolean g5 = c0285q.g(p0Var);
        Object K5 = c0285q.K();
        if (g5 || K5 == obj) {
            K5 = new u0(p0Var, 0);
            c0285q.e0(K5);
        }
        C0257c.d(p0Var, (y2.c) K5, c0285q);
        return p0Var;
    }

    public static final p0 d(Object obj, String str, C0285q c0285q, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object K3 = c0285q.K();
        J.W w2 = C0275l.f4150a;
        if (K3 == w2) {
            K3 = new p0(new G(obj), null, str);
            c0285q.e0(K3);
        }
        p0 p0Var = (p0) K3;
        p0Var.a(obj, c0285q, (i2 & 8) | 48 | (i2 & 14));
        Object K4 = c0285q.K();
        if (K4 == w2) {
            K4 = new u0(p0Var, 1);
            c0285q.e0(K4);
        }
        C0257c.d(p0Var, (y2.c) K4, c0285q);
        return p0Var;
    }
}
