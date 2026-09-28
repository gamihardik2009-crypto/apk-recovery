package a0;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6453a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 1) ? "Next" : a(i2, 2) ? "Previous" : a(i2, 3) ? "Left" : a(i2, 4) ? "Right" : a(i2, 5) ? "Up" : a(i2, 6) ? "Down" : a(i2, 7) ? "Enter" : a(i2, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0425b) {
            return this.f6453a == ((C0425b) obj).f6453a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6453a);
    }

    public final String toString() {
        return b(this.f6453a);
    }
}
