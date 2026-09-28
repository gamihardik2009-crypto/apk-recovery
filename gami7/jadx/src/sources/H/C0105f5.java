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

/* renamed from: H.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105f5 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2589i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2590j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2591k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105f5(float f3, long j3, y2.e eVar) {
        super(3);
        this.f2589i = f3;
        this.f2590j = j3;
        this.f2591k = eVar;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        V.o oVar = (V.o) obj;
        C0285q c0285q = (C0285q) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c0285q.g(oVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            V.o m3 = l0.c.m(oVar, this.f2589i);
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
            AbstractC0140k5.b(this.f2590j, ((O5) c0285q.l(P5.f1917a)).f1863j, this.f2591k, c0285q, 0, 0);
            B1.t.u(c0285q, false, true, false, false);
        }
        return C0880v.f8657a;
    }
}
