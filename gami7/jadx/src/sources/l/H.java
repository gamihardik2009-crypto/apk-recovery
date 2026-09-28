package l;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final float f8134a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8135b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8136c;

    public H(float f3, float f4, long j3) {
        this.f8134a = f3;
        this.f8135b = f4;
        this.f8136c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h2 = (H) obj;
        return Float.compare(this.f8134a, h2.f8134a) == 0 && Float.compare(this.f8135b, h2.f8135b) == 0 && this.f8136c == h2.f8136c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8136c) + B1.t.c(this.f8135b, Float.hashCode(this.f8134a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f8134a + ", distance=" + this.f8135b + ", duration=" + this.f8136c + ')';
    }
}
