package J;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: J.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295v0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4274l;

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0295v0) m((EnumC0293u0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0295v0 c0295v0 = new C0295v0(2, interfaceC1073d);
        c0295v0.f4274l = obj;
        return c0295v0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        return Boolean.valueOf(((EnumC0293u0) this.f4274l) == EnumC0293u0.f4248h);
    }
}
