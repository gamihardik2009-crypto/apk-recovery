package N0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f4986c = new g(f.f4984b, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f4987a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4988b;

    public g(float f3, int i2) {
        this.f4987a = f3;
        this.f4988b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f3 = gVar.f4987a;
        float f4 = f.f4983a;
        return Float.compare(this.f4987a, f3) == 0 && this.f4988b == gVar.f4988b;
    }

    public final int hashCode() {
        float f3 = f.f4983a;
        return Integer.hashCode(this.f4988b) + (Float.hashCode(this.f4987a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f3 = this.f4987a;
        if (f3 == 0.0f) {
            float f4 = f.f4983a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f3 == f.f4983a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f3 == f.f4984b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f3 == f.f4985c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f3 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i2 = this.f4988b;
        sb.append((Object) (i2 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i2 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i2 == 17 ? "LineHeightStyle.Trim.Both" : i2 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
