package H;

import J.C0257c;
import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;

/* loaded from: classes.dex */
public final class I5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1605i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f1606j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.a f1607k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u5 f1608l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.f f1609m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1610n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I5(boolean z3, InterfaceC0576P interfaceC0576P, y2.a aVar, u5 u5Var, y2.f fVar, int i2) {
        super(2);
        this.f1605i = z3;
        this.f1606j = interfaceC0576P;
        this.f1607k = aVar;
        this.f1608l = u5Var;
        this.f1609m = fVar;
        this.f1610n = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1610n | 1);
        u5 u5Var = this.f1608l;
        y2.f fVar = this.f1609m;
        K5.e(this.f1605i, this.f1606j, this.f1607k, u5Var, fVar, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
