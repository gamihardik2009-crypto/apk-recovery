package androidx.compose.foundation.selection;

import A0.h;
import B1.t;
import V.n;
import n.C0883B;
import r.l;
import t0.AbstractC1248f;
import t0.S;
import x.C1390c;

/* loaded from: classes.dex */
final class ToggleableElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6675b;

    /* renamed from: c, reason: collision with root package name */
    public final l f6676c;

    /* renamed from: d, reason: collision with root package name */
    public final C0883B f6677d = null;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6678e;

    /* renamed from: f, reason: collision with root package name */
    public final h f6679f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.c f6680g;

    public ToggleableElement(boolean z3, l lVar, boolean z4, h hVar, y2.c cVar) {
        this.f6675b = z3;
        this.f6676c = lVar;
        this.f6678e = z4;
        this.f6679f = hVar;
        this.f6680g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f6675b == toggleableElement.f6675b && z2.h.a(this.f6676c, toggleableElement.f6676c) && z2.h.a(this.f6677d, toggleableElement.f6677d) && this.f6678e == toggleableElement.f6678e && z2.h.a(this.f6679f, toggleableElement.f6679f) && this.f6680g == toggleableElement.f6680g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f6675b) * 31;
        l lVar = this.f6676c;
        int f3 = t.f((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + (this.f6677d != null ? -1 : 0)) * 31, 31, this.f6678e);
        h hVar = this.f6679f;
        return this.f6680g.hashCode() + ((f3 + (hVar != null ? Integer.hashCode(hVar.f30a) : 0)) * 31);
    }

    @Override // t0.S
    public final n l() {
        return new C1390c(this.f6675b, this.f6676c, this.f6677d, this.f6678e, this.f6679f, this.f6680g);
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1390c c1390c = (C1390c) nVar;
        boolean z3 = c1390c.f11468O;
        boolean z4 = this.f6675b;
        if (z3 != z4) {
            c1390c.f11468O = z4;
            AbstractC1248f.p(c1390c);
        }
        c1390c.f11469P = this.f6680g;
        c1390c.Q0(this.f6676c, this.f6677d, this.f6678e, null, this.f6679f, c1390c.f11470Q);
    }
}
