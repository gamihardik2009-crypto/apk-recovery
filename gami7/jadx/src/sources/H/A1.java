package H;

import I.AbstractC0239d;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import androidx.compose.foundation.layout.FillElement;
import c0.C0603v;
import c0.InterfaceC0576P;
import com.example.bulksmsscheduler.R;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import m.AbstractC0831e;
import m2.C0865g;
import n.C0911t;
import r0.AbstractC1108W;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.AbstractC1179s;
import s.C1160M;
import s.C1168g;
import s.C1180t;
import s.InterfaceC1169h;
import t.C1228w;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import u0.AbstractC1296l0;

/* loaded from: classes.dex */
public abstract class A1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1287a = 48;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1288b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1289c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1160M f1290d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1160M f1291e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1160M f1292f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f1293g;

    static {
        float f3 = 12;
        f1289c = f3;
        f1290d = androidx.compose.foundation.layout.a.c(0.0f, 0.0f, f3, f3, 3);
        float f4 = 24;
        float f5 = 16;
        f1291e = androidx.compose.foundation.layout.a.c(f4, f5, f3, 0.0f, 8);
        f1292f = androidx.compose.foundation.layout.a.c(f4, 0.0f, f3, f3, 2);
        f1293g = f5;
    }

    public static final void a(V.o oVar, y2.e eVar, y2.e eVar2, y2.e eVar3, B0 b02, C0.K k3, float f3, y2.e eVar4, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(1507356255);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(eVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0285q.i(eVar3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c0285q.g(b02) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c0285q.g(k3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= c0285q.d(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= c0285q.i(eVar4) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if ((i4 & 4793491) == 4793490 && c0285q.A()) {
            c0285q.P();
        } else {
            V.o b3 = A0.m.b(androidx.compose.foundation.layout.c.m(oVar, AbstractC0239d.f3639c, 0.0f, 14), false, C0200u.f3149n);
            c0285q.V(-483455358);
            C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q, 0);
            c0285q.V(-1323940314);
            int i5 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i6 = AbstractC1108W.i(b3);
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
            C0257c.V(c0285q, a3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i5))) {
                B1.t.q(i5, c0285q, i5, c1250h);
            }
            B1.t.r(0, i6, new J.C0(c0285q), c0285q, 2058660585);
            c(V.l.f5857b, eVar, b02.f1316b, b02.f1317c, f3, R.b.b(c0285q, -229007058, new K0(eVar2, eVar3, eVar, b02, k3, 0)), c0285q, (i4 & 112) | 196614 | (57344 & (i4 >> 6)));
            B1.t.s((i4 >> 21) & 14, eVar4, c0285q, false, true);
            c0285q.r(false);
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new L0(oVar, eVar, eVar2, eVar3, b02, k3, f3, eVar4, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(H.B1 r22, V.o r23, H.J0 r24, y2.e r25, y2.e r26, boolean r27, H.B0 r28, J.C0285q r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.A1.b(H.B1, V.o, H.J0, y2.e, y2.e, boolean, H.B0, J.q, int, int):void");
    }

    public static final void c(V.o oVar, y2.e eVar, long j3, long j4, float f3, y2.e eVar2, C0285q c0285q, int i2) {
        int i3;
        boolean z3;
        c0285q.W(-996037719);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.f(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0285q.f(j4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c0285q.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c0285q.i(eVar2) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && c0285q.A()) {
            c0285q.P();
        } else {
            V.o oVar2 = V.l.f5857b;
            if (eVar != null) {
                oVar2 = androidx.compose.foundation.layout.c.a(oVar2, Float.NaN, f3);
            }
            V.o k3 = oVar.k(androidx.compose.foundation.layout.c.f6639a).k(oVar2);
            C1168g c1168g = AbstractC1173l.f10155g;
            c0285q.V(-483455358);
            C1180t a3 = AbstractC1179s.a(c1168g, V.b.f5842t, c0285q, 6);
            c0285q.V(-1323940314);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i5 = AbstractC1108W.i(k3);
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
            C0257c.V(c0285q, a3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q, i4, c1250h);
            }
            B1.t.r(0, i5, new J.C0(c0285q), c0285q, 2058660585);
            c0285q.V(1127544336);
            if (eVar != null) {
                z3 = false;
                D1.h(j3, P5.a((O5) c0285q.l(P5.f1917a), AbstractC0239d.f3646j), R.b.b(c0285q, 1936268514, new C0078c(eVar, 3)), c0285q, ((i3 >> 6) & 14) | 384);
            } else {
                z3 = false;
            }
            c0285q.r(z3);
            C0257c.a(AbstractC0183r0.f3050a.a(new C0603v(j4)), eVar2, c0285q, ((i3 >> 12) & 112) | 8);
            B1.t.u(c0285q, z3, true, z3, z3);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new W0(oVar, eVar, j3, j4, f3, eVar2, i2);
        }
    }

    public static final void d(V.o oVar, boolean z3, y2.a aVar, boolean z4, boolean z5, boolean z6, boolean z7, String str, B0 b02, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        boolean z8;
        J.W0 R3;
        int i4;
        long j3;
        boolean z9;
        C0911t c0911t;
        J.W0 a3;
        long j4;
        C0911t c0911t2;
        c0285q.W(-1434777861);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.h(z3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0285q.h(z4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c0285q.h(z5) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c0285q.h(z6) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= c0285q.h(z7) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= c0285q.g(str) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= c0285q.g(b02) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= c0285q.i(eVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i3) == 306783378 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(1664739143);
            boolean z10 = (29360128 & i3) == 8388608;
            Object K3 = c0285q.K();
            if (z10 || K3 == C0275l.f4150a) {
                K3 = new A0.o(str, 4);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            V.o b3 = A0.m.b(oVar, true, (y2.c) K3);
            InterfaceC0576P a4 = AbstractC0204u3.a(AbstractC0239d.f3652p, c0285q);
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            b02.getClass();
            c0285q.V(-1240482658);
            long j5 = z3 ? z5 ? b02.f1331r : b02.f1332s : C0603v.f7276f;
            if (z4) {
                c0285q.V(1577421952);
                z8 = false;
                R3 = l.M.a(j5, AbstractC0831e.n(100, 0, null, 6), c0285q, 0);
                c0285q.r(false);
            } else {
                z8 = false;
                c0285q.V(1577422116);
                R3 = C0257c.R(new C0603v(j5), c0285q);
                c0285q.r(false);
            }
            c0285q.r(z8);
            long j6 = ((C0603v) R3.getValue()).f7279a;
            int i7 = i5 & 7168;
            c0285q.V(-1233694918);
            if (z3 && z5) {
                i4 = i5;
                j3 = b02.f1330p;
            } else {
                i4 = i5;
                if (z3 && !z5) {
                    j3 = b02.q;
                } else if (z7 && z5) {
                    j3 = b02.f1336w;
                } else {
                    j3 = b02.f1329o;
                    if (!z7 || z5) {
                        if (z6) {
                            j3 = b02.f1333t;
                        } else if (z5) {
                            j3 = b02.f1328n;
                        }
                    }
                }
            }
            if (z7) {
                c0285q.V(379022200);
                a3 = C0257c.R(new C0603v(j3), c0285q);
                z9 = false;
                c0285q.r(false);
                c0911t = null;
            } else {
                z9 = false;
                c0285q.V(379022258);
                c0911t = null;
                a3 = l.M.a(j3, AbstractC0831e.n(100, 0, null, 6), c0285q, 0);
                c0285q.r(false);
            }
            c0285q.r(z9);
            long j7 = ((C0603v) a3.getValue()).f7279a;
            if (!z6 || z3) {
                j4 = j7;
                c0911t2 = c0911t;
            } else {
                j4 = j7;
                c0911t2 = l0.c.b(AbstractC0239d.f3643g, b02.f1334u);
            }
            AbstractC0223x4.b(z3, aVar, b3, z5, a4, j6, j4, 0.0f, 0.0f, c0911t2, null, R.b.b(c0285q, -2031780827, new C0078c(eVar, 4)), c0285q, (i4 & 112) | i6 | i7, 1408);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new X0(oVar, z3, aVar, z4, z5, z6, z7, str, b02, eVar, i2);
        }
    }

    public static final void e(V.o oVar, int i2, y2.c cVar, C0285q c0285q, int i3) {
        int i4;
        boolean z3;
        c0285q.W(1393846115);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.g(oVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.i(cVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            boolean a3 = E1.a(i2, 0);
            J.W w2 = C0275l.f4150a;
            if (a3) {
                c0285q.V(-1814955688);
                c0285q.V(-1814955657);
                z3 = (i4 & 896) == 256;
                Object K3 = c0285q.K();
                if (z3 || K3 == w2) {
                    K3 = new Y0(0, cVar);
                    c0285q.e0(K3);
                }
                c0285q.r(false);
                D1.e((y2.a) K3, oVar, false, null, null, AbstractC0135k0.f2795a, c0285q, ((i4 << 3) & 112) | 196608, 28);
                c0285q.r(false);
            } else {
                c0285q.V(-1814955404);
                c0285q.V(-1814955373);
                z3 = (i4 & 896) == 256;
                Object K4 = c0285q.K();
                if (z3 || K4 == w2) {
                    K4 = new Y0(1, cVar);
                    c0285q.e0(K4);
                }
                c0285q.r(false);
                D1.e((y2.a) K4, oVar, false, null, null, AbstractC0135k0.f2796b, c0285q, ((i4 << 3) & 112) | 196608, 28);
                c0285q.r(false);
            }
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new Z0(oVar, i2, cVar, i3, 0);
        }
    }

    public static final void f(C1228w c1228w, Long l3, y2.c cVar, y2.c cVar2, I i2, E2.d dVar, J0 j02, InterfaceC0180q3 interfaceC0180q3, B0 b02, C0285q c0285q, int i3) {
        int i4;
        c0285q.W(-1994757941);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.g(c1228w) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.g(l3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.i(cVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0285q.i(cVar2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0285q.i(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0285q.i(dVar) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= (2097152 & i3) == 0 ? c0285q.g(j02) : c0285q.i(j02) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= c0285q.g(interfaceC0180q3) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= c0285q.g(b02) ? 67108864 : 33554432;
        }
        int i5 = i4;
        if ((38347923 & i5) == 38347922 && c0285q.A()) {
            c0285q.P();
        } else {
            H b3 = i2.b();
            c0285q.V(1346192500);
            boolean g3 = c0285q.g(dVar);
            Object K3 = c0285q.K();
            J.W w2 = C0275l.f4150a;
            if (g3 || K3 == w2) {
                K3 = ((J) i2).d(LocalDate.of(dVar.f1076h, 1, 1));
                c0285q.e0(K3);
            }
            c0285q.r(false);
            t5.a(P5.a((O5) c0285q.l(P5.f1917a), AbstractC0239d.f3640d), R.b.b(c0285q, 1504086906, new C0080c1(c1228w, dVar, i2, (K) K3, cVar, b3, l3, j02, interfaceC0180q3, b02)), c0285q, 48);
            c0285q.V(1346194369);
            boolean i6 = ((i5 & 14) == 4) | ((i5 & 7168) == 2048) | c0285q.i(i2) | c0285q.i(dVar);
            Object K4 = c0285q.K();
            if (i6 || K4 == w2) {
                C0087d1 c0087d1 = new C0087d1(c1228w, cVar2, i2, dVar, null);
                c0285q.e0(c0087d1);
                K4 = c0087d1;
            }
            c0285q.r(false);
            C0257c.e(c0285q, c1228w, (y2.e) K4);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0094e1(c1228w, l3, cVar, cVar2, i2, dVar, j02, interfaceC0180q3, b02, i3);
        }
    }

    public static final void g(K k3, y2.c cVar, long j3, Long l3, Long l4, J0 j02, InterfaceC0180q3 interfaceC0180q3, B0 b02, C0285q c0285q, int i2) {
        int i3;
        Locale locale;
        int i4;
        int i5;
        char c3;
        float f3;
        boolean z3;
        V.l lVar;
        String str;
        K k4 = k3;
        Object obj = cVar;
        long j4 = j3;
        Object obj2 = l3;
        Object obj3 = l4;
        c0285q.W(-1912870997);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(k4) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.f(j4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0285q.g(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c0285q.g(obj3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c0285q.g(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (2097152 & i2) == 0 ? c0285q.g(j02) : c0285q.i(j02) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= c0285q.g(interfaceC0180q3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= c0285q.g(b02) ? 67108864 : 33554432;
        }
        int i6 = i3;
        if ((i6 & 38347923) == 38347922 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(-2019459922);
            V.l lVar2 = V.l.f5857b;
            c0285q.r(false);
            Locale p3 = D1.p(c0285q);
            float f4 = f1287a;
            V.o k5 = androidx.compose.foundation.layout.c.e(lVar2, 6 * f4).k(lVar2);
            C1168g c1168g = AbstractC1173l.f10154f;
            c0285q.V(-483455358);
            C1180t a3 = AbstractC1179s.a(c1168g, V.b.f5842t, c0285q, 6);
            c0285q.V(-1323940314);
            int i7 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            float f5 = f4;
            C1251i c1251i = C1252j.f10598b;
            R.a i8 = AbstractC1108W.i(k5);
            V.l lVar3 = lVar2;
            boolean z4 = c0285q.f4195a instanceof InterfaceC0259d;
            if (!z4) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q.f4193O) {
                c0285q.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q, a3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i7))) {
                B1.t.q(i7, c0285q, i7, c1250h);
            }
            B1.t.r(0, i8, new J.C0(c0285q), c0285q, 2058660585);
            c0285q.V(-2019459388);
            int i9 = 0;
            int i10 = 0;
            while (i9 < 6) {
                FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
                C1168g c1168g2 = AbstractC1173l.f10154f;
                V.f fVar = V.b.f5840r;
                c0285q.V(693286680);
                s.S a4 = s.Q.a(c1168g2, fVar, c0285q, 54);
                c0285q.V(-1323940314);
                int i11 = c0285q.f4194P;
                InterfaceC0282o0 n4 = c0285q.n();
                InterfaceC1253k.f10606f.getClass();
                int i12 = i10;
                C1251i c1251i2 = C1252j.f10598b;
                R.a i13 = AbstractC1108W.i(fillElement);
                if (!z4) {
                    C0257c.I();
                    throw null;
                }
                c0285q.Y();
                boolean z5 = z4;
                if (c0285q.f4193O) {
                    c0285q.m(c1251i2);
                } else {
                    c0285q.h0();
                }
                C0257c.V(c0285q, a4, C1252j.f10602f);
                C0257c.V(c0285q, n4, C1252j.f10601e);
                C1250h c1250h2 = C1252j.f10603g;
                if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i11))) {
                    B1.t.q(i11, c0285q, i11, c1250h2);
                }
                char c4 = 43753;
                B1.t.r(0, i13, new J.C0(c0285q), c0285q, 2058660585);
                c0285q.V(-713628297);
                int i14 = i12;
                int i15 = 0;
                while (i15 < 7) {
                    int i16 = k4.f1656d;
                    if (i14 < i16 || i14 >= i16 + k4.f1655c) {
                        locale = p3;
                        i4 = i14;
                        i5 = i15;
                        c3 = c4;
                        f3 = f5;
                        V.l lVar4 = lVar3;
                        z3 = z5;
                        c0285q.V(-1111235936);
                        lVar = lVar4;
                        AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.g(lVar, f3, f3));
                        c0285q.r(false);
                    } else {
                        c0285q.V(-1111235573);
                        int i17 = i14 - k4.f1656d;
                        i4 = i14;
                        i5 = i15;
                        long j5 = (i17 * 86400000) + k4.f1657e;
                        boolean z6 = j5 == j4;
                        boolean z7 = obj2 != null && j5 == l3.longValue();
                        boolean z8 = obj3 != null && j5 == l4.longValue();
                        c0285q.V(-1111235085);
                        c0285q.r(false);
                        c0285q.V(502032503);
                        StringBuilder sb = new StringBuilder();
                        c0285q.V(-852185051);
                        c0285q.r(false);
                        if (z6) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(D1.w(R.string.m3c_date_picker_today_description, c0285q));
                        }
                        String sb2 = sb.length() == 0 ? null : sb.toString();
                        c0285q.r(false);
                        String a5 = j02.a(Long.valueOf(j5), p3, true);
                        if (a5 == null) {
                            a5 = "";
                        }
                        boolean z9 = z7 || z8;
                        c0285q.V(-1111233694);
                        boolean f6 = ((i6 & 112) == 32) | c0285q.f(j5);
                        Object K3 = c0285q.K();
                        J.W w2 = C0275l.f4150a;
                        if (f6 || K3 == w2) {
                            K3 = new C0101f1(0, j5, obj);
                            c0285q.e0(K3);
                        }
                        y2.a aVar = (y2.a) K3;
                        c0285q.r(false);
                        c0285q.V(-1111233319);
                        boolean f7 = c0285q.f(j5);
                        Object K4 = c0285q.K();
                        if (f7 || K4 == w2) {
                            interfaceC0180q3.getClass();
                            K4 = Boolean.valueOf(interfaceC0180q3.a(j5));
                            c0285q.e0(K4);
                        }
                        boolean booleanValue = ((Boolean) K4).booleanValue();
                        c0285q.r(false);
                        if (sb2 != null) {
                            str = sb2 + ", " + a5;
                        } else {
                            str = a5;
                        }
                        locale = p3;
                        V.l lVar5 = lVar3;
                        z3 = z5;
                        f3 = f5;
                        c3 = 43753;
                        d(lVar3, z9, aVar, z7, booleanValue, z6, false, str, b02, R.b.b(c0285q, -2095706591, new C0108g1(i17, 0)), c0285q, (i6 & 234881024) | 805306374);
                        c0285q.r(false);
                        lVar = lVar5;
                    }
                    i14 = i4 + 1;
                    i15 = i5 + 1;
                    obj2 = l3;
                    obj3 = l4;
                    f5 = f3;
                    p3 = locale;
                    z5 = z3;
                    c4 = c3;
                    obj = cVar;
                    j4 = j3;
                    lVar3 = lVar;
                    k4 = k3;
                }
                B1.t.u(c0285q, false, false, true, false);
                c0285q.r(false);
                i9++;
                obj2 = l3;
                obj3 = l4;
                f5 = f5;
                p3 = p3;
                z4 = z5;
                i10 = i14;
                obj = cVar;
                j4 = j3;
                lVar3 = lVar3;
                k4 = k3;
            }
            B1.t.u(c0285q, false, false, true, false);
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0115h1(k3, cVar, j3, l3, l4, j02, interfaceC0180q3, b02, i2);
        }
    }

    public static final void h(V.o oVar, boolean z3, boolean z4, boolean z5, String str, y2.a aVar, y2.a aVar2, y2.a aVar3, B0 b02, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-773929258);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.h(z3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.h(z4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0285q.h(z5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c0285q.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c0285q.i(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= c0285q.i(aVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= c0285q.i(aVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= c0285q.g(b02) ? 67108864 : 33554432;
        }
        if ((i3 & 38347923) == 38347922 && c0285q.A()) {
            c0285q.P();
        } else {
            V.o e3 = androidx.compose.foundation.layout.c.e(oVar.k(androidx.compose.foundation.layout.c.f6639a), f1288b);
            InterfaceC1169h interfaceC1169h = z5 ? AbstractC1173l.f10149a : AbstractC1173l.f10155g;
            V.f fVar = V.b.f5840r;
            c0285q.V(693286680);
            s.S a3 = s.Q.a(interfaceC1169h, fVar, c0285q, 48);
            c0285q.V(-1323940314);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i5 = AbstractC1108W.i(e3);
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
            C0257c.V(c0285q, a3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q, i4, c1250h);
            }
            B1.t.r(0, i5, new J.C0(c0285q), c0285q, 2058660585);
            C0257c.a(AbstractC0183r0.f3050a.a(new C0603v(b02.f1320f)), R.b.b(c0285q, -962805198, new C0122i1(aVar3, z5, str, aVar2, z4, aVar, z3)), c0285q, 56);
            B1.t.u(c0285q, false, true, false, false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0129j1(oVar, z3, z4, z5, str, aVar, aVar2, aVar3, b02, i2);
        }
    }

    public static final void i(B0 b02, I i2, C0285q c0285q, int i3) {
        C0285q c0285q2 = c0285q;
        c0285q2.W(-1849465391);
        int i4 = (i3 & 6) == 0 ? (c0285q2.g(b02) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i4 |= c0285q2.i(i2) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            J j3 = (J) i2;
            int i5 = j3.f1612b;
            ArrayList arrayList = j3.f1613c;
            ArrayList arrayList2 = new ArrayList();
            int i6 = i5 - 1;
            int size = arrayList.size();
            for (int i7 = i6; i7 < size; i7++) {
                arrayList2.add(arrayList.get(i7));
            }
            boolean z3 = false;
            for (int i8 = 0; i8 < i6; i8++) {
                arrayList2.add(arrayList.get(i8));
            }
            C0.K a3 = P5.a((O5) c0285q2.l(P5.f1917a), AbstractC0239d.f3647k);
            V.l lVar = V.l.f5857b;
            float f3 = f1287a;
            V.o k3 = androidx.compose.foundation.layout.c.a(lVar, Float.NaN, f3).k(androidx.compose.foundation.layout.c.f6639a);
            C1168g c1168g = AbstractC1173l.f10154f;
            V.f fVar = V.b.f5840r;
            c0285q2.V(693286680);
            s.S a4 = s.Q.a(c1168g, fVar, c0285q2, 54);
            int i9 = -1323940314;
            c0285q2.V(-1323940314);
            int i10 = c0285q2.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i11 = AbstractC1108W.i(k3);
            boolean z4 = c0285q2.f4195a instanceof InterfaceC0259d;
            if (!z4) {
                C0257c.I();
                throw null;
            }
            c0285q.Y();
            if (c0285q2.f4193O) {
                c0285q2.m(c1251i);
            } else {
                c0285q.h0();
            }
            C0257c.V(c0285q2, a4, C1252j.f10602f);
            C0257c.V(c0285q2, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q2.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i10))) {
                B1.t.q(i10, c0285q2, i10, c1250h);
            }
            B1.t.r(0, i11, new J.C0(c0285q2), c0285q2, 2058660585);
            c0285q2.V(-971954356);
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                C0865g c0865g = (C0865g) arrayList2.get(i12);
                c0285q2.V(784223355);
                boolean g3 = c0285q2.g(c0865g);
                Object K3 = c0285q.K();
                if (g3 || K3 == C0275l.f4150a) {
                    K3 = new A0.n(3, c0865g);
                    c0285q2.e0(K3);
                }
                c0285q2.r(z3);
                V.o k4 = androidx.compose.foundation.layout.c.k(A0.m.a(lVar, (y2.c) K3), f3, f3);
                V.g gVar = V.b.f5835l;
                c0285q2.V(733328855);
                s.r f4 = AbstractC1177p.f(gVar, z3, c0285q2, 6);
                c0285q2.V(i9);
                int i13 = c0285q2.f4194P;
                InterfaceC0282o0 n4 = c0285q.n();
                InterfaceC1253k.f10606f.getClass();
                C1251i c1251i2 = C1252j.f10598b;
                R.a i14 = AbstractC1108W.i(k4);
                if (!z4) {
                    C0257c.I();
                    throw null;
                }
                c0285q.Y();
                int i15 = size2;
                if (c0285q2.f4193O) {
                    c0285q2.m(c1251i2);
                } else {
                    c0285q.h0();
                }
                C0257c.V(c0285q2, f4, C1252j.f10602f);
                C0257c.V(c0285q2, n4, C1252j.f10601e);
                C1250h c1250h2 = C1252j.f10603g;
                if (c0285q2.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i13))) {
                    B1.t.q(i13, c0285q2, i13, c1250h2);
                }
                B1.t.r(0, i14, new J.C0(c0285q2), c0285q2, 2058660585);
                t5.b((String) c0865g.f8647i, androidx.compose.foundation.layout.c.q(lVar, null, 3), b02.f1318d, 0L, null, null, null, 0L, null, new N0.i(3), 0L, 0, false, 0, 0, null, a3, c0285q, 48, 0, 65016);
                c0285q.r(false);
                c0285q.r(true);
                c0285q.r(false);
                c0285q.r(false);
                i12++;
                c0285q2 = c0285q;
                z3 = false;
                z4 = z4;
                f3 = f3;
                i9 = -1323940314;
                size2 = i15;
                lVar = lVar;
                arrayList2 = arrayList2;
            }
            boolean z5 = z3;
            C0285q c0285q3 = c0285q2;
            B1.t.u(c0285q3, z5, z5, true, z5);
            c0285q3.r(z5);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i3, 0, b02, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bd, code lost:
    
        if (z2.h.a(r50.K(), java.lang.Integer.valueOf(r5)) == false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(java.lang.Long r40, long r41, y2.c r43, y2.c r44, H.I r45, E2.d r46, H.J0 r47, H.InterfaceC0180q3 r48, H.B0 r49, J.C0285q r50, int r51) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.A1.j(java.lang.Long, long, y2.c, y2.c, H.I, E2.d, H.J0, H.q3, H.B0, J.q, int):void");
    }

    public static final void k(Long l3, long j3, int i2, y2.c cVar, y2.c cVar2, I i3, E2.d dVar, J0 j02, InterfaceC0180q3 interfaceC0180q3, B0 b02, C0285q c0285q, int i4) {
        int i5;
        c0285q.W(-895379221);
        if ((i4 & 6) == 0) {
            i5 = (c0285q.g(l3) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0285q.f(j3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0285q.e(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0285q.i(cVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0285q.i(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0285q.i(i3) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0285q.i(dVar) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= (16777216 & i4) == 0 ? c0285q.g(j02) : c0285q.i(j02) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= c0285q.g(interfaceC0180q3) ? 67108864 : 33554432;
        }
        if ((805306368 & i4) == 0) {
            i5 |= c0285q.g(b02) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if ((i6 & 306783379) == 306783378 && c0285q.A()) {
            c0285q.P();
        } else {
            int i7 = -((O0.b) c0285q.l(AbstractC1296l0.f11087f)).l(48);
            E1 e12 = new E1(i2);
            V.o b3 = A0.m.b(V.l.f5857b, false, C0200u.q);
            c0285q.V(1777156755);
            boolean e3 = c0285q.e(i7);
            Object K3 = c0285q.K();
            if (e3 || K3 == C0275l.f4150a) {
                K3 = new C0136k1(i7, 2);
                c0285q.e0(K3);
            }
            c0285q.r(false);
            B2.a.a(e12, b3, (y2.c) K3, null, "DatePickerDisplayModeAnimation", null, R.b.b(c0285q, -459778869, new C0143l1(l3, j3, cVar, cVar2, i3, dVar, j02, interfaceC0180q3, b02)), c0285q, ((i6 >> 6) & 14) | 1597440, 40);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0150m1(l3, j3, i2, cVar, cVar2, i3, dVar, j02, interfaceC0180q3, b02, i4);
        }
    }

    public static final void l(V.o oVar, boolean z3, boolean z4, y2.a aVar, boolean z5, String str, B0 b02, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        Object b3;
        int i4;
        long j3;
        int i5;
        long j4;
        c0285q.W(238547184);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.g(oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.h(z3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.h(z4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c0285q.i(aVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c0285q.h(z5) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c0285q.g(str) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= c0285q.g(b02) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= c0285q.i(eVar) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && c0285q.A()) {
            c0285q.P();
        } else {
            c0285q.V(84263149);
            boolean z6 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object K3 = c0285q.K();
            J.W w2 = C0275l.f4150a;
            if (z6 || K3 == w2) {
                b3 = (!z4 || z3) ? null : l0.c.b(AbstractC0239d.f3643g, b02.f1334u);
                c0285q.e0(b3);
            } else {
                b3 = K3;
            }
            C0911t c0911t = (C0911t) b3;
            c0285q.r(false);
            c0285q.V(84263865);
            boolean z7 = (458752 & i3) == 131072;
            Object K4 = c0285q.K();
            if (z7 || K4 == w2) {
                K4 = new A0.o(str, 6);
                c0285q.e0(K4);
            }
            c0285q.r(false);
            V.o b4 = A0.m.b(oVar, true, (y2.c) K4);
            InterfaceC0576P a3 = AbstractC0204u3.a(AbstractC0239d.f3636D, c0285q);
            int i6 = i3 >> 3;
            int i7 = i6 & 14;
            b02.getClass();
            c0285q.V(-1306331107);
            if (z3) {
                i4 = i6;
                j3 = z5 ? b02.f1326l : b02.f1327m;
            } else {
                i4 = i6;
                j3 = C0603v.f7276f;
            }
            J.W0 a4 = l.M.a(j3, AbstractC0831e.n(100, 0, null, 6), c0285q, 0);
            c0285q.r(false);
            long j5 = ((C0603v) a4.getValue()).f7279a;
            int i8 = i3 >> 6;
            c0285q.V(874111097);
            if (z3 && z5) {
                i5 = i8;
                j4 = b02.f1324j;
            } else {
                i5 = i8;
                j4 = (!z3 || z5) ? z4 ? b02.f1323i : z5 ? b02.f1321g : b02.f1322h : b02.f1325k;
            }
            J.W0 a5 = l.M.a(j4, AbstractC0831e.n(100, 0, null, 6), c0285q, 0);
            c0285q.r(false);
            AbstractC0223x4.b(z3, aVar, b4, z5, a3, j5, ((C0603v) a5.getValue()).f7279a, 0.0f, 0.0f, c0911t, null, R.b.b(c0285q, -1573188346, new C0078c(eVar, 5)), c0285q, (i5 & 112) | i7 | (i4 & 7168), 1408);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0164o1(oVar, z3, z4, aVar, z5, str, b02, eVar, i2);
        }
    }

    public static final void m(V.o oVar, long j3, y2.c cVar, InterfaceC0180q3 interfaceC0180q3, I i2, E2.d dVar, B0 b02, C0285q c0285q, int i3) {
        int i4;
        c0285q.W(-1286899812);
        if ((i3 & 6) == 0) {
            i4 = (c0285q.g(oVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0285q.f(j3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0285q.i(cVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0285q.g(interfaceC0180q3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0285q.i(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0285q.i(dVar) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0285q.g(b02) ? 1048576 : 524288;
        }
        if ((i4 & 599187) == 599186 && c0285q.A()) {
            c0285q.P();
        } else {
            t5.a(P5.a((O5) c0285q.l(P5.f1917a), AbstractC0239d.f3650n), R.b.b(c0285q, 1301915789, new C0190s1(i2, j3, dVar, b02, oVar, cVar, interfaceC0180q3)), c0285q, 48);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0196t1(oVar, j3, cVar, interfaceC0180q3, i2, dVar, b02, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(y2.a r19, boolean r20, V.o r21, y2.e r22, J.C0285q r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.A1.n(y2.a, boolean, V.o, y2.e, J.q, int, int):void");
    }
}
