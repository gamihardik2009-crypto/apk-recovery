package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class K4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1673i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.a f1674j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f1675k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1676l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1677m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f1678n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r.l f1679o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.f f1680p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1681r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4(boolean z3, y2.a aVar, V.o oVar, boolean z4, long j3, long j4, r.l lVar, y2.f fVar, int i2, int i3) {
        super(2);
        this.f1673i = z3;
        this.f1674j = aVar;
        this.f1675k = oVar;
        this.f1676l = z4;
        this.f1677m = j3;
        this.f1678n = j4;
        this.f1679o = lVar;
        this.f1680p = fVar;
        this.q = i2;
        this.f1681r = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.q | 1);
        r.l lVar = this.f1679o;
        y2.f fVar = this.f1680p;
        O4.a(this.f1673i, this.f1674j, this.f1675k, this.f1676l, this.f1677m, this.f1678n, lVar, fVar, (C0285q) obj, Y2, this.f1681r);
        return C0880v.f8657a;
    }
}
