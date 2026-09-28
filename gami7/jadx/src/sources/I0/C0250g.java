package I0;

/* renamed from: I0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250g implements InterfaceC0252i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3894a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3895b;

    public C0250g(int i2, int i3) {
        this.f3894a = i2;
        this.f3895b = i3;
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.").toString());
        }
    }

    @Override // I0.InterfaceC0252i
    public final void a(j jVar) {
        int i2 = jVar.f3900c;
        int i3 = this.f3895b;
        int i4 = i2 + i3;
        int i5 = (i2 ^ i4) & (i3 ^ i4);
        E0.f fVar = jVar.f3898a;
        if (i5 < 0) {
            i4 = fVar.b();
        }
        jVar.a(jVar.f3900c, Math.min(i4, fVar.b()));
        int i6 = jVar.f3899b;
        int i7 = this.f3894a;
        int i8 = i6 - i7;
        if (((i6 ^ i8) & (i7 ^ i6)) < 0) {
            i8 = 0;
        }
        jVar.a(Math.max(0, i8), jVar.f3899b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0250g)) {
            return false;
        }
        C0250g c0250g = (C0250g) obj;
        return this.f3894a == c0250g.f3894a && this.f3895b == c0250g.f3895b;
    }

    public final int hashCode() {
        return (this.f3894a * 31) + this.f3895b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f3894a);
        sb.append(", lengthAfterCursor=");
        return B1.t.j(sb, this.f3895b, ')');
    }
}
