package H;

import java.util.List;
import java.util.NoSuchElementException;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import s.InterfaceC1159L;

/* loaded from: classes.dex */
public final class T2 implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f2005a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2006b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2007c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1159L f2008d;

    public T2(y2.c cVar, boolean z3, float f3, InterfaceC1159L interfaceC1159L) {
        this.f2005a = cVar;
        this.f2006b = z3;
        this.f2007c = f3;
        this.f2008d = interfaceC1159L;
    }

    @Override // r0.InterfaceC1094H
    public final int a(t0.Z z3, List list, int i2) {
        return b(z3, list, i2, C0114h0.f2636B);
    }

    public final int b(t0.Z z3, List list, int i2, y2.e eVar) {
        Object obj;
        int i3;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj), "Leading")) {
                break;
            }
            i8++;
        }
        InterfaceC1093G interfaceC1093G = (InterfaceC1093G) obj;
        if (interfaceC1093G != null) {
            i3 = i2 == Integer.MAX_VALUE ? i2 : i2 - interfaceC1093G.a0(Integer.MAX_VALUE);
            i4 = ((Number) eVar.j(interfaceC1093G, Integer.valueOf(i2))).intValue();
        } else {
            i3 = i2;
            i4 = 0;
        }
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) obj2;
        if (interfaceC1093G2 != null) {
            int a02 = interfaceC1093G2.a0(Integer.MAX_VALUE);
            if (i3 != Integer.MAX_VALUE) {
                i3 -= a02;
            }
            i5 = ((Number) eVar.j(interfaceC1093G2, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (InterfaceC1093G) obj3;
        int intValue = obj8 != null ? ((Number) eVar.j(obj8, Integer.valueOf(B2.a.z(this.f2007c, i3, i2)))).intValue() : 0;
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        InterfaceC1093G interfaceC1093G3 = (InterfaceC1093G) obj4;
        if (interfaceC1093G3 != null) {
            i6 = ((Number) eVar.j(interfaceC1093G3, Integer.valueOf(i3))).intValue();
            int a03 = interfaceC1093G3.a0(Integer.MAX_VALUE);
            if (i3 != Integer.MAX_VALUE) {
                i3 -= a03;
            }
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        InterfaceC1093G interfaceC1093G4 = (InterfaceC1093G) obj5;
        if (interfaceC1093G4 != null) {
            int intValue2 = ((Number) eVar.j(interfaceC1093G4, Integer.valueOf(i3))).intValue();
            int a04 = interfaceC1093G4.a0(Integer.MAX_VALUE);
            if (i3 != Integer.MAX_VALUE) {
                i3 -= a04;
            }
            i7 = intValue2;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj9), "TextField")) {
                int intValue3 = ((Number) eVar.j(obj9, Integer.valueOf(i3))).intValue();
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                Object obj10 = (InterfaceC1093G) obj6;
                int intValue4 = obj10 != null ? ((Number) eVar.j(obj10, Integer.valueOf(i3))).intValue() : 0;
                int size8 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i15);
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i15++;
                }
                Object obj12 = (InterfaceC1093G) obj7;
                return R2.d(i4, i5, i6, i7, intValue3, intValue, intValue4, obj12 != null ? ((Number) eVar.j(obj12, Integer.valueOf(i2))).intValue() : 0, this.f2007c, AbstractC0140k5.f2810a, z3.c(), this.f2008d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // r0.InterfaceC1094H
    public final int c(t0.Z z3, List list, int i2) {
        return e(z3, list, i2, C0114h0.E);
    }

    @Override // r0.InterfaceC1094H
    public final int d(t0.Z z3, List list, int i2) {
        return b(z3, list, i2, C0114h0.f2638D);
    }

    public final int e(t0.Z z3, List list, int i2, y2.e eVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj7 = list.get(i3);
            if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj7), "TextField")) {
                int intValue = ((Number) eVar.j(obj7, Integer.valueOf(i2))).intValue();
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    obj = null;
                    if (i4 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i4);
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj2), "Label")) {
                        break;
                    }
                    i4++;
                }
                InterfaceC1093G interfaceC1093G = (InterfaceC1093G) obj2;
                int intValue2 = interfaceC1093G != null ? ((Number) eVar.j(interfaceC1093G, Integer.valueOf(i2))).intValue() : 0;
                int size3 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i5);
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj3), "Trailing")) {
                        break;
                    }
                    i5++;
                }
                InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) obj3;
                int intValue3 = interfaceC1093G2 != null ? ((Number) eVar.j(interfaceC1093G2, Integer.valueOf(i2))).intValue() : 0;
                int size4 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i6);
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj4), "Leading")) {
                        break;
                    }
                    i6++;
                }
                InterfaceC1093G interfaceC1093G3 = (InterfaceC1093G) obj4;
                int intValue4 = interfaceC1093G3 != null ? ((Number) eVar.j(interfaceC1093G3, Integer.valueOf(i2))).intValue() : 0;
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i7);
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj5), "Prefix")) {
                        break;
                    }
                    i7++;
                }
                InterfaceC1093G interfaceC1093G4 = (InterfaceC1093G) obj5;
                int intValue5 = interfaceC1093G4 != null ? ((Number) eVar.j(interfaceC1093G4, Integer.valueOf(i2))).intValue() : 0;
                int size6 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj6), "Suffix")) {
                        break;
                    }
                    i8++;
                }
                InterfaceC1093G interfaceC1093G5 = (InterfaceC1093G) obj6;
                int intValue6 = interfaceC1093G5 != null ? ((Number) eVar.j(interfaceC1093G5, Integer.valueOf(i2))).intValue() : 0;
                int size7 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i9);
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i9++;
                }
                InterfaceC1093G interfaceC1093G6 = (InterfaceC1093G) obj;
                return R2.e(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, interfaceC1093G6 != null ? ((Number) eVar.j(interfaceC1093G6, Integer.valueOf(i2))).intValue() : 0, this.f2007c, AbstractC0140k5.f2810a, z3.c(), this.f2008d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC1103Q abstractC1103Q;
        AbstractC1103Q abstractC1103Q2;
        Object obj4;
        AbstractC1103Q abstractC1103Q3;
        Object obj5;
        Object obj6;
        Object obj7;
        InterfaceC1159L interfaceC1159L = this.f2008d;
        int l3 = interfaceC1096J.l(interfaceC1159L.c());
        long a3 = O0.a.a(j3, 0, 0, 0, 0, 10);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj), "Leading")) {
                break;
            }
            i2++;
        }
        InterfaceC1093G interfaceC1093G = (InterfaceC1093G) obj;
        AbstractC1103Q a4 = interfaceC1093G != null ? interfaceC1093G.a(a3) : null;
        int e3 = AbstractC0140k5.e(a4);
        int max = Math.max(0, AbstractC0140k5.d(a4));
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) obj2;
        AbstractC1103Q a5 = interfaceC1093G2 != null ? interfaceC1093G2.a(B1.C.e0(-e3, 0, 2, a3)) : null;
        int e4 = AbstractC0140k5.e(a5) + e3;
        int max2 = Math.max(max, AbstractC0140k5.d(a5));
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj3), "Prefix")) {
                break;
            }
            i4++;
        }
        InterfaceC1093G interfaceC1093G3 = (InterfaceC1093G) obj3;
        if (interfaceC1093G3 != null) {
            abstractC1103Q = a4;
            abstractC1103Q2 = interfaceC1093G3.a(B1.C.e0(-e4, 0, 2, a3));
        } else {
            abstractC1103Q = a4;
            abstractC1103Q2 = null;
        }
        int e5 = AbstractC0140k5.e(abstractC1103Q2) + e4;
        int max3 = Math.max(max2, AbstractC0140k5.d(abstractC1103Q2));
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            int i6 = size4;
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj4), "Suffix")) {
                break;
            }
            i5++;
            size4 = i6;
        }
        InterfaceC1093G interfaceC1093G4 = (InterfaceC1093G) obj4;
        AbstractC1103Q a6 = interfaceC1093G4 != null ? interfaceC1093G4.a(B1.C.e0(-e5, 0, 2, a3)) : null;
        int e6 = AbstractC0140k5.e(a6) + e5;
        int max4 = Math.max(max3, AbstractC0140k5.d(a6));
        InterfaceC1096J interfaceC1096J2 = interfaceC1096J;
        int l4 = interfaceC1096J2.l(interfaceC1159L.a(interfaceC1096J.getLayoutDirection())) + interfaceC1096J2.l(interfaceC1159L.b(interfaceC1096J.getLayoutDirection()));
        int i7 = -e6;
        T2 t22 = this;
        int z3 = B2.a.z(t22.f2007c, i7 - l4, -l4);
        int i8 = -l3;
        AbstractC1103Q abstractC1103Q4 = a6;
        long d02 = B1.C.d0(z3, i8, a3);
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                abstractC1103Q3 = abstractC1103Q4;
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            int i10 = size5;
            abstractC1103Q3 = abstractC1103Q4;
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj5), "Label")) {
                break;
            }
            i9++;
            abstractC1103Q4 = abstractC1103Q3;
            size5 = i10;
        }
        InterfaceC1093G interfaceC1093G5 = (InterfaceC1093G) obj5;
        AbstractC1103Q a7 = interfaceC1093G5 != null ? interfaceC1093G5.a(d02) : null;
        if (a7 != null) {
            t22.f2005a.l(new b0.f(B1.C.i(a7.f9834h, a7.f9835i)));
        }
        int size6 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list.get(i11);
            int i12 = size6;
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj6), "Supporting")) {
                break;
            }
            i11++;
            size6 = i12;
        }
        InterfaceC1093G interfaceC1093G6 = (InterfaceC1093G) obj6;
        int b02 = interfaceC1093G6 != null ? interfaceC1093G6.b0(O0.a.j(j3)) : 0;
        int max5 = Math.max(AbstractC0140k5.d(a7) / 2, interfaceC1096J2.l(interfaceC1159L.d()));
        long a8 = O0.a.a(B1.C.d0(i7, (i8 - max5) - b02, j3), 0, 0, 0, 0, 11);
        int size7 = list.size();
        int i13 = 0;
        while (i13 < size7) {
            int i14 = size7;
            InterfaceC1093G interfaceC1093G7 = (InterfaceC1093G) list.get(i13);
            int i15 = i13;
            if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G7), "TextField")) {
                AbstractC1103Q a9 = interfaceC1093G7.a(a8);
                long a10 = O0.a.a(a8, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i16);
                    int i17 = size8;
                    if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj7), "Hint")) {
                        break;
                    }
                    i16++;
                    size8 = i17;
                }
                InterfaceC1093G interfaceC1093G8 = (InterfaceC1093G) obj7;
                AbstractC1103Q a11 = interfaceC1093G8 != null ? interfaceC1093G8.a(a10) : null;
                int max6 = Math.max(max4, Math.max(AbstractC0140k5.d(a9), AbstractC0140k5.d(a11)) + max5 + l3);
                int e7 = R2.e(AbstractC0140k5.e(abstractC1103Q), AbstractC0140k5.e(a5), AbstractC0140k5.e(abstractC1103Q2), AbstractC0140k5.e(abstractC1103Q3), a9.f9834h, AbstractC0140k5.e(a7), AbstractC0140k5.e(a11), t22.f2007c, j3, interfaceC1096J.c(), t22.f2008d);
                AbstractC1103Q a12 = interfaceC1093G6 != null ? interfaceC1093G6.a(O0.a.a(B1.C.e0(0, -max6, 1, a3), 0, e7, 0, 0, 9)) : null;
                int d3 = AbstractC0140k5.d(a12);
                int d4 = R2.d(AbstractC0140k5.d(abstractC1103Q), AbstractC0140k5.d(a5), AbstractC0140k5.d(abstractC1103Q2), AbstractC0140k5.d(abstractC1103Q3), a9.f9835i, AbstractC0140k5.d(a7), AbstractC0140k5.d(a11), AbstractC0140k5.d(a12), t22.f2007c, j3, interfaceC1096J.c(), t22.f2008d);
                int i18 = d4 - d3;
                int size9 = list.size();
                for (int i19 = 0; i19 < size9; i19++) {
                    InterfaceC1093G interfaceC1093G9 = (InterfaceC1093G) list.get(i19);
                    if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G9), "Container")) {
                        return interfaceC1096J.C(e7, d4, C0971w.f9166h, new S2(d4, e7, abstractC1103Q, a5, abstractC1103Q2, abstractC1103Q3, a9, a7, a11, interfaceC1093G9.a(B1.C.b(e7 != Integer.MAX_VALUE ? e7 : 0, e7, i18 != Integer.MAX_VALUE ? i18 : 0, i18)), a12, this, interfaceC1096J));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i13 = i15 + 1;
            size7 = i14;
            t22 = this;
            interfaceC1096J2 = interfaceC1096J2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // r0.InterfaceC1094H
    public final int h(t0.Z z3, List list, int i2) {
        return e(z3, list, i2, C0114h0.f2637C);
    }
}
