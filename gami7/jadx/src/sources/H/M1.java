package H;

import c0.C0603v;

/* loaded from: classes.dex */
public abstract class M1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1729a = I.m.f3702a;

    public static C0152m3 a(C0093e0 c0093e0) {
        C0152m3 c0152m3 = c0093e0.f2471O;
        if (c0152m3 != null) {
            return c0152m3;
        }
        long j3 = C0603v.f7276f;
        long c3 = AbstractC0107g0.c(c0093e0, I.m.f3716o);
        int i2 = I.m.q;
        long c4 = AbstractC0107g0.c(c0093e0, i2);
        long c5 = AbstractC0107g0.c(c0093e0, i2);
        long b3 = C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, 18));
        int i3 = I.m.f3717p;
        long b4 = C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, i3));
        long b5 = C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, i3));
        long c6 = AbstractC0107g0.c(c0093e0, I.m.f3713l);
        long b6 = C0603v.b(0.12f, AbstractC0107g0.c(c0093e0, I.m.f3711j));
        long c7 = AbstractC0107g0.c(c0093e0, I.m.f3715n);
        int i4 = I.m.f3718r;
        C0152m3 c0152m32 = new C0152m3(j3, c3, c4, c5, j3, b3, b4, b5, c6, b6, c7, AbstractC0107g0.c(c0093e0, i4), AbstractC0107g0.c(c0093e0, i4));
        c0093e0.f2471O = c0152m32;
        return c0152m32;
    }
}
