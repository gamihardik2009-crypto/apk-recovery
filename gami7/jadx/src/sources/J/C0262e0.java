package J;

/* renamed from: J.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4130a;

    public C0262e0(String str) {
        this.f4130a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0262e0) && z2.h.a(this.f4130a, ((C0262e0) obj).f4130a);
    }

    public final int hashCode() {
        return this.f4130a.hashCode();
    }

    public final String toString() {
        return B1.t.k(new StringBuilder("OpaqueKey(key="), this.f4130a, ')');
    }
}
