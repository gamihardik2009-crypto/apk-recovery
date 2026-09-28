package C0;

import m.AbstractC0837j;

/* renamed from: C0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f490c;

    /* renamed from: d, reason: collision with root package name */
    public final String f491d;

    public /* synthetic */ C0020c(int i2, int i3, Object obj) {
        this(i2, i3, obj, "");
    }

    public final C0022e a(int i2) {
        int i3 = this.f490c;
        if (i3 != Integer.MIN_VALUE) {
            i2 = i3;
        }
        if (i2 == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first".toString());
        }
        return new C0022e(this.f489b, i2, this.f488a, this.f491d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0020c)) {
            return false;
        }
        C0020c c0020c = (C0020c) obj;
        return z2.h.a(this.f488a, c0020c.f488a) && this.f489b == c0020c.f489b && this.f490c == c0020c.f490c && z2.h.a(this.f491d, c0020c.f491d);
    }

    public final int hashCode() {
        Object obj = this.f488a;
        return this.f491d.hashCode() + AbstractC0837j.b(this.f490c, AbstractC0837j.b(this.f489b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f488a);
        sb.append(", start=");
        sb.append(this.f489b);
        sb.append(", end=");
        sb.append(this.f490c);
        sb.append(", tag=");
        return B1.t.k(sb, this.f491d, ')');
    }

    public C0020c(int i2, int i3, Object obj, String str) {
        this.f488a = obj;
        this.f489b = i2;
        this.f490c = i3;
        this.f491d = str;
    }
}
