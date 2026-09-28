package d2;

import B1.t;
import H.AbstractC0107g0;
import H.AbstractC0162o;
import H.C0093e0;
import H.O5;
import H.P5;
import H.t5;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.W;
import J.W0;
import J.X0;
import V.o;
import W1.C0389j;
import W1.C0392m;
import W1.C0395p;
import W1.C0396q;
import Y1.C0422h;
import androidx.compose.foundation.layout.FillElement;
import c0.AbstractC0571K;
import m2.C0880v;
import n2.AbstractC0949a;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1170i;
import s.C1180t;
import s.InterfaceC1159L;
import t0.C1250h;
import t0.C1251i;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class i implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7514h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7515i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f7516j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7517k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W0 f7518l;

    public i(InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, n nVar, InterfaceC0258c0 interfaceC0258c03, InterfaceC0258c0 interfaceC0258c04) {
        this.f7514h = interfaceC0258c0;
        this.f7515i = interfaceC0258c02;
        this.f7516j = nVar;
        this.f7517k = interfaceC0258c03;
        this.f7518l = interfaceC0258c04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q;
        ?? r22;
        InterfaceC1159L interfaceC1159L = (InterfaceC1159L) obj;
        C0285q c0285q2 = (C0285q) obj2;
        int intValue = ((Number) obj3).intValue();
        z2.h.f(interfaceC1159L, "paddingValues");
        if ((intValue & 14) == 0) {
            intValue |= c0285q2.g(interfaceC1159L) ? 4 : 2;
        }
        if ((intValue & 91) == 18 && c0285q2.A()) {
            c0285q2.P();
        } else {
            c0285q2.U(-96646777);
            InterfaceC0258c0 interfaceC0258c0 = this.f7514h;
            boolean booleanValue = ((Boolean) interfaceC0258c0.getValue()).booleanValue();
            W w2 = C0275l.f4150a;
            n nVar = this.f7516j;
            if (booleanValue) {
                InterfaceC0258c0 interfaceC0258c02 = this.f7515i;
                R1.e eVar = (R1.e) interfaceC0258c02.getValue();
                c0285q2.U(-96643322);
                Object K3 = c0285q2.K();
                if (K3 == w2) {
                    K3 = new C0395p(interfaceC0258c0, interfaceC0258c02, 1);
                    c0285q2.e0(K3);
                }
                c0285q2.r(false);
                K1.f.a(eVar, (y2.a) K3, new C0396q(nVar, interfaceC0258c02, interfaceC0258c0, 1), c0285q2, 48);
            }
            c0285q2.r(false);
            c0285q2.U(-96623502);
            InterfaceC0258c0 interfaceC0258c03 = this.f7517k;
            if (((R1.e) interfaceC0258c03.getValue()) != null) {
                c0285q2.U(-96621383);
                Object K4 = c0285q2.K();
                if (K4 == w2) {
                    K4 = new C0392m(interfaceC0258c03, 25);
                    c0285q2.e0(K4);
                }
                c0285q2.r(false);
                AbstractC0162o.a((y2.a) K4, R.b.c(1783595110, new P1.l(interfaceC0258c03, 4, nVar), c0285q2), null, R.b.c(1710010532, new C0389j(interfaceC0258c03, 12), c0285q2), null, c.f7485d, c.f7486e, null, 0L, 0L, 0L, 0L, 0.0f, null, c0285q2, 1772598, 0, 16276);
                c0285q = c0285q2;
                r22 = 0;
            } else {
                c0285q = c0285q2;
                r22 = 0;
            }
            c0285q.r(r22);
            V.l lVar = V.l.f5857b;
            FillElement fillElement = androidx.compose.foundation.layout.c.f6640b;
            X0 x02 = AbstractC0107g0.f2597a;
            float f3 = 20;
            o k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.a.h(androidx.compose.foundation.a.b(fillElement, ((C0093e0) c0285q.l(x02)).f2496n, AbstractC0571K.f7193a), interfaceC1159L), f3, 0.0f, 2);
            C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q, r22);
            int i2 = c0285q.f4194P;
            InterfaceC0282o0 n3 = c0285q.n();
            o d3 = V.a.d(c0285q, k3);
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
                t.q(i2, c0285q, i2, c1250h);
            }
            C0257c.V(c0285q, d3, C1252j.f10600d);
            AbstractC1166e.a(c0285q, androidx.compose.foundation.layout.c.b(lVar, 24));
            C0285q c0285q3 = c0285q;
            t5.b("SMS Templates", null, ((C0093e0) c0285q.l(x02)).q, 0L, null, H0.k.f3404m, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q.l(P5.f1917a)).f1858e, c0285q3, 196614, 0, 65498);
            AbstractC1166e.a(c0285q3, androidx.compose.foundation.layout.c.b(lVar, f3));
            AbstractC0949a.a(null, null, androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, 100, 7), false, new C1170i(f3), null, null, false, new C0422h(this.f7518l, this.f7516j, this.f7515i, this.f7514h, this.f7517k), c0285q3, 24960, 235);
            c0285q3.r(true);
        }
        return C0880v.f8657a;
    }
}
