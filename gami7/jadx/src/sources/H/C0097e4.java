package H;

import J.C0257c;
import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;

/* renamed from: H.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097e4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f2529i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2530j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2531k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2532l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f2533m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2534n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f2535o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f2536p;
    public final /* synthetic */ long q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.e f2537r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2538s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2539t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097e4(V.o oVar, y2.e eVar, y2.e eVar2, boolean z3, InterfaceC0576P interfaceC0576P, long j3, long j4, long j5, long j6, y2.e eVar3, int i2, int i3) {
        super(2);
        this.f2529i = oVar;
        this.f2530j = eVar;
        this.f2531k = eVar2;
        this.f2532l = z3;
        this.f2533m = interfaceC0576P;
        this.f2534n = j3;
        this.f2535o = j4;
        this.f2536p = j5;
        this.q = j6;
        this.f2537r = eVar3;
        this.f2538s = i2;
        this.f2539t = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f2538s | 1);
        long j3 = this.q;
        y2.e eVar = this.f2537r;
        AbstractC0118h4.a(this.f2529i, this.f2530j, this.f2531k, this.f2532l, this.f2533m, this.f2534n, this.f2535o, this.f2536p, j3, eVar, (C0285q) obj, Y2, this.f2539t);
        return C0880v.f8657a;
    }
}
