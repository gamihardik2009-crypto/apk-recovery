package W1;

import H.AbstractC0107g0;
import H.C0093e0;
import H.D1;
import H.K2;
import H.R2;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.W;
import J.X0;
import c2.AbstractC0626c;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import m2.C0880v;
import s.AbstractC1173l;
import s.C1165d;
import s.C1170i;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;
import y.C1396d;

/* renamed from: W1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386g implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6030h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6031i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6032j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6033k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6034l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6035m;

    public /* synthetic */ C0386g(Object obj, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03, InterfaceC0258c0 interfaceC0258c04, int i2) {
        this.f6030h = i2;
        this.f6035m = obj;
        this.f6031i = interfaceC0258c0;
        this.f6032j = interfaceC0258c02;
        this.f6033k = interfaceC0258c03;
        this.f6034l = interfaceC0258c04;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0880v c0880v = C0880v.f8657a;
        W w2 = C0275l.f4150a;
        Object obj3 = this.f6035m;
        switch (this.f6030h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    c0285q.U(-1317736278);
                    boolean g3 = c0285q.g((y2.f) obj3);
                    Object K3 = c0285q.K();
                    if (g3 || K3 == w2) {
                        K3 = new C0385f((y2.f) obj3, this.f6031i, this.f6032j, this.f6033k, this.f6034l);
                        c0285q.e0(K3);
                    }
                    c0285q.r(false);
                    D1.a((y2.a) K3, null, false, y.e.a(12), null, null, null, null, null, T.f5996k, c0285q, 805306368, 502);
                }
                return c0880v;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    C1165d c1165d = AbstractC1173l.f10149a;
                    float f3 = 12;
                    C1170i c1170i = new C1170i(f3);
                    V.l lVar = V.l.f5857b;
                    s.S a3 = s.Q.a(c1170i, V.b.q, c0285q2, 6);
                    int i2 = c0285q2.f4194P;
                    InterfaceC0282o0 n3 = c0285q2.n();
                    V.o d3 = V.a.d(c0285q2, lVar);
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
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i2))) {
                        B1.t.q(i2, c0285q2, i2, c1250h);
                    }
                    C0257c.V(c0285q2, d3, C1252j.f10600d);
                    s.T t3 = s.T.f10079a;
                    DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) obj3;
                    String format = ((LocalTime) this.f6031i.getValue()).format(dateTimeFormatter);
                    z2.h.e(format, "format(...)");
                    V.o a4 = s.T.a(t3, lVar);
                    c0285q2.U(-1005791232);
                    Object K4 = c0285q2.K();
                    if (K4 == w2) {
                        K4 = new C0392m(this.f6032j, 20);
                        c0285q2.e0(K4);
                    }
                    c0285q2.r(false);
                    V.o e3 = androidx.compose.foundation.a.e(a4, false, null, (y2.a) K4, 7);
                    C1396d a5 = y.e.a(f3);
                    K2 k22 = K2.f1666a;
                    X0 x02 = AbstractC0107g0.f2597a;
                    R2.b(format, new P1.a(6), e3, false, true, null, AbstractC0626c.f7328j, null, null, null, null, null, null, false, null, null, null, false, 0, 0, null, a5, K2.d(0L, ((C0093e0) c0285q2.l(x02)).q, 0L, 0L, ((C0093e0) c0285q2.l(x02)).f2459A, 0L, ((C0093e0) c0285q2.l(x02)).f2500s, 0L, c0285q2, 2113921019), c0285q2, 1600560, 0, 0, 2097056);
                    String format2 = ((LocalTime) this.f6033k.getValue()).format(dateTimeFormatter);
                    z2.h.e(format2, "format(...)");
                    V.o a6 = s.T.a(t3, lVar);
                    c0285q2.U(-1005764930);
                    Object K5 = c0285q2.K();
                    if (K5 == w2) {
                        K5 = new C0392m(this.f6034l, 21);
                        c0285q2.e0(K5);
                    }
                    c0285q2.r(false);
                    R2.b(format2, new P1.a(7), androidx.compose.foundation.a.e(a6, false, null, (y2.a) K5, 7), false, true, null, AbstractC0626c.f7329k, null, null, null, null, null, null, false, null, null, null, false, 0, 0, null, y.e.a(f3), K2.d(0L, ((C0093e0) c0285q2.l(x02)).q, 0L, 0L, ((C0093e0) c0285q2.l(x02)).f2459A, 0L, ((C0093e0) c0285q2.l(x02)).f2500s, 0L, c0285q2, 2113921019), c0285q2, 1600560, 0, 0, 2097056);
                    c0285q2.r(true);
                }
                return c0880v;
        }
    }
}
