package H;

import J2.C0311h;
import J2.InterfaceC0310g;

/* loaded from: classes.dex */
public final class W3 {

    /* renamed from: a, reason: collision with root package name */
    public final X3 f2118a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0310g f2119b;

    public W3(X3 x3, C0311h c0311h) {
        this.f2118a = x3;
        this.f2119b = c0311h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W3.class != obj.getClass()) {
            return false;
        }
        W3 w3 = (W3) obj;
        return z2.h.a(this.f2118a, w3.f2118a) && z2.h.a(this.f2119b, w3.f2119b);
    }

    public final int hashCode() {
        return this.f2119b.hashCode() + (this.f2118a.hashCode() * 31);
    }
}
