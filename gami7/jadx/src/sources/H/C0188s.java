package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1165d;
import s.C1180t;
import s.C1181u;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* renamed from: H.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188s extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3071i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.f f3072j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0188s(y2.f fVar, int i2) {
        super(2);
        this.f3071i = i2;
        this.f3072j = fVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f3071i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    C1165d c1165d = AbstractC1173l.f10150b;
                    V.f fVar = V.b.f5840r;
                    c0285q.V(693286680);
                    V.l lVar = V.l.f5857b;
                    s.S a3 = s.Q.a(c1165d, fVar, c0285q, 54);
                    c0285q.V(-1323940314);
                    int i2 = c0285q.f4194P;
                    InterfaceC0282o0 n3 = c0285q.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i = C1252j.f10598b;
                    R.a i3 = AbstractC1108W.i(lVar);
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
                    this.f3072j.i(s.T.f10079a, c0285q, 6);
                    B1.t.u(c0285q, false, true, false, false);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    c0285q2.V(-483455358);
                    V.l lVar2 = V.l.f5857b;
                    C1180t a4 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q2, 0);
                    c0285q2.V(-1323940314);
                    int i4 = c0285q2.f4194P;
                    InterfaceC0282o0 n4 = c0285q2.n();
                    InterfaceC1253k.f10606f.getClass();
                    C1251i c1251i2 = C1252j.f10598b;
                    R.a i5 = AbstractC1108W.i(lVar2);
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
                    if (c0285q2.f4193O || !z2.h.a(c0285q2.K(), Integer.valueOf(i4))) {
                        B1.t.q(i4, c0285q2, i4, c1250h2);
                    }
                    B1.t.r(0, i5, new J.C0(c0285q2), c0285q2, 2058660585);
                    this.f3072j.i(C1181u.f10180a, c0285q2, 6);
                    B1.t.u(c0285q2, false, true, false, false);
                }
                return C0880v.f8657a;
        }
    }
}
