package H;

import J.C0275l;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.f4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104f4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2587i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W3 f2588j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0104f4(W3 w3, int i2) {
        super(2);
        this.f2587i = i2;
        this.f2588j = w3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2587i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    t5.b(this.f2588j.f2118a.f2158a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 0, 0, 131070);
                }
                break;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    c0285q2.V(-2057496502);
                    W3 w3 = this.f2588j;
                    boolean g3 = c0285q2.g(w3);
                    Object K3 = c0285q2.K();
                    if (g3 || K3 == C0275l.f4150a) {
                        K3 = new Q3(w3, 2);
                        c0285q2.e0(K3);
                    }
                    c0285q2.r(false);
                    D1.e((y2.a) K3, null, false, null, null, AbstractC0163o0.f2960a, c0285q2, 196608, 30);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
