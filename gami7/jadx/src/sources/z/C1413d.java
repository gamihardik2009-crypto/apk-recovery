package z;

import I0.C0250g;
import java.util.List;
import m2.C0880v;
import s.AbstractC1166e;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413d extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C1413d f11629j = new C1413d(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1413d f11630k = new C1413d(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C1413d f11631l = new C1413d(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C1413d f11632m = new C1413d(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C1413d f11633n = new C1413d(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C1413d f11634o = new C1413d(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C1413d f11635p = new C1413d(1, 6);
    public static final C1413d q = new C1413d(1, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final C1413d f11636r = new C1413d(1, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final C1413d f11637s = new C1413d(1, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final C1413d f11638t = new C1413d(1, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final C1413d f11639u = new C1413d(1, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final C1413d f11640v = new C1413d(1, 12);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1413d(int i2, int i3) {
        super(i2);
        this.f11641i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0880v c0880v = C0880v.f8657a;
        switch (this.f11641i) {
            case 0:
                return c0880v;
            case 1:
                return c0880v;
            case 2:
                return c0880v;
            case 3:
                return c0880v;
            case 4:
                return c0880v;
            case AbstractC1166e.f10138f /* 5 */:
                return c0880v;
            case AbstractC1166e.f10136d /* 6 */:
                D.T t3 = (D.T) obj;
                long j3 = t3.f770f;
                int i2 = C0.J.f472c;
                return new C0250g(((int) (j3 & 4294967295L)) - N.p(t3.f771g.f500a, (int) (4294967295L & j3)), 0);
            case 7:
                D.T t4 = (D.T) obj;
                String str = t4.f771g.f500a;
                long j4 = t4.f770f;
                int i3 = C0.J.f472c;
                int m3 = N.m(str, (int) (j4 & 4294967295L));
                if (m3 != -1) {
                    return new C0250g(0, m3 - ((int) (4294967295L & t4.f770f)));
                }
                return null;
            case 8:
                D.T t5 = (D.T) obj;
                Integer e3 = t5.e();
                if (e3 == null) {
                    return null;
                }
                int intValue = e3.intValue();
                long j5 = t5.f770f;
                int i4 = C0.J.f472c;
                return new C0250g(((int) (4294967295L & j5)) - intValue, 0);
            case AbstractC1166e.f10135c /* 9 */:
                D.T t6 = (D.T) obj;
                Integer d3 = t6.d();
                if (d3 == null) {
                    return null;
                }
                int intValue2 = d3.intValue();
                long j6 = t6.f770f;
                int i5 = C0.J.f472c;
                return new C0250g(0, intValue2 - ((int) (4294967295L & j6)));
            case AbstractC1166e.f10137e /* 10 */:
                D.T t7 = (D.T) obj;
                Integer c3 = t7.c();
                if (c3 == null) {
                    return null;
                }
                int intValue3 = c3.intValue();
                long j7 = t7.f770f;
                int i6 = C0.J.f472c;
                return new C0250g(((int) (4294967295L & j7)) - intValue3, 0);
            case 11:
                D.T t8 = (D.T) obj;
                Integer b3 = t8.b();
                if (b3 == null) {
                    return null;
                }
                int intValue4 = b3.intValue();
                long j8 = t8.f770f;
                int i7 = C0.J.f472c;
                return new C0250g(0, intValue4 - ((int) (4294967295L & j8)));
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                z2.h.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                p.X x2 = ((Boolean) obj2).booleanValue() ? p.X.f9518h : p.X.f9519i;
                Object obj3 = list.get(0);
                z2.h.d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new n0(x2, ((Float) obj3).floatValue());
        }
    }
}
