package i0;

/* renamed from: i0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719l extends AbstractC0727t {

    /* renamed from: b, reason: collision with root package name */
    public final float f7912b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7913c;

    public C0719l(float f3, float f4) {
        super(3, false);
        this.f7912b = f3;
        this.f7913c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0719l)) {
            return false;
        }
        C0719l c0719l = (C0719l) obj;
        return Float.compare(this.f7912b, c0719l.f7912b) == 0 && Float.compare(this.f7913c, c0719l.f7913c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7913c) + (Float.hashCode(this.f7912b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f7912b);
        sb.append(", y=");
        return B1.t.i(sb, this.f7913c, ')');
    }
}
