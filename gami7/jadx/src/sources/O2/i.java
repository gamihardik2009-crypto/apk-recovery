package O2;

import B1.F;
import J2.AbstractC0324v;
import J2.C0311h;
import J2.D;
import J2.E;
import J2.J;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class i extends AbstractC0324v implements E {

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5183o = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0324v f5184j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5185k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f5186l;

    /* renamed from: m, reason: collision with root package name */
    public final l f5187m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f5188n;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Q2.l lVar, int i2) {
        this.f5184j = lVar;
        this.f5185k = i2;
        E e3 = lVar instanceof E ? (E) lVar : null;
        this.f5186l = e3 == null ? D.f4353a : e3;
        this.f5187m = new l();
        this.f5188n = new Object();
    }

    @Override // J2.E
    public final void c(long j3, C0311h c0311h) {
        this.f5186l.c(j3, c0311h);
    }

    @Override // J2.E
    public final J e(long j3, Runnable runnable, InterfaceC1078i interfaceC1078i) {
        return this.f5186l.e(j3, runnable, interfaceC1078i);
    }

    @Override // J2.AbstractC0324v
    public final void r(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        Runnable x2;
        this.f5187m.a(runnable);
        if (f5183o.get(this) >= this.f5185k || !z() || (x2 = x()) == null) {
            return;
        }
        this.f5184j.r(this, new F(this, 9, x2));
    }

    @Override // J2.AbstractC0324v
    public final void v(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        Runnable x2;
        this.f5187m.a(runnable);
        if (f5183o.get(this) >= this.f5185k || !z() || (x2 = x()) == null) {
            return;
        }
        this.f5184j.v(this, new F(this, 9, x2));
    }

    public final Runnable x() {
        while (true) {
            Runnable runnable = (Runnable) this.f5187m.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f5188n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5183o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f5187m.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean z() {
        synchronized (this.f5188n) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5183o;
            if (atomicIntegerFieldUpdater.get(this) >= this.f5185k) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
