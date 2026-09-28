package androidx.compose.ui.focus;

import V.n;
import a0.C0424a;
import t0.S;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
final class FocusChangedElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final c f6737b;

    public FocusChangedElement(c cVar) {
        this.f6737b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && h.a(this.f6737b, ((FocusChangedElement) obj).f6737b);
    }

    public final int hashCode() {
        return this.f6737b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        C0424a c0424a = new C0424a();
        c0424a.f6451u = this.f6737b;
        return c0424a;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((C0424a) nVar).f6451u = this.f6737b;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f6737b + ')';
    }
}
