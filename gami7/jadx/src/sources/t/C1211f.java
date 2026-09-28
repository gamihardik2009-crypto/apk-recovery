package t;

import n2.AbstractC0961m;
import t0.C1236E;
import v.InterfaceC1363q;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1211f implements InterfaceC1363q {

    /* renamed from: a, reason: collision with root package name */
    public final C1228w f10234a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10235b;

    public C1211f(C1228w c1228w, int i2) {
        this.f10234a = c1228w;
        this.f10235b = i2;
    }

    @Override // v.InterfaceC1363q
    public final int a() {
        return this.f10234a.h().f10299m;
    }

    @Override // v.InterfaceC1363q
    public final int b() {
        return Math.min(a() - 1, ((C1220o) AbstractC0961m.M(this.f10234a.h().f10296j)).f10303a + this.f10235b);
    }

    @Override // v.InterfaceC1363q
    public final int c() {
        return Math.max(0, this.f10234a.f10346d.a() - this.f10235b);
    }

    @Override // v.InterfaceC1363q
    public final boolean d() {
        return !this.f10234a.h().f10296j.isEmpty();
    }

    @Override // v.InterfaceC1363q
    public final void e() {
        C1236E c1236e = this.f10234a.f10353k;
        if (c1236e != null) {
            c1236e.k();
        }
    }
}
