package H;

/* renamed from: H.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186r3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3063a;

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0186r3) {
            return this.f3063a == ((C0186r3) obj).f3063a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3063a);
    }

    public final String toString() {
        return "Selection(value=" + this.f3063a + ')';
    }
}
