package H;

import J.C0275l;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class M0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1727i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B1 f1728j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M0(B1 b12, int i2) {
        super(2);
        this.f1727i = i2;
        this.f1728j = b12;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f1727i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    E0.f1423a.b(this.f1728j.a(), androidx.compose.foundation.layout.a.h(V.l.f5857b, A1.f1291e), c0285q, 432, 0);
                }
                break;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.o h2 = androidx.compose.foundation.layout.a.h(V.l.f5857b, A1.f1290d);
                    B1 b12 = this.f1728j;
                    int a3 = b12.a();
                    c0285q2.V(-1036920264);
                    boolean g3 = c0285q2.g(b12);
                    Object K3 = c0285q2.K();
                    if (g3 || K3 == C0275l.f4150a) {
                        K3 = new N0(b12, 0);
                        c0285q2.e0(K3);
                    }
                    c0285q2.r(false);
                    A1.e(h2, a3, (y2.c) K3, c0285q2, 6);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
