package A0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f25a = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f25a == ((f) obj).f25a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25a);
    }

    public final String toString() {
        int i2 = this.f25a;
        return i2 == 0 ? "Polite" : i2 == 1 ? "Assertive" : "Unknown";
    }
}
