package K;

import D.C0046o;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class k extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final k f4479c = new k(0, 1, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        z2.h.d(interfaceC0259d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object obj : (Object[]) c0046o.d(0)) {
            interfaceC0259d.b(obj);
        }
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "nodes" : super.c(i2);
    }
}
