package C0;

/* renamed from: C0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028k extends AbstractC0030m {

    /* renamed from: a, reason: collision with root package name */
    public final String f514a;

    /* renamed from: b, reason: collision with root package name */
    public final I f515b;

    public C0028k(String str, I i2) {
        this.f514a = str;
        this.f515b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0028k)) {
            return false;
        }
        C0028k c0028k = (C0028k) obj;
        if (!z2.h.a(this.f514a, c0028k.f514a)) {
            return false;
        }
        if (!z2.h.a(this.f515b, c0028k.f515b)) {
            return false;
        }
        c0028k.getClass();
        return z2.h.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f514a.hashCode() * 31;
        I i2 = this.f515b;
        return (hashCode + (i2 != null ? i2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return B1.t.k(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f514a, ')');
    }
}
