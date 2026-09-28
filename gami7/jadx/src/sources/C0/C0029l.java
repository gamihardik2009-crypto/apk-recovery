package C0;

/* renamed from: C0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029l extends AbstractC0030m {

    /* renamed from: a, reason: collision with root package name */
    public final String f516a;

    /* renamed from: b, reason: collision with root package name */
    public final I f517b;

    public C0029l(String str, I i2) {
        this.f516a = str;
        this.f517b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0029l)) {
            return false;
        }
        C0029l c0029l = (C0029l) obj;
        if (!z2.h.a(this.f516a, c0029l.f516a)) {
            return false;
        }
        if (!z2.h.a(this.f517b, c0029l.f517b)) {
            return false;
        }
        c0029l.getClass();
        return z2.h.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f516a.hashCode() * 31;
        I i2 = this.f517b;
        return (hashCode + (i2 != null ? i2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return B1.t.k(new StringBuilder("LinkAnnotation.Url(url="), this.f516a, ')');
    }
}
