package W1;

import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.X0;
import c0.C0603v;
import m2.C0880v;
import r0.InterfaceC1094H;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.AbstractC1179s;
import s.C1180t;
import s.C1181u;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class F implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5923h;

    public F(int i2) {
        this.f5923h = i2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        int intValue = ((Number) obj3).intValue();
        z2.h.f((C1181u) obj, "$this$Card");
        if ((intValue & 81) == 16 && c0285q.A()) {
            c0285q.P();
        } else {
            V.l lVar = V.l.f5857b;
            V.o i2 = androidx.compose.foundation.layout.a.i(lVar, 20);
            s.S a3 = s.Q.a(AbstractC1173l.f10149a, V.b.f5840r, c0285q, 48);
            int i3 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            V.o d3 = V.a.d(c0285q, i2);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
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
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i3))) {
                B1.t.q(i3, c0285q, i3, c1250h3);
            }
            C1250h c1250h4 = C1252j.f10600d;
            C0257c.V(c0285q, d3, c1250h4);
            V.o j3 = androidx.compose.foundation.layout.c.j(lVar, 48);
            X0 x02 = AbstractC0107g0.f2597a;
            V.o b3 = androidx.compose.foundation.a.b(j3, C0603v.b(0.1f, ((C0093e0) c0285q.l(x02)).f2483a), y.e.f11486a);
            InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5835l, false);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n4 = c0285q.n();
            V.o d4 = V.a.d(c0285q, b3);
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
            C0257c.V(c0285q, e3, c1250h);
            C0257c.V(c0285q, n4, c1250h2);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q, i4, c1250h3);
            }
            C0257c.V(c0285q, d4, c1250h4);
            AbstractC0088d2.a(K1.f.y(), null, null, ((C0093e0) c0285q.l(x02)).f2483a, c0285q, 48, 4);
            c0285q.r(true);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.n(lVar, 16));
            C1180t a4 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q, 0);
            int i5 = c0285q.f4194P;
            InterfaceC0282o0 n5 = c0285q.n();
            V.o d5 = V.a.d(c0285q, lVar);
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
            C0257c.V(c0285q, n5, c1250h2);
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i5))) {
                B1.t.q(i5, c0285q, i5, c1250h3);
            }
            C0257c.V(c0285q, d5, c1250h4);
            String str = this.f5923h + " Total Clients";
            X0 x03 = P5.f1917a;
            t5.b(str, null, ((C0093e0) c0285q.l(x02)).f2486d, 0L, null, H0.k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x03)).f1861h, c0285q, 196608, 0, 65498);
            t5.b("Automation picks from this list", null, C0603v.b(0.7f, ((C0093e0) c0285q.l(x02)).f2486d), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(x03)).f1865l, c0285q, 6, 0, 65530);
            c0285q.r(true);
            c0285q.r(true);
        }
        return C0880v.f8657a;
    }
}
