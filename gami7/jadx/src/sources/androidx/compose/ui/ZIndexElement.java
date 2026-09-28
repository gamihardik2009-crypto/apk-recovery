package androidx.compose.ui;

import B1.t;
import V.n;
import V.s;
import t0.S;

/* loaded from: classes.dex */
public final class ZIndexElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6722b;

    public ZIndexElement(float f3) {
        this.f6722b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f6722b, ((ZIndexElement) obj).f6722b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6722b);
    }

    @Override // t0.S
    public final n l() {
        s sVar = new s();
        sVar.f5878u = this.f6722b;
        return sVar;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((s) nVar).f5878u = this.f6722b;
    }

    public final String toString() {
        return t.i(new StringBuilder("ZIndexElement(zIndex="), this.f6722b, ')');
    }
}
