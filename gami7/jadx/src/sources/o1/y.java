package o1;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import n2.AbstractC0960l;

/* loaded from: classes.dex */
public final class y extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9310i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n1.y f9311j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n1.v f9312k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V.o f9313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V.c f9314m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.c f9315n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.c f9316o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.c f9317p;
    public final /* synthetic */ y2.c q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.c f9318r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f9319s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f9320t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(n1.y yVar, n1.v vVar, V.o oVar, V.c cVar, y2.c cVar2, y2.c cVar3, y2.c cVar4, y2.c cVar5, y2.c cVar6, int i2, int i3, int i4) {
        super(2);
        this.f9310i = i4;
        this.f9311j = yVar;
        this.f9312k = vVar;
        this.f9313l = oVar;
        this.f9314m = cVar;
        this.f9315n = cVar2;
        this.f9316o = cVar3;
        this.f9317p = cVar4;
        this.q = cVar5;
        this.f9318r = cVar6;
        this.f9319s = i2;
        this.f9320t = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f9310i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f9319s | 1);
                y2.c cVar = this.q;
                y2.c cVar2 = this.f9318r;
                AbstractC0960l.d(this.f9311j, this.f9312k, this.f9313l, this.f9314m, this.f9315n, this.f9316o, this.f9317p, cVar, cVar2, (C0285q) obj, Y2, this.f9320t);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f9319s | 1);
                y2.c cVar3 = this.q;
                y2.c cVar4 = this.f9318r;
                AbstractC0960l.d(this.f9311j, this.f9312k, this.f9313l, this.f9314m, this.f9315n, this.f9316o, this.f9317p, cVar3, cVar4, (C0285q) obj, Y3, this.f9320t);
                break;
            default:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f9319s | 1);
                y2.c cVar5 = this.q;
                y2.c cVar6 = this.f9318r;
                AbstractC0960l.d(this.f9311j, this.f9312k, this.f9313l, this.f9314m, this.f9315n, this.f9316o, this.f9317p, cVar5, cVar6, (C0285q) obj, Y4, this.f9320t);
                break;
        }
        return C0880v.f8657a;
    }
}
