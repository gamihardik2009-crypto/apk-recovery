package i0;

/* renamed from: i0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718k extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7910b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7911c;

    public C0718k(float f3, float f4) {
        super(3, false);
        this.f7910b = f3;
        this.f7911c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0718k)) {
            return false;
        }
        C0718k c0718k = (C0718k) obj;
        return Float.compare(this.f7910b, c0718k.f7910b) == 0 && Float.compare(this.f7911c, c0718k.f7911c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7911c) + (Float.hashCode(this.f7910b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f7910b);
        sb.append(", y=");
        return B1.t.i(sb, this.f7911c, ')');
    }
}
