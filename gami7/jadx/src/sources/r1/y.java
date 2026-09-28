package r1;

import java.util.concurrent.atomic.AtomicInteger;
import n2.AbstractC0948C;
import o2.C0997c;
import q2.InterfaceC1075f;
import q2.InterfaceC1076g;
import q2.InterfaceC1077h;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class y implements InterfaceC1076g {

    /* renamed from: j, reason: collision with root package name */
    public static final C0997c f10023j = new C0997c(5);

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1075f f10024h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f10025i = new AtomicInteger(0);

    public y(InterfaceC1075f interfaceC1075f) {
        this.f10024h = interfaceC1075f;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i A(InterfaceC1078i interfaceC1078i) {
        return AbstractC0948C.n(this, interfaceC1078i);
    }

    @Override // q2.InterfaceC1076g
    public final InterfaceC1077h getKey() {
        return f10023j;
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
