package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import c0.AbstractC0571K;
import c0.C0603v;
import m.AbstractC0831e;
import m.AbstractC0852z;
import m.C0848v;
import r0.AbstractC1108W;
import r0.InterfaceC1094H;
import s.AbstractC1177p;
import s.InterfaceC1169h;
import s.InterfaceC1171j;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import u0.AbstractC1296l0;

/* renamed from: H.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0224y {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3314a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f3315b;

    static {
        new C0848v(0.8f, 0.0f, 0.8f, 0.15f);
        float f3 = 4;
        f3314a = f3;
        f3315b = 16 - f3;
    }

    public static final void a(V.o oVar, y2.e eVar, C0.K k3, boolean z3, y2.e eVar2, y2.f fVar, s.Y y3, N5 n5, C0285q c0285q, int i2, int i3) {
        V.o oVar2;
        int i4;
        c0285q.W(1841601619);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            oVar2 = oVar;
        } else if ((i2 & 6) == 0) {
            oVar2 = oVar;
            i4 = (c0285q.g(oVar2) ? 4 : 2) | i2;
        } else {
            oVar2 = oVar;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= c0285q.g(k3) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= c0285q.h(z3) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= c0285q.i(eVar2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= c0285q.i(fVar) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= c0285q.g(y3) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= c0285q.g(n5) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i4 |= c0285q.g(null) ? 67108864 : 33554432;
        }
        if ((38347923 & i4) == 38347922 && c0285q.A()) {
            c0285q.P();
        } else {
            V.l lVar = V.l.f5857b;
            if (i5 != 0) {
                oVar2 = lVar;
            }
            float f3 = -((O0.b) c0285q.l(AbstractC1296l0.f11087f)).P(I.C.f3464a);
            c0285q.V(-1008351447);
            boolean d3 = c0285q.d(f3) | ((i4 & 234881024) == 67108864);
            Object K3 = c0285q.K();
            J.W w2 = C0275l.f4150a;
            if (d3 || K3 == w2) {
                K3 = new C0100f0(0, 15);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            C0257c.g((y2.a) K3, c0285q);
            n5.getClass();
            J.W0 a3 = l.M.a(AbstractC0571K.s(n5.f1797a, n5.f1798b, AbstractC0852z.f8612b.a(0.0f)), AbstractC0831e.m(400.0f, null, 5), c0285q, 48);
            R.a b3 = R.b.b(c0285q, 1520880938, new C0188s(fVar, 0));
            c0285q.V(-1008350212);
            c0285q.r(false);
            AbstractC0223x4.a(oVar2.k(lVar), null, ((C0603v) a3.getValue()).f7279a, 0L, 0.0f, 0.0f, null, R.b.b(c0285q, 376925230, new C0176q(y3, n5, eVar, k3, z3, eVar2, b3)), c0285q, 12582912, 122);
        }
        V.o oVar3 = oVar2;
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new r(oVar3, eVar, k3, z3, eVar2, fVar, y3, n5, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(y2.e r27, V.o r28, y2.e r29, y2.f r30, s.Y r31, H.N5 r32, J.C0285q r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.AbstractC0224y.b(y2.e, V.o, y2.e, y2.f, s.Y, H.N5, J.q, int, int):void");
    }

    public static final void c(V.o oVar, float f3, long j3, long j4, long j5, y2.e eVar, C0.K k3, float f4, InterfaceC1171j interfaceC1171j, InterfaceC1169h interfaceC1169h, int i2, boolean z3, y2.e eVar2, y2.e eVar3, C0285q c0285q, int i3, int i4) {
        int i5;
        int i6;
        c0285q.W(-6794037);
        if ((i3 & 6) == 0) {
            i5 = i3 | (c0285q.g(oVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0285q.d(f3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0285q.f(j3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c0285q.f(j4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0285q.f(j5) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= c0285q.i(eVar) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c0285q.g(k3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c0285q.d(f4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c0285q.g(interfaceC1171j) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c0285q.g(interfaceC1169h) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0285q.e(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0285q.h(z3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0285q.i(eVar2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0285q.i(eVar3) ? 2048 : 1024;
        }
        int i7 = i6;
        if ((i5 & 306783379) == 306783378 && (i7 & 1171) == 1170 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(1019460550);
            boolean z4 = ((i5 & 112) == 32) | ((i5 & 1879048192) == 536870912) | ((i5 & 234881024) == 67108864) | ((i7 & 14) == 4);
            Object K3 = c0285q.K();
            if (z4 || K3 == C0275l.f4150a) {
                K3 = new C0212w(f3, interfaceC1169h, interfaceC1171j, i2);
                c0285q.e0(K3);
            }
            InterfaceC1094H interfaceC1094H = (InterfaceC1094H) K3;
            c0285q.r(false);
            c0285q.V(-1323940314);
            int i8 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i9 = AbstractC1108W.i(oVar);
            boolean z5 = c0285q.f4195a instanceof InterfaceC0259d;
            if (!z5) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C1250h c1250h = C1252j.f10602f;
            C0257c.V(c0285q, interfaceC1094H, c1250h);
            C1250h c1250h2 = C1252j.f10601e;
            C0257c.V(c0285q, n3, c1250h2);
            C1250h c1250h3 = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i8))) {
                B1.t.q(i8, c0285q, i8, c1250h3);
            }
            B1.t.r(0, i9, new J.C0(c0285q), c0285q, 2058660585);
            V.l lVar = V.l.f5857b;
            V.o c3 = androidx.compose.ui.layout.a.c(lVar, "navigationIcon");
            float f5 = f3314a;
            V.o l3 = androidx.compose.foundation.layout.a.l(c3, f5, 0.0f, 0.0f, 0.0f, 14);
            c0285q.V(733328855);
            V.g gVar = V.b.f5831h;
            s.r f6 = AbstractC1177p.f(gVar, false, c0285q, 0);
            c0285q.V(-1323940314);
            int i10 = c0285q.f4194P;
            InterfaceC0282o0 n4 = c0285q.n();
            R.a i11 = AbstractC1108W.i(l3);
            if (!z5) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, f6, c1250h);
            C0257c.V(c0285q, n4, c1250h2);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i10))) {
                B1.t.q(i10, c0285q, i10, c1250h3);
            }
            B1.t.r(0, i11, new J.C0(c0285q), c0285q, 2058660585);
            J.B b3 = AbstractC0183r0.f3050a;
            C0257c.a(b3.a(new C0603v(j3)), eVar2, c0285q, 8 | ((i7 >> 3) & 112));
            B1.t.u(c0285q, false, true, false, false);
            V.o b4 = androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.a.k(androidx.compose.ui.layout.a.c(lVar, "title"), f5, 0.0f, 2).k(z3 ? A0.m.a(lVar, C0200u.f3145j) : lVar), 0.0f, 0.0f, f4, 0.0f, 0.0f, null, false, 131067);
            c0285q.V(733328855);
            s.r f7 = AbstractC1177p.f(gVar, false, c0285q, 0);
            c0285q.V(-1323940314);
            int i12 = c0285q.f4194P;
            InterfaceC0282o0 n5 = c0285q.n();
            R.a i13 = AbstractC1108W.i(b4);
            if (!z5) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, f7, c1250h);
            C0257c.V(c0285q, n5, c1250h2);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i12))) {
                B1.t.q(i12, c0285q, i12, c1250h3);
            }
            B1.t.r(0, i13, new J.C0(c0285q), c0285q, 2058660585);
            int i14 = i5 >> 9;
            D1.h(j4, k3, eVar, c0285q, (i14 & 14) | ((i5 >> 15) & 112) | (i14 & 896));
            B1.t.u(c0285q, false, true, false, false);
            V.o l4 = androidx.compose.foundation.layout.a.l(androidx.compose.ui.layout.a.c(lVar, "actionIcons"), 0.0f, 0.0f, f5, 0.0f, 11);
            c0285q.V(733328855);
            s.r f8 = AbstractC1177p.f(gVar, false, c0285q, 0);
            c0285q.V(-1323940314);
            int i15 = c0285q.f4194P;
            InterfaceC0282o0 n6 = c0285q.n();
            R.a i16 = AbstractC1108W.i(l4);
            if (!z5) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, f8, c1250h);
            C0257c.V(c0285q, n6, c1250h2);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i15))) {
                B1.t.q(i15, c0285q, i15, c1250h3);
            }
            i16.i(new J.C0(c0285q), c0285q, 0);
            c0285q.V(2058660585);
            C0257c.a(b3.a(new C0603v(j5)), eVar3, c0285q, 8 | ((i7 >> 6) & 112));
            B1.t.u(c0285q, false, true, false, false);
            c0285q.r(false);
            c0285q.r(true);
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0218x(oVar, f3, j3, j4, j5, eVar, k3, f4, interfaceC1171j, interfaceC1169h, i2, z3, eVar2, eVar3, i3, i4);
        }
    }
}
