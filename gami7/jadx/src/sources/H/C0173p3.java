package H;

/* renamed from: H.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173p3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f3001a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3002b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3003c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3004d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3005e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3006f;

    public C0173p3(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f3001a = f3;
        this.f3002b = f4;
        this.f3003c = f5;
        this.f3004d = f6;
        this.f3005e = f7;
        this.f3006f = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0173p3)) {
            return false;
        }
        C0173p3 c0173p3 = (C0173p3) obj;
        return O0.e.a(this.f3001a, c0173p3.f3001a) && O0.e.a(this.f3002b, c0173p3.f3002b) && O0.e.a(this.f3003c, c0173p3.f3003c) && O0.e.a(this.f3004d, c0173p3.f3004d) && O0.e.a(this.f3006f, c0173p3.f3006f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3006f) + B1.t.c(this.f3004d, B1.t.c(this.f3003c, B1.t.c(this.f3002b, Float.hashCode(this.f3001a) * 31, 31), 31), 31);
    }
}
