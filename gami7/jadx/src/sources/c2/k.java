package c2;

import B1.t;
import H.K5;
import H.M5;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import V.o;
import androidx.compose.foundation.layout.FillElement;
import m2.C0880v;
import r0.InterfaceC1094H;
import s.AbstractC1177p;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class k implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7375h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M5 f7376i;

    public /* synthetic */ k(M5 m5, int i2) {
        this.f7375h = i2;
        this.f7376i = m5;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f7375h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6639a;
                    InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5835l, false);
                    int i2 = c0285q.f4194P;
                    InterfaceC0282o0 n3 = c0285q.n();
                    o d3 = V.a.d(c0285q, fillElement);
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
                    C0257c.V(c0285q, e3, C1252j.f10602f);
                    C0257c.V(c0285q, n3, C1252j.f10601e);
                    C1250h c1250h = C1252j.f10603g;
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                        t.q(i2, c0285q, i2, c1250h);
                    }
                    C0257c.V(c0285q, d3, C1252j.f10600d);
                    K5.b(this.f7376i, null, null, c0285q, 0, 6);
                    c0285q.r(true);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    FillElement fillElement2 = androidx.compose.foundation.layout.c.f6639a;
                    InterfaceC1094H e4 = AbstractC1177p.e(V.b.f5835l, false);
                    int i3 = c0285q2.f4194P;
                    InterfaceC0282o0 n4 = c0285q2.n();
                    o d4 = V.a.d(c0285q2, fillElement2);
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i2 = C1252j.f10598b;
                    if (!(c0285q2.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(c1251i2);
                    } else {
                        c0285q2.h0();
                    }
                    C0257c.V(c0285q2, e4, C1252j.f10602f);
                    C0257c.V(c0285q2, n4, C1252j.f10601e);
                    C1250h c1250h2 = C1252j.f10603g;
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i3))) {
                        t.q(i3, c0285q2, i3, c1250h2);
                    }
                    C0257c.V(c0285q2, d4, C1252j.f10600d);
                    K5.b(this.f7376i, null, null, c0285q2, 0, 6);
                    c0285q2.r(true);
                }
                return C0880v.f8657a;
        }
    }
}
