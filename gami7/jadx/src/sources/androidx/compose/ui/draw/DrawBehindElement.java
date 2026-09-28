package androidx.compose.ui.draw;

import V.n;
import Z.d;
import t0.S;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
final class DrawBehindElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final c f6723b;

    public DrawBehindElement(c cVar) {
        this.f6723b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && h.a(this.f6723b, ((DrawBehindElement) obj).f6723b);
    }

    public final int hashCode() {
        return this.f6723b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        d dVar = new d();
        dVar.f6381u = this.f6723b;
        return dVar;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((d) nVar).f6381u = this.f6723b;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f6723b + ')';
    }
}
