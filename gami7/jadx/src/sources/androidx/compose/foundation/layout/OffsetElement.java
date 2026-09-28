package androidx.compose.foundation.layout;

import B1.t;
import O0.e;
import V.n;
import s.C1156I;
import t0.S;

/* loaded from: classes.dex */
final class OffsetElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6619b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6620c;

    public OffsetElement(float f3, float f4) {
        this.f6619b = f3;
        this.f6620c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return e.a(this.f6619b, offsetElement.f6619b) && e.a(this.f6620c, offsetElement.f6620c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + t.c(this.f6620c, Float.hashCode(this.f6619b) * 31, 31);
    }

    @Override // t0.S
    public final n l() {
        C1156I c1156i = new C1156I();
        c1156i.f10058u = this.f6619b;
        c1156i.f10059v = this.f6620c;
        c1156i.f10060w = true;
        return c1156i;
    }

    @Override // t0.S
    public final void m(n nVar) {
        C1156I c1156i = (C1156I) nVar;
        c1156i.f10058u = this.f6619b;
        c1156i.f10059v = this.f6620c;
        c1156i.f10060w = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) e.b(this.f6619b)) + ", y=" + ((Object) e.b(this.f6620c)) + ", rtlAware=true)";
    }
}
