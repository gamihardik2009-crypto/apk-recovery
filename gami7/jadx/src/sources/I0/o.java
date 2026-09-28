package I0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f3912a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 0) ? "Unspecified" : a(i2, 1) ? "Text" : a(i2, 2) ? "Ascii" : a(i2, 3) ? "Number" : a(i2, 4) ? "Phone" : a(i2, 5) ? "Uri" : a(i2, 6) ? "Email" : a(i2, 7) ? "Password" : a(i2, 8) ? "NumberPassword" : a(i2, 9) ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f3912a == ((o) obj).f3912a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3912a);
    }

    public final String toString() {
        return b(this.f3912a);
    }
}
