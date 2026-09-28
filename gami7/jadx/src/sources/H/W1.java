package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1173l;
import s.InterfaceC1169h;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class W1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f2108i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2109j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2110k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(boolean z3, y2.e eVar, y2.e eVar2) {
        super(2);
        this.f2108i = z3;
        this.f2109j = eVar;
        this.f2110k = eVar2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            boolean z3 = this.f2108i;
            V.o l3 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.m(V.l.f5857b, z3 ? AbstractC0067a2.f2286d : I.j.f3681d, 0.0f, 14), z3 ? AbstractC0067a2.f2283a : 0, 0.0f, z3 ? AbstractC0067a2.f2285c : 0, 0.0f, 10);
            V.f fVar = V.b.f5840r;
            boolean z4 = this.f2108i;
            InterfaceC1169h interfaceC1169h = z4 ? AbstractC1173l.f10149a : AbstractC1173l.f10153e;
            c0285q.V(693286680);
            s.S a3 = s.Q.a(interfaceC1169h, fVar, c0285q, 48);
            c0285q.V(-1323940314);
            int i2 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            InterfaceC1253k.f10606f.getClass();
            C1251i c1251i = C1252j.f10598b;
            R.a i3 = AbstractC1108W.i(l3);
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
            s.T t3 = s.T.f10079a;
            this.f2109j.j(c0285q, 0);
            androidx.compose.animation.a.b(t3, z4, null, AbstractC0067a2.f2288f, AbstractC0067a2.f2287e, null, R.b.b(c0285q, 176242764, new D.e0(1, this.f2110k)), c0285q, 1600518, 18);
            B1.t.u(c0285q, false, true, false, false);
        }
        return C0880v.f8657a;
    }
}
