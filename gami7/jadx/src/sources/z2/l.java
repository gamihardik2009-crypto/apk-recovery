package z2;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11903a;

    public l(Class cls) {
        h.f(cls, "jClass");
        this.f11903a = cls;
    }

    @Override // z2.c
    public final Class a() {
        return this.f11903a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (h.a(this.f11903a, ((l) obj).f11903a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11903a.hashCode();
    }

    public final String toString() {
        return this.f11903a.toString() + " (Kotlin reflection is not available)";
    }
}
