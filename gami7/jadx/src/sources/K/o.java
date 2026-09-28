package K;

import D.C0046o;
import J.C0255b;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class o extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final o f4483c = new o(0, 1, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        C0255b c0255b = (C0255b) c0046o.d(0);
        c0255b.getClass();
        g02.k(g02.c(c0255b));
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "anchor" : super.c(i2);
    }
}
