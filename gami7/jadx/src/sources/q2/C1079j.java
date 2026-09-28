package q2;

import java.io.Serializable;

/* renamed from: q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079j implements InterfaceC1078i, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final C1079j f9784h = new C1079j();

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i A(InterfaceC1078i interfaceC1078i) {
        z2.h.f(interfaceC1078i, "context");
        return interfaceC1078i;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i h(InterfaceC1077h interfaceC1077h) {
        z2.h.f(interfaceC1077h, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1076g s(InterfaceC1077h interfaceC1077h) {
        z2.h.f(interfaceC1077h, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // q2.InterfaceC1078i
    public final Object y(Object obj, y2.e eVar) {
        return obj;
    }
}
