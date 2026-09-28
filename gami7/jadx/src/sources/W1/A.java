package W1;

import H.AbstractC0107g0;
import H.C0093e0;
import H.O5;
import H.P5;
import H.t5;
import J.AbstractC0286q0;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J.W0;
import a.AbstractC0423a;
import androidx.compose.foundation.layout.FillElement;
import c0.AbstractC0571K;
import java.util.List;
import java.util.Set;
import m2.C0880v;
import n2.AbstractC0949a;
import s.AbstractC1166e;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1160M;
import s.C1170i;
import s.C1180t;
import s.InterfaceC1159L;
import t0.C1250h;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class A implements y2.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5904h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W0 f5905i;

    public /* synthetic */ A(W0 w02, int i2) {
        this.f5904h = i2;
        this.f5905i = w02;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f5904h) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.h.f((s.T) obj, "$this$Button");
                if ((intValue & 81) == 16 && c0285q.A()) {
                    c0285q.P();
                } else {
                    t5.b("Add Selected (" + ((Set) this.f5905i.getValue()).size() + ')', null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 0, 0, 131070);
                }
                return C0880v.f8657a;
            default:
                InterfaceC1159L interfaceC1159L = (InterfaceC1159L) obj;
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                z2.h.f(interfaceC1159L, "paddingValues");
                if ((intValue2 & 14) == 0) {
                    intValue2 |= c0285q2.g(interfaceC1159L) ? 4 : 2;
                }
                if ((intValue2 & 91) == 18 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.l lVar = V.l.f5857b;
                    FillElement fillElement = androidx.compose.foundation.layout.c.f6640b;
                    AbstractC0286q0 abstractC0286q0 = AbstractC0107g0.f2597a;
                    float f3 = 20;
                    V.o k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.a.h(androidx.compose.foundation.a.b(fillElement, ((C0093e0) c0285q2.l(abstractC0286q0)).f2496n, AbstractC0571K.f7193a), interfaceC1159L), f3, 0.0f, 2);
                    C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q2, 0);
                    int i2 = c0285q2.f4194P;
                    InterfaceC0282o0 n3 = c0285q2.n();
                    V.o d3 = V.a.d(c0285q2, k3);
                    InterfaceC1253k.f10606f.getClass();
                    y2.a aVar = C1252j.f10598b;
                    if (!(c0285q2.f4195a instanceof InterfaceC0259d)) {
                        C0257c.I();
                        throw null;
                    }
                    c0285q2.Y();
                    if (c0285q2.f4193O) {
                        c0285q2.m(aVar);
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
                    float f4 = 24;
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.b(lVar, f4));
                    t5.b("Failed Deliveries", null, ((C0093e0) c0285q2.l(abstractC0286q0)).q, 0L, null, H0.k.f3404m, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q2.l(P5.f1917a)).f1858e, c0285q2, 196614, 0, 65498);
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.b(lVar, f3));
                    AbstractC0423a.q(0, c0285q2);
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.b(lVar, f4));
                    StringBuilder sb = new StringBuilder("Failed Messages (");
                    W0 w02 = this.f5905i;
                    sb.append(((List) w02.getValue()).size());
                    sb.append(')');
                    l0.c.g(sb.toString(), null, c0285q2, 0, 2);
                    float f5 = 12;
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.b(lVar, f5));
                    C1170i c1170i = new C1170i(f5);
                    C1160M c3 = androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, 100, 7);
                    c0285q2.U(-286440211);
                    boolean g3 = c0285q2.g(w02);
                    Object K3 = c0285q2.K();
                    if (g3 || K3 == C0275l.f4150a) {
                        K3 = new D(1, w02);
                        c0285q2.e0(K3);
                    }
                    c0285q2.r(false);
                    AbstractC0949a.a(null, null, c3, false, c1170i, null, null, false, (y2.c) K3, c0285q2, 24960, 235);
                    c0285q2.r(true);
                }
                return C0880v.f8657a;
        }
    }
}
