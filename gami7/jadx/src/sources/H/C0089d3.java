package H;

import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0963o;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;

/* renamed from: H.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089d3 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2434i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2435j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2436k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f2437l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2438m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s.Y f2439n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f2440o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.f f2441p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0089d3(y2.e eVar, y2.e eVar2, y2.e eVar3, int i2, s.Y y3, y2.e eVar4, y2.f fVar, int i3) {
        super(2);
        this.f2434i = i3;
        this.f2435j = eVar;
        this.f2436k = eVar2;
        this.f2437l = eVar3;
        this.f2438m = i2;
        this.f2439n = y3;
        this.f2440o = eVar4;
        this.f2441p = fVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        ArrayList arrayList2;
        J1 j12;
        Object obj6;
        Integer num;
        int l3;
        int d3;
        Object obj7;
        Object obj8;
        int l4;
        int l5;
        switch (this.f2434i) {
            case 0:
                r0.a0 a0Var = (r0.a0) obj;
                long j3 = ((O0.a) obj2).f5132a;
                int h2 = O0.a.h(j3);
                int g3 = O0.a.g(j3);
                return a0Var.C(h2, g3, C0971w.f9166h, new C0082c3(a0Var, this.f2435j, this.f2436k, this.f2437l, this.f2438m, h2, this.f2439n, O0.a.a(j3, 0, 0, 0, 0, 10), this.f2440o, this.f2441p, g3));
            default:
                r0.a0 a0Var2 = (r0.a0) obj;
                long j4 = ((O0.a) obj2).f5132a;
                int h3 = O0.a.h(j4);
                int g4 = O0.a.g(j4);
                long a3 = O0.a.a(j4, 0, 0, 0, 0, 10);
                List f02 = a0Var2.f0(EnumC0131j3.f2767h, this.f2435j);
                ArrayList arrayList3 = new ArrayList(f02.size());
                int size = f02.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList3.add(((InterfaceC1093G) f02.get(i2)).a(a3));
                }
                if (arrayList3.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList3.get(0);
                    int i3 = ((AbstractC1103Q) obj3).f9835i;
                    int u3 = AbstractC0963o.u(arrayList3);
                    if (1 <= u3) {
                        int i4 = 1;
                        while (true) {
                            Object obj9 = arrayList3.get(i4);
                            int i5 = ((AbstractC1103Q) obj9).f9835i;
                            if (i3 < i5) {
                                obj3 = obj9;
                                i3 = i5;
                            }
                            if (i4 != u3) {
                                i4++;
                            }
                        }
                    }
                }
                AbstractC1103Q abstractC1103Q = (AbstractC1103Q) obj3;
                int i6 = abstractC1103Q != null ? abstractC1103Q.f9835i : 0;
                List f03 = a0Var2.f0(EnumC0131j3.f2769j, this.f2436k);
                ArrayList arrayList4 = new ArrayList(f03.size());
                int size2 = f03.size();
                int i7 = 0;
                while (true) {
                    s.Y y3 = this.f2439n;
                    if (i7 >= size2) {
                        if (arrayList4.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList4.get(0);
                            int i8 = ((AbstractC1103Q) obj4).f9835i;
                            int u4 = AbstractC0963o.u(arrayList4);
                            if (1 <= u4) {
                                Object obj10 = obj4;
                                int i9 = i8;
                                int i10 = 1;
                                while (true) {
                                    Object obj11 = arrayList4.get(i10);
                                    int i11 = ((AbstractC1103Q) obj11).f9835i;
                                    if (i9 < i11) {
                                        obj10 = obj11;
                                        i9 = i11;
                                    }
                                    if (i10 != u4) {
                                        i10++;
                                    } else {
                                        obj4 = obj10;
                                    }
                                }
                            }
                        }
                        AbstractC1103Q abstractC1103Q2 = (AbstractC1103Q) obj4;
                        int i12 = abstractC1103Q2 != null ? abstractC1103Q2.f9835i : 0;
                        if (arrayList4.isEmpty()) {
                            arrayList = arrayList4;
                            obj5 = null;
                        } else {
                            obj5 = arrayList4.get(0);
                            int i13 = ((AbstractC1103Q) obj5).f9834h;
                            int u5 = AbstractC0963o.u(arrayList4);
                            if (1 <= u5) {
                                Object obj12 = obj5;
                                int i14 = i13;
                                int i15 = 1;
                                while (true) {
                                    Object obj13 = arrayList4.get(i15);
                                    arrayList = arrayList4;
                                    int i16 = ((AbstractC1103Q) obj13).f9834h;
                                    if (i14 < i16) {
                                        i14 = i16;
                                        obj12 = obj13;
                                    }
                                    if (i15 != u5) {
                                        i15++;
                                        arrayList4 = arrayList;
                                    } else {
                                        obj5 = obj12;
                                    }
                                }
                            } else {
                                arrayList = arrayList4;
                            }
                        }
                        AbstractC1103Q abstractC1103Q3 = (AbstractC1103Q) obj5;
                        int i17 = abstractC1103Q3 != null ? abstractC1103Q3.f9834h : 0;
                        List f04 = a0Var2.f0(EnumC0131j3.f2770k, this.f2437l);
                        ArrayList arrayList5 = new ArrayList(f04.size());
                        int size3 = f04.size();
                        int i18 = 0;
                        while (i18 < size3) {
                            List list = f04;
                            int i19 = size3;
                            AbstractC1103Q a4 = ((InterfaceC1093G) f04.get(i18)).a(B1.C.d0((-y3.a(a0Var2, a0Var2.getLayoutDirection())) - y3.c(a0Var2, a0Var2.getLayoutDirection()), -y3.d(a0Var2), a3));
                            if (a4.f9835i == 0 || a4.f9834h == 0) {
                                a4 = null;
                            }
                            if (a4 != null) {
                                arrayList5.add(a4);
                            }
                            i18++;
                            f04 = list;
                            size3 = i19;
                        }
                        boolean z3 = !arrayList5.isEmpty();
                        int i20 = this.f2438m;
                        if (z3) {
                            if (arrayList5.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList5.get(0);
                                int i21 = ((AbstractC1103Q) obj7).f9834h;
                                int u6 = AbstractC0963o.u(arrayList5);
                                if (1 <= u6) {
                                    int i22 = i21;
                                    int i23 = 1;
                                    while (true) {
                                        Object obj14 = arrayList5.get(i23);
                                        Object obj15 = obj7;
                                        int i24 = ((AbstractC1103Q) obj14).f9834h;
                                        if (i22 < i24) {
                                            i22 = i24;
                                            obj7 = obj14;
                                        } else {
                                            obj7 = obj15;
                                        }
                                        if (i23 != u6) {
                                            i23++;
                                        }
                                    }
                                }
                            }
                            z2.h.c(obj7);
                            int i25 = ((AbstractC1103Q) obj7).f9834h;
                            if (arrayList5.isEmpty()) {
                                arrayList2 = arrayList5;
                                obj8 = null;
                            } else {
                                obj8 = arrayList5.get(0);
                                int i26 = ((AbstractC1103Q) obj8).f9835i;
                                int u7 = AbstractC0963o.u(arrayList5);
                                if (1 <= u7) {
                                    int i27 = 1;
                                    Object obj16 = obj8;
                                    int i28 = i26;
                                    while (true) {
                                        Object obj17 = arrayList5.get(i27);
                                        arrayList2 = arrayList5;
                                        int i29 = ((AbstractC1103Q) obj17).f9835i;
                                        if (i28 < i29) {
                                            i28 = i29;
                                            obj16 = obj17;
                                        }
                                        if (i27 != u7) {
                                            i27++;
                                            arrayList5 = arrayList2;
                                        } else {
                                            obj8 = obj16;
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList5;
                                }
                            }
                            z2.h.c(obj8);
                            int i30 = ((AbstractC1103Q) obj8).f9835i;
                            boolean q = D1.q(i20, 0);
                            O0.k kVar = O0.k.f5148h;
                            if (!q) {
                                if (!D1.q(i20, 2) && !D1.q(i20, 3)) {
                                    l4 = (h3 - i25) / 2;
                                } else if (a0Var2.getLayoutDirection() == kVar) {
                                    l5 = a0Var2.l(AbstractC0124i3.f2739c);
                                    l4 = (h3 - l5) - i25;
                                } else {
                                    l4 = a0Var2.l(AbstractC0124i3.f2739c);
                                }
                                j12 = new J1(l4, i30);
                            } else if (a0Var2.getLayoutDirection() == kVar) {
                                l4 = a0Var2.l(AbstractC0124i3.f2739c);
                                j12 = new J1(l4, i30);
                            } else {
                                l5 = a0Var2.l(AbstractC0124i3.f2739c);
                                l4 = (h3 - l5) - i25;
                                j12 = new J1(l4, i30);
                            }
                        } else {
                            arrayList2 = arrayList5;
                            j12 = null;
                        }
                        List f05 = a0Var2.f0(EnumC0131j3.f2771l, new R.a(1843374446, new C0075b3(j12, this.f2440o, 1), true));
                        ArrayList arrayList6 = new ArrayList(f05.size());
                        int size4 = f05.size();
                        for (int i31 = 0; i31 < size4; i31++) {
                            arrayList6.add(((InterfaceC1093G) f05.get(i31)).a(a3));
                        }
                        if (arrayList6.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList6.get(0);
                            int i32 = ((AbstractC1103Q) obj6).f9835i;
                            int u8 = AbstractC0963o.u(arrayList6);
                            int i33 = 1;
                            if (1 <= u8) {
                                while (true) {
                                    Object obj18 = arrayList6.get(i33);
                                    Object obj19 = obj6;
                                    int i34 = ((AbstractC1103Q) obj18).f9835i;
                                    if (i32 < i34) {
                                        i32 = i34;
                                        obj6 = obj18;
                                    } else {
                                        obj6 = obj19;
                                    }
                                    if (i33 != u8) {
                                        i33++;
                                    }
                                }
                            }
                        }
                        AbstractC1103Q abstractC1103Q4 = (AbstractC1103Q) obj6;
                        Integer valueOf = abstractC1103Q4 != null ? Integer.valueOf(abstractC1103Q4.f9835i) : null;
                        if (j12 != null) {
                            int i35 = j12.f1619b;
                            if (valueOf == null || D1.q(i20, 3)) {
                                l3 = a0Var2.l(AbstractC0124i3.f2739c) + i35;
                                d3 = y3.d(a0Var2);
                            } else {
                                l3 = valueOf.intValue() + i35;
                                d3 = a0Var2.l(AbstractC0124i3.f2739c);
                            }
                            num = Integer.valueOf(d3 + l3);
                        } else {
                            num = null;
                        }
                        int intValue = i12 != 0 ? i12 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : y3.d(a0Var2)) : 0;
                        J1 j13 = j12;
                        List f06 = a0Var2.f0(EnumC0131j3.f2768i, new R.a(1655277373, new C0068a3(this.f2439n, a0Var2, arrayList3, i6, arrayList6, valueOf, this.f2441p, 1), true));
                        ArrayList arrayList7 = new ArrayList(f06.size());
                        int size5 = f06.size();
                        for (int i36 = 0; i36 < size5; i36++) {
                            arrayList7.add(((InterfaceC1093G) f06.get(i36)).a(a3));
                        }
                        return a0Var2.C(h3, g4, C0971w.f9166h, new C0117h3(arrayList7, arrayList3, arrayList, arrayList6, j13, h3, i17, this.f2439n, a0Var2, g4, intValue, valueOf, arrayList2, num));
                    }
                    arrayList4.add(((InterfaceC1093G) f03.get(i7)).a(B1.C.d0((-y3.a(a0Var2, a0Var2.getLayoutDirection())) - y3.c(a0Var2, a0Var2.getLayoutDirection()), -y3.d(a0Var2), a3)));
                    i7++;
                }
                break;
        }
    }
}
