package H;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final float f1722a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1723b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1724c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1725d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1726e;

    public M(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f1722a = f3;
        this.f1723b = f4;
        this.f1724c = f5;
        this.f1725d = f6;
        this.f1726e = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M)) {
            return false;
        }
        M m3 = (M) obj;
        return O0.e.a(this.f1722a, m3.f1722a) && O0.e.a(this.f1723b, m3.f1723b) && O0.e.a(this.f1724c, m3.f1724c) && O0.e.a(this.f1725d, m3.f1725d) && O0.e.a(this.f1726e, m3.f1726e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1726e) + B1.t.c(this.f1725d, B1.t.c(this.f1724c, B1.t.c(this.f1723b, Float.hashCode(this.f1722a) * 31, 31), 31), 31);
    }
}
