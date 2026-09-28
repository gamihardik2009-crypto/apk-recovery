package H;

import c0.C0603v;

/* loaded from: classes.dex */
public final class u5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3185a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3186b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3187c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3188d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3189e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3190f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3191g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3192h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3193i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3194j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3195k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3196l;

    public u5(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f3185a = j3;
        this.f3186b = j4;
        this.f3187c = j5;
        this.f3188d = j6;
        this.f3189e = j7;
        this.f3190f = j8;
        this.f3191g = j9;
        this.f3192h = j10;
        this.f3193i = j11;
        this.f3194j = j12;
        this.f3195k = j13;
        this.f3196l = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u5.class != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return C0603v.c(this.f3185a, u5Var.f3185a) && C0603v.c(this.f3186b, u5Var.f3186b) && C0603v.c(this.f3187c, u5Var.f3187c) && C0603v.c(this.f3188d, u5Var.f3188d) && C0603v.c(this.f3189e, u5Var.f3189e) && C0603v.c(this.f3190f, u5Var.f3190f) && C0603v.c(this.f3191g, u5Var.f3191g) && C0603v.c(this.f3192h, u5Var.f3192h) && C0603v.c(this.f3193i, u5Var.f3193i) && C0603v.c(this.f3194j, u5Var.f3194j) && C0603v.c(this.f3195k, u5Var.f3195k) && C0603v.c(this.f3196l, u5Var.f3196l);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f3196l) + B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(Long.hashCode(this.f3185a) * 31, 31, this.f3186b), 31, this.f3187c), 31, this.f3188d), 31, this.f3189e), 31, this.f3190f), 31, this.f3191g), 31, this.f3192h), 31, this.f3193i), 31, this.f3194j), 31, this.f3195k);
    }
}
