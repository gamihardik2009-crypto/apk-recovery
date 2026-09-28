package K;

import D.C0046o;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;

/* loaded from: classes.dex */
public final class E extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final E f4445c = new E(1, 0, 2);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        int c3 = c0046o.c(0);
        for (int i2 = 0; i2 < c3; i2++) {
            interfaceC0259d.c();
        }
    }

    @Override // K.G
    public final String b(int i2) {
        return K1.f.s(i2, 0) ? "count" : super.b(i2);
    }
}
