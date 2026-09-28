package androidx.compose.ui.focus;

import V.n;
import a0.C0438o;
import a0.C0440q;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class FocusRequesterElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final C0438o f6740b;

    public FocusRequesterElement(C0438o c0438o) {
        this.f6740b = c0438o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && h.a(this.f6740b, ((FocusRequesterElement) obj).f6740b);
    }

    public final int hashCode() {
        return this.f6740b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        C0440q c0440q = new C0440q();
        c0440q.f6487u = this.f6740b;
        return c0440q;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C0440q c0440q = (C0440q) nVar;
        c0440q.f6487u.f6486a.m(c0440q);
        C0438o c0438o = this.f6740b;
        c0440q.f6487u = c0438o;
        c0438o.f6486a.b(c0440q);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f6740b + ')';
    }
}
