package k0;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8104a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0780a) {
            return this.f8104a == ((C0780a) obj).f8104a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8104a);
    }

    public final String toString() {
        int i2 = this.f8104a;
        return i2 == 1 ? "Touch" : i2 == 2 ? "Keyboard" : "Error";
    }
}
