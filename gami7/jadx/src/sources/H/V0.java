package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class V0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Long f2063i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2064j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.c f2065k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.c f2066l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I f2067m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E2.d f2068n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J0 f2069o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0180q3 f2070p;
    public final /* synthetic */ B0 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2071r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(Long l3, long j3, y2.c cVar, y2.c cVar2, I i2, E2.d dVar, J0 j02, InterfaceC0180q3 interfaceC0180q3, B0 b02, int i3) {
        super(2);
        this.f2063i = l3;
        this.f2064j = j3;
        this.f2065k = cVar;
        this.f2066l = cVar2;
        this.f2067m = i2;
        this.f2068n = dVar;
        this.f2069o = j02;
        this.f2070p = interfaceC0180q3;
        this.q = b02;
        this.f2071r = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f2071r | 1);
        InterfaceC0180q3 interfaceC0180q3 = this.f2070p;
        B0 b02 = this.q;
        A1.j(this.f2063i, this.f2064j, this.f2065k, this.f2066l, this.f2067m, this.f2068n, this.f2069o, interfaceC0180q3, b02, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
