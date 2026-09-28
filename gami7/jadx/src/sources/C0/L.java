package C0;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final String f478a;

    public L(String str) {
        this.f478a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L) {
            return z2.h.a(this.f478a, ((L) obj).f478a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f478a.hashCode();
    }

    public final String toString() {
        return B1.t.k(new StringBuilder("UrlAnnotation(url="), this.f478a, ')');
    }
}
