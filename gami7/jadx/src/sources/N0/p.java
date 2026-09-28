package N0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f5005c = new p(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final p f5006d = new p(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f5007a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5008b;

    public p(int i2, boolean z3) {
        this.f5007a = i2;
        this.f5008b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f5007a == pVar.f5007a && this.f5008b == pVar.f5008b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5008b) + (Integer.hashCode(this.f5007a) * 31);
    }

    public final String toString() {
        return z2.h.a(this, f5005c) ? "TextMotion.Static" : z2.h.a(this, f5006d) ? "TextMotion.Animated" : "Invalid";
    }
}
