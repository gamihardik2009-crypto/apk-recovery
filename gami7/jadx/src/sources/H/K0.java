package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import androidx.compose.foundation.layout.FillElement;
import m2.C0880v;
import n1.C0945f;
import n2.AbstractC0948C;
import r0.AbstractC1108W;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1180t;
import s.InterfaceC1169h;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class K0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1658i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1659j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1660k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1661l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1662m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1663n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        super(2);
        this.f1658i = i2;
        this.f1659j = obj;
        this.f1660k = obj2;
        this.f1661l = obj3;
        this.f1662m = obj4;
        this.f1663n = obj5;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f1658i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
                    c0285q.V(-483455358);
                    C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q, 0);
                    c0285q.V(-1323940314);
                    int i2 = c0285q.f4194P;
                    InterfaceC0282o0 n3 = c0285q.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i = C1252j.f10598b;
                    R.a i3 = AbstractC1108W.i(fillElement);
                    boolean z3 = c0285q.f4195a instanceof InterfaceC0259d;
                    if (!z3) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q.Y();
                    if (c0285q.f4193O) {
                        c0285q.m(c1251i);
                    } else {
                        c0285q.h0();
                    }
                    C1250h c1250h = C1252j.f10602f;
                    C0257c.V(c0285q, a3, c1250h);
                    C1250h c1250h2 = C1252j.f10601e;
                    C0257c.V(c0285q, n3, c1250h2);
                    C1250h c1250h3 = C1252j.f10603g;
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                        B1.t.q(i2, c0285q, i2, c1250h3);
                    }
                    B1.t.r(0, i3, new J.C0(c0285q), c0285q, 2058660585);
                    y2.e eVar = (y2.e) this.f1659j;
                    y2.e eVar2 = (y2.e) this.f1660k;
                    InterfaceC1169h interfaceC1169h = (eVar == null || eVar2 == null) ? eVar != null ? AbstractC1173l.f10149a : AbstractC1173l.f10150b : AbstractC1173l.f10155g;
                    V.f fVar = V.b.f5840r;
                    c0285q.V(693286680);
                    s.S a4 = s.Q.a(interfaceC1169h, fVar, c0285q, 48);
                    c0285q.V(-1323940314);
                    int i4 = c0285q.f4194P;
                    InterfaceC0282o0 n4 = c0285q.n();
                    R.a i5 = AbstractC1108W.i(fillElement);
                    if (!z3) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q.Y();
                    if (c0285q.f4193O) {
                        c0285q.m(c1251i);
                    } else {
                        c0285q.h0();
                    }
                    C0257c.V(c0285q, a4, c1250h);
                    C0257c.V(c0285q, n4, c1250h2);
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                        B1.t.q(i4, c0285q, i4, c1250h3);
                    }
                    B1.t.r(0, i5, new J.C0(c0285q), c0285q, 2058660585);
                    c0285q.V(-1011363262);
                    if (eVar != null) {
                        t5.a((C0.K) this.f1663n, R.b.b(c0285q, -962031352, new C0078c(eVar, 2)), c0285q, 48);
                    }
                    c0285q.r(false);
                    c0285q.V(1449827808);
                    if (eVar2 != null) {
                        eVar2.j(c0285q, 0);
                    }
                    B1.t.u(c0285q, false, false, true, false);
                    c0285q.r(false);
                    c0285q.V(1680523079);
                    if (((y2.e) this.f1661l) != null || eVar != null || eVar2 != null) {
                        D1.d(null, 0.0f, ((B0) this.f1662m).f1337x, c0285q, 0, 3);
                    }
                    B1.t.u(c0285q, false, false, true, false);
                    c0285q.r(false);
                }
                return C0880v.f8657a;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    AbstractC0165o2.b((y2.e) this.f1659j, (y2.e) this.f1660k, (y2.e) this.f1661l, (y2.e) this.f1662m, (y2.e) this.f1663n, c0285q2, 384);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    C0945f c0945f = (C0945f) this.f1659j;
                    boolean i6 = c0285q3.i(c0945f);
                    o1.o oVar = (o1.o) this.f1660k;
                    boolean g3 = i6 | c0285q3.g(oVar);
                    Object K3 = c0285q3.K();
                    if (g3 || K3 == C0275l.f4150a) {
                        K3 = new L2.d((T.r) this.f1662m, c0945f, oVar, 9);
                        c0285q3.e0(K3);
                    }
                    C0257c.d(c0945f, (y2.c) K3, c0285q3);
                    AbstractC0948C.b(c0945f, (S.c) this.f1661l, R.b.c(-497631156, new C0148m((o1.n) this.f1663n, 12, c0945f), c0285q3), c0285q3, 384);
                }
                return C0880v.f8657a;
        }
    }
}
