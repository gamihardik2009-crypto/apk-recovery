package K;

import D.C0046o;
import J.C0292u;
import J.G0;
import J.InterfaceC0259d;
import a.AbstractC0423a;
import java.util.List;

/* renamed from: K.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335g extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final C0335g f4475c = new C0335g(0, 2, 1);

    @Override // K.G
    public final void a(C0046o c0046o, InterfaceC0259d interfaceC0259d, G0 g02, C0292u c0292u) {
        int i2 = ((R.c) c0046o.d(0)).f5374a;
        List list = (List) c0046o.d(1);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            z2.h.d(interfaceC0259d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int i4 = i2 + i3;
            interfaceC0259d.a(i4, obj);
            interfaceC0259d.d(i4, obj);
        }
    }

    @Override // K.G
    public final String c(int i2) {
        return AbstractC0423a.F(i2, 0) ? "effectiveNodeIndex" : AbstractC0423a.F(i2, 1) ? "nodes" : super.c(i2);
    }
}
