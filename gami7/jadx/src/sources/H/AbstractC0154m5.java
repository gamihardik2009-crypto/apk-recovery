package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import r0.AbstractC1103Q;
import r0.AbstractC1108W;
import s.AbstractC1177p;
import s.InterfaceC1159L;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import u0.AbstractC1296l0;

/* renamed from: H.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0154m5 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2915a = 8;

    /* JADX WARN: Removed duplicated region for block: B:103:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r54, y2.c r55, V.o r56, boolean r57, boolean r58, C0.K r59, y2.e r60, y2.e r61, y2.e r62, y2.e r63, y2.e r64, y2.e r65, y2.e r66, boolean r67, I0.I r68, z.Q r69, z.P r70, boolean r71, int r72, int r73, r.l r74, c0.InterfaceC0576P r75, H.Z4 r76, J.C0285q r77, int r78, int r79, int r80, int r81) {
        /*
            Method dump skipped, instructions count: 1426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.AbstractC0154m5.a(java.lang.String, y2.c, V.o, boolean, boolean, C0.K, y2.e, y2.e, y2.e, y2.e, y2.e, y2.e, y2.e, boolean, I0.I, z.Q, z.P, boolean, int, int, r.l, c0.P, H.Z4, J.q, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    public static final void b(V.o oVar, y2.e eVar, y2.e eVar2, y2.f fVar, y2.e eVar3, y2.e eVar4, y2.e eVar5, y2.e eVar6, boolean z3, float f3, y2.e eVar7, y2.e eVar8, InterfaceC1159L interfaceC1159L, C0285q c0285q, int i2, int i3) {
        int i4;
        int i5;
        InterfaceC1159L interfaceC1159L2;
        int i6;
        boolean z4;
        ?? r4;
        InterfaceC0259d interfaceC0259d;
        boolean z5;
        boolean z6;
        float f4;
        ?? r12;
        boolean z7;
        boolean z8;
        c0285q.W(-1830307184);
        if ((i2 & 6) == 0) {
            i4 = i2 | (c0285q.g(oVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0285q.i(eVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0285q.i(fVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0285q.i(eVar3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0285q.i(eVar4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= c0285q.i(eVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= c0285q.i(eVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= c0285q.h(z3) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= c0285q.d(f3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (c0285q.i(eVar7) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0285q.i(eVar8) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            interfaceC1159L2 = interfaceC1159L;
            i5 |= c0285q.g(interfaceC1159L2) ? 256 : 128;
        } else {
            interfaceC1159L2 = interfaceC1159L;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(243139239);
            boolean z9 = ((i4 & 1879048192) == 536870912) | ((i4 & 234881024) == 67108864) | ((i5 & 896) == 256);
            Object K3 = c0285q.K();
            if (z9 || K3 == C0275l.f4150a) {
                K3 = new C0168o5(z3, f3, interfaceC1159L2);
                c0285q.e0(K3);
            }
            C0168o5 c0168o5 = (C0168o5) K3;
            c0285q.r(false);
            O0.k kVar = (O0.k) c0285q.l(AbstractC1296l0.f11093l);
            c0285q.V(-1323940314);
            int i7 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i8 = AbstractC1108W.i(oVar);
            InterfaceC0259d interfaceC0259d2 = c0285q.f4195a;
            boolean z10 = interfaceC0259d2 instanceof InterfaceC0259d;
            if (!z10) {
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
            C0257c.V(c0285q, c0168o5, c1250h);
            C1250h c1250h2 = C1252j.f10601e;
            C0257c.V(c0285q, n3, c1250h2);
            C1250h c1250h3 = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i7))) {
                B1.t.q(i7, c0285q, i7, c1250h3);
            }
            B1.t.r(0, i8, new J.C0(c0285q), c0285q, 2058660585);
            eVar7.j(c0285q, Integer.valueOf(i5 & 14));
            c0285q.V(-95271705);
            V.g gVar = V.b.f5835l;
            V.l lVar = V.l.f5857b;
            if (eVar3 != null) {
                V.o k3 = androidx.compose.ui.layout.a.c(lVar, "Leading").k(AbstractC0140k5.f2818i);
                c0285q.V(733328855);
                i6 = i5;
                s.r f5 = AbstractC1177p.f(gVar, false, c0285q, 6);
                c0285q.V(-1323940314);
                int i9 = c0285q.f4194P;
                InterfaceC0282o0 n4 = c0285q.n();
                R.a i10 = AbstractC1108W.i(k3);
                if (!z10) {
                    C0257c.I();
                    throw null;
                }
                c0285q.Y();
                if (c0285q.f4193O) {
                    c0285q.m(c1251i);
                } else {
                    c0285q.h0();
                }
                C0257c.V(c0285q, f5, c1250h);
                C0257c.V(c0285q, n4, c1250h2);
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i9))) {
                    B1.t.q(i9, c0285q, i9, c1250h3);
                }
                z4 = false;
                B1.t.r(0, i10, new J.C0(c0285q), c0285q, 2058660585);
                B1.t.s((i4 >> 12) & 14, eVar3, c0285q, false, true);
                c0285q.r(false);
                c0285q.r(false);
            } else {
                i6 = i5;
                z4 = false;
            }
            c0285q.r(z4);
            c0285q.V(-95271370);
            if (eVar4 != null) {
                V.o k4 = androidx.compose.ui.layout.a.c(lVar, "Trailing").k(AbstractC0140k5.f2818i);
                c0285q.V(733328855);
                s.r f6 = AbstractC1177p.f(gVar, false, c0285q, 6);
                c0285q.V(-1323940314);
                int i11 = c0285q.f4194P;
                InterfaceC0282o0 n5 = c0285q.n();
                R.a i12 = AbstractC1108W.i(k4);
                if (!z10) {
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
                C0257c.V(c0285q, n5, c1250h2);
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i11))) {
                    B1.t.q(i11, c0285q, i11, c1250h3);
                }
                r4 = 0;
                B1.t.r(0, i12, new J.C0(c0285q), c0285q, 2058660585);
                B1.t.s((i4 >> 15) & 14, eVar4, c0285q, false, true);
                c0285q.r(false);
                c0285q.r(false);
            } else {
                r4 = 0;
            }
            c0285q.r(r4);
            float e3 = androidx.compose.foundation.layout.a.e(interfaceC1159L, kVar);
            float d3 = androidx.compose.foundation.layout.a.d(interfaceC1159L, kVar);
            if (eVar3 != null) {
                e3 = B1.C.x(e3 - AbstractC0140k5.f2812c, (float) r4);
            }
            if (eVar4 != null) {
                d3 = B1.C.x(d3 - AbstractC0140k5.f2812c, (float) r4);
            }
            c0285q.V(-95270430);
            V.g gVar2 = V.b.f5831h;
            if (eVar5 != null) {
                V.o l3 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Prefix"), AbstractC0140k5.f2815f, 0.0f, 2)), e3, 0.0f, AbstractC0140k5.f2814e, 0.0f, 10);
                c0285q.V(733328855);
                s.r f7 = AbstractC1177p.f(gVar2, false, c0285q, 0);
                c0285q.V(-1323940314);
                int i13 = c0285q.f4194P;
                InterfaceC0282o0 n6 = c0285q.n();
                R.a i14 = AbstractC1108W.i(l3);
                interfaceC0259d = interfaceC0259d2;
                if (!(interfaceC0259d instanceof InterfaceC0259d)) {
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
                C0257c.V(c0285q, n6, c1250h2);
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i13))) {
                    B1.t.q(i13, c0285q, i13, c1250h3);
                }
                z5 = false;
                B1.t.r(0, i14, new J.C0(c0285q), c0285q, 2058660585);
                B1.t.s((i4 >> 18) & 14, eVar5, c0285q, false, true);
                c0285q.r(false);
                c0285q.r(false);
            } else {
                interfaceC0259d = interfaceC0259d2;
                z5 = false;
            }
            c0285q.r(z5);
            c0285q.V(-95270031);
            if (eVar6 != null) {
                V.o l4 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Suffix"), AbstractC0140k5.f2815f, 0.0f, 2)), AbstractC0140k5.f2814e, 0.0f, d3, 0.0f, 10);
                c0285q.V(733328855);
                s.r f8 = AbstractC1177p.f(gVar2, false, c0285q, 0);
                c0285q.V(-1323940314);
                int i15 = c0285q.f4194P;
                InterfaceC0282o0 n7 = c0285q.n();
                R.a i16 = AbstractC1108W.i(l4);
                if (!(interfaceC0259d instanceof InterfaceC0259d)) {
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
                C0257c.V(c0285q, n7, c1250h2);
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i15))) {
                    B1.t.q(i15, c0285q, i15, c1250h3);
                }
                z6 = false;
                B1.t.r(0, i16, new J.C0(c0285q), c0285q, 2058660585);
                B1.t.s((i4 >> 21) & 14, eVar6, c0285q, false, true);
                c0285q.r(false);
                c0285q.r(false);
            } else {
                z6 = false;
            }
            c0285q.r(z6);
            c0285q.V(-95269633);
            if (eVar2 != null) {
                V.o l5 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Label"), B2.a.y(AbstractC0140k5.f2815f, AbstractC0140k5.f2816g, f3), 0.0f, 2)), e3, 0.0f, d3, 0.0f, 10);
                c0285q.V(733328855);
                s.r f9 = AbstractC1177p.f(gVar2, false, c0285q, 0);
                c0285q.V(-1323940314);
                int i17 = c0285q.f4194P;
                InterfaceC0282o0 n8 = c0285q.n();
                R.a i18 = AbstractC1108W.i(l5);
                f4 = e3;
                if (!(interfaceC0259d instanceof InterfaceC0259d)) {
                    C0257c.I();
                    throw null;
                }
                c0285q.Y();
                if (c0285q.f4193O) {
                    c0285q.m(c1251i);
                } else {
                    c0285q.h0();
                }
                C0257c.V(c0285q, f9, c1250h);
                C0257c.V(c0285q, n8, c1250h2);
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i17))) {
                    B1.t.q(i17, c0285q, i17, c1250h3);
                }
                r12 = 0;
                B1.t.r(0, i18, new J.C0(c0285q), c0285q, 2058660585);
                B1.t.s((i4 >> 6) & 14, eVar2, c0285q, false, true);
                c0285q.r(false);
                c0285q.r(false);
            } else {
                f4 = e3;
                r12 = 0;
            }
            c0285q.r(r12);
            V.o p3 = androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.d(lVar, AbstractC0140k5.f2815f, 0.0f, 2));
            float f10 = eVar5 == null ? f4 : (float) r12;
            if (eVar6 != null) {
                d3 = (float) r12;
            }
            V.o l6 = androidx.compose.foundation.layout.a.l(p3, f10, 0.0f, d3, 0.0f, 10);
            c0285q.V(-95268909);
            if (fVar != null) {
                fVar.i(androidx.compose.ui.layout.a.c(lVar, "Hint").k(l6), c0285q, Integer.valueOf((i4 >> 6) & 112));
            }
            c0285q.r(false);
            V.o k5 = androidx.compose.ui.layout.a.c(lVar, "TextField").k(l6);
            c0285q.V(733328855);
            s.r f11 = AbstractC1177p.f(gVar2, true, c0285q, 48);
            c0285q.V(-1323940314);
            int i19 = c0285q.f4194P;
            InterfaceC0282o0 n9 = c0285q.n();
            R.a i20 = AbstractC1108W.i(k5);
            if (!(interfaceC0259d instanceof InterfaceC0259d)) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, f11, c1250h);
            C0257c.V(c0285q, n9, c1250h2);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i19))) {
                B1.t.q(i19, c0285q, i19, c1250h3);
            }
            B1.t.r(0, i20, new J.C0(c0285q), c0285q, 2058660585);
            B1.t.s((i4 >> 3) & 14, eVar, c0285q, false, true);
            c0285q.r(false);
            c0285q.r(false);
            c0285q.V(243142996);
            if (eVar8 != null) {
                V.o h2 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(lVar, "Supporting"), AbstractC0140k5.f2817h, 0.0f, 2)), C0084c5.f());
                c0285q.V(733328855);
                s.r f12 = AbstractC1177p.f(gVar2, false, c0285q, 0);
                c0285q.V(-1323940314);
                int i21 = c0285q.f4194P;
                InterfaceC0282o0 n10 = c0285q.n();
                R.a i22 = AbstractC1108W.i(h2);
                if (!(interfaceC0259d instanceof InterfaceC0259d)) {
                    C0257c.I();
                    throw null;
                }
                c0285q.Y();
                if (c0285q.f4193O) {
                    c0285q.m(c1251i);
                } else {
                    c0285q.h0();
                }
                C0257c.V(c0285q, f12, c1250h);
                C0257c.V(c0285q, n10, c1250h2);
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i21))) {
                    B1.t.q(i21, c0285q, i21, c1250h3);
                }
                z8 = false;
                B1.t.r(0, i22, new J.C0(c0285q), c0285q, 2058660585);
                z7 = true;
                B1.t.s((i6 >> 3) & 14, eVar8, c0285q, false, true);
                c0285q.r(false);
                c0285q.r(false);
            } else {
                z7 = true;
                z8 = false;
            }
            B1.t.u(c0285q, z8, z8, z7, z8);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0147l5(oVar, eVar, eVar2, fVar, eVar3, eVar4, eVar5, eVar6, z3, f3, eVar7, eVar8, interfaceC1159L, i2, i3);
        }
    }

    public static final int c(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f3, long j3, float f4, InterfaceC1159L interfaceC1159L) {
        boolean z3 = i3 > 0;
        float c3 = (interfaceC1159L.c() + interfaceC1159L.d()) * f4;
        if (z3) {
            c3 = B2.a.y(AbstractC0140k5.f2811b * 2 * f4, c3, f3);
        }
        int[] iArr = {i8, i6, i7, B2.a.z(f3, i3, 0)};
        for (int i10 = 0; i10 < 4; i10++) {
            i2 = Math.max(i2, iArr[i10]);
        }
        return Math.max(O0.a.i(j3), Math.max(i4, Math.max(i5, B2.a.D(c3 + B2.a.z(f3, 0, i3) + i2))) + i9);
    }

    public static final int d(boolean z3, int i2, int i3, AbstractC1103Q abstractC1103Q) {
        if (!z3) {
            return i3;
        }
        return Math.round((1 + 0.0f) * ((i2 - abstractC1103Q.f9835i) / 2.0f));
    }
}
