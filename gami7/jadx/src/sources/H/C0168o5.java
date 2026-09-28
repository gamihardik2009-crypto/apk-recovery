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

/* renamed from: H.o5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168o5 implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2985a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2986b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1159L f2987c;

    public C0168o5(boolean z3, float f3, InterfaceC1159L interfaceC1159L) {
        this.f2985a = z3;
        this.f2986b = f3;
        this.f2987c = interfaceC1159L;
    }

    public static int e(List list, int i2, y2.e eVar) {
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
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj4), "Prefix")) {
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
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj5), "Suffix")) {
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
                    if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj6), "Leading")) {
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
                int intValue7 = interfaceC1093G6 != null ? ((Number) eVar.j(interfaceC1093G6, Integer.valueOf(i2))).intValue() : 0;
                long j3 = AbstractC0140k5.f2810a;
                float f3 = AbstractC0154m5.f2915a;
                int i10 = intValue4 + intValue5;
                return Math.max(Math.max(intValue + i10, Math.max(intValue7 + i10, intValue2)) + intValue6 + intValue3, O0.a.j(j3));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // r0.InterfaceC1094H
    public final int a(t0.Z z3, List list, int i2) {
        return b(z3, list, i2, C0114h0.F);
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
        int intValue = obj8 != null ? ((Number) eVar.j(obj8, Integer.valueOf(i3))).intValue() : 0;
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
            int intValue2 = ((Number) eVar.j(interfaceC1093G3, Integer.valueOf(i3))).intValue();
            int a03 = interfaceC1093G3.a0(Integer.MAX_VALUE);
            if (i3 != Integer.MAX_VALUE) {
                i3 -= a03;
            }
            i6 = intValue2;
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
            int intValue3 = ((Number) eVar.j(interfaceC1093G4, Integer.valueOf(i3))).intValue();
            int a04 = interfaceC1093G4.a0(Integer.MAX_VALUE);
            if (i3 != Integer.MAX_VALUE) {
                i3 -= a04;
            }
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (z2.h.a(AbstractC0140k5.c((InterfaceC1093G) obj9), "TextField")) {
                int intValue4 = ((Number) eVar.j(obj9, Integer.valueOf(i3))).intValue();
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
                int intValue5 = obj10 != null ? ((Number) eVar.j(obj10, Integer.valueOf(i3))).intValue() : 0;
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
                return AbstractC0154m5.c(intValue4, intValue, i4, i5, i6, i7, intValue5, obj12 != null ? ((Number) eVar.j(obj12, Integer.valueOf(i2))).intValue() : 0, this.f2986b, AbstractC0140k5.f2810a, z3.c(), this.f2987c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // r0.InterfaceC1094H
    public final int c(t0.Z z3, List list, int i2) {
        return e(list, i2, C0114h0.f2641I);
    }

    @Override // r0.InterfaceC1094H
    public final int d(t0.Z z3, List list, int i2) {
        return b(z3, list, i2, C0114h0.f2640H);
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        List list2 = list;
        InterfaceC1159L interfaceC1159L = this.f2987c;
        int l3 = interfaceC1096J.l(interfaceC1159L.d());
        int l4 = interfaceC1096J.l(interfaceC1159L.c());
        long a3 = O0.a.a(j3, 0, 0, 0, 0, 10);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i2);
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
            obj2 = list2.get(i3);
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
            obj3 = list2.get(i4);
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj3), "Prefix")) {
                break;
            }
            i4++;
        }
        InterfaceC1093G interfaceC1093G3 = (InterfaceC1093G) obj3;
        AbstractC1103Q a6 = interfaceC1093G3 != null ? interfaceC1093G3.a(B1.C.e0(-e4, 0, 2, a3)) : null;
        int e5 = AbstractC0140k5.e(a6) + e4;
        int max3 = Math.max(max2, AbstractC0140k5.d(a6));
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i5);
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj4), "Suffix")) {
                break;
            }
            i5++;
        }
        InterfaceC1093G interfaceC1093G4 = (InterfaceC1093G) obj4;
        AbstractC1103Q a7 = interfaceC1093G4 != null ? interfaceC1093G4.a(B1.C.e0(-e5, 0, 2, a3)) : null;
        int e6 = AbstractC0140k5.e(a7) + e5;
        int max4 = Math.max(max3, AbstractC0140k5.d(a7));
        int i6 = -e6;
        long d02 = B1.C.d0(i6, -l4, a3);
        int size5 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            Object obj8 = list2.get(i7);
            int i8 = size5;
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj8), "Label")) {
                obj5 = obj8;
                break;
            }
            i7++;
            size5 = i8;
        }
        InterfaceC1093G interfaceC1093G5 = (InterfaceC1093G) obj5;
        AbstractC1103Q a8 = interfaceC1093G5 != null ? interfaceC1093G5.a(d02) : null;
        int size6 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i9);
            int i10 = size6;
            if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj6), "Supporting")) {
                break;
            }
            i9++;
            size6 = i10;
        }
        InterfaceC1093G interfaceC1093G6 = (InterfaceC1093G) obj6;
        int b02 = interfaceC1093G6 != null ? interfaceC1093G6.b0(O0.a.j(j3)) : 0;
        int d3 = AbstractC0140k5.d(a8) + l3;
        long d03 = B1.C.d0(i6, ((-d3) - l4) - b02, O0.a.a(j3, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i11 = 0;
        while (i11 < size7) {
            int i12 = size7;
            InterfaceC1093G interfaceC1093G7 = (InterfaceC1093G) list2.get(i11);
            int i13 = i11;
            if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G7), "TextField")) {
                AbstractC1103Q a9 = interfaceC1093G7.a(d03);
                long a10 = O0.a.a(d03, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i14);
                    int i15 = size8;
                    if (z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj7), "Hint")) {
                        break;
                    }
                    i14++;
                    list2 = list;
                    size8 = i15;
                }
                InterfaceC1093G interfaceC1093G8 = (InterfaceC1093G) obj7;
                AbstractC1103Q a11 = interfaceC1093G8 != null ? interfaceC1093G8.a(a10) : null;
                int max5 = Math.max(max4, Math.max(AbstractC0140k5.d(a9), AbstractC0140k5.d(a11)) + d3 + l4);
                int e7 = AbstractC0140k5.e(a4);
                int e8 = AbstractC0140k5.e(a5);
                int e9 = AbstractC0140k5.e(a6) + AbstractC0140k5.e(a7);
                int max6 = Math.max(Math.max(a9.f9834h + e9, Math.max(AbstractC0140k5.e(a11) + e9, AbstractC0140k5.e(a8))) + e7 + e8, O0.a.j(j3));
                AbstractC1103Q a12 = interfaceC1093G6 != null ? interfaceC1093G6.a(O0.a.a(B1.C.e0(0, -max5, 1, a3), 0, max6, 0, 0, 9)) : null;
                int d4 = AbstractC0140k5.d(a12);
                int c3 = AbstractC0154m5.c(a9.f9835i, AbstractC0140k5.d(a8), AbstractC0140k5.d(a4), AbstractC0140k5.d(a5), AbstractC0140k5.d(a6), AbstractC0140k5.d(a7), AbstractC0140k5.d(a11), AbstractC0140k5.d(a12), this.f2986b, j3, interfaceC1096J.c(), this.f2987c);
                int i16 = c3 - d4;
                int size9 = list.size();
                int i17 = 0;
                while (i17 < size9) {
                    InterfaceC1093G interfaceC1093G9 = (InterfaceC1093G) list.get(i17);
                    int i18 = size9;
                    if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G9), "Container")) {
                        return interfaceC1096J.C(max6, c3, C0971w.f9166h, new C0161n5(a8, max6, c3, a9, a11, a4, a5, a6, a7, interfaceC1093G9.a(B1.C.b(max6 != Integer.MAX_VALUE ? max6 : 0, max6, i16 != Integer.MAX_VALUE ? i16 : 0, i16)), a12, this, l3, interfaceC1096J));
                    }
                    i17++;
                    size9 = i18;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            list2 = list;
            i11 = i13 + 1;
            size7 = i12;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // r0.InterfaceC1094H
    public final int h(t0.Z z3, List list, int i2) {
        return e(list, i2, C0114h0.f2639G);
    }
}
