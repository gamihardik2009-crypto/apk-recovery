package J;

import p.C1015f;

/* loaded from: classes.dex */
public final class C implements Z0 {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f3971a = C1015f.f9594j;

    @Override // J.Z0
    public final Object a(InterfaceC0282o0 interfaceC0282o0) {
        return this.f3971a.l(interfaceC0282o0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && z2.h.a(this.f3971a, ((C) obj).f3971a);
    }

    public final int hashCode() {
        return this.f3971a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f3971a + ')';
    }
}
