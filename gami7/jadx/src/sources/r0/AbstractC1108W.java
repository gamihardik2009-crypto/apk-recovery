package r0;

import D.e0;
import H.S3;
import J.C0257c;
import J.C0275l;
import J.C0279n;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import n1.C0944e;
import n2.AbstractC0946A;
import t0.C1236E;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.C1261t;
import t0.InterfaceC1253k;

/* renamed from: r0.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1108W {

    /* renamed from: a, reason: collision with root package name */
    public static final C1098L f9847a = new C1098L(3);

    public static final long a(float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i2 = AbstractC1107V.f9846b;
        return floatToRawIntBits;
    }

    public static final void b(V.o oVar, y2.e eVar, C0285q c0285q, int i2, int i3) {
        int i4;
        V.o oVar2;
        c0285q.W(-1298353104);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0285q.A()) {
            c0285q.P();
            oVar2 = oVar;
        } else {
            V.o oVar3 = i5 != 0 ? V.l.f5857b : oVar;
            Object K3 = c0285q.K();
            if (K3 == C0275l.f4150a) {
                K3 = new C1111Z(C1098L.f9827i);
                c0285q.e0(K3);
            }
            int i6 = i4 << 3;
            c((C1111Z) K3, oVar3, eVar, c0285q, (i6 & 112) | (i6 & 896), 0);
            oVar2 = oVar3;
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new D.Q(oVar2, eVar, i2, i3, 2);
        }
    }

    public static final void c(C1111Z c1111z, V.o oVar, y2.e eVar, C0285q c0285q, int i2, int i3) {
        int i4;
        c0285q.W(-511989831);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (c0285q.i(c1111z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= c0285q.g(oVar) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= c0285q.i(eVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            if (i5 != 0) {
                oVar = V.l.f5857b;
            }
            int i6 = c0285q.f4194P;
            C0279n Q3 = C0257c.Q(c0285q);
            V.o d3 = V.a.d(c0285q, oVar);
            InterfaceC0282o0 n3 = c0285q.n();
            C1251i c1251i = C1251i.f10595l;
            if (!(c0285q.f4195a instanceof InterfaceC0259d)) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, c1111z, c1111z.f9852c);
            C0257c.V(c0285q, Q3, c1111z.f9853d);
            C0257c.V(c0285q, eVar, c1111z.f9854e);
            InterfaceC1253k.f10606f.getClass();
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C0257c.V(c0285q, d3, C1252j.f10600d);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i6))) {
                B1.t.q(i6, c0285q, i6, c1250h);
            }
            c0285q.r(true);
            if (c0285q.A()) {
                c0285q.U(-26502501);
                c0285q.r(false);
            } else {
                c0285q.U(-26580342);
                boolean i7 = c0285q.i(c1111z);
                Object K3 = c0285q.K();
                if (i7 || K3 == C0275l.f4150a) {
                    K3 = new C0944e(4, c1111z);
                    c0285q.e0(K3);
                }
                C0257c.g((y2.a) K3, c0285q);
                c0285q.r(false);
            }
        }
        V.o oVar2 = oVar;
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new S3(c1111z, oVar2, eVar, i2, i3, 5);
        }
    }

    public static final b0.d d(C1261t c1261t) {
        InterfaceC1129r t3 = c1261t.t();
        if (t3 != null) {
            return ((t0.Z) t3).D(c1261t, true);
        }
        long j3 = c1261t.f9836j;
        return new b0.d(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    public static final b0.d e(InterfaceC1129r interfaceC1129r) {
        InterfaceC1129r g3 = g(interfaceC1129r);
        float H3 = (int) (g3.H() >> 32);
        float H4 = (int) (g3.H() & 4294967295L);
        b0.d D3 = g(interfaceC1129r).D(interfaceC1129r, true);
        float f3 = D3.f7060a;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > H3) {
            f3 = H3;
        }
        float f4 = D3.f7061b;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > H4) {
            f4 = H4;
        }
        float f5 = D3.f7062c;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 <= H3) {
            H3 = f5;
        }
        float f6 = D3.f7063d;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        if (f7 <= H4) {
            H4 = f7;
        }
        if (f3 == H3 || f4 == H4) {
            return b0.d.f7059e;
        }
        long k3 = g3.k(K1.f.e(f3, f4));
        long k4 = g3.k(K1.f.e(H3, f4));
        long k5 = g3.k(K1.f.e(H3, H4));
        long k6 = g3.k(K1.f.e(f3, H4));
        float d3 = b0.c.d(k3);
        float d4 = b0.c.d(k4);
        float d5 = b0.c.d(k6);
        float d6 = b0.c.d(k5);
        float min = Math.min(d3, Math.min(d4, Math.min(d5, d6)));
        float max = Math.max(d3, Math.max(d4, Math.max(d5, d6)));
        float e3 = b0.c.e(k3);
        float e4 = b0.c.e(k4);
        float e5 = b0.c.e(k6);
        float e6 = b0.c.e(k5);
        return new b0.d(min, Math.min(e3, Math.min(e4, Math.min(e5, e6))), max, Math.max(e3, Math.max(e4, Math.max(e5, e6))));
    }

    public static final boolean f(int i2, int i3) {
        return i2 == i3;
    }

    public static final InterfaceC1129r g(InterfaceC1129r interfaceC1129r) {
        InterfaceC1129r interfaceC1129r2;
        InterfaceC1129r t3 = interfaceC1129r.t();
        while (true) {
            InterfaceC1129r interfaceC1129r3 = t3;
            interfaceC1129r2 = interfaceC1129r;
            interfaceC1129r = interfaceC1129r3;
            if (interfaceC1129r == null) {
                break;
            }
            t3 = interfaceC1129r.t();
        }
        t0.Z z3 = interfaceC1129r2 instanceof t0.Z ? (t0.Z) interfaceC1129r2 : null;
        if (z3 == null) {
            return interfaceC1129r2;
        }
        t0.Z z4 = z3.f10549v;
        while (true) {
            t0.Z z5 = z4;
            t0.Z z6 = z3;
            z3 = z5;
            if (z3 == null) {
                return z6;
            }
            z4 = z3.f10549v;
        }
    }

    public static final t0.O h(t0.O o3) {
        C1236E c1236e = o3.f10490s.f10546s;
        while (true) {
            C1236E s3 = c1236e.s();
            C1236E c1236e2 = null;
            if ((s3 != null ? s3.f10389j : null) == null) {
                t0.O R02 = ((t0.Z) c1236e.f10378C.f4242d).R0();
                z2.h.c(R02);
                return R02;
            }
            C1236E s4 = c1236e.s();
            if (s4 != null) {
                c1236e2 = s4.f10389j;
            }
            z2.h.c(c1236e2);
            C1236E s5 = c1236e.s();
            z2.h.c(s5);
            c1236e = s5.f10389j;
            z2.h.c(c1236e);
        }
    }

    public static final R.a i(V.o oVar) {
        return new R.a(-1586257396, new e0(6, oVar), true);
    }

    public static final long j(long j3, long j4) {
        float d3 = b0.f.d(j3);
        long j5 = AbstractC1107V.f9845a;
        if (j4 == j5) {
            AbstractC0946A.r("ScaleFactor is unspecified");
            throw null;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * d3;
        float b3 = b0.f.b(j3);
        if (j4 != j5) {
            return B1.C.i(intBitsToFloat, Float.intBitsToFloat((int) (j4 & 4294967295L)) * b3);
        }
        AbstractC0946A.r("ScaleFactor is unspecified");
        throw null;
    }
}
