package K;

import D.C0046o;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class D extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final D f4444c = new D(0, 2, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        ((y2.e) c0046o.d(1)).j(interfaceC0259d.g(), c0046o.d(0));
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "value" : AbstractC0423a.F(i2, 1) ? "block" : super.c(i2);
    }
}
