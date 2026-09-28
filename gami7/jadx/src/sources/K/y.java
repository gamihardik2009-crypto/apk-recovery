package K;

import D.C0046o;
import J.C0257c;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;

/* loaded from: classes.dex */
public final class y extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final y f4497c = new y(0, 0, 3);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        if (g02.f4028n != 0) {
            C0257c.y("Cannot reset when inserting");
            throw null;
        }
        g02.A();
        g02.f4032s = 0;
        g02.f4033t = g02.m() - g02.f4022h;
        g02.f4023i = 0;
        g02.f4024j = 0;
        g02.f4029o = 0;
    }
}
