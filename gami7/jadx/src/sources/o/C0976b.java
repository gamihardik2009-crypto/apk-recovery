package o;

import B1.t;
import c0.C0603v;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976b {

    /* renamed from: a, reason: collision with root package name */
    public final long f9177a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9178b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9179c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9180d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9181e;

    public C0976b(long j3, long j4, long j5, long j6, long j7) {
        this.f9177a = j3;
        this.f9178b = j4;
        this.f9179c = j5;
        this.f9180d = j6;
        this.f9181e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0976b)) {
            return false;
        }
        C0976b c0976b = (C0976b) obj;
        return C0603v.c(this.f9177a, c0976b.f9177a) && C0603v.c(this.f9178b, c0976b.f9178b) && C0603v.c(this.f9179c, c0976b.f9179c) && C0603v.c(this.f9180d, c0976b.f9180d) && C0603v.c(this.f9181e, c0976b.f9181e);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f9181e) + t.d(t.d(t.d(Long.hashCode(this.f9177a) * 31, 31, this.f9178b), 31, this.f9179c), 31, this.f9180d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        t.t(this.f9177a, sb, ", textColor=");
        t.t(this.f9178b, sb, ", iconColor=");
        t.t(this.f9179c, sb, ", disabledTextColor=");
        t.t(this.f9180d, sb, ", disabledIconColor=");
        sb.append((Object) C0603v.i(this.f9181e));
        sb.append(')');
        return sb.toString();
    }
}
