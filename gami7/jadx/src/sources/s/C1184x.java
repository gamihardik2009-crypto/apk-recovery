package s;

/* renamed from: s.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184x implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final Y f10184a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f10185b;

    public C1184x(Y y3, Y y4) {
        this.f10184a = y3;
        this.f10185b = y4;
    }

    @Override // s.Y
    public final int a(O0.b bVar, O0.k kVar) {
        int a3 = this.f10184a.a(bVar, kVar) - this.f10185b.a(bVar, kVar);
        if (a3 < 0) {
            return 0;
        }
        return a3;
    }

    @Override // s.Y
    public final int b(O0.b bVar) {
        int b3 = this.f10184a.b(bVar) - this.f10185b.b(bVar);
        if (b3 < 0) {
            return 0;
        }
        return b3;
    }

    @Override // s.Y
    public final int c(O0.b bVar, O0.k kVar) {
        int c3 = this.f10184a.c(bVar, kVar) - this.f10185b.c(bVar, kVar);
        if (c3 < 0) {
            return 0;
        }
        return c3;
    }

    @Override // s.Y
    public final int d(O0.b bVar) {
        int d3 = this.f10184a.d(bVar) - this.f10185b.d(bVar);
        if (d3 < 0) {
            return 0;
        }
        return d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184x)) {
            return false;
        }
        C1184x c1184x = (C1184x) obj;
        return z2.h.a(c1184x.f10184a, this.f10184a) && z2.h.a(c1184x.f10185b, this.f10185b);
    }

    public final int hashCode() {
        return this.f10185b.hashCode() + (this.f10184a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f10184a + " - " + this.f10185b + ')';
    }
}
