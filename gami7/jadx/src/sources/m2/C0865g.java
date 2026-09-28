package m2;

import java.io.Serializable;

/* renamed from: m2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865g implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final Object f8646h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8647i;

    public C0865g(Object obj, Object obj2) {
        this.f8646h = obj;
        this.f8647i = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0865g)) {
            return false;
        }
        C0865g c0865g = (C0865g) obj;
        return z2.h.a(this.f8646h, c0865g.f8646h) && z2.h.a(this.f8647i, c0865g.f8647i);
    }

    public final int hashCode() {
        Object obj = this.f8646h;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f8647i;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f8646h + ", " + this.f8647i + ')';
    }
}
