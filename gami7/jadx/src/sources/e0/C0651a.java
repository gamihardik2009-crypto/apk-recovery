package e0;

import O0.k;
import c0.InterfaceC0600s;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651a {

    /* renamed from: a, reason: collision with root package name */
    public O0.b f7547a;

    /* renamed from: b, reason: collision with root package name */
    public k f7548b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0600s f7549c;

    /* renamed from: d, reason: collision with root package name */
    public long f7550d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0651a)) {
            return false;
        }
        C0651a c0651a = (C0651a) obj;
        return z2.h.a(this.f7547a, c0651a.f7547a) && this.f7548b == c0651a.f7548b && z2.h.a(this.f7549c, c0651a.f7549c) && b0.f.a(this.f7550d, c0651a.f7550d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f7550d) + ((this.f7549c.hashCode() + ((this.f7548b.hashCode() + (this.f7547a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f7547a + ", layoutDirection=" + this.f7548b + ", canvas=" + this.f7549c + ", size=" + ((Object) b0.f.f(this.f7550d)) + ')';
    }
}
