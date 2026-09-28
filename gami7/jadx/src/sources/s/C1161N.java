package s;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.InterfaceC1264w;

/* renamed from: s.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1161N extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1159L f10072u;

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        float f3 = 0;
        if (Float.compare(this.f10072u.b(interfaceC1096J.getLayoutDirection()), f3) < 0 || Float.compare(this.f10072u.d(), f3) < 0 || Float.compare(this.f10072u.a(interfaceC1096J.getLayoutDirection()), f3) < 0 || Float.compare(this.f10072u.c(), f3) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int l3 = interfaceC1096J.l(this.f10072u.a(interfaceC1096J.getLayoutDirection())) + interfaceC1096J.l(this.f10072u.b(interfaceC1096J.getLayoutDirection()));
        int l4 = interfaceC1096J.l(this.f10072u.c()) + interfaceC1096J.l(this.f10072u.d());
        AbstractC1103Q a3 = interfaceC1093G.a(B1.C.d0(-l3, -l4, j3));
        return interfaceC1096J.C(B1.C.K(j3, a3.f9834h + l3), B1.C.J(j3, a3.f9835i + l4), C0971w.f9166h, new L2.d(a3, interfaceC1096J, this, 14));
    }
}
