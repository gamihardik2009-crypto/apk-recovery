package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202u1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.a f3170i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f3171j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f3172k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f3173l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3174m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3175n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0202u1(y2.a aVar, boolean z3, V.o oVar, y2.e eVar, int i2, int i3) {
        super(2);
        this.f3170i = aVar;
        this.f3171j = z3;
        this.f3172k = oVar;
        this.f3173l = eVar;
        this.f3174m = i2;
        this.f3175n = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f3174m | 1);
        V.o oVar = this.f3172k;
        y2.e eVar = this.f3173l;
        A1.n(this.f3170i, this.f3171j, oVar, eVar, (C0285q) obj, Y2, this.f3175n);
        return C0880v.f8657a;
    }
}
