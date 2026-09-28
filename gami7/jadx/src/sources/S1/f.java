package S1;

import J.C0285q;
import a.AbstractC0423a;
import l.C0801j;
import m2.C0880v;
import n1.C0945f;
import n1.y;

/* loaded from: classes.dex */
public final class f implements y2.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5610h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f5611i;

    public /* synthetic */ f(y yVar, int i2) {
        this.f5610h = i2;
        this.f5611i = yVar;
    }

    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5610h) {
            case 0:
                ((Number) obj4).intValue();
                z2.h.f((C0801j) obj, "$this$composable");
                z2.h.f((C0945f) obj2, "it");
                AbstractC0423a.g(this.f5611i, (C0285q) obj3, 8);
                break;
            default:
                ((Number) obj4).intValue();
                z2.h.f((C0801j) obj, "$this$composable");
                z2.h.f((C0945f) obj2, "it");
                K1.f.l(this.f5611i, (C0285q) obj3, 8);
                break;
        }
        return C0880v.f8657a;
    }
}
