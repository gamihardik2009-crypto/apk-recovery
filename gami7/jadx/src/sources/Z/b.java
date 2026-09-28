package Z;

import D.c0;
import O0.k;
import V.n;
import n2.AbstractC0946A;
import t0.AbstractC1248f;
import t0.C1238G;
import t0.InterfaceC1257o;
import t0.b0;

/* loaded from: classes.dex */
public final class b extends n implements b0, a, InterfaceC1257o {

    /* renamed from: u, reason: collision with root package name */
    public final c f6376u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6377v;

    /* renamed from: w, reason: collision with root package name */
    public y2.c f6378w;

    public b(c cVar, y2.c cVar2) {
        this.f6376u = cVar;
        this.f6378w = cVar2;
        cVar.f6379h = this;
    }

    @Override // V.n
    public final void D0() {
    }

    public final void K0() {
        this.f6377v = false;
        this.f6376u.f6380i = null;
        AbstractC1248f.n(this);
    }

    @Override // Z.a
    public final O0.b c() {
        return AbstractC1248f.v(this).f10402x;
    }

    @Override // Z.a
    public final long e() {
        return l0.c.U(AbstractC1248f.t(this, 128).f9836j);
    }

    @Override // t0.InterfaceC1257o
    public final void g(C1238G c1238g) {
        boolean z3 = this.f6377v;
        c cVar = this.f6376u;
        if (!z3) {
            cVar.f6380i = null;
            AbstractC1248f.s(this, new c0(this, 6, cVar));
            if (cVar.f6380i == null) {
                AbstractC0946A.s("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f6377v = true;
        }
        f fVar = cVar.f6380i;
        z2.h.c(fVar);
        fVar.f6382a.l(c1238g);
    }

    @Override // Z.a
    public final k getLayoutDirection() {
        return AbstractC1248f.v(this).f10403y;
    }

    @Override // t0.InterfaceC1257o
    public final void j0() {
        K0();
    }

    @Override // t0.b0
    public final void s0() {
        K0();
    }
}
