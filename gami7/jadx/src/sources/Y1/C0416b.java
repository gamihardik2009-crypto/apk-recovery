package Y1;

import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.C0093e0;
import H.D1;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.X0;
import c0.C0603v;
import i0.C0712e;
import m2.C0880v;
import r0.InterfaceC1094H;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.C1181u;
import s.Q;
import s.S;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: Y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416b implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public static final C0416b f6275i = new C0416b(0);

    /* renamed from: j, reason: collision with root package name */
    public static final C0416b f6276j = new C0416b(1);

    /* renamed from: k, reason: collision with root package name */
    public static final C0416b f6277k = new C0416b(2);

    /* renamed from: l, reason: collision with root package name */
    public static final C0416b f6278l = new C0416b(3);

    /* renamed from: m, reason: collision with root package name */
    public static final C0416b f6279m = new C0416b(4);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6280h;

    public /* synthetic */ C0416b(int i2) {
        this.f6280h = i2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f6280h) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.h.f((C1181u) obj, "$this$Card");
                if ((intValue & 81) == 16 && c0285q.A()) {
                    c0285q.P();
                } else {
                    V.l lVar = V.l.f5857b;
                    V.o i2 = androidx.compose.foundation.layout.a.i(lVar, 16);
                    S a3 = Q.a(AbstractC1173l.f10149a, V.b.f5840r, c0285q, 48);
                    int i3 = c0285q.f4194P;
                    InterfaceC0282o0 n3 = c0285q.n();
                    V.o d3 = V.a.d(c0285q, i2);
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
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i3))) {
                        B1.t.q(i3, c0285q, i3, c1250h);
                    }
                    C0257c.V(c0285q, d3, C1252j.f10600d);
                    C0712e t3 = B2.a.t();
                    X0 x02 = AbstractC0107g0.f2597a;
                    AbstractC0088d2.a(t3, null, null, ((C0093e0) c0285q.l(x02)).f2504w, c0285q, 48, 4);
                    AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.n(lVar, 12));
                    t5.b("You added a new SMS or client. Restart engine to include this data in automation.", null, ((C0093e0) c0285q.l(x02)).f2507z, 0L, null, H0.k.f3402k, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(P5.f1917a)).f1865l, c0285q, 196614, 0, 65498);
                    c0285q.r(true);
                }
                return C0880v.f8657a;
            case 1:
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                z2.h.f((androidx.compose.foundation.lazy.a) obj, "$this$item");
                if ((intValue2 & 81) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    D1.b(androidx.compose.foundation.layout.c.f6639a, y.e.a(16), D1.l(C0603v.b(0.7f, ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2506y), c0285q2, 0), null, null, AbstractC0417c.f6282b, c0285q2, 196614, 24);
                }
                return C0880v.f8657a;
            case 2:
                C0285q c0285q3 = (C0285q) obj2;
                int intValue3 = ((Number) obj3).intValue();
                z2.h.f((androidx.compose.foundation.lazy.a) obj, "$this$item");
                if ((intValue3 & 81) == 16 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    l0.c.g("Recent Activity", null, c0285q3, 6, 2);
                }
                return C0880v.f8657a;
            case 3:
                C0285q c0285q4 = (C0285q) obj2;
                int intValue4 = ((Number) obj3).intValue();
                z2.h.f((androidx.compose.foundation.lazy.a) obj, "$this$item");
                if ((intValue4 & 81) == 16 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    V.o k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f6639a, 0.0f, 32, 1);
                    InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5835l, false);
                    int i4 = c0285q4.f4194P;
                    InterfaceC0282o0 n4 = c0285q4.n();
                    V.o d4 = V.a.d(c0285q4, k3);
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i2 = C1252j.f10598b;
                    if (!(c0285q4.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q4.Y();
                    if (c0285q4.f4193O) {
                        c0285q4.m(c1251i2);
                    } else {
                        c0285q4.h0();
                    }
                    C0257c.V(c0285q4, e3, C1252j.f10602f);
                    C0257c.V(c0285q4, n4, C1252j.f10601e);
                    C1250h c1250h2 = C1252j.f10603g;
                    if (c0285q4.f4193O || !z2.h.a(c0285q4.K(), Integer.valueOf(i4))) {
                        B1.t.q(i4, c0285q4, i4, c1250h2);
                    }
                    C0257c.V(c0285q4, d4, C1252j.f10600d);
                    t5.b("No recent activity yet", null, C0603v.b(0.5f, ((C0093e0) c0285q4.l(AbstractC0107g0.f2597a)).f2500s), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q4.l(P5.f1917a)).f1864k, c0285q4, 6, 0, 65530);
                    c0285q4.r(true);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q5 = (C0285q) obj2;
                int intValue5 = ((Number) obj3).intValue();
                z2.h.f((androidx.compose.foundation.lazy.a) obj, "$this$item");
                if ((intValue5 & 81) == 16 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    AbstractC1166e.a(c0285q5, androidx.compose.foundation.layout.c.b(V.l.f5857b, 32));
                }
                return C0880v.f8657a;
        }
    }
}
