package W1;

import H.AbstractC0067a2;
import H.AbstractC0107g0;
import H.AbstractC0223x4;
import H.C0093e0;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.V0;
import J.W;
import a.AbstractC0423a;
import android.content.Context;
import c.C0556f;
import c0.C0578S;
import c0.C0603v;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
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
import y.C1396d;

/* renamed from: W1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394o implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6057h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6058i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6059j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6060k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f6061l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f6062m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0556f f6063n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6064o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0556f f6065p;

    public /* synthetic */ C0394o(InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03, Context context, P p3, C0556f c0556f, InterfaceC0258c0 interfaceC0258c04, C0556f c0556f2, int i2) {
        this.f6057h = i2;
        this.f6058i = interfaceC0258c0;
        this.f6059j = interfaceC0258c02;
        this.f6060k = interfaceC0258c03;
        this.f6061l = context;
        this.f6062m = p3;
        this.f6063n = c0556f;
        this.f6064o = interfaceC0258c04;
        this.f6065p = c0556f2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0880v c0880v;
        W w2;
        boolean z3;
        C0880v c0880v2 = C0880v.f8657a;
        W w3 = C0275l.f4150a;
        int i2 = 2;
        switch (this.f6057h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    V.o i3 = androidx.compose.foundation.layout.a.i(V.l.f5857b, 12);
                    C1165d c1165d = AbstractC1173l.f10149a;
                    C1180t a3 = AbstractC1179s.a(new C1170i(10), V.b.f5844v, c0285q, 54);
                    int i4 = c0285q.f4194P;
                    InterfaceC0282o0 n3 = c0285q.n();
                    V.o d3 = V.a.d(c0285q, i3);
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
                    if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i4))) {
                        B1.t.q(i4, c0285q, i4, c1250h);
                    }
                    C0257c.V(c0285q, d3, C1252j.f10600d);
                    C0712e r3 = B2.a.r();
                    c0285q.U(-1412900407);
                    Object K3 = c0285q.K();
                    InterfaceC0258c0 interfaceC0258c0 = this.f6058i;
                    if (K3 == w3) {
                        K3 = new C0393n(interfaceC0258c0, this.f6059j, this.f6060k);
                        c0285q.e0(K3);
                    }
                    c0285q.r(false);
                    AbstractC0423a.j(r3, "Add Manually", (y2.a) K3, c0285q, 432);
                    AbstractC0423a.j(K1.f.y(), "Import Contacts", new C0385f(this.f6061l, this.f6062m, this.f6063n, interfaceC0258c0, this.f6064o), c0285q, 48);
                    C0712e c0712e = B2.a.f319e;
                    if (c0712e == null) {
                        C0711d c0711d = new C0711d("Filled.Share", false);
                        int i5 = AbstractC0732y.f7958a;
                        C0578S c0578s = new C0578S(C0603v.f7272b);
                        V0 v0 = new V0(1);
                        v0.h(18.0f, 16.08f);
                        v0.c(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
                        v0.f(8.91f, 12.7f);
                        v0.c(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                        v0.j(-0.04f, -0.47f, -0.09f, -0.7f);
                        v0.g(7.05f, -4.11f);
                        v0.c(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                        v0.c(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                        v0.j(-1.34f, -3.0f, -3.0f, -3.0f);
                        v0.j(-3.0f, 1.34f, -3.0f, 3.0f);
                        v0.c(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                        v0.f(8.04f, 9.81f);
                        v0.b(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                        v0.c(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                        v0.j(1.34f, 3.0f, 3.0f, 3.0f);
                        v0.c(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
                        v0.g(7.12f, 4.16f);
                        v0.c(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                        v0.c(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                        v0.c(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
                        v0.j(-1.31f, -2.92f, -2.92f, -2.92f);
                        v0.a();
                        C0711d.a(c0711d, v0.f4104h, c0578s);
                        c0712e = c0711d.b();
                        B2.a.f319e = c0712e;
                    }
                    AbstractC0423a.j(c0712e, "Import CSV", new P1.f(this.f6065p, i2, interfaceC0258c0), c0285q, 48);
                    c0285q.r(true);
                }
                return c0880v2;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c0285q2.A()) {
                    c0285q2.P();
                    return c0880v2;
                }
                V.e eVar = V.b.f5844v;
                V.l lVar = V.l.f5857b;
                C1180t a4 = AbstractC1179s.a(AbstractC1173l.f10151c, eVar, c0285q2, 48);
                int i6 = c0285q2.f4194P;
                InterfaceC0282o0 n4 = c0285q2.n();
                V.o d4 = V.a.d(c0285q2, lVar);
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
                C0257c.V(c0285q2, a4, C1252j.f10602f);
                C0257c.V(c0285q2, n4, C1252j.f10601e);
                C1250h c1250h2 = C1252j.f10603g;
                if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i6))) {
                    B1.t.q(i6, c0285q2, i6, c1250h2);
                }
                C0257c.V(c0285q2, d4, C1252j.f10600d);
                c0285q2.U(-1968693560);
                InterfaceC0258c0 interfaceC0258c02 = this.f6058i;
                if (((Boolean) interfaceC0258c02.getValue()).booleanValue()) {
                    float f3 = 8;
                    c0880v = c0880v2;
                    w2 = w3;
                    AbstractC0223x4.a(androidx.compose.foundation.layout.a.l(lVar, 0.0f, 0.0f, 0.0f, 16, 7), y.e.a(20), ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2498p, 0L, f3, f3, null, R.b.c(1460207209, new C0394o(interfaceC0258c02, this.f6059j, this.f6060k, this.f6061l, this.f6062m, this.f6063n, this.f6064o, this.f6065p, 0), c0285q2), c0285q2, 12804102, 72);
                } else {
                    c0880v = c0880v2;
                    w2 = w3;
                }
                c0285q2.r(false);
                long j3 = ((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2483a;
                long j4 = C0603v.f7273c;
                C1396d c1396d = y.e.f11486a;
                c0285q2.U(-1968616519);
                Object K4 = c0285q2.K();
                if (K4 == w2) {
                    z3 = false;
                    K4 = new C0392m(interfaceC0258c02, 0);
                    c0285q2.e0(K4);
                } else {
                    z3 = false;
                }
                c0285q2.r(z3);
                AbstractC0067a2.b((y2.a) K4, null, c1396d, j3, j4, null, null, R.b.c(745972893, new C0389j(interfaceC0258c02, 1), c0285q2), c0285q2, 12607494, 98);
                c0285q2.r(true);
                return c0880v;
        }
    }
}
