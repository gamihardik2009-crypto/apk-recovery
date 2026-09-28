package n1;

/* renamed from: n1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938A {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8997a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8999c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9000d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9001e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9002f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9003g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9004h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9005i;

    /* renamed from: j, reason: collision with root package name */
    public String f9006j;

    public C0938A(boolean z3, boolean z4, int i2, boolean z5, boolean z6, int i3, int i4, int i5, int i6) {
        this.f8997a = z3;
        this.f8998b = z4;
        this.f8999c = i2;
        this.f9000d = z5;
        this.f9001e = z6;
        this.f9002f = i3;
        this.f9003g = i4;
        this.f9004h = i5;
        this.f9005i = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0938A)) {
            return false;
        }
        C0938A c0938a = (C0938A) obj;
        if (this.f8997a == c0938a.f8997a && this.f8998b == c0938a.f8998b && this.f8999c == c0938a.f8999c && z2.h.a(this.f9006j, c0938a.f9006j)) {
            c0938a.getClass();
            if (z2.h.a(null, null)) {
                c0938a.getClass();
                if (z2.h.a(null, null) && this.f9000d == c0938a.f9000d && this.f9001e == c0938a.f9001e && this.f9002f == c0938a.f9002f && this.f9003g == c0938a.f9003g && this.f9004h == c0938a.f9004h && this.f9005i == c0938a.f9005i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (((((this.f8997a ? 1 : 0) * 31) + (this.f8998b ? 1 : 0)) * 31) + this.f8999c) * 31;
        String str = this.f9006j;
        return ((((((((((((((((i2 + (str != null ? str.hashCode() : 0)) * 31) + 0) * 31) + 0) * 31) + (this.f9000d ? 1 : 0)) * 31) + (this.f9001e ? 1 : 0)) * 31) + this.f9002f) * 31) + this.f9003g) * 31) + this.f9004h) * 31) + this.f9005i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0938A.class.getSimpleName());
        sb.append("(");
        if (this.f8997a) {
            sb.append("launchSingleTop ");
        }
        if (this.f8998b) {
            sb.append("restoreState ");
        }
        int i2 = this.f8999c;
        String str = this.f9006j;
        if ((str != null || i2 != -1) && str != null) {
            sb.append("popUpTo(");
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x");
                sb.append(Integer.toHexString(i2));
            }
            if (this.f9000d) {
                sb.append(" inclusive");
            }
            if (this.f9001e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i3 = this.f9005i;
        int i4 = this.f9004h;
        int i5 = this.f9003g;
        int i6 = this.f9002f;
        if (i6 != -1 || i5 != -1 || i4 != -1 || i3 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i6));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i5));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(")");
        }
        String sb2 = sb.toString();
        z2.h.e(sb2, "sb.toString()");
        return sb2;
    }
}
