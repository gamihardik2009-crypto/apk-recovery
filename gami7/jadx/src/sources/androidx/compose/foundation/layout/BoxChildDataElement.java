package androidx.compose.foundation.layout;

import V.g;
import V.n;
import s.C1174m;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class BoxChildDataElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final V.c f6612b;

    public BoxChildDataElement(g gVar) {
        this.f6612b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return h.a(this.f6612b, boxChildDataElement.f6612b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f6612b.hashCode() * 31);
    }

    @Override // t0.S
    public final n l() {
        C1174m c1174m = new C1174m();
        c1174m.f10156u = this.f6612b;
        c1174m.f10157v = false;
        return c1174m;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1174m c1174m = (C1174m) nVar;
        c1174m.f10156u = this.f6612b;
        c1174m.f10157v = false;
    }
}
