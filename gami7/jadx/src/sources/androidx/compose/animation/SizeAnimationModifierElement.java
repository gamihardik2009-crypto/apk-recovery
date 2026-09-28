package androidx.compose.animation;

import V.g;
import V.n;
import l.Q;
import m.InterfaceC0817A;
import t0.S;
import y2.e;
import z2.h;

/* loaded from: classes.dex */
final class SizeAnimationModifierElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0817A f6541b;

    /* renamed from: c, reason: collision with root package name */
    public final e f6542c;

    public SizeAnimationModifierElement(InterfaceC0817A interfaceC0817A, e eVar) {
        this.f6541b = interfaceC0817A;
        this.f6542c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        if (!h.a(this.f6541b, sizeAnimationModifierElement.f6541b)) {
            return false;
        }
        g gVar = V.b.f5831h;
        return h.a(gVar, gVar) && h.a(this.f6542c, sizeAnimationModifierElement.f6542c);
    }

    public final int hashCode() {
        int hashCode = (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.f6541b.hashCode() * 31)) * 31;
        e eVar = this.f6542c;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    @Override // t0.S
    public final n l() {
        return new Q(this.f6541b, V.b.f5831h, this.f6542c);
    }

    @Override // t0.S
    public final void m(n nVar) {
        Q q = (Q) nVar;
        q.f8156u = this.f6541b;
        q.f8158w = this.f6542c;
        q.f8157v = V.b.f5831h;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f6541b + ", alignment=" + V.b.f5831h + ", finishedListener=" + this.f6542c + ')';
    }
}
