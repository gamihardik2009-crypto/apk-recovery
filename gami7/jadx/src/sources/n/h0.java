package n;

import c0.AbstractC0571K;
import c0.C0603v;
import s.C1160M;
import s.InterfaceC1159L;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8786a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1159L f8787b;

    public h0() {
        long d3 = AbstractC0571K.d(4284900966L);
        C1160M a3 = androidx.compose.foundation.layout.a.a(0.0f, 3);
        this.f8786a = d3;
        this.f8787b = a3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!z2.h.a(h0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        h0 h0Var = (h0) obj;
        return C0603v.c(this.f8786a, h0Var.f8786a) && z2.h.a(this.f8787b, h0Var.f8787b);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return this.f8787b.hashCode() + (Long.hashCode(this.f8786a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        B1.t.t(this.f8786a, sb, ", drawPadding=");
        sb.append(this.f8787b);
        sb.append(')');
        return sb.toString();
    }
}
