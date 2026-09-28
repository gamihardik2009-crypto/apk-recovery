package o;

import J.C0257c;
import J.C0285q;
import R0.A;
import m2.C0880v;

/* renamed from: o.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989o extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A f9217i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.a f9218j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f9219k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0976b f9220l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.c f9221m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9222n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9223o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0989o(A a3, y2.a aVar, V.o oVar, C0976b c0976b, y2.c cVar, int i2, int i3) {
        super(2);
        this.f9217i = a3;
        this.f9218j = aVar;
        this.f9219k = oVar;
        this.f9220l = c0976b;
        this.f9221m = cVar;
        this.f9222n = i2;
        this.f9223o = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f9222n | 1);
        C0976b c0976b = this.f9220l;
        y2.c cVar = this.f9221m;
        AbstractC0990p.c(this.f9217i, this.f9218j, this.f9219k, c0976b, cVar, (C0285q) obj, Y2, this.f9223o);
        return C0880v.f8657a;
    }
}
