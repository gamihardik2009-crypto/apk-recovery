package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1168g;
import s.C1180t;
import s.C1181u;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class J4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f1643i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1644j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r.l f1645k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n.T f1646l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1647m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.a f1648n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.f f1649o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(V.o oVar, boolean z3, r.l lVar, G.e eVar, boolean z4, y2.a aVar, y2.f fVar) {
        super(2);
        this.f1643i = oVar;
        this.f1644j = z3;
        this.f1645k = lVar;
        this.f1646l = eVar;
        this.f1647m = z4;
        this.f1648n = aVar;
        this.f1649o = fVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            A0.h hVar = new A0.h(4);
            V.o k3 = androidx.compose.foundation.selection.b.a(this.f1643i, this.f1644j, this.f1645k, this.f1646l, this.f1647m, hVar, this.f1648n).k(androidx.compose.foundation.layout.c.f6639a);
            V.e eVar = V.b.f5843u;
            C1168g c1168g = AbstractC1173l.f10153e;
            c0285q.V(-483455358);
            C1180t a3 = AbstractC1179s.a(c1168g, eVar, c0285q, 54);
            c0285q.V(-1323940314);
            int i2 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i3 = AbstractC1108W.i(k3);
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
            B1.t.r(0, i3, new J.C0(c0285q), c0285q, 2058660585);
            this.f1649o.i(C1181u.f10180a, c0285q, 6);
            B1.t.u(c0285q, false, true, false, false);
        }
        return C0880v.f8657a;
    }
}
