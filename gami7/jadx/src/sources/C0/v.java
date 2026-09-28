package C0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f554c = new v(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f556b;

    public v() {
        this.f555a = false;
        this.f556b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f555a == vVar.f555a && this.f556b == vVar.f556b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f556b) + (Boolean.hashCode(this.f555a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f555a + ", emojiSupportMatch=" + ((Object) C0027j.a(this.f556b)) + ')';
    }

    public v(int i2, boolean z3) {
        this.f555a = z3;
        this.f556b = i2;
    }
}
