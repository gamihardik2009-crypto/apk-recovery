package D;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import r0.AbstractC1108W;

/* loaded from: classes.dex */
public final class Q extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f756i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f757j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f758k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f759l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f760m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(V.o oVar, y2.e eVar, int i2, int i3, int i4) {
        super(2);
        this.f756i = i4;
        this.f757j = oVar;
        this.f758k = eVar;
        this.f759l = i2;
        this.f760m = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f756i;
        C0285q c0285q = (C0285q) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                K1.f.k(this.f757j, this.f758k, c0285q, C0257c.Y(this.f759l | 1), this.f760m);
                break;
            case 1:
                C1.y.g(this.f757j, this.f758k, c0285q, C0257c.Y(this.f759l | 1), this.f760m);
                break;
            default:
                AbstractC1108W.b(this.f757j, this.f758k, c0285q, C0257c.Y(this.f759l | 1), this.f760m);
                break;
        }
        return C0880v.f8657a;
    }
}
