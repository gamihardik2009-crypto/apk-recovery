package n;

/* loaded from: classes.dex */
public final class t0 extends V.n implements t0.m0 {

    /* renamed from: u, reason: collision with root package name */
    public w0 f8852u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8853v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8854w;

    @Override // t0.m0
    public final void k(A0.k kVar) {
        A0.w.h(kVar);
        A0.i iVar = new A0.i(new s0(this, 0), new s0(this, 1), this.f8853v);
        if (this.f8854w) {
            A0.x xVar = A0.t.f110p;
            F2.d dVar = A0.w.f123a[11];
            xVar.a(kVar, iVar);
        } else {
            A0.x xVar2 = A0.t.f109o;
            F2.d dVar2 = A0.w.f123a[10];
            xVar2.a(kVar, iVar);
        }
    }
}
