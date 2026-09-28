package W1;

import H.D1;
import H.V;
import H.t5;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import c0.C0603v;
import m2.C0880v;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1180t;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class E implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f5920h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U f5921i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.a f5922j;

    public E(boolean z3, U u3, y2.a aVar) {
        this.f5920h = z3;
        this.f5921i = u3;
        this.f5922j = aVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        long j3;
        C0285q c0285q;
        boolean z3;
        long j4;
        C0285q c0285q2 = (C0285q) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
            c0285q2.P();
        } else {
            V.l lVar = V.l.f5857b;
            V.o i2 = androidx.compose.foundation.layout.a.i(lVar, 12);
            s.S a3 = s.Q.a(AbstractC1173l.f10149a, V.b.f5840r, c0285q2, 48);
            int i3 = c0285q2.f4194P;
            InterfaceC0282o0 n3 = c0285q2.n();
            V.o d3 = V.a.d(c0285q2, i2);
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            boolean z4 = c0285q2.f4195a instanceof InterfaceC0259d;
            if (!z4) {
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
            s.T t3 = s.T.f10079a;
            boolean z5 = this.f5920h;
            U u3 = this.f5921i;
            boolean z6 = z5 || u3.f6004c;
            c0285q2.U(1583493980);
            y2.a aVar = this.f5922j;
            boolean g3 = c0285q2.g(aVar);
            Object K3 = c0285q2.K();
            if (g3 || K3 == C0275l.f4150a) {
                K3 = new D(0, aVar);
                c0285q2.e0(K3);
            }
            c0285q2.r(false);
            V.a(z6, (y2.c) K3, null, !u3.f6004c, null, null, c0285q2, 0, 52);
            AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.n(lVar, 8));
            V.o a4 = s.T.a(t3, lVar);
            C1180t a5 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q2, 0);
            int i4 = c0285q2.f4194P;
            InterfaceC0282o0 n4 = c0285q2.n();
            V.o d4 = V.a.d(c0285q2, a4);
            if (!z4) {
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
            C0257c.V(c0285q2, n4, c1250h2);
            if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i4))) {
                B1.t.q(i4, c0285q2, i4, c1250h3);
            }
            C0257c.V(c0285q2, d4, c1250h4);
            C0.K k3 = D1.x(c0285q2).f1863j;
            H0.k kVar = H0.k.f3403l;
            boolean z7 = u3.f6004c;
            if (z7) {
                c0285q2.U(-1920075489);
                j3 = C0603v.b(0.5f, D1.t(c0285q2).q);
            } else {
                c0285q2.U(-1920073898);
                j3 = D1.t(c0285q2).q;
            }
            c0285q2.r(false);
            t5.b(u3.f6002a, null, j3, 0L, null, kVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, k3, c0285q2, 196608, 0, 65498);
            C0.K k4 = D1.x(c0285q2).f1865l;
            if (z7) {
                c0285q = c0285q2;
                c0285q.U(-1920065729);
                j4 = C0603v.b(0.5f, D1.t(c0285q).f2500s);
                z3 = false;
            } else {
                c0285q = c0285q2;
                z3 = false;
                c0285q.U(-1920064131);
                j4 = D1.t(c0285q).f2500s;
            }
            c0285q.r(z3);
            C0285q c0285q3 = c0285q;
            t5.b(u3.f6003b, null, j4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k4, c0285q3, 0, 0, 65530);
            c0285q3.r(true);
            c0285q3.U(1583522053);
            if (z7) {
                t5.b("Already Added", null, D1.t(c0285q3).f2483a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D1.x(c0285q3).f1868o, c0285q3, 6, 0, 65530);
            }
            c0285q3.r(false);
            c0285q3.r(true);
        }
        return C0880v.f8657a;
    }
}
