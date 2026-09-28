package K;

import D.C0046o;
import J.B0;
import J.C0255b;
import J.C0257c;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;
import java.util.ArrayList;

/* renamed from: K.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333e extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final C0333e f4473c = new C0333e(0, 2, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        C0255b c0255b = (C0255b) c0046o.d(0);
        Object d3 = c0046o.d(1);
        if (d3 instanceof B0) {
            ((ArrayList) c0292u.f4241c).add(((B0) d3).f3969a);
        }
        if (g02.f4028n != 0) {
            C0257c.y("Can only append a slot if not current inserting");
            throw null;
        }
        int i2 = g02.f4023i;
        int i3 = g02.f4024j;
        int c3 = g02.c(c0255b);
        int f3 = g02.f(g02.f4016b, g02.p(c3 + 1));
        g02.f4023i = f3;
        g02.f4024j = f3;
        g02.t(1, c3);
        if (i2 >= f3) {
            i2++;
            i3++;
        }
        g02.f4017c[f3] = d3;
        g02.f4023i = i2;
        g02.f4024j = i3;
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "anchor" : AbstractC0423a.F(i2, 1) ? "value" : super.c(i2);
    }
}
