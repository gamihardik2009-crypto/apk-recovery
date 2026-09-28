package D;

import c0.C0603v;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f851a;

    /* renamed from: b, reason: collision with root package name */
    public final long f852b;

    public g0(long j3, long j4) {
        this.f851a = j3;
        this.f852b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return C0603v.c(this.f851a, g0Var.f851a) && C0603v.c(this.f852b, g0Var.f852b);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f852b) + (Long.hashCode(this.f851a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        B1.t.t(this.f851a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C0603v.i(this.f852b));
        sb.append(')');
        return sb.toString();
    }
}
