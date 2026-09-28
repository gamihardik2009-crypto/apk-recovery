package W1;

import H.AbstractC0107g0;
import H.C0093e0;
import H.D1;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import a.AbstractC0423a;
import m2.C0880v;
import s.C1160M;

/* loaded from: classes.dex */
public final class v implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6087h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6088i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f6089j;

    public /* synthetic */ v(InterfaceC0258c0 interfaceC0258c0, P p3, int i2) {
        this.f6087h = i2;
        this.f6088i = interfaceC0258c0;
        this.f6089j = p3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0880v c0880v = C0880v.f8657a;
        P p3 = this.f6089j;
        InterfaceC0258c0 interfaceC0258c0 = this.f6088i;
        switch (this.f6087h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q.A()) {
                    c0285q.U(-1968390472);
                    Object K3 = c0285q.K();
                    if (K3 == C0275l.f4150a) {
                        K3 = new C0392m(interfaceC0258c0, 6);
                        c0285q.e0(K3);
                    }
                    c0285q.r(false);
                    AbstractC0423a.h(p3, (y2.a) K3, new C0399u(p3, interfaceC0258c0), c0285q, 56);
                    break;
                } else {
                    c0285q.P();
                    break;
                }
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q2.A()) {
                    C0399u c0399u = new C0399u(interfaceC0258c0, p3, 1);
                    C1160M c1160m = H.A.f1274a;
                    D1.a(c0399u, null, false, null, H.A.a(((C0093e0) c0285q2.l(AbstractC0107g0.f2597a)).f2504w, c0285q2), null, null, null, null, T.f5986a, c0285q2, 805306368, 494);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
            default:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q3.A()) {
                    C0399u c0399u2 = new C0399u(interfaceC0258c0, p3, 2);
                    C1160M c1160m2 = H.A.f1274a;
                    D1.a(c0399u2, null, false, null, H.A.a(((C0093e0) c0285q3.l(AbstractC0107g0.f2597a)).f2504w, c0285q3), null, null, null, null, T.f5989d, c0285q3, 805306368, 494);
                    break;
                } else {
                    c0285q3.P();
                    break;
                }
        }
        return c0880v;
    }

    public v(P p3, InterfaceC0258c0 interfaceC0258c0) {
        this.f6087h = 0;
        this.f6089j = p3;
        this.f6088i = interfaceC0258c0;
    }
}
