package androidx.compose.foundation;

import A0.h;
import B1.t;
import V.n;
import n.C0883B;
import n.C0914w;
import r.l;
import t0.S;

/* loaded from: classes.dex */
final class ClickableElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final l f6551b;

    /* renamed from: c, reason: collision with root package name */
    public final C0883B f6552c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6553d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6554e;

    /* renamed from: f, reason: collision with root package name */
    public final h f6555f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.a f6556g;

    public ClickableElement(l lVar, C0883B c0883b, boolean z3, String str, h hVar, y2.a aVar) {
        this.f6551b = lVar;
        this.f6552c = c0883b;
        this.f6553d = z3;
        this.f6554e = str;
        this.f6555f = hVar;
        this.f6556g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return z2.h.a(this.f6551b, clickableElement.f6551b) && z2.h.a(this.f6552c, clickableElement.f6552c) && this.f6553d == clickableElement.f6553d && z2.h.a(this.f6554e, clickableElement.f6554e) && z2.h.a(this.f6555f, clickableElement.f6555f) && this.f6556g == clickableElement.f6556g;
    }

    public final int hashCode() {
        l lVar = this.f6551b;
        int f3 = t.f((((lVar != null ? lVar.hashCode() : 0) * 31) + (this.f6552c != null ? -1 : 0)) * 31, 31, this.f6553d);
        String str = this.f6554e;
        int hashCode = (f3 + (str != null ? str.hashCode() : 0)) * 31;
        h hVar = this.f6555f;
        return this.f6556g.hashCode() + ((hashCode + (hVar != null ? Integer.hashCode(hVar.f30a) : 0)) * 31);
    }

    @Override // t0.S
    public final n l() {
        return new C0914w(this.f6551b, this.f6552c, this.f6553d, this.f6554e, this.f6555f, this.f6556g);
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((C0914w) nVar).Q0(this.f6551b, this.f6552c, this.f6553d, this.f6554e, this.f6555f, this.f6556g);
    }
}
