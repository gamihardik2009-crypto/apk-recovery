package i0;

/* renamed from: i0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716i extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7903b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7904c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7905d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7906e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7907f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7908g;

    public C0716i(float f3, float f4, float f5, float f6, float f7, float f8) {
        super(2, true);
        this.f7903b = f3;
        this.f7904c = f4;
        this.f7905d = f5;
        this.f7906e = f6;
        this.f7907f = f7;
        this.f7908g = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0716i)) {
            return false;
        }
        C0716i c0716i = (C0716i) obj;
        return Float.compare(this.f7903b, c0716i.f7903b) == 0 && Float.compare(this.f7904c, c0716i.f7904c) == 0 && Float.compare(this.f7905d, c0716i.f7905d) == 0 && Float.compare(this.f7906e, c0716i.f7906e) == 0 && Float.compare(this.f7907f, c0716i.f7907f) == 0 && Float.compare(this.f7908g, c0716i.f7908g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7908g) + B1.t.c(this.f7907f, B1.t.c(this.f7906e, B1.t.c(this.f7905d, B1.t.c(this.f7904c, Float.hashCode(this.f7903b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f7903b);
        sb.append(", y1=");
        sb.append(this.f7904c);
        sb.append(", x2=");
        sb.append(this.f7905d);
        sb.append(", y2=");
        sb.append(this.f7906e);
        sb.append(", x3=");
        sb.append(this.f7907f);
        sb.append(", y3=");
        return B1.t.i(sb, this.f7908g, ')');
    }
}
