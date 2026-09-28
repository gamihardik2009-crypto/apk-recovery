package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115h1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K f2660i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.c f2661j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2662k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f2663l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f2664m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J0 f2665n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0180q3 f2666o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B0 f2667p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115h1(K k3, y2.c cVar, long j3, Long l3, Long l4, J0 j02, InterfaceC0180q3 interfaceC0180q3, B0 b02, int i2) {
        super(2);
        this.f2660i = k3;
        this.f2661j = cVar;
        this.f2662k = j3;
        this.f2663l = l3;
        this.f2664m = l4;
        this.f2665n = j02;
        this.f2666o = interfaceC0180q3;
        this.f2667p = b02;
        this.q = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.q | 1);
        Long l3 = this.f2664m;
        J0 j02 = this.f2665n;
        A1.g(this.f2660i, this.f2661j, this.f2662k, this.f2663l, l3, j02, this.f2666o, this.f2667p, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
