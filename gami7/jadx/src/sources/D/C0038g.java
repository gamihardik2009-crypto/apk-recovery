package D;

import J.C0257c;
import J.C0285q;
import a.AbstractC0423a;
import m2.C0880v;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038g extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f846i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f847j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f848k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f849l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f850m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038g(V.o oVar, y2.a aVar, boolean z3, int i2) {
        super(2);
        this.f849l = oVar;
        this.f850m = aVar;
        this.f847j = z3;
        this.f848k = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f846i;
        C0285q c0285q = (C0285q) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                int Y2 = C0257c.Y(this.f848k | 1);
                K1.f.i((V.o) this.f849l, (y2.a) this.f850m, this.f847j, c0285q, Y2);
                break;
            default:
                int Y3 = C0257c.Y(this.f848k | 1);
                AbstractC0423a.s(this.f847j, (N0.h) this.f849l, (X) this.f850m, c0285q, Y3);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038g(boolean z3, N0.h hVar, X x2, int i2) {
        super(2);
        this.f847j = z3;
        this.f849l = hVar;
        this.f850m = x2;
        this.f848k = i2;
    }
}
