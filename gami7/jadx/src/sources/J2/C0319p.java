package J2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: J2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0319p {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4421b = AtomicIntegerFieldUpdater.newUpdater(C0319p.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4422a;

    public C0319p(Throwable th, boolean z3) {
        this.f4422a = th;
        this._handled = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f4422a + ']';
    }
}
