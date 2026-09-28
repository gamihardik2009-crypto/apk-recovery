package W1;

import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.W;
import a.AbstractC0423a;
import java.util.List;
import m2.C0880v;

/* loaded from: classes.dex */
public final class x extends z2.i implements y2.g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f6093i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6094j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6095k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6096l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(List list, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, InterfaceC0258c0 interfaceC0258c03) {
        super(4);
        this.f6093i = list;
        this.f6094j = interfaceC0258c0;
        this.f6095k = interfaceC0258c02;
        this.f6096l = interfaceC0258c03;
    }

    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj;
        int intValue = ((Number) obj2).intValue();
        C0285q c0285q = (C0285q) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i2 = (c0285q.g(aVar) ? 4 : 2) | intValue2;
        } else {
            i2 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i2 |= c0285q.e(intValue) ? 32 : 16;
        }
        if ((i2 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            R1.b bVar = (R1.b) this.f6093i.get(intValue);
            c0285q.U(26216649);
            c0285q.U(-276246438);
            boolean g3 = c0285q.g(bVar);
            Object K3 = c0285q.K();
            W w2 = C0275l.f4150a;
            if (g3 || K3 == w2) {
                K3 = new C0397s(bVar, this.f6094j, this.f6095k, 0);
                c0285q.e0(K3);
            }
            y2.a aVar2 = (y2.a) K3;
            c0285q.r(false);
            c0285q.U(-276241145);
            boolean g4 = c0285q.g(bVar);
            Object K4 = c0285q.K();
            if (g4 || K4 == w2) {
                K4 = new C0398t(bVar, 0, this.f6096l);
                c0285q.e0(K4);
            }
            c0285q.r(false);
            AbstractC0423a.f(bVar, aVar2, (y2.a) K4, c0285q, 0);
            c0285q.r(false);
        }
        return C0880v.f8657a;
    }
}
