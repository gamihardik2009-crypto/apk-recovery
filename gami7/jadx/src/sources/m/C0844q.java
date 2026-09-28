package m;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844q extends AbstractC0845s {

    /* renamed from: a, reason: collision with root package name */
    public float f8560a;

    /* renamed from: b, reason: collision with root package name */
    public float f8561b;

    /* renamed from: c, reason: collision with root package name */
    public float f8562c;

    public C0844q(float f3, float f4, float f5) {
        this.f8560a = f3;
        this.f8561b = f4;
        this.f8562c = f5;
    }

    @Override // m.AbstractC0845s
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f8560a;
        }
        if (i2 == 1) {
            return this.f8561b;
        }
        if (i2 != 2) {
            return 0.0f;
        }
        return this.f8562c;
    }

    @Override // m.AbstractC0845s
    public final int b() {
        return 3;
    }

    @Override // m.AbstractC0845s
    public final AbstractC0845s c() {
        return new C0844q(0.0f, 0.0f, 0.0f);
    }

    @Override // m.AbstractC0845s
    public final void d() {
        this.f8560a = 0.0f;
        this.f8561b = 0.0f;
        this.f8562c = 0.0f;
    }

    @Override // m.AbstractC0845s
    public final void e(float f3, int i2) {
        if (i2 == 0) {
            this.f8560a = f3;
        } else if (i2 == 1) {
            this.f8561b = f3;
        } else {
            if (i2 != 2) {
                return;
            }
            this.f8562c = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0844q) {
            C0844q c0844q = (C0844q) obj;
            if (c0844q.f8560a == this.f8560a && c0844q.f8561b == this.f8561b && c0844q.f8562c == this.f8562c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8562c) + B1.t.c(this.f8561b, Float.hashCode(this.f8560a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f8560a + ", v2 = " + this.f8561b + ", v3 = " + this.f8562c;
    }
}
