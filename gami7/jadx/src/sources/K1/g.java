package K1;

import B1.t;
import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f4542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4543b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4544c;

    public g(int i2, int i3, String str) {
        z2.h.f(str, "workSpecId");
        this.f4542a = str;
        this.f4543b = i2;
        this.f4544c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return z2.h.a(this.f4542a, gVar.f4542a) && this.f4543b == gVar.f4543b && this.f4544c == gVar.f4544c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4544c) + AbstractC0837j.b(this.f4543b, this.f4542a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f4542a);
        sb.append(", generation=");
        sb.append(this.f4543b);
        sb.append(", systemId=");
        return t.j(sb, this.f4544c, ')');
    }
}
