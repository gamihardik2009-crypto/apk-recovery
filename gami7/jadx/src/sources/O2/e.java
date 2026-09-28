package O2;

import J2.InterfaceC0328z;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class e implements InterfaceC0328z {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1078i f5175h;

    public e(InterfaceC1078i interfaceC1078i) {
        this.f5175h = interfaceC1078i;
    }

    @Override // J2.InterfaceC0328z
    public final InterfaceC1078i r() {
        return this.f5175h;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f5175h + ')';
    }
}
