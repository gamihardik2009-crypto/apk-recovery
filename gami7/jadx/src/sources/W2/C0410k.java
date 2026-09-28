package W2;

import H.E5;
import m2.C0870l;
import n2.AbstractC0961m;

/* renamed from: W2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410k extends y {

    /* renamed from: l, reason: collision with root package name */
    public final U2.c f6145l;

    /* renamed from: m, reason: collision with root package name */
    public final C0870l f6146m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410k(String str, int i2) {
        super(str, null, i2);
        z2.h.f(str, "name");
        this.f6145l = U2.c.f5803h;
        this.f6146m = new C0870l(new E5(i2, 1, str, this));
    }

    @Override // W2.y, U2.f
    public final U2.f d(int i2) {
        return ((U2.f[]) this.f6146m.getValue())[i2];
    }

    @Override // W2.y, U2.f
    public final B1.C e() {
        return this.f6145l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof U2.f)) {
            return false;
        }
        U2.f fVar = (U2.f) obj;
        if (fVar.e() != U2.c.f5803h) {
            return false;
        }
        return z2.h.a(this.f6166a, fVar.b()) && z2.h.a(w.b(this), w.b(fVar));
    }

    @Override // W2.y
    public final int hashCode() {
        int hashCode = this.f6166a.hashCode();
        U2.h hVar = new U2.h(this, 1);
        int i2 = 1;
        while (hVar.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) hVar.next();
            i2 = i3 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i2;
    }

    @Override // W2.y
    public final String toString() {
        return AbstractC0961m.L(new G2.l(1, this), ", ", B1.t.k(new StringBuilder(), this.f6166a, '('), ")", null, 56);
    }
}
