package D;

import H.O4;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0302z;
import J.InterfaceC0258c0;
import J.W0;
import J2.InterfaceC0328z;
import android.graphics.Typeface;
import android.text.Spannable;
import m.C0829d;
import m.C0841n;
import m.p0;
import m2.C0880v;
import n2.C0971w;
import o.C0976b;
import o.C0983i;
import p.C1007b;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1096J;
import s.AbstractC1166e;
import z.j0;

/* loaded from: classes.dex */
public final class H extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f732i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f733j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f734k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i2, Object obj, y2.c cVar) {
        super(3);
        this.f732i = i2;
        this.f734k = cVar;
        this.f733j = obj;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        long e3;
        switch (this.f732i) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q.U(759876635);
                Object K3 = c0285q.K();
                J.W w2 = C0275l.f4150a;
                if (K3 == w2) {
                    K3 = C0257c.F((y2.a) this.f733j);
                    c0285q.e0(K3);
                }
                W0 w02 = (W0) K3;
                Object K4 = c0285q.K();
                if (K4 == w2) {
                    K4 = new C0829d(new b0.c(((b0.c) w02.getValue()).f7058a), L.f746b, new b0.c(L.f747c), 8);
                    c0285q.e0(K4);
                }
                C0829d c0829d = (C0829d) K4;
                C0880v c0880v = C0880v.f8657a;
                boolean i2 = c0285q.i(c0829d);
                Object K5 = c0285q.K();
                if (i2 || K5 == w2) {
                    K5 = new K(w02, c0829d, null);
                    c0285q.e0(K5);
                }
                C0257c.e(c0285q, c0880v, (y2.e) K5);
                C0841n c0841n = c0829d.f8424c;
                boolean g3 = c0285q.g(c0841n);
                Object K6 = c0285q.K();
                if (g3 || K6 == w2) {
                    K6 = new G(c0841n, 0);
                    c0285q.e0(K6);
                }
                V.o oVar = (V.o) ((y2.c) this.f734k).l((y2.a) K6);
                c0285q.r(false);
                return oVar;
            case 1:
                C0285q c0285q2 = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    O4.d((y2.e) this.f733j, (y2.e) this.f734k, c0285q2, 0);
                }
                return C0880v.f8657a;
            case 2:
                C0.C c3 = (C0.C) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                H0.q qVar = c3.f432f;
                H0.k kVar = c3.f429c;
                if (kVar == null) {
                    kVar = H0.k.f3401j;
                }
                H0.i iVar = c3.f430d;
                H0.i iVar2 = new H0.i(iVar != null ? iVar.f3398a : 0);
                H0.j jVar = c3.f431e;
                ((Spannable) this.f733j).setSpan(new F0.b(1, (Typeface) ((y2.g) this.f734k).g(qVar, kVar, iVar2, new H0.j(jVar != null ? jVar.f3399a : 1))), intValue, intValue2, 33);
                return C0880v.f8657a;
            case 3:
                InterfaceC1096J interfaceC1096J = (InterfaceC1096J) obj;
                AbstractC1103Q a3 = ((InterfaceC1093G) obj2).a(((O0.a) obj3).f5132a);
                if (interfaceC1096J.F()) {
                    if (!((Boolean) ((y2.c) this.f734k).l(((p0) this.f733j).f8550d.getValue())).booleanValue()) {
                        e3 = 0;
                        return interfaceC1096J.C((int) (e3 >> 32), (int) (e3 & 4294967295L), C0971w.f9166h, new C.h(a3, 5));
                    }
                }
                e3 = l0.c.e(a3.f9834h, a3.f9835i);
                return interfaceC1096J.C((int) (e3 >> 32), (int) (e3 & 4294967295L), C0971w.f9166h, new C.h(a3, 5));
            case 4:
                C0285q c0285q3 = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q3.U(-353972293);
                n.U a4 = ((n.T) this.f733j).a((r.k) this.f734k, c0285q3);
                boolean g4 = c0285q3.g(a4);
                Object K7 = c0285q3.K();
                if (g4 || K7 == C0275l.f4150a) {
                    K7 = new n.W(a4);
                    c0285q3.e0(K7);
                }
                n.W w3 = (n.W) K7;
                c0285q3.r(false);
                return w3;
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q4 = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    Object K8 = c0285q4.K();
                    if (K8 == C0275l.f4150a) {
                        K8 = new C0983i();
                        c0285q4.e0(K8);
                    }
                    C0983i c0983i = (C0983i) K8;
                    c0983i.f9199a.clear();
                    ((y2.c) this.f734k).l(c0983i);
                    c0983i.a((C0976b) this.f733j, c0285q4, 0);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q5 = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q5.U(-102778667);
                Object K9 = c0285q5.K();
                J.W w4 = C0275l.f4150a;
                if (K9 == w4) {
                    C0302z c0302z = new C0302z(C0257c.B(c0285q5));
                    c0285q5.e0(c0302z);
                    K9 = c0302z;
                }
                InterfaceC0328z interfaceC0328z = ((C0302z) K9).f4298h;
                Object K10 = c0285q5.K();
                if (K10 == w4) {
                    K10 = C0257c.N(null, J.W.f4109m);
                    c0285q5.e0(K10);
                }
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K10;
                InterfaceC0258c0 R3 = C0257c.R((y2.c) this.f734k, c0285q5);
                r.l lVar = (r.l) this.f733j;
                boolean g5 = c0285q5.g(lVar);
                Object K11 = c0285q5.K();
                if (g5 || K11 == w4) {
                    K11 = new C1007b(interfaceC0258c0, 20, lVar);
                    c0285q5.e0(K11);
                }
                C0257c.d(lVar, (y2.c) K11, c0285q5);
                V.l lVar2 = V.l.f5857b;
                boolean i3 = c0285q5.i(interfaceC0328z) | c0285q5.g(lVar) | c0285q5.g(R3);
                Object K12 = c0285q5.K();
                if (i3 || K12 == w4) {
                    j0 j0Var = new j0(interfaceC0328z, interfaceC0258c0, (r.l) this.f733j, R3, null);
                    c0285q5.e0(j0Var);
                    K12 = j0Var;
                }
                V.o a5 = n0.w.a(lVar2, lVar, (y2.e) K12);
                c0285q5.r(false);
                return a5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(Object obj, int i2, Object obj2) {
        super(3);
        this.f732i = i2;
        this.f733j = obj;
        this.f734k = obj2;
    }
}
