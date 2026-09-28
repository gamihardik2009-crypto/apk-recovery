package m;

/* loaded from: classes.dex */
public final class w0 implements InterfaceC0817A {

    /* renamed from: a, reason: collision with root package name */
    public final int f8596a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8597b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0851y f8598c;

    public w0(int i2, InterfaceC0851y interfaceC0851y, int i3) {
        this(i2, 0, (i3 & 4) != 0 ? AbstractC0852z.f8611a : interfaceC0851y);
    }

    @Override // m.InterfaceC0840m
    public final z0 a(x0 x0Var) {
        return new D0(this.f8596a, this.f8597b, this.f8598c);
    }

    @Override // m.InterfaceC0817A
    public final B0 e() {
        x0 x0Var = y0.f8602a;
        return new D0(this.f8596a, this.f8597b, this.f8598c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return w0Var.f8596a == this.f8596a && w0Var.f8597b == this.f8597b && z2.h.a(w0Var.f8598c, this.f8598c);
    }

    public final int hashCode() {
        return ((this.f8598c.hashCode() + (this.f8596a * 31)) * 31) + this.f8597b;
    }

    public w0(int i2, int i3, InterfaceC0851y interfaceC0851y) {
        this.f8596a = i2;
        this.f8597b = i3;
        this.f8598c = interfaceC0851y;
    }
}
