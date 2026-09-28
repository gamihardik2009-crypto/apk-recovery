package C0;

import m.AbstractC0837j;

/* renamed from: C0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f497b;

    /* renamed from: c, reason: collision with root package name */
    public final int f498c;

    /* renamed from: d, reason: collision with root package name */
    public final String f499d;

    public C0022e(int i2, int i3, Object obj, String str) {
        this.f496a = obj;
        this.f497b = i2;
        this.f498c = i3;
        this.f499d = str;
        if (i2 > i3) {
            throw new IllegalArgumentException("Reversed range is not supported".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0022e)) {
            return false;
        }
        C0022e c0022e = (C0022e) obj;
        return z2.h.a(this.f496a, c0022e.f496a) && this.f497b == c0022e.f497b && this.f498c == c0022e.f498c && z2.h.a(this.f499d, c0022e.f499d);
    }

    public final int hashCode() {
        Object obj = this.f496a;
        return this.f499d.hashCode() + AbstractC0837j.b(this.f498c, AbstractC0837j.b(this.f497b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f496a);
        sb.append(", start=");
        sb.append(this.f497b);
        sb.append(", end=");
        sb.append(this.f498c);
        sb.append(", tag=");
        return B1.t.k(sb, this.f499d, ')');
    }

    public C0022e(int i2, int i3, Object obj) {
        this(i2, i3, obj, "");
    }
}
