package m;

/* loaded from: classes.dex */
public final class h0 implements InterfaceC0836i {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f8489a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f8490b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8491c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8492d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0845s f8493e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0845s f8494f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0845s f8495g;

    /* renamed from: h, reason: collision with root package name */
    public long f8496h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC0845s f8497i;

    public h0(InterfaceC0840m interfaceC0840m, x0 x0Var, Object obj, Object obj2, AbstractC0845s abstractC0845s) {
        this.f8489a = interfaceC0840m.a(x0Var);
        this.f8490b = x0Var;
        this.f8491c = obj2;
        this.f8492d = obj;
        this.f8493e = (AbstractC0845s) x0Var.f8600a.l(obj);
        y2.c cVar = x0Var.f8600a;
        this.f8494f = (AbstractC0845s) cVar.l(obj2);
        this.f8495g = abstractC0845s != null ? AbstractC0831e.i(abstractC0845s) : ((AbstractC0845s) cVar.l(obj)).c();
        this.f8496h = -1L;
    }

    @Override // m.InterfaceC0836i
    public final boolean a() {
        return this.f8489a.a();
    }

    @Override // m.InterfaceC0836i
    public final Object b(long j3) {
        if (f(j3)) {
            return this.f8491c;
        }
        AbstractC0845s g3 = this.f8489a.g(j3, this.f8493e, this.f8494f, this.f8495g);
        int b3 = g3.b();
        for (int i2 = 0; i2 < b3; i2++) {
            if (!(!Float.isNaN(g3.a(i2)))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + g3 + ". Animation: " + this + ", playTimeNanos: " + j3);
            }
        }
        return this.f8490b.f8601b.l(g3);
    }

    @Override // m.InterfaceC0836i
    public final long c() {
        if (this.f8496h < 0) {
            this.f8496h = this.f8489a.b(this.f8493e, this.f8494f, this.f8495g);
        }
        return this.f8496h;
    }

    @Override // m.InterfaceC0836i
    public final x0 d() {
        return this.f8490b;
    }

    @Override // m.InterfaceC0836i
    public final Object e() {
        return this.f8491c;
    }

    @Override // m.InterfaceC0836i
    public final AbstractC0845s g(long j3) {
        if (!f(j3)) {
            return this.f8489a.e(j3, this.f8493e, this.f8494f, this.f8495g);
        }
        AbstractC0845s abstractC0845s = this.f8497i;
        if (abstractC0845s != null) {
            return abstractC0845s;
        }
        AbstractC0845s k3 = this.f8489a.k(this.f8493e, this.f8494f, this.f8495g);
        this.f8497i = k3;
        return k3;
    }

    public final void h(Object obj) {
        if (z2.h.a(obj, this.f8492d)) {
            return;
        }
        this.f8492d = obj;
        this.f8493e = (AbstractC0845s) this.f8490b.f8600a.l(obj);
        this.f8497i = null;
        this.f8496h = -1L;
    }

    public final void i(Object obj) {
        if (z2.h.a(this.f8491c, obj)) {
            return;
        }
        this.f8491c = obj;
        this.f8494f = (AbstractC0845s) this.f8490b.f8600a.l(obj);
        this.f8497i = null;
        this.f8496h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f8492d + " -> " + this.f8491c + ",initial velocity: " + this.f8495g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f8489a;
    }
}
