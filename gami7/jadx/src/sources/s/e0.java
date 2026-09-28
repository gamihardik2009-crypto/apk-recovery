package s;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.InterfaceC1264w;

/* loaded from: classes.dex */
public final class e0 extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public int f10140u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10141v;

    /* renamed from: w, reason: collision with root package name */
    public y2.e f10142w;

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        AbstractC1103Q a3 = interfaceC1093G.a(B1.C.b(this.f10140u != 1 ? 0 : O0.a.j(j3), (this.f10140u == 1 || !this.f10141v) ? O0.a.h(j3) : Integer.MAX_VALUE, this.f10140u == 2 ? O0.a.i(j3) : 0, (this.f10140u == 2 || !this.f10141v) ? O0.a.g(j3) : Integer.MAX_VALUE));
        int C3 = B1.C.C(a3.f9834h, O0.a.j(j3), O0.a.h(j3));
        int C4 = B1.C.C(a3.f9835i, O0.a.i(j3), O0.a.g(j3));
        return interfaceC1096J.C(C3, C4, C0971w.f9166h, new d0(this, C3, a3, C4, interfaceC1096J));
    }
}
