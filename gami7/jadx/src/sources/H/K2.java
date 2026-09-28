package H;

import J.C0285q;
import J.C0291t0;
import androidx.compose.foundation.BorderModifierNodeElement;
import c0.C0603v;
import c0.InterfaceC0576P;
import n.C0911t;
import s.AbstractC1177p;

/* loaded from: classes.dex */
public final class K2 {

    /* renamed from: a, reason: collision with root package name */
    public static final K2 f1666a = new K2();

    /* renamed from: b, reason: collision with root package name */
    public static final float f1667b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1668c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1669d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1670e = 2;

    public static Z4 c(int i2, C0285q c0285q) {
        c0285q.V(-471651810);
        Z4 e3 = e((C0093e0) c0285q.l(AbstractC0107g0.f2597a), c0285q);
        c0285q.r(false);
        return e3;
    }

    public static Z4 d(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, C0285q c0285q, int i2) {
        c0285q.V(1767617725);
        long j11 = (i2 & 1) != 0 ? C0603v.f7277g : j3;
        long j12 = C0603v.f7277g;
        Z4 b3 = e((C0093e0) c0285q.l(AbstractC0107g0.f2597a), c0285q).b(j11, j12, (i2 & 4) != 0 ? j12 : j4, j12, (i2 & 16) != 0 ? j12 : j5, (i2 & 32) != 0 ? j12 : j6, j12, j12, j12, j12, null, j12, j12, (i2 & 8192) != 0 ? j12 : j7, j12, j12, j12, (131072 & i2) != 0 ? j12 : j8, j12, j12, j12, j12, j12, j12, j12, (33554432 & i2) != 0 ? j12 : j9, j12, j12, j12, (i2 & 536870912) != 0 ? j12 : j10, j12, j12, j12, j12, j12, j12, j12, j12, j12, j12, j12, j12, j12);
        c0285q.r(false);
        return b3;
    }

    public static Z4 e(C0093e0 c0093e0, C0285q c0285q) {
        c0285q.V(-292363577);
        Z4 z4 = c0093e0.f2480X;
        if (z4 == null) {
            long c3 = AbstractC0107g0.c(c0093e0, 18);
            long c4 = AbstractC0107g0.c(c0093e0, 18);
            long b3 = C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, 18));
            long c5 = AbstractC0107g0.c(c0093e0, 18);
            long j3 = C0603v.f7276f;
            z4 = new Z4(c3, c4, b3, c5, j3, j3, j3, j3, AbstractC0107g0.c(c0093e0, 26), AbstractC0107g0.c(c0093e0, 2), (D.g0) c0285q.l(D.h0.f857a), AbstractC0107g0.c(c0093e0, 26), AbstractC0107g0.c(c0093e0, 24), C0603v.b(0.12f, AbstractC0107g0.c(c0093e0, 18)), AbstractC0107g0.c(c0093e0, 2), AbstractC0107g0.c(c0093e0, 19), AbstractC0107g0.c(c0093e0, 19), C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, 18)), AbstractC0107g0.c(c0093e0, 19), AbstractC0107g0.c(c0093e0, 19), AbstractC0107g0.c(c0093e0, 19), C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, 18)), AbstractC0107g0.c(c0093e0, 2), AbstractC0107g0.c(c0093e0, 26), AbstractC0107g0.c(c0093e0, 19), C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, 18)), AbstractC0107g0.c(c0093e0, 2), AbstractC0107g0.c(c0093e0, 19), AbstractC0107g0.c(c0093e0, 19), C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, 18)), AbstractC0107g0.c(c0093e0, 19), AbstractC0107g0.c(c0093e0, 19), AbstractC0107g0.c(c0093e0, 19), C0603v.b(0.38f, AbstractC0107g0.d(18, c0285q)), AbstractC0107g0.c(c0093e0, 2), AbstractC0107g0.c(c0093e0, 19), AbstractC0107g0.c(c0093e0, 19), C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, 19)), AbstractC0107g0.c(c0093e0, 19), AbstractC0107g0.c(c0093e0, 19), AbstractC0107g0.c(c0093e0, 19), C0603v.b(0.38f, AbstractC0107g0.c(c0093e0, 19)), AbstractC0107g0.c(c0093e0, 19));
            c0093e0.f2480X = z4;
        }
        c0285q.r(false);
        return z4;
    }

    public final void a(boolean z3, boolean z4, r.k kVar, Z4 z42, InterfaceC0576P interfaceC0576P, float f3, float f4, C0285q c0285q, int i2, int i3) {
        int i4;
        InterfaceC0576P interfaceC0576P2;
        float f5;
        float f6;
        float f7;
        InterfaceC0576P interfaceC0576P3;
        float f8;
        int i5;
        int i6;
        int i7;
        c0285q.W(1461761386);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (c0285q.h(z3) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= c0285q.h(z4) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= c0285q.g(kVar) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= c0285q.g(z42) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                interfaceC0576P2 = interfaceC0576P;
                if (c0285q.g(interfaceC0576P2)) {
                    i7 = 16384;
                    i4 |= i7;
                }
            } else {
                interfaceC0576P2 = interfaceC0576P;
            }
            i7 = 8192;
            i4 |= i7;
        } else {
            interfaceC0576P2 = interfaceC0576P;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                f5 = f3;
                if (c0285q.d(f5)) {
                    i6 = 131072;
                    i4 |= i6;
                }
            } else {
                f5 = f3;
            }
            i6 = 65536;
            i4 |= i6;
        } else {
            f5 = f3;
        }
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f6 = f4;
                if (c0285q.d(f6)) {
                    i5 = 1048576;
                    i4 |= i5;
                }
            } else {
                f6 = f4;
            }
            i5 = 524288;
            i4 |= i5;
        } else {
            f6 = f4;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= c0285q.g(this) ? 8388608 : 4194304;
        }
        if ((4793491 & i4) == 4793490 && c0285q.A()) {
            c0285q.P();
            interfaceC0576P3 = interfaceC0576P2;
            f8 = f5;
            f7 = f6;
        } else {
            c0285q.R();
            if ((i2 & 1) == 0 || c0285q.z()) {
                if ((i3 & 16) != 0) {
                    interfaceC0576P2 = AbstractC0204u3.a(3, c0285q);
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    f5 = f1670e;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                    f6 = f1669d;
                }
            } else {
                c0285q.P();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                }
            }
            InterfaceC0576P interfaceC0576P4 = interfaceC0576P2;
            float f9 = f5;
            f7 = f6;
            c0285q.s();
            int i8 = (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168);
            int i9 = i4 >> 3;
            C0911t c0911t = (C0911t) D1.k(z3, z4, kVar, z42, f9, f7, c0285q, i8 | (57344 & i9) | (i9 & 458752)).getValue();
            AbstractC1177p.a(androidx.compose.foundation.a.b(new BorderModifierNodeElement(c0911t.f8850a, c0911t.f8851b, interfaceC0576P4), ((C0603v) z42.a(z3, z4, kVar, c0285q, i8).getValue()).f7279a, interfaceC0576P4), c0285q, 0);
            interfaceC0576P3 = interfaceC0576P4;
            f8 = f9;
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new I2(this, z3, z4, kVar, z42, interfaceC0576P3, f8, f7, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r40, y2.e r41, boolean r42, boolean r43, I0.I r44, r.k r45, boolean r46, y2.e r47, y2.e r48, y2.e r49, y2.e r50, y2.e r51, y2.e r52, y2.e r53, H.Z4 r54, s.InterfaceC1159L r55, y2.e r56, J.C0285q r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.K2.b(java.lang.String, y2.e, boolean, boolean, I0.I, r.k, boolean, y2.e, y2.e, y2.e, y2.e, y2.e, y2.e, y2.e, H.Z4, s.L, y2.e, J.q, int, int, int):void");
    }
}
