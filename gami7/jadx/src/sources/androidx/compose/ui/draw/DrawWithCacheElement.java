package androidx.compose.ui.draw;

import V.n;
import Z.b;
import t0.S;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
final class DrawWithCacheElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final c f6724b;

    public DrawWithCacheElement(c cVar) {
        this.f6724b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && h.a(this.f6724b, ((DrawWithCacheElement) obj).f6724b);
    }

    public final int hashCode() {
        return this.f6724b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        return new b(new Z.c(), this.f6724b);
    }

    @Override // t0.S
    public final void m(n nVar) {
        b bVar = (b) nVar;
        bVar.f6378w = this.f6724b;
        bVar.K0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f6724b + ')';
    }
}
