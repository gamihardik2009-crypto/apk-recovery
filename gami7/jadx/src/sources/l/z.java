package l;

import J.Y;
import a.AbstractC0423a;
import c0.C0580U;
import java.util.Map;
import m.AbstractC0831e;
import m.E0;
import m.InterfaceC0817A;
import m.Z;
import m.w0;
import m.x0;
import m.y0;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f8260a;

    /* renamed from: b, reason: collision with root package name */
    public static final Z f8261b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z f8262c;

    /* renamed from: d, reason: collision with root package name */
    public static final Z f8263d;

    static {
        C0794c c0794c = C0794c.q;
        C0794c c0794c2 = C0794c.f8183r;
        x0 x0Var = y0.f8602a;
        f8260a = new x0(c0794c, c0794c2);
        f8261b = AbstractC0831e.m(400.0f, null, 5);
        Map map = E0.f8301a;
        f8262c = AbstractC0831e.m(400.0f, new O0.h(AbstractC0423a.m(1, 1)), 1);
        f8263d = AbstractC0831e.m(400.0f, new O0.j(l0.c.e(1, 1)), 1);
    }

    public static C0790E a(w0 w0Var, V.e eVar, int i2) {
        InterfaceC0817A interfaceC0817A = w0Var;
        if ((i2 & 1) != 0) {
            Map map = E0.f8301a;
            interfaceC0817A = AbstractC0831e.m(400.0f, new O0.j(l0.c.e(1, 1)), 1);
        }
        int i3 = i2 & 2;
        V.e eVar2 = V.b.f5844v;
        if (i3 != 0) {
            eVar = eVar2;
        }
        return b(z2.h.a(eVar, V.b.f5842t) ? V.b.f5834k : z2.h.a(eVar, eVar2) ? V.b.f5836m : V.b.f5835l, interfaceC0817A, new Y(3, C0794c.f8185t), true);
    }

    public static final C0790E b(V.c cVar, InterfaceC0817A interfaceC0817A, y2.c cVar2, boolean z3) {
        return new C0790E(new V(null, null, new C0810t(cVar, interfaceC0817A, cVar2, z3), null, false, null, 59));
    }

    public static C0790E c(w0 w0Var, float f3, int i2) {
        InterfaceC0817A interfaceC0817A = w0Var;
        if ((i2 & 1) != 0) {
            interfaceC0817A = AbstractC0831e.m(400.0f, null, 5);
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new C0790E(new V(new G(f3, interfaceC0817A), null, null, null, false, null, 62));
    }

    public static C0791F d(w0 w0Var, int i2) {
        InterfaceC0817A interfaceC0817A = w0Var;
        if ((i2 & 1) != 0) {
            interfaceC0817A = AbstractC0831e.m(400.0f, null, 5);
        }
        return new C0791F(new V(new G(0.0f, interfaceC0817A), null, null, null, false, null, 62));
    }

    public static C0790E e(w0 w0Var) {
        return new C0790E(new V(null, null, null, new L(0.92f, C0580U.f7240b, w0Var), false, null, 55));
    }

    public static C0791F f(w0 w0Var, V.e eVar, int i2) {
        InterfaceC0817A interfaceC0817A = w0Var;
        if ((i2 & 1) != 0) {
            Map map = E0.f8301a;
            interfaceC0817A = AbstractC0831e.m(400.0f, new O0.j(l0.c.e(1, 1)), 1);
        }
        int i3 = i2 & 2;
        V.e eVar2 = V.b.f5844v;
        if (i3 != 0) {
            eVar = eVar2;
        }
        return g(z2.h.a(eVar, V.b.f5842t) ? V.b.f5834k : z2.h.a(eVar, eVar2) ? V.b.f5836m : V.b.f5835l, interfaceC0817A, new Y(5, C0794c.f8188w), true);
    }

    public static final C0791F g(V.c cVar, InterfaceC0817A interfaceC0817A, y2.c cVar2, boolean z3) {
        return new C0791F(new V(null, null, new C0810t(cVar, interfaceC0817A, cVar2, z3), null, false, null, 59));
    }

    public static final C0790E h(InterfaceC0817A interfaceC0817A, y2.c cVar) {
        return new C0790E(new V(null, new T(interfaceC0817A, new Y(7, cVar)), null, null, false, null, 61));
    }

    public static C0791F i(y2.c cVar) {
        Map map = E0.f8301a;
        return new C0791F(new V(null, new T(AbstractC0831e.m(400.0f, new O0.h(AbstractC0423a.m(1, 1)), 1), new Y(8, cVar)), null, null, false, null, 61));
    }
}
