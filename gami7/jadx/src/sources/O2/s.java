package O2;

import J2.AbstractC0304a;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import s2.InterfaceC1199d;

/* loaded from: classes.dex */
public class s extends AbstractC0304a implements InterfaceC1199d {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1073d f5204k;

    public s(InterfaceC1073d interfaceC1073d, InterfaceC1078i interfaceC1078i) {
        super(interfaceC1078i, true);
        this.f5204k = interfaceC1073d;
    }

    @Override // J2.i0
    public void G(Object obj) {
        AbstractC0369a.h(AbstractC0948C.i(this.f5204k), J2.B.s(obj), null);
    }

    @Override // J2.i0
    public void I(Object obj) {
        this.f5204k.t(J2.B.s(obj));
    }

    @Override // J2.i0
    public final boolean Z() {
        return true;
    }

    @Override // s2.InterfaceC1199d
    public final InterfaceC1199d k() {
        InterfaceC1073d interfaceC1073d = this.f5204k;
        if (interfaceC1073d instanceof InterfaceC1199d) {
            return (InterfaceC1199d) interfaceC1073d;
        }
        return null;
    }
}
