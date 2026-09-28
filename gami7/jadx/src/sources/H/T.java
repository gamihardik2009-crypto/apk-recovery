package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class T extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1990i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B0.a f1991j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f1992k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f1993l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1994m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(boolean z3, B0.a aVar, V.o oVar, O o3, int i2) {
        super(2);
        this.f1990i = z3;
        this.f1991j = aVar;
        this.f1992k = oVar;
        this.f1993l = o3;
        this.f1994m = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1994m | 1);
        V.o oVar = this.f1992k;
        O o3 = this.f1993l;
        V.b(this.f1990i, this.f1991j, oVar, o3, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
