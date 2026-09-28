package H0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3399a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 0) ? "None" : a(i2, 1) ? "All" : a(i2, 2) ? "Weight" : a(i2, 3) ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f3399a == ((j) obj).f3399a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3399a);
    }

    public final String toString() {
        return b(this.f3399a);
    }
}
