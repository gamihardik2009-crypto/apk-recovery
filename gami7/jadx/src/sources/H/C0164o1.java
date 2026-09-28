package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164o1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f2961i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2962j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2963k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.a f2964l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2965m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f2966n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ B0 f2967o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f2968p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164o1(V.o oVar, boolean z3, boolean z4, y2.a aVar, boolean z5, String str, B0 b02, y2.e eVar, int i2) {
        super(2);
        this.f2961i = oVar;
        this.f2962j = z3;
        this.f2963k = z4;
        this.f2964l = aVar;
        this.f2965m = z5;
        this.f2966n = str;
        this.f2967o = b02;
        this.f2968p = eVar;
        this.q = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.q | 1);
        B0 b02 = this.f2967o;
        y2.e eVar = this.f2968p;
        A1.l(this.f2961i, this.f2962j, this.f2963k, this.f2964l, this.f2965m, this.f2966n, b02, eVar, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
