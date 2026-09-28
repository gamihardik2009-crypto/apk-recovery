package androidx.compose.foundation;

import V.n;
import n.C0890I;
import r.l;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class FocusableElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final l f6557b;

    public FocusableElement(l lVar) {
        this.f6557b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return h.a(this.f6557b, ((FocusableElement) obj).f6557b);
        }
        return false;
    }

    public final int hashCode() {
        l lVar = this.f6557b;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // t0.S
    public final n l() {
        return new C0890I(this.f6557b);
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((C0890I) nVar).N0(this.f6557b);
    }
}
