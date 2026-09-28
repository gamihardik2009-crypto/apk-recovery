package R0;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final int f5380a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5381b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5382c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5383d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5384e;

    public B(int i2, boolean z3) {
        this((i2 & 1) != 0 ? false : z3, true, true, 1, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b3 = (B) obj;
        return this.f5380a == b3.f5380a && this.f5381b == b3.f5381b && this.f5382c == b3.f5382c && this.f5383d == b3.f5383d && this.f5384e == b3.f5384e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + B1.t.f(B1.t.f(B1.t.f(B1.t.f(this.f5380a * 31, 31, this.f5381b), 31, this.f5382c), 31, this.f5383d), 31, this.f5384e);
    }

    public B(boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7) {
        J.B b3 = k.f5415a;
        int i3 = !z3 ? 262152 : 262144;
        i3 = i2 == 2 ? i3 | 8192 : i3;
        i3 = z7 ? i3 : i3 | 512;
        boolean z8 = i2 == 1;
        this.f5380a = i3;
        this.f5381b = z8;
        this.f5382c = z4;
        this.f5383d = z5;
        this.f5384e = z6;
    }
}
