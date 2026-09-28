package i0;

/* renamed from: i0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721n extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7918b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7919c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7920d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7921e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7922f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7923g;

    public C0721n(float f3, float f4, float f5, float f6, float f7, float f8) {
        super(2, true);
        this.f7918b = f3;
        this.f7919c = f4;
        this.f7920d = f5;
        this.f7921e = f6;
        this.f7922f = f7;
        this.f7923g = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0721n)) {
            return false;
        }
        C0721n c0721n = (C0721n) obj;
        return Float.compare(this.f7918b, c0721n.f7918b) == 0 && Float.compare(this.f7919c, c0721n.f7919c) == 0 && Float.compare(this.f7920d, c0721n.f7920d) == 0 && Float.compare(this.f7921e, c0721n.f7921e) == 0 && Float.compare(this.f7922f, c0721n.f7922f) == 0 && Float.compare(this.f7923g, c0721n.f7923g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7923g) + B1.t.c(this.f7922f, B1.t.c(this.f7921e, B1.t.c(this.f7920d, B1.t.c(this.f7919c, Float.hashCode(this.f7918b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f7918b);
        sb.append(", dy1=");
        sb.append(this.f7919c);
        sb.append(", dx2=");
        sb.append(this.f7920d);
        sb.append(", dy2=");
        sb.append(this.f7921e);
        sb.append(", dx3=");
        sb.append(this.f7922f);
        sb.append(", dy3=");
        return B1.t.i(sb, this.f7923g, ')');
    }
}
