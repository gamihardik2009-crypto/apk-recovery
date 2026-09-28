package H;

/* loaded from: classes.dex */
public final class E1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1426a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E1) {
            return this.f1426a == ((E1) obj).f1426a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1426a);
    }

    public final String toString() {
        int i2 = this.f1426a;
        return a(i2, 0) ? "Picker" : a(i2, 1) ? "Input" : "Unknown";
    }
}
