package s;

/* renamed from: s.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152E {

    /* renamed from: a, reason: collision with root package name */
    public final int f10048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10049b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10050c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10051d;

    public C1152E(int i2, int i3, int i4, int i5) {
        this.f10048a = i2;
        this.f10049b = i3;
        this.f10050c = i4;
        this.f10051d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1152E)) {
            return false;
        }
        C1152E c1152e = (C1152E) obj;
        return this.f10048a == c1152e.f10048a && this.f10049b == c1152e.f10049b && this.f10050c == c1152e.f10050c && this.f10051d == c1152e.f10051d;
    }

    public final int hashCode() {
        return (((((this.f10048a * 31) + this.f10049b) * 31) + this.f10050c) * 31) + this.f10051d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f10048a);
        sb.append(", top=");
        sb.append(this.f10049b);
        sb.append(", right=");
        sb.append(this.f10050c);
        sb.append(", bottom=");
        return B1.t.j(sb, this.f10051d, ')');
    }
}
