package I0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f3911a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, -1) ? "Unspecified" : a(i2, 0) ? "None" : a(i2, 1) ? "Characters" : a(i2, 2) ? "Words" : a(i2, 3) ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f3911a == ((n) obj).f3911a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3911a);
    }

    public final String toString() {
        return b(this.f3911a);
    }
}
