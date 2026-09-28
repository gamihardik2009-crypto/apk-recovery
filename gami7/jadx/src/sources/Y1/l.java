package Y1;

import H.AbstractC0088d2;
import H.D1;
import H.X2;
import H.t5;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import c0.C0603v;
import m2.C0880v;
import r0.InterfaceC1094H;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1177p;
import s.AbstractC1179s;
import s.C1180t;
import s.C1181u;
import s.Q;
import s.S;
import s.T;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import y.C1396d;

/* loaded from: classes.dex */
public final class l implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6321h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f6322i;

    public /* synthetic */ l(float f3, int i2) {
        this.f6321h = i2;
        this.f6322i = f3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f6321h) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.h.f((androidx.compose.foundation.lazy.a) obj, "$this$item");
                if ((intValue & 81) == 16 && c0285q.A()) {
                    c0285q.P();
                } else {
                    K1.f.g(this.f6322i, c0285q, 0);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                z2.h.f((C1181u) obj, "$this$Card");
                if ((intValue2 & 81) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.l lVar = V.l.f5857b;
                    V.o i2 = androidx.compose.foundation.layout.a.i(lVar, 20);
                    S a3 = Q.a(AbstractC1173l.f10149a, V.b.f5840r, c0285q2, 48);
                    int i3 = c0285q2.f4194P;
                    InterfaceC0282o0 n3 = c0285q2.n();
                    V.o d3 = V.a.d(c0285q2, i2);
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
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i3))) {
                        B1.t.q(i3, c0285q2, i3, c1250h3);
                    }
                    C1250h c1250h4 = C1252j.f10600d;
                    C0257c.V(c0285q2, d3, c1250h4);
                    T t3 = T.f10079a;
                    V.o j3 = androidx.compose.foundation.layout.c.j(lVar, 48);
                    long b3 = C0603v.b(0.1f, D1.t(c0285q2).f2488f);
                    C1396d c1396d = y.e.f11486a;
                    V.o b4 = androidx.compose.foundation.a.b(j3, b3, c1396d);
                    InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5835l, false);
                    int i4 = c0285q2.f4194P;
                    InterfaceC0282o0 n4 = c0285q2.n();
                    V.o d4 = V.a.d(c0285q2, b4);
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
                    C0257c.V(c0285q2, e3, c1250h);
                    C0257c.V(c0285q2, n4, c1250h2);
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i4))) {
                        B1.t.q(i4, c0285q2, i4, c1250h3);
                    }
                    C0257c.V(c0285q2, d4, c1250h4);
                    AbstractC0088d2.a(l0.c.z(), null, androidx.compose.foundation.layout.c.j(lVar, 24), D1.t(c0285q2).f2488f, c0285q2, 432, 0);
                    c0285q2.r(true);
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.n(lVar, 16));
                    V.o a4 = T.a(t3, lVar);
                    C1180t a5 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q2, 0);
                    int i5 = c0285q2.f4194P;
                    InterfaceC0282o0 n5 = c0285q2.n();
                    V.o d5 = V.a.d(c0285q2, a4);
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
                    C0257c.V(c0285q2, n5, c1250h2);
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i5))) {
                        B1.t.q(i5, c0285q2, i5, c1250h3);
                    }
                    C0257c.V(c0285q2, d5, c1250h4);
                    t5.b("Overall Progress", null, C0603v.b(0.7f, D1.t(c0285q2).f2491i), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D1.x(c0285q2).f1867n, c0285q2, 6, 0, 65530);
                    StringBuilder sb = new StringBuilder();
                    final float f3 = this.f6322i;
                    sb.append((int) (100 * f3));
                    sb.append("% Completed");
                    t5.b(sb.toString(), null, D1.t(c0285q2).f2491i, 0L, null, H0.k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, D1.x(c0285q2).f1861h, c0285q2, 196608, 0, 65498);
                    float f4 = 8;
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.b(lVar, f4));
                    c0285q2.U(-1535855303);
                    boolean d6 = c0285q2.d(f3);
                    Object K3 = c0285q2.K();
                    if (d6 || K3 == C0275l.f4150a) {
                        K3 = new y2.a() { // from class: Z1.g
                            @Override // y2.a
                            public final Object c() {
                                return Float.valueOf(f3);
                            }
                        };
                        c0285q2.e0(K3);
                    }
                    c0285q2.r(false);
                    X2.a((y2.a) K3, B1.C.v(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.f6639a, f4), c1396d), D1.t(c0285q2).f2488f, C0603v.b(0.1f, D1.t(c0285q2).f2488f), 0, c0285q2, 0, 16);
                    c0285q2.r(true);
                    c0285q2.r(true);
                }
                return C0880v.f8657a;
        }
    }
}
