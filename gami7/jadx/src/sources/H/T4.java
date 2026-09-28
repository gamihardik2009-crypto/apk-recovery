package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class T4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2012i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f2013j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2014k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2015l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f2016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.f f2017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f2018o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f2019p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2020r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(int i2, V.o oVar, long j3, long j4, float f3, y2.f fVar, y2.e eVar, y2.e eVar2, int i3, int i4) {
        super(2);
        this.f2012i = i2;
        this.f2013j = oVar;
        this.f2014k = j3;
        this.f2015l = j4;
        this.f2016m = f3;
        this.f2017n = fVar;
        this.f2018o = eVar;
        this.f2019p = eVar2;
        this.q = i3;
        this.f2020r = i4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.q | 1);
        y2.e eVar = this.f2018o;
        y2.e eVar2 = this.f2019p;
        X4.a(this.f2012i, this.f2013j, this.f2014k, this.f2015l, this.f2016m, this.f2017n, eVar, eVar2, (C0285q) obj, Y2, this.f2020r);
        return C0880v.f8657a;
    }
}
