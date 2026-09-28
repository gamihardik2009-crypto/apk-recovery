package C0;

import android.util.Log;
import c0.AbstractC0571K;
import c0.C0575O;
import c0.C0603v;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class z extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f601i;

    /* renamed from: j, reason: collision with root package name */
    public static final z f585j = new z(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final z f586k = new z(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final z f587l = new z(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final z f588m = new z(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final z f589n = new z(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final z f590o = new z(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final z f591p = new z(1, 6);
    public static final z q = new z(1, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final z f592r = new z(1, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final z f593s = new z(1, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final z f594t = new z(1, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final z f595u = new z(1, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final z f596v = new z(1, 12);

    /* renamed from: w, reason: collision with root package name */
    public static final z f597w = new z(1, 13);

    /* renamed from: x, reason: collision with root package name */
    public static final z f598x = new z(1, 14);

    /* renamed from: y, reason: collision with root package name */
    public static final z f599y = new z(1, 15);

    /* renamed from: z, reason: collision with root package name */
    public static final z f600z = new z(1, 16);

    /* renamed from: A, reason: collision with root package name */
    public static final z f581A = new z(1, 17);

    /* renamed from: B, reason: collision with root package name */
    public static final z f582B = new z(1, 18);

    /* renamed from: C, reason: collision with root package name */
    public static final z f583C = new z(1, 19);

    /* renamed from: D, reason: collision with root package name */
    public static final z f584D = new z(1, 20);
    public static final z E = new z(1, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i2, int i3) {
        super(i2);
        this.f601i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        int i2 = 0;
        List list = null;
        r9 = null;
        C c3 = null;
        r9 = null;
        O0.m mVar = null;
        r9 = null;
        C0575O c0575o = null;
        r9 = null;
        N0.o oVar = null;
        r9 = null;
        I i3 = null;
        r9 = null;
        I i4 = null;
        r9 = null;
        C0028k c0028k = null;
        r9 = null;
        C0029l c0029l = null;
        r9 = null;
        L l3 = null;
        r9 = null;
        M m3 = null;
        r9 = null;
        C c4 = null;
        r9 = null;
        t tVar = null;
        list = null;
        switch (this.f601i) {
            case 0:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj2 = list2.get(1);
                K1.e eVar = B.f407b;
                Boolean bool = Boolean.FALSE;
                List list3 = ((!z2.h.a(obj2, bool) || (eVar instanceof A)) && obj2 != null) ? (List) ((y2.c) eVar.f4537b).l(obj2) : null;
                Object obj3 = list2.get(2);
                List list4 = ((!z2.h.a(obj3, bool) || (eVar instanceof A)) && obj3 != null) ? (List) ((y2.c) eVar.f4537b).l(obj3) : null;
                Object obj4 = list2.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                z2.h.c(str);
                if (list3 == null || list3.isEmpty()) {
                    list3 = null;
                }
                if (list4 == null || list4.isEmpty()) {
                    list4 = null;
                }
                Object obj5 = list2.get(3);
                if ((!z2.h.a(obj5, bool) || (eVar instanceof A)) && obj5 != null) {
                    list = (List) ((y2.c) eVar.f4537b).l(obj5);
                }
                return new C0024g(str, list3, list4, list);
            case 1:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i2 < size) {
                    Object obj6 = list5.get(i2);
                    K1.e eVar2 = B.f408c;
                    C0022e c0022e = ((!z2.h.a(obj6, Boolean.FALSE) || (eVar2 instanceof A)) && obj6 != null) ? (C0022e) ((y2.c) eVar2.f4537b).l(obj6) : null;
                    z2.h.c(c0022e);
                    arrayList.add(c0022e);
                    i2++;
                }
                return arrayList;
            case 2:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                EnumC0026i enumC0026i = obj7 != null ? (EnumC0026i) obj7 : null;
                z2.h.c(enumC0026i);
                Object obj8 = list6.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                z2.h.c(num);
                int intValue = num.intValue();
                Object obj9 = list6.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                z2.h.c(num2);
                int intValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                z2.h.c(str2);
                switch (enumC0026i.ordinal()) {
                    case 0:
                        Object obj11 = list6.get(1);
                        K1.e eVar3 = B.f413h;
                        if ((!z2.h.a(obj11, Boolean.FALSE) || (eVar3 instanceof A)) && obj11 != null) {
                            tVar = (t) ((y2.c) eVar3.f4537b).l(obj11);
                        }
                        z2.h.c(tVar);
                        return new C0022e(intValue, intValue2, tVar, str2);
                    case 1:
                        Object obj12 = list6.get(1);
                        K1.e eVar4 = B.f414i;
                        if ((!z2.h.a(obj12, Boolean.FALSE) || (eVar4 instanceof A)) && obj12 != null) {
                            c4 = (C) ((y2.c) eVar4.f4537b).l(obj12);
                        }
                        z2.h.c(c4);
                        return new C0022e(intValue, intValue2, c4, str2);
                    case 2:
                        Object obj13 = list6.get(1);
                        K1.e eVar5 = B.f409d;
                        if ((!z2.h.a(obj13, Boolean.FALSE) || (eVar5 instanceof A)) && obj13 != null) {
                            m3 = (M) ((y2.c) eVar5.f4537b).l(obj13);
                        }
                        z2.h.c(m3);
                        return new C0022e(intValue, intValue2, m3, str2);
                    case 3:
                        Object obj14 = list6.get(1);
                        K1.e eVar6 = B.f410e;
                        if ((!z2.h.a(obj14, Boolean.FALSE) || (eVar6 instanceof A)) && obj14 != null) {
                            l3 = (L) ((y2.c) eVar6.f4537b).l(obj14);
                        }
                        z2.h.c(l3);
                        return new C0022e(intValue, intValue2, l3, str2);
                    case 4:
                        Object obj15 = list6.get(1);
                        K1.e eVar7 = B.f411f;
                        if ((!z2.h.a(obj15, Boolean.FALSE) || (eVar7 instanceof A)) && obj15 != null) {
                            c0029l = (C0029l) ((y2.c) eVar7.f4537b).l(obj15);
                        }
                        z2.h.c(c0029l);
                        return new C0022e(intValue, intValue2, c0029l, str2);
                    case AbstractC1166e.f10138f /* 5 */:
                        Object obj16 = list6.get(1);
                        K1.e eVar8 = B.f412g;
                        if ((!z2.h.a(obj16, Boolean.FALSE) || (eVar8 instanceof A)) && obj16 != null) {
                            c0028k = (C0028k) ((y2.c) eVar8.f4537b).l(obj16);
                        }
                        z2.h.c(c0028k);
                        return new C0022e(intValue, intValue2, c0028k, str2);
                    case AbstractC1166e.f10136d /* 6 */:
                        Object obj17 = list6.get(1);
                        String str3 = obj17 != null ? (String) obj17 : null;
                        z2.h.c(str3);
                        return new C0022e(intValue, intValue2, str3, str2);
                    default:
                        throw new J2.r();
                }
            case 3:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return new N0.a(((Float) obj).floatValue());
            case 4:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list7 = (List) obj;
                Object obj18 = list7.get(0);
                String str4 = obj18 != null ? (String) obj18 : null;
                z2.h.c(str4);
                Object obj19 = list7.get(1);
                K1.e eVar9 = B.f415j;
                if ((!z2.h.a(obj19, Boolean.FALSE) || (eVar9 instanceof A)) && obj19 != null) {
                    i4 = (I) ((y2.c) eVar9.f4537b).l(obj19);
                }
                return new C0028k(str4, i4);
            case AbstractC1166e.f10138f /* 5 */:
                if (z2.h.a(obj, Boolean.FALSE)) {
                    return new C0603v(C0603v.f7277g);
                }
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C0603v(AbstractC0571K.c(((Integer) obj).intValue()));
            case AbstractC1166e.f10136d /* 6 */:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new H0.k(((Integer) obj).intValue());
            case 7:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj20 = list8.get(0);
                String str5 = obj20 != null ? (String) obj20 : null;
                z2.h.c(str5);
                Object obj21 = list8.get(1);
                K1.e eVar10 = B.f415j;
                if ((!z2.h.a(obj21, Boolean.FALSE) || (eVar10 instanceof A)) && obj21 != null) {
                    i3 = (I) ((y2.c) eVar10.f4537b).l(obj21);
                }
                return new C0029l(str5, i3);
            case 8:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i2 < size2) {
                    Object obj22 = list9.get(i2);
                    K1.e eVar11 = B.f426v;
                    J0.a aVar = ((!z2.h.a(obj22, Boolean.FALSE) || (eVar11 instanceof A)) && obj22 != null) ? (J0.a) ((y2.c) eVar11.f4537b).l(obj22) : null;
                    z2.h.c(aVar);
                    arrayList2.add(aVar);
                    i2++;
                }
                return new J0.b(arrayList2);
            case AbstractC1166e.f10135c /* 9 */:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj;
                J0.c.f4325a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str6);
                if (z2.h.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new J0.a(forLanguageTag);
            case AbstractC1166e.f10137e /* 10 */:
                if (z2.h.a(obj, Boolean.FALSE)) {
                    return new b0.c(9205357640488583168L);
                }
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj23 = list10.get(0);
                Float f3 = obj23 != null ? (Float) obj23 : null;
                z2.h.c(f3);
                float floatValue = f3.floatValue();
                Object obj24 = list10.get(1);
                Float f4 = obj24 != null ? (Float) obj24 : null;
                z2.h.c(f4);
                return new b0.c(K1.f.e(floatValue, f4.floatValue()));
            case 11:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj25 = list11.get(0);
                N0.i iVar = obj25 != null ? (N0.i) obj25 : null;
                z2.h.c(iVar);
                Object obj26 = list11.get(1);
                N0.k kVar = obj26 != null ? (N0.k) obj26 : null;
                z2.h.c(kVar);
                Object obj27 = list11.get(2);
                O0.n[] nVarArr = O0.m.f5152b;
                A a3 = B.f423s;
                Boolean bool2 = Boolean.FALSE;
                O0.m mVar2 = ((!z2.h.a(obj27, bool2) || (a3 instanceof A)) && obj27 != null) ? (O0.m) a3.f405b.l(obj27) : null;
                z2.h.c(mVar2);
                Object obj28 = list11.get(3);
                N0.o oVar2 = N0.o.f5002c;
                K1.e eVar12 = B.f418m;
                if ((!z2.h.a(obj28, bool2) || (eVar12 instanceof A)) && obj28 != null) {
                    oVar = (N0.o) ((y2.c) eVar12.f4537b).l(obj28);
                }
                return new t(iVar.f4992a, kVar.f4997a, mVar2.f5154a, oVar, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                Object obj29 = list12.get(0);
                int i5 = C0603v.f7278h;
                A a4 = B.f422r;
                Boolean bool3 = Boolean.FALSE;
                C0603v c0603v = ((!z2.h.a(obj29, bool3) || (a4 instanceof A)) && obj29 != null) ? (C0603v) a4.f405b.l(obj29) : null;
                z2.h.c(c0603v);
                Object obj30 = list12.get(1);
                A a5 = B.f424t;
                b0.c cVar = ((!z2.h.a(obj30, bool3) || (a5 instanceof A)) && obj30 != null) ? (b0.c) a5.f405b.l(obj30) : null;
                z2.h.c(cVar);
                Object obj31 = list12.get(2);
                Float f5 = obj31 != null ? (Float) obj31 : null;
                z2.h.c(f5);
                return new C0575O(c0603v.f7279a, cVar.f7058a, f5.floatValue());
            case 13:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list13 = (List) obj;
                Object obj32 = list13.get(0);
                int i6 = C0603v.f7278h;
                A a6 = B.f422r;
                Boolean bool4 = Boolean.FALSE;
                C0603v c0603v2 = ((!z2.h.a(obj32, bool4) || (a6 instanceof A)) && obj32 != null) ? (C0603v) a6.f405b.l(obj32) : null;
                z2.h.c(c0603v2);
                Object obj33 = list13.get(1);
                O0.n[] nVarArr2 = O0.m.f5152b;
                A a7 = B.f423s;
                O0.m mVar3 = ((!z2.h.a(obj33, bool4) || (a7 instanceof A)) && obj33 != null) ? (O0.m) a7.f405b.l(obj33) : null;
                z2.h.c(mVar3);
                Object obj34 = list13.get(2);
                H0.k kVar2 = H0.k.f3400i;
                K1.e eVar13 = B.f419n;
                H0.k kVar3 = ((!z2.h.a(obj34, bool4) || (eVar13 instanceof A)) && obj34 != null) ? (H0.k) ((y2.c) eVar13.f4537b).l(obj34) : null;
                Object obj35 = list13.get(3);
                H0.i iVar2 = obj35 != null ? (H0.i) obj35 : null;
                Object obj36 = list13.get(4);
                H0.j jVar = obj36 != null ? (H0.j) obj36 : null;
                Object obj37 = list13.get(6);
                String str7 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list13.get(7);
                O0.m mVar4 = ((!z2.h.a(obj38, bool4) || (a7 instanceof A)) && obj38 != null) ? (O0.m) a7.f405b.l(obj38) : null;
                z2.h.c(mVar4);
                Object obj39 = list13.get(8);
                K1.e eVar14 = B.f420o;
                N0.a aVar2 = ((!z2.h.a(obj39, bool4) || (eVar14 instanceof A)) && obj39 != null) ? (N0.a) ((y2.c) eVar14.f4537b).l(obj39) : null;
                Object obj40 = list13.get(9);
                K1.e eVar15 = B.f417l;
                N0.n nVar = ((!z2.h.a(obj40, bool4) || (eVar15 instanceof A)) && obj40 != null) ? (N0.n) ((y2.c) eVar15.f4537b).l(obj40) : null;
                Object obj41 = list13.get(10);
                J0.b bVar = J0.b.f4322j;
                K1.e eVar16 = B.f425u;
                J0.b bVar2 = ((!z2.h.a(obj41, bool4) || (eVar16 instanceof A)) && obj41 != null) ? (J0.b) ((y2.c) eVar16.f4537b).l(obj41) : null;
                Object obj42 = list13.get(11);
                C0603v c0603v3 = ((!z2.h.a(obj42, bool4) || (a6 instanceof A)) && obj42 != null) ? (C0603v) a6.f405b.l(obj42) : null;
                z2.h.c(c0603v3);
                Object obj43 = list13.get(12);
                K1.e eVar17 = B.f416k;
                N0.j jVar2 = ((!z2.h.a(obj43, bool4) || (eVar17 instanceof A)) && obj43 != null) ? (N0.j) ((y2.c) eVar17.f4537b).l(obj43) : null;
                Object obj44 = list13.get(13);
                C0575O c0575o2 = C0575O.f7219d;
                K1.e eVar18 = B.q;
                if ((!z2.h.a(obj44, bool4) || (eVar18 instanceof A)) && obj44 != null) {
                    c0575o = (C0575O) ((y2.c) eVar18.f4537b).l(obj44);
                }
                return new C(c0603v2.f7279a, mVar3.f5154a, kVar3, iVar2, jVar, null, str7, mVar4.f5154a, aVar2, nVar, bVar2, c0603v3.f7279a, jVar2, c0575o, 49184);
            case 14:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new N0.j(((Integer) obj).intValue());
            case AbstractC1166e.f10139g /* 15 */:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list14 = (List) obj;
                return new N0.n(((Number) list14.get(0)).floatValue(), ((Number) list14.get(1)).floatValue());
            case 16:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list15 = (List) obj;
                Object obj45 = list15.get(0);
                O0.n[] nVarArr3 = O0.m.f5152b;
                A a8 = B.f423s;
                Boolean bool5 = Boolean.FALSE;
                O0.m mVar5 = ((!z2.h.a(obj45, bool5) || (a8 instanceof A)) && obj45 != null) ? (O0.m) a8.f405b.l(obj45) : null;
                z2.h.c(mVar5);
                Object obj46 = list15.get(1);
                if ((!z2.h.a(obj46, bool5) || (a8 instanceof A)) && obj46 != null) {
                    mVar = (O0.m) a8.f405b.l(obj46);
                }
                z2.h.c(mVar);
                return new N0.o(mVar5.f5154a, mVar.f5154a);
            case 17:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj47 = list16.get(0);
                K1.e eVar19 = B.f414i;
                Boolean bool6 = Boolean.FALSE;
                C c5 = ((!z2.h.a(obj47, bool6) || (eVar19 instanceof A)) && obj47 != null) ? (C) ((y2.c) eVar19.f4537b).l(obj47) : null;
                Object obj48 = list16.get(1);
                C c6 = ((!z2.h.a(obj48, bool6) || (eVar19 instanceof A)) && obj48 != null) ? (C) ((y2.c) eVar19.f4537b).l(obj48) : null;
                Object obj49 = list16.get(2);
                C c7 = ((!z2.h.a(obj49, bool6) || (eVar19 instanceof A)) && obj49 != null) ? (C) ((y2.c) eVar19.f4537b).l(obj49) : null;
                Object obj50 = list16.get(3);
                if ((!z2.h.a(obj50, bool6) || (eVar19 instanceof A)) && obj50 != null) {
                    c3 = (C) ((y2.c) eVar19.f4537b).l(obj50);
                }
                return new I(c5, c6, c7, c3);
            case 18:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list17 = (List) obj;
                Object obj51 = list17.get(0);
                Integer num3 = obj51 != null ? (Integer) obj51 : null;
                z2.h.c(num3);
                int intValue3 = num3.intValue();
                Object obj52 = list17.get(1);
                Integer num4 = obj52 != null ? (Integer) obj52 : null;
                z2.h.c(num4);
                return new J(B1.C.j(intValue3, num4.intValue()));
            case 19:
                if (z2.h.a(obj, Boolean.FALSE)) {
                    return new O0.m(O0.m.f5153c);
                }
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj53 = list18.get(0);
                Float f6 = obj53 != null ? (Float) obj53 : null;
                z2.h.c(f6);
                float floatValue2 = f6.floatValue();
                Object obj54 = list18.get(1);
                O0.n nVar2 = obj54 != null ? (O0.n) obj54 : null;
                z2.h.c(nVar2);
                return new O0.m(B1.C.f0(floatValue2, nVar2.f5155a));
            case 20:
                String str8 = obj != null ? (String) obj : null;
                z2.h.c(str8);
                return new L(str8);
            default:
                String str9 = obj != null ? (String) obj : null;
                z2.h.c(str9);
                return new M(str9);
        }
    }
}
