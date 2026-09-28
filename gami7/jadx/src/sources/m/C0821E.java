package m;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821E implements InterfaceC0818B {

    /* renamed from: a, reason: collision with root package name */
    public final int f8296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8297b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0851y f8298c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8299d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8300e;

    public C0821E(int i2, int i3, InterfaceC0851y interfaceC0851y) {
        this.f8296a = i2;
        this.f8297b = i3;
        this.f8298c = interfaceC0851y;
        this.f8299d = i2 * 1000000;
        this.f8300e = i3 * 1000000;
    }

    @Override // m.InterfaceC0818B
    public final float b(long j3, float f3, float f4, float f5) {
        float D3 = this.f8296a == 0 ? 1.0f : B1.C.D(j3 - this.f8300e, 0L, this.f8299d) / this.f8299d;
        if (D3 < 0.0f) {
            D3 = 0.0f;
        }
        float a3 = this.f8298c.a(D3 <= 1.0f ? D3 : 1.0f);
        x0 x0Var = y0.f8602a;
        return (f4 * a3) + ((1 - a3) * f3);
    }

    @Override // m.InterfaceC0818B
    public final float c(long j3, float f3, float f4, float f5) {
        long D3 = B1.C.D(j3 - this.f8300e, 0L, this.f8299d);
        if (D3 < 0) {
            return 0.0f;
        }
        if (D3 == 0) {
            return f5;
        }
        return (b(D3, f3, f4, f5) - b(D3 - 1000000, f3, f4, f5)) * 1000.0f;
    }

    @Override // m.InterfaceC0818B
    public final long d(float f3, float f4, float f5) {
        return (this.f8297b + this.f8296a) * 1000000;
    }
}
