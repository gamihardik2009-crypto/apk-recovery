package N2;

import M2.InterfaceC0343g;
import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: l, reason: collision with root package name */
    public final y2.f f5063l;

    public n(y2.f fVar, InterfaceC0343g interfaceC0343g, InterfaceC1078i interfaceC1078i, int i2, int i3) {
        super(interfaceC0343g, interfaceC1078i, i2, i3);
        this.f5063l = fVar;
    }

    @Override // N2.AbstractC0368g
    public final AbstractC0368g g(InterfaceC1078i interfaceC1078i, int i2, int i3) {
        return new n(this.f5063l, this.f5049k, interfaceC1078i, i2, i3);
    }

    @Override // N2.i
    public final Object j(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        Object e3 = J2.B.e(new m(this, interfaceC0344h, null), interfaceC1073d);
        return e3 == EnumC1145a.f10026h ? e3 : C0880v.f8657a;
    }
}
