package s;

/* loaded from: classes.dex */
public final class V implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final Y f10085a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f10086b;

    public V(Y y3, Y y4) {
        this.f10085a = y3;
        this.f10086b = y4;
    }

    @Override // s.Y
    public final int a(O0.b bVar, O0.k kVar) {
        return Math.max(this.f10085a.a(bVar, kVar), this.f10086b.a(bVar, kVar));
    }

    @Override // s.Y
    public final int b(O0.b bVar) {
        return Math.max(this.f10085a.b(bVar), this.f10086b.b(bVar));
    }

    @Override // s.Y
    public final int c(O0.b bVar, O0.k kVar) {
        return Math.max(this.f10085a.c(bVar, kVar), this.f10086b.c(bVar, kVar));
    }

    @Override // s.Y
    public final int d(O0.b bVar) {
        return Math.max(this.f10085a.d(bVar), this.f10086b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v3 = (V) obj;
        return z2.h.a(v3.f10085a, this.f10085a) && z2.h.a(v3.f10086b, this.f10086b);
    }

    public final int hashCode() {
        return (this.f10086b.hashCode() * 31) + this.f10085a.hashCode();
    }

    public final String toString() {
        return "(" + this.f10085a + " ∪ " + this.f10086b + ')';
    }
}
