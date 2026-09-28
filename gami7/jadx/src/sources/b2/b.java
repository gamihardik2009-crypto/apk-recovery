package b2;

import B1.C;
import B1.t;
import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
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
import i0.C0712e;
import m2.C0880v;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1180t;
import s.C1181u;
import s.Q;
import s.S;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import y2.f;
import z2.h;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: h, reason: collision with root package name */
    public static final b f7150h = new b();

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        int intValue = ((Number) obj3).intValue();
        h.f((C1181u) obj, "$this$Card");
        if ((intValue & 81) == 16 && c0285q.A()) {
            c0285q.P();
        } else {
            l lVar = l.f5857b;
            o i2 = androidx.compose.foundation.layout.a.i(lVar, 20);
            C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q, 0);
            int i3 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            o d3 = V.a.d(c0285q, i2);
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
            if (c0285q.f4193O || !h.a(c0285q.K(), Integer.valueOf(i3))) {
                t.q(i3, c0285q, i3, c1250h3);
            }
            C1250h c1250h4 = C1252j.f10600d;
            C0257c.V(c0285q, d3, c1250h4);
            S a4 = Q.a(AbstractC1173l.f10149a, V.b.f5840r, c0285q, 48);
            int i4 = c0285q.f4194P;
            InterfaceC0282o0 n4 = c0285q.n();
            o d4 = V.a.d(c0285q, lVar);
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
            if (c0285q.f4193O || !h.a(c0285q.K(), Integer.valueOf(i4))) {
                t.q(i4, c0285q, i4, c1250h3);
            }
            C0257c.V(c0285q, d4, c1250h4);
            C0712e V2 = C.V();
            X0 x02 = AbstractC0107g0.f2597a;
            AbstractC0088d2.a(V2, null, null, ((C0093e0) c0285q.l(x02)).f2483a, c0285q, 48, 4);
            float f3 = 12;
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.n(lVar, f3));
            t5.b("Retry Strategy", null, 0L, 0L, null, k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 196614, 0, 131038);
            c0285q.r(true);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, f3));
            t5.b("Failed messages can be automatically retried every 2 hours or manually triggered.", null, ((C0093e0) c0285q.l(x02)).f2500s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(P5.f1917a)).f1864k, c0285q, 6, 0, 65530);
            c0285q.r(true);
        }
        return C0880v.f8657a;
    }
}
