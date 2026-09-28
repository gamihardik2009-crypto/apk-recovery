package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class I0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1006a0 f9436l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(C1006a0 c1006a0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9436l = c1006a0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        I0 i02 = (I0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2);
        C0880v c0880v = C0880v.f8657a;
        i02.p(c0880v);
        return c0880v;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new I0(this.f9436l, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        C1.y.J(obj);
        C1006a0 c1006a0 = this.f9436l;
        c1006a0.f9556j = true;
        c1006a0.f9557k.d(null);
        return C0880v.f8657a;
    }
}
