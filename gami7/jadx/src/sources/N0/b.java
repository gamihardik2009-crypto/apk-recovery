package N0;

import B1.t;
import c0.AbstractC0574N;
import c0.AbstractC0598q;
import c0.C0603v;

/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0574N f4977a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4978b;

    public b(AbstractC0574N abstractC0574N, float f3) {
        this.f4977a = abstractC0574N;
        this.f4978b = f3;
    }

    @Override // N0.m
    public final float a() {
        return this.f4978b;
    }

    @Override // N0.m
    public final long b() {
        int i2 = C0603v.f7278h;
        return C0603v.f7277g;
    }

    @Override // N0.m
    public final AbstractC0598q c() {
        return this.f4977a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return z2.h.a(this.f4977a, bVar.f4977a) && Float.compare(this.f4978b, bVar.f4978b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4978b) + (this.f4977a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f4977a);
        sb.append(", alpha=");
        return t.i(sb, this.f4978b, ')');
    }
}
