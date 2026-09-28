package C0;

import c0.AbstractC0571K;
import c0.C0575O;
import c0.C0603v;
import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0963o;
import n2.C0970v;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class y extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f580i;

    /* renamed from: j, reason: collision with root package name */
    public static final y f564j = new y(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final y f565k = new y(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final y f566l = new y(2, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final y f567m = new y(2, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final y f568n = new y(2, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final y f569o = new y(2, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final y f570p = new y(2, 6);
    public static final y q = new y(2, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final y f571r = new y(2, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final y f572s = new y(2, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final y f573t = new y(2, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final y f574u = new y(2, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final y f575v = new y(2, 12);

    /* renamed from: w, reason: collision with root package name */
    public static final y f576w = new y(2, 13);

    /* renamed from: x, reason: collision with root package name */
    public static final y f577x = new y(2, 14);

    /* renamed from: y, reason: collision with root package name */
    public static final y f578y = new y(2, 15);

    /* renamed from: z, reason: collision with root package name */
    public static final y f579z = new y(2, 16);

    /* renamed from: A, reason: collision with root package name */
    public static final y f560A = new y(2, 17);

    /* renamed from: B, reason: collision with root package name */
    public static final y f561B = new y(2, 18);

    /* renamed from: C, reason: collision with root package name */
    public static final y f562C = new y(2, 19);

    /* renamed from: D, reason: collision with root package name */
    public static final y f563D = new y(2, 20);
    public static final y E = new y(2, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, int i3) {
        super(i2);
        this.f580i = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = 0;
        switch (this.f580i) {
            case 0:
                S.b bVar = (S.b) obj;
                C0024g c0024g = (C0024g) obj2;
                String str = c0024g.f500a;
                K1.e eVar = B.f406a;
                List a3 = c0024g.a();
                K1.e eVar2 = B.f407b;
                Object a4 = B.a(a3, eVar2, bVar);
                Object obj3 = c0024g.f502c;
                if (obj3 == null) {
                    obj3 = C0970v.f9165h;
                }
                return AbstractC0963o.t(str, a4, B.a(obj3, eVar2, bVar), B.a(c0024g.f503d, eVar2, bVar));
            case 1:
                S.b bVar2 = (S.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i2 < size) {
                    arrayList.add(B.a((C0022e) list.get(i2), B.f408c, bVar2));
                    i2++;
                }
                return arrayList;
            case 2:
                S.b bVar3 = (S.b) obj;
                C0022e c0022e = (C0022e) obj2;
                Object obj4 = c0022e.f496a;
                EnumC0026i enumC0026i = obj4 instanceof t ? EnumC0026i.f505h : obj4 instanceof C ? EnumC0026i.f506i : obj4 instanceof M ? EnumC0026i.f507j : obj4 instanceof L ? EnumC0026i.f508k : obj4 instanceof C0029l ? EnumC0026i.f509l : obj4 instanceof C0028k ? EnumC0026i.f510m : EnumC0026i.f511n;
                int ordinal = enumC0026i.ordinal();
                Object obj5 = c0022e.f496a;
                switch (ordinal) {
                    case 0:
                        z2.h.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        obj5 = B.a((t) obj5, B.f413h, bVar3);
                        break;
                    case 1:
                        z2.h.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        obj5 = B.a((C) obj5, B.f414i, bVar3);
                        break;
                    case 2:
                        z2.h.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        obj5 = B.a((M) obj5, B.f409d, bVar3);
                        break;
                    case 3:
                        z2.h.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        obj5 = B.a((L) obj5, B.f410e, bVar3);
                        break;
                    case 4:
                        z2.h.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        obj5 = B.a((C0029l) obj5, B.f411f, bVar3);
                        break;
                    case AbstractC1166e.f10138f /* 5 */:
                        z2.h.d(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        obj5 = B.a((C0028k) obj5, B.f412g, bVar3);
                        break;
                    case AbstractC1166e.f10136d /* 6 */:
                        K1.e eVar3 = B.f406a;
                        break;
                    default:
                        throw new J2.r();
                }
                return AbstractC0963o.t(enumC0026i, obj5, Integer.valueOf(c0022e.f497b), Integer.valueOf(c0022e.f498c), c0022e.f499d);
            case 3:
                return Float.valueOf(((N0.a) obj2).f4976a);
            case 4:
                C0028k c0028k = (C0028k) obj2;
                return AbstractC0963o.t(c0028k.f514a, B.a(c0028k.f515b, B.f415j, (S.b) obj));
            case AbstractC1166e.f10138f /* 5 */:
                long j3 = ((C0603v) obj2).f7279a;
                return j3 == 16 ? Boolean.FALSE : Integer.valueOf(AbstractC0571K.A(j3));
            case AbstractC1166e.f10136d /* 6 */:
                return Integer.valueOf(((H0.k) obj2).f3405h);
            case 7:
                C0029l c0029l = (C0029l) obj2;
                return AbstractC0963o.t(c0029l.f516a, B.a(c0029l.f517b, B.f415j, (S.b) obj));
            case 8:
                S.b bVar4 = (S.b) obj;
                List list2 = ((J0.b) obj2).f4323h;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i2 < size2) {
                    arrayList2.add(B.a((J0.a) list2.get(i2), B.f426v, bVar4));
                    i2++;
                }
                return arrayList2;
            case AbstractC1166e.f10135c /* 9 */:
                return ((J0.a) obj2).f4321a.toLanguageTag();
            case AbstractC1166e.f10137e /* 10 */:
                long j4 = ((b0.c) obj2).f7058a;
                if (b0.c.b(j4, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(b0.c.d(j4));
                K1.e eVar4 = B.f406a;
                return AbstractC0963o.t(valueOf, Float.valueOf(b0.c.e(j4)));
            case 11:
                S.b bVar5 = (S.b) obj;
                t tVar = (t) obj2;
                N0.i iVar = new N0.i(tVar.f543a);
                K1.e eVar5 = B.f406a;
                N0.k kVar = new N0.k(tVar.f544b);
                Object a5 = B.a(new O0.m(tVar.f545c), B.f423s, bVar5);
                N0.o oVar = N0.o.f5002c;
                return AbstractC0963o.t(iVar, kVar, a5, B.a(tVar.f546d, B.f418m, bVar5));
            case 12:
                S.b bVar6 = (S.b) obj;
                C0575O c0575o = (C0575O) obj2;
                return AbstractC0963o.t(B.a(new C0603v(c0575o.f7220a), B.f422r, bVar6), B.a(new b0.c(c0575o.f7221b), B.f424t, bVar6), Float.valueOf(c0575o.f7222c));
            case 13:
                S.b bVar7 = (S.b) obj;
                C c3 = (C) obj2;
                C0603v c0603v = new C0603v(c3.f427a.b());
                A a6 = B.f422r;
                Object a7 = B.a(c0603v, a6, bVar7);
                O0.m mVar = new O0.m(c3.f428b);
                A a8 = B.f423s;
                Object a9 = B.a(mVar, a8, bVar7);
                H0.k kVar2 = H0.k.f3400i;
                Object a10 = B.a(c3.f429c, B.f419n, bVar7);
                Object a11 = B.a(new O0.m(c3.f434h), a8, bVar7);
                Object a12 = B.a(c3.f435i, B.f420o, bVar7);
                Object a13 = B.a(c3.f436j, B.f417l, bVar7);
                J0.b bVar8 = J0.b.f4322j;
                Object a14 = B.a(c3.f437k, B.f425u, bVar7);
                Object a15 = B.a(new C0603v(c3.f438l), a6, bVar7);
                Object a16 = B.a(c3.f439m, B.f416k, bVar7);
                C0575O c0575o2 = C0575O.f7219d;
                return AbstractC0963o.t(a7, a9, a10, c3.f430d, c3.f431e, -1, c3.f433g, a11, a12, a13, a14, a15, a16, B.a(c3.f440n, B.q, bVar7));
            case 14:
                return Integer.valueOf(((N0.j) obj2).f4996a);
            case AbstractC1166e.f10139g /* 15 */:
                N0.n nVar = (N0.n) obj2;
                return AbstractC0963o.t(Float.valueOf(nVar.f5000a), Float.valueOf(nVar.f5001b));
            case 16:
                S.b bVar9 = (S.b) obj;
                N0.o oVar2 = (N0.o) obj2;
                O0.m mVar2 = new O0.m(oVar2.f5003a);
                A a17 = B.f423s;
                return AbstractC0963o.t(B.a(mVar2, a17, bVar9), B.a(new O0.m(oVar2.f5004b), a17, bVar9));
            case 17:
                S.b bVar10 = (S.b) obj;
                I i3 = (I) obj2;
                C c4 = i3.f467a;
                K1.e eVar6 = B.f414i;
                return AbstractC0963o.t(B.a(c4, eVar6, bVar10), B.a(i3.f468b, eVar6, bVar10), B.a(i3.f469c, eVar6, bVar10), B.a(i3.f470d, eVar6, bVar10));
            case 18:
                long j5 = ((J) obj2).f473a;
                int i4 = J.f472c;
                Integer valueOf2 = Integer.valueOf((int) (j5 >> 32));
                K1.e eVar7 = B.f406a;
                return AbstractC0963o.t(valueOf2, Integer.valueOf((int) (j5 & 4294967295L)));
            case 19:
                long j6 = ((O0.m) obj2).f5154a;
                if (O0.m.a(j6, O0.m.f5153c)) {
                    return Boolean.FALSE;
                }
                Float valueOf3 = Float.valueOf(O0.m.c(j6));
                K1.e eVar8 = B.f406a;
                return AbstractC0963o.t(valueOf3, new O0.n(O0.m.b(j6)));
            case 20:
                String str2 = ((L) obj2).f478a;
                K1.e eVar9 = B.f406a;
                return str2;
            default:
                String str3 = ((M) obj2).f479a;
                K1.e eVar10 = B.f406a;
                return str3;
        }
    }
}
