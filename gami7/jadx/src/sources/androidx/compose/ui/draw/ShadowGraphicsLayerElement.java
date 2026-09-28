package androidx.compose.ui.draw;

import B1.t;
import O0.e;
import V.n;
import c0.C0597p;
import c0.C0603v;
import c0.InterfaceC0576P;
import t0.AbstractC1248f;
import t0.S;
import t0.Z;
import z2.h;

/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6732b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0576P f6733c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6734d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6735e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6736f;

    public ShadowGraphicsLayerElement(float f3, InterfaceC0576P interfaceC0576P, boolean z3, long j3, long j4) {
        this.f6732b = f3;
        this.f6733c = interfaceC0576P;
        this.f6734d = z3;
        this.f6735e = j3;
        this.f6736f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return e.a(this.f6732b, shadowGraphicsLayerElement.f6732b) && h.a(this.f6733c, shadowGraphicsLayerElement.f6733c) && this.f6734d == shadowGraphicsLayerElement.f6734d && C0603v.c(this.f6735e, shadowGraphicsLayerElement.f6735e) && C0603v.c(this.f6736f, shadowGraphicsLayerElement.f6736f);
    }

    public final int hashCode() {
        int f3 = t.f((this.f6733c.hashCode() + (Float.hashCode(this.f6732b) * 31)) * 31, 31, this.f6734d);
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f6736f) + t.d(f3, 31, this.f6735e);
    }

    @Override // t0.S
    public final n l() {
        return new C0597p(new A0.n(22, this));
    }

    @Override // t0.S
    public final void m(n nVar) {
        C0597p c0597p = (C0597p) nVar;
        c0597p.f7268u = new A0.n(22, this);
        Z z3 = AbstractC1248f.t(c0597p, 2).f10548u;
        if (z3 != null) {
            z3.p1(c0597p.f7268u, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) e.b(this.f6732b));
        sb.append(", shape=");
        sb.append(this.f6733c);
        sb.append(", clip=");
        sb.append(this.f6734d);
        sb.append(", ambientColor=");
        t.t(this.f6735e, sb, ", spotColor=");
        sb.append((Object) C0603v.i(this.f6736f));
        sb.append(')');
        return sb.toString();
    }
}
