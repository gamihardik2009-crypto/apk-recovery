package H;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class X3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2159b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2160c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2161d;

    public X3(String str, String str2, boolean z3, int i2) {
        this.f2158a = str;
        this.f2159b = str2;
        this.f2160c = z3;
        this.f2161d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X3.class != obj.getClass()) {
            return false;
        }
        X3 x3 = (X3) obj;
        return z2.h.a(this.f2158a, x3.f2158a) && z2.h.a(this.f2159b, x3.f2159b) && this.f2160c == x3.f2160c && this.f2161d == x3.f2161d;
    }

    public final int hashCode() {
        int hashCode = this.f2158a.hashCode() * 31;
        String str = this.f2159b;
        return AbstractC0837j.d(this.f2161d) + B1.t.f((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f2160c);
    }
}
