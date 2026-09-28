package B1;

import J2.c0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l2.InterfaceFutureC0816a;

/* loaded from: classes.dex */
public final class m implements InterfaceFutureC0816a {

    /* renamed from: a, reason: collision with root package name */
    public final M1.k f298a = new M1.k();

    public m(c0 c0Var) {
        c0Var.g(new A0.n(2, this));
    }

    @Override // l2.InterfaceFutureC0816a
    public final void a(Runnable runnable, Executor executor) {
        this.f298a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f298a.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f298a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f298a.f4781a instanceof M1.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f298a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f298a.get(j3, timeUnit);
    }
}
