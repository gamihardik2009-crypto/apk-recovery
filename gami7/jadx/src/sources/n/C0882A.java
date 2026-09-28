package n;

import c0.C0603v;
import e0.C0652b;
import e0.InterfaceC0654d;
import t0.C1238G;
import t0.InterfaceC1257o;

/* renamed from: n.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882A extends V.n implements InterfaceC1257o {

    /* renamed from: u, reason: collision with root package name */
    public final r.k f8660u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8661v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8662w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8663x;

    public C0882A(r.k kVar) {
        this.f8660u = kVar;
    }

    @Override // V.n
    public final void C0() {
        J2.B.r(y0(), null, 0, new C0917z(this, null), 3);
    }

    @Override // t0.InterfaceC1257o
    public final void g(C1238G c1238g) {
        c1238g.a();
        boolean z3 = this.f8661v;
        C0652b c0652b = c1238g.f10415h;
        if (z3) {
            c1238g.w0(C0603v.b(0.3f, C0603v.f7272b), 0L, (r17 & 4) != 0 ? InterfaceC0654d.v0(c1238g.e(), 0L) : c0652b.e(), 1.0f, e0.g.f7556a, null, (r17 & 64) != 0 ? 3 : 0);
        } else if (this.f8662w || this.f8663x) {
            c1238g.w0(C0603v.b(0.1f, C0603v.f7272b), 0L, (r17 & 4) != 0 ? InterfaceC0654d.v0(c1238g.e(), 0L) : c0652b.e(), 1.0f, e0.g.f7556a, null, (r17 & 64) != 0 ? 3 : 0);
        }
    }
}
