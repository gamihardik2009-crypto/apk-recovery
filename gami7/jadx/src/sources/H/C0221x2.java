package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221x2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f3299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f3300j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3301k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f3302l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s.Y f3303m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.f f3304n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3305o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3306p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0221x2(V.o oVar, long j3, long j4, float f3, s.Y y3, y2.f fVar, int i2, int i3) {
        super(2);
        this.f3299i = oVar;
        this.f3300j = j3;
        this.f3301k = j4;
        this.f3302l = f3;
        this.f3303m = y3;
        this.f3304n = fVar;
        this.f3305o = i2;
        this.f3306p = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f3305o | 1);
        s.Y y3 = this.f3303m;
        y2.f fVar = this.f3304n;
        H2.a(this.f3299i, this.f3300j, this.f3301k, this.f3302l, y3, fVar, (C0285q) obj, Y2, this.f3306p);
        return C0880v.f8657a;
    }
}
