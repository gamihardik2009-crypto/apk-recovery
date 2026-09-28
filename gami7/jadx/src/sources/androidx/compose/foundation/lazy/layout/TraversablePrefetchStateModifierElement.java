package androidx.compose.foundation.lazy.layout;

import V.n;
import t0.S;
import v.C1337I;
import v.V;
import z2.h;

/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final C1337I f6654b;

    public TraversablePrefetchStateModifierElement(C1337I c1337i) {
        this.f6654b = c1337i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && h.a(this.f6654b, ((TraversablePrefetchStateModifierElement) obj).f6654b);
    }

    public final int hashCode() {
        return this.f6654b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        C1337I c1337i = this.f6654b;
        V v3 = new V();
        v3.f11328u = c1337i;
        return v3;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((V) nVar).f11328u = this.f6654b;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f6654b + ')';
    }
}
