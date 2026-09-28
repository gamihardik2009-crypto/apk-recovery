package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import c0.C0603v;
import m.AbstractC0831e;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1177p;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class A2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0215w2 f1294i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1295j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1296k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f1297l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1298m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f1299n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(C0215w2 c0215w2, boolean z3, boolean z4, y2.e eVar, boolean z5, y2.e eVar2) {
        super(2);
        this.f1294i = c0215w2;
        this.f1295j = z3;
        this.f1296k = z4;
        this.f1297l = eVar;
        this.f1298m = z5;
        this.f1299n = eVar2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            C0215w2 c0215w2 = this.f1294i;
            c0215w2.getClass();
            c0285q.V(-1012982249);
            boolean z3 = this.f1296k;
            boolean z4 = this.f1295j;
            J.W0 a3 = l.M.a(!z3 ? c0215w2.f3253f : z4 ? c0215w2.f3248a : c0215w2.f3251d, AbstractC0831e.n(100, 0, null, 6), c0285q, 48);
            c0285q.r(false);
            y2.e eVar = this.f1297l;
            V.o oVar = V.l.f5857b;
            if (eVar != null && (this.f1298m || z4)) {
                oVar = A0.m.a(oVar, C0200u.f3159y);
            }
            c0285q.V(733328855);
            s.r f3 = AbstractC1177p.f(V.b.f5831h, false, c0285q, 0);
            c0285q.V(-1323940314);
            int i2 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i3 = AbstractC1108W.i(oVar);
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
            C0257c.a(AbstractC0183r0.f3050a.a(new C0603v(((C0603v) a3.getValue()).f7279a)), this.f1299n, c0285q, 8);
            B1.t.u(c0285q, false, true, false, false);
        }
        return C0880v.f8657a;
    }
}
