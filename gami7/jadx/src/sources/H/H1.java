package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class H1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f1558i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1559j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1560k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1561l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1562m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(V.o oVar, float f3, long j3, int i2, int i3) {
        super(2);
        this.f1558i = oVar;
        this.f1559j = f3;
        this.f1560k = j3;
        this.f1561l = i2;
        this.f1562m = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1561l | 1);
        float f3 = this.f1559j;
        long j3 = this.f1560k;
        D1.d(this.f1558i, f3, j3, (C0285q) obj, Y2, this.f1562m);
        return C0880v.f8657a;
    }
}
