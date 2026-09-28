package S1;

import J.C0257c;
import J.C0285q;
import Y1.H;
import a.AbstractC0423a;
import m2.C0880v;
import n1.y;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5603h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f5604i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H f5605j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5606k;

    public /* synthetic */ d(y yVar, H h2, int i2, int i3) {
        this.f5603h = i3;
        this.f5604i = yVar;
        this.f5605j = h2;
        this.f5606k = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f5603h;
        C0285q c0285q = (C0285q) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                y yVar = this.f5604i;
                z2.h.f(yVar, "$navController");
                H h2 = this.f5605j;
                z2.h.f(h2, "$homeViewModel");
                B2.a.f(yVar, h2, c0285q, C0257c.Y(this.f5606k | 1));
                break;
            case 1:
                y yVar2 = this.f5604i;
                z2.h.f(yVar2, "$navController");
                H h3 = this.f5605j;
                z2.h.f(h3, "$viewModel");
                AbstractC0423a.l(yVar2, h3, c0285q, C0257c.Y(this.f5606k | 1));
                break;
            default:
                y yVar3 = this.f5604i;
                z2.h.f(yVar3, "$navController");
                H h4 = this.f5605j;
                z2.h.f(h4, "$viewModel");
                C1.y.e(yVar3, h4, c0285q, C0257c.Y(this.f5606k | 1));
                break;
        }
        return C0880v.f8657a;
    }
}
