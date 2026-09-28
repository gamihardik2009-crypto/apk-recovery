package H;

/* loaded from: classes.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1664a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.f f1665b;

    public K1(W3 w3, R.a aVar) {
        this.f1664a = w3;
        this.f1665b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K1)) {
            return false;
        }
        K1 k12 = (K1) obj;
        return z2.h.a(this.f1664a, k12.f1664a) && z2.h.a(this.f1665b, k12.f1665b);
    }

    public final int hashCode() {
        Object obj = this.f1664a;
        return this.f1665b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f1664a + ", transition=" + this.f1665b + ')';
    }
}
