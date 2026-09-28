package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class D0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E0 f1395i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1396j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f1397k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1398l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1399m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(E0 e02, int i2, V.o oVar, int i3, int i4) {
        super(2);
        this.f1395i = e02;
        this.f1396j = i2;
        this.f1397k = oVar;
        this.f1398l = i3;
        this.f1399m = i4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1398l | 1);
        int i2 = this.f1396j;
        V.o oVar = this.f1397k;
        this.f1395i.b(i2, oVar, (C0285q) obj, Y2, this.f1399m);
        return C0880v.f8657a;
    }
}
