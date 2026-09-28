package v;

import java.util.ArrayList;
import t0.C1238G;
import t0.InterfaceC1257o;

/* renamed from: v.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365s extends V.n implements InterfaceC1257o {

    /* renamed from: u, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.a f11388u;

    @Override // V.n
    public final void C0() {
        this.f11388u.getClass();
    }

    @Override // V.n
    public final void D0() {
        this.f11388u.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1365s) && z2.h.a(this.f11388u, ((C1365s) obj).f11388u);
    }

    @Override // t0.InterfaceC1257o
    public final void g(C1238G c1238g) {
        ArrayList arrayList = this.f11388u.f6662h;
        if (arrayList.size() <= 0) {
            c1238g.a();
        } else {
            B1.t.w(arrayList.get(0));
            throw null;
        }
    }

    public final int hashCode() {
        return this.f11388u.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f11388u + ')';
    }
}
