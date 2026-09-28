package o;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import n1.E;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975a extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9170i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0988n f9171j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.a f9172k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V.o f9173l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.c f9174m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9175n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9176o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0975a(C0988n c0988n, y2.a aVar, V.o oVar, y2.c cVar, int i2, int i3, int i4) {
        super(2);
        this.f9170i = i4;
        this.f9171j = c0988n;
        this.f9172k = aVar;
        this.f9173l = oVar;
        this.f9174m = cVar;
        this.f9175n = i2;
        this.f9176o = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f9170i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f9175n | 1);
                V.o oVar = this.f9173l;
                y2.c cVar = this.f9174m;
                E.a(this.f9171j, this.f9172k, oVar, cVar, (C0285q) obj, Y2, this.f9176o);
                break;
            default:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f9175n | 1);
                V.o oVar2 = this.f9173l;
                y2.c cVar2 = this.f9174m;
                E.a(this.f9171j, this.f9172k, oVar2, cVar2, (C0285q) obj, Y3, this.f9176o);
                break;
        }
        return C0880v.f8657a;
    }
}
