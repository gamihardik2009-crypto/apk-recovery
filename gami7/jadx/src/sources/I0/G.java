package I0;

import C0.C0024g;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final C0024g f3864a;

    /* renamed from: b, reason: collision with root package name */
    public final s f3865b;

    public G(C0024g c0024g, s sVar) {
        this.f3864a = c0024g;
        this.f3865b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return z2.h.a(this.f3864a, g3.f3864a) && z2.h.a(this.f3865b, g3.f3865b);
    }

    public final int hashCode() {
        return this.f3865b.hashCode() + (this.f3864a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f3864a) + ", offsetMapping=" + this.f3865b + ')';
    }
}
