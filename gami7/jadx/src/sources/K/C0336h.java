package K;

import D.C0046o;
import J.AbstractC0254a0;
import J.AbstractC0288s;
import J.C0257c;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;

/* renamed from: K.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336h extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final C0336h f4476c = new C0336h(0, 4, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        AbstractC0254a0 abstractC0254a0 = (AbstractC0254a0) c0046o.d(2);
        AbstractC0288s abstractC0288s = (AbstractC0288s) c0046o.d(1);
        abstractC0288s.j(abstractC0254a0);
        C0257c.z("Could not resolve state for movable content");
        throw null;
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "resolvedState" : AbstractC0423a.F(i2, 1) ? "resolvedCompositionContext" : AbstractC0423a.F(i2, 2) ? "from" : AbstractC0423a.F(i2, 3) ? "to" : super.c(i2);
    }
}
