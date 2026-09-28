package s;

import J.C0257c;
import J.C0274k0;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1131t;
import s0.C1194h;
import s0.InterfaceC1189c;
import s0.InterfaceC1192f;
import s0.InterfaceC1193g;

/* renamed from: s.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150C implements InterfaceC1131t, InterfaceC1189c, InterfaceC1192f {

    /* renamed from: b, reason: collision with root package name */
    public final Y f10043b;

    /* renamed from: c, reason: collision with root package name */
    public final C0274k0 f10044c;

    /* renamed from: d, reason: collision with root package name */
    public final C0274k0 f10045d;

    public C1150C(Y y3) {
        this.f10043b = y3;
        J.W w2 = J.W.f4109m;
        this.f10044c = C0257c.N(y3, w2);
        this.f10045d = C0257c.N(y3, w2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1150C) {
            return z2.h.a(((C1150C) obj).f10043b, this.f10043b);
        }
        return false;
    }

    @Override // r0.InterfaceC1131t
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        C0274k0 c0274k0 = this.f10044c;
        int a3 = ((Y) c0274k0.getValue()).a(interfaceC1096J, interfaceC1096J.getLayoutDirection());
        int b3 = ((Y) c0274k0.getValue()).b(interfaceC1096J);
        int c3 = ((Y) c0274k0.getValue()).c(interfaceC1096J, interfaceC1096J.getLayoutDirection()) + a3;
        int d3 = ((Y) c0274k0.getValue()).d(interfaceC1096J) + b3;
        AbstractC1103Q a4 = interfaceC1093G.a(B1.C.d0(-c3, -d3, j3));
        return interfaceC1096J.C(B1.C.K(j3, a4.f9834h + c3), B1.C.J(j3, a4.f9835i + d3), C0971w.f9166h, new A.c(a4, a3, b3, 3));
    }

    @Override // s0.InterfaceC1192f
    public final C1194h getKey() {
        return b0.f10122a;
    }

    @Override // s0.InterfaceC1192f
    public final Object getValue() {
        return (Y) this.f10045d.getValue();
    }

    public final int hashCode() {
        return this.f10043b.hashCode();
    }

    @Override // s0.InterfaceC1189c
    public final void i(InterfaceC1193g interfaceC1193g) {
        Y y3 = (Y) interfaceC1193g.i(b0.f10122a);
        Y y4 = this.f10043b;
        this.f10044c.setValue(new C1184x(y4, y3));
        this.f10045d.setValue(new V(y3, y4));
    }
}
