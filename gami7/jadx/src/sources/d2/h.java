package d2;

import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import W1.C0397s;
import W1.C0398t;
import java.util.List;
import m2.C0880v;

/* loaded from: classes.dex */
public final class h extends z2.i implements y2.g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f7509i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f7510j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7511k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f7513m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, n nVar, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03) {
        super(4);
        this.f7509i = list;
        this.f7510j = nVar;
        this.f7511k = interfaceC0258c0;
        this.f7512l = interfaceC0258c02;
        this.f7513m = interfaceC0258c03;
    }

    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        Object obj5 = (androidx.compose.foundation.lazy.a) obj;
        int intValue = ((Number) obj2).intValue();
        C0285q c0285q = (C0285q) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i2 = (c0285q.g(obj5) ? 4 : 2) | intValue2;
        } else {
            i2 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i2 |= c0285q.e(intValue) ? 32 : 16;
        }
        if ((i2 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            R1.e eVar = (R1.e) this.f7509i.get(intValue);
            c0285q.U(1705175621);
            c0285q.U(1024841405);
            boolean g3 = c0285q.g(eVar);
            Object K3 = c0285q.K();
            Object obj6 = C0275l.f4150a;
            if (g3 || K3 == obj6) {
                K3 = new C0397s(eVar, this.f7511k, this.f7512l, 2);
                c0285q.e0(K3);
            }
            y2.a aVar = (y2.a) K3;
            c0285q.r(false);
            c0285q.U(1024846702);
            boolean g4 = c0285q.g(eVar);
            Object K4 = c0285q.K();
            if (g4 || K4 == obj6) {
                K4 = new C0398t(eVar, 2, this.f7513m);
                c0285q.e0(K4);
            }
            c0285q.r(false);
            K1.f.f(eVar, this.f7510j, aVar, (y2.a) K4, c0285q, 64);
            c0285q.r(false);
        }
        return C0880v.f8657a;
    }
}
