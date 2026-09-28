package H;

import J.C0285q;
import m2.C0880v;

/* renamed from: H.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083c4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.e f2411i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2412j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2413k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0.K f2414l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2415m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2416n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2417o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083c4(y2.e eVar, y2.e eVar2, y2.e eVar3, C0.K k3, long j3, long j4, boolean z3) {
        super(2);
        this.f2411i = eVar;
        this.f2412j = eVar2;
        this.f2413k = eVar3;
        this.f2414l = k3;
        this.f2415m = j3;
        this.f2416n = j4;
        this.f2417o = z3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else if (this.f2411i == null) {
            c0285q.V(-2104362406);
            AbstractC0118h4.d(this.f2412j, null, this.f2413k, this.f2414l, this.f2415m, this.f2416n, c0285q, 48);
            c0285q.r(false);
        } else if (this.f2417o) {
            c0285q.V(-2104362092);
            AbstractC0118h4.c(this.f2412j, this.f2411i, this.f2413k, this.f2414l, this.f2415m, this.f2416n, c0285q, 0);
            c0285q.r(false);
        } else {
            c0285q.V(-2104361812);
            AbstractC0118h4.d(this.f2412j, this.f2411i, this.f2413k, this.f2414l, this.f2415m, this.f2416n, c0285q, 0);
            c0285q.r(false);
        }
        return C0880v.f8657a;
    }
}
