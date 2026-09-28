package t0;

import J.C0274k0;
import J.C0292u;
import J.C0296w;
import J.InterfaceC0271j;
import J.InterfaceC0298x;
import android.os.Trace;
import c0.C0573M;
import c0.InterfaceC0600s;
import f0.C0663b;
import java.util.List;
import m.AbstractC0837j;
import n1.C0944e;
import n2.AbstractC0946A;
import r0.C1090D;
import r0.InterfaceC1094H;
import u0.C1314v;
import u0.V0;

/* renamed from: t0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1236E implements InterfaceC0271j, g0, InterfaceC1253k {

    /* renamed from: N, reason: collision with root package name */
    public static final C1233B f10373N = new C1233B("Undefined intrinsics block and it is required");

    /* renamed from: O, reason: collision with root package name */
    public static final C1232A f10374O = new C1232A();

    /* renamed from: P, reason: collision with root package name */
    public static final D0.r f10375P = new D0.r(3);

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC0298x f10376A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f10377B;

    /* renamed from: C, reason: collision with root package name */
    public final C0292u f10378C;

    /* renamed from: D, reason: collision with root package name */
    public final L f10379D;
    public C1090D E;
    public Z F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f10380G;

    /* renamed from: H, reason: collision with root package name */
    public V.o f10381H;

    /* renamed from: I, reason: collision with root package name */
    public V.o f10382I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f10383J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f10384K;

    /* renamed from: L, reason: collision with root package name */
    public int f10385L;

    /* renamed from: M, reason: collision with root package name */
    public int f10386M;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10387h;

    /* renamed from: i, reason: collision with root package name */
    public int f10388i;

    /* renamed from: j, reason: collision with root package name */
    public C1236E f10389j;

    /* renamed from: k, reason: collision with root package name */
    public int f10390k;

    /* renamed from: l, reason: collision with root package name */
    public final Q1.m f10391l;

    /* renamed from: m, reason: collision with root package name */
    public L.d f10392m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10393n;

    /* renamed from: o, reason: collision with root package name */
    public C1236E f10394o;

    /* renamed from: p, reason: collision with root package name */
    public f0 f10395p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10396r;

    /* renamed from: s, reason: collision with root package name */
    public A0.k f10397s;

    /* renamed from: t, reason: collision with root package name */
    public final L.d f10398t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10399u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1094H f10400v;

    /* renamed from: w, reason: collision with root package name */
    public K1.s f10401w;

    /* renamed from: x, reason: collision with root package name */
    public O0.b f10402x;

    /* renamed from: y, reason: collision with root package name */
    public O0.k f10403y;

    /* renamed from: z, reason: collision with root package name */
    public V0 f10404z;

    public C1236E(int i2, int i3, boolean z3) {
        this(A0.m.f63a.addAndGet(1), (i2 & 1) != 0 ? false : z3);
    }

    public static boolean M(C1236E c1236e) {
        C1242K c1242k = c1236e.f10379D.f10480r;
        return c1236e.L(c1242k.f10454p ? new O0.a(c1242k.f9837k) : null);
    }

    public static void S(C1236E c1236e, boolean z3, int i2) {
        C1236E s3;
        if ((i2 & 1) != 0) {
            z3 = false;
        }
        boolean z4 = (i2 & 2) != 0;
        boolean z5 = (i2 & 4) != 0;
        if (c1236e.f10389j == null) {
            AbstractC0946A.r("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        f0 f0Var = c1236e.f10395p;
        if (f0Var == null || c1236e.f10396r || c1236e.f10387h) {
            return;
        }
        ((C1314v) f0Var).z(c1236e, true, z3, z4);
        if (z5) {
            C1241J c1241j = c1236e.f10379D.f10481s;
            z2.h.c(c1241j);
            L l3 = c1241j.F;
            C1236E s4 = l3.f10464a.s();
            int i3 = l3.f10464a.f10385L;
            if (s4 == null || i3 == 3) {
                return;
            }
            while (s4.f10385L == i3 && (s3 = s4.s()) != null) {
                s4 = s3;
            }
            int d3 = AbstractC0837j.d(i3);
            if (d3 == 0) {
                if (s4.f10389j != null) {
                    S(s4, z3, 6);
                    return;
                } else {
                    U(s4, z3, 6);
                    return;
                }
            }
            if (d3 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            if (s4.f10389j != null) {
                s4.Q(z3);
            } else {
                s4.T(z3);
            }
        }
    }

    public static void U(C1236E c1236e, boolean z3, int i2) {
        f0 f0Var;
        C1236E s3;
        if ((i2 & 1) != 0) {
            z3 = false;
        }
        boolean z4 = (i2 & 2) != 0;
        boolean z5 = (i2 & 4) != 0;
        if (c1236e.f10396r || c1236e.f10387h || (f0Var = c1236e.f10395p) == null) {
            return;
        }
        ((C1314v) f0Var).z(c1236e, false, z3, z4);
        if (z5) {
            L l3 = c1236e.f10379D.f10480r.f10450O;
            C1236E s4 = l3.f10464a.s();
            int i3 = l3.f10464a.f10385L;
            if (s4 == null || i3 == 3) {
                return;
            }
            while (s4.f10385L == i3 && (s3 = s4.s()) != null) {
                s4 = s3;
            }
            int d3 = AbstractC0837j.d(i3);
            if (d3 == 0) {
                U(s4, z3, 6);
            } else {
                if (d3 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                s4.T(z3);
            }
        }
    }

    public static void V(C1236E c1236e) {
        int i2 = AbstractC1235D.f10372a[AbstractC0837j.d(c1236e.f10379D.f10466c)];
        L l3 = c1236e.f10379D;
        if (i2 != 1) {
            throw new IllegalStateException("Unexpected state ".concat(AbstractC1265x.g(l3.f10466c)));
        }
        if (l3.f10470g) {
            S(c1236e, true, 6);
            return;
        }
        if (l3.f10471h) {
            c1236e.Q(true);
        }
        if (l3.f10467d) {
            U(c1236e, true, 6);
        } else if (l3.f10468e) {
            c1236e.T(true);
        }
    }

    public final void A() {
        if (this.f10389j != null) {
            S(this, false, 7);
        } else {
            U(this, false, 7);
        }
    }

    public final void B() {
        this.f10397s = null;
        ((C1314v) AbstractC1239H.a(this)).B();
    }

    public final void C() {
        C1236E c1236e;
        if (this.f10390k > 0) {
            this.f10393n = true;
        }
        if (!this.f10387h || (c1236e = this.f10394o) == null) {
            return;
        }
        c1236e.C();
    }

    public final boolean D() {
        return this.f10395p != null;
    }

    public final boolean E() {
        return this.f10379D.f10480r.f10463z;
    }

    public final Boolean F() {
        C1241J c1241j = this.f10379D.f10481s;
        if (c1241j != null) {
            return Boolean.valueOf(c1241j.f10435x);
        }
        return null;
    }

    public final void G() {
        C1236E s3;
        if (this.f10385L == 3) {
            g();
        }
        C1241J c1241j = this.f10379D.f10481s;
        z2.h.c(c1241j);
        try {
            c1241j.f10425m = true;
            if (!c1241j.f10429r) {
                AbstractC0946A.r("replace() called on item that was not placed");
                throw null;
            }
            c1241j.E = false;
            boolean z3 = c1241j.f10435x;
            c1241j.B0(c1241j.f10432u, c1241j.f10433v, c1241j.f10434w);
            if (z3 && !c1241j.E && (s3 = c1241j.F.f10464a.s()) != null) {
                s3.Q(false);
            }
        } finally {
            c1241j.f10425m = false;
        }
    }

    public final void H(int i2, int i3, int i4) {
        if (i2 == i3) {
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i2 > i3 ? i2 + i5 : i2;
            int i7 = i2 > i3 ? i3 + i5 : (i3 + i4) - 2;
            Q1.m mVar = this.f10391l;
            Object n3 = ((L.d) mVar.f5302a).n(i6);
            y2.a aVar = (y2.a) mVar.f5303b;
            aVar.c();
            ((L.d) mVar.f5302a).a(i7, (C1236E) n3);
            aVar.c();
        }
        K();
        C();
        A();
    }

    public final void I(C1236E c1236e) {
        if (c1236e.f10379D.f10477n > 0) {
            this.f10379D.b(r0.f10477n - 1);
        }
        if (this.f10395p != null) {
            c1236e.i();
        }
        c1236e.f10394o = null;
        ((Z) c1236e.f10378C.f4242d).f10549v = null;
        if (c1236e.f10387h) {
            this.f10390k--;
            L.d dVar = (L.d) c1236e.f10391l.f5302a;
            int i2 = dVar.f4620j;
            if (i2 > 0) {
                Object[] objArr = dVar.f4618h;
                int i3 = 0;
                do {
                    ((Z) ((C1236E) objArr[i3]).f10378C.f4242d).f10549v = null;
                    i3++;
                } while (i3 < i2);
            }
        }
        C();
        K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [V.n] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [V.n] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void J() {
        V.n nVar;
        C0292u c0292u = this.f10378C;
        C1261t c1261t = (C1261t) c0292u.f4241c;
        boolean h2 = a0.h(128);
        if (h2) {
            nVar = c1261t.f10626S;
        } else {
            nVar = c1261t.f10626S.f5862l;
            if (nVar == null) {
                return;
            }
        }
        C0573M c0573m = Z.f10530N;
        for (V.n V02 = c1261t.V0(h2); V02 != null && (V02.f5861k & 128) != 0; V02 = V02.f5863m) {
            if ((V02.f5860j & 128) != 0) {
                AbstractC1256n abstractC1256n = V02;
                ?? r7 = 0;
                while (abstractC1256n != 0) {
                    if (abstractC1256n instanceof InterfaceC1263v) {
                        ((InterfaceC1263v) abstractC1256n).b0((C1261t) c0292u.f4241c);
                    } else if ((abstractC1256n.f5860j & 128) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                        V.n nVar2 = abstractC1256n.f10608v;
                        int i2 = 0;
                        abstractC1256n = abstractC1256n;
                        r7 = r7;
                        while (nVar2 != null) {
                            if ((nVar2.f5860j & 128) != 0) {
                                i2++;
                                r7 = r7;
                                if (i2 == 1) {
                                    abstractC1256n = nVar2;
                                } else {
                                    if (r7 == 0) {
                                        r7 = new L.d(new V.n[16]);
                                    }
                                    if (abstractC1256n != 0) {
                                        r7.b(abstractC1256n);
                                        abstractC1256n = 0;
                                    }
                                    r7.b(nVar2);
                                }
                            }
                            nVar2 = nVar2.f5863m;
                            abstractC1256n = abstractC1256n;
                            r7 = r7;
                        }
                        if (i2 == 1) {
                        }
                    }
                    abstractC1256n = AbstractC1248f.f(r7);
                }
            }
            if (V02 == nVar) {
                return;
            }
        }
    }

    public final void K() {
        if (!this.f10387h) {
            this.f10399u = true;
            return;
        }
        C1236E s3 = s();
        if (s3 != null) {
            s3.K();
        }
    }

    public final boolean L(O0.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f10385L == 3) {
            f();
        }
        return this.f10379D.f10480r.E0(aVar.f5132a);
    }

    public final void N() {
        Q1.m mVar = this.f10391l;
        int i2 = ((L.d) mVar.f5302a).f4620j;
        while (true) {
            i2--;
            L.d dVar = (L.d) mVar.f5302a;
            if (-1 >= i2) {
                dVar.g();
                ((y2.a) mVar.f5303b).c();
                return;
            }
            I((C1236E) dVar.f4618h[i2]);
        }
    }

    public final void O(int i2, int i3) {
        if (i3 < 0) {
            AbstractC0946A.q("count (" + i3 + ") must be greater than 0");
            throw null;
        }
        int i4 = (i3 + i2) - 1;
        if (i2 > i4) {
            return;
        }
        while (true) {
            Q1.m mVar = this.f10391l;
            I((C1236E) ((L.d) mVar.f5302a).f4618h[i4]);
            Object n3 = ((L.d) mVar.f5302a).n(i4);
            ((y2.a) mVar.f5303b).c();
            if (i4 == i2) {
                return;
            } else {
                i4--;
            }
        }
    }

    public final void P() {
        C1236E s3;
        if (this.f10385L == 3) {
            g();
        }
        C1242K c1242k = this.f10379D.f10480r;
        c1242k.getClass();
        try {
            c1242k.f10451m = true;
            if (!c1242k.q) {
                AbstractC0946A.r("replace called on unplaced item");
                throw null;
            }
            boolean z3 = c1242k.f10463z;
            c1242k.C0(c1242k.f10457t, c1242k.f10460w, c1242k.f10458u, c1242k.f10459v);
            if (z3 && !c1242k.f10443H && (s3 = c1242k.f10450O.f10464a.s()) != null) {
                s3.T(false);
            }
        } finally {
            c1242k.f10451m = false;
        }
    }

    public final void Q(boolean z3) {
        f0 f0Var;
        if (this.f10387h || (f0Var = this.f10395p) == null) {
            return;
        }
        ((C1314v) f0Var).A(this, true, z3);
    }

    @Override // t0.g0
    public final boolean R() {
        return D();
    }

    public final void T(boolean z3) {
        f0 f0Var;
        if (this.f10387h || (f0Var = this.f10395p) == null) {
            return;
        }
        ((C1314v) f0Var).A(this, false, z3);
    }

    public final void W() {
        L.d v3 = v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e = (C1236E) objArr[i3];
                int i4 = c1236e.f10386M;
                c1236e.f10385L = i4;
                if (i4 != 3) {
                    c1236e.W();
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void X(O0.b bVar) {
        if (z2.h.a(this.f10402x, bVar)) {
            return;
        }
        this.f10402x = bVar;
        A();
        C1236E s3 = s();
        if (s3 != null) {
            s3.y();
        }
        z();
        for (V.n nVar = (V.n) this.f10378C.f4244f; nVar != null; nVar = nVar.f5863m) {
            if ((nVar.f5860j & 16) != 0) {
                ((k0) nVar).n();
            } else if (nVar instanceof Z.b) {
                ((Z.b) nVar).K0();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [V.n] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void Y(O0.k kVar) {
        if (this.f10403y != kVar) {
            this.f10403y = kVar;
            A();
            C1236E s3 = s();
            if (s3 != null) {
                s3.y();
            }
            z();
            V.n nVar = (V.n) this.f10378C.f4244f;
            if ((nVar.f5861k & 4) != 0) {
                while (nVar != null) {
                    if ((nVar.f5860j & 4) != 0) {
                        AbstractC1256n abstractC1256n = nVar;
                        ?? r22 = 0;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof InterfaceC1257o) {
                                InterfaceC1257o interfaceC1257o = (InterfaceC1257o) abstractC1256n;
                                if (interfaceC1257o instanceof Z.b) {
                                    ((Z.b) interfaceC1257o).K0();
                                }
                            } else if ((abstractC1256n.f5860j & 4) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                V.n nVar2 = abstractC1256n.f10608v;
                                int i2 = 0;
                                abstractC1256n = abstractC1256n;
                                r22 = r22;
                                while (nVar2 != null) {
                                    if ((nVar2.f5860j & 4) != 0) {
                                        i2++;
                                        r22 = r22;
                                        if (i2 == 1) {
                                            abstractC1256n = nVar2;
                                        } else {
                                            if (r22 == 0) {
                                                r22 = new L.d(new V.n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r22.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r22.b(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r22 = r22;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1256n = AbstractC1248f.f(r22);
                        }
                    }
                    if ((nVar.f5861k & 4) == 0) {
                        return;
                    } else {
                        nVar = nVar.f5863m;
                    }
                }
            }
        }
    }

    public final void Z(C1236E c1236e) {
        if (z2.h.a(c1236e, this.f10389j)) {
            return;
        }
        this.f10389j = c1236e;
        if (c1236e != null) {
            L l3 = this.f10379D;
            if (l3.f10481s == null) {
                l3.f10481s = new C1241J(l3);
            }
            C0292u c0292u = this.f10378C;
            Z z3 = ((C1261t) c0292u.f4241c).f10548u;
            for (Z z4 = (Z) c0292u.f4242d; !z2.h.a(z4, z3) && z4 != null; z4 = z4.f10548u) {
                z4.O0();
            }
        }
        A();
    }

    @Override // J.InterfaceC0271j
    public final void a() {
        C1090D c1090d = this.E;
        if (c1090d != null) {
            c1090d.f(true);
        }
        this.f10384K = true;
        C0292u c0292u = this.f10378C;
        for (V.n nVar = (n0) c0292u.f4243e; nVar != null; nVar = nVar.f5862l) {
            if (nVar.f5869t) {
                nVar.F0();
            }
        }
        V.n nVar2 = (n0) c0292u.f4243e;
        for (V.n nVar3 = nVar2; nVar3 != null; nVar3 = nVar3.f5862l) {
            if (nVar3.f5869t) {
                nVar3.H0();
            }
        }
        while (nVar2 != null) {
            if (nVar2.f5869t) {
                nVar2.B0();
            }
            nVar2 = nVar2.f5862l;
        }
        if (D()) {
            B();
        }
    }

    public final void a0(InterfaceC1094H interfaceC1094H) {
        if (z2.h.a(this.f10400v, interfaceC1094H)) {
            return;
        }
        this.f10400v = interfaceC1094H;
        K1.s sVar = this.f10401w;
        if (sVar != null) {
            ((C0274k0) sVar.f4604i).setValue(interfaceC1094H);
        }
        A();
    }

    @Override // J.InterfaceC0271j
    public final void b() {
        if (!D()) {
            AbstractC0946A.q("onReuse is only expected on attached node");
            throw null;
        }
        C1090D c1090d = this.E;
        if (c1090d != null) {
            c1090d.f(false);
        }
        boolean z3 = this.f10384K;
        C0292u c0292u = this.f10378C;
        if (z3) {
            this.f10384K = false;
            B();
        } else {
            for (V.n nVar = (n0) c0292u.f4243e; nVar != null; nVar = nVar.f5862l) {
                if (nVar.f5869t) {
                    nVar.F0();
                }
            }
            V.n nVar2 = (n0) c0292u.f4243e;
            for (V.n nVar3 = nVar2; nVar3 != null; nVar3 = nVar3.f5862l) {
                if (nVar3.f5869t) {
                    nVar3.H0();
                }
            }
            while (nVar2 != null) {
                if (nVar2.f5869t) {
                    nVar2.B0();
                }
                nVar2 = nVar2.f5862l;
            }
        }
        this.f10388i = A0.m.f63a.addAndGet(1);
        for (V.n nVar4 = (V.n) c0292u.f4244f; nVar4 != null; nVar4 = nVar4.f5863m) {
            nVar4.A0();
        }
        c0292u.i();
        V(this);
    }

    public final void b0(V.o oVar) {
        if (!(!this.f10387h || this.f10381H == V.l.f5857b)) {
            AbstractC0946A.q("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (!(!this.f10384K)) {
            AbstractC0946A.q("modifier is updated when deactivated");
            throw null;
        }
        if (D()) {
            d(oVar);
        } else {
            this.f10382I = oVar;
        }
    }

    @Override // J.InterfaceC0271j
    public final void c() {
        C1090D c1090d = this.E;
        if (c1090d != null) {
            c1090d.c();
        }
        C0292u c0292u = this.f10378C;
        Z z3 = ((C1261t) c0292u.f4241c).f10548u;
        for (Z z4 = (Z) c0292u.f4242d; !z2.h.a(z4, z3) && z4 != null; z4 = z4.f10548u) {
            z4.f10550w = true;
            z4.f10542J.c();
            if (z4.f10544L != null) {
                if (z4.f10545M != null) {
                    z4.f10545M = null;
                }
                z4.p1(null, false);
                z4.f10546s.T(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [V.n] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void c0(V0 v0) {
        if (z2.h.a(this.f10404z, v0)) {
            return;
        }
        this.f10404z = v0;
        V.n nVar = (V.n) this.f10378C.f4244f;
        if ((nVar.f5861k & 16) != 0) {
            while (nVar != null) {
                if ((nVar.f5860j & 16) != 0) {
                    AbstractC1256n abstractC1256n = nVar;
                    ?? r3 = 0;
                    while (abstractC1256n != 0) {
                        if (abstractC1256n instanceof k0) {
                            ((k0) abstractC1256n).N();
                        } else if ((abstractC1256n.f5860j & 16) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                            V.n nVar2 = abstractC1256n.f10608v;
                            int i2 = 0;
                            abstractC1256n = abstractC1256n;
                            r3 = r3;
                            while (nVar2 != null) {
                                if ((nVar2.f5860j & 16) != 0) {
                                    i2++;
                                    r3 = r3;
                                    if (i2 == 1) {
                                        abstractC1256n = nVar2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new L.d(new V.n[16]);
                                        }
                                        if (abstractC1256n != 0) {
                                            r3.b(abstractC1256n);
                                            abstractC1256n = 0;
                                        }
                                        r3.b(nVar2);
                                    }
                                }
                                nVar2 = nVar2.f5863m;
                                abstractC1256n = abstractC1256n;
                                r3 = r3;
                            }
                            if (i2 == 1) {
                            }
                        }
                        abstractC1256n = AbstractC1248f.f(r3);
                    }
                }
                if ((nVar.f5861k & 16) == 0) {
                    return;
                } else {
                    nVar = nVar.f5863m;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b9, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        if (r3 >= r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        if (r8 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        if (r4 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
    
        if (r5.f10382I == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r6.j(r3, r8, r9, r4, r0 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        n2.AbstractC0946A.s("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
    
        n2.AbstractC0946A.s("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00df, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Type inference failed for: r1v14, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [J.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(V.o r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1236E.d(V.o):void");
    }

    public final void d0() {
        if (this.f10390k <= 0 || !this.f10393n) {
            return;
        }
        int i2 = 0;
        this.f10393n = false;
        L.d dVar = this.f10392m;
        if (dVar == null) {
            dVar = new L.d(new C1236E[16]);
            this.f10392m = dVar;
        }
        dVar.g();
        L.d dVar2 = (L.d) this.f10391l.f5302a;
        int i3 = dVar2.f4620j;
        if (i3 > 0) {
            Object[] objArr = dVar2.f4618h;
            do {
                C1236E c1236e = (C1236E) objArr[i2];
                if (c1236e.f10387h) {
                    dVar.c(dVar.f4620j, c1236e.v());
                } else {
                    dVar.b(c1236e);
                }
                i2++;
            } while (i2 < i3);
        }
        L l3 = this.f10379D;
        l3.f10480r.f10441D = true;
        C1241J c1241j = l3.f10481s;
        if (c1241j != null) {
            c1241j.f10421A = true;
        }
    }

    public final void e(f0 f0Var) {
        C1236E c1236e;
        if (!(this.f10395p == null)) {
            AbstractC0946A.r("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
            throw null;
        }
        C1236E c1236e2 = this.f10394o;
        if (c1236e2 != null && !z2.h.a(c1236e2.f10395p, f0Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(f0Var);
            sb.append(") than the parent's owner(");
            C1236E s3 = s();
            sb.append(s3 != null ? s3.f10395p : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            C1236E c1236e3 = this.f10394o;
            sb.append(c1236e3 != null ? c1236e3.h(0) : null);
            AbstractC0946A.r(sb.toString());
            throw null;
        }
        C1236E s4 = s();
        L l3 = this.f10379D;
        if (s4 == null) {
            l3.f10480r.f10463z = true;
            C1241J c1241j = l3.f10481s;
            if (c1241j != null) {
                c1241j.f10435x = true;
            }
        }
        C0292u c0292u = this.f10378C;
        ((Z) c0292u.f4242d).f10549v = s4 != null ? (C1261t) s4.f10378C.f4241c : null;
        this.f10395p = f0Var;
        this.q = (s4 != null ? s4.q : -1) + 1;
        V.o oVar = this.f10382I;
        if (oVar != null) {
            d(oVar);
        }
        this.f10382I = null;
        if (c0292u.f(8)) {
            B();
        }
        f0Var.getClass();
        C1236E c1236e4 = this.f10394o;
        if (c1236e4 == null || (c1236e = c1236e4.f10389j) == null) {
            c1236e = this.f10389j;
        }
        Z(c1236e);
        if (this.f10389j == null && c0292u.f(512)) {
            Z(this);
        }
        if (!this.f10384K) {
            for (V.n nVar = (V.n) c0292u.f4244f; nVar != null; nVar = nVar.f5863m) {
                nVar.A0();
            }
        }
        L.d dVar = (L.d) this.f10391l.f5302a;
        int i2 = dVar.f4620j;
        if (i2 > 0) {
            Object[] objArr = dVar.f4618h;
            int i3 = 0;
            do {
                ((C1236E) objArr[i3]).e(f0Var);
                i3++;
            } while (i3 < i2);
        }
        if (!this.f10384K) {
            c0292u.i();
        }
        A();
        if (s4 != null) {
            s4.A();
        }
        Z z3 = ((C1261t) c0292u.f4241c).f10548u;
        for (Z z4 = (Z) c0292u.f4242d; !z2.h.a(z4, z3) && z4 != null; z4 = z4.f10548u) {
            z4.p1(z4.f10552y, true);
            e0 e0Var = z4.f10544L;
            if (e0Var != null) {
                e0Var.invalidate();
            }
        }
        l3.h();
        if (this.f10384K) {
            return;
        }
        V.n nVar2 = (V.n) c0292u.f4244f;
        if ((nVar2.f5861k & 7168) != 0) {
            while (nVar2 != null) {
                int i4 = nVar2.f5860j;
                if (((i4 & 4096) != 0) | ((i4 & 1024) != 0) | ((i4 & 2048) != 0)) {
                    a0.a(nVar2);
                }
                nVar2 = nVar2.f5863m;
            }
        }
    }

    public final void f() {
        this.f10386M = this.f10385L;
        this.f10385L = 3;
        L.d v3 = v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e = (C1236E) objArr[i3];
                if (c1236e.f10385L != 3) {
                    c1236e.f();
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final void g() {
        this.f10386M = this.f10385L;
        this.f10385L = 3;
        L.d v3 = v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e = (C1236E) objArr[i3];
                if (c1236e.f10385L == 2) {
                    c1236e.g();
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final String h(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        L.d v3 = v();
        int i4 = v3.f4620j;
        if (i4 > 0) {
            Object[] objArr = v3.f4618h;
            int i5 = 0;
            do {
                sb.append(((C1236E) objArr[i5]).h(i2 + 1));
                i5++;
            } while (i5 < i4);
        }
        String sb2 = sb.toString();
        if (i2 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        z2.h.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void i() {
        C1237F c1237f;
        f0 f0Var = this.f10395p;
        if (f0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            C1236E s3 = s();
            sb.append(s3 != null ? s3.h(0) : null);
            AbstractC0946A.s(sb.toString());
            throw null;
        }
        C1236E s4 = s();
        L l3 = this.f10379D;
        if (s4 != null) {
            s4.y();
            s4.A();
            l3.f10480r.f10455r = 3;
            C1241J c1241j = l3.f10481s;
            if (c1241j != null) {
                c1241j.f10428p = 3;
            }
        }
        C1237F c1237f2 = l3.f10480r.f10439B;
        c1237f2.f10406b = true;
        c1237f2.f10407c = false;
        c1237f2.f10409e = false;
        c1237f2.f10408d = false;
        c1237f2.f10410f = false;
        c1237f2.f10411g = false;
        c1237f2.f10412h = null;
        C1241J c1241j2 = l3.f10481s;
        if (c1241j2 != null && (c1237f = c1241j2.f10436y) != null) {
            c1237f.f10406b = true;
            c1237f.f10407c = false;
            c1237f.f10409e = false;
            c1237f.f10408d = false;
            c1237f.f10410f = false;
            c1237f.f10411g = false;
            c1237f.f10412h = null;
        }
        C0292u c0292u = this.f10378C;
        if (c0292u.f(8)) {
            B();
        }
        V.n nVar = (n0) c0292u.f4243e;
        for (V.n nVar2 = nVar; nVar2 != null; nVar2 = nVar2.f5862l) {
            if (nVar2.f5869t) {
                nVar2.H0();
            }
        }
        this.f10396r = true;
        L.d dVar = (L.d) this.f10391l.f5302a;
        int i2 = dVar.f4620j;
        if (i2 > 0) {
            Object[] objArr = dVar.f4618h;
            int i3 = 0;
            do {
                ((C1236E) objArr[i3]).i();
                i3++;
            } while (i3 < i2);
        }
        this.f10396r = false;
        while (nVar != null) {
            if (nVar.f5869t) {
                nVar.B0();
            }
            nVar = nVar.f5862l;
        }
        C1314v c1314v = (C1314v) f0Var;
        Q q = c1314v.f11176N;
        K1.l lVar = q.f10500b;
        ((D.S) lVar.f4556b).j(this);
        ((D.S) lVar.f4557c).j(this);
        ((L.d) q.f10503e.f239c).m(this);
        c1314v.F = true;
        this.f10395p = null;
        Z(null);
        this.q = 0;
        C1242K c1242k = l3.f10480r;
        c1242k.f10453o = Integer.MAX_VALUE;
        c1242k.f10452n = Integer.MAX_VALUE;
        c1242k.f10463z = false;
        C1241J c1241j3 = l3.f10481s;
        if (c1241j3 != null) {
            c1241j3.f10427o = Integer.MAX_VALUE;
            c1241j3.f10426n = Integer.MAX_VALUE;
            c1241j3.f10435x = false;
        }
    }

    public final void j(InterfaceC0600s interfaceC0600s, C0663b c0663b) {
        ((Z) this.f10378C.f4242d).L0(interfaceC0600s, c0663b);
    }

    public final void k() {
        if (this.f10389j != null) {
            S(this, false, 5);
        } else {
            U(this, false, 5);
        }
        C1242K c1242k = this.f10379D.f10480r;
        O0.a aVar = c1242k.f10454p ? new O0.a(c1242k.f9837k) : null;
        if (aVar != null) {
            f0 f0Var = this.f10395p;
            if (f0Var != null) {
                ((C1314v) f0Var).u(this, aVar.f5132a);
                return;
            }
            return;
        }
        f0 f0Var2 = this.f10395p;
        if (f0Var2 != null) {
            ((C1314v) f0Var2).t(true);
        }
    }

    public final List l() {
        C1241J c1241j = this.f10379D.f10481s;
        z2.h.c(c1241j);
        L l3 = c1241j.F;
        l3.f10464a.n();
        boolean z3 = c1241j.f10421A;
        L.d dVar = c1241j.f10437z;
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
                    C1241J c1241j2 = c1236e2.f10379D.f10481s;
                    z2.h.c(c1241j2);
                    dVar.b(c1241j2);
                } else {
                    C1241J c1241j3 = c1236e2.f10379D.f10481s;
                    z2.h.c(c1241j3);
                    Object[] objArr2 = dVar.f4618h;
                    Object obj = objArr2[i3];
                    objArr2[i3] = c1241j3;
                }
                i3++;
            } while (i3 < i2);
        }
        dVar.o(c1236e.n().size(), dVar.f4620j);
        c1241j.f10421A = false;
        return dVar.f();
    }

    public final List m() {
        return this.f10379D.f10480r.s0();
    }

    public final List n() {
        return v().f();
    }

    public final A0.k o() {
        Trace.beginSection("collapseSemantics");
        try {
            if (this.f10378C.f(8) && this.f10397s == null) {
                z2.s sVar = new z2.s();
                sVar.f11909h = new A0.k();
                h0 snapshotObserver = ((C1314v) AbstractC1239H.a(this)).getSnapshotObserver();
                snapshotObserver.a(this, snapshotObserver.f10588d, new D.c0(this, 11, sVar));
                Object obj = sVar.f11909h;
                this.f10397s = (A0.k) obj;
                return (A0.k) obj;
            }
            return this.f10397s;
        } finally {
            Trace.endSection();
        }
    }

    public final List p() {
        return ((L.d) this.f10391l.f5302a).f();
    }

    public final int q() {
        int i2;
        C1241J c1241j = this.f10379D.f10481s;
        if (c1241j == null || (i2 = c1241j.f10428p) == 0) {
            return 3;
        }
        return i2;
    }

    public final K1.s r() {
        K1.s sVar = this.f10401w;
        if (sVar != null) {
            return sVar;
        }
        K1.s sVar2 = new K1.s(this, this.f10400v);
        this.f10401w = sVar2;
        return sVar2;
    }

    public final C1236E s() {
        C1236E c1236e = this.f10394o;
        while (c1236e != null && c1236e.f10387h) {
            c1236e = c1236e.f10394o;
        }
        return c1236e;
    }

    public final int t() {
        return this.f10379D.f10480r.f10453o;
    }

    public final String toString() {
        return u0.N.B(this) + " children: " + n().size() + " measurePolicy: " + this.f10400v;
    }

    public final L.d u() {
        boolean z3 = this.f10399u;
        L.d dVar = this.f10398t;
        if (z3) {
            dVar.g();
            dVar.c(dVar.f4620j, v());
            dVar.p(f10375P);
            this.f10399u = false;
        }
        return dVar;
    }

    public final L.d v() {
        d0();
        if (this.f10390k == 0) {
            return (L.d) this.f10391l.f5302a;
        }
        L.d dVar = this.f10392m;
        z2.h.c(dVar);
        return dVar;
    }

    public final void w(long j3, r rVar, boolean z3, boolean z4) {
        C0292u c0292u = this.f10378C;
        Z z5 = (Z) c0292u.f4242d;
        C0573M c0573m = Z.f10530N;
        ((Z) c0292u.f4242d).X0(Z.f10533Q, z5.Q0(j3, true), rVar, z3, z4);
    }

    public final void x(int i2, C1236E c1236e) {
        if (!(c1236e.f10394o == null)) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(c1236e);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(h(0));
            sb.append(" Other tree: ");
            C1236E c1236e2 = c1236e.f10394o;
            sb.append(c1236e2 != null ? c1236e2.h(0) : null);
            AbstractC0946A.r(sb.toString());
            throw null;
        }
        if (c1236e.f10395p != null) {
            AbstractC0946A.r("Cannot insert " + c1236e + " because it already has an owner. This tree: " + h(0) + " Other tree: " + c1236e.h(0));
            throw null;
        }
        c1236e.f10394o = this;
        Q1.m mVar = this.f10391l;
        ((L.d) mVar.f5302a).a(i2, c1236e);
        ((y2.a) mVar.f5303b).c();
        K();
        if (c1236e.f10387h) {
            this.f10390k++;
        }
        C();
        f0 f0Var = this.f10395p;
        if (f0Var != null) {
            c1236e.e(f0Var);
        }
        if (c1236e.f10379D.f10477n > 0) {
            L l3 = this.f10379D;
            l3.b(l3.f10477n + 1);
        }
    }

    public final void y() {
        if (this.f10380G) {
            C0292u c0292u = this.f10378C;
            Z z3 = (C1261t) c0292u.f4241c;
            Z z4 = ((Z) c0292u.f4242d).f10549v;
            this.F = null;
            while (true) {
                if (z2.h.a(z3, z4)) {
                    break;
                }
                if ((z3 != null ? z3.f10544L : null) != null) {
                    this.F = z3;
                    break;
                }
                z3 = z3 != null ? z3.f10549v : null;
            }
        }
        Z z5 = this.F;
        if (z5 != null && z5.f10544L == null) {
            AbstractC0946A.s("layer was not set");
            throw null;
        }
        if (z5 != null) {
            z5.Z0();
            return;
        }
        C1236E s3 = s();
        if (s3 != null) {
            s3.y();
        }
    }

    public final void z() {
        C0292u c0292u = this.f10378C;
        Z z3 = (Z) c0292u.f4242d;
        C1261t c1261t = (C1261t) c0292u.f4241c;
        while (z3 != c1261t) {
            z2.h.d(z3, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C1267z c1267z = (C1267z) z3;
            e0 e0Var = c1267z.f10544L;
            if (e0Var != null) {
                e0Var.invalidate();
            }
            z3 = c1267z.f10548u;
        }
        e0 e0Var2 = ((C1261t) c0292u.f4241c).f10544L;
        if (e0Var2 != null) {
            e0Var2.invalidate();
        }
    }

    public C1236E(int i2, boolean z3) {
        this.f10387h = z3;
        this.f10388i = i2;
        this.f10391l = new Q1.m(new L.d(new C1236E[16]), new C0944e(7, this));
        this.f10398t = new L.d(new C1236E[16]);
        this.f10399u = true;
        this.f10400v = f10373N;
        this.f10402x = AbstractC1239H.f10417a;
        this.f10403y = O0.k.f5148h;
        this.f10404z = f10374O;
        InterfaceC0298x.f4281a.getClass();
        this.f10376A = C0296w.f4276b;
        this.f10385L = 3;
        this.f10386M = 3;
        this.f10378C = new C0292u(this);
        this.f10379D = new L(this);
        this.f10380G = true;
        this.f10381H = V.l.f5857b;
    }
}
