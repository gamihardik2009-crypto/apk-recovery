package K1;

import B1.t;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f4551a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4552b;

    public j(String str, int i2) {
        z2.h.f(str, "workSpecId");
        this.f4551a = str;
        this.f4552b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return z2.h.a(this.f4551a, jVar.f4551a) && this.f4552b == jVar.f4552b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4552b) + (this.f4551a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f4551a);
        sb.append(", generation=");
        return t.j(sb, this.f4552b, ')');
    }
}
