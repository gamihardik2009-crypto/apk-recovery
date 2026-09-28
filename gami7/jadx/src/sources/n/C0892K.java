package n;

import r0.InterfaceC1129r;
import t0.AbstractC1248f;
import t0.InterfaceC1258p;

/* renamed from: n.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892K extends V.n implements t0.p0, InterfaceC1258p {

    /* renamed from: w, reason: collision with root package name */
    public static final g0 f8694w = new g0(5);

    /* renamed from: u, reason: collision with root package name */
    public boolean f8695u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1129r f8696v;

    public final L K0() {
        if (!this.f5869t) {
            return null;
        }
        t0.p0 j3 = AbstractC1248f.j(this, L.f8697v);
        if (j3 instanceof L) {
            return (L) j3;
        }
        return null;
    }

    @Override // t0.InterfaceC1258p
    public final void q0(t0.Z z3) {
        L K02;
        this.f8696v = z3;
        if (this.f8695u) {
            if (!z3.T0().f5869t) {
                L K03 = K0();
                if (K03 != null) {
                    K03.K0(null);
                    return;
                }
                return;
            }
            InterfaceC1129r interfaceC1129r = this.f8696v;
            if (interfaceC1129r == null || !interfaceC1129r.n() || (K02 = K0()) == null) {
                return;
            }
            K02.K0(this.f8696v);
        }
    }

    @Override // t0.p0
    public final Object w() {
        return f8694w;
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
