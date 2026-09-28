package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class G5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f1538i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1539j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M5 f1540k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1541l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u5 f1542m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1543n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G5(V.o oVar, int i2, M5 m5, int i3, u5 u5Var, int i4) {
        super(2);
        this.f1538i = oVar;
        this.f1539j = i2;
        this.f1540k = m5;
        this.f1541l = i3;
        this.f1542m = u5Var;
        this.f1543n = i4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1543n | 1);
        int i2 = this.f1541l;
        u5 u5Var = this.f1542m;
        K5.d(this.f1538i, this.f1539j, this.f1540k, i2, u5Var, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
