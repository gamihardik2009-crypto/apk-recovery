package H2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3437a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.d f3438b;

    public c(String str, E2.d dVar) {
        this.f3437a = str;
        this.f3438b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return z2.h.a(this.f3437a, cVar.f3437a) && z2.h.a(this.f3438b, cVar.f3438b);
    }

    public final int hashCode() {
        return this.f3438b.hashCode() + (this.f3437a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f3437a + ", range=" + this.f3438b + ')';
    }
}
