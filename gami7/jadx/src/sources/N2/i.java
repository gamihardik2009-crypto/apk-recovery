package N2;

import H.Q1;
import J2.C0321s;
import M2.InterfaceC0343g;
import M2.InterfaceC0344h;
import O2.AbstractC0369a;
import m2.C0880v;
import q2.C1074e;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public abstract class i extends AbstractC0368g {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0343g f5049k;

    public i(InterfaceC0343g interfaceC0343g, InterfaceC1078i interfaceC1078i, int i2, int i3) {
        super(interfaceC1078i, i2, i3);
        this.f5049k = interfaceC0343g;
    }

    @Override // N2.AbstractC0368g, M2.InterfaceC0343g
    public final Object b(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        Object b3;
        C0880v c0880v = C0880v.f8657a;
        int i2 = this.f5044i;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        if (i2 == -3) {
            InterfaceC1078i n3 = interfaceC1073d.n();
            Boolean bool = Boolean.FALSE;
            C0321s c0321s = C0321s.f4427k;
            InterfaceC1078i interfaceC1078i = this.f5043h;
            InterfaceC1078i A3 = !((Boolean) interfaceC1078i.y(bool, c0321s)).booleanValue() ? n3.A(interfaceC1078i) : J2.B.h(n3, interfaceC1078i, false);
            if (z2.h.a(A3, n3)) {
                b3 = j(interfaceC0344h, interfaceC1073d);
                if (b3 != enumC1145a) {
                    return c0880v;
                }
            } else {
                C1074e c1074e = C1074e.f9782h;
                if (z2.h.a(A3.s(c1074e), n3.s(c1074e))) {
                    InterfaceC1078i n4 = interfaceC1073d.n();
                    if (!(interfaceC0344h instanceof D) && !(interfaceC0344h instanceof y)) {
                        interfaceC0344h = new Q1(interfaceC0344h, n4);
                    }
                    b3 = AbstractC0364c.b(A3, interfaceC0344h, AbstractC0369a.k(A3), new h(this, null), interfaceC1073d);
                    if (b3 != enumC1145a) {
                        b3 = c0880v;
                    }
                    if (b3 != enumC1145a) {
                        return c0880v;
                    }
                }
            }
            return b3;
        }
        b3 = super.b(interfaceC0344h, interfaceC1073d);
        if (b3 != enumC1145a) {
            return c0880v;
        }
        return b3;
    }

    @Override // N2.AbstractC0368g
    public final Object f(L2.u uVar, InterfaceC1073d interfaceC1073d) {
        Object j3 = j(new D(uVar), interfaceC1073d);
        return j3 == EnumC1145a.f10026h ? j3 : C0880v.f8657a;
    }

    public abstract Object j(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d);

    @Override // N2.AbstractC0368g
    public final String toString() {
        return this.f5049k + " -> " + super.toString();
    }
}
