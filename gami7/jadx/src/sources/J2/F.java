package J2;

import O2.AbstractC0369a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n2.AbstractC0948C;

/* loaded from: classes.dex */
public final class F extends O2.s {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4354l = AtomicIntegerFieldUpdater.newUpdater(F.class, "_decision");
    private volatile int _decision;

    @Override // O2.s, J2.i0
    public final void G(Object obj) {
        I(obj);
    }

    @Override // O2.s, J2.i0
    public final void I(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f4354l;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                AbstractC0369a.h(AbstractC0948C.i(this.f5204k), B.s(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
