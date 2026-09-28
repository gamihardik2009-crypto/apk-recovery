package H;

import D.C0053w;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.AbstractC1114c;
import r0.C1125n;
import r0.InterfaceC1093G;
import r0.InterfaceC1094H;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class X implements InterfaceC1094H {

    /* renamed from: b, reason: collision with root package name */
    public static final X f2130b = new X(0);

    /* renamed from: c, reason: collision with root package name */
    public static final X f2131c = new X(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2132a;

    public /* synthetic */ X(int i2) {
        this.f2132a = i2;
    }

    @Override // r0.InterfaceC1094H
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, List list, long j3) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i2;
        int i3;
        int i4;
        int d02;
        switch (this.f2132a) {
            case 0:
                int size = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        obj = list.get(i5);
                        if (!z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj), "leadingIcon")) {
                            i5++;
                        }
                    } else {
                        obj = null;
                    }
                }
                InterfaceC1093G interfaceC1093G = (InterfaceC1093G) obj;
                AbstractC1103Q a3 = interfaceC1093G != null ? interfaceC1093G.a(O0.a.a(j3, 0, 0, 0, 0, 10)) : null;
                int e3 = AbstractC0140k5.e(a3);
                int d3 = AbstractC0140k5.d(a3);
                int size2 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        obj2 = list.get(i6);
                        if (!z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj2), "trailingIcon")) {
                            i6++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                InterfaceC1093G interfaceC1093G2 = (InterfaceC1093G) obj2;
                AbstractC1103Q a4 = interfaceC1093G2 != null ? interfaceC1093G2.a(O0.a.a(j3, 0, 0, 0, 0, 10)) : null;
                int e4 = AbstractC0140k5.e(a4);
                int d4 = AbstractC0140k5.d(a4);
                int size3 = list.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    InterfaceC1093G interfaceC1093G3 = (InterfaceC1093G) list.get(i7);
                    if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G3), "label")) {
                        AbstractC1103Q a5 = interfaceC1093G3.a(B1.C.e0(-(e3 + e4), 0, 2, j3));
                        int i8 = a5.f9834h + e3 + e4;
                        int max = Math.max(d3, Math.max(a5.f9835i, d4));
                        return interfaceC1096J.C(i8, max, C0971w.f9166h, new W(a3, d3, max, a5, e3, a4, d4));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
                int size4 = list.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    InterfaceC1093G interfaceC1093G4 = (InterfaceC1093G) list.get(i9);
                    if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G4), "Spacer")) {
                        AbstractC1103Q a6 = interfaceC1093G4.a(O0.a.a(j3, 0, 0, 0, interfaceC1096J.l(I.B.f3453a), 3));
                        ArrayList arrayList = new ArrayList(list.size());
                        int size5 = list.size();
                        for (int i10 = 0; i10 < size5; i10++) {
                            Object obj5 = list.get(i10);
                            if (!z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj5), "Spacer")) {
                                arrayList.add(obj5);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size6 = arrayList.size();
                        for (int i11 = 0; i11 < size6; i11++) {
                            arrayList2.add(((InterfaceC1093G) arrayList.get(i11)).a(O0.a.a(j3, 0, 0, 0, O0.a.g(j3) / 2, 3)));
                        }
                        return interfaceC1096J.C(O0.a.h(j3), O0.a.g(j3), C0971w.f9166h, new C0053w(arrayList2, 6, a6));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                int min = Math.min(O0.a.h(j3), interfaceC1096J.l(AbstractC0118h4.f2682a));
                int size7 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size7) {
                        obj3 = list.get(i12);
                        if (!z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj3), "action")) {
                            i12++;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                InterfaceC1093G interfaceC1093G5 = (InterfaceC1093G) obj3;
                AbstractC1103Q a7 = interfaceC1093G5 != null ? interfaceC1093G5.a(j3) : null;
                int size8 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size8) {
                        obj4 = list.get(i13);
                        if (!z2.h.a(androidx.compose.ui.layout.a.a((InterfaceC1093G) obj4), "dismissAction")) {
                            i13++;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                InterfaceC1093G interfaceC1093G6 = (InterfaceC1093G) obj4;
                AbstractC1103Q a8 = interfaceC1093G6 != null ? interfaceC1093G6.a(j3) : null;
                int i14 = a7 != null ? a7.f9834h : 0;
                int i15 = a7 != null ? a7.f9835i : 0;
                int i16 = a8 != null ? a8.f9834h : 0;
                int i17 = a8 != null ? a8.f9835i : 0;
                int l3 = ((min - i14) - i16) - (i16 == 0 ? interfaceC1096J.l(AbstractC0118h4.f2688g) : 0);
                int j4 = O0.a.j(j3);
                int i18 = l3 < j4 ? j4 : l3;
                int size9 = list.size();
                for (int i19 = 0; i19 < size9; i19++) {
                    InterfaceC1093G interfaceC1093G7 = (InterfaceC1093G) list.get(i19);
                    if (z2.h.a(androidx.compose.ui.layout.a.a(interfaceC1093G7), "text")) {
                        int i20 = i17;
                        int i21 = i15;
                        AbstractC1103Q a9 = interfaceC1093G7.a(O0.a.a(j3, 0, i18, 0, 0, 9));
                        C1125n c1125n = AbstractC1114c.f9858a;
                        int d03 = a9.d0(c1125n);
                        if (d03 == Integer.MIN_VALUE) {
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        int d04 = a9.d0(AbstractC1114c.f9859b);
                        if (d04 == Integer.MIN_VALUE) {
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        boolean z3 = d03 == d04;
                        int i22 = min - i16;
                        int i23 = i22 - i14;
                        if (z3) {
                            i3 = Math.max(interfaceC1096J.l(I.y.f3829f), Math.max(i21, i20));
                            int i24 = (i3 - a9.f9835i) / 2;
                            i4 = (a7 == null || (d02 = a7.d0(c1125n)) == Integer.MIN_VALUE) ? 0 : (d03 + i24) - d02;
                            i2 = i24;
                        } else {
                            int l4 = interfaceC1096J.l(AbstractC0118h4.f2683b) - d03;
                            int max2 = Math.max(interfaceC1096J.l(I.y.f3830g), a9.f9835i + l4);
                            i2 = l4;
                            i3 = max2;
                            i4 = a7 != null ? (max2 - a7.f9835i) / 2 : 0;
                        }
                        return interfaceC1096J.C(min, i3, C0971w.f9166h, new C0076b4(a9, i2, a8, i22, a8 != null ? (i3 - a8.f9835i) / 2 : 0, a7, i23, i4));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
