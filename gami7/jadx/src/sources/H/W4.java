package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class W4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2120i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.f f2121j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f2122k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2124m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f2125n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f2126o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f2127p;
    public final /* synthetic */ n.w0 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2128r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2129s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W4(int i2, y2.f fVar, V.o oVar, long j3, long j4, float f3, y2.e eVar, y2.e eVar2, n.w0 w0Var, int i3, int i4) {
        super(2);
        this.f2120i = i2;
        this.f2121j = fVar;
        this.f2122k = oVar;
        this.f2123l = j3;
        this.f2124m = j4;
        this.f2125n = f3;
        this.f2126o = eVar;
        this.f2127p = eVar2;
        this.q = w0Var;
        this.f2128r = i3;
        this.f2129s = i4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f2128r | 1);
        n.w0 w0Var = this.q;
        int i2 = this.f2129s;
        X4.b(this.f2120i, this.f2121j, this.f2122k, this.f2123l, this.f2124m, this.f2125n, this.f2126o, this.f2127p, w0Var, (C0285q) obj, Y2, i2);
        return C0880v.f8657a;
    }
}
