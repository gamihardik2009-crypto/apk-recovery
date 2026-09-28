package H;

import J.C0257c;
import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;

/* loaded from: classes.dex */
public final class I2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K2 f1584i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1585j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1586k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r.k f1587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z4 f1588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f1589n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f1590o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f1591p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1592r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(K2 k22, boolean z3, boolean z4, r.k kVar, Z4 z42, InterfaceC0576P interfaceC0576P, float f3, float f4, int i2, int i3) {
        super(2);
        this.f1584i = k22;
        this.f1585j = z3;
        this.f1586k = z4;
        this.f1587l = kVar;
        this.f1588m = z42;
        this.f1589n = interfaceC0576P;
        this.f1590o = f3;
        this.f1591p = f4;
        this.q = i2;
        this.f1592r = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.q | 1);
        float f3 = this.f1590o;
        float f4 = this.f1591p;
        this.f1584i.a(this.f1585j, this.f1586k, this.f1587l, this.f1588m, this.f1589n, f3, f4, (C0285q) obj, Y2, this.f1592r);
        return C0880v.f8657a;
    }
}
