package D;

import m.AbstractC0837j;

/* renamed from: D.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047p {

    /* renamed from: a, reason: collision with root package name */
    public final N0.h f876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f877b;

    /* renamed from: c, reason: collision with root package name */
    public final long f878c;

    public C0047p(N0.h hVar, int i2, long j3) {
        this.f876a = hVar;
        this.f877b = i2;
        this.f878c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0047p)) {
            return false;
        }
        C0047p c0047p = (C0047p) obj;
        return this.f876a == c0047p.f876a && this.f877b == c0047p.f877b && this.f878c == c0047p.f878c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f878c) + AbstractC0837j.b(this.f877b, this.f876a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f876a + ", offset=" + this.f877b + ", selectableId=" + this.f878c + ')';
    }
}
