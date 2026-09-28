package t0;

import n1.C0944e;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final C1236E f10464a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10465b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10467d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10468e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10469f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10470g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10471h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10472i;

    /* renamed from: j, reason: collision with root package name */
    public int f10473j;

    /* renamed from: k, reason: collision with root package name */
    public int f10474k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10475l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10476m;

    /* renamed from: n, reason: collision with root package name */
    public int f10477n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10478o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10479p;
    public int q;

    /* renamed from: s, reason: collision with root package name */
    public C1241J f10481s;

    /* renamed from: c, reason: collision with root package name */
    public int f10466c = 5;

    /* renamed from: r, reason: collision with root package name */
    public final C1242K f10480r = new C1242K(this);

    /* renamed from: t, reason: collision with root package name */
    public long f10482t = B1.C.c(0, 0, 15);

    /* renamed from: u, reason: collision with root package name */
    public final C0944e f10483u = new C0944e(9, this);

    public L(C1236E c1236e) {
        this.f10464a = c1236e;
    }

    public final Z a() {
        return (Z) this.f10464a.f10378C.f4242d;
    }

    public final void b(int i2) {
        int i3 = this.f10477n;
        this.f10477n = i2;
        if ((i3 == 0) != (i2 == 0)) {
            C1236E s3 = this.f10464a.s();
            L l3 = s3 != null ? s3.f10379D : null;
            if (l3 != null) {
                if (i2 == 0) {
                    l3.b(l3.f10477n - 1);
                } else {
                    l3.b(l3.f10477n + 1);
                }
            }
        }
    }

    public final void c(int i2) {
        int i3 = this.q;
        this.q = i2;
        if ((i3 == 0) != (i2 == 0)) {
            C1236E s3 = this.f10464a.s();
            L l3 = s3 != null ? s3.f10379D : null;
            if (l3 != null) {
                if (i2 == 0) {
                    l3.c(l3.q - 1);
                } else {
                    l3.c(l3.q + 1);
                }
            }
        }
    }

    public final void d(boolean z3) {
        if (this.f10476m != z3) {
            this.f10476m = z3;
            if (z3 && !this.f10475l) {
                b(this.f10477n + 1);
            } else {
                if (z3 || this.f10475l) {
                    return;
                }
                b(this.f10477n - 1);
            }
        }
    }

    public final void e(boolean z3) {
        if (this.f10475l != z3) {
            this.f10475l = z3;
            if (z3 && !this.f10476m) {
                b(this.f10477n + 1);
            } else {
                if (z3 || this.f10476m) {
                    return;
                }
                b(this.f10477n - 1);
            }
        }
    }

    public final void f(boolean z3) {
        if (this.f10479p != z3) {
            this.f10479p = z3;
            if (z3 && !this.f10478o) {
                c(this.q + 1);
            } else {
                if (z3 || this.f10478o) {
                    return;
                }
                c(this.q - 1);
            }
        }
    }

    public final void g(boolean z3) {
        if (this.f10478o != z3) {
            this.f10478o = z3;
            if (z3 && !this.f10479p) {
                c(this.q + 1);
            } else {
                if (z3 || this.f10479p) {
                    return;
                }
                c(this.q - 1);
            }
        }
    }

    public final void h() {
        C1242K c1242k = this.f10480r;
        Object obj = c1242k.f10462y;
        C1236E c1236e = this.f10464a;
        L l3 = c1242k.f10450O;
        if ((obj != null || l3.a().p() != null) && c1242k.f10461x) {
            c1242k.f10461x = false;
            c1242k.f10462y = l3.a().p();
            C1236E s3 = c1236e.s();
            if (s3 != null) {
                C1236E.U(s3, false, 7);
            }
        }
        C1241J c1241j = this.f10481s;
        if (c1241j != null) {
            Object obj2 = c1241j.f10424D;
            L l4 = c1241j.F;
            if (obj2 == null) {
                O R02 = l4.a().R0();
                z2.h.c(R02);
                if (R02.f10490s.p() == null) {
                    return;
                }
            }
            if (c1241j.f10423C) {
                c1241j.f10423C = false;
                O R03 = l4.a().R0();
                z2.h.c(R03);
                c1241j.f10424D = R03.f10490s.p();
                if (AbstractC1248f.r(c1236e)) {
                    C1236E s4 = c1236e.s();
                    if (s4 != null) {
                        C1236E.U(s4, false, 7);
                        return;
                    }
                    return;
                }
                C1236E s5 = c1236e.s();
                if (s5 != null) {
                    C1236E.S(s5, false, 7);
                }
            }
        }
    }
}
