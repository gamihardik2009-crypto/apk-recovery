package T;

import J.C0257c;
import j.C0736B;

/* loaded from: classes.dex */
public final class F extends C0375c {

    /* renamed from: o, reason: collision with root package name */
    public final C0375c f5656o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5657p;
    public final boolean q;

    /* renamed from: r, reason: collision with root package name */
    public y2.c f5658r;

    /* renamed from: s, reason: collision with root package name */
    public y2.c f5659s;

    /* renamed from: t, reason: collision with root package name */
    public final long f5660t;

    public F(C0375c c0375c, y2.c cVar, y2.c cVar2, boolean z3, boolean z4) {
        super(0, l.f5701l, n.l(cVar, (c0375c == null || (r1 = c0375c.f()) == null) ? ((C0374b) n.f5717i.get()).f5670e : r1, z3), n.b(cVar2, (c0375c == null || (r1 = c0375c.i()) == null) ? ((C0374b) n.f5717i.get()).f5671f : r1));
        y2.c i2;
        y2.c f3;
        this.f5656o = c0375c;
        this.f5657p = z3;
        this.q = z4;
        this.f5658r = this.f5670e;
        this.f5659s = this.f5671f;
        this.f5660t = C0257c.C();
    }

    @Override // T.C0375c
    public final void A(C0736B c0736b) {
        s.g();
        throw null;
    }

    @Override // T.C0375c
    public final C0375c B(y2.c cVar, y2.c cVar2) {
        y2.c l3 = n.l(cVar, this.f5658r, true);
        y2.c b3 = n.b(cVar2, this.f5659s);
        return !this.f5657p ? new F(C().B(null, b3), l3, b3, false, true) : C().B(l3, b3);
    }

    public final C0375c C() {
        C0375c c0375c = this.f5656o;
        return c0375c == null ? (C0375c) n.f5717i.get() : c0375c;
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void c() {
        C0375c c0375c;
        this.f5687c = true;
        if (!this.q || (c0375c = this.f5656o) == null) {
            return;
        }
        c0375c.c();
    }

    @Override // T.AbstractC0379g
    public final int d() {
        return C().d();
    }

    @Override // T.AbstractC0379g
    public final l e() {
        return C().e();
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final y2.c f() {
        return this.f5658r;
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final boolean g() {
        return C().g();
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final int h() {
        return C().h();
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final y2.c i() {
        return this.f5659s;
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void k() {
        s.g();
        throw null;
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void l() {
        s.g();
        throw null;
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void m() {
        C().m();
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void n(A a3) {
        C().n(a3);
    }

    @Override // T.AbstractC0379g
    public final void q(int i2) {
        s.g();
        throw null;
    }

    @Override // T.AbstractC0379g
    public final void r(l lVar) {
        s.g();
        throw null;
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final void s(int i2) {
        C().s(i2);
    }

    @Override // T.C0375c, T.AbstractC0379g
    public final AbstractC0379g t(y2.c cVar) {
        y2.c l3 = n.l(cVar, this.f5658r, true);
        return !this.f5657p ? n.h(C().t(null), l3, true) : C().t(l3);
    }

    @Override // T.C0375c
    public final s v() {
        return C().v();
    }

    @Override // T.C0375c
    public final C0736B w() {
        return C().w();
    }

    @Override // T.C0375c
    /* renamed from: x */
    public final y2.c f() {
        return this.f5658r;
    }
}
