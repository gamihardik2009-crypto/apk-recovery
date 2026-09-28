package O0;

import B1.C;
import B1.t;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f5132a;

    public /* synthetic */ a(long j3) {
        this.f5132a = j3;
    }

    public static long a(long j3, int i2, int i3, int i4, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i2 = j(j3);
        }
        if ((i6 & 2) != 0) {
            i3 = h(j3);
        }
        if ((i6 & 4) != 0) {
            i4 = i(j3);
        }
        if ((i6 & 8) != 0) {
            i5 = g(j3);
        }
        if (!(i4 >= 0 && i2 >= 0)) {
            K1.f.R("minHeight(" + i4 + ") and minWidth(" + i2 + ") must be >= 0");
            throw null;
        }
        if (!(i3 >= i2)) {
            K1.f.R("maxWidth(" + i3 + ") must be >= minWidth(" + i2 + ')');
            throw null;
        }
        if (i5 >= i4) {
            return C.L(i2, i3, i4, i5);
        }
        K1.f.R("maxHeight(" + i5 + ") must be >= minHeight(" + i4 + ')');
        throw null;
    }

    public static final boolean b(long j3, long j4) {
        return j3 == j4;
    }

    public static final boolean c(long j3) {
        int i2 = (int) (3 & j3);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return (((int) (j3 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) != 0;
    }

    public static final boolean d(long j3) {
        int i2 = (int) (3 & j3);
        return (((int) (j3 >> 33)) & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j3) {
        int i2 = (int) (3 & j3);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i4 = (1 << (18 - i3)) - 1;
        int i5 = ((int) (j3 >> (i3 + 15))) & i4;
        int i6 = ((int) (j3 >> (i3 + 46))) & i4;
        return i5 == (i6 == 0 ? Integer.MAX_VALUE : i6 - 1);
    }

    public static final boolean f(long j3) {
        int i2 = (int) (3 & j3);
        int i3 = (1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1;
        int i4 = ((int) (j3 >> 2)) & i3;
        int i5 = ((int) (j3 >> 33)) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final int g(long j3) {
        int i2 = (int) (3 & j3);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        int i4 = ((int) (j3 >> (i3 + 46))) & ((1 << (18 - i3)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    public static final int h(long j3) {
        int i2 = (int) (3 & j3);
        int i3 = (int) (j3 >> 33);
        int i4 = i3 & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    public static final int i(long j3) {
        int i2 = (int) (3 & j3);
        int i3 = (((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1);
        return ((int) (j3 >> (i3 + 15))) & ((1 << (18 - i3)) - 1);
    }

    public static final int j(long j3) {
        int i2 = (int) (3 & j3);
        return ((int) (j3 >> 2)) & ((1 << (((((i2 & 2) >> 1) * 3) + ((i2 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j3) {
        int h2 = h(j3);
        String valueOf = h2 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h2);
        int g3 = g(j3);
        String valueOf2 = g3 != Integer.MAX_VALUE ? String.valueOf(g3) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j3));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(i(j3));
        sb.append(", maxHeight = ");
        return t.k(sb, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f5132a == ((a) obj).f5132a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5132a);
    }

    public final String toString() {
        return k(this.f5132a);
    }
}
