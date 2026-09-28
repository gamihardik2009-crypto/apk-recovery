package O2;

import J2.n0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public abstract class t extends d implements n0 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5205k = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: j, reason: collision with root package name */
    public final long f5206j;

    public t(long j3, t tVar, int i2) {
        super(tVar);
        this.f5206j = j3;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // O2.d
    public final boolean c() {
        return f5205k.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f5205k.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, InterfaceC1078i interfaceC1078i);

    public final void h() {
        if (f5205k.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f5205k;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
