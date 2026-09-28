package C0;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final String f479a;

    public M(String str) {
        this.f479a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            return z2.h.a(this.f479a, ((M) obj).f479a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f479a.hashCode();
    }

    public final String toString() {
        return B1.t.k(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f479a, ')');
    }
}
