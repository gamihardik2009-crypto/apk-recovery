package N0;

import B1.t;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f4999c = new n(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f5000a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5001b;

    public n(float f3, float f4) {
        this.f5000a = f3;
        this.f5001b = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f5000a == nVar.f5000a && this.f5001b == nVar.f5001b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5001b) + (Float.hashCode(this.f5000a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f5000a);
        sb.append(", skewX=");
        return t.i(sb, this.f5001b, ')');
    }
}
