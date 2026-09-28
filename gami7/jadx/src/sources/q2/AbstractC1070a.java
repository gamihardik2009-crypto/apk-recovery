package q2;

import n2.AbstractC0948C;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1070a implements InterfaceC1076g {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1077h f9776h;

    public AbstractC1070a(InterfaceC1077h interfaceC1077h) {
        this.f9776h = interfaceC1077h;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i A(InterfaceC1078i interfaceC1078i) {
        return AbstractC0948C.n(this, interfaceC1078i);
    }

    @Override // q2.InterfaceC1076g
    public final InterfaceC1077h getKey() {
        return this.f9776h;
    }

    @Override // q2.InterfaceC1078i
    public InterfaceC1078i h(InterfaceC1077h interfaceC1077h) {
        return AbstractC0948C.k(this, interfaceC1077h);
    }

    @Override // q2.InterfaceC1078i
    public InterfaceC1076g s(InterfaceC1077h interfaceC1077h) {
        return AbstractC0948C.h(this, interfaceC1077h);
    }

    @Override // q2.InterfaceC1078i
    public final Object y(Object obj, y2.e eVar) {
        return eVar.j(obj, this);
    }
}
