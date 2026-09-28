package R0;

import J.C0285q;
import J.W0;
import m2.C0880v;

/* loaded from: classes.dex */
public final class d extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5396i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W0 f5397j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(W0 w02, int i2) {
        super(2);
        this.f5396i = i2;
        this.f5397j = w02;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0880v c0880v = C0880v.f8657a;
        W0 w02 = this.f5397j;
        int i2 = 0;
        switch (this.f5396i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0285q.A()) {
                    ((y2.e) w02.getValue()).j(c0285q, 0);
                    break;
                } else {
                    c0285q.P();
                    break;
                }
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0285q2.A()) {
                    C1.y.g(A0.m.b(V.l.f5857b, false, c.f5389j), R.b.c(-533674951, new d(w02, i2), c0285q2), c0285q2, 48, 0);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
            default:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0285q3.A()) {
                    J.B b3 = k.f5415a;
                    ((y2.e) w02.getValue()).j(c0285q3, 0);
                    break;
                } else {
                    c0285q3.P();
                    break;
                }
                break;
        }
        return c0880v;
    }
}
