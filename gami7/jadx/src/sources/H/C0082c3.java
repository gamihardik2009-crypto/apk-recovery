package H;

import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0963o;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;

/* renamed from: H.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082c3 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r0.a0 f2401i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2402j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2403k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f2404l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2405m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2406n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s.Y f2407o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f2408p;
    public final /* synthetic */ y2.e q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.f f2409r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2410s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082c3(r0.a0 a0Var, y2.e eVar, y2.e eVar2, y2.e eVar3, int i2, int i3, s.Y y3, long j3, y2.e eVar4, y2.f fVar, int i4) {
        super(1);
        this.f2401i = a0Var;
        this.f2402j = eVar;
        this.f2403k = eVar2;
        this.f2404l = eVar3;
        this.f2405m = i2;
        this.f2406n = i3;
        this.f2407o = y3;
        this.f2408p = j3;
        this.q = eVar4;
        this.f2409r = fVar;
        this.f2410s = i4;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        long j3;
        Object obj2;
        s.Y y3;
        Object obj3;
        Object obj4;
        ArrayList arrayList;
        J1 j12;
        Object obj5;
        Integer num;
        int i2;
        int intValue;
        int l3;
        Object obj6;
        Object obj7;
        int i3;
        int l4;
        AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
        EnumC0131j3 enumC0131j3 = EnumC0131j3.f2767h;
        y2.e eVar = this.f2402j;
        r0.a0 a0Var = this.f2401i;
        List f02 = a0Var.f0(enumC0131j3, eVar);
        ArrayList arrayList2 = new ArrayList(f02.size());
        int size = f02.size();
        int i4 = 0;
        while (true) {
            j3 = this.f2408p;
            if (i4 >= size) {
                break;
            }
            arrayList2.add(((InterfaceC1093G) f02.get(i4)).a(j3));
            i4++;
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int i5 = ((AbstractC1103Q) obj2).f9835i;
            int u3 = AbstractC0963o.u(arrayList2);
            if (1 <= u3) {
                int i6 = 1;
                while (true) {
                    Object obj8 = arrayList2.get(i6);
                    int i7 = ((AbstractC1103Q) obj8).f9835i;
                    if (i5 < i7) {
                        obj2 = obj8;
                        i5 = i7;
                    }
                    if (i6 == u3) {
                        break;
                    }
                    i6++;
                }
            }
        }
        AbstractC1103Q abstractC1103Q = (AbstractC1103Q) obj2;
        int i8 = abstractC1103Q != null ? abstractC1103Q.f9835i : 0;
        List f03 = a0Var.f0(EnumC0131j3.f2769j, this.f2403k);
        ArrayList arrayList3 = new ArrayList(f03.size());
        int size2 = f03.size();
        int i9 = 0;
        while (true) {
            y3 = this.f2407o;
            if (i9 >= size2) {
                break;
            }
            arrayList3.add(((InterfaceC1093G) f03.get(i9)).a(B1.C.d0((-y3.a(a0Var, a0Var.getLayoutDirection())) - y3.c(a0Var, a0Var.getLayoutDirection()), -y3.d(a0Var), j3)));
            i9++;
        }
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i10 = ((AbstractC1103Q) obj3).f9835i;
            int u4 = AbstractC0963o.u(arrayList3);
            if (1 <= u4) {
                int i11 = 1;
                while (true) {
                    Object obj9 = arrayList3.get(i11);
                    int i12 = ((AbstractC1103Q) obj9).f9835i;
                    if (i10 < i12) {
                        obj3 = obj9;
                        i10 = i12;
                    }
                    if (i11 == u4) {
                        break;
                    }
                    i11++;
                }
            }
        }
        AbstractC1103Q abstractC1103Q2 = (AbstractC1103Q) obj3;
        int i13 = abstractC1103Q2 != null ? abstractC1103Q2.f9835i : 0;
        if (arrayList3.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList3.get(0);
            int i14 = ((AbstractC1103Q) obj4).f9834h;
            int u5 = AbstractC0963o.u(arrayList3);
            if (1 <= u5) {
                int i15 = 1;
                while (true) {
                    Object obj10 = arrayList3.get(i15);
                    int i16 = ((AbstractC1103Q) obj10).f9834h;
                    if (i14 < i16) {
                        obj4 = obj10;
                        i14 = i16;
                    }
                    if (i15 == u5) {
                        break;
                    }
                    i15++;
                }
            }
        }
        AbstractC1103Q abstractC1103Q3 = (AbstractC1103Q) obj4;
        int i17 = abstractC1103Q3 != null ? abstractC1103Q3.f9834h : 0;
        List f04 = a0Var.f0(EnumC0131j3.f2770k, this.f2404l);
        ArrayList arrayList4 = new ArrayList(f04.size());
        int size3 = f04.size();
        int i18 = 0;
        while (i18 < size3) {
            List list = f04;
            int i19 = size3;
            ArrayList arrayList5 = arrayList3;
            AbstractC1103Q a3 = ((InterfaceC1093G) f04.get(i18)).a(B1.C.d0((-y3.a(a0Var, a0Var.getLayoutDirection())) - y3.c(a0Var, a0Var.getLayoutDirection()), -y3.d(a0Var), j3));
            if (a3.f9835i == 0 || a3.f9834h == 0) {
                a3 = null;
            }
            if (a3 != null) {
                arrayList4.add(a3);
            }
            i18++;
            f04 = list;
            size3 = i19;
            arrayList3 = arrayList5;
        }
        ArrayList arrayList6 = arrayList3;
        boolean z3 = !arrayList4.isEmpty();
        int i20 = this.f2406n;
        if (z3) {
            if (arrayList4.isEmpty()) {
                obj6 = null;
            } else {
                obj6 = arrayList4.get(0);
                int i21 = ((AbstractC1103Q) obj6).f9834h;
                int u6 = AbstractC0963o.u(arrayList4);
                if (1 <= u6) {
                    int i22 = 1;
                    while (true) {
                        Object obj11 = arrayList4.get(i22);
                        Object obj12 = obj6;
                        int i23 = ((AbstractC1103Q) obj11).f9834h;
                        if (i21 < i23) {
                            i21 = i23;
                            obj6 = obj11;
                        } else {
                            obj6 = obj12;
                        }
                        if (i22 == u6) {
                            break;
                        }
                        i22++;
                    }
                }
            }
            z2.h.c(obj6);
            int i24 = ((AbstractC1103Q) obj6).f9834h;
            if (arrayList4.isEmpty()) {
                arrayList = arrayList4;
                obj7 = null;
            } else {
                obj7 = arrayList4.get(0);
                int i25 = ((AbstractC1103Q) obj7).f9835i;
                int u7 = AbstractC0963o.u(arrayList4);
                if (1 <= u7) {
                    int i26 = i25;
                    Object obj13 = obj7;
                    int i27 = 1;
                    while (true) {
                        Object obj14 = arrayList4.get(i27);
                        arrayList = arrayList4;
                        int i28 = ((AbstractC1103Q) obj14).f9835i;
                        if (i26 < i28) {
                            i26 = i28;
                            obj13 = obj14;
                        }
                        if (i27 == u7) {
                            break;
                        }
                        i27++;
                        arrayList4 = arrayList;
                    }
                    obj7 = obj13;
                } else {
                    arrayList = arrayList4;
                }
            }
            z2.h.c(obj7);
            int i29 = ((AbstractC1103Q) obj7).f9835i;
            int i30 = this.f2405m;
            boolean q = D1.q(i30, 0);
            O0.k kVar = O0.k.f5148h;
            if (q) {
                if (a0Var.getLayoutDirection() == kVar) {
                    i3 = a0Var.l(AbstractC0124i3.f2739c);
                    j12 = new J1(i3, i29);
                } else {
                    l4 = a0Var.l(AbstractC0124i3.f2739c);
                    i3 = (i20 - l4) - i24;
                    j12 = new J1(i3, i29);
                }
            } else if (!D1.q(i30, 2)) {
                i3 = (i20 - i24) / 2;
                j12 = new J1(i3, i29);
            } else if (a0Var.getLayoutDirection() == kVar) {
                l4 = a0Var.l(AbstractC0124i3.f2739c);
                i3 = (i20 - l4) - i24;
                j12 = new J1(i3, i29);
            } else {
                i3 = a0Var.l(AbstractC0124i3.f2739c);
                j12 = new J1(i3, i29);
            }
        } else {
            arrayList = arrayList4;
            j12 = null;
        }
        List f05 = a0Var.f0(EnumC0131j3.f2771l, new R.a(-791102355, new C0075b3(j12, this.q, 0), true));
        ArrayList arrayList7 = new ArrayList(f05.size());
        int size4 = f05.size();
        for (int i31 = 0; i31 < size4; i31++) {
            arrayList7.add(((InterfaceC1093G) f05.get(i31)).a(j3));
        }
        if (arrayList7.isEmpty()) {
            obj5 = null;
        } else {
            obj5 = arrayList7.get(0);
            int i32 = ((AbstractC1103Q) obj5).f9835i;
            int u8 = AbstractC0963o.u(arrayList7);
            if (1 <= u8) {
                int i33 = 1;
                while (true) {
                    Object obj15 = arrayList7.get(i33);
                    Object obj16 = obj5;
                    int i34 = ((AbstractC1103Q) obj15).f9835i;
                    if (i32 < i34) {
                        i32 = i34;
                        obj5 = obj15;
                    } else {
                        obj5 = obj16;
                    }
                    if (i33 == u8) {
                        break;
                    }
                    i33++;
                }
            }
        }
        AbstractC1103Q abstractC1103Q4 = (AbstractC1103Q) obj5;
        Integer valueOf = abstractC1103Q4 != null ? Integer.valueOf(abstractC1103Q4.f9835i) : null;
        if (j12 != null) {
            int i35 = j12.f1619b;
            if (valueOf == null) {
                intValue = a0Var.l(AbstractC0124i3.f2739c) + i35;
                l3 = y3.d(a0Var);
            } else {
                intValue = valueOf.intValue() + i35;
                l3 = a0Var.l(AbstractC0124i3.f2739c);
            }
            num = Integer.valueOf(l3 + intValue);
        } else {
            num = null;
        }
        int intValue2 = i13 != 0 ? i13 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : y3.d(a0Var)) : 0;
        EnumC0131j3 enumC0131j32 = EnumC0131j3.f2768i;
        y2.f fVar = this.f2409r;
        s.Y y4 = this.f2407o;
        r0.a0 a0Var2 = this.f2401i;
        ArrayList arrayList8 = arrayList7;
        int i36 = i17;
        J1 j13 = j12;
        int i37 = intValue2;
        List f06 = a0Var2.f0(enumC0131j32, new R.a(495329982, new C0068a3(y4, a0Var2, arrayList2, i8, arrayList7, valueOf, fVar, 0), true));
        ArrayList arrayList9 = new ArrayList(f06.size());
        int size5 = f06.size();
        for (int i38 = 0; i38 < size5; i38++) {
            arrayList9.add(((InterfaceC1093G) f06.get(i38)).a(j3));
        }
        int size6 = arrayList9.size();
        for (int i39 = 0; i39 < size6; i39++) {
            AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) arrayList9.get(i39), 0, 0);
        }
        int i40 = 0;
        int size7 = arrayList2.size();
        int i41 = 0;
        while (i41 < size7) {
            AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) arrayList2.get(i41), i40, i40);
            i41++;
            i40 = 0;
        }
        int size8 = arrayList6.size();
        int i42 = 0;
        while (true) {
            i2 = this.f2410s;
            if (i42 >= size8) {
                break;
            }
            AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) arrayList6.get(i42), y3.a(a0Var, a0Var.getLayoutDirection()) + ((i20 - i36) / 2), i2 - i37);
            i42++;
        }
        int size9 = arrayList8.size();
        int i43 = 0;
        while (i43 < size9) {
            ArrayList arrayList10 = arrayList8;
            AbstractC1102P.d(abstractC1102P, (AbstractC1103Q) arrayList10.get(i43), 0, i2 - (valueOf != null ? valueOf.intValue() : 0));
            i43++;
            arrayList8 = arrayList10;
        }
        if (j13 != null) {
            int size10 = arrayList.size();
            int i44 = 0;
            while (i44 < size10) {
                ArrayList arrayList11 = arrayList;
                AbstractC1103Q abstractC1103Q5 = (AbstractC1103Q) arrayList11.get(i44);
                z2.h.c(num);
                AbstractC1102P.d(abstractC1102P, abstractC1103Q5, j13.f1618a, i2 - num.intValue());
                i44++;
                arrayList = arrayList11;
            }
        }
        return C0880v.f8657a;
    }
}
