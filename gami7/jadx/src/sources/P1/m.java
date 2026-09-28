package P1;

import B1.C;
import B1.t;
import C0.K;
import D.e0;
import H.AbstractC0107g0;
import H.AbstractC0223x4;
import H.C0093e0;
import H.D1;
import H.O5;
import H.P4;
import H.P5;
import H.R4;
import H.t5;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.V0;
import J.W0;
import J.X0;
import W1.C0392m;
import Y1.AbstractC0417c;
import Y1.C0421g;
import Y1.H;
import androidx.compose.foundation.layout.FillElement;
import c0.AbstractC0571K;
import c0.C0578S;
import c0.C0603v;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import java.util.List;
import m2.C0880v;
import n1.y;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1165d;
import s.C1170i;
import s.C1180t;
import s.InterfaceC1159L;
import s.Q;
import s.S;
import s.T;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class m implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5256h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5257i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5258j;

    public /* synthetic */ m(Object obj, int i2, Object obj2) {
        this.f5256h = i2;
        this.f5257i = obj;
        this.f5258j = obj2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        T t3 = T.f10079a;
        C0880v c0880v = C0880v.f8657a;
        V.l lVar = V.l.f5857b;
        Object obj4 = this.f5257i;
        Object obj5 = this.f5258j;
        switch (this.f5256h) {
            case 0:
                InterfaceC1159L interfaceC1159L = (InterfaceC1159L) obj;
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.h.f(interfaceC1159L, "innerPadding");
                if ((intValue & 14) == 0) {
                    intValue |= c0285q.g(interfaceC1159L) ? 4 : 2;
                }
                if ((intValue & 91) == 18 && c0285q.A()) {
                    c0285q.P();
                } else {
                    AbstractC0223x4.a(androidx.compose.foundation.layout.a.h(lVar, interfaceC1159L), null, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2496n, 0L, 0.0f, 0.0f, null, R.b.c(1699925148, new l((y) obj4, 0, (H) obj5), c0285q), c0285q, 12582912, 122);
                }
                return c0880v;
            case 1:
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                z2.h.f((androidx.compose.foundation.lazy.a) obj, "$this$item");
                if ((intValue2 & 81) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.b(lVar, 24));
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
                    S a3 = Q.a(AbstractC1173l.f10155g, V.b.f5840r, c0285q2, 54);
                    int i2 = c0285q2.f4194P;
                    InterfaceC0282o0 n3 = c0285q2.n();
                    V.o d3 = V.a.d(c0285q2, fillElement);
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i = C1252j.f10598b;
                    boolean z3 = c0285q2.f4195a instanceof InterfaceC0259d;
                    if (!z3) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i);
                    } else {
                        c0285q2.h0();
                    }
                    C1250h c1250h = C1252j.f10602f;
                    C0257c.V(c0285q2, a3, c1250h);
                    C1250h c1250h2 = C1252j.f10601e;
                    C0257c.V(c0285q2, n3, c1250h2);
                    C1250h c1250h3 = C1252j.f10603g;
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i2))) {
                        t.q(i2, c0285q2, i2, c1250h3);
                    }
                    C1250h c1250h4 = C1252j.f10600d;
                    C0257c.V(c0285q2, d3, c1250h4);
                    C1180t a4 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q2, 0);
                    int i3 = c0285q2.f4194P;
                    InterfaceC0282o0 n4 = c0285q2.n();
                    V.o d4 = V.a.d(c0285q2, lVar);
                    if (!z3) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i);
                    } else {
                        c0285q2.h0();
                    }
                    C0257c.V(c0285q2, a4, c1250h);
                    C0257c.V(c0285q2, n4, c1250h2);
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i3))) {
                        t.q(i3, c0285q2, i3, c1250h3);
                    }
                    C0257c.V(c0285q2, d4, c1250h4);
                    X0 x02 = P5.f1917a;
                    K k3 = ((O5) c0285q2.l(x02)).f1858e;
                    H0.k kVar = H0.k.f3404m;
                    X0 x03 = AbstractC0107g0.f2597a;
                    t5.b("Dashboard", null, ((C0093e0) c0285q2.l(x03)).q, 0L, null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, k3, c0285q2, 196614, 0, 65498);
                    String str = (String) obj5;
                    z2.h.c(str);
                    t5.b(str, null, ((C0093e0) c0285q2.l(x03)).f2500s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q2.l(x02)).f1864k, c0285q2, 0, 0, 65530);
                    c0285q2.r(true);
                    D1.e(new C0421g((y) obj4, 0), androidx.compose.foundation.a.b(C.v(lVar, y.e.f11486a), C0603v.b(0.5f, ((C0093e0) c0285q2.l(x03)).f2498p), AbstractC0571K.f7193a), false, null, null, AbstractC0417c.f6281a, c0285q2, 196608, 28);
                    c0285q2.r(true);
                }
                return c0880v;
            case 2:
                C0285q c0285q3 = (C0285q) obj2;
                int intValue3 = ((Number) obj3).intValue();
                z2.h.f((androidx.compose.foundation.lazy.a) obj, "$this$item");
                if ((intValue3 & 81) == 16 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    l0.c.g("Performance Stats", null, c0285q3, 6, 2);
                    FillElement fillElement2 = androidx.compose.foundation.layout.c.f6639a;
                    C1165d c1165d = AbstractC1173l.f10149a;
                    S a5 = Q.a(new C1170i(16), V.b.q, c0285q3, 6);
                    int i4 = c0285q3.f4194P;
                    InterfaceC0282o0 n5 = c0285q3.n();
                    V.o d5 = V.a.d(c0285q3, fillElement2);
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i2 = C1252j.f10598b;
                    if (!(c0285q3.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q3.Y();
                    if (c0285q3.f4193O) {
                        c0285q3.m(c1251i2);
                    } else {
                        c0285q3.h0();
                    }
                    C0257c.V(c0285q3, a5, C1252j.f10602f);
                    C0257c.V(c0285q3, n5, C1252j.f10601e);
                    C1250h c1250h5 = C1252j.f10603g;
                    if (c0285q3.f4193O || !z2.h.a(c0285q3.K(), Integer.valueOf(i4))) {
                        t.q(i4, c0285q3, i4, c1250h5);
                    }
                    C0257c.V(c0285q3, d5, C1252j.f10600d);
                    String valueOf = String.valueOf(((Number) ((W0) obj4).getValue()).intValue());
                    C0712e y3 = K1.f.y();
                    V.o a6 = T.a(t3, lVar);
                    X0 x04 = AbstractC0107g0.f2597a;
                    l0.c.h("Clients", valueOf, y3, a6, C0603v.b(0.7f, ((C0093e0) c0285q3.l(x04)).f2498p), 0L, c0285q3, 6, 32);
                    String valueOf2 = String.valueOf(((Y1.o) ((W0) obj5).getValue()).f6339d);
                    C0712e c0712e = C1.y.f702d;
                    if (c0712e == null) {
                        C0711d c0711d = new C0711d("Filled.Notifications", false);
                        int i5 = AbstractC0732y.f7958a;
                        C0578S c0578s = new C0578S(C0603v.f7272b);
                        V0 v0 = new V0(1);
                        v0.h(12.0f, 22.0f);
                        v0.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        v0.e(-4.0f);
                        v0.c(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        v0.a();
                        v0.h(18.0f, 16.0f);
                        v0.l(-5.0f);
                        v0.c(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
                        v0.f(13.5f, 4.0f);
                        v0.c(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                        v0.j(-1.5f, 0.67f, -1.5f, 1.5f);
                        v0.l(0.68f);
                        v0.b(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
                        v0.l(5.0f);
                        v0.g(-2.0f, 2.0f);
                        v0.l(1.0f);
                        v0.e(16.0f);
                        v0.l(-1.0f);
                        v0.g(-2.0f, -2.0f);
                        v0.a();
                        C0711d.a(c0711d, v0.f4104h, c0578s);
                        c0712e = c0711d.b();
                        C1.y.f702d = c0712e;
                    }
                    l0.c.h("Pending (This Week)", valueOf2, c0712e, T.a(t3, lVar), C0603v.b(0.7f, ((C0093e0) c0285q3.l(x04)).f2498p), ((C0093e0) c0285q3.l(x04)).f2488f, c0285q3, 6, 0);
                    c0285q3.r(true);
                }
                return c0880v;
            case 3:
                C0285q c0285q4 = (C0285q) obj2;
                int intValue4 = ((Number) obj3).intValue();
                z2.h.f((androidx.compose.foundation.lazy.a) obj, "$this$item");
                if ((intValue4 & 81) == 16 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    FillElement fillElement3 = androidx.compose.foundation.layout.c.f6639a;
                    C1165d c1165d2 = AbstractC1173l.f10149a;
                    S a7 = Q.a(new C1170i(16), V.b.q, c0285q4, 6);
                    int i6 = c0285q4.f4194P;
                    InterfaceC0282o0 n6 = c0285q4.n();
                    V.o d6 = V.a.d(c0285q4, fillElement3);
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i3 = C1252j.f10598b;
                    if (!(c0285q4.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q4.Y();
                    if (c0285q4.f4193O) {
                        c0285q4.m(c1251i3);
                    } else {
                        c0285q4.h0();
                    }
                    C0257c.V(c0285q4, a7, C1252j.f10602f);
                    C0257c.V(c0285q4, n6, C1252j.f10601e);
                    C1250h c1250h6 = C1252j.f10603g;
                    if (c0285q4.f4193O || !z2.h.a(c0285q4.K(), Integer.valueOf(i6))) {
                        t.q(i6, c0285q4, i6, c1250h6);
                    }
                    C0257c.V(c0285q4, d6, C1252j.f10600d);
                    W0 w02 = (W0) obj4;
                    String valueOf3 = String.valueOf(((Y1.o) w02.getValue()).f6337b);
                    C0712e z4 = l0.c.z();
                    V.o a8 = T.a(t3, lVar);
                    X0 x05 = AbstractC0107g0.f2597a;
                    l0.c.h("Sent", valueOf3, z4, a8, C0603v.b(0.7f, ((C0093e0) c0285q4.l(x05)).f2498p), AbstractC0571K.d(4279213400L), c0285q4, 196614, 0);
                    String valueOf4 = String.valueOf(((Y1.o) w02.getValue()).f6338c);
                    C0712e B3 = C1.y.B();
                    V.o a9 = T.a(t3, lVar);
                    boolean z5 = ((Y1.o) w02.getValue()).f6338c > 0;
                    c0285q4.U(-108085246);
                    Object K3 = c0285q4.K();
                    if (K3 == C0275l.f4150a) {
                        K3 = new C0392m((InterfaceC0258c0) obj5, 10);
                        c0285q4.e0(K3);
                    }
                    c0285q4.r(false);
                    l0.c.h("Failed", valueOf4, B3, androidx.compose.foundation.a.e(a9, z5, null, (y2.a) K3, 6), C0603v.b(0.7f, ((C0093e0) c0285q4.l(x05)).f2498p), ((C0093e0) c0285q4.l(x05)).f2504w, c0285q4, 6, 0);
                    c0285q4.r(true);
                }
                return c0880v;
            default:
                List list = (List) obj;
                C0285q c0285q5 = (C0285q) obj2;
                ((Number) obj3).intValue();
                z2.h.f(list, "tabPositions");
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) obj5;
                String str2 = (String) interfaceC0258c0.getValue();
                List list2 = (List) obj4;
                z2.h.f(list2, "<this>");
                if (list2.indexOf(str2) != -1) {
                    R4.f1956a.a(V.a.b(lVar, new e0(3, (P4) list.get(list2.indexOf((String) interfaceC0258c0.getValue())))), 0.0f, ((C0093e0) c0285q5.l(AbstractC0107g0.f2597a)).f2483a, c0285q5, 0, 2);
                }
                return c0880v;
        }
    }

    public m(String str, y yVar) {
        this.f5256h = 1;
        this.f5258j = str;
        this.f5257i = yVar;
    }
}
