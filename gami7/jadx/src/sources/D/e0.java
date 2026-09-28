package D;

import H.AbstractC0067a2;
import H.C0200u;
import H.P4;
import H.t5;
import J.C0;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.W0;
import l.C0811u;
import m.AbstractC0831e;
import m.AbstractC0835h;
import m.AbstractC0852z;
import m.C0843p;
import m.C0848v;
import m2.C0880v;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.AbstractC1108W;
import r0.InterfaceC1093G;
import r0.InterfaceC1096J;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.C1150C;
import s.C1182v;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import u0.AbstractC1296l0;
import z.o0;

/* loaded from: classes.dex */
public final class e0 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f840i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f841j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i2, Object obj) {
        super(3);
        this.f840i = i2;
        this.f841j = obj;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        long a3;
        long a4;
        int i2 = 17;
        C0971w c0971w = C0971w.f9166h;
        V.l lVar = V.l.f5857b;
        C0880v c0880v = C0880v.f8657a;
        J.W w2 = C0275l.f4150a;
        int i3 = 0;
        Object obj4 = this.f841j;
        switch (this.f840i) {
            case 0:
                V.o oVar = (V.o) obj;
                C0285q c0285q = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q.U(1980580247);
                O0.b bVar = (O0.b) c0285q.l(AbstractC1296l0.f11087f);
                Object K3 = c0285q.K();
                if (K3 == w2) {
                    K3 = C0257c.N(new O0.j(0L), J.W.f4109m);
                    c0285q.e0(K3);
                }
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
                X x2 = (X) obj4;
                boolean i4 = c0285q.i(x2);
                Object K4 = c0285q.K();
                if (i4 || K4 == w2) {
                    K4 = new c0(x2, i3, interfaceC0258c0);
                    c0285q.e0(K4);
                }
                y2.a aVar = (y2.a) K4;
                boolean g3 = c0285q.g(bVar);
                Object K5 = c0285q.K();
                if (g3 || K5 == w2) {
                    K5 = new d0(bVar, interfaceC0258c0, r6);
                    c0285q.e0(K5);
                }
                C0843p c0843p = L.f745a;
                V.o b3 = V.a.b(oVar, new H(aVar, i3, (y2.c) K5));
                c0285q.r(false);
                return b3;
            case 1:
                C0285q c0285q2 = (C0285q) obj2;
                ((Number) obj3).intValue();
                V.o a5 = A0.m.a(lVar, C0200u.f3156v);
                c0285q2.V(693286680);
                s.S a6 = s.Q.a(AbstractC1173l.f10149a, V.b.q, c0285q2, 0);
                c0285q2.V(-1323940314);
                int i5 = c0285q2.f4194P;
                InterfaceC0282o0 n3 = c0285q2.n();
                InterfaceC1253k.f10606f.getClass();
                C1251i c1251i = C1252j.f10598b;
                R.a i6 = AbstractC1108W.i(a5);
                if (!(c0285q2.f4195a instanceof InterfaceC0259d)) {
                    C0257c.I();
                    throw null;
                }
                c0285q2.Y();
                if (c0285q2.f4193O) {
                    c0285q2.m(c1251i);
                } else {
                    c0285q2.h0();
                }
                C0257c.V(c0285q2, a6, C1252j.f10602f);
                C0257c.V(c0285q2, n3, C1252j.f10601e);
                C1250h c1250h = C1252j.f10603g;
                if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i5))) {
                    B1.t.q(i5, c0285q2, i5, c1250h);
                }
                B1.t.r(0, i6, new C0(c0285q2), c0285q2, 2058660585);
                AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.n(lVar, AbstractC0067a2.f2284b));
                ((y2.e) obj4).j(c0285q2, 0);
                c0285q2.r(false);
                c0285q2.r(true);
                c0285q2.r(false);
                c0285q2.r(false);
                return c0880v;
            case 2:
                C0285q c0285q3 = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    t5.b((String) obj4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 0, 0, 131070);
                }
                return c0880v;
            case 3:
                C0285q c0285q4 = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q4.V(-1541271084);
                P4 p4 = (P4) obj4;
                float f3 = p4.f1915b;
                C0848v c0848v = AbstractC0852z.f8611a;
                V.o n4 = androidx.compose.foundation.layout.c.n(androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.q(((V.o) obj).k(androidx.compose.foundation.layout.c.f6639a), V.b.f5837n, 2), ((O0.e) AbstractC0835h.a(p4.f1914a, AbstractC0831e.n(250, 0, c0848v, 2), c0285q4, 0).getValue()).f5138h, 0.0f, 2), ((O0.e) AbstractC0835h.a(f3, AbstractC0831e.n(250, 0, c0848v, 2), c0285q4, 0).getValue()).f5138h);
                c0285q4.r(false);
                return n4;
            case 4:
                return new L2.d(obj3, (L2.g) obj4, (R2.f) obj, i3);
            case AbstractC1166e.f10138f /* 5 */:
                AbstractC1103Q a7 = ((InterfaceC1093G) obj2).a(((O0.a) obj3).f5132a);
                return ((InterfaceC1096J) obj).C(a7.f9834h, a7.f9835i, c0971w, new C0053w(a7, i2, (C0811u) obj4));
            case AbstractC1166e.f10136d /* 6 */:
                C0285q c0285q5 = ((C0) obj).f3972a;
                C0285q c0285q6 = (C0285q) obj2;
                ((Number) obj3).intValue();
                int i7 = c0285q6.f4194P;
                V.o d3 = V.a.d(c0285q6, (V.o) obj4);
                c0285q5.V(509942095);
                InterfaceC1253k.f10606f.getClass();
                C0257c.V(c0285q5, d3, C1252j.f10600d);
                C1250h c1250h2 = C1252j.f10603g;
                if (c0285q5.f4193O || !z2.h.a(c0285q5.K(), Integer.valueOf(i7))) {
                    B1.t.q(i7, c0285q5, i7, c1250h2);
                }
                c0285q5.r(false);
                return c0880v;
            case 7:
                C0285q c0285q7 = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q7.U(-1608161351);
                y2.c cVar = (y2.c) obj4;
                boolean g4 = c0285q7.g(cVar);
                Object K6 = c0285q7.K();
                if (g4 || K6 == w2) {
                    K6 = new C1182v(cVar);
                    c0285q7.e0(K6);
                }
                C1182v c1182v = (C1182v) K6;
                c0285q7.r(false);
                return c1182v;
            case 8:
                C0285q c0285q8 = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q8.U(-1415685722);
                s.Y y3 = (s.Y) obj4;
                boolean g5 = c0285q8.g(y3);
                Object K7 = c0285q8.K();
                if (g5 || K7 == w2) {
                    K7 = new C1150C(y3);
                    c0285q8.e0(K7);
                }
                C1150C c1150c = (C1150C) K7;
                c0285q8.r(false);
                return c1150c;
            case AbstractC1166e.f10135c /* 9 */:
                long j3 = ((O0.a) obj3).f5132a;
                long j4 = ((o0) obj4).f11769f;
                AbstractC1103Q a8 = ((InterfaceC1093G) obj2).a(O0.a.a(j3, B1.C.C((int) (j4 >> 32), O0.a.j(j3), O0.a.h(j3)), 0, B1.C.C((int) (j4 & 4294967295L), O0.a.i(j3), O0.a.g(j3)), 0, 10));
                return ((InterfaceC1096J) obj).C(a8.f9834h, a8.f9835i, c0971w, new C.h(a8, 14));
            default:
                C0285q c0285q9 = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q9.U(1582736677);
                O0.b bVar2 = (O0.b) c0285q9.l(AbstractC1296l0.f11087f);
                H0.d dVar = (H0.d) c0285q9.l(AbstractC1296l0.f11090i);
                O0.k kVar = (O0.k) c0285q9.l(AbstractC1296l0.f11093l);
                C0.K k3 = (C0.K) obj4;
                boolean g6 = c0285q9.g(k3) | c0285q9.g(kVar);
                Object K8 = c0285q9.K();
                if (g6 || K8 == w2) {
                    K8 = B2.a.C(k3, kVar);
                    c0285q9.e0(K8);
                }
                C0.K k4 = (C0.K) K8;
                boolean g7 = c0285q9.g(dVar) | c0285q9.g(k4);
                Object K9 = c0285q9.K();
                if (g7 || K9 == w2) {
                    C0.C c3 = k4.f475a;
                    H0.q qVar = c3.f432f;
                    H0.k kVar2 = c3.f429c;
                    if (kVar2 == null) {
                        kVar2 = H0.k.f3401j;
                    }
                    H0.i iVar = c3.f430d;
                    int i8 = iVar != null ? iVar.f3398a : 0;
                    H0.j jVar = c3.f431e;
                    K9 = ((H0.e) dVar).b(qVar, kVar2, i8, jVar != null ? jVar.f3399a : 1);
                    c0285q9.e0(K9);
                }
                W0 w02 = (W0) K9;
                Object K10 = c0285q9.K();
                Object obj5 = K10;
                if (K10 == w2) {
                    Object value = w02.getValue();
                    o0 o0Var = new o0();
                    o0Var.f11764a = kVar;
                    o0Var.f11765b = bVar2;
                    o0Var.f11766c = dVar;
                    o0Var.f11767d = k3;
                    o0Var.f11768e = value;
                    a4 = z.d0.a(k3, bVar2, dVar, z.d0.f11642a, 1);
                    o0Var.f11769f = a4;
                    c0285q9.e0(o0Var);
                    obj5 = o0Var;
                }
                o0 o0Var2 = (o0) obj5;
                Object value2 = w02.getValue();
                if (kVar != o0Var2.f11764a || !z2.h.a(bVar2, o0Var2.f11765b) || !z2.h.a(dVar, o0Var2.f11766c) || !z2.h.a(k4, o0Var2.f11767d) || !z2.h.a(value2, o0Var2.f11768e)) {
                    o0Var2.f11764a = kVar;
                    o0Var2.f11765b = bVar2;
                    o0Var2.f11766c = dVar;
                    o0Var2.f11767d = k4;
                    o0Var2.f11768e = value2;
                    a3 = z.d0.a(k4, bVar2, dVar, z.d0.f11642a, 1);
                    o0Var2.f11769f = a3;
                }
                boolean i9 = c0285q9.i(o0Var2);
                Object K11 = c0285q9.K();
                if (i9 || K11 == w2) {
                    K11 = new e0(9, o0Var2);
                    c0285q9.e0(K11);
                }
                V.o b4 = androidx.compose.ui.layout.a.b(lVar, (y2.f) K11);
                c0285q9.r(false);
                return b4;
        }
    }
}
