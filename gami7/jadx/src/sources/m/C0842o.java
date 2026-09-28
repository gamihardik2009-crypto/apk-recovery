package m;

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842o extends AbstractC0845s {

    /* renamed from: a, reason: collision with root package name */
    public float f8543a;

    public C0842o(float f3) {
        this.f8543a = f3;
    }

    @Override // m.AbstractC0845s
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f8543a;
        }
        return 0.0f;
    }

    @Override // m.AbstractC0845s
    public final int b() {
        return 1;
    }

    @Override // m.AbstractC0845s
    public final AbstractC0845s c() {
        return new C0842o(0.0f);
    }

    @Override // m.AbstractC0845s
    public final void d() {
        this.f8543a = 0.0f;
    }

    @Override // m.AbstractC0845s
    public final void e(float f3, int i2) {
        if (i2 == 0) {
            this.f8543a = f3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0842o) && ((C0842o) obj).f8543a == this.f8543a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8543a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f8543a;
    }
}
