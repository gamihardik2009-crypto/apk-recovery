package S0;

import B1.C;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import l2.InterfaceFutureC0816a;

/* loaded from: classes.dex */
public abstract class g implements InterfaceFutureC0816a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5588d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f5589e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final C f5590f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5591g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5592a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f5593b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f5594c;

    static {
        C eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e(18);
        }
        f5590f = eVar;
        if (th != null) {
            f5589e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5591g = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f5594c;
        } while (!f5590f.t(gVar, fVar, f.f5585c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f5586a;
            if (thread != null) {
                fVar.f5586a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f5587b;
        }
        do {
            cVar2 = gVar.f5593b;
        } while (!f5590f.r(gVar, cVar2, c.f5576d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f5579c;
            cVar.f5579c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f5579c;
            d(cVar3.f5577a, cVar3.f5578b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f5589e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f5575a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f5591g) {
            return null;
        }
        return obj;
    }

    @Override // l2.InterfaceFutureC0816a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f5593b;
        c cVar2 = c.f5576d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f5579c = cVar;
                if (f5590f.r(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f5593b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                } catch (Throwable th) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e4) {
                sb.append("FAILURE, cause=[");
                sb.append(e4.getCause());
                sb.append("]");
                return;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f5592a;
        if (obj == null) {
            if (f5590f.s(this, obj, f5588d ? new a(new CancellationException("Future.cancel() was called."), z3) : z3 ? a.f5573b : a.f5574c)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    public final void f(f fVar) {
        fVar.f5586a = null;
        while (true) {
            f fVar2 = this.f5594c;
            if (fVar2 == f.f5585c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f5587b;
                if (fVar2.f5586a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f5587b = fVar4;
                    if (fVar3.f5586a == null) {
                        break;
                    }
                } else if (!f5590f.t(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009f -> B:33:0x006e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.g.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5592a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f5592a != null) & true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5592a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5592a;
            if ((obj2 != null) & true) {
                return e(obj2);
            }
            f fVar = this.f5594c;
            f fVar2 = f.f5585c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    C c3 = f5590f;
                    c3.h0(fVar3, fVar);
                    if (c3.t(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5592a;
                            } else {
                                f(fVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return e(obj);
                    }
                    fVar = this.f5594c;
                } while (fVar != fVar2);
            }
            return e(this.f5592a);
        }
        throw new InterruptedException();
    }
}
