package v;

/* renamed from: v.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1359m {

    /* renamed from: a, reason: collision with root package name */
    public final int f11377a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11378b;

    public C1359m(int i2, int i3) {
        this.f11377a = i2;
        this.f11378b = i3;
        if (i2 < 0) {
            throw new IllegalArgumentException("negative start index".toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("end index greater than start".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1359m)) {
            return false;
        }
        C1359m c1359m = (C1359m) obj;
        return this.f11377a == c1359m.f11377a && this.f11378b == c1359m.f11378b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11378b) + (Integer.hashCode(this.f11377a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f11377a);
        sb.append(", end=");
        return B1.t.j(sb, this.f11378b, ')');
    }
}
