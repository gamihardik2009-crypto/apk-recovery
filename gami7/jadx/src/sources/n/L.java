package n;

import n0.C0919B;
import r0.InterfaceC1129r;
import t0.AbstractC1248f;

/* loaded from: classes.dex */
public final class L extends V.n implements t0.p0 {

    /* renamed from: v, reason: collision with root package name */
    public static final g0 f8697v = new g0(6);

    /* renamed from: u, reason: collision with root package name */
    public final y2.c f8698u;

    public L(C0919B c0919b) {
        this.f8698u = c0919b;
    }

    public final void K0(InterfaceC1129r interfaceC1129r) {
        this.f8698u.l(interfaceC1129r);
        L l3 = (L) AbstractC1248f.k(this);
        if (l3 != null) {
            l3.K0(interfaceC1129r);
        }
    }

    @Override // t0.p0
    public final Object w() {
        return f8697v;
    }
}
