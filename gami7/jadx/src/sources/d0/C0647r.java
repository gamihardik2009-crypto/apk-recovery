package d0;

/* renamed from: d0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647r {

    /* renamed from: a, reason: collision with root package name */
    public final double f7459a;

    /* renamed from: b, reason: collision with root package name */
    public final double f7460b;

    /* renamed from: c, reason: collision with root package name */
    public final double f7461c;

    /* renamed from: d, reason: collision with root package name */
    public final double f7462d;

    /* renamed from: e, reason: collision with root package name */
    public final double f7463e;

    /* renamed from: f, reason: collision with root package name */
    public final double f7464f;

    /* renamed from: g, reason: collision with root package name */
    public final double f7465g;

    public /* synthetic */ C0647r(double d3, double d4, double d5, double d6, double d7) {
        this(d3, d4, d5, d6, d7, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0647r)) {
            return false;
        }
        C0647r c0647r = (C0647r) obj;
        return Double.compare(this.f7459a, c0647r.f7459a) == 0 && Double.compare(this.f7460b, c0647r.f7460b) == 0 && Double.compare(this.f7461c, c0647r.f7461c) == 0 && Double.compare(this.f7462d, c0647r.f7462d) == 0 && Double.compare(this.f7463e, c0647r.f7463e) == 0 && Double.compare(this.f7464f, c0647r.f7464f) == 0 && Double.compare(this.f7465g, c0647r.f7465g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7465g) + ((Double.hashCode(this.f7464f) + ((Double.hashCode(this.f7463e) + ((Double.hashCode(this.f7462d) + ((Double.hashCode(this.f7461c) + ((Double.hashCode(this.f7460b) + (Double.hashCode(this.f7459a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f7459a + ", a=" + this.f7460b + ", b=" + this.f7461c + ", c=" + this.f7462d + ", d=" + this.f7463e + ", e=" + this.f7464f + ", f=" + this.f7465g + ')';
    }

    public C0647r(double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f7459a = d3;
        this.f7460b = d4;
        this.f7461c = d5;
        this.f7462d = d6;
        this.f7463e = d7;
        this.f7464f = d8;
        this.f7465g = d9;
        if (Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d3)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d7 < 0.0d || d7 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d7);
        }
        if (d7 == 0.0d && (d4 == 0.0d || d3 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d7 >= 1.0d && d6 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d4 == 0.0d || d3 == 0.0d) && d6 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d6 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d4 < 0.0d || d3 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
