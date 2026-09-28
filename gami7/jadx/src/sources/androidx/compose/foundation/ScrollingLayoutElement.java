package androidx.compose.foundation;

import B1.t;
import V.n;
import n.w0;
import n.x0;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final w0 f6576b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6577c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6578d;

    public ScrollingLayoutElement(w0 w0Var, boolean z3, boolean z4) {
        this.f6576b = w0Var;
        this.f6577c = z3;
        this.f6578d = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return h.a(this.f6576b, scrollingLayoutElement.f6576b) && this.f6577c == scrollingLayoutElement.f6577c && this.f6578d == scrollingLayoutElement.f6578d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6578d) + t.f(this.f6576b.hashCode() * 31, 31, this.f6577c);
    }

    @Override // t0.S
    public final n l() {
        x0 x0Var = new x0();
        x0Var.f8893u = this.f6576b;
        x0Var.f8894v = this.f6577c;
        x0Var.f8895w = this.f6578d;
        return x0Var;
    }

    @Override // t0.S
    public final void m(n nVar) {
        x0 x0Var = (x0) nVar;
        x0Var.f8893u = this.f6576b;
        x0Var.f8894v = this.f6577c;
        x0Var.f8895w = this.f6578d;
    }
}
