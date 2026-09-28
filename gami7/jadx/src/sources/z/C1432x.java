package z;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: z.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432x extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ D.X f11842i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f11843j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11844k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1432x(D.X x2, boolean z3, int i2) {
        super(2);
        this.f11842i = x2;
        this.f11843j = z3;
        this.f11844k = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f11844k | 1);
        N.f(this.f11842i, this.f11843j, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
