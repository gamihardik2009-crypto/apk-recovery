package K1;

import B1.t;
import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public String f4561a;

    /* renamed from: b, reason: collision with root package name */
    public int f4562b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return z2.h.a(this.f4561a, nVar.f4561a) && this.f4562b == nVar.f4562b;
    }

    public final int hashCode() {
        return AbstractC0837j.d(this.f4562b) + (this.f4561a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f4561a + ", state=" + t.C(this.f4562b) + ')';
    }
}
