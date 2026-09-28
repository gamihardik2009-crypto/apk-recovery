package l;

import m.InterfaceC0817A;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810t {

    /* renamed from: a, reason: collision with root package name */
    public final V.c f8238a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f8239b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0817A f8240c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8241d;

    public C0810t(V.c cVar, InterfaceC0817A interfaceC0817A, y2.c cVar2, boolean z3) {
        this.f8238a = cVar;
        this.f8239b = cVar2;
        this.f8240c = interfaceC0817A;
        this.f8241d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0810t)) {
            return false;
        }
        C0810t c0810t = (C0810t) obj;
        return z2.h.a(this.f8238a, c0810t.f8238a) && z2.h.a(this.f8239b, c0810t.f8239b) && z2.h.a(this.f8240c, c0810t.f8240c) && this.f8241d == c0810t.f8241d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8241d) + ((this.f8240c.hashCode() + ((this.f8239b.hashCode() + (this.f8238a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f8238a + ", size=" + this.f8239b + ", animationSpec=" + this.f8240c + ", clip=" + this.f8241d + ')';
    }
}
