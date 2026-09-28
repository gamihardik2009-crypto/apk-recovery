package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class I4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1595i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.a f1596j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f1597k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.e f1599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f1600n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f1601o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f1602p;
    public final /* synthetic */ r.l q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1603r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1604s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I4(boolean z3, y2.a aVar, V.o oVar, boolean z4, y2.e eVar, y2.e eVar2, long j3, long j4, r.l lVar, int i2, int i3) {
        super(2);
        this.f1595i = z3;
        this.f1596j = aVar;
        this.f1597k = oVar;
        this.f1598l = z4;
        this.f1599m = eVar;
        this.f1600n = eVar2;
        this.f1601o = j3;
        this.f1602p = j4;
        this.q = lVar;
        this.f1603r = i2;
        this.f1604s = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1603r | 1);
        long j3 = this.f1602p;
        r.l lVar = this.q;
        O4.b(this.f1595i, this.f1596j, this.f1597k, this.f1598l, this.f1599m, this.f1600n, this.f1601o, j3, lVar, (C0285q) obj, Y2, this.f1604s);
        return C0880v.f8657a;
    }
}
