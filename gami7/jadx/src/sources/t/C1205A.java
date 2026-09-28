package t;

import B1.C;
import J.W0;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.InterfaceC1264w;

/* renamed from: t.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205A extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public float f10211u;

    /* renamed from: v, reason: collision with root package name */
    public W0 f10212v;

    /* renamed from: w, reason: collision with root package name */
    public W0 f10213w;

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        W0 w02 = this.f10212v;
        int round = (w02 == null || ((Number) w02.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) w02.getValue()).floatValue() * this.f10211u);
        W0 w03 = this.f10213w;
        int round2 = (w03 == null || ((Number) w03.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) w03.getValue()).floatValue() * this.f10211u);
        int j4 = round != Integer.MAX_VALUE ? round : O0.a.j(j3);
        int i2 = round2 != Integer.MAX_VALUE ? round2 : O0.a.i(j3);
        if (round == Integer.MAX_VALUE) {
            round = O0.a.h(j3);
        }
        if (round2 == Integer.MAX_VALUE) {
            round2 = O0.a.g(j3);
        }
        AbstractC1103Q a3 = interfaceC1093G.a(C.b(j4, round, i2, round2));
        return interfaceC1096J.C(a3.f9834h, a3.f9835i, C0971w.f9166h, new C.h(a3, 13));
    }
}
