package J2;

import O2.AbstractC0369a;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class j0 extends p0 {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1073d f4412k;

    public j0(InterfaceC1078i interfaceC1078i, y2.e eVar) {
        super(interfaceC1078i, false);
        this.f4412k = AbstractC0948C.g(this, this, eVar);
    }

    @Override // J2.i0
    public final void f0() {
        try {
            AbstractC0369a.h(AbstractC0948C.i(this.f4412k), C0880v.f8657a, null);
        } catch (Throwable th) {
            t(C1.y.n(th));
            throw th;
        }
    }
}
