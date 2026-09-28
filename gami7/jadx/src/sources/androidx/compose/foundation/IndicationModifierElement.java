package androidx.compose.foundation;

import V.n;
import n.C0882A;
import n.C0883B;
import n.X;
import r.k;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
final class IndicationModifierElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final k f6559b;

    /* renamed from: c, reason: collision with root package name */
    public final C0883B f6560c;

    public IndicationModifierElement(k kVar, C0883B c0883b) {
        this.f6559b = kVar;
        this.f6560c = c0883b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return h.a(this.f6559b, indicationModifierElement.f6559b) && h.a(this.f6560c, indicationModifierElement.f6560c);
    }

    public final int hashCode() {
        int hashCode = this.f6559b.hashCode() * 31;
        this.f6560c.getClass();
        return hashCode - 1;
    }

    @Override // t0.S
    public final n l() {
        this.f6560c.getClass();
        C0882A c0882a = new C0882A(this.f6559b);
        X x2 = new X();
        x2.f8720w = c0882a;
        x2.K0(c0882a);
        return x2;
    }

    @Override // t0.S
    public final void m(n nVar) {
        X x2 = (X) nVar;
        this.f6560c.getClass();
        C0882A c0882a = new C0882A(this.f6559b);
        x2.L0(x2.f8720w);
        x2.f8720w = c0882a;
        x2.K0(c0882a);
    }
}
