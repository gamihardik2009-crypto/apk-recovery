package s;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.InterfaceC1264w;

/* renamed from: s.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158K extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public float f10063u;

    /* renamed from: v, reason: collision with root package name */
    public float f10064v;

    /* renamed from: w, reason: collision with root package name */
    public float f10065w;

    /* renamed from: x, reason: collision with root package name */
    public float f10066x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10067y;

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        int l3 = interfaceC1096J.l(this.f10065w) + interfaceC1096J.l(this.f10063u);
        int l4 = interfaceC1096J.l(this.f10066x) + interfaceC1096J.l(this.f10064v);
        AbstractC1103Q a3 = interfaceC1093G.a(B1.C.d0(-l3, -l4, j3));
        return interfaceC1096J.C(B1.C.K(j3, a3.f9834h + l3), B1.C.J(j3, a3.f9835i + l4), C0971w.f9166h, new L2.d(this, a3, interfaceC1096J, 13));
    }
}
