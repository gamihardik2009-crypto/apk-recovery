package D;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: D.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036e extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0045n f832i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f833j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ N0.h f834k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f835l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f836m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V.o f837n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f838o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f839p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036e(InterfaceC0045n interfaceC0045n, boolean z3, N0.h hVar, boolean z4, long j3, V.o oVar, int i2, int i3) {
        super(2);
        this.f832i = interfaceC0045n;
        this.f833j = z3;
        this.f834k = hVar;
        this.f835l = z4;
        this.f836m = j3;
        this.f837n = oVar;
        this.f838o = i2;
        this.f839p = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f838o | 1);
        long j3 = this.f836m;
        V.o oVar = this.f837n;
        K1.f.h(this.f832i, this.f833j, this.f834k, this.f835l, j3, oVar, (C0285q) obj, Y2, this.f839p);
        return C0880v.f8657a;
    }
}
