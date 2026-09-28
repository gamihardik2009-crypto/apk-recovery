package J2;

import java.util.concurrent.locks.LockSupport;
import q2.InterfaceC1078i;

/* renamed from: J2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306c extends AbstractC0304a {

    /* renamed from: k, reason: collision with root package name */
    public final Thread f4384k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f4385l;

    public C0306c(InterfaceC1078i interfaceC1078i, Thread thread, Q q) {
        super(interfaceC1078i, true);
        this.f4384k = thread;
        this.f4385l = q;
    }

    @Override // J2.i0
    public final void G(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f4384k;
        if (z2.h.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
