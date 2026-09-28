package H;

import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;

/* loaded from: classes.dex */
public final class L2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1701i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1702j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1703k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r.k f1704l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z4 f1705m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f1706n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L2(boolean z3, boolean z4, r.k kVar, Z4 z42, InterfaceC0576P interfaceC0576P, int i2) {
        super(2);
        this.f1701i = i2;
        this.f1702j = z3;
        this.f1703k = z4;
        this.f1704l = kVar;
        this.f1705m = z42;
        this.f1706n = interfaceC0576P;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f1701i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    K2.f1666a.a(this.f1702j, this.f1703k, (r.l) this.f1704l, this.f1705m, this.f1706n, 0.0f, 0.0f, c0285q, 12582912, 96);
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    K2.f1666a.a(this.f1702j, this.f1703k, (r.l) this.f1704l, this.f1705m, this.f1706n, 0.0f, 0.0f, c0285q2, 12582912, 96);
                }
                break;
            default:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    C0084c5.f2418a.a(this.f1702j, this.f1703k, this.f1704l, this.f1705m, this.f1706n, c0285q3, 196608, 0);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
