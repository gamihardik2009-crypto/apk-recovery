package p;

import n0.C0929h;
import r0.InterfaceC1129r;
import t0.AbstractC1248f;
import t0.InterfaceC1254l;
import t0.InterfaceC1263v;

/* renamed from: p.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027l extends V.n implements InterfaceC1263v, InterfaceC1254l {

    /* renamed from: A, reason: collision with root package name */
    public b0.d f9626A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9627B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9629D;

    /* renamed from: u, reason: collision with root package name */
    public X f9630u;

    /* renamed from: v, reason: collision with root package name */
    public final C0 f9631v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9632w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1013e f9633x;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC1129r f9635z;

    /* renamed from: y, reason: collision with root package name */
    public final C0929h f9634y = new C0929h(1);

    /* renamed from: C, reason: collision with root package name */
    public long f9628C = 0;

    public C1027l(X x2, C0 c02, boolean z3, InterfaceC1013e interfaceC1013e) {
        this.f9630u = x2;
        this.f9631v = c02;
        this.f9632w = z3;
        this.f9633x = interfaceC1013e;
    }

    public static final float K0(C1027l c1027l, InterfaceC1013e interfaceC1013e) {
        b0.d dVar;
        float a3;
        int compare;
        if (O0.j.a(c1027l.f9628C, 0L)) {
            return 0.0f;
        }
        L.d dVar2 = c1027l.f9634y.f8942a;
        int i2 = dVar2.f4620j;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = dVar2.f4618h;
            dVar = null;
            while (true) {
                b0.d dVar3 = (b0.d) ((C1021i) objArr[i3]).f9601a.c();
                if (dVar3 != null) {
                    long i4 = B1.C.i(dVar3.d(), dVar3.c());
                    long U3 = l0.c.U(c1027l.f9628C);
                    int ordinal = c1027l.f9630u.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(b0.f.b(i4), b0.f.b(U3));
                    } else {
                        if (ordinal != 1) {
                            throw new J2.r();
                        }
                        compare = Float.compare(b0.f.d(i4), b0.f.d(U3));
                    }
                    if (compare <= 0) {
                        dVar = dVar3;
                    } else if (dVar == null) {
                        dVar = dVar3;
                    }
                }
                i3--;
                if (i3 < 0) {
                    break;
                }
            }
        } else {
            dVar = null;
        }
        if (dVar == null) {
            b0.d L02 = c1027l.f9627B ? c1027l.L0() : null;
            if (L02 == null) {
                return 0.0f;
            }
            dVar = L02;
        }
        long U4 = l0.c.U(c1027l.f9628C);
        int ordinal2 = c1027l.f9630u.ordinal();
        if (ordinal2 == 0) {
            float f3 = dVar.f7063d;
            float f4 = dVar.f7061b;
            a3 = interfaceC1013e.a(f4, f3 - f4, b0.f.b(U4));
        } else {
            if (ordinal2 != 1) {
                throw new J2.r();
            }
            float f5 = dVar.f7062c;
            float f6 = dVar.f7060a;
            a3 = interfaceC1013e.a(f6, f5 - f6, b0.f.d(U4));
        }
        return a3;
    }

    @Override // t0.InterfaceC1263v
    public final void E(long j3) {
        int g3;
        b0.d L02;
        long j4 = this.f9628C;
        this.f9628C = j3;
        int ordinal = this.f9630u.ordinal();
        if (ordinal == 0) {
            g3 = z2.h.g((int) (j3 & 4294967295L), (int) (4294967295L & j4));
        } else {
            if (ordinal != 1) {
                throw new J2.r();
            }
            g3 = z2.h.g((int) (j3 >> 32), (int) (j4 >> 32));
        }
        if (g3 < 0 && (L02 = L0()) != null) {
            b0.d dVar = this.f9626A;
            if (dVar == null) {
                dVar = L02;
            }
            if (!this.f9629D && !this.f9627B && M0(dVar, j4) && !M0(L02, j3)) {
                this.f9627B = true;
                N0();
            }
            this.f9626A = L02;
        }
    }

    public final b0.d L0() {
        if (!this.f5869t) {
            return null;
        }
        t0.Z u3 = AbstractC1248f.u(this);
        InterfaceC1129r interfaceC1129r = this.f9635z;
        if (interfaceC1129r != null) {
            if (!interfaceC1129r.n()) {
                interfaceC1129r = null;
            }
            if (interfaceC1129r != null) {
                return u3.D(interfaceC1129r, false);
            }
        }
        return null;
    }

    public final boolean M0(b0.d dVar, long j3) {
        long O02 = O0(dVar, j3);
        return Math.abs(b0.c.d(O02)) <= 0.5f && Math.abs(b0.c.e(O02)) <= 0.5f;
    }

    public final void N0() {
        InterfaceC1013e interfaceC1013e = this.f9633x;
        if (interfaceC1013e == null) {
            interfaceC1013e = (InterfaceC1013e) AbstractC1248f.i(this, AbstractC1019h.f9599a);
        }
        if (!(!this.f9629D)) {
            throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
        }
        J2.B.r(y0(), null, 4, new C1025k(this, new e1(interfaceC1013e.b()), interfaceC1013e, null), 1);
    }

    public final long O0(b0.d dVar, long j3) {
        long U3 = l0.c.U(j3);
        int ordinal = this.f9630u.ordinal();
        if (ordinal == 0) {
            InterfaceC1013e interfaceC1013e = this.f9633x;
            if (interfaceC1013e == null) {
                interfaceC1013e = (InterfaceC1013e) AbstractC1248f.i(this, AbstractC1019h.f9599a);
            }
            float f3 = dVar.f7063d;
            float f4 = dVar.f7061b;
            return K1.f.e(0.0f, interfaceC1013e.a(f4, f3 - f4, b0.f.b(U3)));
        }
        if (ordinal != 1) {
            throw new J2.r();
        }
        InterfaceC1013e interfaceC1013e2 = this.f9633x;
        if (interfaceC1013e2 == null) {
            interfaceC1013e2 = (InterfaceC1013e) AbstractC1248f.i(this, AbstractC1019h.f9599a);
        }
        float f5 = dVar.f7062c;
        float f6 = dVar.f7060a;
        return K1.f.e(interfaceC1013e2.a(f6, f5 - f6, b0.f.d(U3)), 0.0f);
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
