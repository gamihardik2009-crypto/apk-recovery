package T;

/* renamed from: T.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377e extends AbstractC0379g {

    /* renamed from: e, reason: collision with root package name */
    public final y2.c f5681e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0379g f5682f;

    public C0377e(int i2, l lVar, y2.c cVar, AbstractC0379g abstractC0379g) {
        super(i2, lVar);
        this.f5681e = cVar;
        this.f5682f = abstractC0379g;
        abstractC0379g.k();
    }

    @Override // T.AbstractC0379g
    public final void c() {
        if (this.f5687c) {
            return;
        }
        int i2 = this.f5686b;
        AbstractC0379g abstractC0379g = this.f5682f;
        if (i2 != abstractC0379g.d()) {
            a();
        }
        abstractC0379g.l();
        this.f5687c = true;
        synchronized (n.f5710b) {
            int i3 = this.f5688d;
            if (i3 >= 0) {
                n.u(i3);
                this.f5688d = -1;
            }
        }
    }

    @Override // T.AbstractC0379g
    public final y2.c f() {
        return this.f5681e;
    }

    @Override // T.AbstractC0379g
    public final boolean g() {
        return true;
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
    }

    @Override // T.AbstractC0379g
    public final void n(A a3) {
        K1.m mVar = n.f5709a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // T.AbstractC0379g
    public final AbstractC0379g t(y2.c cVar) {
        return new C0377e(this.f5686b, this.f5685a, n.l(cVar, this.f5681e, true), this.f5682f);
    }
}
