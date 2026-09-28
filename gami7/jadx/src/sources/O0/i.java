package O0;

import B1.t;
import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f5142e = new i(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f5143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5145c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5146d;

    public i(int i2, int i3, int i4, int i5) {
        this.f5143a = i2;
        this.f5144b = i3;
        this.f5145c = i4;
        this.f5146d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5143a == iVar.f5143a && this.f5144b == iVar.f5144b && this.f5145c == iVar.f5145c && this.f5146d == iVar.f5146d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5146d) + AbstractC0837j.b(this.f5145c, AbstractC0837j.b(this.f5144b, Integer.hashCode(this.f5143a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f5143a);
        sb.append(", ");
        sb.append(this.f5144b);
        sb.append(", ");
        sb.append(this.f5145c);
        sb.append(", ");
        return t.j(sb, this.f5146d, ')');
    }
}
