package H;

import J.C0257c;
import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;
import m2.InterfaceC0861c;

/* loaded from: classes.dex */
public final class Q extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1918i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1919j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1920k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1921l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1922m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1923n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1924o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1925p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(C0084c5 c0084c5, boolean z3, boolean z4, r.k kVar, Z4 z42, InterfaceC0576P interfaceC0576P, int i2, int i3) {
        super(2);
        this.f1918i = 2;
        this.f1925p = c0084c5;
        this.f1919j = z3;
        this.f1921l = z4;
        this.f1920k = kVar;
        this.q = z42;
        this.f1922m = interfaceC0576P;
        this.f1923n = i2;
        this.f1924o = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f1918i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f1923n | 1);
                O o3 = (O) this.q;
                r.l lVar = (r.l) this.f1922m;
                V.a(this.f1919j, (y2.c) this.f1925p, (V.o) this.f1920k, this.f1921l, o3, lVar, (C0285q) obj, Y2, this.f1924o);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f1923n | 1);
                Y2 y22 = (Y2) this.q;
                r.l lVar2 = (r.l) this.f1922m;
                Z2.a(this.f1919j, (y2.a) this.f1925p, (V.o) this.f1920k, this.f1921l, y22, lVar2, (C0285q) obj, Y3, this.f1924o);
                break;
            default:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f1923n | 1);
                Z4 z4 = (Z4) this.q;
                InterfaceC0576P interfaceC0576P = (InterfaceC0576P) this.f1922m;
                ((C0084c5) this.f1925p).a(this.f1919j, this.f1921l, (r.k) this.f1920k, z4, interfaceC0576P, (C0285q) obj, Y4, this.f1924o);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(boolean z3, InterfaceC0861c interfaceC0861c, V.o oVar, boolean z4, Object obj, r.l lVar, int i2, int i3, int i4) {
        super(2);
        this.f1918i = i4;
        this.f1919j = z3;
        this.f1925p = interfaceC0861c;
        this.f1920k = oVar;
        this.f1921l = z4;
        this.q = obj;
        this.f1922m = lVar;
        this.f1923n = i2;
        this.f1924o = i3;
    }
}
