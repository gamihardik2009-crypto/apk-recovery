package D;

/* renamed from: D.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048q {

    /* renamed from: a, reason: collision with root package name */
    public final C0047p f879a;

    /* renamed from: b, reason: collision with root package name */
    public final C0047p f880b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f881c;

    public C0048q(C0047p c0047p, C0047p c0047p2, boolean z3) {
        this.f879a = c0047p;
        this.f880b = c0047p2;
        this.f881c = z3;
    }

    public static C0048q a(C0048q c0048q, C0047p c0047p, C0047p c0047p2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            c0047p = c0048q.f879a;
        }
        if ((i2 & 2) != 0) {
            c0047p2 = c0048q.f880b;
        }
        c0048q.getClass();
        return new C0048q(c0047p, c0047p2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0048q)) {
            return false;
        }
        C0048q c0048q = (C0048q) obj;
        return z2.h.a(this.f879a, c0048q.f879a) && z2.h.a(this.f880b, c0048q.f880b) && this.f881c == c0048q.f881c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f881c) + ((this.f880b.hashCode() + (this.f879a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f879a + ", end=" + this.f880b + ", handlesCrossed=" + this.f881c + ')';
    }
}
