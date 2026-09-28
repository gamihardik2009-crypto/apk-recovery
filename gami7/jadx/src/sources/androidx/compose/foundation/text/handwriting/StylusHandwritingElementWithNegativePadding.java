package androidx.compose.foundation.text.handwriting;

import A.d;
import V.n;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends S {

    /* renamed from: b, reason: collision with root package name */
    public final y2.a f6697b;

    public StylusHandwritingElementWithNegativePadding(y2.a aVar) {
        this.f6697b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && h.a(this.f6697b, ((StylusHandwritingElementWithNegativePadding) obj).f6697b);
    }

    public final int hashCode() {
        return this.f6697b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        return new d(this.f6697b);
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((d) nVar).f12w = this.f6697b;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f6697b + ')';
    }
}
