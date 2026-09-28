package J2;

import O2.AbstractC0369a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.C0880v;
import q2.InterfaceC1073d;

/* renamed from: J2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313j extends b0 {

    /* renamed from: l, reason: collision with root package name */
    public final C0311h f4411l;

    public C0313j(C0311h c0311h) {
        this.f4411l = c0311h;
    }

    @Override // y2.c
    public final /* bridge */ /* synthetic */ Object l(Object obj) {
        r((Throwable) obj);
        return C0880v.f8657a;
    }

    @Override // J2.d0
    public final void r(Throwable th) {
        i0 q = q();
        C0311h c0311h = this.f4411l;
        Throwable p3 = c0311h.p(q);
        if (c0311h.w()) {
            InterfaceC1073d interfaceC1073d = c0311h.f4402k;
            z2.h.d(interfaceC1073d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            O2.h hVar = (O2.h) interfaceC1073d;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = O2.h.f5178o;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                O2.v vVar = AbstractC0369a.f5168d;
                if (!z2.h.a(obj, vVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, p3)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0311h.H(p3);
        if (c0311h.w()) {
            return;
        }
        c0311h.m();
    }
}
