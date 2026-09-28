package androidx.compose.foundation;

import V.n;
import r.l;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class HoverableElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final l f6558b;

    public HoverableElement(l lVar) {
        this.f6558b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && h.a(((HoverableElement) obj).f6558b, this.f6558b);
    }

    public final int hashCode() {
        return this.f6558b.hashCode() * 31;
    }

    @Override // t0.S
    public final n l() {
        n.S s3 = new n.S();
        s3.f8714u = this.f6558b;
        return s3;
    }

    @Override // t0.S
    public final void m(n nVar) {
        n.S s3 = (n.S) nVar;
        l lVar = s3.f8714u;
        l lVar2 = this.f6558b;
        if (h.a(lVar, lVar2)) {
            return;
        }
        s3.M0();
        s3.f8714u = lVar2;
    }
}
