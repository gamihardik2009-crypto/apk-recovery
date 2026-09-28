package S1;

import B1.C;
import J.C0285q;
import a.AbstractC0423a;
import l.C0801j;
import m2.C0880v;
import n1.C0945f;

/* loaded from: classes.dex */
public final class a implements y2.g {

    /* renamed from: i, reason: collision with root package name */
    public static final a f5595i = new a(0);

    /* renamed from: j, reason: collision with root package name */
    public static final a f5596j = new a(1);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5597h;

    public /* synthetic */ a(int i2) {
        this.f5597h = i2;
    }

    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5597h) {
            case 0:
                ((Number) obj4).intValue();
                z2.h.f((C0801j) obj, "$this$composable");
                z2.h.f((C0945f) obj2, "it");
                C.h(0, (C0285q) obj3);
                break;
            default:
                ((Number) obj4).intValue();
                z2.h.f((C0801j) obj, "$this$composable");
                z2.h.f((C0945f) obj2, "it");
                AbstractC0423a.p(0, (C0285q) obj3);
                break;
        }
        return C0880v.f8657a;
    }
}
