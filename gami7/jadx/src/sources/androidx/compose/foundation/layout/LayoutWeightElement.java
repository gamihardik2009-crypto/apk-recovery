package androidx.compose.foundation.layout;

import V.n;
import s.C1154G;
import t0.S;

/* loaded from: classes.dex */
public final class LayoutWeightElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6617b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6618c;

    public LayoutWeightElement(float f3, boolean z3) {
        this.f6617b = f3;
        this.f6618c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f6617b == layoutWeightElement.f6617b && this.f6618c == layoutWeightElement.f6618c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6618c) + (Float.hashCode(this.f6617b) * 31);
    }

    @Override // t0.S
    public final n l() {
        C1154G c1154g = new C1154G();
        c1154g.f10054u = this.f6617b;
        c1154g.f10055v = this.f6618c;
        return c1154g;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1154G c1154g = (C1154G) nVar;
        c1154g.f10054u = this.f6617b;
        c1154g.f10055v = this.f6618c;
    }
}
