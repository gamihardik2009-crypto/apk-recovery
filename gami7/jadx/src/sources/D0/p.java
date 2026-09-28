package D0;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f978b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f979c;

    public p(int i2, int i3, boolean z3) {
        this.f977a = i2;
        this.f978b = i3;
        this.f979c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f977a == pVar.f977a && this.f978b == pVar.f978b && this.f979c == pVar.f979c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f979c) + AbstractC0837j.b(this.f978b, Integer.hashCode(this.f977a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f977a + ", end=" + this.f978b + ", isRtl=" + this.f979c + ')';
    }
}
