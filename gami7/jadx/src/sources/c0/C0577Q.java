package c0;

import D.C0053w;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.InterfaceC1264w;

/* renamed from: c0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577Q extends V.n implements InterfaceC1264w {

    /* renamed from: A, reason: collision with root package name */
    public float f7223A;

    /* renamed from: B, reason: collision with root package name */
    public float f7224B;

    /* renamed from: C, reason: collision with root package name */
    public float f7225C;

    /* renamed from: D, reason: collision with root package name */
    public float f7226D;
    public long E;
    public InterfaceC0576P F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f7227G;

    /* renamed from: H, reason: collision with root package name */
    public long f7228H;

    /* renamed from: I, reason: collision with root package name */
    public long f7229I;

    /* renamed from: J, reason: collision with root package name */
    public int f7230J;

    /* renamed from: K, reason: collision with root package name */
    public A0.n f7231K;

    /* renamed from: u, reason: collision with root package name */
    public float f7232u;

    /* renamed from: v, reason: collision with root package name */
    public float f7233v;

    /* renamed from: w, reason: collision with root package name */
    public float f7234w;

    /* renamed from: x, reason: collision with root package name */
    public float f7235x;

    /* renamed from: y, reason: collision with root package name */
    public float f7236y;

    /* renamed from: z, reason: collision with root package name */
    public float f7237z;

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        AbstractC1103Q a3 = interfaceC1093G.a(j3);
        return interfaceC1096J.C(a3.f9834h, a3.f9835i, C0971w.f9166h, new C0053w(a3, 16, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f7232u);
        sb.append(", scaleY=");
        sb.append(this.f7233v);
        sb.append(", alpha = ");
        sb.append(this.f7234w);
        sb.append(", translationX=");
        sb.append(this.f7235x);
        sb.append(", translationY=");
        sb.append(this.f7236y);
        sb.append(", shadowElevation=");
        sb.append(this.f7237z);
        sb.append(", rotationX=");
        sb.append(this.f7223A);
        sb.append(", rotationY=");
        sb.append(this.f7224B);
        sb.append(", rotationZ=");
        sb.append(this.f7225C);
        sb.append(", cameraDistance=");
        sb.append(this.f7226D);
        sb.append(", transformOrigin=");
        sb.append((Object) C0580U.d(this.E));
        sb.append(", shape=");
        sb.append(this.F);
        sb.append(", clip=");
        sb.append(this.f7227G);
        sb.append(", renderEffect=null, ambientShadowColor=");
        B1.t.t(this.f7228H, sb, ", spotShadowColor=");
        B1.t.t(this.f7229I, sb, ", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f7230J + ')'));
        sb.append(')');
        return sb.toString();
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
