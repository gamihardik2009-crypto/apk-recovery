package V;

import B1.t;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f5848a;

    public e(float f3) {
        this.f5848a = f3;
    }

    public final int a(int i2, int i3, O0.k kVar) {
        float f3 = (i3 - i2) / 2.0f;
        O0.k kVar2 = O0.k.f5148h;
        float f4 = this.f5848a;
        if (kVar != kVar2) {
            f4 *= -1;
        }
        return Math.round((1 + f4) * f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f5848a, ((e) obj).f5848a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5848a);
    }

    public final String toString() {
        return t.i(new StringBuilder("Horizontal(bias="), this.f5848a, ')');
    }
}
