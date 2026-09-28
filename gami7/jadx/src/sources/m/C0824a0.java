package m;

/* renamed from: m.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824a0 implements InterfaceC0840m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0840m f8403a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8404b;

    public C0824a0(InterfaceC0817A interfaceC0817A, long j3) {
        this.f8403a = interfaceC0817A;
        this.f8404b = j3;
    }

    @Override // m.InterfaceC0840m
    public final z0 a(x0 x0Var) {
        return new C0826b0(this.f8403a.a(x0Var), this.f8404b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0824a0)) {
            return false;
        }
        C0824a0 c0824a0 = (C0824a0) obj;
        return c0824a0.f8404b == this.f8404b && z2.h.a(c0824a0.f8403a, this.f8403a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8404b) + (this.f8403a.hashCode() * 31);
    }
}
