package z;

import D.InterfaceC0045n;
import H.C0133j5;
import H.Y1;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import n0.C0919B;
import s.AbstractC1166e;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1412c {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11626a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f11627b;

    static {
        float f3 = 25;
        f11626a = f3;
        f11627b = (f3 * 2.0f) / 2.4142137f;
    }

    public static final void a(InterfaceC0045n interfaceC0045n, V.o oVar, long j3, C0285q c0285q, int i2, int i3) {
        int i4;
        long j4;
        int i5;
        c0285q.W(1776202187);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c0285q.g(interfaceC0045n) : c0285q.i(interfaceC0045n) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= c0285q.g(oVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j3;
                if (c0285q.f(j3)) {
                    i5 = 256;
                    i4 |= i5;
                }
            } else {
                j4 = j3;
            }
            i5 = 128;
            i4 |= i5;
        } else {
            j4 = j3;
        }
        if ((i4 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.R();
            if ((i2 & 1) != 0 && !c0285q.z()) {
                c0285q.P();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            } else if ((i3 & 4) != 0) {
                i4 &= -897;
                j4 = 9205357640488583168L;
            }
            c0285q.s();
            int i6 = i4 & 14;
            boolean z3 = i6 == 4 || ((i4 & 8) != 0 && c0285q.i(interfaceC0045n));
            Object K3 = c0285q.K();
            if (z3 || K3 == C0275l.f4150a) {
                K3 = new C0919B(20, interfaceC0045n);
                c0285q.e0(K3);
            }
            K1.f.c(interfaceC0045n, V.b.f5832i, R.b.c(-1653527038, new Y1(4, j4, A0.m.b(oVar, false, (y2.c) K3)), c0285q), c0285q, i6 | 432);
        }
        long j5 = j4;
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0133j5(interfaceC0045n, oVar, j5, i2, i3);
        }
    }

    public static final void b(V.o oVar, C0285q c0285q, int i2, int i3) {
        int i4;
        c0285q.W(694251107);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            if (i5 != 0) {
                oVar = V.l.f5857b;
            }
            AbstractC1166e.a(c0285q, V.a.b(androidx.compose.foundation.layout.c.k(oVar, f11627b, f11626a), C1411b.f11619j));
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C1410a(oVar, i2, i3);
        }
    }
}
