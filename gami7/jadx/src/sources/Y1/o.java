package Y1;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f6336a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6337b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6338c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6339d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6340e;

    public o(int i2, int i3, int i4, int i5, float f3) {
        this.f6336a = i2;
        this.f6337b = i3;
        this.f6338c = i4;
        this.f6339d = i5;
        this.f6340e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f6336a == oVar.f6336a && this.f6337b == oVar.f6337b && this.f6338c == oVar.f6338c && this.f6339d == oVar.f6339d && Float.compare(this.f6340e, oVar.f6340e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6340e) + AbstractC0837j.b(this.f6339d, AbstractC0837j.b(this.f6338c, AbstractC0837j.b(this.f6337b, Integer.hashCode(this.f6336a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeStats(total=");
        sb.append(this.f6336a);
        sb.append(", sent=");
        sb.append(this.f6337b);
        sb.append(", failed=");
        sb.append(this.f6338c);
        sb.append(", pending=");
        sb.append(this.f6339d);
        sb.append(", successRate=");
        return B1.t.i(sb, this.f6340e, ')');
    }
}
