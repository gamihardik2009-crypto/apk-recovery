package H;

import c0.C0573M;
import m2.C0880v;

/* loaded from: classes.dex */
public final class Y0 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2172i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.c f2173j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y0(int i2, y2.c cVar) {
        super(0);
        this.f2172i = i2;
        this.f2173j = cVar;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f2172i) {
            case 0:
                this.f2173j.l(new E1(1));
                break;
            case 1:
                this.f2173j.l(new E1(0));
                break;
            default:
                C0573M c0573m = t0.Z.f10530N;
                this.f2173j.l(c0573m);
                c0573m.f7198B = c0573m.f7212v.c(c0573m.f7215y, c0573m.f7197A, c0573m.f7216z);
                break;
        }
        return C0880v.f8657a;
    }
}
