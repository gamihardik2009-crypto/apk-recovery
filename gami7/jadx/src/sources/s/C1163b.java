package s;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.C1125n;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.InterfaceC1264w;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163b extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public C1125n f10119u;

    /* renamed from: v, reason: collision with root package name */
    public float f10120v;

    /* renamed from: w, reason: collision with root package name */
    public float f10121w;

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        C1125n c1125n = this.f10119u;
        float f3 = this.f10120v;
        float f4 = this.f10121w;
        boolean z3 = c1125n instanceof C1125n;
        AbstractC1103Q a3 = interfaceC1093G.a(z3 ? O0.a.a(j3, 0, 0, 0, 0, 11) : O0.a.a(j3, 0, 0, 0, 0, 14));
        int d02 = a3.d0(c1125n);
        if (d02 == Integer.MIN_VALUE) {
            d02 = 0;
        }
        int i2 = z3 ? a3.f9835i : a3.f9834h;
        int g3 = (z3 ? O0.a.g(j3) : O0.a.h(j3)) - i2;
        int C3 = B1.C.C((!O0.e.a(f3, Float.NaN) ? interfaceC1096J.l(f3) : 0) - d02, 0, g3);
        int C4 = B1.C.C(((!O0.e.a(f4, Float.NaN) ? interfaceC1096J.l(f4) : 0) - i2) + d02, 0, g3 - C3);
        int max = z3 ? a3.f9834h : Math.max(a3.f9834h + C3 + C4, O0.a.j(j3));
        int max2 = z3 ? Math.max(a3.f9835i + C3 + C4, O0.a.i(j3)) : a3.f9835i;
        return interfaceC1096J.C(max, max2, C0971w.f9166h, new C1162a(c1125n, f3, C3, max, C4, a3, max2));
    }
}
