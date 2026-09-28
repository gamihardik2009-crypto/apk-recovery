package A;

import B1.C;
import a0.EnumC0441r;
import a0.InterfaceC0426c;
import n0.C0921D;
import n0.C0930i;
import n0.EnumC0931j;
import n0.w;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.AbstractC1256n;
import t0.InterfaceC1264w;
import t0.k0;

/* loaded from: classes.dex */
public final class d extends AbstractC1256n implements InterfaceC1264w, k0, InterfaceC0426c {

    /* renamed from: w, reason: collision with root package name */
    public y2.a f12w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13x;

    /* renamed from: y, reason: collision with root package name */
    public final C0921D f14y;

    public d(y2.a aVar) {
        this.f12w = aVar;
        b bVar = new b(this, null);
        C0930i c0930i = w.f8985a;
        C0921D c0921d = new C0921D(null, null, null, bVar);
        K0(c0921d);
        this.f14y = c0921d;
    }

    @Override // a0.InterfaceC0426c
    public final void D(EnumC0441r enumC0441r) {
        this.f13x = enumC0441r.a();
    }

    @Override // t0.k0
    public final void Y() {
        this.f14y.Y();
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        int l3 = interfaceC1096J.l(androidx.compose.foundation.text.handwriting.a.f6698a);
        int l4 = interfaceC1096J.l(androidx.compose.foundation.text.handwriting.a.f6699b);
        int i2 = l4 * 2;
        int i3 = l3 * 2;
        AbstractC1103Q a3 = interfaceC1093G.a(C.d0(i2, i3, j3));
        int i4 = a3.f9835i - i3;
        return interfaceC1096J.C(a3.f9834h - i2, i4, C0971w.f9166h, new c(a3, l4, l3, 0));
    }

    @Override // t0.k0
    public final void t0(C0930i c0930i, EnumC0931j enumC0931j, long j3) {
        this.f14y.t0(c0930i, enumC0931j, j3);
    }
}
