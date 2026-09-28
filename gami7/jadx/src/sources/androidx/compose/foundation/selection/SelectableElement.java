package androidx.compose.foundation.selection;

import A0.h;
import B1.t;
import V.n;
import n.C0883B;
import r.l;
import t0.AbstractC1248f;
import t0.S;
import x.C1389b;

/* loaded from: classes.dex */
final class SelectableElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6669b;

    /* renamed from: c, reason: collision with root package name */
    public final l f6670c;

    /* renamed from: d, reason: collision with root package name */
    public final C0883B f6671d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6672e;

    /* renamed from: f, reason: collision with root package name */
    public final h f6673f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.a f6674g;

    public SelectableElement(boolean z3, l lVar, C0883B c0883b, boolean z4, h hVar, y2.a aVar) {
        this.f6669b = z3;
        this.f6670c = lVar;
        this.f6671d = c0883b;
        this.f6672e = z4;
        this.f6673f = hVar;
        this.f6674g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f6669b == selectableElement.f6669b && z2.h.a(this.f6670c, selectableElement.f6670c) && z2.h.a(this.f6671d, selectableElement.f6671d) && this.f6672e == selectableElement.f6672e && z2.h.a(this.f6673f, selectableElement.f6673f) && this.f6674g == selectableElement.f6674g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f6669b) * 31;
        l lVar = this.f6670c;
        int f3 = t.f((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + (this.f6671d != null ? -1 : 0)) * 31, 31, this.f6672e);
        h hVar = this.f6673f;
        return this.f6674g.hashCode() + ((f3 + (hVar != null ? Integer.hashCode(hVar.f30a) : 0)) * 31);
    }

    @Override // t0.S
    public final n l() {
        C1389b c1389b = new C1389b(this.f6670c, this.f6671d, this.f6672e, null, this.f6673f, this.f6674g);
        c1389b.f11467O = this.f6669b;
        return c1389b;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1389b c1389b = (C1389b) nVar;
        boolean z3 = c1389b.f11467O;
        boolean z4 = this.f6669b;
        if (z3 != z4) {
            c1389b.f11467O = z4;
            AbstractC1248f.p(c1389b);
        }
        c1389b.Q0(this.f6670c, this.f6671d, this.f6672e, null, this.f6673f, this.f6674g);
    }
}
