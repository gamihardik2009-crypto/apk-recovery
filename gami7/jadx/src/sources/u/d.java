package u;

import n2.AbstractC0961m;
import t0.C1236E;
import v.InterfaceC1363q;

/* loaded from: classes.dex */
public final class d implements InterfaceC1363q {

    /* renamed from: a, reason: collision with root package name */
    public final x f10672a;

    public d(x xVar) {
        this.f10672a = xVar;
    }

    @Override // v.InterfaceC1363q
    public final int a() {
        return this.f10672a.g().f10750j;
    }

    @Override // v.InterfaceC1363q
    public final int b() {
        return ((q) AbstractC0961m.M(this.f10672a.g().f10747g)).f10755a;
    }

    @Override // v.InterfaceC1363q
    public final int c() {
        return this.f10672a.f10796b.a();
    }

    @Override // v.InterfaceC1363q
    public final boolean d() {
        return !this.f10672a.g().f10747g.isEmpty();
    }

    @Override // v.InterfaceC1363q
    public final void e() {
        C1236E c1236e = this.f10672a.f10802h;
        if (c1236e != null) {
            c1236e.k();
        }
    }
}
