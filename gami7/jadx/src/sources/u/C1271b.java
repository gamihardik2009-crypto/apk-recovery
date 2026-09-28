package u;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271b {

    /* renamed from: a, reason: collision with root package name */
    public final long f10667a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1271b) {
            return this.f10667a == ((C1271b) obj).f10667a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10667a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f10667a + ')';
    }
}
