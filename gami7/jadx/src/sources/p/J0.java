package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class J0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1006a0 f9442l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C1006a0 c1006a0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9442l = c1006a0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        J0 j02 = (J0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        j02.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new J0(this.f9442l, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        C1006a0 c1006a0 = this.f9442l;
        c1006a0.f9555i = true;
        c1006a0.f9557k.d(null);
        return C0880v.f8657a;
    }
}
