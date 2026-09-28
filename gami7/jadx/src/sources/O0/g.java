package O0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f5140a;

    public static final float a(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f5140a == ((g) obj).f5140a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5140a);
    }

    public final String toString() {
        long j3 = this.f5140a;
        if (j3 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) e.b(b(j3))) + " x " + ((Object) e.b(a(j3)));
    }
}
