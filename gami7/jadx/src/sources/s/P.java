package s;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public float f10073a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10074b = true;

    /* renamed from: c, reason: collision with root package name */
    public C1183w f10075c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p3 = (P) obj;
        return Float.compare(this.f10073a, p3.f10073a) == 0 && this.f10074b == p3.f10074b && z2.h.a(this.f10075c, p3.f10075c) && z2.h.a(null, null);
    }

    public final int hashCode() {
        int f3 = B1.t.f(Float.hashCode(this.f10073a) * 31, 31, this.f10074b);
        C1183w c1183w = this.f10075c;
        return (f3 + (c1183w == null ? 0 : c1183w.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f10073a + ", fill=" + this.f10074b + ", crossAxisAlignment=" + this.f10075c + ", flowLayoutData=null)";
    }
}
