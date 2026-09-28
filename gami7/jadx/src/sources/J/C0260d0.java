package J;

/* renamed from: J.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260d0 implements InterfaceC0259d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0259d f4127a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4128b;

    /* renamed from: c, reason: collision with root package name */
    public int f4129c;

    public C0260d0(InterfaceC0259d interfaceC0259d, int i2) {
        this.f4127a = interfaceC0259d;
        this.f4128b = i2;
    }

    @Override // J.InterfaceC0259d
    public final void a(int i2, Object obj) {
        this.f4127a.a(i2 + (this.f4129c == 0 ? this.f4128b : 0), obj);
    }

    @Override // J.InterfaceC0259d
    public final void b(Object obj) {
        this.f4129c++;
        this.f4127a.b(obj);
    }

    @Override // J.InterfaceC0259d
    public final void c() {
        int i2 = this.f4129c;
        if (!(i2 > 0)) {
            C0257c.y("OffsetApplier up called with no corresponding down");
            throw null;
        }
        this.f4129c = i2 - 1;
        this.f4127a.c();
    }

    @Override // J.InterfaceC0259d
    public final void clear() {
        C0257c.y("Clear is not valid on OffsetApplier");
        throw null;
    }

    @Override // J.InterfaceC0259d
    public final void d(int i2, Object obj) {
        this.f4127a.d(i2 + (this.f4129c == 0 ? this.f4128b : 0), obj);
    }

    @Override // J.InterfaceC0259d
    public final void f(int i2, int i3, int i4) {
        int i5 = this.f4129c == 0 ? this.f4128b : 0;
        this.f4127a.f(i2 + i5, i3 + i5, i4);
    }

    @Override // J.InterfaceC0259d
    public final Object g() {
        return this.f4127a.g();
    }

    @Override // J.InterfaceC0259d
    public final void h(int i2, int i3) {
        this.f4127a.h(i2 + (this.f4129c == 0 ? this.f4128b : 0), i3);
    }
}
