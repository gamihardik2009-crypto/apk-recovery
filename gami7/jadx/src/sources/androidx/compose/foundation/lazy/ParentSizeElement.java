package androidx.compose.foundation.lazy;

import J.C0268h0;
import J.W0;
import V.n;
import t.C1205A;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class ParentSizeElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6645b;

    /* renamed from: c, reason: collision with root package name */
    public final W0 f6646c;

    /* renamed from: d, reason: collision with root package name */
    public final W0 f6647d = null;

    public ParentSizeElement(float f3, C0268h0 c0268h0) {
        this.f6645b = f3;
        this.f6646c = c0268h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f6645b == parentSizeElement.f6645b && h.a(this.f6646c, parentSizeElement.f6646c) && h.a(this.f6647d, parentSizeElement.f6647d);
    }

    public final int hashCode() {
        W0 w02 = this.f6646c;
        int hashCode = (w02 != null ? w02.hashCode() : 0) * 31;
        W0 w03 = this.f6647d;
        return Float.hashCode(this.f6645b) + ((hashCode + (w03 != null ? w03.hashCode() : 0)) * 31);
    }

    @Override // t0.S
    public final n l() {
        C1205A c1205a = new C1205A();
        c1205a.f10211u = this.f6645b;
        c1205a.f10212v = this.f6646c;
        c1205a.f10213w = this.f6647d;
        return c1205a;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1205A c1205a = (C1205A) nVar;
        c1205a.f10211u = this.f6645b;
        c1205a.f10212v = this.f6646c;
        c1205a.f10213w = this.f6647d;
    }
}
