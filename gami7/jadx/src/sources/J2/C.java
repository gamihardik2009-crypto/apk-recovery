package J2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class C extends P implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final C q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f4352r;

    static {
        Long l3;
        C c3 = new C();
        q = c3;
        c3.D(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f4352r = timeUnit.toNanos(l3.longValue());
    }

    @Override // J2.Q
    public final Thread B() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // J2.Q
    public final void H(long j3, N n3) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // J2.P, J2.Q
    public final void I() {
        debugStatus = 4;
        super.I();
    }

    @Override // J2.P
    public final void J(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.J(runnable);
    }

    public final synchronized void N() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            P.f4366n.set(this, null);
            P.f4367o.set(this, null);
            notifyAll();
        }
    }

    @Override // J2.P, J2.E
    public final J e(long j3, Runnable runnable, InterfaceC1078i interfaceC1078i) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 >= 4611686018427387903L) {
            return m0.f4415h;
        }
        long nanoTime = System.nanoTime();
        M m3 = new M(j4 + nanoTime, runnable);
        M(nanoTime, m3);
        return m3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean L3;
        r0.f4425a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 != 2 && i2 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j3 = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long F = F();
                        if (F == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j3 == Long.MAX_VALUE) {
                                j3 = f4352r + nanoTime;
                            }
                            long j4 = j3 - nanoTime;
                            if (j4 <= 0) {
                                _thread = null;
                                N();
                                if (L()) {
                                    return;
                                }
                                B();
                                return;
                            }
                            if (F > j4) {
                                F = j4;
                            }
                        } else {
                            j3 = Long.MAX_VALUE;
                        }
                        if (F > 0) {
                            int i3 = debugStatus;
                            if (i3 == 2 || i3 == 3) {
                                break;
                            } else {
                                LockSupport.parkNanos(this, F);
                            }
                        }
                    }
                    if (L3) {
                        return;
                    } else {
                        return;
                    }
                }
                _thread = null;
                N();
                if (L()) {
                    return;
                }
                B();
            }
        } finally {
            _thread = null;
            N();
            if (!L()) {
                B();
            }
        }
    }
}
