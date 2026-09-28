package T;

/* renamed from: T.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378f extends AbstractC0379g {

    /* renamed from: e, reason: collision with root package name */
    public final y2.c f5683e;

    /* renamed from: f, reason: collision with root package name */
    public int f5684f;

    public C0378f(int i2, l lVar, y2.c cVar) {
        super(i2, lVar);
        this.f5683e = cVar;
        this.f5684f = 1;
    }

    @Override // T.AbstractC0379g
    public final void c() {
        if (this.f5687c) {
            return;
        }
        l();
        this.f5687c = true;
        synchronized (n.f5710b) {
            int i2 = this.f5688d;
            if (i2 >= 0) {
                n.u(i2);
                this.f5688d = -1;
            }
        }
    }

    @Override // T.AbstractC0379g
    public final y2.c f() {
        return this.f5683e;
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
        this.f5684f++;
    }

    @Override // T.AbstractC0379g
    public final void l() {
        int i2 = this.f5684f - 1;
        this.f5684f = i2;
        if (i2 == 0) {
            a();
        }
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
        n.d(this);
        return new C0377e(this.f5686b, this.f5685a, n.l(cVar, this.f5683e, true), this);
    }
}
