package t0;

import m.AbstractC0837j;
import n2.AbstractC0946A;
import r0.AbstractC1102P;
import u0.C1310t;
import u0.C1314v;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final C1236E f10499a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10501c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10502d;

    /* renamed from: i, reason: collision with root package name */
    public O0.a f10507i;

    /* renamed from: b, reason: collision with root package name */
    public final K1.l f10500b = new K1.l(3);

    /* renamed from: e, reason: collision with root package name */
    public final B.z f10503e = new B.z(4);

    /* renamed from: f, reason: collision with root package name */
    public final L.d f10504f = new L.d(new C1236E[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f10505g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final L.d f10506h = new L.d(new P[16]);

    public Q(C1236E c1236e) {
        this.f10499a = c1236e;
    }

    public static boolean b(C1236E c1236e, O0.a aVar) {
        boolean C02;
        C1236E c1236e2 = c1236e.f10389j;
        if (c1236e2 == null) {
            return false;
        }
        L l3 = c1236e.f10379D;
        if (aVar != null) {
            if (c1236e2 != null) {
                C1241J c1241j = l3.f10481s;
                z2.h.c(c1241j);
                C02 = c1241j.C0(aVar.f5132a);
            }
            C02 = false;
        } else {
            C1241J c1241j2 = l3.f10481s;
            O0.a aVar2 = c1241j2 != null ? c1241j2.f10431t : null;
            if (aVar2 != null && c1236e2 != null) {
                z2.h.c(c1241j2);
                C02 = c1241j2.C0(aVar2.f5132a);
            }
            C02 = false;
        }
        C1236E s3 = c1236e.s();
        if (C02 && s3 != null) {
            if (s3.f10389j == null) {
                C1236E.U(s3, false, 3);
            } else if (c1236e.q() == 1) {
                C1236E.S(s3, false, 3);
            } else if (c1236e.q() == 2) {
                s3.Q(false);
            }
        }
        return C02;
    }

    public static boolean c(C1236E c1236e, O0.a aVar) {
        boolean L3 = aVar != null ? c1236e.L(aVar) : C1236E.M(c1236e);
        C1236E s3 = c1236e.s();
        if (L3 && s3 != null) {
            int i2 = c1236e.f10379D.f10480r.f10455r;
            if (i2 == 1) {
                C1236E.U(s3, false, 3);
            } else if (i2 == 2) {
                s3.T(false);
            }
        }
        return L3;
    }

    public static boolean h(C1236E c1236e) {
        return c1236e.f10379D.f10467d && i(c1236e);
    }

    public static boolean i(C1236E c1236e) {
        C1242K c1242k = c1236e.f10379D.f10480r;
        return c1242k.f10455r == 1 || c1242k.f10439B.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 < r7) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            B.z r0 = r6.f10503e
            r1 = 1
            if (r7 == 0) goto L13
            java.lang.Object r7 = r0.f239c
            L.d r7 = (L.d) r7
            r7.g()
            t0.E r2 = r6.f10499a
            r7.b(r2)
            r2.f10383J = r1
        L13:
            t0.d0 r7 = t0.d0.f10562b
            java.lang.Object r2 = r0.f239c
            L.d r2 = (L.d) r2
            r2.p(r7)
            int r7 = r2.f4620j
            java.lang.Object r3 = r0.f240d
            t0.E[] r3 = (t0.C1236E[]) r3
            if (r3 == 0) goto L27
            int r4 = r3.length
            if (r4 >= r7) goto L2f
        L27:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r7)
            t0.E[] r3 = new t0.C1236E[r3]
        L2f:
            r4 = 0
            r0.f240d = r4
            r4 = 0
        L33:
            if (r4 >= r7) goto L3e
            java.lang.Object[] r5 = r2.f4618h
            r5 = r5[r4]
            r3[r4] = r5
            int r4 = r4 + 1
            goto L33
        L3e:
            r2.g()
            int r7 = r7 - r1
        L42:
            r1 = -1
            if (r1 >= r7) goto L54
            r1 = r3[r7]
            z2.h.c(r1)
            boolean r2 = r1.f10383J
            if (r2 == 0) goto L51
            B.z.c(r1)
        L51:
            int r7 = r7 + (-1)
            goto L42
        L54:
            r0.f240d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.Q.a(boolean):void");
    }

    public final void d() {
        L.d dVar = this.f10506h;
        if (dVar.l()) {
            int i2 = dVar.f4620j;
            if (i2 > 0) {
                Object[] objArr = dVar.f4618h;
                int i3 = 0;
                do {
                    P p3 = (P) objArr[i3];
                    if (p3.f10496a.D()) {
                        boolean z3 = p3.f10497b;
                        boolean z4 = p3.f10498c;
                        C1236E c1236e = p3.f10496a;
                        if (z3) {
                            C1236E.S(c1236e, z4, 2);
                        } else {
                            C1236E.U(c1236e, z4, 2);
                        }
                    }
                    i3++;
                } while (i3 < i2);
            }
            dVar.g();
        }
    }

    public final void e(C1236E c1236e) {
        L.d v3 = c1236e.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e2 = (C1236E) objArr[i3];
                if (z2.h.a(c1236e2.F(), Boolean.TRUE) && !c1236e2.f10384K) {
                    if (this.f10500b.f(c1236e2, true)) {
                        c1236e2.G();
                    }
                    e(c1236e2);
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void f(C1236E c1236e, boolean z3) {
        K1.l lVar = this.f10500b;
        if (((q0) ((D.S) (z3 ? lVar.f4556b : lVar.f4557c)).f764d).isEmpty()) {
            return;
        }
        if (!this.f10501c) {
            AbstractC0946A.r("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (!(z3 ? c1236e.f10379D.f10470g : c1236e.f10379D.f10467d)) {
            g(c1236e, z3);
        } else {
            AbstractC0946A.q("node not yet measured");
            throw null;
        }
    }

    public final void g(C1236E c1236e, boolean z3) {
        C1241J c1241j;
        C1237F c1237f;
        L.d v3 = c1236e.v();
        int i2 = v3.f4620j;
        K1.l lVar = this.f10500b;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e2 = (C1236E) objArr[i3];
                if ((!z3 && i(c1236e2)) || (z3 && (c1236e2.q() == 1 || ((c1241j = c1236e2.f10379D.f10481s) != null && (c1237f = c1241j.f10436y) != null && c1237f.f())))) {
                    boolean r3 = AbstractC1248f.r(c1236e2);
                    L l3 = c1236e2.f10379D;
                    if (r3 && !z3) {
                        if (l3.f10470g && lVar.f(c1236e2, true)) {
                            m(c1236e2, true, false);
                        } else {
                            f(c1236e2, true);
                        }
                    }
                    if ((z3 ? l3.f10470g : l3.f10467d) && lVar.f(c1236e2, z3)) {
                        m(c1236e2, z3, false);
                    }
                    if (!(z3 ? l3.f10470g : l3.f10467d)) {
                        g(c1236e2, z3);
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        L l4 = c1236e.f10379D;
        if ((z3 ? l4.f10470g : l4.f10467d) && lVar.f(c1236e, z3)) {
            m(c1236e, z3, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(C1310t c1310t) {
        boolean z3;
        C1236E c1236e;
        K1.l lVar = this.f10500b;
        C1236E c1236e2 = this.f10499a;
        if (!c1236e2.D()) {
            AbstractC0946A.q("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!c1236e2.E()) {
            AbstractC0946A.q("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (!(!this.f10501c)) {
            AbstractC0946A.q("performMeasureAndLayout called during measure layout");
            throw null;
        }
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (this.f10507i != null) {
            this.f10501c = true;
            this.f10502d = true;
            try {
                if (lVar.g()) {
                    z3 = false;
                    while (true) {
                        boolean g3 = lVar.g();
                        D.S s3 = (D.S) lVar.f4556b;
                        if (!g3) {
                            break;
                        }
                        boolean z4 = !((q0) s3.f764d).isEmpty();
                        if (z4) {
                            c1236e = (C1236E) ((q0) s3.f764d).first();
                        } else {
                            s3 = (D.S) lVar.f4557c;
                            c1236e = (C1236E) ((q0) s3.f764d).first();
                        }
                        s3.j(c1236e);
                        boolean m3 = m(c1236e, z4, true);
                        if (c1236e == c1236e2 && m3) {
                            z3 = true;
                        }
                    }
                    if (c1310t != null) {
                        c1310t.c();
                    }
                } else {
                    z3 = false;
                }
            } finally {
                this.f10501c = false;
                this.f10502d = false;
            }
        } else {
            z3 = false;
        }
        L.d dVar = this.f10504f;
        int i3 = dVar.f4620j;
        if (i3 > 0) {
            Object[] objArr3 = dVar.f4618h;
            do {
                ((C1236E) objArr3[i2]).J();
                i2++;
            } while (i2 < i3);
        }
        dVar.g();
        return z3;
    }

    public final void k(C1236E c1236e, long j3) {
        if (c1236e.f10384K) {
            return;
        }
        C1236E c1236e2 = this.f10499a;
        if (!(!z2.h.a(c1236e, c1236e2))) {
            AbstractC0946A.q("measureAndLayout called on root");
            throw null;
        }
        if (!c1236e2.D()) {
            AbstractC0946A.q("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!c1236e2.E()) {
            AbstractC0946A.q("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (!(!this.f10501c)) {
            AbstractC0946A.q("performMeasureAndLayout called during measure layout");
            throw null;
        }
        int i2 = 0;
        if (this.f10507i != null) {
            this.f10501c = true;
            this.f10502d = false;
            try {
                K1.l lVar = this.f10500b;
                ((D.S) lVar.f4556b).j(c1236e);
                ((D.S) lVar.f4557c).j(c1236e);
                boolean b3 = b(c1236e, new O0.a(j3));
                L l3 = c1236e.f10379D;
                if ((b3 || l3.f10471h) && z2.h.a(c1236e.F(), Boolean.TRUE)) {
                    c1236e.G();
                }
                e(c1236e);
                c(c1236e, new O0.a(j3));
                if (l3.f10468e && c1236e.E()) {
                    c1236e.P();
                    ((L.d) this.f10503e.f239c).b(c1236e);
                    c1236e.f10383J = true;
                }
                d();
                this.f10501c = false;
                this.f10502d = false;
            } catch (Throwable th) {
                this.f10501c = false;
                this.f10502d = false;
                throw th;
            }
        }
        L.d dVar = this.f10504f;
        int i3 = dVar.f4620j;
        if (i3 > 0) {
            Object[] objArr = dVar.f4618h;
            do {
                ((C1236E) objArr[i2]).J();
                i2++;
            } while (i2 < i3);
        }
        dVar.g();
    }

    public final void l() {
        K1.l lVar = this.f10500b;
        if (lVar.g()) {
            C1236E c1236e = this.f10499a;
            if (!c1236e.D()) {
                AbstractC0946A.q("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!c1236e.E()) {
                AbstractC0946A.q("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (!(!this.f10501c)) {
                AbstractC0946A.q("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f10507i != null) {
                this.f10501c = true;
                this.f10502d = false;
                try {
                    if (!((q0) ((D.S) lVar.f4556b).f764d).isEmpty()) {
                        if (c1236e.f10389j != null) {
                            o(c1236e, true);
                        } else {
                            n(c1236e);
                        }
                    }
                    o(c1236e, false);
                    this.f10501c = false;
                    this.f10502d = false;
                } catch (Throwable th) {
                    this.f10501c = false;
                    this.f10502d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean m(C1236E c1236e, boolean z3, boolean z4) {
        O0.a aVar;
        AbstractC1102P placementScope;
        C1261t c1261t;
        C1236E s3;
        C1241J c1241j;
        C1237F c1237f;
        C1241J c1241j2;
        C1237F c1237f2;
        if (c1236e.f10384K) {
            return false;
        }
        boolean E = c1236e.E();
        L l3 = c1236e.f10379D;
        if (E || l3.f10480r.f10438A || h(c1236e) || z2.h.a(c1236e.F(), Boolean.TRUE) || ((l3.f10470g && (c1236e.q() == 1 || ((c1241j2 = l3.f10481s) != null && (c1237f2 = c1241j2.f10436y) != null && c1237f2.f()))) || l3.f10480r.f10439B.f() || ((c1241j = l3.f10481s) != null && (c1237f = c1241j.f10436y) != null && c1237f.f()))) {
            C1236E c1236e2 = this.f10499a;
            if (c1236e == c1236e2) {
                aVar = this.f10507i;
                z2.h.c(aVar);
            } else {
                aVar = null;
            }
            if (z3) {
                r1 = l3.f10470g ? b(c1236e, aVar) : false;
                if (z4 && ((r1 || l3.f10471h) && z2.h.a(c1236e.F(), Boolean.TRUE))) {
                    c1236e.G();
                }
            } else {
                boolean c3 = l3.f10467d ? c(c1236e, aVar) : false;
                if (z4 && l3.f10468e && (c1236e == c1236e2 || ((s3 = c1236e.s()) != null && s3.E() && l3.f10480r.f10438A))) {
                    if (c1236e == c1236e2) {
                        if (c1236e.f10385L == 3) {
                            c1236e.g();
                        }
                        C1236E s4 = c1236e.s();
                        if (s4 == null || (c1261t = (C1261t) s4.f10378C.f4241c) == null || (placementScope = c1261t.f10488p) == null) {
                            placementScope = ((C1314v) AbstractC1239H.a(c1236e)).getPlacementScope();
                        }
                        AbstractC1102P.f(placementScope, l3.f10480r, 0, 0);
                    } else {
                        c1236e.P();
                    }
                    ((L.d) this.f10503e.f239c).b(c1236e);
                    c1236e.f10383J = true;
                }
                r1 = c3;
            }
            d();
        }
        return r1;
    }

    public final void n(C1236E c1236e) {
        L.d v3 = c1236e.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e2 = (C1236E) objArr[i3];
                if (i(c1236e2)) {
                    if (AbstractC1248f.r(c1236e2)) {
                        o(c1236e2, true);
                    } else {
                        n(c1236e2);
                    }
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void o(C1236E c1236e, boolean z3) {
        O0.a aVar;
        if (c1236e.f10384K) {
            return;
        }
        if (c1236e == this.f10499a) {
            aVar = this.f10507i;
            z2.h.c(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            b(c1236e, aVar);
        } else {
            c(c1236e, aVar);
        }
    }

    public final boolean p(C1236E c1236e, boolean z3) {
        int d3 = AbstractC0837j.d(c1236e.f10379D.f10466c);
        if (d3 == 0 || d3 == 1) {
            return false;
        }
        if (d3 == 2 || d3 == 3) {
            this.f10506h.b(new P(c1236e, false, z3));
            return false;
        }
        if (d3 != 4) {
            throw new J2.r();
        }
        L l3 = c1236e.f10379D;
        if (l3.f10467d && !z3) {
            return false;
        }
        l3.f10467d = true;
        if (c1236e.f10384K) {
            return false;
        }
        if (!c1236e.E() && !h(c1236e)) {
            return false;
        }
        C1236E s3 = c1236e.s();
        if (s3 == null || !s3.f10379D.f10467d) {
            this.f10500b.e(c1236e, false);
        }
        return !this.f10502d;
    }

    public final void q(long j3) {
        O0.a aVar = this.f10507i;
        if (aVar != null && O0.a.b(aVar.f5132a, j3)) {
            return;
        }
        if (!(!this.f10501c)) {
            AbstractC0946A.q("updateRootConstraints called while measuring");
            throw null;
        }
        this.f10507i = new O0.a(j3);
        C1236E c1236e = this.f10499a;
        C1236E c1236e2 = c1236e.f10389j;
        L l3 = c1236e.f10379D;
        if (c1236e2 != null) {
            l3.f10470g = true;
        }
        l3.f10467d = true;
        this.f10500b.e(c1236e, c1236e2 != null);
    }
}
