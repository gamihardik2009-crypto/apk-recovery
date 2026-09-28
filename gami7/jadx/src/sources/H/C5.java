package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class C5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f1381i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.z f1382j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.c f1383k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M5 f1384l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1385m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z.Q f1386n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z.P f1387o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u5 f1388p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1389r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5(V.o oVar, I0.z zVar, y2.c cVar, M5 m5, int i2, z.Q q, z.P p3, u5 u5Var, int i3, int i4) {
        super(2);
        this.f1381i = oVar;
        this.f1382j = zVar;
        this.f1383k = cVar;
        this.f1384l = m5;
        this.f1385m = i2;
        this.f1386n = q;
        this.f1387o = p3;
        this.f1388p = u5Var;
        this.q = i3;
        this.f1389r = i4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.q | 1);
        z.P p3 = this.f1387o;
        u5 u5Var = this.f1388p;
        K5.h(this.f1381i, this.f1382j, this.f1383k, this.f1384l, this.f1385m, this.f1386n, p3, u5Var, (C0285q) obj, Y2, this.f1389r);
        return C0880v.f8657a;
    }
}
