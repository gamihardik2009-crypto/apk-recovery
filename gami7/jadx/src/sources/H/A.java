package H;

import J.C0285q;
import c0.C0603v;
import s.C1160M;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final C1160M f1274a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1160M f1275b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1276c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1277d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1278e;

    static {
        float f3 = 24;
        float f4 = 8;
        f1274a = new C1160M(f3, f4, f3, f4);
        float f5 = 16;
        androidx.compose.foundation.layout.a.b(f5, f4, f3, f4);
        float f6 = 12;
        f1275b = new C1160M(f6, f4, f6, f4);
        androidx.compose.foundation.layout.a.b(f6, f4, f5, f4);
        f1276c = 58;
        f1277d = 40;
        float f7 = I.k.f3685a;
        f1278e = f4;
    }

    public static C0230z a(long j3, C0285q c0285q) {
        c0285q.V(-339300779);
        long j4 = C0603v.f7277g;
        C0230z a3 = b((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).a(j3, j4, j4, j4);
        c0285q.r(false);
        return a3;
    }

    public static C0230z b(C0093e0 c0093e0) {
        C0230z c0230z = c0093e0.f2467K;
        if (c0230z != null) {
            return c0230z;
        }
        float f3 = I.k.f3685a;
        C0230z c0230z2 = new C0230z(AbstractC0107g0.c(c0093e0, 26), AbstractC0107g0.c(c0093e0, I.k.f3692h), C0603v.b(0.12f, AbstractC0107g0.c(c0093e0, I.k.f3687c)), C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, I.k.f3689e)));
        c0093e0.f2467K = c0230z2;
        return c0230z2;
    }

    public static C0230z c(C0093e0 c0093e0) {
        C0230z c0230z = c0093e0.f2469M;
        if (c0230z != null) {
            return c0230z;
        }
        long j3 = C0603v.f7276f;
        C0230z c0230z2 = new C0230z(j3, AbstractC0107g0.c(c0093e0, 26), j3, C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, 18)));
        c0093e0.f2469M = c0230z2;
        return c0230z2;
    }

    public static C0230z d(long j3, long j4, C0285q c0285q, int i2) {
        c0285q.V(-1402274782);
        if ((i2 & 1) != 0) {
            j3 = C0603v.f7277g;
        }
        long j5 = C0603v.f7277g;
        C0230z a3 = c((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).a(j3, j4, j5, j5);
        c0285q.r(false);
        return a3;
    }
}
