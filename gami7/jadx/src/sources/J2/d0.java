package J2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d0 extends O2.k implements J, V, y2.c {

    /* renamed from: k, reason: collision with root package name */
    public i0 f4387k;

    @Override // J2.J
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        i0 q = q();
        while (true) {
            Object V2 = q.V();
            if (V2 instanceof d0) {
                if (V2 != this) {
                    return;
                }
                K k3 = B.f4351j;
                do {
                    atomicReferenceFieldUpdater2 = i0.f4409h;
                    if (atomicReferenceFieldUpdater2.compareAndSet(q, V2, k3)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(q) == V2);
            } else {
                if (!(V2 instanceof V) || ((V) V2).f() == null) {
                    return;
                }
                while (true) {
                    Object n3 = n();
                    if (n3 instanceof O2.q) {
                        O2.k kVar = ((O2.q) n3).f5203a;
                        return;
                    }
                    if (n3 == this) {
                        return;
                    }
                    z2.h.d(n3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    O2.k kVar2 = (O2.k) n3;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = O2.k.f5192j;
                    O2.q qVar = (O2.q) atomicReferenceFieldUpdater3.get(kVar2);
                    if (qVar == null) {
                        qVar = new O2.q(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, qVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = O2.k.f5190h;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, n3, qVar)) {
                            kVar2.k();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == n3);
                }
            }
        }
    }

    @Override // J2.V
    public final boolean b() {
        return true;
    }

    @Override // J2.V
    public final k0 f() {
        return null;
    }

    public Z getParent() {
        return q();
    }

    public final i0 q() {
        i0 i0Var = this.f4387k;
        if (i0Var != null) {
            return i0Var;
        }
        z2.h.j("job");
        throw null;
    }

    public abstract void r(Throwable th);

    @Override // O2.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + B.j(this) + "[job@" + B.j(q()) + ']';
    }
}
