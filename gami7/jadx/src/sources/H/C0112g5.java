package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1177p;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: H.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112g5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2628i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f2629j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2630k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0.K f2631l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.e f2632m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0112g5(float f3, long j3, C0.K k3, y2.e eVar, int i2) {
        super(2);
        this.f2628i = i2;
        this.f2629j = f3;
        this.f2630k = j3;
        this.f2631l = k3;
        this.f2632m = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2628i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    V.o m3 = l0.c.m(V.l.f5857b, this.f2629j);
                    c0285q.V(733328855);
                    s.r f3 = AbstractC1177p.f(V.b.f5831h, false, c0285q, 0);
                    c0285q.V(-1323940314);
                    int i2 = c0285q.f4194P;
                    InterfaceC0282o0 n3 = c0285q.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i = C1252j.f10598b;
                    R.a i3 = AbstractC1108W.i(m3);
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
                    C0257c.V(c0285q, f3, C1252j.f10602f);
                    C0257c.V(c0285q, n3, C1252j.f10601e);
                    C1250h c1250h = C1252j.f10603g;
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
                        B1.t.q(i2, c0285q, i2, c1250h);
                    }
                    B1.t.r(0, i3, new J.C0(c0285q), c0285q, 2058660585);
                    AbstractC0140k5.b(this.f2630k, this.f2631l, this.f2632m, c0285q, 0, 0);
                    B1.t.u(c0285q, false, true, false, false);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.o m4 = l0.c.m(V.l.f5857b, this.f2629j);
                    c0285q2.V(733328855);
                    s.r f4 = AbstractC1177p.f(V.b.f5831h, false, c0285q2, 0);
                    c0285q2.V(-1323940314);
                    int i4 = c0285q2.f4194P;
                    InterfaceC0282o0 n4 = c0285q2.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i2 = C1252j.f10598b;
                    R.a i5 = AbstractC1108W.i(m4);
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
                    C0257c.V(c0285q2, f4, C1252j.f10602f);
                    C0257c.V(c0285q2, n4, C1252j.f10601e);
                    C1250h c1250h2 = C1252j.f10603g;
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i4))) {
                        B1.t.q(i4, c0285q2, i4, c1250h2);
                    }
                    B1.t.r(0, i5, new J.C0(c0285q2), c0285q2, 2058660585);
                    AbstractC0140k5.b(this.f2630k, this.f2631l, this.f2632m, c0285q2, 0, 0);
                    B1.t.u(c0285q2, false, true, false, false);
                }
                return C0880v.f8657a;
        }
    }
}
