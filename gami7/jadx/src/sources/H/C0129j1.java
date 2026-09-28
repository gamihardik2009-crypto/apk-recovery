package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129j1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f2755i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2756j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2757k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2758l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f2759m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.a f2760n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.a f2761o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.a f2762p;
    public final /* synthetic */ B0 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2763r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0129j1(V.o oVar, boolean z3, boolean z4, boolean z5, String str, y2.a aVar, y2.a aVar2, y2.a aVar3, B0 b02, int i2) {
        super(2);
        this.f2755i = oVar;
        this.f2756j = z3;
        this.f2757k = z4;
        this.f2758l = z5;
        this.f2759m = str;
        this.f2760n = aVar;
        this.f2761o = aVar2;
        this.f2762p = aVar3;
        this.q = b02;
        this.f2763r = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f2763r | 1);
        y2.a aVar = this.f2762p;
        B0 b02 = this.q;
        A1.h(this.f2755i, this.f2756j, this.f2757k, this.f2758l, this.f2759m, this.f2760n, this.f2761o, aVar, b02, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
