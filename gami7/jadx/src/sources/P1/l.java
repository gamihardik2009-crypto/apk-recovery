package P1;

import B1.t;
import H.A;
import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import H.D1;
import H.O4;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import Y1.H;
import i0.C0712e;
import java.util.List;
import m2.C0880v;
import n1.y;
import s.AbstractC1173l;
import s.C1160M;
import s.C1165d;
import s.C1170i;
import s.Q;
import s.S;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class l implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5253h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5254i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5255j;

    public /* synthetic */ l(Object obj, int i2, Object obj2) {
        this.f5253h = i2;
        this.f5254i = obj;
        this.f5255j = obj2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0880v c0880v = C0880v.f8657a;
        Object obj3 = this.f5255j;
        Object obj4 = this.f5254i;
        int i2 = 2;
        switch (this.f5253h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    B2.a.f((y) obj4, (H) obj3, c0285q, 72);
                }
                return c0880v;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.l lVar = V.l.f5857b;
                    float f3 = 12;
                    V.o j3 = androidx.compose.foundation.layout.a.j(lVar, 16, f3);
                    V.f fVar = V.b.f5840r;
                    C1165d c1165d = AbstractC1173l.f10149a;
                    S a3 = Q.a(new C1170i(f3), fVar, c0285q2, 54);
                    int i3 = c0285q2.f4194P;
                    InterfaceC0282o0 n3 = c0285q2.n();
                    V.o d3 = V.a.d(c0285q2, j3);
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i = C1252j.f10598b;
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
                    C0257c.V(c0285q2, a3, C1252j.f10602f);
                    C0257c.V(c0285q2, n3, C1252j.f10601e);
                    C1250h c1250h = C1252j.f10603g;
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i3))) {
                        t.q(i3, c0285q2, i3, c1250h);
                    }
                    C0257c.V(c0285q2, d3, C1252j.f10600d);
                    AbstractC0088d2.a((C0712e) obj4, null, androidx.compose.foundation.layout.c.j(lVar, 20), 0L, c0285q2, 432, 8);
                    t5.b((String) obj3, null, 0L, 0L, null, H0.k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q2.l(P5.f1917a)).f1866m, c0285q2, 196608, 0, 65502);
                    c0285q2.r(true);
                }
                return c0880v;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    t5.b((String) obj4, null, 0L, 0L, null, z2.h.a((String) ((InterfaceC0258c0) obj3).getValue(), (String) obj4) ? H0.k.f3403l : H0.k.f3401j, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q3.l(P5.f1917a)).f1866m, c0285q3, 0, 0, 65502);
                }
                return c0880v;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    for (String str : (List) obj4) {
                        InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) obj3;
                        boolean a4 = z2.h.a((String) interfaceC0258c0.getValue(), str);
                        c0285q4.U(-1386685382);
                        boolean g3 = c0285q4.g(str);
                        Object K3 = c0285q4.K();
                        if (g3 || K3 == C0275l.f4150a) {
                            K3 = new f(str, 3, interfaceC0258c0);
                            c0285q4.e0(K3);
                        }
                        c0285q4.r(false);
                        O4.b(a4, (y2.a) K3, null, false, R.b.c(966506002, new l(str, i2, interfaceC0258c0), c0285q4), null, 0L, 0L, null, c0285q4, 24576, 492);
                    }
                }
                return c0880v;
            default:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    f fVar2 = new f((InterfaceC0258c0) obj4, 4, (d2.n) obj3);
                    C1160M c1160m = A.f1274a;
                    D1.a(fVar2, null, false, null, A.a(((C0093e0) c0285q5.l(AbstractC0107g0.f2597a)).f2504w, c0285q5), null, null, null, null, d2.c.f7483b, c0285q5, 805306368, 494);
                }
                return c0880v;
        }
    }
}
