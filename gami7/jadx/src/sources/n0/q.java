package n0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f8956a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static String b(long j3) {
        return "PointerId(value=" + j3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f8956a == ((q) obj).f8956a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8956a);
    }

    public final String toString() {
        return b(this.f8956a);
    }
}
