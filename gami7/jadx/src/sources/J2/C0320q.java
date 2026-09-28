package J2;

/* renamed from: J2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4423a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f4424b;

    public C0320q(Object obj, y2.c cVar) {
        this.f4423a = obj;
        this.f4424b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0320q)) {
            return false;
        }
        C0320q c0320q = (C0320q) obj;
        return z2.h.a(this.f4423a, c0320q.f4423a) && z2.h.a(this.f4424b, c0320q.f4424b);
    }

    public final int hashCode() {
        Object obj = this.f4423a;
        return this.f4424b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f4423a + ", onCancellation=" + this.f4424b + ')';
    }
}
