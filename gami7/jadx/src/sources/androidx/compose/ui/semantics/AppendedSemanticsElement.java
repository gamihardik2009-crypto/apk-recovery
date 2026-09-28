package androidx.compose.ui.semantics;

import A0.k;
import A0.l;
import V.n;
import t0.S;
import y2.c;
import z2.h;

/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends S implements l {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6787b;

    /* renamed from: c, reason: collision with root package name */
    public final c f6788c;

    public AppendedSemanticsElement(c cVar, boolean z3) {
        this.f6787b = z3;
        this.f6788c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f6787b == appendedSemanticsElement.f6787b && h.a(this.f6788c, appendedSemanticsElement.f6788c);
    }

    public final int hashCode() {
        return this.f6788c.hashCode() + (Boolean.hashCode(this.f6787b) * 31);
    }

    @Override // A0.l
    public final k j() {
        k kVar = new k();
        kVar.f61i = this.f6787b;
        this.f6788c.l(kVar);
        return kVar;
    }

    @Override // t0.S
    public final n l() {
        return new A0.c(this.f6787b, false, this.f6788c);
    }

    @Override // t0.S
    public final void m(n nVar) {
        A0.c cVar = (A0.c) nVar;
        cVar.f20u = this.f6787b;
        cVar.f22w = this.f6788c;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f6787b + ", properties=" + this.f6788c + ')';
    }
}
