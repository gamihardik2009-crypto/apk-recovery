package androidx.compose.ui.focus;

import V.n;
import a0.C0435l;
import a0.C0437n;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class FocusPropertiesElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final C0435l f6739b;

    public FocusPropertiesElement(C0435l c0435l) {
        this.f6739b = c0435l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && h.a(this.f6739b, ((FocusPropertiesElement) obj).f6739b);
    }

    public final int hashCode() {
        return this.f6739b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        C0437n c0437n = new C0437n();
        c0437n.f6483u = this.f6739b;
        return c0437n;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((C0437n) nVar).f6483u = this.f6739b;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f6739b + ')';
    }
}
