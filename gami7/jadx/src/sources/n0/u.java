package n0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f8984a;

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f8984a == ((u) obj).f8984a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8984a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f8984a + ')';
    }
}
