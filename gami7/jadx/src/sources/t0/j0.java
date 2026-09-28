package t0;

import r0.InterfaceC1095I;

/* loaded from: classes.dex */
public final class j0 implements g0 {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1095I f10604h;

    /* renamed from: i, reason: collision with root package name */
    public final N f10605i;

    public j0(InterfaceC1095I interfaceC1095I, N n3) {
        this.f10604h = interfaceC1095I;
        this.f10605i = n3;
    }

    @Override // t0.g0
    public final boolean R() {
        return this.f10605i.z0().n();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return z2.h.a(this.f10604h, j0Var.f10604h) && z2.h.a(this.f10605i, j0Var.f10605i);
    }

    public final int hashCode() {
        return this.f10605i.hashCode() + (this.f10604h.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f10604h + ", placeable=" + this.f10605i + ')';
    }
}
