package H;

import I.AbstractC0243h;
import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import c0.C0603v;
import m2.C0880v;
import r0.InterfaceC1094H;
import s.AbstractC1177p;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import z.AbstractC1412c;

/* loaded from: classes.dex */
public final class Y1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2174i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2175j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2176k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y1(int i2, long j3, Object obj) {
        super(2);
        this.f2174i = i2;
        this.f2175j = j3;
        this.f2176k = obj;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2174i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    D1.h(this.f2175j, P5.a((O5) c0285q.l(P5.f1917a), AbstractC0243h.f3676b), R.b.b(c0285q, -1771489750, new C0078c((y2.e) this.f2176k, 6)), c0285q, 384);
                }
                return C0880v.f8657a;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    AbstractC0140k5.b(this.f2175j, null, (y2.e) this.f2176k, c0285q2, 0, 2);
                }
                return C0880v.f8657a;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    AbstractC0140k5.b(this.f2175j, null, (y2.e) this.f2176k, c0285q3, 0, 2);
                }
                return C0880v.f8657a;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    C0257c.a(AbstractC0183r0.f3050a.a(new C0603v(this.f2175j)), (y2.e) this.f2176k, c0285q4, 8);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q5.A()) {
                    c0285q5.P();
                } else {
                    long j3 = this.f2175j;
                    if (j3 != 9205357640488583168L) {
                        c0285q5.U(1828881000);
                        V.o h2 = androidx.compose.foundation.layout.c.h((V.o) this.f2176k, O0.g.b(j3), O0.g.a(j3), 0.0f, 0.0f, 12);
                        InterfaceC1094H e3 = AbstractC1177p.e(V.b.f5832i, false);
                        int i2 = c0285q5.f4194P;
                        InterfaceC0282o0 n3 = c0285q5.n();
                        V.o d3 = V.a.d(c0285q5, h2);
                        InterfaceC1253k.f10606f.getClass();
                        C1251i c1251i = C1252j.f10598b;
                        if (!(c0285q5.f4195a instanceof InterfaceC0259d)) {
                            C0257c.I();
                            throw null;
                        }
                        c0285q5.Y();
                        if (c0285q5.f4193O) {
                            c0285q5.m(c1251i);
                        } else {
                            c0285q5.h0();
                        }
                        C0257c.V(c0285q5, e3, C1252j.f10602f);
                        C0257c.V(c0285q5, n3, C1252j.f10601e);
                        C1250h c1250h = C1252j.f10603g;
                        if (c0285q5.f4193O || !z2.h.a(c0285q5.K(), Integer.valueOf(i2))) {
                            B1.t.q(i2, c0285q5, i2, c1250h);
                        }
                        C0257c.V(c0285q5, d3, C1252j.f10600d);
                        AbstractC1412c.b(null, c0285q5, 0, 1);
                        c0285q5.r(true);
                        c0285q5.r(false);
                    } else {
                        c0285q5.U(1829217412);
                        AbstractC1412c.b((V.o) this.f2176k, c0285q5, 0, 0);
                        c0285q5.r(false);
                    }
                }
                return C0880v.f8657a;
        }
    }
}
