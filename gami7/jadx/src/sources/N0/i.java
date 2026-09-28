package N0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f4992a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 1) ? "Left" : a(i2, 2) ? "Right" : a(i2, 3) ? "Center" : a(i2, 4) ? "Justify" : a(i2, 5) ? "Start" : a(i2, 6) ? "End" : a(i2, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f4992a == ((i) obj).f4992a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4992a);
    }

    public final String toString() {
        return b(this.f4992a);
    }
}
