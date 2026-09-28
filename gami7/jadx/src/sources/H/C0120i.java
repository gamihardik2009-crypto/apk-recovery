package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120i extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2709i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f2710j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2711k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2712l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120i(float f3, float f4, y2.e eVar, int i2) {
        super(2);
        this.f2709i = f3;
        this.f2710j = f4;
        this.f2711k = eVar;
        this.f2712l = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f2712l | 1);
        float f3 = this.f2710j;
        y2.e eVar = this.f2711k;
        AbstractC0127j.b(this.f2709i, f3, eVar, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
