package s;

/* renamed from: s.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151D implements InterfaceC1159L {

    /* renamed from: a, reason: collision with root package name */
    public final Y f10046a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.b f10047b;

    public C1151D(Y y3, r0.a0 a0Var) {
        this.f10046a = y3;
        this.f10047b = a0Var;
    }

    @Override // s.InterfaceC1159L
    public final float a(O0.k kVar) {
        Y y3 = this.f10046a;
        O0.b bVar = this.f10047b;
        return bVar.o0(y3.c(bVar, kVar));
    }

    @Override // s.InterfaceC1159L
    public final float b(O0.k kVar) {
        Y y3 = this.f10046a;
        O0.b bVar = this.f10047b;
        return bVar.o0(y3.a(bVar, kVar));
    }

    @Override // s.InterfaceC1159L
    public final float c() {
        Y y3 = this.f10046a;
        O0.b bVar = this.f10047b;
        return bVar.o0(y3.d(bVar));
    }

    @Override // s.InterfaceC1159L
    public final float d() {
        Y y3 = this.f10046a;
        O0.b bVar = this.f10047b;
        return bVar.o0(y3.b(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1151D)) {
            return false;
        }
        C1151D c1151d = (C1151D) obj;
        return z2.h.a(this.f10046a, c1151d.f10046a) && z2.h.a(this.f10047b, c1151d.f10047b);
    }

    public final int hashCode() {
        return this.f10047b.hashCode() + (this.f10046a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f10046a + ", density=" + this.f10047b + ')';
    }
}
