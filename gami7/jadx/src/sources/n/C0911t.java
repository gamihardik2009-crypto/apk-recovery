package n;

import c0.AbstractC0598q;
import c0.C0578S;

/* renamed from: n.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911t {

    /* renamed from: a, reason: collision with root package name */
    public final float f8850a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0598q f8851b;

    public C0911t(float f3, C0578S c0578s) {
        this.f8850a = f3;
        this.f8851b = c0578s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0911t)) {
            return false;
        }
        C0911t c0911t = (C0911t) obj;
        return O0.e.a(this.f8850a, c0911t.f8850a) && z2.h.a(this.f8851b, c0911t.f8851b);
    }

    public final int hashCode() {
        return this.f8851b.hashCode() + (Float.hashCode(this.f8850a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) O0.e.b(this.f8850a)) + ", brush=" + this.f8851b + ')';
    }
}
