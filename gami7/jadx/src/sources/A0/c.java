package A0;

import t0.m0;

/* loaded from: classes.dex */
public final class c extends V.n implements m0 {

    /* renamed from: u, reason: collision with root package name */
    public boolean f20u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f21v;

    /* renamed from: w, reason: collision with root package name */
    public y2.c f22w;

    public c(boolean z3, boolean z4, y2.c cVar) {
        this.f20u = z3;
        this.f21v = z4;
        this.f22w = cVar;
    }

    @Override // t0.m0
    public final boolean a0() {
        return this.f21v;
    }

    @Override // t0.m0
    public final boolean d0() {
        return this.f20u;
    }

    @Override // t0.m0
    public final void k(k kVar) {
        this.f22w.l(kVar);
    }
}
