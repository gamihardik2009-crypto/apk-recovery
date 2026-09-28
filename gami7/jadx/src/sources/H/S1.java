package H;

/* loaded from: classes.dex */
public final class S1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1967a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1968b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1969c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1970d;

    public S1(float f3, float f4, float f5, float f6) {
        this.f1967a = f3;
        this.f1968b = f4;
        this.f1969c = f5;
        this.f1970d = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S1)) {
            return false;
        }
        S1 s12 = (S1) obj;
        if (O0.e.a(this.f1967a, s12.f1967a) && O0.e.a(this.f1968b, s12.f1968b) && O0.e.a(this.f1969c, s12.f1969c)) {
            return O0.e.a(this.f1970d, s12.f1970d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1970d) + B1.t.c(this.f1969c, B1.t.c(this.f1968b, Float.hashCode(this.f1967a) * 31, 31), 31);
    }
}
