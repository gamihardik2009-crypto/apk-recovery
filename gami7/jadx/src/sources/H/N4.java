package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* loaded from: classes.dex */
public final class N4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1792i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1793j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1794k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f1795l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1796m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N4(long j3, long j4, boolean z3, y2.e eVar, int i2) {
        super(2);
        this.f1792i = j3;
        this.f1793j = j4;
        this.f1794k = z3;
        this.f1795l = eVar;
        this.f1796m = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1796m | 1);
        boolean z3 = this.f1794k;
        y2.e eVar = this.f1795l;
        O4.c(this.f1792i, this.f1793j, z3, eVar, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
