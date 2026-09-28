package H;

import c0.C0603v;

/* renamed from: H.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210v3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3218b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3219c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3220d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3221e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3222f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3223g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3224h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3225i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3226j;

    public C0210v3(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f3217a = j3;
        this.f3218b = j4;
        this.f3219c = j5;
        this.f3220d = j6;
        this.f3221e = j7;
        this.f3222f = j8;
        this.f3223g = j9;
        this.f3224h = j10;
        this.f3225i = j11;
        this.f3226j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0210v3)) {
            return false;
        }
        C0210v3 c0210v3 = (C0210v3) obj;
        return C0603v.c(this.f3217a, c0210v3.f3217a) && C0603v.c(this.f3218b, c0210v3.f3218b) && C0603v.c(this.f3219c, c0210v3.f3219c) && C0603v.c(this.f3220d, c0210v3.f3220d) && C0603v.c(this.f3221e, c0210v3.f3221e) && C0603v.c(this.f3222f, c0210v3.f3222f) && C0603v.c(this.f3223g, c0210v3.f3223g) && C0603v.c(this.f3224h, c0210v3.f3224h) && C0603v.c(this.f3225i, c0210v3.f3225i) && C0603v.c(this.f3226j, c0210v3.f3226j);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f3226j) + B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(B1.t.d(Long.hashCode(this.f3217a) * 31, 31, this.f3218b), 31, this.f3219c), 31, this.f3220d), 31, this.f3221e), 31, this.f3222f), 31, this.f3223g), 31, this.f3224h), 31, this.f3225i);
    }
}
