package H0;

import B1.C;
import B1.t;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final int f3389a;

    public a(int i2) {
        this.f3389a = i2;
    }

    @Override // H0.p
    public final k a(k kVar) {
        int i2 = this.f3389a;
        return (i2 == 0 || i2 == Integer.MAX_VALUE) ? kVar : new k(C.C(kVar.f3405h + i2, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3389a == ((a) obj).f3389a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3389a);
    }

    public final String toString() {
        return t.j(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f3389a, ')');
    }
}
