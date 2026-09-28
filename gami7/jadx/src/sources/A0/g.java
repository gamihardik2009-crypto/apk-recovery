package A0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f26d = new g(0.0f, new E2.a(0.0f, 0.0f), 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f27a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.a f28b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29c;

    public g(float f3, E2.a aVar, int i2) {
        this.f27a = f3;
        this.f28b = aVar;
        this.f29c = i2;
        if (!(!Float.isNaN(f3))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f27a == gVar.f27a && z2.h.a(this.f28b, gVar.f28b) && this.f29c == gVar.f29c;
    }

    public final int hashCode() {
        return ((this.f28b.hashCode() + (Float.hashCode(this.f27a) * 31)) * 31) + this.f29c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f27a);
        sb.append(", range=");
        sb.append(this.f28b);
        sb.append(", steps=");
        return B1.t.j(sb, this.f29c, ')');
    }
}
