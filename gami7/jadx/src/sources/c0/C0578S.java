package c0;

/* renamed from: c0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578S extends AbstractC0598q {

    /* renamed from: a, reason: collision with root package name */
    public final long f7238a;

    public C0578S(long j3) {
        this.f7238a = j3;
    }

    @Override // c0.AbstractC0598q
    public final void a(float f3, long j3, C0589h c0589h) {
        c0589h.c(1.0f);
        long j4 = this.f7238a;
        if (f3 != 1.0f) {
            j4 = C0603v.b(C0603v.d(j4) * f3, j4);
        }
        c0589h.e(j4);
        if (c0589h.f7256c != null) {
            c0589h.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0578S) {
            return C0603v.c(this.f7238a, ((C0578S) obj).f7238a);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f7238a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C0603v.i(this.f7238a)) + ')';
    }
}
