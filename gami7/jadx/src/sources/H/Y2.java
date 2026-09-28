package H;

import c0.C0603v;

/* loaded from: classes.dex */
public final class Y2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2177a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2178b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2179c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2180d;

    public Y2(long j3, long j4, long j5, long j6) {
        this.f2177a = j3;
        this.f2178b = j4;
        this.f2179c = j5;
        this.f2180d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Y2)) {
            return false;
        }
        Y2 y22 = (Y2) obj;
        return C0603v.c(this.f2177a, y22.f2177a) && C0603v.c(this.f2178b, y22.f2178b) && C0603v.c(this.f2179c, y22.f2179c) && C0603v.c(this.f2180d, y22.f2180d);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f2180d) + B1.t.d(B1.t.d(Long.hashCode(this.f2177a) * 31, 31, this.f2178b), 31, this.f2179c);
    }
}
