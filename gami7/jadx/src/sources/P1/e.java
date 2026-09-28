package P1;

import B1.C;
import C1.y;
import J.C0257c;
import J.C0285q;
import a.AbstractC0423a;
import m2.C0880v;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5237h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5238i;

    public /* synthetic */ e(int i2, int i3) {
        this.f5237h = i3;
        this.f5238i = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f5237h;
        C0285q c0285q = (C0285q) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                y.d(C0257c.Y(this.f5238i | 1), c0285q);
                break;
            case 1:
                C.h(C0257c.Y(this.f5238i | 1), c0285q);
                break;
            case 2:
                C.d(C0257c.Y(this.f5238i | 1), c0285q);
                break;
            case 3:
                AbstractC0423a.p(C0257c.Y(this.f5238i | 1), c0285q);
                break;
            default:
                AbstractC0423a.q(C0257c.Y(this.f5238i | 1), c0285q);
                break;
        }
        return C0880v.f8657a;
    }
}
