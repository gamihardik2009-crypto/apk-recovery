package androidx.compose.ui.layout;

import V.n;
import r0.C1099M;
import t0.S;
import y2.c;

/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final c f6778b;

    public OnGloballyPositionedElement(c cVar) {
        this.f6778b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f6778b == ((OnGloballyPositionedElement) obj).f6778b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6778b.hashCode();
    }

    @Override // t0.S
    public final n l() {
        C1099M c1099m = new C1099M();
        c1099m.f9829u = this.f6778b;
        return c1099m;
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((C1099M) nVar).f9829u = this.f6778b;
    }
}
