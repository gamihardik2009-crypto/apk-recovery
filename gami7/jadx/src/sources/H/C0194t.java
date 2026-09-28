package H;

import J.C0257c;
import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;
import m2.InterfaceC0861c;
import n.C0911t;

/* renamed from: H.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194t extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f3117j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3118k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3119l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3120m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3121n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f3122o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3123p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194t(V.o oVar, InterfaceC0576P interfaceC0576P, L l3, M m3, C0911t c0911t, y2.f fVar, int i2, int i3) {
        super(2);
        this.f3116i = 1;
        this.f3117j = oVar;
        this.f3121n = interfaceC0576P;
        this.f3122o = l3;
        this.f3123p = m3;
        this.q = c0911t;
        this.f3118k = fVar;
        this.f3119l = i2;
        this.f3120m = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f3116i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f3119l | 1);
                s.Y y3 = (s.Y) this.f3123p;
                AbstractC0224y.b((y2.e) this.f3121n, this.f3117j, (y2.e) this.f3122o, (y2.f) this.f3118k, y3, (N5) this.q, (C0285q) obj, Y2, this.f3120m);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f3119l | 1);
                C0911t c0911t = (C0911t) this.q;
                y2.f fVar = (y2.f) this.f3118k;
                D1.b(this.f3117j, (InterfaceC0576P) this.f3121n, (L) this.f3122o, (M) this.f3123p, c0911t, fVar, (C0285q) obj, Y3, this.f3120m);
                break;
            default:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f3119l | 1);
                y2.c cVar = (y2.c) this.f3123p;
                y2.g gVar = (y2.g) this.q;
                B2.a.b((m.p0) this.f3121n, this.f3117j, (y2.c) this.f3122o, (V.c) this.f3118k, cVar, gVar, (C0285q) obj, Y4, this.f3120m);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0194t(Object obj, V.o oVar, InterfaceC0861c interfaceC0861c, Object obj2, Object obj3, Object obj4, int i2, int i3, int i4) {
        super(2);
        this.f3116i = i4;
        this.f3121n = obj;
        this.f3117j = oVar;
        this.f3122o = interfaceC0861c;
        this.f3118k = obj2;
        this.f3123p = obj3;
        this.q = obj4;
        this.f3119l = i2;
        this.f3120m = i3;
    }
}
