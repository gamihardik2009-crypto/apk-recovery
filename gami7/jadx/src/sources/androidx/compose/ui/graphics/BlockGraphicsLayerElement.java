package androidx.compose.ui.graphics;

import V.n;
import c0.C0597p;
import t0.AbstractC1248f;
import t0.S;
import t0.Z;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final c f6751b;

    public BlockGraphicsLayerElement(c cVar) {
        this.f6751b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && h.a(this.f6751b, ((BlockGraphicsLayerElement) obj).f6751b);
    }

    public final int hashCode() {
        return this.f6751b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        return new C0597p(this.f6751b);
    }

    @Override // t0.S
    public final void m(n nVar) {
        C0597p c0597p = (C0597p) nVar;
        c0597p.f7268u = this.f6751b;
        Z z3 = AbstractC1248f.t(c0597p, 2).f10548u;
        if (z3 != null) {
            z3.p1(c0597p.f7268u, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f6751b + ')';
    }
}
