package J;

/* loaded from: classes.dex */
public final class B extends AbstractC0286q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3967b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3968c;

    public B(L0 l02, y2.a aVar) {
        super(aVar);
        this.f3968c = l02;
    }

    @Override // J.AbstractC0286q0
    public final C0287r0 a(Object obj) {
        switch (this.f3967b) {
            case 0:
                return new C0287r0(this, obj, obj == null, null, true);
            default:
                return new C0287r0(this, obj, obj == null, (L0) this.f3968c, true);
        }
    }

    @Override // J.AbstractC0286q0
    public Z0 b() {
        switch (this.f3967b) {
            case 0:
                return (C) this.f3968c;
            default:
                return super.b();
        }
    }

    public B() {
        super(A.f3966i);
        this.f3968c = new C();
    }
}
