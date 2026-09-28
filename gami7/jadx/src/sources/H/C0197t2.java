package H;

import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.AbstractC1248f;
import t0.InterfaceC1254l;
import t0.InterfaceC1264w;

/* renamed from: H.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197t2 extends V.n implements InterfaceC1254l, InterfaceC1264w {
    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        long j4 = AbstractC0102f2.f2578b;
        AbstractC1103Q a3 = interfaceC1093G.a(j3);
        boolean z3 = this.f5869t && ((Boolean) AbstractC1248f.i(this, AbstractC0102f2.f2577a)).booleanValue();
        int max = z3 ? Math.max(a3.f9834h, interfaceC1096J.l(O0.g.b(j4))) : a3.f9834h;
        int max2 = z3 ? Math.max(a3.f9835i, interfaceC1096J.l(O0.g.a(j4))) : a3.f9835i;
        return interfaceC1096J.C(max, max2, C0971w.f9166h, new A.c(max, a3, max2));
    }
}
