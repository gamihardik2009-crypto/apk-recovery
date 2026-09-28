package H;

/* loaded from: classes.dex */
public final class P4 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1914a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1915b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1916c;

    public P4(float f3, float f4, float f5) {
        this.f1914a = f3;
        this.f1915b = f4;
        this.f1916c = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P4)) {
            return false;
        }
        P4 p4 = (P4) obj;
        return O0.e.a(this.f1914a, p4.f1914a) && O0.e.a(this.f1915b, p4.f1915b) && O0.e.a(this.f1916c, p4.f1916c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1916c) + B1.t.c(this.f1915b, Float.hashCode(this.f1914a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f3 = this.f1914a;
        sb.append((Object) O0.e.b(f3));
        sb.append(", right=");
        float f4 = this.f1915b;
        sb.append((Object) O0.e.b(f3 + f4));
        sb.append(", width=");
        sb.append((Object) O0.e.b(f4));
        sb.append(", contentWidth=");
        sb.append((Object) O0.e.b(this.f1916c));
        sb.append(')');
        return sb.toString();
    }
}
