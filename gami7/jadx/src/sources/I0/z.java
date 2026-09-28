package I0;

import C0.C0024g;
import C0.J;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final K1.e f3931d;

    /* renamed from: a, reason: collision with root package name */
    public final C0024g f3932a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3933b;

    /* renamed from: c, reason: collision with root package name */
    public final J f3934c;

    static {
        y yVar = y.f3930i;
        C0247d c0247d = C0247d.f3871l;
        K1.e eVar = S.n.f5572a;
        f3931d = new K1.e(yVar, c0247d);
    }

    public z(C0024g c0024g, long j3, J j4) {
        J j5;
        this.f3932a = c0024g;
        this.f3933b = B1.C.F(j3, c0024g.f500a.length());
        if (j4 != null) {
            j5 = new J(B1.C.F(j4.f473a, c0024g.f500a.length()));
        } else {
            j5 = null;
        }
        this.f3934c = j5;
    }

    public static z a(z zVar, C0024g c0024g, long j3, int i2) {
        if ((i2 & 1) != 0) {
            c0024g = zVar.f3932a;
        }
        if ((i2 & 2) != 0) {
            j3 = zVar.f3933b;
        }
        J j4 = (i2 & 4) != 0 ? zVar.f3934c : null;
        zVar.getClass();
        return new z(c0024g, j3, j4);
    }

    public static z b(z zVar, String str) {
        long j3 = zVar.f3933b;
        J j4 = zVar.f3934c;
        zVar.getClass();
        return new z(new C0024g(str, null, 6), j3, j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return J.a(this.f3933b, zVar.f3933b) && z2.h.a(this.f3934c, zVar.f3934c) && z2.h.a(this.f3932a, zVar.f3932a);
    }

    public final int hashCode() {
        int hashCode = this.f3932a.hashCode() * 31;
        int i2 = J.f472c;
        int d3 = B1.t.d(hashCode, 31, this.f3933b);
        J j3 = this.f3934c;
        return d3 + (j3 != null ? Long.hashCode(j3.f473a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f3932a) + "', selection=" + ((Object) J.g(this.f3933b)) + ", composition=" + this.f3934c + ')';
    }

    public z(String str, long j3, int i2) {
        this(new C0024g((i2 & 1) != 0 ? "" : str, null, 6), (i2 & 2) != 0 ? J.f471b : j3, (J) null);
    }
}
