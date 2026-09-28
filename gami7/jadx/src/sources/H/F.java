package H;

import J.C0275l;
import J.C0285q;
import m2.C0880v;
import s.C1160M;
import s.InterfaceC1159L;

/* loaded from: classes.dex */
public final class F extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1451i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1452j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1453k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1454l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(long j3, Object obj, Object obj2, int i2) {
        super(2);
        this.f1451i = i2;
        this.f1452j = j3;
        this.f1453k = obj;
        this.f1454l = obj2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = 1;
        C0880v c0880v = C0880v.f8657a;
        Object obj3 = this.f1454l;
        Object obj4 = this.f1453k;
        int i3 = 2;
        switch (this.f1451i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0285q.A()) {
                    D1.h(this.f1452j, ((O5) c0285q.l(P5.f1917a)).f1866m, R.b.b(c0285q, 1327513942, new C0148m((InterfaceC1159L) obj4, i2, (y2.f) obj3)), c0285q, 384);
                    break;
                } else {
                    c0285q.P();
                    break;
                }
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0285q2.A()) {
                    C1160M c1160m = A.f1274a;
                    C0230z d3 = A.d(0L, this.f1452j, c0285q2, 13);
                    c0285q2.V(-2057496839);
                    W3 w3 = (W3) obj4;
                    boolean g3 = c0285q2.g(w3);
                    Object K3 = c0285q2.K();
                    if (g3 || K3 == C0275l.f4150a) {
                        K3 = new Q3(w3, 1);
                        c0285q2.e0(K3);
                    }
                    c0285q2.r(false);
                    D1.j((y2.a) K3, null, false, null, d3, null, null, null, null, R.b.b(c0285q2, 521110564, new D.e0(i3, (String) obj3)), c0285q2, 805306368, 494);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
                break;
            default:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0285q3.A()) {
                    AbstractC0140k5.b(this.f1452j, (C0.K) obj4, (y2.e) obj3, c0285q3, 0, 0);
                    break;
                } else {
                    c0285q3.P();
                    break;
                }
        }
        return c0880v;
    }
}
