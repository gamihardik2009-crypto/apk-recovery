package androidx.compose.foundation.layout;

import V.n;
import s.C1157J;
import t0.S;

/* loaded from: classes.dex */
final class OffsetPxElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f6621b;

    public OffsetPxElement(y2.c cVar) {
        this.f6621b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f6621b == offsetPxElement.f6621b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f6621b.hashCode() * 31);
    }

    @Override // t0.S
    public final n l() {
        C1157J c1157j = new C1157J();
        c1157j.f10061u = this.f6621b;
        c1157j.f10062v = true;
        return c1157j;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1157J c1157j = (C1157J) nVar;
        c1157j.f10061u = this.f6621b;
        c1157j.f10062v = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f6621b + ", rtlAware=true)";
    }
}
