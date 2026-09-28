package androidx.compose.foundation.layout;

import V.n;
import m.AbstractC0837j;
import s.C1185y;
import t0.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FillElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final int f6613b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6614c;

    public FillElement(float f3, int i2) {
        this.f6613b = i2;
        this.f6614c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f6613b == fillElement.f6613b && this.f6614c == fillElement.f6614c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6614c) + (AbstractC0837j.d(this.f6613b) * 31);
    }

    @Override // t0.S
    public final n l() {
        C1185y c1185y = new C1185y();
        c1185y.f10186u = this.f6613b;
        c1185y.f10187v = this.f6614c;
        return c1185y;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1185y c1185y = (C1185y) nVar;
        c1185y.f10186u = this.f6613b;
        c1185y.f10187v = this.f6614c;
    }
}
