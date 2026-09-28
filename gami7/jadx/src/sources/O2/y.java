package O2;

import n2.AbstractC0948C;
import q2.C1079j;
import q2.InterfaceC1076g;
import q2.InterfaceC1077h;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class y implements InterfaceC1076g {

    /* renamed from: h, reason: collision with root package name */
    public final Object f5215h;

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f5216i;

    /* renamed from: j, reason: collision with root package name */
    public final z f5217j;

    public y(Integer num, ThreadLocal threadLocal) {
        this.f5215h = num;
        this.f5216i = threadLocal;
        this.f5217j = new z(threadLocal);
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i A(InterfaceC1078i interfaceC1078i) {
        return AbstractC0948C.n(this, interfaceC1078i);
    }

    public final void c(Object obj) {
        this.f5216i.set(obj);
    }

    public final Object e(InterfaceC1078i interfaceC1078i) {
        ThreadLocal threadLocal = this.f5216i;
        Object obj = threadLocal.get();
        threadLocal.set(this.f5215h);
        return obj;
    }

    @Override // q2.InterfaceC1076g
    public final InterfaceC1077h getKey() {
        return this.f5217j;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i h(InterfaceC1077h interfaceC1077h) {
        return z2.h.a(this.f5217j, interfaceC1077h) ? C1079j.f9784h : this;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1076g s(InterfaceC1077h interfaceC1077h) {
        if (z2.h.a(this.f5217j, interfaceC1077h)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f5215h + ", threadLocal = " + this.f5216i + ')';
    }

    @Override // q2.InterfaceC1078i
    public final Object y(Object obj, y2.e eVar) {
        return eVar.j(obj, this);
    }
}
