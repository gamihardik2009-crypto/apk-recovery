package L2;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4737a;

    public l(Throwable th) {
        this.f4737a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (z2.h.a(this.f4737a, ((l) obj).f4737a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f4737a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // L2.m
    public final String toString() {
        return "Closed(" + this.f4737a + ')';
    }
}
