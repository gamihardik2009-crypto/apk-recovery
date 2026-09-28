package K;

import D.C0046o;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class l extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final l f4480c = new l(0, 2, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        ((y2.c) c0046o.d(0)).l((J.r) c0046o.d(1));
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "anchor" : AbstractC0423a.F(i2, 1) ? "composition" : super.c(i2);
    }
}
