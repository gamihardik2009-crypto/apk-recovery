package H;

import m2.C0880v;
import n0.C0921D;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: H.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199t4 extends AbstractC1204i implements y2.e {
    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0199t4 c0199t4 = (C0199t4) m((C0921D) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        c0199t4.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0199t4(2, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        return C0880v.f8657a;
    }
}
