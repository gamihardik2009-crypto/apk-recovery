package i0;

/* renamed from: i0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723p extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7925b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7926c;

    public C0723p(float f3, float f4) {
        super(3, false);
        this.f7925b = f3;
        this.f7926c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0723p)) {
            return false;
        }
        C0723p c0723p = (C0723p) obj;
        return Float.compare(this.f7925b, c0723p.f7925b) == 0 && Float.compare(this.f7926c, c0723p.f7926c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7926c) + (Float.hashCode(this.f7925b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f7925b);
        sb.append(", dy=");
        return B1.t.i(sb, this.f7926c, ')');
    }
}
