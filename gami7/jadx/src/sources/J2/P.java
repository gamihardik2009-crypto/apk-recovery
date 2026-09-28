package J2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import n2.C0958j;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public abstract class P extends Q implements E {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4366n = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_queue");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4367o = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_delayed");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4368p = AtomicIntegerFieldUpdater.newUpdater(P.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // J2.Q
    public final long F() {
        Runnable runnable;
        N n3;
        N b3;
        if (G()) {
            return 0L;
        }
        O o3 = (O) f4367o.get(this);
        if (o3 != null && O2.A.f5159b.get(o3) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (o3) {
                    N[] nArr = o3.f5160a;
                    N n4 = nArr != null ? nArr[0] : null;
                    b3 = n4 == null ? null : (nanoTime - n4.f4363h < 0 || !K(n4)) ? null : o3.b(0);
                }
            } while (b3 != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4366n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (!(obj instanceof O2.n)) {
                if (obj != B.f4344c) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop1;
                }
                break;
            }
            O2.n nVar = (O2.n) obj;
            Object d3 = nVar.d();
            if (d3 != O2.n.f5197g) {
                runnable = (Runnable) d3;
                break;
            }
            O2.n c3 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C0958j c0958j = this.f4372l;
        if (((c0958j == null || c0958j.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f4366n.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof O2.n)) {
                if (obj2 != B.f4344c) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j3 = O2.n.f5196f.get((O2.n) obj2);
            if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        O o4 = (O) f4367o.get(this);
        if (o4 != null) {
            synchronized (o4) {
                N[] nArr2 = o4.f5160a;
                n3 = nArr2 != null ? nArr2[0] : null;
            }
            if (n3 != null) {
                return B1.C.y(n3.f4363h - System.nanoTime(), 0L);
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // J2.Q
    public void I() {
        N b3;
        ThreadLocal threadLocal = r0.f4425a;
        r0.f4425a.set(null);
        f4368p.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4366n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            O2.v vVar = B.f4344c;
            if (obj != null) {
                if (!(obj instanceof O2.n)) {
                    if (obj != vVar) {
                        O2.n nVar = new O2.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((O2.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (F() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            O o3 = (O) f4367o.get(this);
            if (o3 == null) {
                return;
            }
            synchronized (o3) {
                b3 = O2.A.f5159b.get(o3) > 0 ? o3.b(0) : null;
            }
            if (b3 == null) {
                return;
            } else {
                H(nanoTime, b3);
            }
        }
    }

    public void J(Runnable runnable) {
        if (!K(runnable)) {
            C.q.J(runnable);
            return;
        }
        Thread B3 = B();
        if (Thread.currentThread() != B3) {
            LockSupport.unpark(B3);
        }
    }

    public final boolean K(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4366n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f4368p.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof O2.n)) {
                if (obj == B.f4344c) {
                    return false;
                }
                O2.n nVar = new O2.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            O2.n nVar2 = (O2.n) obj;
            int a3 = nVar2.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                O2.n c3 = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final boolean L() {
        C0958j c0958j = this.f4372l;
        if (!(c0958j != null ? c0958j.isEmpty() : true)) {
            return false;
        }
        O o3 = (O) f4367o.get(this);
        if (o3 != null && O2.A.f5159b.get(o3) != 0) {
            return false;
        }
        Object obj = f4366n.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof O2.n) {
            long j3 = O2.n.f5196f.get((O2.n) obj);
            if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == B.f4344c) {
            return true;
        }
        return false;
    }

    public final void M(long j3, N n3) {
        int c3;
        Thread B3;
        boolean z3 = f4368p.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4367o;
        if (z3) {
            c3 = 1;
        } else {
            O o3 = (O) atomicReferenceFieldUpdater.get(this);
            if (o3 == null) {
                O o4 = new O();
                o4.f4365c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, o4) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                z2.h.c(obj);
                o3 = (O) obj;
            }
            c3 = n3.c(j3, o3, this);
        }
        if (c3 != 0) {
            if (c3 == 1) {
                H(j3, n3);
                return;
            } else {
                if (c3 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        O o5 = (O) atomicReferenceFieldUpdater.get(this);
        if (o5 != null) {
            synchronized (o5) {
                N[] nArr = o5.f5160a;
                r4 = nArr != null ? nArr[0] : null;
            }
        }
        if (r4 != n3 || Thread.currentThread() == (B3 = B())) {
            return;
        }
        LockSupport.unpark(B3);
    }

    @Override // J2.E
    public final void c(long j3, C0311h c0311h) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            L l3 = new L(this, j4 + nanoTime, c0311h);
            M(nanoTime, l3);
            c0311h.u(new C0308e(1, l3));
        }
    }

    public J e(long j3, Runnable runnable, InterfaceC1078i interfaceC1078i) {
        return D.f4353a.e(j3, runnable, interfaceC1078i);
    }

    @Override // J2.AbstractC0324v
    public final void r(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        J(runnable);
    }
}
