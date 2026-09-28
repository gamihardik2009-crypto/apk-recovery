package androidx.compose.foundation.layout;

import V.n;
import s.C1161N;
import s.InterfaceC1159L;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class PaddingValuesElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1159L f6626b;

    public PaddingValuesElement(InterfaceC1159L interfaceC1159L) {
        this.f6626b = interfaceC1159L;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return h.a(this.f6626b, paddingValuesElement.f6626b);
    }

    public final int hashCode() {
        return this.f6626b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        C1161N c1161n = new C1161N();
        c1161n.f10072u = this.f6626b;
        return c1161n;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((C1161N) nVar).f10072u = this.f6626b;
    }
}
