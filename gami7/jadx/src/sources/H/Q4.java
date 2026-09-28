package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class Q4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ R4 f1935i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f1936j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f1937k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f1938l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1939m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1940n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(R4 r4, V.o oVar, float f3, long j3, int i2, int i3) {
        super(2);
        this.f1935i = r4;
        this.f1936j = oVar;
        this.f1937k = f3;
        this.f1938l = j3;
        this.f1939m = i2;
        this.f1940n = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1939m | 1);
        float f3 = this.f1937k;
        long j3 = this.f1938l;
        this.f1935i.a(this.f1936j, f3, j3, (C0285q) obj, Y2, this.f1940n);
        return C0880v.f8657a;
    }
}
