package l;

import J.C0257c;
import J.C0285q;
import m.p0;
import m2.C0880v;
import m2.InterfaceC0861c;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795d extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8193i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.c f8194j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f8195k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8196l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f8197m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8198n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f8199o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8200p;
    public final /* synthetic */ Object q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0861c f8201r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0795d(Object obj, V.o oVar, y2.c cVar, V.c cVar2, String str, y2.c cVar3, y2.g gVar, int i2, int i3) {
        super(2);
        this.f8198n = obj;
        this.f8195k = oVar;
        this.f8194j = cVar;
        this.f8200p = cVar2;
        this.q = str;
        this.f8199o = cVar3;
        this.f8201r = gVar;
        this.f8196l = i2;
        this.f8197m = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f8193i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f8196l | 1);
                y2.c cVar = (y2.c) this.f8199o;
                y2.g gVar = (y2.g) this.f8201r;
                B2.a.a(this.f8198n, this.f8195k, this.f8194j, (V.c) this.f8200p, (String) this.q, cVar, gVar, (C0285q) obj, Y2, this.f8197m);
                break;
            default:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f8196l | 1);
                y2.e eVar = (y2.e) this.q;
                androidx.compose.animation.a.a((p0) this.f8198n, this.f8194j, this.f8195k, (C0790E) this.f8199o, (C0791F) this.f8200p, eVar, (y2.f) this.f8201r, (C0285q) obj, Y3, this.f8197m);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0795d(p0 p0Var, y2.c cVar, V.o oVar, C0790E c0790e, C0791F c0791f, y2.e eVar, y2.f fVar, int i2, int i3) {
        super(2);
        this.f8198n = p0Var;
        this.f8194j = cVar;
        this.f8195k = oVar;
        this.f8199o = c0790e;
        this.f8200p = c0791f;
        this.q = eVar;
        this.f8201r = fVar;
        this.f8196l = i2;
        this.f8197m = i3;
    }
}
