package O0;

import B1.t;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f5141a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final long b(long j3, long j4) {
        return ((((int) (j3 >> 32)) - ((int) (j4 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j3, long j4) {
        return ((((int) (j3 >> 32)) + ((int) (j4 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f5141a == ((h) obj).f5141a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5141a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j3 = this.f5141a;
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return t.j(sb, (int) (j3 & 4294967295L), ')');
    }
}
