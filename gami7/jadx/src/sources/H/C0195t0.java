package H;

import J.C0275l;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195t0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3124i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0195t0(String str, int i2) {
        super(2);
        this.f3124i = i2;
        this.f3125j = str;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0880v c0880v = C0880v.f8657a;
        V.l lVar = V.l.f5857b;
        switch (this.f3124i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((3 & ((Number) obj2).intValue()) != 2 || !c0285q.A()) {
                    t5.b(this.f3125j, A0.m.a(lVar, C0200u.f3148m), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 0, 0, 131068);
                    break;
                } else {
                    c0285q.P();
                    break;
                }
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((3 & ((Number) obj2).intValue()) != 2 || !c0285q2.A()) {
                    c0285q2.V(1090374478);
                    String str = this.f3125j;
                    boolean g3 = c0285q2.g(str);
                    Object K3 = c0285q2.K();
                    if (g3 || K3 == C0275l.f4150a) {
                        K3 = new A0.o(str, 5);
                        c0285q2.e0(K3);
                    }
                    c0285q2.r(false);
                    t5.b(this.f3125j, A0.m.b(lVar, false, (y2.c) K3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q2, 0, 0, 131068);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
            default:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0285q3.A()) {
                    t5.b(this.f3125j, A0.m.a(lVar, C0200u.f3155u), 0L, 0L, null, null, null, 0L, null, new N0.i(3), 0L, 0, false, 0, 0, null, null, c0285q3, 0, 0, 130556);
                    break;
                } else {
                    c0285q3.P();
                    break;
                }
        }
        return c0880v;
    }
}
