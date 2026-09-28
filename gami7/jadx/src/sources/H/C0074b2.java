package H;

import c0.C0603v;

/* renamed from: H.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074b2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2345a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2346b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2347c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2348d;

    public C0074b2(long j3, long j4, long j5, long j6) {
        this.f2345a = j3;
        this.f2346b = j4;
        this.f2347c = j5;
        this.f2348d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0074b2)) {
            return false;
        }
        C0074b2 c0074b2 = (C0074b2) obj;
        return C0603v.c(this.f2345a, c0074b2.f2345a) && C0603v.c(this.f2346b, c0074b2.f2346b) && C0603v.c(this.f2347c, c0074b2.f2347c) && C0603v.c(this.f2348d, c0074b2.f2348d);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f2348d) + B1.t.d(B1.t.d(Long.hashCode(this.f2345a) * 31, 31, this.f2346b), 31, this.f2347c);
    }
}
