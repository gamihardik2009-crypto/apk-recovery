package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import t.C1214i;

/* loaded from: classes.dex */
public final class Z0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2201i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2202j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2203k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2204l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2205m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z0(Object obj, int i2, Object obj2, int i3, int i4) {
        super(2);
        this.f2201i = i4;
        this.f2204l = obj;
        this.f2202j = i2;
        this.f2205m = obj2;
        this.f2203k = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f2201i;
        C0285q c0285q = (C0285q) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                int Y2 = C0257c.Y(this.f2203k | 1);
                A1.e((V.o) this.f2204l, this.f2202j, (y2.c) this.f2205m, c0285q, Y2);
                break;
            case 1:
                int Y3 = C0257c.Y(this.f2203k | 1);
                ((C1214i) this.f2204l).e(this.f2202j, this.f2205m, c0285q, Y3);
                break;
            default:
                int Y4 = C0257c.Y(this.f2203k | 1);
                ((u.i) this.f2204l).e(this.f2202j, this.f2205m, c0285q, Y4);
                break;
        }
        return C0880v.f8657a;
    }
}
