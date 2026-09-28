package B;

import D.X;
import J.C0257c;
import J.C0274k0;
import J.W;
import t0.InterfaceC1254l;
import t0.InterfaceC1258p;
import t0.Z;
import z.S;

/* loaded from: classes.dex */
public final class B extends V.n implements InterfaceC1254l, InterfaceC1258p {

    /* renamed from: u, reason: collision with root package name */
    public C0007h f142u;

    /* renamed from: v, reason: collision with root package name */
    public S f143v;

    /* renamed from: w, reason: collision with root package name */
    public X f144w;

    /* renamed from: x, reason: collision with root package name */
    public final C0274k0 f145x = C0257c.N(null, W.f4109m);

    public B(C0007h c0007h, S s3, X x2) {
        this.f142u = c0007h;
        this.f143v = s3;
        this.f144w = x2;
    }

    @Override // V.n
    public final void C0() {
        C0007h c0007h = this.f142u;
        if (c0007h.f217a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null".toString());
        }
        c0007h.f217a = this;
    }

    @Override // V.n
    public final void D0() {
        this.f142u.k(this);
    }

    @Override // t0.InterfaceC1258p
    public final void q0(Z z3) {
        this.f145x.setValue(z3);
    }
}
