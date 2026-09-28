package m;

/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847u {

    /* renamed from: a, reason: collision with root package name */
    public double f8577a;

    /* renamed from: b, reason: collision with root package name */
    public double f8578b;

    public C0847u(double d3, double d4) {
        this.f8577a = d3;
        this.f8578b = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0847u)) {
            return false;
        }
        C0847u c0847u = (C0847u) obj;
        return Double.compare(this.f8577a, c0847u.f8577a) == 0 && Double.compare(this.f8578b, c0847u.f8578b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f8578b) + (Double.hashCode(this.f8577a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f8577a + ", _imaginary=" + this.f8578b + ')';
    }
}
