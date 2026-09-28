package H;

import J.C0257c;
import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;

/* renamed from: H.g4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111g4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W3 f2618i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f2619j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2620k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f2621l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2622m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2623n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f2624o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f2625p;
    public final /* synthetic */ long q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2626r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2627s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0111g4(W3 w3, V.o oVar, boolean z3, InterfaceC0576P interfaceC0576P, long j3, long j4, long j5, long j6, long j7, int i2, int i3) {
        super(2);
        this.f2618i = w3;
        this.f2619j = oVar;
        this.f2620k = z3;
        this.f2621l = interfaceC0576P;
        this.f2622m = j3;
        this.f2623n = j4;
        this.f2624o = j5;
        this.f2625p = j6;
        this.q = j7;
        this.f2626r = i2;
        this.f2627s = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f2626r | 1);
        long j3 = this.f2625p;
        long j4 = this.q;
        AbstractC0118h4.b(this.f2618i, this.f2619j, this.f2620k, this.f2621l, this.f2622m, this.f2623n, this.f2624o, j3, j4, (C0285q) obj, Y2, this.f2627s);
        return C0880v.f8657a;
    }
}
