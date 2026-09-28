package K;

import D.C0046o;
import J.C0255b;
import J.C0292u;
import J.E0;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class r extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final r f4490c = new r(0, 2, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        E0 e02 = (E0) c0046o.d(1);
        C0255b c0255b = (C0255b) c0046o.d(0);
        g02.d();
        c0255b.getClass();
        g02.v(e02, e02.a(c0255b));
        g02.j();
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "anchor" : AbstractC0423a.F(i2, 1) ? "from" : super.c(i2);
    }
}
