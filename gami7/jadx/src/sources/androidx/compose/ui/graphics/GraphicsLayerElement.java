package androidx.compose.ui.graphics;

import B1.t;
import V.n;
import c0.AbstractC0571K;
import c0.C0577Q;
import c0.C0580U;
import c0.C0603v;
import c0.InterfaceC0576P;
import t0.AbstractC1248f;
import t0.S;
import t0.Z;
import z2.h;

/* loaded from: classes.dex */
final class GraphicsLayerElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6752b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6753c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6754d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6755e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6756f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6757g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6758h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6759i;

    /* renamed from: j, reason: collision with root package name */
    public final float f6760j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6761k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6762l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0576P f6763m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6764n;

    /* renamed from: o, reason: collision with root package name */
    public final long f6765o;

    /* renamed from: p, reason: collision with root package name */
    public final long f6766p;
    public final int q;

    public GraphicsLayerElement(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j3, InterfaceC0576P interfaceC0576P, boolean z3, long j4, long j5, int i2) {
        this.f6752b = f3;
        this.f6753c = f4;
        this.f6754d = f5;
        this.f6755e = f6;
        this.f6756f = f7;
        this.f6757g = f8;
        this.f6758h = f9;
        this.f6759i = f10;
        this.f6760j = f11;
        this.f6761k = f12;
        this.f6762l = j3;
        this.f6763m = interfaceC0576P;
        this.f6764n = z3;
        this.f6765o = j4;
        this.f6766p = j5;
        this.q = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f6752b, graphicsLayerElement.f6752b) == 0 && Float.compare(this.f6753c, graphicsLayerElement.f6753c) == 0 && Float.compare(this.f6754d, graphicsLayerElement.f6754d) == 0 && Float.compare(this.f6755e, graphicsLayerElement.f6755e) == 0 && Float.compare(this.f6756f, graphicsLayerElement.f6756f) == 0 && Float.compare(this.f6757g, graphicsLayerElement.f6757g) == 0 && Float.compare(this.f6758h, graphicsLayerElement.f6758h) == 0 && Float.compare(this.f6759i, graphicsLayerElement.f6759i) == 0 && Float.compare(this.f6760j, graphicsLayerElement.f6760j) == 0 && Float.compare(this.f6761k, graphicsLayerElement.f6761k) == 0 && C0580U.a(this.f6762l, graphicsLayerElement.f6762l) && h.a(this.f6763m, graphicsLayerElement.f6763m) && this.f6764n == graphicsLayerElement.f6764n && h.a(null, null) && C0603v.c(this.f6765o, graphicsLayerElement.f6765o) && C0603v.c(this.f6766p, graphicsLayerElement.f6766p) && AbstractC0571K.n(this.q, graphicsLayerElement.q);
    }

    public final int hashCode() {
        int c3 = t.c(this.f6761k, t.c(this.f6760j, t.c(this.f6759i, t.c(this.f6758h, t.c(this.f6757g, t.c(this.f6756f, t.c(this.f6755e, t.c(this.f6754d, t.c(this.f6753c, Float.hashCode(this.f6752b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i2 = C0580U.f7241c;
        int f3 = t.f((this.f6763m.hashCode() + t.d(c3, 31, this.f6762l)) * 31, 961, this.f6764n);
        int i3 = C0603v.f7278h;
        return Integer.hashCode(this.q) + t.d(t.d(f3, 31, this.f6765o), 31, this.f6766p);
    }

    @Override // t0.S
    public final n l() {
        C0577Q c0577q = new C0577Q();
        c0577q.f7232u = this.f6752b;
        c0577q.f7233v = this.f6753c;
        c0577q.f7234w = this.f6754d;
        c0577q.f7235x = this.f6755e;
        c0577q.f7236y = this.f6756f;
        c0577q.f7237z = this.f6757g;
        c0577q.f7223A = this.f6758h;
        c0577q.f7224B = this.f6759i;
        c0577q.f7225C = this.f6760j;
        c0577q.f7226D = this.f6761k;
        c0577q.E = this.f6762l;
        c0577q.F = this.f6763m;
        c0577q.f7227G = this.f6764n;
        c0577q.f7228H = this.f6765o;
        c0577q.f7229I = this.f6766p;
        c0577q.f7230J = this.q;
        c0577q.f7231K = new A0.n(23, c0577q);
        return c0577q;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C0577Q c0577q = (C0577Q) nVar;
        c0577q.f7232u = this.f6752b;
        c0577q.f7233v = this.f6753c;
        c0577q.f7234w = this.f6754d;
        c0577q.f7235x = this.f6755e;
        c0577q.f7236y = this.f6756f;
        c0577q.f7237z = this.f6757g;
        c0577q.f7223A = this.f6758h;
        c0577q.f7224B = this.f6759i;
        c0577q.f7225C = this.f6760j;
        c0577q.f7226D = this.f6761k;
        c0577q.E = this.f6762l;
        c0577q.F = this.f6763m;
        c0577q.f7227G = this.f6764n;
        c0577q.f7228H = this.f6765o;
        c0577q.f7229I = this.f6766p;
        c0577q.f7230J = this.q;
        Z z3 = AbstractC1248f.t(c0577q, 2).f10548u;
        if (z3 != null) {
            z3.p1(c0577q.f7231K, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f6752b);
        sb.append(", scaleY=");
        sb.append(this.f6753c);
        sb.append(", alpha=");
        sb.append(this.f6754d);
        sb.append(", translationX=");
        sb.append(this.f6755e);
        sb.append(", translationY=");
        sb.append(this.f6756f);
        sb.append(", shadowElevation=");
        sb.append(this.f6757g);
        sb.append(", rotationX=");
        sb.append(this.f6758h);
        sb.append(", rotationY=");
        sb.append(this.f6759i);
        sb.append(", rotationZ=");
        sb.append(this.f6760j);
        sb.append(", cameraDistance=");
        sb.append(this.f6761k);
        sb.append(", transformOrigin=");
        sb.append((Object) C0580U.d(this.f6762l));
        sb.append(", shape=");
        sb.append(this.f6763m);
        sb.append(", clip=");
        sb.append(this.f6764n);
        sb.append(", renderEffect=null, ambientShadowColor=");
        t.t(this.f6765o, sb, ", spotShadowColor=");
        sb.append((Object) C0603v.i(this.f6766p));
        sb.append(", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.q + ')'));
        sb.append(')');
        return sb.toString();
    }
}
