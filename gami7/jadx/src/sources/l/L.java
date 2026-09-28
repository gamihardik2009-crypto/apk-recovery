package l;

import c0.C0580U;
import m.InterfaceC0817A;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final float f8140a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8141b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0817A f8142c;

    public L(float f3, long j3, InterfaceC0817A interfaceC0817A) {
        this.f8140a = f3;
        this.f8141b = j3;
        this.f8142c = interfaceC0817A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l3 = (L) obj;
        return Float.compare(this.f8140a, l3.f8140a) == 0 && C0580U.a(this.f8141b, l3.f8141b) && z2.h.a(this.f8142c, l3.f8142c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f8140a) * 31;
        int i2 = C0580U.f7241c;
        return this.f8142c.hashCode() + B1.t.d(hashCode, 31, this.f8141b);
    }

    public final String toString() {
        return "Scale(scale=" + this.f8140a + ", transformOrigin=" + ((Object) C0580U.d(this.f8141b)) + ", animationSpec=" + this.f8142c + ')';
    }
}
