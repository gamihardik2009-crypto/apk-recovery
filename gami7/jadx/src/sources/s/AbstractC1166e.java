package s;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import java.util.List;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1166e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1165d f10133a = new C1165d(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C1165d f10134b = new C1165d(1);

    /* renamed from: c, reason: collision with root package name */
    public static final int f10135c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10136d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10137e = 10;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10138f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10139g = 15;

    public static final void a(C0285q c0285q, V.o oVar) {
        C1176o c1176o = C1176o.f10163c;
        int i2 = c0285q.f4194P;
        V.o d3 = V.a.d(c0285q, oVar);
        InterfaceC0282o0 n3 = c0285q.n();
        InterfaceC1253k.f10606f.getClass();
        C1251i c1251i = C1252j.f10598b;
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
        C0257c.V(c0285q, c1176o, C1252j.f10602f);
        C0257c.V(c0285q, n3, C1252j.f10601e);
        C0257c.V(c0285q, d3, C1252j.f10600d);
        C1250h c1250h = C1252j.f10603g;
        if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
            B1.t.q(i2, c0285q, i2, c1250h);
        }
        c0285q.r(true);
    }

    public static final P b(InterfaceC1093G interfaceC1093G) {
        Object p3 = interfaceC1093G.p();
        if (p3 instanceof P) {
            return (P) p3;
        }
        return null;
    }

    public static final float c(P p3) {
        if (p3 != null) {
            return p3.f10073a;
        }
        return 0.0f;
    }

    public static InterfaceC1095I d(O o3, int i2, int i3, int i4, int i5, int i6, InterfaceC1096J interfaceC1096J, List list, AbstractC1103Q[] abstractC1103QArr, int i7) {
        int i8;
        int[] iArr;
        float f3;
        String str;
        long j3;
        int i9;
        int i10;
        O o4;
        int i11;
        int i12;
        int C3;
        String str2;
        String str3;
        int i13;
        int i14;
        String str4;
        String str5;
        String str6;
        float f4;
        long j4;
        String str7;
        float f5;
        long j5;
        String str8;
        float f6;
        float f7;
        String str9;
        float f8;
        int i15;
        long j6;
        int i16;
        List list2 = list;
        int i17 = i7;
        long j7 = i6;
        int[] iArr2 = new int[i17];
        float f9 = 0.0f;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i18 < i17) {
            InterfaceC1093G interfaceC1093G = (InterfaceC1093G) list2.get(i18);
            float c3 = c(b(interfaceC1093G));
            if (c3 > 0.0f) {
                f9 += c3;
                i19++;
                j6 = j7;
            } else {
                int i23 = i4 - i20;
                AbstractC1103Q abstractC1103Q = abstractC1103QArr[i18];
                if (abstractC1103Q == null) {
                    if (i4 == Integer.MAX_VALUE) {
                        j6 = j7;
                        i16 = Integer.MAX_VALUE;
                    } else {
                        i16 = i23 < 0 ? 0 : i23;
                        j6 = j7;
                    }
                    abstractC1103Q = interfaceC1093G.a(o3.j(0, i16, i5, false));
                } else {
                    j6 = j7;
                }
                AbstractC1103Q abstractC1103Q2 = abstractC1103Q;
                int b3 = o3.b(abstractC1103Q2);
                int g3 = o3.g(abstractC1103Q2);
                iArr2[i18] = b3;
                int i24 = i23 - b3;
                if (i24 < 0) {
                    i24 = 0;
                }
                i21 = Math.min(i6, i24);
                i20 += b3 + i21;
                int max = Math.max(i22, g3);
                abstractC1103QArr[i18] = abstractC1103Q2;
                i22 = max;
            }
            i18++;
            list2 = list;
            i17 = i7;
            j7 = j6;
        }
        long j8 = j7;
        int i25 = i22;
        if (i19 == 0) {
            i9 = i2;
            i10 = i25;
            iArr = iArr2;
            i11 = i20 - i21;
            i12 = 0;
            C3 = 0;
            o4 = o3;
        } else {
            int i26 = i4 != Integer.MAX_VALUE ? i4 : i2;
            long j9 = j8 * (i19 - 1);
            int i27 = i25;
            long y3 = B1.C.y((i26 - i20) - j9, 0L);
            float f10 = y3 / f9;
            long j10 = y3;
            int i28 = 0;
            while (true) {
                i8 = i27;
                iArr = iArr2;
                f3 = f9;
                str = "weightChildrenCount ";
                j3 = y3;
                if (i28 >= i7) {
                    break;
                }
                float c4 = c(b((InterfaceC1093G) list.get(i28)));
                long j11 = j9;
                float f11 = f10 * c4;
                try {
                    j10 -= Math.round(f11);
                    i28++;
                    i27 = i8;
                    iArr2 = iArr;
                    f9 = f3;
                    y3 = j3;
                    j9 = j11;
                } catch (IllegalArgumentException e3) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i4 + "mainAxisMin " + i2 + "targetSpace " + i26 + "arrangementSpacingPx " + j8 + "weightChildrenCount " + i19 + "fixedSpace " + i20 + "arrangementSpacingTotal " + j11 + "remainingToTarget " + j3 + "totalWeight " + f3 + "weightUnitSpace " + f10 + "itemWeight " + c4 + "weightedSize " + f11).initCause(e3);
                }
            }
            long j12 = j9;
            long j13 = j3;
            i9 = i2;
            String str10 = "remainingToTarget ";
            int i29 = i20;
            String str11 = "arrangementSpacingTotal ";
            String str12 = "weightedSize ";
            long j14 = j8;
            i10 = i8;
            List list3 = list;
            String str13 = "fixedSpace ";
            int i30 = 0;
            int i31 = i7;
            long j15 = j10;
            String str14 = "weightUnitSpace ";
            String str15 = "totalWeight ";
            int i32 = 0;
            long j16 = j15;
            while (i30 < i31) {
                if (abstractC1103QArr[i30] == null) {
                    InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) list3.get(i30);
                    P b4 = b(interfaceC1093G2);
                    int i33 = i19;
                    float c5 = c(b4);
                    if (c5 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    String str16 = str;
                    int signum = Long.signum(j16);
                    long j17 = j14;
                    j16 -= signum;
                    float f12 = f10 * c5;
                    int max2 = Math.max(0, Math.round(f12) + signum);
                    try {
                        if (b4 != null) {
                            try {
                                if (!b4.f10074b) {
                                    i15 = 0;
                                    f6 = f10;
                                    f7 = f12;
                                    str9 = str10;
                                    f8 = c5;
                                    AbstractC1103Q a3 = interfaceC1093G2.a(o3.j(i15, max2, i5, true));
                                    int b5 = o3.b(a3);
                                    int g4 = o3.g(a3);
                                    iArr[i30] = b5;
                                    i32 += b5;
                                    int max3 = Math.max(i10, g4);
                                    abstractC1103QArr[i30] = a3;
                                    i10 = max3;
                                    i14 = i29;
                                    str7 = str12;
                                    f5 = f3;
                                    i13 = i33;
                                    str3 = str16;
                                    j4 = j17;
                                    f4 = f6;
                                    str6 = str9;
                                    str2 = str13;
                                    str4 = str11;
                                    str8 = str14;
                                    str5 = str15;
                                    j5 = j12;
                                }
                            } catch (IllegalArgumentException e4) {
                                e = e4;
                                f6 = f10;
                                f7 = f12;
                                str9 = str10;
                                f8 = c5;
                                throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i4 + "mainAxisMin " + i9 + "targetSpace " + i26 + "arrangementSpacingPx " + j17 + str16 + i33 + str13 + i29 + str11 + j12 + str9 + j13 + str15 + f3 + str14 + f6 + "weight " + f8 + str12 + f7 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max2).initCause(e);
                            }
                        }
                        if (max2 != Integer.MAX_VALUE) {
                            i15 = max2;
                            f6 = f10;
                            f7 = f12;
                            str9 = str10;
                            f8 = c5;
                            AbstractC1103Q a32 = interfaceC1093G2.a(o3.j(i15, max2, i5, true));
                            int b52 = o3.b(a32);
                            int g42 = o3.g(a32);
                            iArr[i30] = b52;
                            i32 += b52;
                            int max32 = Math.max(i10, g42);
                            abstractC1103QArr[i30] = a32;
                            i10 = max32;
                            i14 = i29;
                            str7 = str12;
                            f5 = f3;
                            i13 = i33;
                            str3 = str16;
                            j4 = j17;
                            f4 = f6;
                            str6 = str9;
                            str2 = str13;
                            str4 = str11;
                            str8 = str14;
                            str5 = str15;
                            j5 = j12;
                        }
                        AbstractC1103Q a322 = interfaceC1093G2.a(o3.j(i15, max2, i5, true));
                        int b522 = o3.b(a322);
                        int g422 = o3.g(a322);
                        iArr[i30] = b522;
                        i32 += b522;
                        int max322 = Math.max(i10, g422);
                        abstractC1103QArr[i30] = a322;
                        i10 = max322;
                        i14 = i29;
                        str7 = str12;
                        f5 = f3;
                        i13 = i33;
                        str3 = str16;
                        j4 = j17;
                        f4 = f6;
                        str6 = str9;
                        str2 = str13;
                        str4 = str11;
                        str8 = str14;
                        str5 = str15;
                        j5 = j12;
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i4 + "mainAxisMin " + i9 + "targetSpace " + i26 + "arrangementSpacingPx " + j17 + str16 + i33 + str13 + i29 + str11 + j12 + str9 + j13 + str15 + f3 + str14 + f6 + "weight " + f8 + str12 + f7 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max2).initCause(e);
                    }
                    i15 = 0;
                    f6 = f10;
                    f7 = f12;
                    str9 = str10;
                    f8 = c5;
                } else {
                    str2 = str13;
                    str3 = str;
                    i13 = i19;
                    i14 = i29;
                    str4 = str11;
                    str5 = str15;
                    str6 = str10;
                    f4 = f10;
                    j4 = j14;
                    str7 = str12;
                    f5 = f3;
                    j5 = j12;
                    str8 = str14;
                }
                i30++;
                i19 = i13;
                j12 = j5;
                j13 = j13;
                str12 = str7;
                str14 = str8;
                str15 = str5;
                str10 = str6;
                str11 = str4;
                str13 = str2;
                list3 = list;
                f3 = f5;
                j14 = j4;
                f10 = f4;
                str = str3;
                i29 = i14;
                i31 = i7;
            }
            o4 = o3;
            i11 = i29;
            i12 = 0;
            C3 = B1.C.C((int) (i32 + j12), 0, i4 - i11);
        }
        int i34 = i11 + C3;
        if (i34 < 0) {
            i34 = i12;
        }
        int max4 = Math.max(i34, i9);
        int max5 = Math.max(i10, Math.max(i3, i12));
        int[] iArr3 = new int[i7];
        for (int i35 = i12; i35 < i7; i35++) {
            iArr3[i35] = i12;
        }
        o4.e(max4, iArr, iArr3, interfaceC1096J);
        return o3.i(abstractC1103QArr, interfaceC1096J, iArr3, max4, max5);
    }

    public static final C1152E e(W0.b bVar) {
        return new C1152E(bVar.f5891a, bVar.f5892b, bVar.f5893c, bVar.f5894d);
    }

    public static final void f(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
