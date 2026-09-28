package J2;

import n2.AbstractC0948C;
import q2.InterfaceC1076g;
import q2.InterfaceC1077h;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class v0 implements InterfaceC1076g, InterfaceC1077h {

    /* renamed from: h, reason: collision with root package name */
    public static final v0 f4435h = new v0();

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i A(InterfaceC1078i interfaceC1078i) {
        return AbstractC0948C.n(this, interfaceC1078i);
    }

    @Override // q2.InterfaceC1076g
    public final InterfaceC1077h getKey() {
        return this;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i h(InterfaceC1077h interfaceC1077h) {
        return AbstractC0948C.k(this, interfaceC1077h);
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1076g s(InterfaceC1077h interfaceC1077h) {
        return AbstractC0948C.h(this, interfaceC1077h);
    }

    @Override // q2.InterfaceC1078i
    public final Object y(Object obj, y2.e eVar) {
        return eVar.j(obj, this);
    }
}
