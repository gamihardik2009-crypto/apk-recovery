package J;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4066a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4067b;

    public P(Integer num, Object obj) {
        this.f4066a = num;
        this.f4067b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p3 = (P) obj;
        return z2.h.a(this.f4066a, p3.f4066a) && z2.h.a(this.f4067b, p3.f4067b);
    }

    public final int hashCode() {
        Object obj = this.f4066a;
        int i2 = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f4067b;
        if (obj2 instanceof Enum) {
            i2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i2 + ordinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f4066a + ", right=" + this.f4067b + ')';
    }
}
