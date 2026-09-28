package t0;

import C0.C0018a;
import H.Y0;
import J.C0292u;
import T.AbstractC0379g;
import c0.AbstractC0562B;
import c0.AbstractC0571K;
import c0.C0565E;
import c0.C0573M;
import c0.C0580U;
import c0.C0589h;
import c0.InterfaceC0600s;
import f0.C0663b;
import java.util.LinkedHashMap;
import n1.C0944e;
import n2.AbstractC0946A;
import n2.AbstractC0959k;
import n2.AbstractC0963o;
import r0.AbstractC1108W;
import r0.C1092F;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1129r;
import u0.C1314v;

/* loaded from: classes.dex */
public abstract class Z extends N implements InterfaceC1093G, InterfaceC1129r, g0 {

    /* renamed from: N, reason: collision with root package name */
    public static final C0573M f10530N;

    /* renamed from: O, reason: collision with root package name */
    public static final C1262u f10531O;

    /* renamed from: P, reason: collision with root package name */
    public static final float[] f10532P;

    /* renamed from: Q, reason: collision with root package name */
    public static final C1246d f10533Q;

    /* renamed from: R, reason: collision with root package name */
    public static final C1246d f10534R;

    /* renamed from: A, reason: collision with root package name */
    public O0.k f10535A;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC1095I f10537C;

    /* renamed from: D, reason: collision with root package name */
    public LinkedHashMap f10538D;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public b0.b f10539G;

    /* renamed from: H, reason: collision with root package name */
    public C1262u f10540H;

    /* renamed from: K, reason: collision with root package name */
    public boolean f10543K;

    /* renamed from: L, reason: collision with root package name */
    public e0 f10544L;

    /* renamed from: M, reason: collision with root package name */
    public C0663b f10545M;

    /* renamed from: s, reason: collision with root package name */
    public final C1236E f10546s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10547t;

    /* renamed from: u, reason: collision with root package name */
    public Z f10548u;

    /* renamed from: v, reason: collision with root package name */
    public Z f10549v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10550w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10551x;

    /* renamed from: y, reason: collision with root package name */
    public y2.c f10552y;

    /* renamed from: z, reason: collision with root package name */
    public O0.b f10553z;

    /* renamed from: B, reason: collision with root package name */
    public float f10536B = 0.8f;
    public long E = 0;

    /* renamed from: I, reason: collision with root package name */
    public final C0018a f10541I = new C0018a(17, this);

    /* renamed from: J, reason: collision with root package name */
    public final C0944e f10542J = new C0944e(10, this);

    static {
        C0573M c0573m = new C0573M();
        c0573m.f7200i = 1.0f;
        c0573m.f7201j = 1.0f;
        c0573m.f7202k = 1.0f;
        long j3 = AbstractC0562B.f7181a;
        c0573m.f7206o = j3;
        c0573m.f7207p = j3;
        c0573m.f7210t = 8.0f;
        c0573m.f7211u = C0580U.f7240b;
        c0573m.f7212v = AbstractC0571K.f7193a;
        c0573m.f7214x = 0;
        c0573m.f7215y = 9205357640488583168L;
        c0573m.f7216z = B2.a.e();
        c0573m.f7197A = O0.k.f5148h;
        f10530N = c0573m;
        f10531O = new C1262u();
        f10532P = C0565E.a();
        f10533Q = new C1246d(1);
        f10534R = new C1246d(2);
    }

    public Z(C1236E c1236e) {
        this.f10546s = c1236e;
        this.f10553z = c1236e.f10402x;
        this.f10535A = c1236e.f10403y;
    }

    public static Z l1(InterfaceC1129r interfaceC1129r) {
        Z z3;
        C1092F c1092f = interfaceC1129r instanceof C1092F ? (C1092F) interfaceC1129r : null;
        if (c1092f != null && (z3 = c1092f.f9825h.f10490s) != null) {
            return z3;
        }
        z2.h.d(interfaceC1129r, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (Z) interfaceC1129r;
    }

    @Override // t0.N
    public final boolean A0() {
        return this.f10537C != null;
    }

    @Override // t0.N
    public final C1236E B0() {
        return this.f10546s;
    }

    @Override // t0.N
    public final InterfaceC1095I C0() {
        InterfaceC1095I interfaceC1095I = this.f10537C;
        if (interfaceC1095I != null) {
            return interfaceC1095I;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    @Override // r0.InterfaceC1129r
    public final b0.d D(InterfaceC1129r interfaceC1129r, boolean z3) {
        if (!T0().f5869t) {
            AbstractC0946A.r("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!interfaceC1129r.n()) {
            AbstractC0946A.r("LayoutCoordinates " + interfaceC1129r + " is not attached!");
            throw null;
        }
        Z l12 = l1(interfaceC1129r);
        l12.c1();
        Z P02 = P0(l12);
        b0.b bVar = this.f10539G;
        if (bVar == null) {
            bVar = new b0.b();
            bVar.f7054a = 0.0f;
            bVar.f7055b = 0.0f;
            bVar.f7056c = 0.0f;
            bVar.f7057d = 0.0f;
            this.f10539G = bVar;
        }
        bVar.f7054a = 0.0f;
        bVar.f7055b = 0.0f;
        bVar.f7056c = (int) (interfaceC1129r.H() >> 32);
        bVar.f7057d = (int) (interfaceC1129r.H() & 4294967295L);
        while (l12 != P02) {
            l12.i1(bVar, z3, false);
            if (bVar.b()) {
                return b0.d.f7059e;
            }
            l12 = l12.f10549v;
            z2.h.c(l12);
        }
        H0(P02, bVar, z3);
        return new b0.d(bVar.f7054a, bVar.f7055b, bVar.f7056c, bVar.f7057d);
    }

    @Override // t0.N
    public final N D0() {
        return this.f10549v;
    }

    @Override // t0.N
    public final long E0() {
        return this.E;
    }

    @Override // t0.N
    public final void G0() {
        C0663b c0663b = this.f10545M;
        if (c0663b != null) {
            g1(this.E, this.F, c0663b);
        } else {
            l0(this.E, this.F, this.f10552y);
        }
    }

    @Override // r0.InterfaceC1129r
    public final long H() {
        return this.f9836j;
    }

    public final void H0(Z z3, b0.b bVar, boolean z4) {
        if (z3 == this) {
            return;
        }
        Z z5 = this.f10549v;
        if (z5 != null) {
            z5.H0(z3, bVar, z4);
        }
        long j3 = this.E;
        float f3 = (int) (j3 >> 32);
        bVar.f7054a -= f3;
        bVar.f7056c -= f3;
        float f4 = (int) (j3 & 4294967295L);
        bVar.f7055b -= f4;
        bVar.f7057d -= f4;
        e0 e0Var = this.f10544L;
        if (e0Var != null) {
            e0Var.h(bVar, true);
            if (this.f10551x && z4) {
                long j4 = this.f9836j;
                bVar.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
            }
        }
    }

    public final long I0(Z z3, long j3) {
        if (z3 == this) {
            return j3;
        }
        Z z4 = this.f10549v;
        return (z4 == null || z2.h.a(z3, z4)) ? Q0(j3, true) : Q0(z4.I0(z3, j3), true);
    }

    public final long J0(long j3) {
        return B1.C.i(Math.max(0.0f, (b0.f.d(j3) - i0()) / 2.0f), Math.max(0.0f, (b0.f.b(j3) - ((int) (this.f9836j & 4294967295L))) / 2.0f));
    }

    @Override // r0.InterfaceC1129r
    public final long K(long j3) {
        if (!T0().f5869t) {
            AbstractC0946A.r("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        c1();
        for (Z z3 = this; z3 != null; z3 = z3.f10549v) {
            j3 = z3.m1(j3, true);
        }
        return j3;
    }

    public final float K0(long j3, long j4) {
        if (i0() >= b0.f.d(j4) && ((int) (this.f9836j & 4294967295L)) >= b0.f.b(j4)) {
            return Float.POSITIVE_INFINITY;
        }
        long J02 = J0(j4);
        float d3 = b0.f.d(J02);
        float b3 = b0.f.b(J02);
        float d4 = b0.c.d(j3);
        float max = Math.max(0.0f, d4 < 0.0f ? -d4 : d4 - i0());
        float e3 = b0.c.e(j3);
        long e4 = K1.f.e(max, Math.max(0.0f, e3 < 0.0f ? -e3 : e3 - ((int) (this.f9836j & 4294967295L))));
        if ((d3 <= 0.0f && b3 <= 0.0f) || b0.c.d(e4) > d3 || b0.c.e(e4) > b3) {
            return Float.POSITIVE_INFINITY;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (e4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e4 & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    public final void L0(InterfaceC0600s interfaceC0600s, C0663b c0663b) {
        e0 e0Var = this.f10544L;
        if (e0Var != null) {
            e0Var.k(interfaceC0600s, c0663b);
            return;
        }
        long j3 = this.E;
        float f3 = (int) (j3 >> 32);
        float f4 = (int) (j3 & 4294967295L);
        interfaceC0600s.q(f3, f4);
        N0(interfaceC0600s, c0663b);
        interfaceC0600s.q(-f3, -f4);
    }

    public final void M0(InterfaceC0600s interfaceC0600s, C0589h c0589h) {
        long j3 = this.f9836j;
        interfaceC0600s.getClass();
        interfaceC0600s.i(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, c0589h);
    }

    @Override // r0.InterfaceC1129r
    public final long N(InterfaceC1129r interfaceC1129r, long j3) {
        return b1(interfaceC1129r, j3);
    }

    public final void N0(InterfaceC0600s interfaceC0600s, C0663b c0663b) {
        V.n U02 = U0(4);
        if (U02 == null) {
            f1(interfaceC0600s, c0663b);
            return;
        }
        C1236E c1236e = this.f10546s;
        c1236e.getClass();
        C1238G sharedDrawScope = ((C1314v) AbstractC1239H.a(c1236e)).getSharedDrawScope();
        long U3 = l0.c.U(this.f9836j);
        sharedDrawScope.getClass();
        L.d dVar = null;
        while (U02 != null) {
            if (U02 instanceof InterfaceC1257o) {
                sharedDrawScope.b(interfaceC0600s, U3, this, (InterfaceC1257o) U02, c0663b);
            } else if ((U02.f5860j & 4) != 0 && (U02 instanceof AbstractC1256n)) {
                int i2 = 0;
                for (V.n nVar = ((AbstractC1256n) U02).f10608v; nVar != null; nVar = nVar.f5863m) {
                    if ((nVar.f5860j & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            U02 = nVar;
                        } else {
                            if (dVar == null) {
                                dVar = new L.d(new V.n[16]);
                            }
                            if (U02 != null) {
                                dVar.b(U02);
                                U02 = null;
                            }
                            dVar.b(nVar);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            U02 = AbstractC1248f.f(dVar);
        }
    }

    public abstract void O0();

    public final Z P0(Z z3) {
        C1236E c1236e = z3.f10546s;
        C1236E c1236e2 = this.f10546s;
        if (c1236e == c1236e2) {
            V.n T02 = z3.T0();
            V.n nVar = T0().f5858h;
            if (!nVar.f5869t) {
                AbstractC0946A.r("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (V.n nVar2 = nVar.f5862l; nVar2 != null; nVar2 = nVar2.f5862l) {
                if ((nVar2.f5860j & 2) != 0 && nVar2 == T02) {
                    return z3;
                }
            }
            return this;
        }
        while (c1236e.q > c1236e2.q) {
            c1236e = c1236e.s();
            z2.h.c(c1236e);
        }
        C1236E c1236e3 = c1236e2;
        while (c1236e3.q > c1236e.q) {
            c1236e3 = c1236e3.s();
            z2.h.c(c1236e3);
        }
        while (c1236e != c1236e3) {
            c1236e = c1236e.s();
            c1236e3 = c1236e3.s();
            if (c1236e == null || c1236e3 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return c1236e3 == c1236e2 ? this : c1236e == z3.f10546s ? z3 : (C1261t) c1236e.f10378C.f4241c;
    }

    public final long Q0(long j3, boolean z3) {
        if (z3 || !this.f10485m) {
            long j4 = this.E;
            j3 = K1.f.e(b0.c.d(j3) - ((int) (j4 >> 32)), b0.c.e(j3) - ((int) (j4 & 4294967295L)));
        }
        e0 e0Var = this.f10544L;
        return e0Var != null ? e0Var.d(j3, true) : j3;
    }

    @Override // t0.g0
    public final boolean R() {
        return (this.f10544L == null || this.f10550w || !this.f10546s.D()) ? false : true;
    }

    public abstract O R0();

    public final long S0() {
        return this.f10553z.G(this.f10546s.f10404z.g());
    }

    public abstract V.n T0();

    public final V.n U0(int i2) {
        boolean h2 = a0.h(i2);
        V.n T02 = T0();
        if (!h2 && (T02 = T02.f5862l) == null) {
            return null;
        }
        for (V.n V02 = V0(h2); V02 != null && (V02.f5861k & i2) != 0; V02 = V02.f5863m) {
            if ((V02.f5860j & i2) != 0) {
                return V02;
            }
            if (V02 == T02) {
                return null;
            }
        }
        return null;
    }

    public final V.n V0(boolean z3) {
        V.n T02;
        C0292u c0292u = this.f10546s.f10378C;
        if (((Z) c0292u.f4242d) == this) {
            return (V.n) c0292u.f4244f;
        }
        if (z3) {
            Z z4 = this.f10549v;
            if (z4 != null && (T02 = z4.T0()) != null) {
                return T02.f5863m;
            }
        } else {
            Z z5 = this.f10549v;
            if (z5 != null) {
                return z5.T0();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [V.n] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void W0(V.n nVar, C1246d c1246d, long j3, r rVar, boolean z3, boolean z4) {
        if (nVar == null) {
            Y0(c1246d, j3, rVar, z3, z4);
            return;
        }
        rVar.b(nVar, -1.0f, z4, new X(this, nVar, c1246d, j3, rVar, z3, z4));
        Z z5 = nVar.f5865o;
        if (z5 != null) {
            V.n V02 = z5.V0(a0.h(16));
            if (V02 != null && V02.f5869t) {
                V.n nVar2 = V02.f5858h;
                if (!nVar2.f5869t) {
                    AbstractC0946A.r("visitLocalDescendants called on an unattached node");
                    throw null;
                }
                if ((nVar2.f5861k & 16) != 0) {
                    while (nVar2 != null) {
                        if ((nVar2.f5860j & 16) != 0) {
                            AbstractC1256n abstractC1256n = nVar2;
                            ?? r5 = 0;
                            while (abstractC1256n != 0) {
                                if (abstractC1256n instanceof k0) {
                                    if (((k0) abstractC1256n).z()) {
                                        return;
                                    }
                                } else if ((abstractC1256n.f5860j & 16) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                    V.n nVar3 = abstractC1256n.f10608v;
                                    int i2 = 0;
                                    abstractC1256n = abstractC1256n;
                                    r5 = r5;
                                    while (nVar3 != null) {
                                        if ((nVar3.f5860j & 16) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                abstractC1256n = nVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new L.d(new V.n[16]);
                                                }
                                                if (abstractC1256n != 0) {
                                                    r5.b(abstractC1256n);
                                                    abstractC1256n = 0;
                                                }
                                                r5.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f5863m;
                                        abstractC1256n = abstractC1256n;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC1256n = AbstractC1248f.f(r5);
                            }
                        }
                        nVar2 = nVar2.f5863m;
                    }
                }
            }
            rVar.f10621l = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
    
        if (t0.AbstractC1248f.h(r21.a(), t0.AbstractC1248f.a(r15, r23)) > 0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X0(t0.C1246d r18, long r19, t0.r r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.Z.X0(t0.d, long, t0.r, boolean, boolean):void");
    }

    public void Y0(C1246d c1246d, long j3, r rVar, boolean z3, boolean z4) {
        Z z5 = this.f10548u;
        if (z5 != null) {
            z5.X0(c1246d, z5.Q0(j3, true), rVar, z3, z4);
        }
    }

    public final void Z0() {
        e0 e0Var = this.f10544L;
        if (e0Var != null) {
            e0Var.invalidate();
            return;
        }
        Z z3 = this.f10549v;
        if (z3 != null) {
            z3.Z0();
        }
    }

    public final boolean a1() {
        if (this.f10544L != null && this.f10536B <= 0.0f) {
            return true;
        }
        Z z3 = this.f10549v;
        if (z3 != null) {
            return z3.a1();
        }
        return false;
    }

    public final long b1(InterfaceC1129r interfaceC1129r, long j3) {
        if (interfaceC1129r instanceof C1092F) {
            ((C1092F) interfaceC1129r).f9825h.f10490s.c1();
            return ((C1092F) interfaceC1129r).b(this, j3 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        Z l12 = l1(interfaceC1129r);
        l12.c1();
        Z P02 = P0(l12);
        while (l12 != P02) {
            j3 = l12.m1(j3, true);
            l12 = l12.f10549v;
            z2.h.c(l12);
        }
        return I0(P02, j3);
    }

    @Override // O0.b
    public final float c() {
        return this.f10546s.f10402x.c();
    }

    public final void c1() {
        L l3 = this.f10546s.f10379D;
        int i2 = l3.f10464a.f10379D.f10466c;
        if (i2 == 3 || i2 == 4) {
            if (l3.f10480r.E) {
                l3.e(true);
            } else {
                l3.d(true);
            }
        }
        if (i2 == 4) {
            C1241J c1241j = l3.f10481s;
            if (c1241j == null || !c1241j.f10422B) {
                l3.f(true);
            } else {
                l3.g(true);
            }
        }
    }

    @Override // r0.InterfaceC1129r
    public final long d(long j3) {
        if (!T0().f5869t) {
            AbstractC0946A.r("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        InterfaceC1129r g3 = AbstractC1108W.g(this);
        C1314v c1314v = (C1314v) AbstractC1239H.a(this.f10546s);
        c1314v.C();
        return b1(g3, b0.c.g(C0565E.b(j3, c1314v.f11182T), g3.K(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v7, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void d1() {
        V.n nVar;
        V.n V02 = V0(a0.h(128));
        if (V02 == null || (V02.f5858h.f5861k & 128) == 0) {
            return;
        }
        AbstractC0379g c3 = T.s.c();
        y2.c f3 = c3 != null ? c3.f() : null;
        AbstractC0379g d3 = T.s.d(c3);
        try {
            boolean h2 = a0.h(128);
            if (h2) {
                nVar = T0();
            } else {
                nVar = T0().f5862l;
                if (nVar == null) {
                }
            }
            for (V.n V03 = V0(h2); V03 != null; V03 = V03.f5863m) {
                if ((V03.f5861k & 128) == 0) {
                    break;
                }
                if ((V03.f5860j & 128) != 0) {
                    ?? r8 = 0;
                    AbstractC1256n abstractC1256n = V03;
                    while (abstractC1256n != 0) {
                        if (abstractC1256n instanceof InterfaceC1263v) {
                            ((InterfaceC1263v) abstractC1256n).E(this.f9836j);
                        } else if ((abstractC1256n.f5860j & 128) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                            V.n nVar2 = abstractC1256n.f10608v;
                            int i2 = 0;
                            abstractC1256n = abstractC1256n;
                            r8 = r8;
                            while (nVar2 != null) {
                                if ((nVar2.f5860j & 128) != 0) {
                                    i2++;
                                    r8 = r8;
                                    if (i2 == 1) {
                                        abstractC1256n = nVar2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new L.d(new V.n[16]);
                                        }
                                        if (abstractC1256n != 0) {
                                            r8.b(abstractC1256n);
                                            abstractC1256n = 0;
                                        }
                                        r8.b(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f5863m;
                                abstractC1256n = abstractC1256n;
                                r8 = r8;
                            }
                            if (i2 == 1) {
                            }
                        }
                        abstractC1256n = AbstractC1248f.f(r8);
                    }
                }
                if (V03 == nVar) {
                    break;
                }
            }
        } finally {
            T.s.f(c3, d3, f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [V.n] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void e1() {
        boolean h2 = a0.h(128);
        V.n T02 = T0();
        if (!h2 && (T02 = T02.f5862l) == null) {
            return;
        }
        for (V.n V02 = V0(h2); V02 != null && (V02.f5861k & 128) != 0; V02 = V02.f5863m) {
            if ((V02.f5860j & 128) != 0) {
                AbstractC1256n abstractC1256n = V02;
                ?? r5 = 0;
                while (abstractC1256n != 0) {
                    if (abstractC1256n instanceof InterfaceC1263v) {
                        ((InterfaceC1263v) abstractC1256n).b0(this);
                    } else if ((abstractC1256n.f5860j & 128) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                        V.n nVar = abstractC1256n.f10608v;
                        int i2 = 0;
                        abstractC1256n = abstractC1256n;
                        r5 = r5;
                        while (nVar != null) {
                            if ((nVar.f5860j & 128) != 0) {
                                i2++;
                                r5 = r5;
                                if (i2 == 1) {
                                    abstractC1256n = nVar;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new L.d(new V.n[16]);
                                    }
                                    if (abstractC1256n != 0) {
                                        r5.b(abstractC1256n);
                                        abstractC1256n = 0;
                                    }
                                    r5.b(nVar);
                                }
                            }
                            nVar = nVar.f5863m;
                            abstractC1256n = abstractC1256n;
                            r5 = r5;
                        }
                        if (i2 == 1) {
                        }
                    }
                    abstractC1256n = AbstractC1248f.f(r5);
                }
            }
            if (V02 == T02) {
                return;
            }
        }
    }

    public abstract void f1(InterfaceC0600s interfaceC0600s, C0663b c0663b);

    public abstract void g1(long j3, float f3, C0663b c0663b);

    @Override // r0.InterfaceC1126o
    public final O0.k getLayoutDirection() {
        return this.f10546s.f10403y;
    }

    public final void h1(long j3, float f3, y2.c cVar, C0663b c0663b) {
        C1236E c1236e = this.f10546s;
        if (c0663b == null) {
            if (this.f10545M != null) {
                this.f10545M = null;
                p1(null, false);
            }
            p1(cVar, false);
        } else {
            if (cVar != null) {
                AbstractC0946A.q("both ways to create layers shouldn't be used together");
                throw null;
            }
            if (this.f10545M != c0663b) {
                this.f10545M = null;
                p1(null, false);
                this.f10545M = c0663b;
            }
            if (this.f10544L == null) {
                C1314v c1314v = (C1314v) AbstractC1239H.a(c1236e);
                C0018a c0018a = this.f10541I;
                C0944e c0944e = this.f10542J;
                e0 k3 = c1314v.k(c0018a, c0944e, c0663b);
                k3.g(this.f9836j);
                k3.e(j3);
                this.f10544L = k3;
                c1236e.f10380G = true;
                c0944e.c();
            }
        }
        if (!O0.h.a(this.E, j3)) {
            this.E = j3;
            c1236e.f10379D.f10480r.z0();
            e0 e0Var = this.f10544L;
            if (e0Var != null) {
                e0Var.e(j3);
            } else {
                Z z3 = this.f10549v;
                if (z3 != null) {
                    z3.Z0();
                }
            }
            N.F0(this);
            f0 f0Var = c1236e.f10395p;
            if (f0Var != null) {
                ((C1314v) f0Var).y(c1236e);
            }
        }
        this.F = f3;
        if (this.f10487o) {
            return;
        }
        t0(new j0(C0(), this));
    }

    public final void i1(b0.b bVar, boolean z3, boolean z4) {
        e0 e0Var = this.f10544L;
        if (e0Var != null) {
            if (this.f10551x) {
                if (z4) {
                    long S02 = S0();
                    float d3 = b0.f.d(S02) / 2.0f;
                    float b3 = b0.f.b(S02) / 2.0f;
                    long j3 = this.f9836j;
                    bVar.a(-d3, -b3, ((int) (j3 >> 32)) + d3, ((int) (j3 & 4294967295L)) + b3);
                } else if (z3) {
                    long j4 = this.f9836j;
                    bVar.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            e0Var.h(bVar, false);
        }
        long j5 = this.E;
        float f3 = (int) (j5 >> 32);
        bVar.f7054a += f3;
        bVar.f7056c += f3;
        float f4 = (int) (j5 & 4294967295L);
        bVar.f7055b += f4;
        bVar.f7057d += f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void j1(InterfaceC1095I interfaceC1095I) {
        Z z3;
        InterfaceC1095I interfaceC1095I2 = this.f10537C;
        if (interfaceC1095I != interfaceC1095I2) {
            this.f10537C = interfaceC1095I;
            C1236E c1236e = this.f10546s;
            if (interfaceC1095I2 == null || interfaceC1095I.f() != interfaceC1095I2.f() || interfaceC1095I.h() != interfaceC1095I2.h()) {
                int f3 = interfaceC1095I.f();
                int h2 = interfaceC1095I.h();
                e0 e0Var = this.f10544L;
                if (e0Var != null) {
                    e0Var.g(l0.c.e(f3, h2));
                } else if (c1236e.E() && (z3 = this.f10549v) != null) {
                    z3.Z0();
                }
                n0(l0.c.e(f3, h2));
                if (this.f10552y != null) {
                    q1(false);
                }
                boolean h3 = a0.h(4);
                V.n T02 = T0();
                if (h3 || (T02 = T02.f5862l) != null) {
                    for (V.n V02 = V0(h3); V02 != null && (V02.f5861k & 4) != 0; V02 = V02.f5863m) {
                        if ((V02.f5860j & 4) != 0) {
                            AbstractC1256n abstractC1256n = V02;
                            ?? r8 = 0;
                            while (abstractC1256n != 0) {
                                if (abstractC1256n instanceof InterfaceC1257o) {
                                    ((InterfaceC1257o) abstractC1256n).j0();
                                } else if ((abstractC1256n.f5860j & 4) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                    V.n nVar = abstractC1256n.f10608v;
                                    int i2 = 0;
                                    abstractC1256n = abstractC1256n;
                                    r8 = r8;
                                    while (nVar != null) {
                                        if ((nVar.f5860j & 4) != 0) {
                                            i2++;
                                            r8 = r8;
                                            if (i2 == 1) {
                                                abstractC1256n = nVar;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new L.d(new V.n[16]);
                                                }
                                                if (abstractC1256n != 0) {
                                                    r8.b(abstractC1256n);
                                                    abstractC1256n = 0;
                                                }
                                                r8.b(nVar);
                                            }
                                        }
                                        nVar = nVar.f5863m;
                                        abstractC1256n = abstractC1256n;
                                        r8 = r8;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC1256n = AbstractC1248f.f(r8);
                            }
                        }
                        if (V02 == T02) {
                            break;
                        }
                    }
                }
                f0 f0Var = c1236e.f10395p;
                if (f0Var != null) {
                    ((C1314v) f0Var).y(c1236e);
                }
            }
            LinkedHashMap linkedHashMap = this.f10538D;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && !(!interfaceC1095I.i().isEmpty())) || z2.h.a(interfaceC1095I.i(), this.f10538D)) {
                return;
            }
            c1236e.f10379D.f10480r.f10439B.g();
            LinkedHashMap linkedHashMap2 = this.f10538D;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f10538D = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC1095I.i());
        }
    }

    @Override // r0.InterfaceC1129r
    public final long k(long j3) {
        long K3 = K(j3);
        C1314v c1314v = (C1314v) AbstractC1239H.a(this.f10546s);
        c1314v.C();
        return C0565E.b(K3, c1314v.f11181S);
    }

    public final void k1(V.n nVar, C1246d c1246d, long j3, r rVar, boolean z3, boolean z4, float f3) {
        if (nVar == null) {
            Y0(c1246d, j3, rVar, z3, z4);
            return;
        }
        if (!c1246d.c(nVar)) {
            k1(AbstractC1248f.e(nVar, c1246d.b()), c1246d, j3, rVar, z3, z4, f3);
            return;
        }
        Y y3 = new Y(this, nVar, c1246d, j3, rVar, z3, z4, f3, 1);
        if (rVar.f10619j == AbstractC0963o.u(rVar)) {
            rVar.b(nVar, f3, z4, y3);
            if (rVar.f10619j + 1 == AbstractC0963o.u(rVar)) {
                rVar.e();
                return;
            }
            return;
        }
        long a3 = rVar.a();
        int i2 = rVar.f10619j;
        rVar.f10619j = AbstractC0963o.u(rVar);
        rVar.b(nVar, f3, z4, y3);
        if (rVar.f10619j + 1 < AbstractC0963o.u(rVar) && AbstractC1248f.h(a3, rVar.a()) > 0) {
            int i3 = rVar.f10619j + 1;
            int i4 = i2 + 1;
            Object[] objArr = rVar.f10617h;
            AbstractC0959k.q(objArr, objArr, i4, i3, rVar.f10620k);
            long[] jArr = rVar.f10618i;
            int i5 = rVar.f10620k;
            z2.h.f(jArr, "<this>");
            System.arraycopy(jArr, i3, jArr, i4, i5 - i3);
            rVar.f10619j = ((rVar.f10620k + i2) - rVar.f10619j) - 1;
        }
        rVar.e();
        rVar.f10619j = i2;
    }

    @Override // r0.InterfaceC1129r
    public final long m(long j3) {
        if (T0().f5869t) {
            return b1(AbstractC1108W.g(this), ((C1314v) AbstractC1239H.a(this.f10546s)).F(j3));
        }
        AbstractC0946A.r("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final long m1(long j3, boolean z3) {
        e0 e0Var = this.f10544L;
        if (e0Var != null) {
            j3 = e0Var.d(j3, false);
        }
        if (!z3 && this.f10485m) {
            return j3;
        }
        long j4 = this.E;
        return K1.f.e(b0.c.d(j3) + ((int) (j4 >> 32)), b0.c.e(j3) + ((int) (j4 & 4294967295L)));
    }

    @Override // r0.InterfaceC1129r
    public final boolean n() {
        return T0().f5869t;
    }

    public final void n1(Z z3, float[] fArr) {
        if (z2.h.a(z3, this)) {
            return;
        }
        Z z4 = this.f10549v;
        z2.h.c(z4);
        z4.n1(z3, fArr);
        if (!O0.h.a(this.E, 0L)) {
            float[] fArr2 = f10532P;
            C0565E.d(fArr2);
            long j3 = this.E;
            C0565E.h(-((int) (j3 >> 32)), -((int) (j3 & 4294967295L)), 0.0f, fArr2);
            C0565E.g(fArr, fArr2);
        }
        e0 e0Var = this.f10544L;
        if (e0Var != null) {
            e0Var.b(fArr);
        }
    }

    public final void o1(Z z3, float[] fArr) {
        Z z4 = this;
        while (!z2.h.a(z4, z3)) {
            e0 e0Var = z4.f10544L;
            if (e0Var != null) {
                e0Var.i(fArr);
            }
            if (!O0.h.a(z4.E, 0L)) {
                float[] fArr2 = f10532P;
                C0565E.d(fArr2);
                C0565E.h((int) (r1 >> 32), (int) (r1 & 4294967295L), 0.0f, fArr2);
                C0565E.g(fArr, fArr2);
            }
            z4 = z4.f10549v;
            z2.h.c(z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [V.n] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [V.n] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // r0.AbstractC1103Q, r0.InterfaceC1093G
    public final Object p() {
        C1236E c1236e = this.f10546s;
        if (!c1236e.f10378C.f(64)) {
            return null;
        }
        T0();
        Object obj = null;
        for (V.n nVar = (n0) c1236e.f10378C.f4243e; nVar != null; nVar = nVar.f5862l) {
            if ((nVar.f5860j & 64) != 0) {
                AbstractC1256n abstractC1256n = nVar;
                ?? r5 = 0;
                while (abstractC1256n != 0) {
                    if (abstractC1256n instanceof i0) {
                        obj = ((i0) abstractC1256n).i0(obj);
                    } else if ((abstractC1256n.f5860j & 64) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                        V.n nVar2 = abstractC1256n.f10608v;
                        int i2 = 0;
                        abstractC1256n = abstractC1256n;
                        r5 = r5;
                        while (nVar2 != null) {
                            if ((nVar2.f5860j & 64) != 0) {
                                i2++;
                                r5 = r5;
                                if (i2 == 1) {
                                    abstractC1256n = nVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new L.d(new V.n[16]);
                                    }
                                    if (abstractC1256n != 0) {
                                        r5.b(abstractC1256n);
                                        abstractC1256n = 0;
                                    }
                                    r5.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f5863m;
                            abstractC1256n = abstractC1256n;
                            r5 = r5;
                        }
                        if (i2 == 1) {
                        }
                    }
                    abstractC1256n = AbstractC1248f.f(r5);
                }
            }
        }
        return obj;
    }

    public final void p1(y2.c cVar, boolean z3) {
        f0 f0Var;
        if (!(cVar == null || this.f10545M == null)) {
            AbstractC0946A.q("layerBlock can't be provided when explicitLayer is provided");
            throw null;
        }
        C1236E c1236e = this.f10546s;
        boolean z4 = (!z3 && this.f10552y == cVar && z2.h.a(this.f10553z, c1236e.f10402x) && this.f10535A == c1236e.f10403y) ? false : true;
        this.f10553z = c1236e.f10402x;
        this.f10535A = c1236e.f10403y;
        boolean D3 = c1236e.D();
        C0944e c0944e = this.f10542J;
        if (!D3 || cVar == null) {
            this.f10552y = null;
            e0 e0Var = this.f10544L;
            if (e0Var != null) {
                e0Var.c();
                c1236e.f10380G = true;
                c0944e.c();
                if (T0().f5869t && (f0Var = c1236e.f10395p) != null) {
                    ((C1314v) f0Var).y(c1236e);
                }
            }
            this.f10544L = null;
            this.f10543K = false;
            return;
        }
        this.f10552y = cVar;
        if (this.f10544L != null) {
            if (z4) {
                q1(true);
                return;
            }
            return;
        }
        e0 k3 = ((C1314v) AbstractC1239H.a(c1236e)).k(this.f10541I, c0944e, null);
        k3.g(this.f9836j);
        k3.e(this.E);
        this.f10544L = k3;
        q1(true);
        c1236e.f10380G = true;
        c0944e.c();
    }

    public final void q1(boolean z3) {
        f0 f0Var;
        if (this.f10545M != null) {
            return;
        }
        e0 e0Var = this.f10544L;
        if (e0Var == null) {
            if (this.f10552y == null) {
                return;
            }
            AbstractC0946A.r("null layer with a non-null layerBlock");
            throw null;
        }
        y2.c cVar = this.f10552y;
        if (cVar == null) {
            AbstractC0946A.s("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        C0573M c0573m = f10530N;
        c0573m.f(1.0f);
        c0573m.g(1.0f);
        c0573m.a(1.0f);
        if (c0573m.f7203l != 0.0f) {
            c0573m.f7199h |= 8;
            c0573m.f7203l = 0.0f;
        }
        if (c0573m.f7204m != 0.0f) {
            c0573m.f7199h |= 16;
            c0573m.f7204m = 0.0f;
        }
        c0573m.h(0.0f);
        long j3 = AbstractC0562B.f7181a;
        c0573m.b(j3);
        c0573m.k(j3);
        if (c0573m.q != 0.0f) {
            c0573m.f7199h |= 256;
            c0573m.q = 0.0f;
        }
        if (c0573m.f7208r != 0.0f) {
            c0573m.f7199h |= 512;
            c0573m.f7208r = 0.0f;
        }
        if (c0573m.f7209s != 0.0f) {
            c0573m.f7199h |= 1024;
            c0573m.f7209s = 0.0f;
        }
        if (c0573m.f7210t != 8.0f) {
            c0573m.f7199h |= 2048;
            c0573m.f7210t = 8.0f;
        }
        c0573m.m(C0580U.f7240b);
        c0573m.i(AbstractC0571K.f7193a);
        c0573m.d(false);
        if (!z2.h.a(null, null)) {
            c0573m.f7199h |= 131072;
        }
        if (!AbstractC0571K.n(c0573m.f7214x, 0)) {
            c0573m.f7199h |= 32768;
            c0573m.f7214x = 0;
        }
        c0573m.f7215y = 9205357640488583168L;
        c0573m.f7198B = null;
        c0573m.f7199h = 0;
        C1236E c1236e = this.f10546s;
        c0573m.f7216z = c1236e.f10402x;
        c0573m.f7197A = c1236e.f10403y;
        c0573m.f7215y = l0.c.U(this.f9836j);
        ((C1314v) AbstractC1239H.a(c1236e)).getSnapshotObserver().a(this, C1247e.f10567m, new Y0(2, cVar));
        C1262u c1262u = this.f10540H;
        if (c1262u == null) {
            c1262u = new C1262u();
            this.f10540H = c1262u;
        }
        c1262u.f10628a = c0573m.f7200i;
        c1262u.f10629b = c0573m.f7201j;
        c1262u.f10630c = c0573m.f7203l;
        c1262u.f10631d = c0573m.f7204m;
        c1262u.f10632e = c0573m.q;
        c1262u.f10633f = c0573m.f7208r;
        c1262u.f10634g = c0573m.f7209s;
        c1262u.f10635h = c0573m.f7210t;
        c1262u.f10636i = c0573m.f7211u;
        e0Var.a(c0573m);
        this.f10551x = c0573m.f7213w;
        this.f10536B = c0573m.f7202k;
        if (!z3 || (f0Var = c1236e.f10395p) == null) {
            return;
        }
        ((C1314v) f0Var).y(c1236e);
    }

    @Override // r0.InterfaceC1129r
    public final void r(float[] fArr) {
        f0 a3 = AbstractC1239H.a(this.f10546s);
        o1(l1(AbstractC1108W.g(this)), fArr);
        C1314v c1314v = (C1314v) a3;
        c1314v.C();
        C0565E.g(fArr, c1314v.f11181S);
        float d3 = b0.c.d(c1314v.f11185W);
        float e3 = b0.c.e(c1314v.f11185W);
        float[] fArr2 = c1314v.f11180R;
        C0565E.d(fArr2);
        C0565E.h(d3, e3, 0.0f, fArr2);
        u0.N.z(fArr, fArr2);
    }

    @Override // O0.b
    public final float s() {
        return this.f10546s.f10402x.s();
    }

    @Override // r0.InterfaceC1129r
    public final InterfaceC1129r t() {
        if (T0().f5869t) {
            c1();
            return ((Z) this.f10546s.f10378C.f4242d).f10549v;
        }
        AbstractC0946A.r("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // t0.N
    public final N y0() {
        return this.f10548u;
    }

    @Override // r0.InterfaceC1129r
    public final void z(InterfaceC1129r interfaceC1129r, float[] fArr) {
        Z l12 = l1(interfaceC1129r);
        l12.c1();
        Z P02 = P0(l12);
        C0565E.d(fArr);
        l12.o1(P02, fArr);
        n1(P02, fArr);
    }

    @Override // t0.N
    public final InterfaceC1129r z0() {
        return this;
    }
}
