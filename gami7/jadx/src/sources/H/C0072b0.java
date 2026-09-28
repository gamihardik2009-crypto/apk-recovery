package H;

import J.C0285q;
import m2.C0880v;
import s.InterfaceC1159L;

/* renamed from: H.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072b0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0152m3 f2327i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2328j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2329k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f2330l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0.K f2331m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f2332n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f2333o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f2334p;
    public final /* synthetic */ float q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1159L f2335r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0072b0(C0152m3 c0152m3, boolean z3, boolean z4, y2.e eVar, C0.K k3, y2.e eVar2, y2.e eVar3, y2.e eVar4, float f3, InterfaceC1159L interfaceC1159L) {
        super(2);
        this.f2327i = c0152m3;
        this.f2328j = z3;
        this.f2329k = z4;
        this.f2330l = eVar;
        this.f2331m = k3;
        this.f2332n = eVar2;
        this.f2333o = eVar3;
        this.f2334p = eVar4;
        this.q = f3;
        this.f2335r = interfaceC1159L;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            C0152m3 c0152m3 = this.f2327i;
            boolean z3 = this.f2328j;
            boolean z4 = this.f2329k;
            AbstractC0086d0.c(this.f2330l, this.f2331m, !z3 ? c0152m3.f2904f : !z4 ? c0152m3.f2900b : c0152m3.f2909k, this.f2332n, this.f2333o, this.f2334p, !z3 ? c0152m3.f2905g : !z4 ? c0152m3.f2901c : c0152m3.f2910l, !z3 ? c0152m3.f2906h : !z4 ? c0152m3.f2902d : c0152m3.f2911m, this.q, this.f2335r, c0285q, 0);
        }
        return C0880v.f8657a;
    }
}
