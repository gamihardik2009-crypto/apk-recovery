package H;

import c0.C0603v;

/* renamed from: H.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215w2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3248a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3249b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3250c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3251d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3252e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3253f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3254g;

    public C0215w2(long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f3248a = j3;
        this.f3249b = j4;
        this.f3250c = j5;
        this.f3251d = j6;
        this.f3252e = j7;
        this.f3253f = j8;
        this.f3254g = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0215w2)) {
            return false;
        }
        C0215w2 c0215w2 = (C0215w2) obj;
        return C0603v.c(this.f3248a, c0215w2.f3248a) && C0603v.c(this.f3251d, c0215w2.f3251d) && C0603v.c(this.f3249b, c0215w2.f3249b) && C0603v.c(this.f3252e, c0215w2.f3252e) && C0603v.c(this.f3250c, c0215w2.f3250c) && C0603v.c(this.f3253f, c0215w2.f3253f) && C0603v.c(this.f3254g, c0215w2.f3254g);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f3254g) + B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(Long.hashCode(this.f3248a) * 31, 31, this.f3251d), 31, this.f3249b), 31, this.f3252e), 31, this.f3250c), 31, this.f3253f);
    }
}
