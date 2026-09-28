package z;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410a extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V.o f11616i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11617j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11618k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410a(V.o oVar, int i2, int i3) {
        super(2);
        this.f11616i = oVar;
        this.f11617j = i2;
        this.f11618k = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f11617j | 1);
        int i2 = this.f11618k;
        AbstractC1412c.b(this.f11616i, (C0285q) obj, Y2, i2);
        return C0880v.f8657a;
    }
}
