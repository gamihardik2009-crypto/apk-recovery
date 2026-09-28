package c0;

/* renamed from: c0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563C {

    /* renamed from: a, reason: collision with root package name */
    public final int f7182a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0563C) {
            return this.f7182a == ((C0563C) obj).f7182a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7182a);
    }

    public final String toString() {
        int i2 = this.f7182a;
        return a(i2, 0) ? "Argb8888" : a(i2, 1) ? "Alpha8" : a(i2, 2) ? "Rgb565" : a(i2, 3) ? "F16" : a(i2, 4) ? "Gpu" : "Unknown";
    }
}
