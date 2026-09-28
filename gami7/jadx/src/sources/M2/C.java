package M2;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class C extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ int f4795l;

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C) m(Integer.valueOf(((Number) obj).intValue()), (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C c3 = new C(2, interfaceC1073d);
        c3.f4795l = ((Number) obj).intValue();
        return c3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        return Boolean.valueOf(this.f4795l > 0);
    }
}
