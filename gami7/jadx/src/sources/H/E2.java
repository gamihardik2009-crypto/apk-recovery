package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import m2.InterfaceC0861c;

/* loaded from: classes.dex */
public final class E2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1427i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1428j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1429k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1430l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1432n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0861c f1433o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0861c f1434p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2(V.o oVar, P3 p3, boolean z3, r.l lVar, y2.f fVar, y2.f fVar2, int i2) {
        super(2);
        this.f1430l = oVar;
        this.f1431m = p3;
        this.f1428j = z3;
        this.f1432n = lVar;
        this.f1433o = fVar;
        this.f1434p = fVar2;
        this.f1429k = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f1427i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f1429k | 1);
                boolean z3 = this.f1428j;
                y2.a aVar = (y2.a) this.f1434p;
                H2.c((y2.e) this.f1430l, (y2.e) this.f1431m, (y2.e) this.f1432n, (y2.e) this.f1433o, z3, aVar, (C0285q) obj, Y2);
                break;
            default:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f1429k | 1);
                y2.f fVar = (y2.f) this.f1433o;
                y2.f fVar2 = (y2.f) this.f1434p;
                M3.d((V.o) this.f1430l, (P3) this.f1431m, this.f1428j, (r.l) this.f1432n, fVar, fVar2, (C0285q) obj, Y3);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2(y2.e eVar, y2.e eVar2, y2.e eVar3, y2.e eVar4, boolean z3, y2.a aVar, int i2) {
        super(2);
        this.f1430l = eVar;
        this.f1431m = eVar2;
        this.f1432n = eVar3;
        this.f1433o = eVar4;
        this.f1428j = z3;
        this.f1434p = aVar;
        this.f1429k = i2;
    }
}
