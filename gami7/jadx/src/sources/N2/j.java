package N2;

import M2.InterfaceC0343g;
import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class j extends i {
    @Override // N2.AbstractC0368g
    public final AbstractC0368g g(InterfaceC1078i interfaceC1078i, int i2, int i3) {
        return new j(this.f5049k, interfaceC1078i, i2, i3);
    }

    @Override // N2.AbstractC0368g
    public final InterfaceC0343g h() {
        return this.f5049k;
    }

    @Override // N2.i
    public final Object j(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        Object b3 = this.f5049k.b(interfaceC0344h, interfaceC1073d);
        return b3 == EnumC1145a.f10026h ? b3 : C0880v.f8657a;
    }
}
