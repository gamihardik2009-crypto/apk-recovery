package H;

import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class D3 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1405i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0210v3 f1406j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1407k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D3(C0210v3 c0210v3, boolean z3, int i2) {
        super(3);
        this.f1405i = i2;
        this.f1406j = c0210v3;
        this.f1407k = z3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f1405i) {
            case 0:
                P3 p3 = (P3) obj;
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0285q.g(p3) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && c0285q.A()) {
                    c0285q.P();
                } else {
                    B3.f1350a.c(p3, null, this.f1406j, this.f1407k, c0285q, (intValue & 14) | 24576, 2);
                }
                break;
            case 1:
                P3 p32 = (P3) obj;
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c0285q2.g(p32) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    B3.f1350a.c(p32, null, this.f1406j, this.f1407k, c0285q2, (intValue2 & 14) | 24576, 2);
                }
                break;
            default:
                P3 p33 = (P3) obj;
                C0285q c0285q3 = (C0285q) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c0285q3.g(p33) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    B3.f1350a.c(p33, null, this.f1406j, this.f1407k, c0285q3, (intValue3 & 14) | 24576, 2);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
