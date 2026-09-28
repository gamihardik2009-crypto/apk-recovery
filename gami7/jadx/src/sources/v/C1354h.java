package v;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1354h {

    /* renamed from: a, reason: collision with root package name */
    public final int f11345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11346b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11347c;

    public C1354h(int i2, int i3, InterfaceC1364r interfaceC1364r) {
        this.f11345a = i2;
        this.f11346b = i3;
        this.f11347c = interfaceC1364r;
        if (i2 < 0) {
            throw new IllegalArgumentException(B1.t.h("startIndex should be >= 0, but was ", i2).toString());
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException(B1.t.h("size should be >0, but was ", i3).toString());
        }
    }
}
