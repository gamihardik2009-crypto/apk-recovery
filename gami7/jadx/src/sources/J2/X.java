package J2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m2.C0880v;

/* loaded from: classes.dex */
public final class X extends b0 {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4376m = AtomicIntegerFieldUpdater.newUpdater(X.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: l, reason: collision with root package name */
    public final y2.c f4377l;

    public X(y2.c cVar) {
        this.f4377l = cVar;
    }

    @Override // y2.c
    public final /* bridge */ /* synthetic */ Object l(Object obj) {
        r((Throwable) obj);
        return C0880v.f8657a;
    }

    @Override // J2.d0
    public final void r(Throwable th) {
        if (f4376m.compareAndSet(this, 0, 1)) {
            this.f4377l.l(th);
        }
    }
}
