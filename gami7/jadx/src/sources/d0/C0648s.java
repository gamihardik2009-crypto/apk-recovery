package d0;

import B1.t;

/* renamed from: d0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648s {

    /* renamed from: a, reason: collision with root package name */
    public final float f7466a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7467b;

    public C0648s(float f3, float f4) {
        this.f7466a = f3;
        this.f7467b = f4;
    }

    public final float[] a() {
        float f3 = this.f7466a;
        float f4 = this.f7467b;
        return new float[]{f3 / f4, 1.0f, ((1.0f - f3) - f4) / f4};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0648s)) {
            return false;
        }
        C0648s c0648s = (C0648s) obj;
        return Float.compare(this.f7466a, c0648s.f7466a) == 0 && Float.compare(this.f7467b, c0648s.f7467b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7467b) + (Float.hashCode(this.f7466a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f7466a);
        sb.append(", y=");
        return t.i(sb, this.f7467b, ')');
    }
}
