package N2;

import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import s2.InterfaceC1199d;

/* loaded from: classes.dex */
public final class E implements InterfaceC1073d, InterfaceC1199d {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1073d f5022h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1078i f5023i;

    public E(InterfaceC1073d interfaceC1073d, InterfaceC1078i interfaceC1078i) {
        this.f5022h = interfaceC1073d;
        this.f5023i = interfaceC1078i;
    }

    @Override // s2.InterfaceC1199d
    public final InterfaceC1199d k() {
        InterfaceC1073d interfaceC1073d = this.f5022h;
        if (interfaceC1073d instanceof InterfaceC1199d) {
            return (InterfaceC1199d) interfaceC1073d;
        }
        return null;
    }

    @Override // q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        return this.f5023i;
    }

    @Override // q2.InterfaceC1073d
    public final void t(Object obj) {
        this.f5022h.t(obj);
    }
}
