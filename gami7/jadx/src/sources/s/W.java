package s;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1126o;
import t0.InterfaceC1264w;

/* loaded from: classes.dex */
public final class W extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public float f10087u;

    /* renamed from: v, reason: collision with root package name */
    public float f10088v;

    @Override // t0.InterfaceC1264w
    public final int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        int b02 = interfaceC1093G.b0(i2);
        int l3 = !O0.e.a(this.f10088v, Float.NaN) ? interfaceC1126o.l(this.f10088v) : 0;
        return b02 < l3 ? l3 : b02;
    }

    @Override // t0.InterfaceC1264w
    public final int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        int b3 = interfaceC1093G.b(i2);
        int l3 = !O0.e.a(this.f10088v, Float.NaN) ? interfaceC1126o.l(this.f10088v) : 0;
        return b3 < l3 ? l3 : b3;
    }

    @Override // t0.InterfaceC1264w
    public final int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        int a02 = interfaceC1093G.a0(i2);
        int l3 = !O0.e.a(this.f10087u, Float.NaN) ? interfaceC1126o.l(this.f10087u) : 0;
        return a02 < l3 ? l3 : a02;
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        int j4;
        int i2 = 0;
        if (O0.e.a(this.f10087u, Float.NaN) || O0.a.j(j3) != 0) {
            j4 = O0.a.j(j3);
        } else {
            j4 = interfaceC1096J.l(this.f10087u);
            int h2 = O0.a.h(j3);
            if (j4 > h2) {
                j4 = h2;
            }
            if (j4 < 0) {
                j4 = 0;
            }
        }
        int h3 = O0.a.h(j3);
        if (O0.e.a(this.f10088v, Float.NaN) || O0.a.i(j3) != 0) {
            i2 = O0.a.i(j3);
        } else {
            int l3 = interfaceC1096J.l(this.f10088v);
            int g3 = O0.a.g(j3);
            if (l3 > g3) {
                l3 = g3;
            }
            if (l3 >= 0) {
                i2 = l3;
            }
        }
        AbstractC1103Q a3 = interfaceC1093G.a(B1.C.b(j4, h3, i2, O0.a.g(j3)));
        return interfaceC1096J.C(a3.f9834h, a3.f9835i, C0971w.f9166h, new C.h(a3, 12));
    }

    @Override // t0.InterfaceC1264w
    public final int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        int L3 = interfaceC1093G.L(i2);
        int l3 = !O0.e.a(this.f10087u, Float.NaN) ? interfaceC1126o.l(this.f10087u) : 0;
        return L3 < l3 ? l3 : L3;
    }
}
