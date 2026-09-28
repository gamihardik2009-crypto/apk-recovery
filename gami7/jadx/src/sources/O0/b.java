package O0;

import B1.C;
import C1.y;

/* loaded from: classes.dex */
public interface b {
    default long G(long j3) {
        if (j3 != 9205357640488583168L) {
            return C.i(P(g.b(j3)), P(g.a(j3)));
        }
        return 9205357640488583168L;
    }

    default long J(float f3) {
        float[] fArr = P0.b.f5225a;
        if (!(s() >= 1.03f)) {
            return C.f0(f3 / s(), 4294967296L);
        }
        P0.a a3 = P0.b.a(s());
        return C.f0(a3 != null ? a3.a(f3) : f3 / s(), 4294967296L);
    }

    default long M(long j3) {
        if (j3 != 9205357640488583168L) {
            return y.c(r0(b0.f.d(j3)), r0(b0.f.b(j3)));
        }
        return 9205357640488583168L;
    }

    default float P(float f3) {
        return c() * f3;
    }

    default float Q(long j3) {
        if (n.a(m.b(j3), 4294967296L)) {
            return P(p0(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    float c();

    default long g0(float f3) {
        return J(r0(f3));
    }

    default int l(float f3) {
        float P2 = P(f3);
        if (Float.isInfinite(P2)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(P2);
    }

    default int m0(long j3) {
        return Math.round(Q(j3));
    }

    default float o0(int i2) {
        return i2 / c();
    }

    default float p0(long j3) {
        if (!n.a(m.b(j3), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        float[] fArr = P0.b.f5225a;
        if (s() < 1.03f) {
            return s() * m.c(j3);
        }
        P0.a a3 = P0.b.a(s());
        float c3 = m.c(j3);
        return a3 == null ? s() * c3 : a3.b(c3);
    }

    default float r0(float f3) {
        return f3 / c();
    }

    float s();
}
