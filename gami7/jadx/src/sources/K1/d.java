package K1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4534a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f4535b;

    public d(String str, Long l3) {
        this.f4534a = str;
        this.f4535b = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return z2.h.a(this.f4534a, dVar.f4534a) && z2.h.a(this.f4535b, dVar.f4535b);
    }

    public final int hashCode() {
        int hashCode = this.f4534a.hashCode() * 31;
        Long l3 = this.f4535b;
        return hashCode + (l3 == null ? 0 : l3.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f4534a + ", value=" + this.f4535b + ')';
    }
}
