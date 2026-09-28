package K;

import D.C0046o;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;

/* loaded from: classes.dex */
public final class u extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final u f4493c = new u(3, 0, 2);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        interfaceC0259d.f(c0046o.c(0), c0046o.c(1), c0046o.c(2));
    }

    @Override // K.G
    public final String b(int i2) {
        return K1.f.s(i2, 0) ? "from" : K1.f.s(i2, 1) ? "to" : K1.f.s(i2, 2) ? "count" : super.b(i2);
    }
}
