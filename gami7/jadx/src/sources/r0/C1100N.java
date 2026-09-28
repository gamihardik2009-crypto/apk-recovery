package r0;

import t0.InterfaceC1263v;

/* renamed from: r0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100N extends V.n implements InterfaceC1263v {

    /* renamed from: u, reason: collision with root package name */
    public y2.c f9830u;

    /* renamed from: v, reason: collision with root package name */
    public long f9831v;

    @Override // t0.InterfaceC1263v
    public final void E(long j3) {
        if (O0.j.a(this.f9831v, j3)) {
            return;
        }
        this.f9830u.l(new O0.j(j3));
        this.f9831v = j3;
    }

    @Override // V.n
    public final boolean z0() {
        return true;
    }
}
