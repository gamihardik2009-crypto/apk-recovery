package A0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f23a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.a f24b;

    public d(String str, y2.a aVar) {
        this.f23a = str;
        this.f24b = aVar;
    }

    public final String a() {
        return this.f23a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return z2.h.a(this.f23a, dVar.f23a) && this.f24b == dVar.f24b;
    }

    public final int hashCode() {
        return this.f24b.hashCode() + (this.f23a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f23a + ", action=" + this.f24b + ')';
    }
}
