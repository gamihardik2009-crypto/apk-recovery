package n2;

/* renamed from: n2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973y {

    /* renamed from: a, reason: collision with root package name */
    public final int f9168a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9169b;

    public C0973y(int i2, Object obj) {
        this.f9168a = i2;
        this.f9169b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0973y)) {
            return false;
        }
        C0973y c0973y = (C0973y) obj;
        return this.f9168a == c0973y.f9168a && z2.h.a(this.f9169b, c0973y.f9169b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f9168a) * 31;
        Object obj = this.f9169b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f9168a + ", value=" + this.f9169b + ')';
    }
}
