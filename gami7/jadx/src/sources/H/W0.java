package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class W0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f2101i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2102j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2103k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2104l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f2105m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f2106n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2107o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(V.o oVar, y2.e eVar, long j3, long j4, float f3, y2.e eVar2, int i2) {
        super(2);
        this.f2101i = oVar;
        this.f2102j = eVar;
        this.f2103k = j3;
        this.f2104l = j4;
        this.f2105m = f3;
        this.f2106n = eVar2;
        this.f2107o = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f2107o | 1);
        float f3 = this.f2105m;
        y2.e eVar = this.f2106n;
        A1.c(this.f2101i, this.f2102j, this.f2103k, this.f2104l, f3, eVar, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
