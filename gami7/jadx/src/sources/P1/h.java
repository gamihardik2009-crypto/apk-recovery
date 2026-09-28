package P1;

import B1.t;
import C1.y;
import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import a.AbstractC0423a;
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
public final class h implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5244h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5245i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5246j;

    public /* synthetic */ h(int i2, Object obj, boolean z3) {
        this.f5244h = i2;
        this.f5246j = obj;
        this.f5245i = z3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        long j3;
        C0880v c0880v = C0880v.f8657a;
        boolean z3 = this.f5245i;
        Object obj3 = this.f5246j;
        V.l lVar = V.l.f5857b;
        switch (this.f5244h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    AbstractC0088d2.a(((S1.m) obj3).f5620c, null, androidx.compose.foundation.layout.c.j(lVar, z3 ? 26 : 24), 0L, c0285q, 48, 8);
                }
                return c0880v;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.o i2 = androidx.compose.foundation.layout.a.i(lVar, 16);
                    C1165d c1165d = AbstractC1173l.f10149a;
                    C1180t a3 = AbstractC1179s.a(new C1170i(10), V.b.f5842t, c0285q2, 6);
                    int i3 = c0285q2.f4194P;
                    InterfaceC0282o0 n3 = c0285q2.n();
                    V.o d3 = V.a.d(c0285q2, i2);
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
                    R1.a aVar = (R1.a) obj3;
                    String obj4 = H2.l.h0(H2.l.b0(aVar.f5467b, "\n", "")).toString();
                    String obj5 = H2.l.h0(H2.l.b0(aVar.f5468c, "\n", "")).toString();
                    if (z3) {
                        c0285q2.U(1434798890);
                        j3 = ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2486d;
                    } else {
                        c0285q2.U(1434800488);
                        j3 = ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2507z;
                    }
                    c0285q2.r(false);
                    long j4 = j3;
                    K1.f.j(AbstractC0423a.N(), "Time Gap", aVar.f5470e + " min", j4, c0285q2, 48);
                    K1.f.j(y.w(), "Working Hours", obj4 + " - " + obj5, j4, c0285q2, 48);
                    K1.f.j(y.w(), "Skip Sundays", aVar.f5469d ? "Yes" : "No", j4, c0285q2, 48);
                    c0285q2.r(true);
                }
                return c0880v;
        }
    }
}
