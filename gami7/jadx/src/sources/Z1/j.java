package Z1;

import B1.t;
import H.AbstractC0107g0;
import H.C0093e0;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import V.l;
import V.o;
import m2.C0880v;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1165d;
import s.C1170i;
import s.C1180t;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class j implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6444h;

    public j(int i2) {
        this.f6444h = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            C1165d c1165d = AbstractC1173l.f10149a;
            C1170i c1170i = new C1170i(8);
            l lVar = l.f5857b;
            C1180t a3 = AbstractC1179s.a(c1170i, V.b.f5842t, c0285q, 6);
            int i2 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            o d3 = V.a.d(c0285q, lVar);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
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
            C0257c.V(c0285q, a3, C1252j.f10602f);
            C0257c.V(c0285q, n3, C1252j.f10601e);
            C1250h c1250h = C1252j.f10603g;
            if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                t.q(i2, c0285q, i2, c1250h);
            }
            C0257c.V(c0285q, d3, C1252j.f10600d);
            t5.b("You have " + this.f6444h + " failed messages. How would you like to retry them?", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 0, 0, 131070);
            t5.b("Note: 'Send All Now' ignores working hours and time gaps.", null, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2500s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(P5.f1917a)).f1865l, c0285q, 6, 0, 65530);
            c0285q.r(true);
        }
        return C0880v.f8657a;
    }
}
