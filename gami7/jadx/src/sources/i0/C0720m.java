package i0;

/* renamed from: i0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720m extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7914b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7915c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7916d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7917e;

    public C0720m(float f3, float f4, float f5, float f6) {
        super(2, true);
        this.f7914b = f3;
        this.f7915c = f4;
        this.f7916d = f5;
        this.f7917e = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0720m)) {
            return false;
        }
        C0720m c0720m = (C0720m) obj;
        return Float.compare(this.f7914b, c0720m.f7914b) == 0 && Float.compare(this.f7915c, c0720m.f7915c) == 0 && Float.compare(this.f7916d, c0720m.f7916d) == 0 && Float.compare(this.f7917e, c0720m.f7917e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7917e) + B1.t.c(this.f7916d, B1.t.c(this.f7915c, Float.hashCode(this.f7914b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f7914b);
        sb.append(", y1=");
        sb.append(this.f7915c);
        sb.append(", x2=");
        sb.append(this.f7916d);
        sb.append(", y2=");
        return B1.t.i(sb, this.f7917e, ')');
    }
}
