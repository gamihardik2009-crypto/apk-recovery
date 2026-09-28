package K;

import D.C0046o;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;

/* loaded from: classes.dex */
public final class x extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final x f4496c = new x(2, 0, 2);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        interfaceC0259d.h(c0046o.c(0), c0046o.c(1));
    }

    @Override // K.G
    public final String b(int i2) {
        return K1.f.s(i2, 0) ? "removeIndex" : K1.f.s(i2, 1) ? "count" : super.b(i2);
    }
}
