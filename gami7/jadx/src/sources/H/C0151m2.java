package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151m2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2894i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2895j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2896k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2897l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2898m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0151m2(long j3, Object obj, y2.e eVar, int i2, int i3) {
        super(2);
        this.f2894i = i3;
        this.f2895j = j3;
        this.f2898m = obj;
        this.f2896k = eVar;
        this.f2897l = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2894i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f2897l | 1);
                I.F f3 = (I.F) this.f2898m;
                y2.e eVar = this.f2896k;
                AbstractC0165o2.c(this.f2895j, f3, eVar, (C0285q) obj, Y2);
                break;
            default:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f2897l | 1);
                C0.K k3 = (C0.K) this.f2898m;
                y2.e eVar2 = this.f2896k;
                D1.h(this.f2895j, k3, eVar2, (C0285q) obj, Y3);
                break;
        }
        return C0880v.f8657a;
    }
}
