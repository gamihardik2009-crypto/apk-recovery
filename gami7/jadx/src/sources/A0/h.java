package A0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f30a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f30a == ((h) obj).f30a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30a);
    }

    public final String toString() {
        int i2 = this.f30a;
        return a(i2, 0) ? "Button" : a(i2, 1) ? "Checkbox" : a(i2, 2) ? "Switch" : a(i2, 3) ? "RadioButton" : a(i2, 4) ? "Tab" : a(i2, 5) ? "Image" : a(i2, 6) ? "DropdownList" : "Unknown";
    }
}
