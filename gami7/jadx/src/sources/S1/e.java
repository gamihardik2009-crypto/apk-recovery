package S1;

import J.C0285q;
import Y1.H;
import a.AbstractC0423a;
import l.C0801j;
import m2.C0880v;
import n1.C0945f;
import n1.y;

/* loaded from: classes.dex */
public final class e implements y2.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5607h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f5608i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H f5609j;

    public /* synthetic */ e(y yVar, H h2, int i2) {
        this.f5607h = i2;
        this.f5608i = yVar;
        this.f5609j = h2;
    }

    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5607h) {
            case 0:
                ((Number) obj4).intValue();
                z2.h.f((C0801j) obj, "$this$composable");
                z2.h.f((C0945f) obj2, "it");
                AbstractC0423a.l(this.f5608i, this.f5609j, (C0285q) obj3, 72);
                break;
            default:
                ((Number) obj4).intValue();
                z2.h.f((C0801j) obj, "$this$composable");
                z2.h.f((C0945f) obj2, "it");
                C1.y.e(this.f5608i, this.f5609j, (C0285q) obj3, 72);
                break;
        }
        return C0880v.f8657a;
    }
}
