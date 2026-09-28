package H0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3398a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3398a == ((i) obj).f3398a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3398a);
    }

    public final String toString() {
        int i2 = this.f3398a;
        return a(i2, 0) ? "Normal" : a(i2, 1) ? "Italic" : "Invalid";
    }
}
