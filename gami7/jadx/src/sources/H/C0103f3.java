package H;

import J.C0257c;
import J.C0285q;
import c0.InterfaceC0576P;
import l.C0790E;
import l.C0791F;
import m2.C0880v;
import r0.InterfaceC1094H;

/* renamed from: H.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103f3 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2579i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2580j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2581k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2583m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2584n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2585o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2586p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103f3(int i2, y2.e eVar, y2.f fVar, y2.e eVar2, y2.e eVar3, C0203u2 c0203u2, y2.e eVar4) {
        super(2);
        this.f2579i = 0;
        this.f2580j = i2;
        this.f2581k = eVar;
        this.f2585o = fVar;
        this.f2582l = eVar2;
        this.f2583m = eVar3;
        this.f2586p = c0203u2;
        this.f2584n = eVar4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2579i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    AbstractC0124i3.d(this.f2580j, (y2.e) this.f2581k, (y2.f) this.f2585o, (y2.e) this.f2582l, (y2.e) this.f2583m, (C0203u2) this.f2586p, (y2.e) this.f2584n, c0285q, 0);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f2580j | 1);
                InterfaceC0576P interfaceC0576P = (InterfaceC0576P) this.f2585o;
                InterfaceC0576P interfaceC0576P2 = (InterfaceC0576P) this.f2586p;
                K5.a((V.o) this.f2581k, (M5) this.f2582l, (u5) this.f2583m, (InterfaceC1094H) this.f2584n, interfaceC0576P, interfaceC0576P2, (C0285q) obj, Y2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f2580j) | 1;
                Object obj3 = this.f2585o;
                Object obj4 = this.f2586p;
                ((R.a) this.f2581k).d(this.f2582l, this.f2583m, this.f2584n, obj3, obj4, (C0285q) obj, Y3);
                break;
            default:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f2580j | 1);
                C0791F c0791f = (C0791F) this.f2586p;
                y2.f fVar = (y2.f) this.f2585o;
                androidx.compose.animation.a.d((m.p0) this.f2581k, (y2.c) this.f2582l, (V.o) this.f2583m, (C0790E) this.f2584n, c0791f, fVar, (C0285q) obj, Y4);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0103f3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2, int i3) {
        super(2);
        this.f2579i = i3;
        this.f2581k = obj;
        this.f2582l = obj2;
        this.f2583m = obj3;
        this.f2584n = obj4;
        this.f2585o = obj5;
        this.f2586p = obj6;
        this.f2580j = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103f3(m.p0 p0Var, y2.c cVar, V.o oVar, C0790E c0790e, C0791F c0791f, y2.f fVar, int i2) {
        super(2);
        this.f2579i = 3;
        this.f2581k = p0Var;
        this.f2582l = cVar;
        this.f2583m = oVar;
        this.f2584n = c0790e;
        this.f2586p = c0791f;
        this.f2585o = fVar;
        this.f2580j = i2;
    }
}
