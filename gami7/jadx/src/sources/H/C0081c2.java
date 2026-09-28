package H;

import J.C0257c;
import J.C0285q;
import i0.C0706A;
import i0.C0712e;
import m2.C0880v;

/* renamed from: H.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081c2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2394i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f2395j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f2396k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2397l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2398m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2399n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2400o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0081c2(Object obj, String str, V.o oVar, long j3, int i2, int i3, int i4) {
        super(2);
        this.f2394i = i4;
        this.f2400o = obj;
        this.f2395j = str;
        this.f2396k = oVar;
        this.f2397l = j3;
        this.f2398m = i2;
        this.f2399n = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2394i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f2398m | 1);
                V.o oVar = this.f2396k;
                long j3 = this.f2397l;
                AbstractC0088d2.a((C0712e) this.f2400o, this.f2395j, oVar, j3, (C0285q) obj, Y2, this.f2399n);
                break;
            default:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f2398m | 1);
                V.o oVar2 = this.f2396k;
                long j4 = this.f2397l;
                AbstractC0088d2.b((C0706A) this.f2400o, this.f2395j, oVar2, j4, (C0285q) obj, Y3, this.f2399n);
                break;
        }
        return C0880v.f8657a;
    }
}
