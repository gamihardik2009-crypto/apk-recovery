package c0;

/* renamed from: c0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575O {

    /* renamed from: d, reason: collision with root package name */
    public static final C0575O f7219d = new C0575O();

    /* renamed from: a, reason: collision with root package name */
    public final long f7220a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7221b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7222c;

    public C0575O(long j3, long j4, float f3) {
        this.f7220a = j3;
        this.f7221b = j4;
        this.f7222c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0575O)) {
            return false;
        }
        C0575O c0575o = (C0575O) obj;
        return C0603v.c(this.f7220a, c0575o.f7220a) && b0.c.b(this.f7221b, c0575o.f7221b) && this.f7222c == c0575o.f7222c;
    }

    public final int hashCode() {
        int i2 = C0603v.f7278h;
        return Float.hashCode(this.f7222c) + B1.t.d(Long.hashCode(this.f7220a) * 31, 31, this.f7221b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        B1.t.t(this.f7220a, sb, ", offset=");
        sb.append((Object) b0.c.j(this.f7221b));
        sb.append(", blurRadius=");
        return B1.t.i(sb, this.f7222c, ')');
    }

    public /* synthetic */ C0575O() {
        this(AbstractC0571K.d(4278190080L), 0L, 0.0f);
    }
}
