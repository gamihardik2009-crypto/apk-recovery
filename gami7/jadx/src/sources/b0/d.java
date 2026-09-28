package b0;

import B1.t;
import C1.y;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f7059e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f7060a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7061b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7062c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7063d;

    public d(float f3, float f4, float f5, float f6) {
        this.f7060a = f3;
        this.f7061b = f4;
        this.f7062c = f5;
        this.f7063d = f6;
    }

    public final boolean a(long j3) {
        return c.d(j3) >= this.f7060a && c.d(j3) < this.f7062c && c.e(j3) >= this.f7061b && c.e(j3) < this.f7063d;
    }

    public final long b() {
        return K1.f.e((d() / 2.0f) + this.f7060a, (c() / 2.0f) + this.f7061b);
    }

    public final float c() {
        return this.f7063d - this.f7061b;
    }

    public final float d() {
        return this.f7062c - this.f7060a;
    }

    public final d e(d dVar) {
        return new d(Math.max(this.f7060a, dVar.f7060a), Math.max(this.f7061b, dVar.f7061b), Math.min(this.f7062c, dVar.f7062c), Math.min(this.f7063d, dVar.f7063d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f7060a, dVar.f7060a) == 0 && Float.compare(this.f7061b, dVar.f7061b) == 0 && Float.compare(this.f7062c, dVar.f7062c) == 0 && Float.compare(this.f7063d, dVar.f7063d) == 0;
    }

    public final boolean f() {
        return this.f7060a >= this.f7062c || this.f7061b >= this.f7063d;
    }

    public final boolean g(d dVar) {
        return this.f7062c > dVar.f7060a && dVar.f7062c > this.f7060a && this.f7063d > dVar.f7061b && dVar.f7063d > this.f7061b;
    }

    public final d h(float f3, float f4) {
        return new d(this.f7060a + f3, this.f7061b + f4, this.f7062c + f3, this.f7063d + f4);
    }

    public final int hashCode() {
        return Float.hashCode(this.f7063d) + t.c(this.f7062c, t.c(this.f7061b, Float.hashCode(this.f7060a) * 31, 31), 31);
    }

    public final d i(long j3) {
        return new d(c.d(j3) + this.f7060a, c.e(j3) + this.f7061b, c.d(j3) + this.f7062c, c.e(j3) + this.f7063d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + y.K(this.f7060a) + ", " + y.K(this.f7061b) + ", " + y.K(this.f7062c) + ", " + y.K(this.f7063d) + ')';
    }
}
