package L2;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final m f4738b = new m();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4739a;

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return z2.h.a(this.f4739a, ((n) obj).f4739a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f4739a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f4739a;
        if (obj instanceof l) {
            return ((l) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
