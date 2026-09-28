package androidx.compose.ui.layout;

import V.n;
import r0.C1100N;
import t0.S;
import y2.c;

/* loaded from: classes.dex */
final class OnSizeChangedModifier extends S {

    /* renamed from: b, reason: collision with root package name */
    public final c f6779b;

    public OnSizeChangedModifier(c cVar) {
        this.f6779b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f6779b == ((OnSizeChangedModifier) obj).f6779b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6779b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        c cVar = this.f6779b;
        C1100N c1100n = new C1100N();
        c1100n.f9830u = cVar;
        c1100n.f9831v = l0.c.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return c1100n;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1100N c1100n = (C1100N) nVar;
        c1100n.f9830u = this.f6779b;
        c1100n.f9831v = l0.c.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
