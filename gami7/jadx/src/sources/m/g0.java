package m;

import a.AbstractC0423a;
import m2.C0880v;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class g0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8487i;

    /* renamed from: j, reason: collision with root package name */
    public static final g0 f8471j = new g0(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final g0 f8472k = new g0(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final g0 f8473l = new g0(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final g0 f8474m = new g0(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final g0 f8475n = new g0(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final g0 f8476o = new g0(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final g0 f8477p = new g0(1, 6);
    public static final g0 q = new g0(1, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final g0 f8478r = new g0(1, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final g0 f8479s = new g0(1, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final g0 f8480t = new g0(1, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final g0 f8481u = new g0(1, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final g0 f8482v = new g0(1, 12);

    /* renamed from: w, reason: collision with root package name */
    public static final g0 f8483w = new g0(1, 13);

    /* renamed from: x, reason: collision with root package name */
    public static final g0 f8484x = new g0(1, 14);

    /* renamed from: y, reason: collision with root package name */
    public static final g0 f8485y = new g0(1, 15);

    /* renamed from: z, reason: collision with root package name */
    public static final g0 f8486z = new g0(1, 16);

    /* renamed from: A, reason: collision with root package name */
    public static final g0 f8467A = new g0(1, 17);

    /* renamed from: B, reason: collision with root package name */
    public static final g0 f8468B = new g0(1, 18);

    /* renamed from: C, reason: collision with root package name */
    public static final g0 f8469C = new g0(1, 19);

    /* renamed from: D, reason: collision with root package name */
    public static final g0 f8470D = new g0(1, 20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i2, int i3) {
        super(i2);
        this.f8487i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f8487i) {
            case 0:
                return C0880v.f8657a;
            case 1:
                ((y2.a) obj).c();
                return C0880v.f8657a;
            case 2:
                W w2 = (W) obj;
                long j3 = w2.f8376m;
                ((T.w) v0.f8587a.getValue()).c(w2, f8473l, w2.f8377n);
                long j4 = w2.f8376m;
                if (j3 != j4) {
                    K k3 = w2.f8383u;
                    if (k3 != null) {
                        k3.f8324g = j4;
                        if (k3.f8319b == null) {
                            k3.f8325h = B2.a.E((1.0d - k3.f8322e.a(0)) * w2.f8376m);
                        }
                    } else {
                        w2.u();
                    }
                }
                return C0880v.f8657a;
            case 3:
                long j5 = ((O0.f) obj).f5139a;
                return new C0843p(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
            case 4:
                C0843p c0843p = (C0843p) obj;
                return new O0.f((Float.floatToRawIntBits(c0843p.f8545a) << 32) | (Float.floatToRawIntBits(c0843p.f8546b) & 4294967295L));
            case AbstractC1166e.f10138f /* 5 */:
                return new C0842o(((O0.e) obj).f5138h);
            case AbstractC1166e.f10136d /* 6 */:
                return new O0.e(((C0842o) obj).f8543a);
            case 7:
                return new C0842o(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((C0842o) obj).f8543a);
            case AbstractC1166e.f10135c /* 9 */:
                long j6 = ((O0.h) obj).f5141a;
                return new C0843p((int) (j6 >> 32), (int) (j6 & 4294967295L));
            case AbstractC1166e.f10137e /* 10 */:
                C0843p c0843p2 = (C0843p) obj;
                return new O0.h(AbstractC0423a.m(Math.round(c0843p2.f8545a), Math.round(c0843p2.f8546b)));
            case 11:
                long j7 = ((O0.j) obj).f5147a;
                return new C0843p((int) (j7 >> 32), (int) (j7 & 4294967295L));
            case 12:
                C0843p c0843p3 = (C0843p) obj;
                int round = Math.round(c0843p3.f8545a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(c0843p3.f8546b);
                return new O0.j(l0.c.e(round, round2 >= 0 ? round2 : 0));
            case 13:
                return new C0842o(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((C0842o) obj).f8543a);
            case AbstractC1166e.f10139g /* 15 */:
                long j8 = ((b0.c) obj).f7058a;
                return new C0843p(b0.c.d(j8), b0.c.e(j8));
            case 16:
                C0843p c0843p4 = (C0843p) obj;
                return new b0.c(K1.f.e(c0843p4.f8545a, c0843p4.f8546b));
            case 17:
                b0.d dVar = (b0.d) obj;
                return new r(dVar.f7060a, dVar.f7061b, dVar.f7062c, dVar.f7063d);
            case 18:
                r rVar = (r) obj;
                return new b0.d(rVar.f8564a, rVar.f8565b, rVar.f8566c, rVar.f8567d);
            case 19:
                long j9 = ((b0.f) obj).f7072a;
                return new C0843p(b0.f.d(j9), b0.f.b(j9));
            default:
                C0843p c0843p5 = (C0843p) obj;
                return new b0.f(B1.C.i(c0843p5.f8545a, c0843p5.f8546b));
        }
    }
}
