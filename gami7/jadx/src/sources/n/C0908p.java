package n;

import c0.C0588g;
import c0.InterfaceC0570J;
import c0.InterfaceC0600s;
import e0.C0652b;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908p {

    /* renamed from: a, reason: collision with root package name */
    public C0588g f8822a = null;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0600s f8823b = null;

    /* renamed from: c, reason: collision with root package name */
    public C0652b f8824c = null;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0570J f8825d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0908p)) {
            return false;
        }
        C0908p c0908p = (C0908p) obj;
        return z2.h.a(this.f8822a, c0908p.f8822a) && z2.h.a(this.f8823b, c0908p.f8823b) && z2.h.a(this.f8824c, c0908p.f8824c) && z2.h.a(this.f8825d, c0908p.f8825d);
    }

    public final int hashCode() {
        C0588g c0588g = this.f8822a;
        int hashCode = (c0588g == null ? 0 : c0588g.hashCode()) * 31;
        InterfaceC0600s interfaceC0600s = this.f8823b;
        int hashCode2 = (hashCode + (interfaceC0600s == null ? 0 : interfaceC0600s.hashCode())) * 31;
        C0652b c0652b = this.f8824c;
        int hashCode3 = (hashCode2 + (c0652b == null ? 0 : c0652b.hashCode())) * 31;
        InterfaceC0570J interfaceC0570J = this.f8825d;
        return hashCode3 + (interfaceC0570J != null ? interfaceC0570J.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f8822a + ", canvas=" + this.f8823b + ", canvasDrawScope=" + this.f8824c + ", borderPath=" + this.f8825d + ')';
    }
}
