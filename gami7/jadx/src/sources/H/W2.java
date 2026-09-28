package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class W2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.a f2111i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f2112j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2113k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2115m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2116n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2117o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(y2.a aVar, V.o oVar, long j3, long j4, int i2, int i3, int i4) {
        super(2);
        this.f2111i = aVar;
        this.f2112j = oVar;
        this.f2113k = j3;
        this.f2114l = j4;
        this.f2115m = i2;
        this.f2116n = i3;
        this.f2117o = i4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f2116n | 1);
        long j3 = this.f2114l;
        int i2 = this.f2115m;
        X2.a(this.f2111i, this.f2112j, this.f2113k, j3, i2, (C0285q) obj, Y2, this.f2117o);
        return C0880v.f8657a;
    }
}
