package H;

import c0.C0603v;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final long f1686a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1687b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1688c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1689d;

    public L(long j3, long j4, long j5, long j6) {
        this.f1686a = j3;
        this.f1687b = j4;
        this.f1688c = j5;
        this.f1689d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof L)) {
            return false;
        }
        L l3 = (L) obj;
        return C0603v.c(this.f1686a, l3.f1686a) && C0603v.c(this.f1687b, l3.f1687b) && C0603v.c(this.f1688c, l3.f1688c) && C0603v.c(this.f1689d, l3.f1689d);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f1689d) + B1.t.d(B1.t.d(Long.hashCode(this.f1686a) * 31, 31, this.f1687b), 31, this.f1688c);
    }
}
