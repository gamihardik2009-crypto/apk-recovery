package H;

import D.C0053w;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import androidx.compose.foundation.layout.FillElement;
import com.example.bulksmsscheduler.R;
import g2.C0691b;
import java.util.List;
import k2.C0785a;
import l.C0801j;
import m2.C0880v;
import n0.C0919B;
import n1.C0945f;
import n2.AbstractC0948C;
import n2.AbstractC0962n;
import o0.C0992b;
import p.C1042t;
import p.InterfaceC1012d0;
import r0.AbstractC1108W;
import r0.C1133v;
import r0.InterfaceC1095I;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.C1165d;
import s.C1168g;
import s.C1170i;
import s.InterfaceC1159L;
import s0.C1194h;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import v.C1329A;
import v.C1346S;
import v.C1368v;
import x.C1388a;

/* renamed from: H.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148m extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2877i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2878j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2879k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0148m(Object obj, int i2, Object obj2) {
        super(2);
        this.f2877i = i2;
        this.f2878j = obj;
        this.f2879k = obj2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        s.T t3 = s.T.f10079a;
        J.W w2 = C0275l.f4150a;
        V.l lVar = V.l.f5857b;
        int i2 = 0;
        C0880v c0880v = C0880v.f8657a;
        int i3 = 2;
        Object obj3 = this.f2879k;
        Object obj4 = this.f2878j;
        switch (this.f2877i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    String w3 = D1.w(R.string.m3c_dialog, c0285q);
                    V.o m3 = androidx.compose.foundation.layout.c.m((V.o) obj4, AbstractC0127j.f2747a, AbstractC0127j.f2748b, 10);
                    c0285q.V(-874813489);
                    boolean g3 = c0285q.g(w3);
                    Object K3 = c0285q.K();
                    Object obj5 = K3;
                    if (g3 || K3 == w2) {
                        A0.o oVar = new A0.o(w3, true ? 1 : 0);
                        c0285q.e0(oVar);
                        obj5 = oVar;
                    }
                    c0285q.r(false);
                    V.o k3 = m3.k(A0.m.b(lVar, false, (y2.c) obj5));
                    c0285q.V(733328855);
                    s.r f3 = AbstractC1177p.f(V.b.f5831h, true, c0285q, 48);
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
                    C0257c.V(c0285q, f3, C1252j.f10602f);
                    C0257c.V(c0285q, n3, C1252j.f10601e);
                    C1250h c1250h = C1252j.f10603g;
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                        B1.t.q(i4, c0285q, i4, c1250h);
                    }
                    B1.t.r(0, i5, new J.C0(c0285q), c0285q, 2058660585);
                    ((y2.e) obj3).j(c0285q, 0);
                    c0285q.r(false);
                    c0285q.r(true);
                    c0285q.r(false);
                    c0285q.r(false);
                }
                return c0880v;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.o h2 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.a(lVar, A.f1276c, A.f1277d), (InterfaceC1159L) obj4);
                    C1168g c1168g = AbstractC1173l.f10153e;
                    V.f fVar = V.b.f5840r;
                    c0285q2.V(693286680);
                    s.S a3 = s.Q.a(c1168g, fVar, c0285q2, 54);
                    c0285q2.V(-1323940314);
                    int i6 = c0285q2.f4194P;
                    InterfaceC0282o0 n4 = c0285q2.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i2 = C1252j.f10598b;
                    R.a i7 = AbstractC1108W.i(h2);
                    if (!(c0285q2.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i2);
                    } else {
                        c0285q2.h0();
                    }
                    C0257c.V(c0285q2, a3, C1252j.f10602f);
                    C0257c.V(c0285q2, n4, C1252j.f10601e);
                    C1250h c1250h2 = C1252j.f10603g;
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i6))) {
                        B1.t.q(i6, c0285q2, i6, c1250h2);
                    }
                    B1.t.r(0, i7, new J.C0(c0285q2), c0285q2, 2058660585);
                    ((y2.f) obj3).i(t3, c0285q2, 6);
                    B1.t.u(c0285q2, false, true, false, false);
                }
                return c0880v;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    c0285q3.V(-694340528);
                    String str = (String) obj4;
                    String str2 = (String) obj3;
                    boolean g4 = c0285q3.g(str) | c0285q3.g(str2);
                    Object K4 = c0285q3.K();
                    if (g4 || K4 == w2) {
                        K4 = new C0053w(str, i3, str2);
                        c0285q3.e0(K4);
                    }
                    c0285q3.r(false);
                    t5.b((String) obj4, A0.m.b(lVar, false, (y2.c) K4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 0, 0, 131068);
                }
                return c0880v;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    B1 b12 = (B1) obj4;
                    E0.f1423a.a(b12.b(), b12.a(), (J0) obj3, androidx.compose.foundation.layout.a.h(lVar, A1.f1292f), c0285q4, 27648, 0);
                }
                return c0880v;
            case 4:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    t5.a(((O5) obj4).f1863j, (y2.e) obj3, c0285q5, 0);
                }
                return c0880v;
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q6 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q6.A()) {
                    c0285q6.P();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
                    C1194h c1194h = s.b0.f10122a;
                    V.o b3 = A0.m.b(androidx.compose.foundation.layout.c.a(V.a.b(fillElement, new D.e0(8, (s.Y) obj4)), Float.NaN, H2.f1563a), false, C1388a.f11466i);
                    C1165d c1165d = AbstractC1173l.f10149a;
                    C1170i c1170i = new C1170i(H2.f1564b);
                    V.f fVar2 = V.b.f5840r;
                    c0285q6.V(693286680);
                    s.S a4 = s.Q.a(c1170i, fVar2, c0285q6, 54);
                    c0285q6.V(-1323940314);
                    int i8 = c0285q6.f4194P;
                    InterfaceC0282o0 n5 = c0285q6.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i3 = C1252j.f10598b;
                    R.a i9 = AbstractC1108W.i(b3);
                    if (!(c0285q6.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q6.Y();
                    if (c0285q6.f4193O) {
                        c0285q6.m(c1251i3);
                    } else {
                        c0285q6.h0();
                    }
                    C0257c.V(c0285q6, a4, C1252j.f10602f);
                    C0257c.V(c0285q6, n5, C1252j.f10601e);
                    C1250h c1250h3 = C1252j.f10603g;
                    if (c0285q6.f4193O || !z2.h.a(c0285q6.K(), Integer.valueOf(i8))) {
                        B1.t.q(i8, c0285q6, i8, c1250h3);
                    }
                    B1.t.r(0, i9, new J.C0(c0285q6), c0285q6, 2058660585);
                    ((y2.f) obj3).i(t3, c0285q6, 6);
                    B1.t.u(c0285q6, false, true, false, false);
                }
                return c0880v;
            case AbstractC1166e.f10136d /* 6 */:
                C0285q c0285q7 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q7.A()) {
                    c0285q7.P();
                } else {
                    V.o c3 = androidx.compose.ui.layout.a.c(lVar, "indicator");
                    c0285q7.V(1844203561);
                    J.W0 w02 = (J.W0) obj4;
                    boolean g5 = c0285q7.g(w02);
                    Object K5 = c0285q7.K();
                    Object obj6 = K5;
                    if (g5 || K5 == w2) {
                        C0227y2 c0227y2 = new C0227y2(w02, i2);
                        c0285q7.e0(c0227y2);
                        obj6 = c0227y2;
                    }
                    c0285q7.r(false);
                    V.o a5 = androidx.compose.ui.graphics.a.a(c3, (y2.c) obj6);
                    long j3 = ((C0215w2) obj3).f3250c;
                    float f4 = I.r.f3744a;
                    AbstractC1177p.a(androidx.compose.foundation.a.b(a5, j3, AbstractC0204u3.a(5, c0285q7)), c0285q7, 0);
                }
                return c0880v;
            case 7:
                C0285q c0285q8 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q8.A()) {
                    c0285q8.P();
                } else {
                    W3 w32 = (W3) obj3;
                    z2.h.c(w32);
                    ((y2.f) obj4).i(w32, c0285q8, 0);
                }
                return c0880v;
            case 8:
                C0285q c0285q9 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q9.A()) {
                    c0285q9.P();
                } else {
                    ((y2.f) obj4).i((List) obj3, c0285q9, 0);
                }
                return c0880v;
            case AbstractC1166e.f10135c /* 9 */:
                C0285q c0285q10 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q10.A()) {
                    c0285q10.P();
                } else {
                    K2.f1666a.a(true, false, (r.l) obj4, (Z4) obj3, AbstractC0204u3.a(I.A.f3450g, c0285q10), 0.0f, 0.0f, c0285q10, 12583350, 96);
                }
                return c0880v;
            case AbstractC1166e.f10137e /* 10 */:
                C0285q c0285q11 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q11.A()) {
                    c0285q11.P();
                } else {
                    V.o b4 = A0.m.b(lVar, false, R0.c.f5392m);
                    R0.x xVar = (R0.x) obj4;
                    boolean i10 = c0285q11.i(xVar);
                    Object K6 = c0285q11.K();
                    Object obj7 = K6;
                    if (i10 || K6 == w2) {
                        R0.j jVar = new R0.j(xVar, true ? 1 : 0);
                        c0285q11.e0(jVar);
                        obj7 = jVar;
                    }
                    V.o m4 = l0.c.m(androidx.compose.ui.layout.a.e(b4, (y2.c) obj7), xVar.getCanCalculatePosition() ? 1.0f : 0.0f);
                    R.a c4 = R.b.c(606497925, new R0.d((J.W0) obj3, i3), c0285q11);
                    R0.f fVar3 = R0.f.f5403c;
                    int i11 = c0285q11.f4194P;
                    InterfaceC0282o0 n6 = c0285q11.n();
                    V.o d3 = V.a.d(c0285q11, m4);
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i4 = C1252j.f10598b;
                    if (!(c0285q11.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q11.Y();
                    if (c0285q11.f4193O) {
                        c0285q11.m(c1251i4);
                    } else {
                        c0285q11.h0();
                    }
                    C0257c.V(c0285q11, fVar3, C1252j.f10602f);
                    C0257c.V(c0285q11, n6, C1252j.f10601e);
                    C1250h c1250h4 = C1252j.f10603g;
                    if (c0285q11.f4193O || !z2.h.a(c0285q11.K(), Integer.valueOf(i11))) {
                        B1.t.q(i11, c0285q11, i11, c1250h4);
                    }
                    C0257c.V(c0285q11, d3, C1252j.f10600d);
                    c4.j(c0285q11, 6);
                    c0285q11.r(true);
                }
                return c0880v;
            case 11:
                int intValue = ((Number) obj).intValue();
                List list = (List) obj2;
                z2.h.f(list, "row");
                z2.s sVar = (z2.s) obj4;
                if (sVar.f11909h == null) {
                    sVar.f11909h = Integer.valueOf(list.size());
                }
                Integer num = (Integer) sVar.f11909h;
                int intValue2 = num != null ? num.intValue() : list.size();
                C0691b c0691b = (C0691b) obj3;
                if (list.size() > intValue2) {
                    c0691b.f7771a.getClass();
                    C1.b bVar = c0691b.f7771a;
                    bVar.getClass();
                    bVar.getClass();
                    throw new C0785a(intValue2, list.size(), intValue + 1);
                }
                if (intValue2 == list.size()) {
                    return list;
                }
                c0691b.f7771a.getClass();
                C1.b bVar2 = c0691b.f7771a;
                bVar2.getClass();
                bVar2.getClass();
                throw new C0785a(intValue2, list.size(), intValue + 1);
            case 12:
                C0285q c0285q12 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q12.A()) {
                    c0285q12.P();
                } else {
                    ((o1.n) obj4).f9260r.i((C0945f) obj3, c0285q12, 0);
                }
                return c0880v;
            case 13:
                C0285q c0285q13 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q13.A()) {
                    c0285q13.P();
                } else {
                    AbstractC0948C.c((S.c) obj4, (y2.e) obj3, c0285q13, 0);
                }
                return c0880v;
            case 14:
                C0285q c0285q14 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q14.A()) {
                    c0285q14.P();
                } else {
                    C0945f c0945f = (C0945f) obj4;
                    n1.s sVar2 = c0945f.f9028i;
                    z2.h.d(sVar2, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((o1.h) sVar2).q.g((C0801j) obj3, c0945f, c0285q14, 0);
                }
                return c0880v;
            case AbstractC1166e.f10139g /* 15 */:
                long j4 = ((b0.c) obj2).f7058a;
                AbstractC0962n.d((C0992b) obj4, (n0.r) obj);
                L2.k kVar = ((p.M) obj3).f9464A;
                if (kVar != null) {
                    kVar.q(new C1042t(j4));
                }
                return c0880v;
            case 16:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                z2.p pVar = (z2.p) obj4;
                float f5 = pVar.f11906h;
                pVar.f11906h = ((InterfaceC1012d0) obj3).a(floatValue - f5) + f5;
                return c0880v;
            case 17:
                C0285q c0285q15 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q15.A()) {
                    c0285q15.P();
                } else {
                    Boolean bool = (Boolean) ((C1133v) obj4).f9894f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    c0285q15.X(bool);
                    boolean h3 = c0285q15.h(booleanValue);
                    c0285q15.U(-869707859);
                    if (booleanValue) {
                        ((y2.e) obj3).j(c0285q15, 0);
                    } else {
                        c0285q15.o(h3);
                    }
                    c0285q15.r(false);
                    c0285q15.u();
                }
                return c0880v;
            case 18:
                C0285q c0285q16 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q16.A()) {
                    c0285q16.P();
                } else {
                    v.w wVar = (v.w) obj4;
                    v.x xVar2 = (v.x) wVar.f11397b.c();
                    C1368v c1368v = (C1368v) obj3;
                    int i12 = c1368v.f11393c;
                    int a6 = xVar2.a();
                    Object obj8 = c1368v.f11391a;
                    if ((i12 >= a6 || !z2.h.a(xVar2.b(i12), obj8)) && (i12 = xVar2.c(obj8)) != -1) {
                        c1368v.f11393c = i12;
                    }
                    int i13 = i12;
                    boolean z3 = i13 != -1;
                    c0285q16.X(Boolean.valueOf(z3));
                    boolean h4 = c0285q16.h(z3);
                    c0285q16.U(-869707859);
                    if (z3) {
                        c0285q16.U(-2120167269);
                        AbstractC0962n.a(xVar2, wVar.f11396a, i13, c1368v.f11391a, c0285q16, 0);
                        c0285q16.r(false);
                    } else {
                        c0285q16.o(h4);
                    }
                    c0285q16.r(false);
                    c0285q16.u();
                    boolean i14 = c0285q16.i(c1368v);
                    Object K7 = c0285q16.K();
                    Object obj9 = K7;
                    if (i14 || K7 == w2) {
                        C0919B c0919b = new C0919B(18, c1368v);
                        c0285q16.e0(c0919b);
                        obj9 = c0919b;
                    }
                    C0257c.d(obj8, (y2.c) obj9, c0285q16);
                }
                return c0880v;
            case 19:
                return (InterfaceC1095I) ((y2.e) obj3).j(new C1329A((v.w) obj4, (r0.a0) obj), new O0.a(((O0.a) obj2).f5132a));
            default:
                C0285q c0285q17 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q17.A()) {
                    c0285q17.P();
                } else {
                    C1346S c1346s = (C1346S) obj4;
                    c1346s.f11312b.setValue(l0.c.L(c0285q17));
                    ((y2.f) obj3).i(c1346s, c0285q17, 0);
                }
                return c0880v;
        }
    }
}
