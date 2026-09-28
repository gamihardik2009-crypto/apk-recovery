package androidx.compose.ui.layout;

import V.n;
import r0.C1132u;
import t0.S;
import y2.f;
import z2.h;

/* loaded from: classes.dex */
final class LayoutElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final f f6776b;

    public LayoutElement(f fVar) {
        this.f6776b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && h.a(this.f6776b, ((LayoutElement) obj).f6776b);
    }

    public final int hashCode() {
        return this.f6776b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        C1132u c1132u = new C1132u();
        c1132u.f9888u = this.f6776b;
        return c1132u;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((C1132u) nVar).f9888u = this.f6776b;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f6776b + ')';
    }
}
