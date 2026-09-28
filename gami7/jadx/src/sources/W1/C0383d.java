package W1;

import J.C0257c;
import J.C0285q;
import a.AbstractC0423a;
import m2.C0880v;

/* renamed from: W1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0383d implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6019h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n1.y f6020i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6021j;

    public /* synthetic */ C0383d(n1.y yVar, int i2, int i3) {
        this.f6019h = i3;
        this.f6020i = yVar;
        this.f6021j = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = this.f6019h;
        C0285q c0285q = (C0285q) obj;
        ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                n1.y yVar = this.f6020i;
                z2.h.f(yVar, "$navController");
                AbstractC0423a.g(yVar, c0285q, C0257c.Y(this.f6021j | 1));
                break;
            default:
                n1.y yVar2 = this.f6020i;
                z2.h.f(yVar2, "$navController");
                K1.f.l(yVar2, c0285q, C0257c.Y(this.f6021j | 1));
                break;
        }
        return C0880v.f8657a;
    }
}
