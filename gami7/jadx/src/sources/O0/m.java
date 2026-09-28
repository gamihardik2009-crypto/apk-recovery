package O0;

import B1.C;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final n[] f5152b = {new n(0), new n(4294967296L), new n(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f5153c = C.f0(Float.NaN, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f5154a;

    public /* synthetic */ m(long j3) {
        this.f5154a = j3;
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final long b(long j3) {
        return f5152b[(int) ((j3 & 1095216660480L) >>> 32)].f5155a;
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        long b3 = b(j3);
        if (n.a(b3, 0L)) {
            return "Unspecified";
        }
        if (n.a(b3, 4294967296L)) {
            return c(j3) + ".sp";
        }
        if (!n.a(b3, 8589934592L)) {
            return "Invalid";
        }
        return c(j3) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f5154a == ((m) obj).f5154a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5154a);
    }

    public final String toString() {
        return d(this.f5154a);
    }
}
