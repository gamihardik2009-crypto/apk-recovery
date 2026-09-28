package O0;

import B1.C;
import B1.t;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: h, reason: collision with root package name */
    public final float f5135h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5136i;

    /* renamed from: j, reason: collision with root package name */
    public final P0.a f5137j;

    public d(float f3, float f4, P0.a aVar) {
        this.f5135h = f3;
        this.f5136i = f4;
        this.f5137j = aVar;
    }

    @Override // O0.b
    public final long J(float f3) {
        return C.f0(this.f5137j.a(f3), 4294967296L);
    }

    @Override // O0.b
    public final float c() {
        return this.f5135h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f5135h, dVar.f5135h) == 0 && Float.compare(this.f5136i, dVar.f5136i) == 0 && z2.h.a(this.f5137j, dVar.f5137j);
    }

    public final int hashCode() {
        return this.f5137j.hashCode() + t.c(this.f5136i, Float.hashCode(this.f5135h) * 31, 31);
    }

    @Override // O0.b
    public final float p0(long j3) {
        if (n.a(m.b(j3), 4294967296L)) {
            return this.f5137j.b(m.c(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Override // O0.b
    public final float s() {
        return this.f5136i;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f5135h + ", fontScale=" + this.f5136i + ", converter=" + this.f5137j + ')';
    }
}
