package m;

/* loaded from: classes.dex */
public final class Z implements InterfaceC0817A {

    /* renamed from: a, reason: collision with root package name */
    public final float f8395a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8396b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8397c;

    public Z(float f3, float f4, Object obj) {
        this.f8395a = f3;
        this.f8396b = f4;
        this.f8397c = obj;
    }

    @Override // m.InterfaceC0840m
    public final z0 a(x0 x0Var) {
        Object obj = this.f8397c;
        return new B.F(this.f8395a, this.f8396b, obj == null ? null : (AbstractC0845s) x0Var.f8600a.l(obj));
    }

    @Override // m.InterfaceC0817A
    public final B0 e() {
        x0 x0Var = y0.f8602a;
        Object obj = this.f8397c;
        return new B.F(this.f8395a, this.f8396b, obj == null ? null : new C0842o(((Number) obj).floatValue()));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z3 = (Z) obj;
        return z3.f8395a == this.f8395a && z3.f8396b == this.f8396b && z2.h.a(z3.f8397c, this.f8397c);
    }

    public final int hashCode() {
        Object obj = this.f8397c;
        return Float.hashCode(this.f8396b) + B1.t.c(this.f8395a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ Z(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
