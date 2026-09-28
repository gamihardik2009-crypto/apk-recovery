package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069a4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2297i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2298j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2299k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f2300l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0.K f2301m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2302n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f2303o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2304p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0069a4(y2.e eVar, y2.e eVar2, y2.e eVar3, C0.K k3, long j3, long j4, int i2, int i3) {
        super(2);
        this.f2297i = i3;
        this.f2298j = eVar;
        this.f2299k = eVar2;
        this.f2300l = eVar3;
        this.f2301m = k3;
        this.f2302n = j3;
        this.f2303o = j4;
        this.f2304p = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2297i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f2304p | 1);
                long j3 = this.f2302n;
                long j4 = this.f2303o;
                AbstractC0118h4.c(this.f2298j, this.f2299k, this.f2300l, this.f2301m, j3, j4, (C0285q) obj, Y2);
                break;
            default:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f2304p | 1);
                long j5 = this.f2302n;
                long j6 = this.f2303o;
                AbstractC0118h4.d(this.f2298j, this.f2299k, this.f2300l, this.f2301m, j5, j6, (C0285q) obj, Y3);
                break;
        }
        return C0880v.f8657a;
    }
}
