package K;

import D.C0046o;
import J.C0255b;
import J.C0257c;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class j extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final j f4478c = new j(0, 2, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        int i2;
        R.c cVar = (R.c) c0046o.d(0);
        C0255b c0255b = (C0255b) c0046o.d(1);
        z2.h.d(interfaceC0259d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        int c3 = g02.c(c0255b);
        C0257c.T(g02.f4032s < c3);
        l0.c.J(g02, interfaceC0259d, c3);
        int i3 = g02.f4032s;
        int i4 = g02.f4034u;
        while (i4 >= 0 && !C0257c.m(g02.f4016b, g02.p(i4))) {
            i4 = g02.z(g02.f4016b, i4);
        }
        int i5 = i4 + 1;
        int i6 = 0;
        while (i5 < i3) {
            if (g02.r(i3, i5)) {
                if (C0257c.m(g02.f4016b, g02.p(i5))) {
                    i6 = 0;
                }
                i5++;
            } else {
                i6 += C0257c.m(g02.f4016b, g02.p(i5)) ? 1 : C0257c.o(g02.f4016b, g02.p(i5));
                i5 += g02.q(i5);
            }
        }
        while (true) {
            i2 = g02.f4032s;
            if (i2 >= c3) {
                break;
            }
            if (g02.r(c3, i2)) {
                int i7 = g02.f4032s;
                if (i7 < g02.f4033t && C0257c.m(g02.f4016b, g02.p(i7))) {
                    interfaceC0259d.b(g02.y(g02.f4032s));
                    i6 = 0;
                }
                g02.J();
            } else {
                i6 += g02.E();
            }
        }
        C0257c.T(i2 == c3);
        cVar.f5374a = i6;
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "effectiveNodeIndexOut" : AbstractC0423a.F(i2, 1) ? "anchor" : super.c(i2);
    }
}
