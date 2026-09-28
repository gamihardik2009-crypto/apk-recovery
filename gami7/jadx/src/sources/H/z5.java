package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class z5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3384i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f3385j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M5 f3386k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u5 f3387l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3388m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(V.o oVar, u5 u5Var, M5 m5, int i2) {
        super(2);
        this.f3385j = oVar;
        this.f3387l = u5Var;
        this.f3386k = m5;
        this.f3388m = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f3384i;
        C0285q c0285q = (C0285q) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                K5.c(C0257c.Y(this.f3388m | 1), this.f3387l, this.f3386k, c0285q, this.f3385j);
                break;
            default:
                K5.f(C0257c.Y(this.f3388m | 1), this.f3387l, this.f3386k, c0285q, this.f3385j);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(V.o oVar, M5 m5, u5 u5Var, int i2) {
        super(2);
        this.f3385j = oVar;
        this.f3386k = m5;
        this.f3387l = u5Var;
        this.f3388m = i2;
    }
}
