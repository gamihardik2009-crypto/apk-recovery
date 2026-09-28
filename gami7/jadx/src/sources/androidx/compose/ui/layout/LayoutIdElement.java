package androidx.compose.ui.layout;

import V.n;
import r0.C1130s;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class LayoutIdElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final Object f6777b;

    public LayoutIdElement(Object obj) {
        this.f6777b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && h.a(this.f6777b, ((LayoutIdElement) obj).f6777b);
    }

    public final int hashCode() {
        return this.f6777b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        C1130s c1130s = new C1130s();
        c1130s.f9887u = this.f6777b;
        return c1130s;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((C1130s) nVar).f9887u = this.f6777b;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f6777b + ')';
    }
}
