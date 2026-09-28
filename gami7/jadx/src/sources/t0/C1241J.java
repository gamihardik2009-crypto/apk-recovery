package t0;

import H.C0101f1;
import J.C0283p;
import f0.C0663b;
import m.AbstractC0837j;
import n0.C0919B;
import n2.AbstractC0946A;
import r0.AbstractC1103Q;
import r0.C1125n;
import r0.InterfaceC1093G;
import u0.C1314v;

/* renamed from: t0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241J extends AbstractC1103Q implements InterfaceC1093G, InterfaceC1243a, T {

    /* renamed from: B, reason: collision with root package name */
    public boolean f10422B;

    /* renamed from: D, reason: collision with root package name */
    public Object f10424D;
    public boolean E;
    public final /* synthetic */ L F;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10425m;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10429r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10430s;

    /* renamed from: t, reason: collision with root package name */
    public O0.a f10431t;

    /* renamed from: v, reason: collision with root package name */
    public y2.c f10433v;

    /* renamed from: w, reason: collision with root package name */
    public C0663b f10434w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10435x;

    /* renamed from: n, reason: collision with root package name */
    public int f10426n = Integer.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public int f10427o = Integer.MAX_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public int f10428p = 3;

    /* renamed from: u, reason: collision with root package name */
    public long f10432u = 0;

    /* renamed from: y, reason: collision with root package name */
    public final C1237F f10436y = new C1237F(this, 1);

    /* renamed from: z, reason: collision with root package name */
    public final L.d f10437z = new L.d(new C1241J[16]);

    /* renamed from: A, reason: collision with root package name */
    public boolean f10421A = true;

    /* renamed from: C, reason: collision with root package name */
    public boolean f10423C = true;

    public C1241J(L l3) {
        this.F = l3;
        this.f10424D = l3.f10480r.f10462y;
    }

    public final void A0() {
        L l3;
        int i2;
        this.E = true;
        C1236E s3 = this.F.f10464a.s();
        if (!this.f10435x) {
            s0();
            if (this.f10425m && s3 != null) {
                s3.Q(false);
            }
        }
        if (s3 == null) {
            this.f10427o = 0;
        } else if (!this.f10425m && ((i2 = (l3 = s3.f10379D).f10466c) == 3 || i2 == 4)) {
            if (this.f10427o != Integer.MAX_VALUE) {
                AbstractC0946A.r("Place was called on a node which was placed already");
                throw null;
            }
            int i3 = l3.f10473j;
            this.f10427o = i3;
            l3.f10473j = i3 + 1;
        }
        g();
    }

    public final void B0(long j3, y2.c cVar, C0663b c0663b) {
        L l3 = this.F;
        if (!(!l3.f10464a.f10384K)) {
            AbstractC0946A.q("place is called on a deactivated node");
            throw null;
        }
        l3.f10466c = 4;
        this.f10429r = true;
        this.E = false;
        if (!O0.h.a(j3, this.f10432u)) {
            if (l3.f10479p || l3.f10478o) {
                l3.f10471h = true;
            }
            y0();
        }
        C1236E c1236e = l3.f10464a;
        f0 a3 = AbstractC1239H.a(c1236e);
        if (l3.f10471h || !this.f10435x) {
            l3.f(false);
            this.f10436y.f10411g = false;
            h0 snapshotObserver = ((C1314v) a3).getSnapshotObserver();
            C1240I c1240i = new C1240I(l3, a3, j3);
            snapshotObserver.getClass();
            if (c1236e.f10389j != null) {
                snapshotObserver.a(c1236e, snapshotObserver.f10591g, c1240i);
            } else {
                snapshotObserver.a(c1236e, snapshotObserver.f10590f, c1240i);
            }
        } else {
            O R02 = l3.a().R0();
            z2.h.c(R02);
            R02.J0(O0.h.c(j3, R02.f9838l));
            A0();
        }
        this.f10432u = j3;
        this.f10433v = cVar;
        this.f10434w = c0663b;
        l3.f10466c = 5;
    }

    public final boolean C0(long j3) {
        O0.a aVar;
        L l3 = this.F;
        C1236E c1236e = l3.f10464a;
        if (!(!c1236e.f10384K)) {
            AbstractC0946A.q("measure is called on a deactivated node");
            throw null;
        }
        C1236E s3 = c1236e.s();
        C1236E c1236e2 = l3.f10464a;
        c1236e2.f10377B = c1236e2.f10377B || (s3 != null && s3.f10377B);
        if (!c1236e2.f10379D.f10470g && (aVar = this.f10431t) != null && O0.a.b(aVar.f5132a, j3)) {
            f0 f0Var = c1236e2.f10395p;
            if (f0Var != null) {
                ((C1314v) f0Var).f11176N.f(c1236e2, true);
            }
            c1236e2.W();
            return false;
        }
        this.f10431t = new O0.a(j3);
        q0(j3);
        this.f10436y.f10410f = false;
        L.d v3 = c1236e2.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1241J c1241j = ((C1236E) objArr[i3]).f10379D.f10481s;
                z2.h.c(c1241j);
                c1241j.f10436y.f10407c = false;
                i3++;
            } while (i3 < i2);
        }
        long e3 = this.f10430s ? this.f9836j : l0.c.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f10430s = true;
        O R02 = l3.a().R0();
        if (R02 == null) {
            AbstractC0946A.r("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        l3.f10466c = 2;
        l3.f10470g = false;
        h0 snapshotObserver = ((C1314v) AbstractC1239H.a(c1236e2)).getSnapshotObserver();
        C0101f1 c0101f1 = new C0101f1(2, j3, l3);
        snapshotObserver.getClass();
        if (c1236e2.f10389j != null) {
            snapshotObserver.a(c1236e2, snapshotObserver.f10586b, c0101f1);
        } else {
            snapshotObserver.a(c1236e2, snapshotObserver.f10587c, c0101f1);
        }
        l3.f10471h = true;
        l3.f10472i = true;
        if (AbstractC1248f.r(c1236e2)) {
            l3.f10468e = true;
            l3.f10469f = true;
        } else {
            l3.f10467d = true;
        }
        l3.f10466c = 5;
        n0(l0.c.e(R02.f9834h, R02.f9835i));
        return (((int) (e3 >> 32)) == R02.f9834h && ((int) (4294967295L & e3)) == R02.f9835i) ? false : true;
    }

    @Override // t0.T
    public final void E(boolean z3) {
        O R02;
        L l3 = this.F;
        O R03 = l3.a().R0();
        if (z2.h.a(Boolean.valueOf(z3), R03 != null ? Boolean.valueOf(R03.f10485m) : null) || (R02 = l3.a().R0()) == null) {
            return;
        }
        R02.f10485m = z3;
    }

    @Override // r0.InterfaceC1093G
    public final int L(int i2) {
        z0();
        O R02 = this.F.a().R0();
        z2.h.c(R02);
        return R02.L(i2);
    }

    @Override // t0.InterfaceC1243a
    public final C1261t T() {
        return (C1261t) this.F.f10464a.f10378C.f4241c;
    }

    @Override // t0.InterfaceC1243a
    public final void Y() {
        C1236E.S(this.F.f10464a, false, 7);
    }

    @Override // r0.InterfaceC1093G
    public final AbstractC1103Q a(long j3) {
        C1236E s3;
        L l3 = this.F;
        C1236E s4 = l3.f10464a.s();
        int i2 = 2;
        C1236E c1236e = l3.f10464a;
        if ((s4 != null && s4.f10379D.f10466c == 2) || ((s3 = c1236e.s()) != null && s3.f10379D.f10466c == 4)) {
            l3.f10465b = false;
        }
        C1236E s5 = c1236e.s();
        if (s5 == null) {
            this.f10428p = 3;
        } else {
            if (this.f10428p != 3 && !c1236e.f10377B) {
                AbstractC0946A.r("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            L l4 = s5.f10379D;
            int d3 = AbstractC0837j.d(l4.f10466c);
            if (d3 == 0 || d3 == 1) {
                i2 = 1;
            } else if (d3 != 2 && d3 != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC1265x.g(l4.f10466c)));
            }
            this.f10428p = i2;
        }
        if (c1236e.f10385L == 3) {
            c1236e.f();
        }
        C0(j3);
        return this;
    }

    @Override // r0.InterfaceC1093G
    public final int a0(int i2) {
        z0();
        O R02 = this.F.a().R0();
        z2.h.c(R02);
        return R02.a0(i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b(int i2) {
        z0();
        O R02 = this.F.a().R0();
        z2.h.c(R02);
        return R02.b(i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b0(int i2) {
        z0();
        O R02 = this.F.a().R0();
        z2.h.c(R02);
        return R02.b0(i2);
    }

    @Override // r0.AbstractC1103Q
    public final int d0(C1125n c1125n) {
        L l3 = this.F;
        C1236E s3 = l3.f10464a.s();
        int i2 = s3 != null ? s3.f10379D.f10466c : 0;
        C1237F c1237f = this.f10436y;
        if (i2 == 2) {
            c1237f.f10407c = true;
        } else {
            C1236E s4 = l3.f10464a.s();
            if (s4 != null && s4.f10379D.f10466c == 4) {
                c1237f.f10408d = true;
            }
        }
        this.q = true;
        O R02 = l3.a().R0();
        z2.h.c(R02);
        int d02 = R02.d0(c1125n);
        this.q = false;
        return d02;
    }

    @Override // t0.InterfaceC1243a
    public final InterfaceC1243a f() {
        L l3;
        C1236E s3 = this.F.f10464a.s();
        if (s3 == null || (l3 = s3.f10379D) == null) {
            return null;
        }
        return l3.f10481s;
    }

    @Override // t0.InterfaceC1243a
    public final void g() {
        L.d v3;
        int i2;
        this.f10422B = true;
        C1237F c1237f = this.f10436y;
        c1237f.i();
        L l3 = this.F;
        boolean z3 = l3.f10471h;
        C1236E c1236e = l3.f10464a;
        if (z3 && (i2 = (v3 = c1236e.v()).f4620j) > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e2 = (C1236E) objArr[i3];
                if (c1236e2.f10379D.f10470g && c1236e2.q() == 1) {
                    L l4 = c1236e2.f10379D;
                    C1241J c1241j = l4.f10481s;
                    z2.h.c(c1241j);
                    C1241J c1241j2 = l4.f10481s;
                    O0.a aVar = c1241j2 != null ? c1241j2.f10431t : null;
                    z2.h.c(aVar);
                    if (c1241j.C0(aVar.f5132a)) {
                        C1236E.S(c1236e, false, 7);
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        O o3 = T().f10627T;
        z2.h.c(o3);
        if (l3.f10472i || (!this.q && !o3.f10487o && l3.f10471h)) {
            l3.f10471h = false;
            int i4 = l3.f10466c;
            l3.f10466c = 4;
            f0 a3 = AbstractC1239H.a(c1236e);
            l3.g(false);
            h0 snapshotObserver = ((C1314v) a3).getSnapshotObserver();
            C0283p c0283p = new C0283p(this, o3, l3, 4);
            snapshotObserver.getClass();
            if (c1236e.f10389j != null) {
                snapshotObserver.a(c1236e, snapshotObserver.f10592h, c0283p);
            } else {
                snapshotObserver.a(c1236e, snapshotObserver.f10589e, c0283p);
            }
            l3.f10466c = i4;
            if (l3.f10478o && o3.f10487o) {
                requestLayout();
            }
            l3.f10472i = false;
        }
        if (c1237f.f10408d) {
            c1237f.f10409e = true;
        }
        if (c1237f.f10406b && c1237f.f()) {
            c1237f.h();
        }
        this.f10422B = false;
    }

    @Override // t0.InterfaceC1243a
    public final boolean h() {
        return this.f10435x;
    }

    @Override // t0.InterfaceC1243a
    public final C1237F i() {
        return this.f10436y;
    }

    @Override // r0.AbstractC1103Q
    public final void l0(long j3, float f3, y2.c cVar) {
        B0(j3, cVar, null);
    }

    @Override // r0.AbstractC1103Q, r0.InterfaceC1093G
    public final Object p() {
        return this.f10424D;
    }

    @Override // t0.InterfaceC1243a
    public final void requestLayout() {
        this.F.f10464a.Q(false);
    }

    public final void s0() {
        boolean z3 = this.f10435x;
        this.f10435x = true;
        L l3 = this.F;
        if (!z3 && l3.f10470g) {
            C1236E.S(l3.f10464a, true, 6);
        }
        L.d v3 = l3.f10464a.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e = (C1236E) objArr[i3];
                if (c1236e.t() != Integer.MAX_VALUE) {
                    C1241J c1241j = c1236e.f10379D.f10481s;
                    z2.h.c(c1241j);
                    c1241j.s0();
                    C1236E.V(c1236e);
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void t0() {
        if (this.f10435x) {
            int i2 = 0;
            this.f10435x = false;
            L.d v3 = this.F.f10464a.v();
            int i3 = v3.f4620j;
            if (i3 > 0) {
                Object[] objArr = v3.f4618h;
                do {
                    C1241J c1241j = ((C1236E) objArr[i2]).f10379D.f10481s;
                    z2.h.c(c1241j);
                    c1241j.t0();
                    i2++;
                } while (i2 < i3);
            }
        }
    }

    @Override // t0.InterfaceC1243a
    public final void w(C0919B c0919b) {
        L.d v3 = this.F.f10464a.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1241J c1241j = ((C1236E) objArr[i3]).f10379D.f10481s;
                z2.h.c(c1241j);
                c0919b.l(c1241j);
                i3++;
            } while (i3 < i2);
        }
    }

    public final void y0() {
        L.d v3;
        int i2;
        L l3 = this.F;
        if (l3.q <= 0 || (i2 = (v3 = l3.f10464a.v()).f4620j) <= 0) {
            return;
        }
        Object[] objArr = v3.f4618h;
        int i3 = 0;
        do {
            C1236E c1236e = (C1236E) objArr[i3];
            L l4 = c1236e.f10379D;
            if ((l4.f10478o || l4.f10479p) && !l4.f10471h) {
                c1236e.Q(false);
            }
            C1241J c1241j = l4.f10481s;
            if (c1241j != null) {
                c1241j.y0();
            }
            i3++;
        } while (i3 < i2);
    }

    public final void z0() {
        int i2;
        L l3 = this.F;
        C1236E.S(l3.f10464a, false, 7);
        C1236E c1236e = l3.f10464a;
        C1236E s3 = c1236e.s();
        if (s3 == null || c1236e.f10385L != 3) {
            return;
        }
        int d3 = AbstractC0837j.d(s3.f10379D.f10466c);
        if (d3 != 0) {
            i2 = 2;
            if (d3 != 2) {
                i2 = s3.f10385L;
            }
        } else {
            i2 = 1;
        }
        c1236e.f10385L = i2;
    }
}
