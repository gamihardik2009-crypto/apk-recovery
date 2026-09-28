package H;

import I.AbstractC0240e;
import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;

/* renamed from: H.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134k extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.e f2785i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2786j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2787k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f2788l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2789m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f2790n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f2791o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f2792p;
    public final /* synthetic */ long q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.e f2793r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.e f2794s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134k(y2.e eVar, y2.e eVar2, y2.e eVar3, InterfaceC0576P interfaceC0576P, long j3, float f3, long j4, long j5, long j6, y2.e eVar4, y2.e eVar5) {
        super(2);
        this.f2785i = eVar;
        this.f2786j = eVar2;
        this.f2787k = eVar3;
        this.f2788l = interfaceC0576P;
        this.f2789m = j3;
        this.f2790n = f3;
        this.f2791o = j4;
        this.f2792p = j5;
        this.q = j6;
        this.f2793r = eVar4;
        this.f2794s = eVar5;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = 2;
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            R.a b3 = R.b.b(c0285q, -3244296, new C0085d(this.f2793r, this.f2794s, i2));
            float f3 = AbstractC0240e.f3662a;
            AbstractC0127j.a(b3, null, this.f2785i, this.f2786j, this.f2787k, this.f2788l, this.f2789m, this.f2790n, AbstractC0107g0.d(26, c0285q), this.f2791o, this.f2792p, this.q, c0285q, 6, 0, 2);
        }
        return C0880v.f8657a;
    }
}
