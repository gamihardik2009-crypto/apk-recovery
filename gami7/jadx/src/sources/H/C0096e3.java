package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096e3 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2522j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2523k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.f f2524l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.e f2525m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f2526n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s.Y f2527o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f2528p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0096e3(int i2, y2.e eVar, y2.f fVar, y2.e eVar2, y2.e eVar3, s.Y y3, y2.e eVar4, int i3, int i4) {
        super(2);
        this.f2521i = i4;
        this.f2522j = i2;
        this.f2523k = eVar;
        this.f2524l = fVar;
        this.f2525m = eVar2;
        this.f2526n = eVar3;
        this.f2527o = y3;
        this.f2528p = eVar4;
        this.q = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2521i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.q | 1);
                s.Y y3 = this.f2527o;
                y2.e eVar = this.f2528p;
                AbstractC0124i3.a(this.f2522j, this.f2523k, this.f2524l, this.f2525m, this.f2526n, y3, eVar, (C0285q) obj, Y2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.q | 1);
                s.Y y4 = this.f2527o;
                y2.e eVar2 = this.f2528p;
                AbstractC0124i3.d(this.f2522j, this.f2523k, this.f2524l, this.f2525m, this.f2526n, y4, eVar2, (C0285q) obj, Y3);
                break;
            default:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.q | 1);
                s.Y y5 = this.f2527o;
                y2.e eVar3 = this.f2528p;
                AbstractC0124i3.c(this.f2522j, this.f2523k, this.f2524l, this.f2525m, this.f2526n, y5, eVar3, (C0285q) obj, Y4);
                break;
        }
        return C0880v.f8657a;
    }
}
