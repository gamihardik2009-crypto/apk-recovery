package l;

import m.C0829d;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final C0829d f8143a;

    /* renamed from: b, reason: collision with root package name */
    public long f8144b;

    public N(C0829d c0829d, long j3) {
        this.f8143a = c0829d;
        this.f8144b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        return z2.h.a(this.f8143a, n3.f8143a) && O0.j.a(this.f8144b, n3.f8144b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8144b) + (this.f8143a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f8143a + ", startSize=" + ((Object) O0.j.d(this.f8144b)) + ')';
    }
}
