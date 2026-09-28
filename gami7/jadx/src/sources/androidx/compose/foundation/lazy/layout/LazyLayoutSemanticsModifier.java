package androidx.compose.foundation.lazy.layout;

import B1.t;
import V.n;
import p.X;
import t0.AbstractC1248f;
import t0.S;
import v.C1343O;
import v.InterfaceC1339K;
import z2.h;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends S {

    /* renamed from: b, reason: collision with root package name */
    public final y2.a f6649b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1339K f6650c;

    /* renamed from: d, reason: collision with root package name */
    public final X f6651d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6652e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6653f;

    public LazyLayoutSemanticsModifier(F2.c cVar, InterfaceC1339K interfaceC1339K, X x2, boolean z3, boolean z4) {
        this.f6649b = cVar;
        this.f6650c = interfaceC1339K;
        this.f6651d = x2;
        this.f6652e = z3;
        this.f6653f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f6649b == lazyLayoutSemanticsModifier.f6649b && h.a(this.f6650c, lazyLayoutSemanticsModifier.f6650c) && this.f6651d == lazyLayoutSemanticsModifier.f6651d && this.f6652e == lazyLayoutSemanticsModifier.f6652e && this.f6653f == lazyLayoutSemanticsModifier.f6653f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6653f) + t.f((this.f6651d.hashCode() + ((this.f6650c.hashCode() + (this.f6649b.hashCode() * 31)) * 31)) * 31, 31, this.f6652e);
    }

    @Override // t0.S
    public final n l() {
        return new C1343O(this.f6649b, this.f6650c, this.f6651d, this.f6652e, this.f6653f);
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1343O c1343o = (C1343O) nVar;
        c1343o.f11302u = this.f6649b;
        c1343o.f11303v = this.f6650c;
        X x2 = c1343o.f11304w;
        X x3 = this.f6651d;
        if (x2 != x3) {
            c1343o.f11304w = x3;
            AbstractC1248f.p(c1343o);
        }
        boolean z3 = c1343o.f11305x;
        boolean z4 = this.f6652e;
        boolean z5 = this.f6653f;
        if (z3 == z4 && c1343o.f11306y == z5) {
            return;
        }
        c1343o.f11305x = z4;
        c1343o.f11306y = z5;
        c1343o.K0();
        AbstractC1248f.p(c1343o);
    }
}
