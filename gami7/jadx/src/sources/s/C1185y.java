package s;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.InterfaceC1264w;

/* renamed from: s.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185y extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public int f10186u;

    /* renamed from: v, reason: collision with root package name */
    public float f10187v;

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        int j4;
        int h2;
        int g3;
        int i2;
        if (!O0.a.d(j3) || this.f10186u == 1) {
            j4 = O0.a.j(j3);
            h2 = O0.a.h(j3);
        } else {
            j4 = B1.C.C(Math.round(O0.a.h(j3) * this.f10187v), O0.a.j(j3), O0.a.h(j3));
            h2 = j4;
        }
        if (!O0.a.c(j3) || this.f10186u == 2) {
            int i3 = O0.a.i(j3);
            g3 = O0.a.g(j3);
            i2 = i3;
        } else {
            i2 = B1.C.C(Math.round(O0.a.g(j3) * this.f10187v), O0.a.i(j3), O0.a.g(j3));
            g3 = i2;
        }
        AbstractC1103Q a3 = interfaceC1093G.a(B1.C.b(j4, h2, i2, g3));
        return interfaceC1096J.C(a3.f9834h, a3.f9835i, C0971w.f9166h, new C.h(a3, 9));
    }
}
