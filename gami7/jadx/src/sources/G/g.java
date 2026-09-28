package G;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f1155a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1156b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1157c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1158d;

    public g(float f3, float f4, float f5, float f6) {
        this.f1155a = f3;
        this.f1156b = f4;
        this.f1157c = f5;
        this.f1158d = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1155a == gVar.f1155a && this.f1156b == gVar.f1156b && this.f1157c == gVar.f1157c && this.f1158d == gVar.f1158d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1158d) + B1.t.c(this.f1157c, B1.t.c(this.f1156b, Float.hashCode(this.f1155a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f1155a);
        sb.append(", focusedAlpha=");
        sb.append(this.f1156b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f1157c);
        sb.append(", pressedAlpha=");
        return B1.t.i(sb, this.f1158d, ')');
    }
}
