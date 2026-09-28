package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class A3 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B3 f1300i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P3 f1301j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f1302k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0210v3 f1303l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1304m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1305n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1306o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(B3 b3, P3 p3, V.o oVar, C0210v3 c0210v3, boolean z3, int i2, int i3) {
        super(2);
        this.f1300i = b3;
        this.f1301j = p3;
        this.f1302k = oVar;
        this.f1303l = c0210v3;
        this.f1304m = z3;
        this.f1305n = i2;
        this.f1306o = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1305n | 1);
        C0210v3 c0210v3 = this.f1303l;
        boolean z3 = this.f1304m;
        this.f1300i.c(this.f1301j, this.f1302k, c0210v3, z3, (C0285q) obj, Y2, this.f1306o);
        return C0880v.f8657a;
    }
}
