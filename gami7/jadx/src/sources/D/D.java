package D;

import m.AbstractC0837j;
import z.EnumC1406F;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1406F f719a;

    /* renamed from: b, reason: collision with root package name */
    public final long f720b;

    /* renamed from: c, reason: collision with root package name */
    public final int f721c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f722d;

    public D(EnumC1406F enumC1406F, long j3, int i2, boolean z3) {
        this.f719a = enumC1406F;
        this.f720b = j3;
        this.f721c = i2;
        this.f722d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d3 = (D) obj;
        return this.f719a == d3.f719a && b0.c.b(this.f720b, d3.f720b) && this.f721c == d3.f721c && this.f722d == d3.f722d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f722d) + ((AbstractC0837j.d(this.f721c) + B1.t.d(this.f719a.hashCode() * 31, 31, this.f720b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f719a + ", position=" + ((Object) b0.c.j(this.f720b)) + ", anchor=" + B1.t.E(this.f721c) + ", visible=" + this.f722d + ')';
    }
}
