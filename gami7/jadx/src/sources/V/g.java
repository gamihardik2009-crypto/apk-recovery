package V;

import B1.t;
import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    public final float f5850b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5851c;

    public g(float f3, float f4) {
        this.f5850b = f3;
        this.f5851c = f4;
    }

    @Override // V.c
    public final long a(long j3, long j4, O0.k kVar) {
        float f3 = (((int) (j4 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float f4 = (((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        O0.k kVar2 = O0.k.f5148h;
        float f5 = this.f5850b;
        if (kVar != kVar2) {
            f5 *= -1;
        }
        float f6 = 1;
        return AbstractC0423a.m(Math.round((f5 + f6) * f3), Math.round((f6 + this.f5851c) * f4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f5850b, gVar.f5850b) == 0 && Float.compare(this.f5851c, gVar.f5851c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5851c) + (Float.hashCode(this.f5850b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f5850b);
        sb.append(", verticalBias=");
        return t.i(sb, this.f5851c, ')');
    }
}
