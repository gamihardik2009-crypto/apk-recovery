package R1;

import B1.t;
import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f5487a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5488b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5489c;

    public d(int i2, int i3, int i4) {
        this.f5487a = i2;
        this.f5488b = i3;
        this.f5489c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5487a == dVar.f5487a && this.f5488b == dVar.f5488b && this.f5489c == dVar.f5489c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5489c) + AbstractC0837j.b(this.f5488b, Integer.hashCode(this.f5487a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeStatsData(sent=");
        sb.append(this.f5487a);
        sb.append(", failed=");
        sb.append(this.f5488b);
        sb.append(", pending=");
        return t.j(sb, this.f5489c, ')');
    }
}
