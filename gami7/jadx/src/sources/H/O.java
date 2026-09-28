package H;

import c0.C0603v;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final long f1802a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1803b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1804c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1805d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1806e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1807f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1808g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1809h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1810i;

    /* renamed from: j, reason: collision with root package name */
    public final long f1811j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1812k;

    /* renamed from: l, reason: collision with root package name */
    public final long f1813l;

    public O(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f1802a = j3;
        this.f1803b = j4;
        this.f1804c = j5;
        this.f1805d = j6;
        this.f1806e = j7;
        this.f1807f = j8;
        this.f1808g = j9;
        this.f1809h = j10;
        this.f1810i = j11;
        this.f1811j = j12;
        this.f1812k = j13;
        this.f1813l = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O)) {
            return false;
        }
        O o3 = (O) obj;
        return C0603v.c(this.f1802a, o3.f1802a) && C0603v.c(this.f1803b, o3.f1803b) && C0603v.c(this.f1804c, o3.f1804c) && C0603v.c(this.f1805d, o3.f1805d) && C0603v.c(this.f1806e, o3.f1806e) && C0603v.c(this.f1807f, o3.f1807f) && C0603v.c(this.f1808g, o3.f1808g) && C0603v.c(this.f1809h, o3.f1809h) && C0603v.c(this.f1810i, o3.f1810i) && C0603v.c(this.f1811j, o3.f1811j) && C0603v.c(this.f1812k, o3.f1812k) && C0603v.c(this.f1813l, o3.f1813l);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f1813l) + B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(Long.hashCode(this.f1802a) * 31, 31, this.f1803b), 31, this.f1804c), 31, this.f1805d), 31, this.f1806e), 31, this.f1807f), 31, this.f1808g), 31, this.f1809h), 31, this.f1810i), 31, this.f1811j), 31, this.f1812k);
    }
}
