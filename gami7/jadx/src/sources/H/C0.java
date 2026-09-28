package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class C0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E0 f1358i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Long f1359j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1360k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J0 f1361l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V.o f1362m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1363n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(E0 e02, Long l3, int i2, J0 j02, V.o oVar, int i3, int i4) {
        super(2);
        this.f1358i = e02;
        this.f1359j = l3;
        this.f1360k = i2;
        this.f1361l = j02;
        this.f1362m = oVar;
        this.f1363n = i3;
        this.f1364o = i4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1363n | 1);
        J0 j02 = this.f1361l;
        V.o oVar = this.f1362m;
        this.f1358i.a(this.f1359j, this.f1360k, j02, oVar, (C0285q) obj, Y2, this.f1364o);
        return C0880v.f8657a;
    }
}
