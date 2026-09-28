package l;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8173a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8174b;

    public C0792a(float f3, float f4) {
        this.f8173a = f3;
        this.f8174b = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0792a)) {
            return false;
        }
        C0792a c0792a = (C0792a) obj;
        return Float.compare(this.f8173a, c0792a.f8173a) == 0 && Float.compare(this.f8174b, c0792a.f8174b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8174b) + (Float.hashCode(this.f8173a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f8173a);
        sb.append(", velocityCoefficient=");
        return B1.t.i(sb, this.f8174b, ')');
    }
}
