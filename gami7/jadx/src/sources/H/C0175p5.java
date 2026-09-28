package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175p5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B3 f3008i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ EnumC0095e2 f3009j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3010k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f3011l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.f f3012m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f3013n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.i f3014o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3015p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175p5(B3 b3, EnumC0095e2 enumC0095e2, long j3, long j4, y2.f fVar, boolean z3, y2.i iVar, int i2) {
        super(2);
        this.f3008i = b3;
        this.f3009j = enumC0095e2;
        this.f3010k = j3;
        this.f3011l = j4;
        this.f3012m = fVar;
        this.f3013n = z3;
        this.f3014o = iVar;
        this.f3015p = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f3015p | 1);
        boolean z3 = this.f3013n;
        y2.i iVar = this.f3014o;
        this.f3008i.d(this.f3009j, this.f3010k, this.f3011l, this.f3012m, z3, iVar, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
