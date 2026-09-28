package K;

import D.C0046o;
import J.A0;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final v f4494c = new v(0, 1, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        ((ArrayList) c0292u.f4241c).add((A0) c0046o.d(0));
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "value" : super.c(i2);
    }
}
