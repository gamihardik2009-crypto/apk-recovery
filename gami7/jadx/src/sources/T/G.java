package T;

import J.C0257c;

/* loaded from: classes.dex */
public final class G extends AbstractC0379g {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0379g f5661e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5662f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5663g;

    /* renamed from: h, reason: collision with root package name */
    public y2.c f5664h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5665i;

    public G(AbstractC0379g abstractC0379g, y2.c cVar, boolean z3) {
        super(0, l.f5701l);
        y2.c f3;
        this.f5661e = abstractC0379g;
        this.f5662f = false;
        this.f5663g = z3;
        this.f5664h = n.l(cVar, (abstractC0379g == null || (f3 = abstractC0379g.f()) == null) ? ((C0374b) n.f5717i.get()).f5670e : f3, false);
        this.f5665i = C0257c.C();
    }

    @Override // T.AbstractC0379g
    public final void c() {
        AbstractC0379g abstractC0379g;
        this.f5687c = true;
        if (!this.f5663g || (abstractC0379g = this.f5661e) == null) {
            return;
        }
        abstractC0379g.c();
    }

    @Override // T.AbstractC0379g
    public final int d() {
        return u().d();
    }

    @Override // T.AbstractC0379g
    public final l e() {
        return u().e();
    }

    @Override // T.AbstractC0379g
    public final y2.c f() {
        return this.f5664h;
    }

    @Override // T.AbstractC0379g
    public final boolean g() {
        return u().g();
    }

    @Override // T.AbstractC0379g
    public final y2.c i() {
        return null;
    }

    @Override // T.AbstractC0379g
    public final void k() {
        s.g();
        throw null;
    }

    @Override // T.AbstractC0379g
    public final void l() {
        s.g();
        throw null;
    }

    @Override // T.AbstractC0379g
    public final void m() {
        u().m();
    }

    @Override // T.AbstractC0379g
    public final void n(A a3) {
        u().n(a3);
    }

    @Override // T.AbstractC0379g
    public final AbstractC0379g t(y2.c cVar) {
        y2.c l3 = n.l(cVar, this.f5664h, true);
        return !this.f5662f ? n.h(u().t(null), l3, true) : u().t(l3);
    }

    public final AbstractC0379g u() {
        AbstractC0379g abstractC0379g = this.f5661e;
        return abstractC0379g == null ? (AbstractC0379g) n.f5717i.get() : abstractC0379g;
    }
}
