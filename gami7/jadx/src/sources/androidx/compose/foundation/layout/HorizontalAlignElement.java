package androidx.compose.foundation.layout;

import V.e;
import V.n;
import s.C1148A;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
public final class HorizontalAlignElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final e f6615b;

    public HorizontalAlignElement(e eVar) {
        this.f6615b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return h.a(this.f6615b, horizontalAlignElement.f6615b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6615b.f5848a);
    }

    @Override // t0.S
    public final n l() {
        C1148A c1148a = new C1148A();
        c1148a.f10036u = this.f6615b;
        return c1148a;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((C1148A) nVar).f10036u = this.f6615b;
    }
}
