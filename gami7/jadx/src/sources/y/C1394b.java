package y;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1394b implements InterfaceC1393a {

    /* renamed from: a, reason: collision with root package name */
    public final float f11480a;

    public C1394b(float f3) {
        this.f11480a = f3;
    }

    @Override // y.InterfaceC1393a
    public final float a(long j3, O0.b bVar) {
        return bVar.P(this.f11480a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1394b) && O0.e.a(this.f11480a, ((C1394b) obj).f11480a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f11480a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f11480a + ".dp)";
    }
}
