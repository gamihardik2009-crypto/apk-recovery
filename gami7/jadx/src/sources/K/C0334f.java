package K;

import D.C0046o;
import J.C0260d0;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;

/* renamed from: K.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334f extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final C0334f f4474c = new C0334f(0, 2, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        R.c cVar = (R.c) c0046o.d(1);
        int i2 = cVar != null ? cVar.f5374a : 0;
        C0329a c0329a = (C0329a) c0046o.d(0);
        if (i2 > 0) {
            interfaceC0259d = new C0260d0(interfaceC0259d, i2);
        }
        c0329a.I(interfaceC0259d, g02, c0292u);
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "changes" : AbstractC0423a.F(i2, 1) ? "effectiveNodeIndex" : super.c(i2);
    }
}
