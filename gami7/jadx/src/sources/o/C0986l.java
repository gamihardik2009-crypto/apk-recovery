package o;

/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986l extends AbstractC0987m {

    /* renamed from: a, reason: collision with root package name */
    public final long f9215a;

    public C0986l(long j3) {
        this.f9215a = j3;
        if (!K1.f.F(j3)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0986l)) {
            return false;
        }
        return b0.c.b(this.f9215a, ((C0986l) obj).f9215a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f9215a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) b0.c.j(this.f9215a)) + ')';
    }
}
