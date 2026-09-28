package t0;

import c0.AbstractC0571K;
import c0.C0589h;
import c0.C0603v;
import c0.InterfaceC0600s;
import f0.C0663b;
import r0.AbstractC1103Q;
import r0.C1116e;
import r0.C1125n;
import r0.InterfaceC1095I;
import u0.C1314v;

/* renamed from: t0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267z extends Z {

    /* renamed from: V, reason: collision with root package name */
    public static final C0589h f10638V;

    /* renamed from: S, reason: collision with root package name */
    public InterfaceC1264w f10639S;

    /* renamed from: T, reason: collision with root package name */
    public O f10640T;

    /* renamed from: U, reason: collision with root package name */
    public C1116e f10641U;

    static {
        C0589h g3 = AbstractC0571K.g();
        int i2 = C0603v.f7278h;
        g3.e(C0603v.f7275e);
        g3.k(1.0f);
        g3.l(1);
        f10638V = g3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1267z(C1236E c1236e, InterfaceC1264w interfaceC1264w) {
        super(c1236e);
        this.f10639S = interfaceC1264w;
        this.f10640T = c1236e.f10389j != null ? new C1266y(this) : null;
        if ((((V.n) interfaceC1264w).f5858h.f5860j & 512) == 0) {
            this.f10641U = null;
        } else {
            AbstractC1265x.e(interfaceC1264w);
            throw null;
        }
    }

    @Override // r0.InterfaceC1093G
    public final int L(int i2) {
        if (this.f10641U != null) {
            z2.h.c(this.f10548u);
            throw null;
        }
        InterfaceC1264w interfaceC1264w = this.f10639S;
        Z z3 = this.f10548u;
        z2.h.c(z3);
        return interfaceC1264w.h(this, z3, i2);
    }

    @Override // t0.Z
    public final void O0() {
        if (this.f10640T == null) {
            this.f10640T = new C1266y(this);
        }
    }

    @Override // t0.Z
    public final O R0() {
        return this.f10640T;
    }

    @Override // t0.Z
    public final V.n T0() {
        return ((V.n) this.f10639S).f5858h;
    }

    @Override // r0.InterfaceC1093G
    public final AbstractC1103Q a(long j3) {
        q0(j3);
        C1116e c1116e = this.f10641U;
        if (c1116e == null) {
            InterfaceC1264w interfaceC1264w = this.f10639S;
            Z z3 = this.f10548u;
            z2.h.c(z3);
            j1(interfaceC1264w.f(this, z3, j3));
            d1();
            return this;
        }
        O o3 = c1116e.f9867h.f10640T;
        z2.h.c(o3);
        InterfaceC1095I C02 = o3.C0();
        C02.f();
        C02.h();
        throw null;
    }

    @Override // r0.InterfaceC1093G
    public final int a0(int i2) {
        if (this.f10641U != null) {
            z2.h.c(this.f10548u);
            throw null;
        }
        InterfaceC1264w interfaceC1264w = this.f10639S;
        Z z3 = this.f10548u;
        z2.h.c(z3);
        return interfaceC1264w.d(this, z3, i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b(int i2) {
        if (this.f10641U != null) {
            z2.h.c(this.f10548u);
            throw null;
        }
        InterfaceC1264w interfaceC1264w = this.f10639S;
        Z z3 = this.f10548u;
        z2.h.c(z3);
        return interfaceC1264w.b(this, z3, i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b0(int i2) {
        if (this.f10641U != null) {
            z2.h.c(this.f10548u);
            throw null;
        }
        InterfaceC1264w interfaceC1264w = this.f10639S;
        Z z3 = this.f10548u;
        z2.h.c(z3);
        return interfaceC1264w.a(this, z3, i2);
    }

    @Override // t0.Z
    public final void f1(InterfaceC0600s interfaceC0600s, C0663b c0663b) {
        Z z3 = this.f10548u;
        z2.h.c(z3);
        z3.L0(interfaceC0600s, c0663b);
        if (((C1314v) AbstractC1239H.a(this.f10546s)).getShowLayoutBounds()) {
            M0(interfaceC0600s, f10638V);
        }
    }

    @Override // t0.Z
    public final void g1(long j3, float f3, C0663b c0663b) {
        if (this.f10547t) {
            O R02 = R0();
            z2.h.c(R02);
            h1(R02.f10491t, f3, null, c0663b);
        } else {
            h1(j3, f3, null, c0663b);
        }
        r1();
    }

    @Override // r0.AbstractC1103Q
    public final void l0(long j3, float f3, y2.c cVar) {
        if (this.f10547t) {
            O R02 = R0();
            z2.h.c(R02);
            h1(R02.f10491t, f3, cVar, null);
        } else {
            h1(j3, f3, cVar, null);
        }
        r1();
    }

    public final void r1() {
        if (this.f10486n) {
            return;
        }
        e1();
        if (this.f10641U != null) {
            z2.h.c(this.f10640T);
            throw null;
        }
        C0().j();
        Z z3 = this.f10548u;
        z2.h.c(z3);
        z3.f10547t = false;
    }

    @Override // t0.N
    public final int s0(C1125n c1125n) {
        O o3 = this.f10640T;
        if (o3 == null) {
            return AbstractC1248f.c(this, c1125n);
        }
        Integer num = (Integer) o3.f10495x.get(c1125n);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s1(InterfaceC1264w interfaceC1264w) {
        if (!z2.h.a(interfaceC1264w, this.f10639S)) {
            if ((((V.n) interfaceC1264w).f5858h.f5860j & 512) != 0) {
                B1.t.w(interfaceC1264w);
                C1116e c1116e = this.f10641U;
                if (c1116e != null) {
                    B1.t.w(interfaceC1264w);
                } else {
                    B1.t.w(interfaceC1264w);
                    c1116e = new C1116e(this);
                }
                this.f10641U = c1116e;
            } else {
                this.f10641U = null;
            }
        }
        this.f10639S = interfaceC1264w;
    }
}
