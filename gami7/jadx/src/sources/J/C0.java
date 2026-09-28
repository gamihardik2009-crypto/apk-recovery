package J;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0285q f3972a;

    public /* synthetic */ C0(C0285q c0285q) {
        this.f3972a = c0285q;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0) {
            return z2.h.a(this.f3972a, ((C0) obj).f3972a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3972a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f3972a + ')';
    }
}
