package N2;

import q2.InterfaceC1076g;
import q2.InterfaceC1077h;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class t implements InterfaceC1078i {

    /* renamed from: h, reason: collision with root package name */
    public final Throwable f5083h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1078i f5084i;

    public t(Throwable th, InterfaceC1078i interfaceC1078i) {
        this.f5083h = th;
        this.f5084i = interfaceC1078i;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i A(InterfaceC1078i interfaceC1078i) {
        return this.f5084i.A(interfaceC1078i);
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i h(InterfaceC1077h interfaceC1077h) {
        return this.f5084i.h(interfaceC1077h);
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1076g s(InterfaceC1077h interfaceC1077h) {
        return this.f5084i.s(interfaceC1077h);
    }

    @Override // q2.InterfaceC1078i
    public final Object y(Object obj, y2.e eVar) {
        return this.f5084i.y(obj, eVar);
    }
}
