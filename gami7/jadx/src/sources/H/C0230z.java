package H;

import c0.C0603v;

/* renamed from: H.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230z {

    /* renamed from: a, reason: collision with root package name */
    public final long f3355a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3356b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3357c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3358d;

    public C0230z(long j3, long j4, long j5, long j6) {
        this.f3355a = j3;
        this.f3356b = j4;
        this.f3357c = j5;
        this.f3358d = j6;
    }

    public final C0230z a(long j3, long j4, long j5, long j6) {
        long j7 = C0603v.f7277g;
        return new C0230z(j3 != j7 ? j3 : this.f3355a, j4 != j7 ? j4 : this.f3356b, j5 != j7 ? j5 : this.f3357c, j6 != j7 ? j6 : this.f3358d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0230z)) {
            return false;
        }
        C0230z c0230z = (C0230z) obj;
        return C0603v.c(this.f3355a, c0230z.f3355a) && C0603v.c(this.f3356b, c0230z.f3356b) && C0603v.c(this.f3357c, c0230z.f3357c) && C0603v.c(this.f3358d, c0230z.f3358d);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f3358d) + B1.t.d(B1.t.d(Long.hashCode(this.f3355a) * 31, 31, this.f3356b), 31, this.f3357c);
    }
}
