package m;

/* loaded from: classes.dex */
public final class X implements InterfaceC0817A {

    /* renamed from: a, reason: collision with root package name */
    public final int f8387a;

    public X(int i2) {
        this.f8387a = i2;
    }

    @Override // m.InterfaceC0817A
    public final /* bridge */ /* synthetic */ B0 e() {
        return a(y0.f8602a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof X) && ((X) obj).f8387a == this.f8387a;
    }

    @Override // m.InterfaceC0840m
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final A0 a(x0 x0Var) {
        return new Q2.i(this.f8387a);
    }

    public final int hashCode() {
        return this.f8387a;
    }
}
