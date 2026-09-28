package m;

/* loaded from: classes.dex */
public final class r extends AbstractC0845s {

    /* renamed from: a, reason: collision with root package name */
    public float f8564a;

    /* renamed from: b, reason: collision with root package name */
    public float f8565b;

    /* renamed from: c, reason: collision with root package name */
    public float f8566c;

    /* renamed from: d, reason: collision with root package name */
    public float f8567d;

    public r(float f3, float f4, float f5, float f6) {
        this.f8564a = f3;
        this.f8565b = f4;
        this.f8566c = f5;
        this.f8567d = f6;
    }

    @Override // m.AbstractC0845s
    public final float a(int i2) {
        if (i2 == 0) {
            return this.f8564a;
        }
        if (i2 == 1) {
            return this.f8565b;
        }
        if (i2 == 2) {
            return this.f8566c;
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return this.f8567d;
    }

    @Override // m.AbstractC0845s
    public final int b() {
        return 4;
    }

    @Override // m.AbstractC0845s
    public final AbstractC0845s c() {
        return new r(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // m.AbstractC0845s
    public final void d() {
        this.f8564a = 0.0f;
        this.f8565b = 0.0f;
        this.f8566c = 0.0f;
        this.f8567d = 0.0f;
    }

    @Override // m.AbstractC0845s
    public final void e(float f3, int i2) {
        if (i2 == 0) {
            this.f8564a = f3;
            return;
        }
        if (i2 == 1) {
            this.f8565b = f3;
        } else if (i2 == 2) {
            this.f8566c = f3;
        } else {
            if (i2 != 3) {
                return;
            }
            this.f8567d = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.f8564a == this.f8564a && rVar.f8565b == this.f8565b && rVar.f8566c == this.f8566c && rVar.f8567d == this.f8567d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8567d) + B1.t.c(this.f8566c, B1.t.c(this.f8565b, Float.hashCode(this.f8564a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f8564a + ", v2 = " + this.f8565b + ", v3 = " + this.f8566c + ", v4 = " + this.f8567d;
    }
}
