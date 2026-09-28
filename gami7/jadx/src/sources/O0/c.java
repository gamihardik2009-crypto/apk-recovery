package O0;

import B1.t;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: h, reason: collision with root package name */
    public final float f5133h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5134i;

    public c(float f3, float f4) {
        this.f5133h = f3;
        this.f5134i = f4;
    }

    @Override // O0.b
    public final float c() {
        return this.f5133h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f5133h, cVar.f5133h) == 0 && Float.compare(this.f5134i, cVar.f5134i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5134i) + (Float.hashCode(this.f5133h) * 31);
    }

    @Override // O0.b
    public final float s() {
        return this.f5134i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f5133h);
        sb.append(", fontScale=");
        return t.i(sb, this.f5134i, ')');
    }
}
