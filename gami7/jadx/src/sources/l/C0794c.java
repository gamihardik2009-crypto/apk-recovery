package l;

import c0.C0580U;
import c0.C0603v;
import d0.C0633d;
import m.AbstractC0831e;
import m.C0843p;
import s.AbstractC1166e;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794c extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C0794c f8176j = new C0794c(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0794c f8177k = new C0794c(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0794c f8178l = new C0794c(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C0794c f8179m = new C0794c(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C0794c f8180n = new C0794c(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C0794c f8181o = new C0794c(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C0794c f8182p = new C0794c(1, 6);
    public static final C0794c q = new C0794c(1, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final C0794c f8183r = new C0794c(1, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final C0794c f8184s = new C0794c(1, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final C0794c f8185t = new C0794c(1, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final C0794c f8186u = new C0794c(1, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final C0794c f8187v = new C0794c(1, 12);

    /* renamed from: w, reason: collision with root package name */
    public static final C0794c f8188w = new C0794c(1, 13);

    /* renamed from: x, reason: collision with root package name */
    public static final C0794c f8189x = new C0794c(1, 14);

    /* renamed from: y, reason: collision with root package name */
    public static final C0794c f8190y = new C0794c(1, 15);

    /* renamed from: z, reason: collision with root package name */
    public static final C0794c f8191z = new C0794c(1, 16);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8192i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0794c(int i2, int i3) {
        super(i2);
        this.f8192i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f8192i) {
            case 0:
                return B2.a.H(z.c(AbstractC0831e.n(220, 90, null, 4), 0.0f, 2).a(z.e(AbstractC0831e.n(220, 90, null, 4))), z.d(AbstractC0831e.n(90, 0, null, 6), 2));
            case 1:
                return obj;
            case 2:
                return B2.a.H(z.c(AbstractC0831e.n(220, 90, null, 4), 0.0f, 2).a(z.e(AbstractC0831e.n(220, 90, null, 4))), z.d(AbstractC0831e.n(90, 0, null, 6), 2));
            case 3:
                return obj;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case AbstractC1166e.f10138f /* 5 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case AbstractC1166e.f10136d /* 6 */:
                long a3 = C0603v.a(((C0603v) obj).f7279a, C0633d.f7417t);
                return new m.r(C0603v.d(a3), C0603v.h(a3), C0603v.g(a3), C0603v.e(a3));
            case 7:
                long j3 = ((C0580U) obj).f7242a;
                return new C0843p(C0580U.b(j3), C0580U.c(j3));
            case 8:
                C0843p c0843p = (C0843p) obj;
                float f3 = c0843p.f8545a;
                float f4 = c0843p.f8546b;
                return new C0580U((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            case AbstractC1166e.f10135c /* 9 */:
                return AbstractC0831e.m(0.0f, null, 7);
            case AbstractC1166e.f10137e /* 10 */:
                ((Number) obj).intValue();
                return 0;
            case 11:
                long j4 = ((O0.j) obj).f5147a;
                return new O0.j(l0.c.e(0, 0));
            case 12:
                ((Number) obj).intValue();
                return 0;
            case 13:
                ((Number) obj).intValue();
                return 0;
            case 14:
                long j5 = ((O0.j) obj).f5147a;
                return new O0.j(l0.c.e(0, 0));
            case AbstractC1166e.f10139g /* 15 */:
                ((Number) obj).intValue();
                return 0;
            default:
                return z.f8262c;
        }
    }
}
