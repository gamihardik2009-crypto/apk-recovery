package t0;

import c0.C0580U;
import m2.C0880v;
import s.AbstractC1166e;
import u0.C1314v;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247e extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C1247e f10564j = new C1247e(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1247e f10565k = new C1247e(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C1247e f10566l = new C1247e(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C1247e f10567m = new C1247e(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C1247e f10568n = new C1247e(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C1247e f10569o = new C1247e(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C1247e f10570p = new C1247e(1, 6);
    public static final C1247e q = new C1247e(1, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final C1247e f10571r = new C1247e(1, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final C1247e f10572s = new C1247e(1, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final C1247e f10573t = new C1247e(1, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final C1247e f10574u = new C1247e(1, 11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10575i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1247e(int i2, int i3) {
        super(i2);
        this.f10575i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f10575i) {
            case 0:
                ((C1245c) obj).M0();
                break;
            case 1:
                j0 j0Var = (j0) obj;
                if (j0Var.R()) {
                    j0Var.f10605i.t0(j0Var);
                }
                break;
            case 2:
                e0 e0Var = ((Z) obj).f10544L;
                if (e0Var != null) {
                    e0Var.invalidate();
                }
                break;
            case 3:
                Z z3 = (Z) obj;
                if (z3.R()) {
                    C1262u c1262u = z3.f10540H;
                    if (c1262u == null) {
                        z3.q1(true);
                    } else {
                        C1262u c1262u2 = Z.f10531O;
                        c1262u2.getClass();
                        c1262u2.f10628a = c1262u.f10628a;
                        c1262u2.f10629b = c1262u.f10629b;
                        c1262u2.f10630c = c1262u.f10630c;
                        c1262u2.f10631d = c1262u.f10631d;
                        c1262u2.f10632e = c1262u.f10632e;
                        c1262u2.f10633f = c1262u.f10633f;
                        c1262u2.f10634g = c1262u.f10634g;
                        c1262u2.f10635h = c1262u.f10635h;
                        c1262u2.f10636i = c1262u.f10636i;
                        z3.q1(true);
                        if (c1262u2.f10628a != c1262u.f10628a || c1262u2.f10629b != c1262u.f10629b || c1262u2.f10630c != c1262u.f10630c || c1262u2.f10631d != c1262u.f10631d || c1262u2.f10632e != c1262u.f10632e || c1262u2.f10633f != c1262u.f10633f || c1262u2.f10634g != c1262u.f10634g || c1262u2.f10635h != c1262u.f10635h || !C0580U.a(c1262u2.f10636i, c1262u.f10636i)) {
                            C1236E c1236e = z3.f10546s;
                            L l3 = c1236e.f10379D;
                            if (l3.f10477n > 0) {
                                if (l3.f10476m || l3.f10475l) {
                                    c1236e.T(false);
                                }
                                l3.f10480r.z0();
                            }
                            f0 f0Var = c1236e.f10395p;
                            if (f0Var != null) {
                                C1314v c1314v = (C1314v) f0Var;
                                ((L.d) c1314v.f11176N.f10503e.f239c).b(c1236e);
                                c1236e.f10383J = true;
                                c1314v.E(null);
                            }
                        }
                    }
                }
                break;
            case 4:
                c0 c0Var = (c0) obj;
                if (c0Var.R()) {
                    c0Var.f10560h.s0();
                }
                break;
            case AbstractC1166e.f10138f /* 5 */:
                C1236E c1236e2 = (C1236E) obj;
                if (c1236e2.D()) {
                    c1236e2.T(false);
                }
                break;
            case AbstractC1166e.f10136d /* 6 */:
                C1236E c1236e3 = (C1236E) obj;
                if (c1236e3.D()) {
                    c1236e3.T(false);
                }
                break;
            case 7:
                C1236E c1236e4 = (C1236E) obj;
                if (c1236e4.D()) {
                    c1236e4.Q(false);
                }
                break;
            case 8:
                C1236E c1236e5 = (C1236E) obj;
                if (c1236e5.D()) {
                    c1236e5.Q(false);
                }
                break;
            case AbstractC1166e.f10135c /* 9 */:
                C1236E c1236e6 = (C1236E) obj;
                if (c1236e6.D()) {
                    C1236E.S(c1236e6, false, 7);
                }
                break;
            case AbstractC1166e.f10137e /* 10 */:
                C1236E c1236e7 = (C1236E) obj;
                if (c1236e7.D()) {
                    C1236E.U(c1236e7, false, 7);
                }
                break;
            default:
                C1236E c1236e8 = (C1236E) obj;
                if (c1236e8.D()) {
                    c1236e8.B();
                }
                break;
        }
        return C0880v.f8657a;
    }
}
