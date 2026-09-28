package i0;

/* renamed from: i0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724q extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7927b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7928c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7929d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7930e;

    public C0724q(float f3, float f4, float f5, float f6) {
        super(2, true);
        this.f7927b = f3;
        this.f7928c = f4;
        this.f7929d = f5;
        this.f7930e = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0724q)) {
            return false;
        }
        C0724q c0724q = (C0724q) obj;
        return Float.compare(this.f7927b, c0724q.f7927b) == 0 && Float.compare(this.f7928c, c0724q.f7928c) == 0 && Float.compare(this.f7929d, c0724q.f7929d) == 0 && Float.compare(this.f7930e, c0724q.f7930e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7930e) + B1.t.c(this.f7929d, B1.t.c(this.f7928c, Float.hashCode(this.f7927b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f7927b);
        sb.append(", dy1=");
        sb.append(this.f7928c);
        sb.append(", dx2=");
        sb.append(this.f7929d);
        sb.append(", dy2=");
        return B1.t.i(sb, this.f7930e, ')');
    }
}
