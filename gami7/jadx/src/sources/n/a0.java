package n;

import J.C0257c;
import J.C0274k0;
import android.view.View;
import m2.C0880v;
import t0.AbstractC1248f;
import t0.C1238G;
import t0.InterfaceC1257o;
import t0.InterfaceC1258p;

/* loaded from: classes.dex */
public final class a0 extends V.n implements InterfaceC1258p, InterfaceC1257o, t0.m0, t0.b0 {

    /* renamed from: A, reason: collision with root package name */
    public float f8728A;

    /* renamed from: B, reason: collision with root package name */
    public float f8729B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8730C;

    /* renamed from: D, reason: collision with root package name */
    public l0 f8731D;
    public View E;
    public O0.b F;

    /* renamed from: G, reason: collision with root package name */
    public k0 f8732G;

    /* renamed from: I, reason: collision with root package name */
    public J.F f8734I;

    /* renamed from: K, reason: collision with root package name */
    public O0.j f8736K;

    /* renamed from: L, reason: collision with root package name */
    public L2.g f8737L;

    /* renamed from: u, reason: collision with root package name */
    public y2.c f8738u;

    /* renamed from: v, reason: collision with root package name */
    public y2.c f8739v;

    /* renamed from: w, reason: collision with root package name */
    public y2.c f8740w;

    /* renamed from: x, reason: collision with root package name */
    public float f8741x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8742y;

    /* renamed from: z, reason: collision with root package name */
    public long f8743z;

    /* renamed from: H, reason: collision with root package name */
    public final C0274k0 f8733H = C0257c.N(null, J.W.f4106j);

    /* renamed from: J, reason: collision with root package name */
    public long f8735J = 9205357640488583168L;

    public a0(y2.c cVar, y2.c cVar2, y2.c cVar3, float f3, boolean z3, long j3, float f4, float f5, boolean z4, l0 l0Var) {
        this.f8738u = cVar;
        this.f8739v = cVar2;
        this.f8740w = cVar3;
        this.f8741x = f3;
        this.f8742y = z3;
        this.f8743z = j3;
        this.f8728A = f4;
        this.f8729B = f5;
        this.f8730C = z4;
        this.f8731D = l0Var;
    }

    @Override // V.n
    public final void C0() {
        s0();
        this.f8737L = B2.a.c(0, 0, 7);
        J2.B.r(y0(), null, 0, new Z(this, null), 3);
    }

    @Override // V.n
    public final void D0() {
        k0 k0Var = this.f8732G;
        if (k0Var != null) {
            ((m0) k0Var).b();
        }
        this.f8732G = null;
    }

    public final long K0() {
        if (this.f8734I == null) {
            this.f8734I = C0257c.F(new Y(this, 0));
        }
        J.F f3 = this.f8734I;
        if (f3 != null) {
            return ((b0.c) f3.getValue()).f7058a;
        }
        return 9205357640488583168L;
    }

    public final void L0() {
        k0 k0Var = this.f8732G;
        if (k0Var != null) {
            ((m0) k0Var).b();
        }
        View view = this.E;
        if (view == null) {
            view = AbstractC1248f.x(this);
        }
        View view2 = view;
        this.E = view2;
        O0.b bVar = this.F;
        if (bVar == null) {
            bVar = AbstractC1248f.v(this).f10402x;
        }
        O0.b bVar2 = bVar;
        this.F = bVar2;
        this.f8732G = this.f8731D.a(view2, this.f8742y, this.f8743z, this.f8728A, this.f8729B, this.f8730C, bVar2, this.f8741x);
        N0();
    }

    public final void M0() {
        O0.b bVar = this.F;
        if (bVar == null) {
            bVar = AbstractC1248f.v(this).f10402x;
            this.F = bVar;
        }
        long j3 = ((b0.c) this.f8738u.l(bVar)).f7058a;
        long j4 = 9205357640488583168L;
        if (!K1.f.F(j3) || !K1.f.F(K0())) {
            this.f8735J = 9205357640488583168L;
            k0 k0Var = this.f8732G;
            if (k0Var != null) {
                ((m0) k0Var).b();
                return;
            }
            return;
        }
        this.f8735J = b0.c.h(K0(), j3);
        y2.c cVar = this.f8739v;
        if (cVar != null) {
            long j5 = ((b0.c) cVar.l(bVar)).f7058a;
            b0.c cVar2 = new b0.c(j5);
            if (!K1.f.F(j5)) {
                cVar2 = null;
            }
            if (cVar2 != null) {
                j4 = b0.c.h(K0(), cVar2.f7058a);
            }
        }
        long j6 = j4;
        if (this.f8732G == null) {
            L0();
        }
        k0 k0Var2 = this.f8732G;
        if (k0Var2 != null) {
            k0Var2.a(this.f8735J, j6, this.f8741x);
        }
        N0();
    }

    public final void N0() {
        O0.b bVar;
        k0 k0Var = this.f8732G;
        if (k0Var == null || (bVar = this.F) == null) {
            return;
        }
        m0 m0Var = (m0) k0Var;
        long c3 = m0Var.c();
        O0.j jVar = this.f8736K;
        if ((jVar instanceof O0.j) && c3 == jVar.f5147a) {
            return;
        }
        y2.c cVar = this.f8740w;
        if (cVar != null) {
            cVar.l(new O0.g(bVar.M(l0.c.U(m0Var.c()))));
        }
        this.f8736K = new O0.j(m0Var.c());
    }

    @Override // t0.InterfaceC1257o
    public final void g(C1238G c1238g) {
        c1238g.a();
        L2.g gVar = this.f8737L;
        if (gVar != null) {
            gVar.q(C0880v.f8657a);
        }
    }

    @Override // t0.m0
    public final void k(A0.k kVar) {
        kVar.e(b0.f8747a, new Y(this, 1));
    }

    @Override // t0.InterfaceC1258p
    public final void q0(t0.Z z3) {
        this.f8733H.setValue(z3);
    }

    @Override // t0.b0
    public final void s0() {
        AbstractC1248f.s(this, new Y(this, 2));
    }
}
