package c0;

import D.C0053w;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.InterfaceC1264w;

/* renamed from: c0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597p extends V.n implements InterfaceC1264w {

    /* renamed from: u, reason: collision with root package name */
    public y2.c f7268u;

    public C0597p(y2.c cVar) {
        this.f7268u = cVar;
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        AbstractC1103Q a3 = interfaceC1093G.a(j3);
        return interfaceC1096J.C(a3.f9834h, a3.f9835i, C0971w.f9166h, new C0053w(a3, 15, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f7268u + ')';
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
