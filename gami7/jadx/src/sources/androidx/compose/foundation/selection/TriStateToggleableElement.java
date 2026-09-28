package androidx.compose.foundation.selection;

import A0.h;
import B1.t;
import V.n;
import n.C0883B;
import r.l;
import t0.AbstractC1248f;
import t0.S;
import x.d;

/* loaded from: classes.dex */
final class TriStateToggleableElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final B0.a f6681b;

    /* renamed from: c, reason: collision with root package name */
    public final l f6682c;

    /* renamed from: d, reason: collision with root package name */
    public final C0883B f6683d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6684e;

    /* renamed from: f, reason: collision with root package name */
    public final h f6685f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.a f6686g;

    public TriStateToggleableElement(B0.a aVar, l lVar, C0883B c0883b, boolean z3, h hVar, y2.a aVar2) {
        this.f6681b = aVar;
        this.f6682c = lVar;
        this.f6683d = c0883b;
        this.f6684e = z3;
        this.f6685f = hVar;
        this.f6686g = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f6681b == triStateToggleableElement.f6681b && z2.h.a(this.f6682c, triStateToggleableElement.f6682c) && z2.h.a(this.f6683d, triStateToggleableElement.f6683d) && this.f6684e == triStateToggleableElement.f6684e && z2.h.a(this.f6685f, triStateToggleableElement.f6685f) && this.f6686g == triStateToggleableElement.f6686g;
    }

    public final int hashCode() {
        int hashCode = this.f6681b.hashCode() * 31;
        l lVar = this.f6682c;
        int f3 = t.f((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + (this.f6683d != null ? -1 : 0)) * 31, 31, this.f6684e);
        h hVar = this.f6685f;
        return this.f6686g.hashCode() + ((f3 + (hVar != null ? Integer.hashCode(hVar.f30a) : 0)) * 31);
    }

    @Override // t0.S
    public final n l() {
        d dVar = new d(this.f6682c, this.f6683d, this.f6684e, null, this.f6685f, this.f6686g);
        dVar.f11471O = this.f6681b;
        return dVar;
    }

    @Override // t0.S
    public final void m(n nVar) {
        d dVar = (d) nVar;
        B0.a aVar = dVar.f11471O;
        B0.a aVar2 = this.f6681b;
        if (aVar != aVar2) {
            dVar.f11471O = aVar2;
            AbstractC1248f.p(dVar);
        }
        dVar.Q0(this.f6682c, this.f6683d, this.f6684e, null, this.f6685f, this.f6686g);
    }
}
