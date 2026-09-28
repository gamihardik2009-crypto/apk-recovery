package androidx.compose.foundation.layout;

import V.n;
import m.AbstractC0837j;
import s.C1153F;
import t0.S;

/* loaded from: classes.dex */
final class IntrinsicWidthElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final int f6616b = 2;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f6616b == intrinsicWidthElement.f6616b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (AbstractC0837j.d(this.f6616b) * 31);
    }

    @Override // t0.S
    public final n l() {
        C1153F c1153f = new C1153F();
        c1153f.f10052u = this.f6616b;
        c1153f.f10053v = true;
        return c1153f;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1153F c1153f = (C1153F) nVar;
        c1153f.f10052u = this.f6616b;
        c1153f.f10053v = true;
    }
}
