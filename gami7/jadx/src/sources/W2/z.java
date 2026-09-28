package W2;

/* loaded from: classes.dex */
public final class z implements U2.f {

    /* renamed from: a, reason: collision with root package name */
    public final U2.f f6177a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6178b;

    public z(U2.f fVar) {
        z2.h.f(fVar, "primitive");
        this.f6177a = fVar;
        this.f6178b = fVar.b() + "Array";
    }

    @Override // U2.f
    public final String a(int i2) {
        return String.valueOf(i2);
    }

    @Override // U2.f
    public final String b() {
        return this.f6178b;
    }

    @Override // U2.f
    public final U2.f d(int i2) {
        if (i2 >= 0) {
            return this.f6177a;
        }
        StringBuilder l3 = B1.t.l("Illegal index ", i2, ", ");
        l3.append(this.f6178b);
        l3.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l3.toString().toString());
    }

    @Override // U2.f
    public final B1.C e() {
        return U2.j.f5826g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (z2.h.a(this.f6177a, zVar.f6177a)) {
            if (z2.h.a(this.f6178b, zVar.f6178b)) {
                return true;
            }
        }
        return false;
    }

    @Override // U2.f
    public final int f() {
        return 1;
    }

    public final int hashCode() {
        return this.f6178b.hashCode() + (this.f6177a.hashCode() * 31);
    }

    public final String toString() {
        return this.f6178b + '(' + this.f6177a + ')';
    }
}
