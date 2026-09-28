package N2;

import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class D implements InterfaceC0344h {

    /* renamed from: h, reason: collision with root package name */
    public final L2.x f5021h;

    public D(L2.x xVar) {
        this.f5021h = xVar;
    }

    @Override // M2.InterfaceC0344h
    public final Object f(Object obj, InterfaceC1073d interfaceC1073d) {
        Object v3 = this.f5021h.v(obj, interfaceC1073d);
        return v3 == EnumC1145a.f10026h ? v3 : C0880v.f8657a;
    }
}
