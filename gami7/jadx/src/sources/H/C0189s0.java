package H;

/* renamed from: H.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3073a;

    /* renamed from: b, reason: collision with root package name */
    public final char f3074b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3075c;

    public C0189s0(String str, char c3) {
        this.f3073a = str;
        this.f3074b = c3;
        this.f3075c = H2.l.b0(str, String.valueOf(c3), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0189s0)) {
            return false;
        }
        C0189s0 c0189s0 = (C0189s0) obj;
        return z2.h.a(this.f3073a, c0189s0.f3073a) && this.f3074b == c0189s0.f3074b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f3074b) + (this.f3073a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f3073a + ", delimiter=" + this.f3074b + ')';
    }
}
