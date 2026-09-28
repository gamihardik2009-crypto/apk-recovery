package W2;

/* loaded from: classes.dex */
public final class B implements U2.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f6109a;

    /* renamed from: b, reason: collision with root package name */
    public final U2.e f6110b;

    public B(String str, U2.e eVar) {
        this.f6109a = str;
        this.f6110b = eVar;
    }

    @Override // U2.f
    public final String a(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // U2.f
    public final String b() {
        return this.f6109a;
    }

    @Override // U2.f
    public final U2.f d(int i2) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // U2.f
    public final B1.C e() {
        return this.f6110b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b3 = (B) obj;
        if (z2.h.a(this.f6109a, b3.f6109a)) {
            if (z2.h.a(this.f6110b, b3.f6110b)) {
                return true;
            }
        }
        return false;
    }

    @Override // U2.f
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return (this.f6110b.hashCode() * 31) + this.f6109a.hashCode();
    }

    public final String toString() {
        return B1.t.k(new StringBuilder("PrimitiveDescriptor("), this.f6109a, ')');
    }
}
