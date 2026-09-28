package m1;

import J2.C0325w;
import J2.InterfaceC0328z;
import J2.Z;
import q2.InterfaceC1078i;
import z2.h;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855a implements AutoCloseable, InterfaceC0328z {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1078i f8634h;

    public C0855a(InterfaceC1078i interfaceC1078i) {
        h.f(interfaceC1078i, "coroutineContext");
        this.f8634h = interfaceC1078i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Z z3 = (Z) this.f8634h.s(C0325w.f4437i);
        if (z3 != null) {
            z3.a(null);
        }
    }

    @Override // J2.InterfaceC0328z
    public final InterfaceC1078i r() {
        return this.f8634h;
    }
}
