package H;

import c0.C0603v;

/* loaded from: classes.dex */
public final class N5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1797a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1798b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1799c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1800d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1801e;

    public N5(long j3, long j4, long j5, long j6, long j7) {
        this.f1797a = j3;
        this.f1798b = j4;
        this.f1799c = j5;
        this.f1800d = j6;
        this.f1801e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof N5)) {
            return false;
        }
        N5 n5 = (N5) obj;
        return C0603v.c(this.f1797a, n5.f1797a) && C0603v.c(this.f1798b, n5.f1798b) && C0603v.c(this.f1799c, n5.f1799c) && C0603v.c(this.f1800d, n5.f1800d) && C0603v.c(this.f1801e, n5.f1801e);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f1801e) + B1.t.d(B1.t.d(B1.t.d(Long.hashCode(this.f1797a) * 31, 31, this.f1798b), 31, this.f1799c), 31, this.f1800d);
    }
}
