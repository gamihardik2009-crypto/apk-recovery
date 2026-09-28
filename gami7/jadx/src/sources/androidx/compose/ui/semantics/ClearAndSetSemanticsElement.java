package androidx.compose.ui.semantics;

import A0.k;
import A0.l;
import V.n;
import t0.S;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends S implements l {

    /* renamed from: b, reason: collision with root package name */
    public final c f6789b;

    public ClearAndSetSemanticsElement(c cVar) {
        this.f6789b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && h.a(this.f6789b, ((ClearAndSetSemanticsElement) obj).f6789b);
    }

    public final int hashCode() {
        return this.f6789b.hashCode();
    }

    @Override // A0.l
    public final k j() {
        k kVar = new k();
        kVar.f61i = false;
        kVar.f62j = true;
        this.f6789b.l(kVar);
        return kVar;
    }

    @Override // t0.S
    public final n l() {
        return new A0.c(false, true, this.f6789b);
    }

    @Override // t0.S
    public final void m(n nVar) {
        ((A0.c) nVar).f22w = this.f6789b;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f6789b + ')';
    }
}
