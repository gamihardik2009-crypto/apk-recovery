package androidx.compose.foundation;

import B1.t;
import V.n;
import n.t0;
import n.w0;
import p.U;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class ScrollSemanticsElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final w0 f6571b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6572c;

    /* renamed from: d, reason: collision with root package name */
    public final U f6573d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6574e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6575f;

    public ScrollSemanticsElement(w0 w0Var, boolean z3, U u3, boolean z4, boolean z5) {
        this.f6571b = w0Var;
        this.f6572c = z3;
        this.f6573d = u3;
        this.f6574e = z4;
        this.f6575f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return h.a(this.f6571b, scrollSemanticsElement.f6571b) && this.f6572c == scrollSemanticsElement.f6572c && h.a(this.f6573d, scrollSemanticsElement.f6573d) && this.f6574e == scrollSemanticsElement.f6574e && this.f6575f == scrollSemanticsElement.f6575f;
    }

    public final int hashCode() {
        int f3 = t.f(this.f6571b.hashCode() * 31, 31, this.f6572c);
        U u3 = this.f6573d;
        return Boolean.hashCode(this.f6575f) + t.f((f3 + (u3 == null ? 0 : u3.hashCode())) * 31, 31, this.f6574e);
    }

    @Override // t0.S
    public final n l() {
        t0 t0Var = new t0();
        t0Var.f8852u = this.f6571b;
        t0Var.f8853v = this.f6572c;
        t0Var.f8854w = this.f6575f;
        return t0Var;
    }

    @Override // t0.S
    public final void m(n nVar) {
        t0 t0Var = (t0) nVar;
        t0Var.f8852u = this.f6571b;
        t0Var.f8853v = this.f6572c;
        t0Var.f8854w = this.f6575f;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.f6571b + ", reverseScrolling=" + this.f6572c + ", flingBehavior=" + this.f6573d + ", isScrollable=" + this.f6574e + ", isVertical=" + this.f6575f + ')';
    }
}
