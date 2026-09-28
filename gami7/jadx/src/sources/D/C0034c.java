package D;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import m2.C0880v;
import s.AbstractC1166e;
import s.C1165d;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: D.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034c extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f817i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f818j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f819k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0045n f820l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0034c(long j3, boolean z3, V.o oVar, InterfaceC0045n interfaceC0045n) {
        super(2);
        this.f817i = j3;
        this.f818j = z3;
        this.f819k = oVar;
        this.f820l = interfaceC0045n;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            long j3 = this.f817i;
            J.W w2 = C0275l.f4150a;
            InterfaceC0045n interfaceC0045n = this.f820l;
            boolean z3 = this.f818j;
            if (j3 != 9205357640488583168L) {
                c0285q.U(-837727128);
                C1165d c1165d = z3 ? AbstractC1166e.f10134b : AbstractC1166e.f10133a;
                V.o h2 = androidx.compose.foundation.layout.c.h(this.f819k, O0.g.b(j3), O0.g.a(j3), 0.0f, 0.0f, 12);
                s.S a3 = s.Q.a(c1165d, V.b.q, c0285q, 0);
                int i2 = c0285q.f4194P;
                InterfaceC0282o0 n3 = c0285q.n();
                V.o d3 = V.a.d(c0285q, h2);
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
                    B1.t.q(i2, c0285q, i2, c1250h);
                }
                C0257c.V(c0285q, d3, C1252j.f10600d);
                V.l lVar = V.l.f5857b;
                boolean i3 = c0285q.i(interfaceC0045n);
                Object K3 = c0285q.K();
                if (i3 || K3 == w2) {
                    K3 = new C0033b(interfaceC0045n, 0);
                    c0285q.e0(K3);
                }
                K1.f.i(lVar, (y2.a) K3, z3, c0285q, 6);
                c0285q.r(true);
                c0285q.r(false);
            } else {
                c0285q.U(-836867312);
                boolean i4 = c0285q.i(interfaceC0045n);
                Object K4 = c0285q.K();
                if (i4 || K4 == w2) {
                    K4 = new C0033b(interfaceC0045n, 1);
                    c0285q.e0(K4);
                }
                K1.f.i(this.f819k, (y2.a) K4, z3, c0285q, 0);
                c0285q.r(false);
            }
        }
        return C0880v.f8657a;
    }
}
