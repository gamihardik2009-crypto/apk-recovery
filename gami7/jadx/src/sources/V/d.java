package V;

import a.AbstractC0423a;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public final float f5847b;

    public d(float f3) {
        this.f5847b = f3;
    }

    @Override // V.c
    public final long a(long j3, long j4, O0.k kVar) {
        long e3 = l0.c.e(((int) (j4 >> 32)) - ((int) (j3 >> 32)), ((int) (j4 & 4294967295L)) - ((int) (j3 & 4294967295L)));
        float f3 = 1;
        return AbstractC0423a.m(Math.round((this.f5847b + f3) * (((int) (e3 >> 32)) / 2.0f)), Math.round((f3 - 1.0f) * (((int) (e3 & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Float.compare(this.f5847b, ((d) obj).f5847b) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f5847b) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f5847b + ", verticalBias=-1.0)";
    }
}
