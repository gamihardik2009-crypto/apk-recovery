package H;

import J.C0285q;
import m2.C0880v;

/* renamed from: H.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143l1 extends z2.i implements y2.g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Long f2839i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2840j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.c f2841k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.c f2842l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I f2843m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E2.d f2844n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J0 f2845o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0180q3 f2846p;
    public final /* synthetic */ B0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0143l1(Long l3, long j3, y2.c cVar, y2.c cVar2, I i2, E2.d dVar, J0 j02, InterfaceC0180q3 interfaceC0180q3, B0 b02) {
        super(4);
        this.f2839i = l3;
        this.f2840j = j3;
        this.f2841k = cVar;
        this.f2842l = cVar2;
        this.f2843m = i2;
        this.f2844n = dVar;
        this.f2845o = j02;
        this.f2846p = interfaceC0180q3;
        this.q = b02;
    }

    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2 = ((E1) obj2).f1426a;
        C0285q c0285q = (C0285q) obj3;
        ((Number) obj4).intValue();
        if (E1.a(i2, 0)) {
            c0285q.V(-1168710170);
            A1.j(this.f2839i, this.f2840j, this.f2841k, this.f2842l, this.f2843m, this.f2844n, this.f2845o, this.f2846p, this.q, c0285q, 0);
            c0285q.r(false);
        } else if (E1.a(i2, 1)) {
            c0285q.V(-1168709641);
            AbstractC0231z0.a(this.f2839i, this.f2841k, this.f2843m, this.f2844n, this.f2845o, this.f2846p, this.q, c0285q, 0);
            c0285q.r(false);
        } else {
            c0285q.V(-1168709264);
            c0285q.r(false);
        }
        return C0880v.f8657a;
    }
}
