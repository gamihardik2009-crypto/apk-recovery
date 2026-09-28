package t0;

import c0.AbstractC0598q;
import c0.C0588g;
import c0.C0594m;
import c0.InterfaceC0570J;
import c0.InterfaceC0600s;
import e0.AbstractC0655e;
import e0.C0652b;
import e0.InterfaceC0654d;
import f0.C0663b;
import u0.C1314v;

/* renamed from: t0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1238G implements InterfaceC0654d {

    /* renamed from: h, reason: collision with root package name */
    public final C0652b f10415h = new C0652b();

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1257o f10416i;

    @Override // e0.InterfaceC0654d
    public final void B(InterfaceC0570J interfaceC0570J, AbstractC0598q abstractC0598q, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f10415h.B(interfaceC0570J, abstractC0598q, f3, abstractC0655e, c0594m, i2);
    }

    @Override // O0.b
    public final long G(long j3) {
        return this.f10415h.G(j3);
    }

    @Override // O0.b
    public final long J(float f3) {
        return this.f10415h.J(f3);
    }

    @Override // O0.b
    public final long M(long j3) {
        return this.f10415h.M(j3);
    }

    @Override // O0.b
    public final float P(float f3) {
        return this.f10415h.c() * f3;
    }

    @Override // O0.b
    public final float Q(long j3) {
        return this.f10415h.Q(j3);
    }

    @Override // e0.InterfaceC0654d
    public final void X(InterfaceC0570J interfaceC0570J, long j3, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f10415h.X(interfaceC0570J, j3, f3, abstractC0655e, c0594m, i2);
    }

    @Override // e0.InterfaceC0654d
    public final void Z(C0588g c0588g, long j3, long j4, long j5, long j6, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2, int i3) {
        this.f10415h.Z(c0588g, j3, j4, j5, j6, f3, abstractC0655e, c0594m, i2, i3);
    }

    public final void a() {
        C0652b c0652b = this.f10415h;
        InterfaceC0600s e3 = c0652b.f7552i.e();
        InterfaceC1255m interfaceC1255m = this.f10416i;
        z2.h.c(interfaceC1255m);
        V.n nVar = (V.n) interfaceC1255m;
        V.n nVar2 = nVar.f5858h.f5863m;
        if (nVar2 != null && (nVar2.f5861k & 4) != 0) {
            while (nVar2 != null) {
                int i2 = nVar2.f5860j;
                if ((i2 & 2) != 0) {
                    break;
                } else if ((i2 & 4) != 0) {
                    break;
                } else {
                    nVar2 = nVar2.f5863m;
                }
            }
        }
        nVar2 = null;
        if (nVar2 == null) {
            Z t3 = AbstractC1248f.t(interfaceC1255m, 4);
            if (t3.T0() == nVar.f5858h) {
                t3 = t3.f10548u;
                z2.h.c(t3);
            }
            t3.f1(e3, (C0663b) c0652b.f7552i.f4559b);
            return;
        }
        L.d dVar = null;
        while (nVar2 != null) {
            if (nVar2 instanceof InterfaceC1257o) {
                InterfaceC1257o interfaceC1257o = (InterfaceC1257o) nVar2;
                C0663b c0663b = (C0663b) c0652b.f7552i.f4559b;
                Z t4 = AbstractC1248f.t(interfaceC1257o, 4);
                long U3 = l0.c.U(t4.f9836j);
                C1236E c1236e = t4.f10546s;
                c1236e.getClass();
                ((C1314v) AbstractC1239H.a(c1236e)).getSharedDrawScope().b(e3, U3, t4, interfaceC1257o, c0663b);
            } else if ((nVar2.f5860j & 4) != 0 && (nVar2 instanceof AbstractC1256n)) {
                int i3 = 0;
                for (V.n nVar3 = ((AbstractC1256n) nVar2).f10608v; nVar3 != null; nVar3 = nVar3.f5863m) {
                    if ((nVar3.f5860j & 4) != 0) {
                        i3++;
                        if (i3 == 1) {
                            nVar2 = nVar3;
                        } else {
                            if (dVar == null) {
                                dVar = new L.d(new V.n[16]);
                            }
                            if (nVar2 != null) {
                                dVar.b(nVar2);
                                nVar2 = null;
                            }
                            dVar.b(nVar3);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            nVar2 = AbstractC1248f.f(dVar);
        }
    }

    public final void b(InterfaceC0600s interfaceC0600s, long j3, Z z3, InterfaceC1257o interfaceC1257o, C0663b c0663b) {
        InterfaceC1257o interfaceC1257o2 = this.f10416i;
        this.f10416i = interfaceC1257o;
        O0.k kVar = z3.f10546s.f10403y;
        C0652b c0652b = this.f10415h;
        O0.b f3 = c0652b.f7552i.f();
        K1.m mVar = c0652b.f7552i;
        O0.k h2 = mVar.h();
        InterfaceC0600s e3 = mVar.e();
        long j4 = mVar.j();
        C0663b c0663b2 = (C0663b) mVar.f4559b;
        mVar.o(z3);
        mVar.q(kVar);
        mVar.n(interfaceC0600s);
        mVar.r(j3);
        mVar.f4559b = c0663b;
        interfaceC0600s.f();
        try {
            interfaceC1257o.g(this);
            interfaceC0600s.b();
            mVar.o(f3);
            mVar.q(h2);
            mVar.n(e3);
            mVar.r(j4);
            mVar.f4559b = c0663b2;
            this.f10416i = interfaceC1257o2;
        } catch (Throwable th) {
            interfaceC0600s.b();
            mVar.o(f3);
            mVar.q(h2);
            mVar.n(e3);
            mVar.r(j4);
            mVar.f4559b = c0663b2;
            throw th;
        }
    }

    @Override // O0.b
    public final float c() {
        return this.f10415h.c();
    }

    @Override // e0.InterfaceC0654d
    public final void c0(C0588g c0588g, long j3, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f10415h.c0(c0588g, j3, f3, abstractC0655e, c0594m, i2);
    }

    @Override // e0.InterfaceC0654d
    public final long e() {
        return this.f10415h.e();
    }

    @Override // e0.InterfaceC0654d
    public final K1.m e0() {
        return this.f10415h.f7552i;
    }

    @Override // O0.b
    public final long g0(float f3) {
        return this.f10415h.g0(f3);
    }

    @Override // e0.InterfaceC0654d
    public final O0.k getLayoutDirection() {
        return this.f10415h.f7551h.f7548b;
    }

    @Override // e0.InterfaceC0654d
    public final void h0(AbstractC0598q abstractC0598q, long j3, long j4, long j5, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f10415h.h0(abstractC0598q, j3, j4, j5, f3, abstractC0655e, c0594m, i2);
    }

    @Override // e0.InterfaceC0654d
    public final void k0(long j3, float f3, long j4, float f4, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f10415h.k0(j3, f3, j4, f4, abstractC0655e, c0594m, i2);
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f10415h.l(f3);
    }

    @Override // O0.b
    public final int m0(long j3) {
        return this.f10415h.m0(j3);
    }

    @Override // e0.InterfaceC0654d
    public final void o(AbstractC0598q abstractC0598q, long j3, long j4, float f3, int i2, float f4, C0594m c0594m, int i3) {
        this.f10415h.o(abstractC0598q, j3, j4, f3, i2, f4, c0594m, i3);
    }

    @Override // O0.b
    public final float o0(int i2) {
        return this.f10415h.o0(i2);
    }

    @Override // O0.b
    public final float p0(long j3) {
        return this.f10415h.p0(j3);
    }

    @Override // O0.b
    public final float r0(float f3) {
        return f3 / this.f10415h.c();
    }

    @Override // O0.b
    public final float s() {
        return this.f10415h.s();
    }

    @Override // e0.InterfaceC0654d
    public final void u(AbstractC0598q abstractC0598q, long j3, long j4, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f10415h.u(abstractC0598q, j3, j4, f3, abstractC0655e, c0594m, i2);
    }

    @Override // e0.InterfaceC0654d
    public final void v(long j3, long j4, long j5, float f3, int i2, float f4, C0594m c0594m, int i3) {
        this.f10415h.v(j3, j4, j5, f3, i2, f4, c0594m, i3);
    }

    @Override // e0.InterfaceC0654d
    public final void w0(long j3, long j4, long j5, float f3, AbstractC0655e abstractC0655e, C0594m c0594m, int i2) {
        this.f10415h.w0(j3, j4, j5, f3, abstractC0655e, c0594m, i2);
    }

    @Override // e0.InterfaceC0654d
    public final long x() {
        return this.f10415h.x();
    }

    @Override // e0.InterfaceC0654d
    public final void x0(long j3, long j4, long j5, long j6, AbstractC0655e abstractC0655e, float f3, C0594m c0594m, int i2) {
        this.f10415h.x0(j3, j4, j5, j6, abstractC0655e, f3, c0594m, i2);
    }
}
