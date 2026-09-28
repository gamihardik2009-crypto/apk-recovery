package m;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843p extends AbstractC0845s {

    /* renamed from: a, reason: collision with root package name */
    public float f8545a;

    /* renamed from: b, reason: collision with root package name */
    public float f8546b;

    public C0843p(float f3, float f4) {
        this.f8545a = f3;
        this.f8546b = f4;
    }

    @Override // m.AbstractC0845s
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f8545a;
        }
        if (i2 != 1) {
            return 0.0f;
        }
        return this.f8546b;
    }

    @Override // m.AbstractC0845s
    public final int b() {
        return 2;
    }

    @Override // m.AbstractC0845s
    public final AbstractC0845s c() {
        return new C0843p(0.0f, 0.0f);
    }

    @Override // m.AbstractC0845s
    public final void d() {
        this.f8545a = 0.0f;
        this.f8546b = 0.0f;
    }

    @Override // m.AbstractC0845s
    public final void e(float f3, int i2) {
        if (i2 == 0) {
            this.f8545a = f3;
        } else {
            if (i2 != 1) {
                return;
            }
            this.f8546b = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0843p) {
            C0843p c0843p = (C0843p) obj;
            if (c0843p.f8545a == this.f8545a && c0843p.f8546b == this.f8546b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8546b) + (Float.hashCode(this.f8545a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f8545a + ", v2 = " + this.f8546b;
    }
}
