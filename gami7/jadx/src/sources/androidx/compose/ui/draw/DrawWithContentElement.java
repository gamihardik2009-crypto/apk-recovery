package androidx.compose.ui.draw;

import V.n;
import Z.g;
import t0.S;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
final class DrawWithContentElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final c f6725b;

    public DrawWithContentElement(c cVar) {
        this.f6725b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && h.a(this.f6725b, ((DrawWithContentElement) obj).f6725b);
    }

    public final int hashCode() {
        return this.f6725b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        g gVar = new g();
        gVar.f6383u = this.f6725b;
        return gVar;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((g) nVar).f6383u = this.f6725b;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f6725b + ')';
    }
}
