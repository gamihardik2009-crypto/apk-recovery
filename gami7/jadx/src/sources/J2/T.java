package J2;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class T extends S implements E {

    /* renamed from: j, reason: collision with root package name */
    public final Executor f4373j;

    public T(Executor executor) {
        Method method;
        this.f4373j = executor;
        Method method2 = O2.c.f5172a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = O2.c.f5172a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // J2.E
    public final void c(long j3, C0311h c0311h) {
        Executor executor = this.f4373j;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new B1.F(5, (Object) this, (Object) c0311h, false), j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                Z z3 = (Z) c0311h.f4403l.s(C0325w.f4437i);
                if (z3 != null) {
                    z3.a(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0311h.u(new C0308e(0, scheduledFuture));
        } else {
            C.q.c(j3, c0311h);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f4373j;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // J2.E
    public final J e(long j3, Runnable runnable, InterfaceC1078i interfaceC1078i) {
        Executor executor = this.f4373j;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                Z z3 = (Z) interfaceC1078i.s(C0325w.f4437i);
                if (z3 != null) {
                    z3.a(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new I(scheduledFuture) : C.q.e(j3, runnable, interfaceC1078i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof T) && ((T) obj).f4373j == this.f4373j;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4373j);
    }

    @Override // J2.AbstractC0324v
    public final void r(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        try {
            this.f4373j.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            Z z3 = (Z) interfaceC1078i.s(C0325w.f4437i);
            if (z3 != null) {
                z3.a(cancellationException);
            }
            H.f4357b.r(interfaceC1078i, runnable);
        }
    }

    @Override // J2.AbstractC0324v
    public final String toString() {
        return this.f4373j.toString();
    }
}
