package N0;

import c0.AbstractC0598q;
import c0.C0603v;

/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final long f4979a;

    public c(long j3) {
        this.f4979a = j3;
        if (j3 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    @Override // N0.m
    public final float a() {
        return C0603v.d(this.f4979a);
    }

    @Override // N0.m
    public final long b() {
        return this.f4979a;
    }

    @Override // N0.m
    public final AbstractC0598q c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C0603v.c(this.f4979a, ((c) obj).f4979a);
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Long.hashCode(this.f4979a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C0603v.i(this.f4979a)) + ')';
    }
}
