package X1;

import B1.t;
import H.AbstractC0107g0;
import H.C0093e0;
import H.D1;
import H.O5;
import H.P5;
import H.t5;
import H0.k;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.X0;
import V.l;
import V.o;
import c0.C0603v;
import m2.C0880v;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1180t;
import s.Q;
import s.S;
import s.T;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class d implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6220h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f6221i;

    public /* synthetic */ d(String str, int i2) {
        this.f6220h = i2;
        this.f6221i = str;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f6220h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    t5.b(this.f6221i, null, C0603v.b(0.6f, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2500s), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 0, 0, 131066);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    l lVar = l.f5857b;
                    float f3 = 16;
                    o k3 = androidx.compose.foundation.layout.a.i(lVar, f3).k(androidx.compose.foundation.layout.c.f6639a);
                    S a3 = Q.a(AbstractC1173l.f10149a, V.b.f5840r, c0285q2, 48);
                    int i2 = c0285q2.f4194P;
                    InterfaceC0282o0 n3 = c0285q2.n();
                    o d3 = V.a.d(c0285q2, k3);
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
                    T t3 = T.f10079a;
                    String str = this.f6221i;
                    l0.c.c(str, null, c0285q2, 0, 2);
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.n(lVar, f3));
                    o a4 = T.a(t3, lVar);
                    C1180t a5 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q2, 0);
                    int i3 = c0285q2.f4194P;
                    InterfaceC0282o0 n4 = c0285q2.n();
                    o d4 = V.a.d(c0285q2, a4);
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
                    C0257c.V(c0285q2, a5, c1250h);
                    C0257c.V(c0285q2, n4, c1250h2);
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i3))) {
                        t.q(i3, c0285q2, i3, c1250h3);
                    }
                    C0257c.V(c0285q2, d4, c1250h4);
                    X0 x02 = P5.f1917a;
                    t5.b(str, null, 0L, 0L, null, k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q2.l(x02)).f1863j, c0285q2, 196608, 0, 65502);
                    t5.b("Failed at 10:45 AM • Network Error", null, ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2504w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q2.l(x02)).f1865l, c0285q2, 6, 0, 65530);
                    c0285q2.r(true);
                    D1.e(new b2.e(), null, false, null, null, b2.c.f7154d, c0285q2, 196614, 30);
                    c0285q2.r(true);
                }
                return C0880v.f8657a;
        }
    }
}
