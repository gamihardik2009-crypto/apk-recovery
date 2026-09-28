package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import s.AbstractC1177p;

/* loaded from: classes.dex */
public final class v5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3236i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f3237j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3238k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v5(V.o oVar, int i2, int i3) {
        super(2);
        this.f3236i = i3;
        this.f3237j = oVar;
        this.f3238k = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f3236i;
        C0285q c0285q = (C0285q) obj;
        ((Number) obj2).intValue();
        switch (i2) {
            case 0:
                K5.g(this.f3237j, c0285q, C0257c.Y(this.f3238k | 1));
                break;
            default:
                AbstractC1177p.a(this.f3237j, c0285q, C0257c.Y(this.f3238k | 1));
                break;
        }
        return C0880v.f8657a;
    }
}
