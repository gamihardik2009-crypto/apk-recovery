package K;

import D.C0046o;
import J.B0;
import J.C0257c;
import J.C0291t0;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;

/* loaded from: classes.dex */
public final class B extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final B f4442c = new B(1, 0, 2);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        int c3 = c0046o.c(0);
        int o3 = g02.o();
        int i2 = g02.f4034u;
        int G3 = g02.G(g02.f4016b, g02.p(i2));
        int f3 = g02.f(g02.f4016b, g02.p(i2 + 1));
        for (int max = Math.max(G3, f3 - c3); max < f3; max++) {
            Object obj = g02.f4017c[g02.g(max)];
            if (obj instanceof B0) {
                c0292u.h(((B0) obj).f3969a, o3 - max, -1, -1);
            } else if (obj instanceof C0291t0) {
                ((C0291t0) obj).d();
            }
        }
        C0257c.T(c3 > 0);
        int i3 = g02.f4034u;
        int G4 = g02.G(g02.f4016b, g02.p(i3));
        int f4 = g02.f(g02.f4016b, g02.p(i3 + 1)) - c3;
        C0257c.T(f4 >= G4);
        g02.D(f4, c3, i3);
        int i4 = g02.f4023i;
        if (i4 >= G4) {
            g02.f4023i = i4 - c3;
        }
    }

    @Override // K.G
    public final String b(int i2) {
        return K1.f.s(i2, 0) ? "count" : super.b(i2);
    }
}
