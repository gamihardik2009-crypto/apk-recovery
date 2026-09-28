package t0;

import J.C0292u;
import f0.C0663b;
import java.util.List;
import m.AbstractC0837j;
import n0.C0919B;
import n1.C0944e;
import n2.AbstractC0946A;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.C1125n;
import r0.InterfaceC1093G;
import u0.C1314v;

/* renamed from: t0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242K extends AbstractC1103Q implements InterfaceC1093G, InterfaceC1243a, T {

    /* renamed from: A, reason: collision with root package name */
    public boolean f10438A;
    public boolean E;

    /* renamed from: G, reason: collision with root package name */
    public float f10442G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f10443H;

    /* renamed from: I, reason: collision with root package name */
    public y2.c f10444I;

    /* renamed from: J, reason: collision with root package name */
    public C0663b f10445J;

    /* renamed from: L, reason: collision with root package name */
    public float f10447L;

    /* renamed from: M, reason: collision with root package name */
    public final D.c0 f10448M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f10449N;

    /* renamed from: O, reason: collision with root package name */
    public final /* synthetic */ L f10450O;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10451m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10454p;
    public boolean q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10456s;

    /* renamed from: u, reason: collision with root package name */
    public y2.c f10458u;

    /* renamed from: v, reason: collision with root package name */
    public C0663b f10459v;

    /* renamed from: w, reason: collision with root package name */
    public float f10460w;

    /* renamed from: y, reason: collision with root package name */
    public Object f10462y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10463z;

    /* renamed from: n, reason: collision with root package name */
    public int f10452n = Integer.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public int f10453o = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public int f10455r = 3;

    /* renamed from: t, reason: collision with root package name */
    public long f10457t = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10461x = true;

    /* renamed from: B, reason: collision with root package name */
    public final C1237F f10439B = new C1237F(this, 0);

    /* renamed from: C, reason: collision with root package name */
    public final L.d f10440C = new L.d(new C1242K[16]);

    /* renamed from: D, reason: collision with root package name */
    public boolean f10441D = true;
    public final C0944e F = new C0944e(8, this);

    /* renamed from: K, reason: collision with root package name */
    public long f10446K = 0;

    public C1242K(L l3) {
        this.f10450O = l3;
        this.f10448M = new D.c0(l3, 12, this);
    }

    public final void A0() {
        int i2;
        L l3 = this.f10450O;
        C1236E.U(l3.f10464a, false, 7);
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

    public final void B0() {
        this.f10443H = true;
        L l3 = this.f10450O;
        C1236E s3 = l3.f10464a.s();
        float f3 = T().F;
        C0292u c0292u = l3.f10464a.f10378C;
        Z z3 = (Z) c0292u.f4242d;
        while (z3 != ((C1261t) c0292u.f4241c)) {
            z2.h.d(z3, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C1267z c1267z = (C1267z) z3;
            f3 += c1267z.F;
            z3 = c1267z.f10548u;
        }
        if (f3 != this.f10442G) {
            this.f10442G = f3;
            if (s3 != null) {
                s3.K();
            }
            if (s3 != null) {
                s3.y();
            }
        }
        if (!this.f10463z) {
            if (s3 != null) {
                s3.y();
            }
            t0();
            if (this.f10451m && s3 != null) {
                s3.T(false);
            }
        }
        if (s3 == null) {
            this.f10453o = 0;
        } else if (!this.f10451m) {
            L l4 = s3.f10379D;
            if (l4.f10466c == 3) {
                if (this.f10453o != Integer.MAX_VALUE) {
                    AbstractC0946A.r("Place was called on a node which was placed already");
                    throw null;
                }
                int i2 = l4.f10474k;
                this.f10453o = i2;
                l4.f10474k = i2 + 1;
            }
        }
        g();
    }

    public final void C0(long j3, float f3, y2.c cVar, C0663b c0663b) {
        L l3 = this.f10450O;
        C1236E c1236e = l3.f10464a;
        if (!(!c1236e.f10384K)) {
            AbstractC0946A.q("place is called on a deactivated node");
            throw null;
        }
        l3.f10466c = 3;
        this.f10457t = j3;
        this.f10460w = f3;
        this.f10458u = cVar;
        this.f10459v = c0663b;
        this.q = true;
        this.f10443H = false;
        f0 a3 = AbstractC1239H.a(c1236e);
        if (l3.f10468e || !this.f10463z) {
            this.f10439B.f10411g = false;
            l3.d(false);
            this.f10444I = cVar;
            this.f10446K = j3;
            this.f10447L = f3;
            this.f10445J = c0663b;
            h0 snapshotObserver = ((C1314v) a3).getSnapshotObserver();
            snapshotObserver.a(l3.f10464a, snapshotObserver.f10590f, this.f10448M);
        } else {
            Z a4 = l3.a();
            a4.h1(O0.h.c(j3, a4.f9838l), f3, cVar, c0663b);
            B0();
        }
        l3.f10466c = 5;
    }

    public final void D0(long j3, float f3, y2.c cVar, C0663b c0663b) {
        AbstractC1102P placementScope;
        this.f10438A = true;
        boolean a3 = O0.h.a(j3, this.f10457t);
        boolean z3 = false;
        L l3 = this.f10450O;
        if (!a3 || this.f10449N) {
            if (l3.f10476m || l3.f10475l || this.f10449N) {
                l3.f10468e = true;
                this.f10449N = false;
            }
            z0();
        }
        if (AbstractC1248f.r(l3.f10464a)) {
            Z z4 = l3.a().f10549v;
            C1236E c1236e = l3.f10464a;
            if (z4 == null || (placementScope = z4.f10488p) == null) {
                placementScope = ((C1314v) AbstractC1239H.a(c1236e)).getPlacementScope();
            }
            C1241J c1241j = l3.f10481s;
            z2.h.c(c1241j);
            C1236E s3 = c1236e.s();
            if (s3 != null) {
                s3.f10379D.f10473j = 0;
            }
            c1241j.f10427o = Integer.MAX_VALUE;
            AbstractC1102P.d(placementScope, c1241j, (int) (j3 >> 32), (int) (4294967295L & j3));
        }
        C1241J c1241j2 = l3.f10481s;
        if (c1241j2 != null && !c1241j2.f10429r) {
            z3 = true;
        }
        if (true ^ z3) {
            C0(j3, f3, cVar, c0663b);
        } else {
            AbstractC0946A.r("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    @Override // t0.T
    public final void E(boolean z3) {
        L l3 = this.f10450O;
        boolean z4 = l3.a().f10485m;
        if (z3 != z4) {
            l3.a().f10485m = z4;
            this.f10449N = true;
        }
    }

    public final boolean E0(long j3) {
        L l3 = this.f10450O;
        C1236E c1236e = l3.f10464a;
        boolean z3 = true;
        if (!(!c1236e.f10384K)) {
            AbstractC0946A.q("measure is called on a deactivated node");
            throw null;
        }
        f0 a3 = AbstractC1239H.a(c1236e);
        C1236E c1236e2 = l3.f10464a;
        C1236E s3 = c1236e2.s();
        c1236e2.f10377B = c1236e2.f10377B || (s3 != null && s3.f10377B);
        if (!c1236e2.f10379D.f10467d && O0.a.b(this.f9837k, j3)) {
            ((C1314v) a3).f11176N.f(c1236e2, false);
            c1236e2.W();
            return false;
        }
        this.f10439B.f10410f = false;
        L.d v3 = c1236e2.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                ((C1236E) objArr[i3]).f10379D.f10480r.f10439B.f10407c = false;
                i3++;
            } while (i3 < i2);
        }
        this.f10454p = true;
        long j4 = l3.a().f9836j;
        q0(j3);
        if (l3.f10466c != 5) {
            AbstractC0946A.r("layout state is not idle before measure starts");
            throw null;
        }
        l3.f10466c = 1;
        l3.f10467d = false;
        l3.f10482t = j3;
        h0 snapshotObserver = ((C1314v) AbstractC1239H.a(c1236e2)).getSnapshotObserver();
        snapshotObserver.a(c1236e2, snapshotObserver.f10587c, l3.f10483u);
        if (l3.f10466c == 1) {
            l3.f10468e = true;
            l3.f10469f = true;
            l3.f10466c = 5;
        }
        if (O0.j.a(l3.a().f9836j, j4) && l3.a().f9834h == this.f9834h && l3.a().f9835i == this.f9835i) {
            z3 = false;
        }
        n0(l0.c.e(l3.a().f9834h, l3.a().f9835i));
        return z3;
    }

    @Override // r0.InterfaceC1093G
    public final int L(int i2) {
        A0();
        return this.f10450O.a().L(i2);
    }

    @Override // t0.InterfaceC1243a
    public final C1261t T() {
        return (C1261t) this.f10450O.f10464a.f10378C.f4241c;
    }

    @Override // t0.InterfaceC1243a
    public final void Y() {
        C1236E.U(this.f10450O.f10464a, false, 7);
    }

    @Override // r0.InterfaceC1093G
    public final AbstractC1103Q a(long j3) {
        int i2;
        L l3 = this.f10450O;
        C1236E c1236e = l3.f10464a;
        if (c1236e.f10385L == 3) {
            c1236e.f();
        }
        C1236E c1236e2 = l3.f10464a;
        if (AbstractC1248f.r(c1236e2)) {
            C1241J c1241j = l3.f10481s;
            z2.h.c(c1241j);
            c1241j.f10428p = 3;
            c1241j.a(j3);
        }
        C1236E s3 = c1236e2.s();
        if (s3 == null) {
            this.f10455r = 3;
        } else {
            if (this.f10455r != 3 && !c1236e2.f10377B) {
                AbstractC0946A.r("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            L l4 = s3.f10379D;
            int d3 = AbstractC0837j.d(l4.f10466c);
            if (d3 != 0) {
                i2 = 2;
                if (d3 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC1265x.g(l4.f10466c)));
                }
            } else {
                i2 = 1;
            }
            this.f10455r = i2;
        }
        E0(j3);
        return this;
    }

    @Override // r0.InterfaceC1093G
    public final int a0(int i2) {
        A0();
        return this.f10450O.a().a0(i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b(int i2) {
        A0();
        return this.f10450O.a().b(i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b0(int i2) {
        A0();
        return this.f10450O.a().b0(i2);
    }

    @Override // r0.AbstractC1103Q
    public final int d0(C1125n c1125n) {
        L l3 = this.f10450O;
        C1236E s3 = l3.f10464a.s();
        int i2 = s3 != null ? s3.f10379D.f10466c : 0;
        C1237F c1237f = this.f10439B;
        if (i2 == 1) {
            c1237f.f10407c = true;
        } else {
            C1236E s4 = l3.f10464a.s();
            if (s4 != null && s4.f10379D.f10466c == 3) {
                c1237f.f10408d = true;
            }
        }
        this.f10456s = true;
        int d02 = l3.a().d0(c1125n);
        this.f10456s = false;
        return d02;
    }

    @Override // t0.InterfaceC1243a
    public final InterfaceC1243a f() {
        L l3;
        C1236E s3 = this.f10450O.f10464a.s();
        if (s3 == null || (l3 = s3.f10379D) == null) {
            return null;
        }
        return l3.f10480r;
    }

    @Override // t0.InterfaceC1243a
    public final void g() {
        L.d v3;
        int i2;
        this.E = true;
        C1237F c1237f = this.f10439B;
        c1237f.i();
        L l3 = this.f10450O;
        boolean z3 = l3.f10468e;
        C1236E c1236e = l3.f10464a;
        if (z3 && (i2 = (v3 = c1236e.v()).f4620j) > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e2 = (C1236E) objArr[i3];
                L l4 = c1236e2.f10379D;
                if (l4.f10467d && l4.f10480r.f10455r == 1 && C1236E.M(c1236e2)) {
                    C1236E.U(c1236e, false, 7);
                }
                i3++;
            } while (i3 < i2);
        }
        if (l3.f10469f || (!this.f10456s && !T().f10487o && l3.f10468e)) {
            l3.f10468e = false;
            int i4 = l3.f10466c;
            l3.f10466c = 3;
            l3.e(false);
            h0 snapshotObserver = ((C1314v) AbstractC1239H.a(c1236e)).getSnapshotObserver();
            snapshotObserver.a(c1236e, snapshotObserver.f10589e, this.F);
            l3.f10466c = i4;
            if (T().f10487o && l3.f10475l) {
                requestLayout();
            }
            l3.f10469f = false;
        }
        if (c1237f.f10408d) {
            c1237f.f10409e = true;
        }
        if (c1237f.f10406b && c1237f.f()) {
            c1237f.h();
        }
        this.E = false;
    }

    @Override // t0.InterfaceC1243a
    public final boolean h() {
        return this.f10463z;
    }

    @Override // t0.InterfaceC1243a
    public final C1237F i() {
        return this.f10439B;
    }

    @Override // r0.AbstractC1103Q
    public final void l0(long j3, float f3, y2.c cVar) {
        D0(j3, f3, cVar, null);
    }

    @Override // r0.AbstractC1103Q, r0.InterfaceC1093G
    public final Object p() {
        return this.f10462y;
    }

    @Override // t0.InterfaceC1243a
    public final void requestLayout() {
        this.f10450O.f10464a.T(false);
    }

    public final List s0() {
        L l3 = this.f10450O;
        l3.f10464a.d0();
        boolean z3 = this.f10441D;
        L.d dVar = this.f10440C;
        if (!z3) {
            return dVar.f();
        }
        C1236E c1236e = l3.f10464a;
        L.d v3 = c1236e.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e2 = (C1236E) objArr[i3];
                if (dVar.f4620j <= i3) {
                    dVar.b(c1236e2.f10379D.f10480r);
                } else {
                    C1242K c1242k = c1236e2.f10379D.f10480r;
                    Object[] objArr2 = dVar.f4618h;
                    Object obj = objArr2[i3];
                    objArr2[i3] = c1242k;
                }
                i3++;
            } while (i3 < i2);
        }
        dVar.o(c1236e.n().size(), dVar.f4620j);
        this.f10441D = false;
        return dVar.f();
    }

    public final void t0() {
        boolean z3 = this.f10463z;
        this.f10463z = true;
        C1236E c1236e = this.f10450O.f10464a;
        if (!z3) {
            L l3 = c1236e.f10379D;
            if (l3.f10467d) {
                C1236E.U(c1236e, true, 6);
            } else if (l3.f10470g) {
                C1236E.S(c1236e, true, 6);
            }
        }
        C0292u c0292u = c1236e.f10378C;
        Z z4 = ((C1261t) c0292u.f4241c).f10548u;
        for (Z z5 = (Z) c0292u.f4242d; !z2.h.a(z5, z4) && z5 != null; z5 = z5.f10548u) {
            if (z5.f10543K) {
                z5.Z0();
            }
        }
        L.d v3 = c1236e.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e2 = (C1236E) objArr[i3];
                if (c1236e2.t() != Integer.MAX_VALUE) {
                    c1236e2.f10379D.f10480r.t0();
                    C1236E.V(c1236e2);
                }
                i3++;
            } while (i3 < i2);
        }
    }

    @Override // t0.InterfaceC1243a
    public final void w(C0919B c0919b) {
        L.d v3 = this.f10450O.f10464a.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                c0919b.l(((C1236E) objArr[i3]).f10379D.f10480r);
                i3++;
            } while (i3 < i2);
        }
    }

    public final void y0() {
        if (this.f10463z) {
            int i2 = 0;
            this.f10463z = false;
            L l3 = this.f10450O;
            C0292u c0292u = l3.f10464a.f10378C;
            Z z3 = ((C1261t) c0292u.f4241c).f10548u;
            for (Z z4 = (Z) c0292u.f4242d; !z2.h.a(z4, z3) && z4 != null; z4 = z4.f10548u) {
                if (z4.f10544L != null) {
                    if (z4.f10545M != null) {
                        z4.f10545M = null;
                    }
                    z4.p1(null, false);
                    z4.f10546s.T(false);
                }
            }
            L.d v3 = l3.f10464a.v();
            int i3 = v3.f4620j;
            if (i3 > 0) {
                Object[] objArr = v3.f4618h;
                do {
                    ((C1236E) objArr[i2]).f10379D.f10480r.y0();
                    i2++;
                } while (i2 < i3);
            }
        }
    }

    public final void z0() {
        L.d v3;
        int i2;
        L l3 = this.f10450O;
        if (l3.f10477n <= 0 || (i2 = (v3 = l3.f10464a.v()).f4620j) <= 0) {
            return;
        }
        Object[] objArr = v3.f4618h;
        int i3 = 0;
        do {
            C1236E c1236e = (C1236E) objArr[i3];
            L l4 = c1236e.f10379D;
            if ((l4.f10475l || l4.f10476m) && !l4.f10468e) {
                c1236e.T(false);
            }
            l4.f10480r.z0();
            i3++;
        } while (i3 < i2);
    }
}
