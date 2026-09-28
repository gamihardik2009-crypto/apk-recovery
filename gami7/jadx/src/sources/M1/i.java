package M1;

import a.AbstractC0423a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import l2.InterfaceFutureC0816a;

/* loaded from: classes.dex */
public abstract class i implements InterfaceFutureC0816a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4777d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f4778e = Logger.getLogger(i.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0423a f4779f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f4780g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f4781a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f4782b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f4783c;

    static {
        AbstractC0423a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f4779f = gVar;
        if (th != null) {
            f4778e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4780g = new Object();
    }

    public static void c(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f4783c;
            if (f4779f.C(iVar, hVar, h.f4774c)) {
                while (hVar != null) {
                    Thread thread = hVar.f4775a;
                    if (thread != null) {
                        hVar.f4775a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f4776b;
                }
                do {
                    dVar = iVar.f4782b;
                } while (!f4779f.A(iVar, dVar, d.f4763d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f4766c;
                    dVar3.f4766c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f4766c;
                    Runnable runnable = dVar2.f4764a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f4772h;
                        if (iVar.f4781a == fVar) {
                            if (f4779f.B(iVar, fVar, f(fVar.f4773i))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f4765b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f4778e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f4760b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f4762a);
        }
        if (obj == f4780g) {
            return null;
        }
        return obj;
    }

    public static Object f(InterfaceFutureC0816a interfaceFutureC0816a) {
        if (interfaceFutureC0816a instanceof i) {
            Object obj = ((i) interfaceFutureC0816a).f4781a;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar = (a) obj;
            return aVar.f4759a ? aVar.f4760b != null ? new a(aVar.f4760b, false) : a.f4758d : obj;
        }
        boolean isCancelled = interfaceFutureC0816a.isCancelled();
        if ((!f4777d) && isCancelled) {
            return a.f4758d;
        }
        try {
            Object g3 = g(interfaceFutureC0816a);
            return g3 == null ? f4780g : g3;
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new a(e3, false);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC0816a, e3));
        } catch (ExecutionException e4) {
            return new c(e4.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // l2.InterfaceFutureC0816a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f4782b;
        d dVar2 = d.f4763d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f4766c = dVar;
                if (f4779f.A(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f4782b;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g3 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g3 == this ? "this future" : String.valueOf(g3));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f4781a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        a aVar = f4777d ? new a(new CancellationException("Future.cancel() was called."), z3) : z3 ? a.f4757c : a.f4758d;
        i iVar = this;
        boolean z4 = false;
        while (true) {
            if (f4779f.B(iVar, obj, aVar)) {
                c(iVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                InterfaceFutureC0816a interfaceFutureC0816a = ((f) obj).f4773i;
                if (!(interfaceFutureC0816a instanceof i)) {
                    interfaceFutureC0816a.cancel(z3);
                    return true;
                }
                iVar = (i) interfaceFutureC0816a;
                obj = iVar.f4781a;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z4 = true;
            } else {
                obj = iVar.f4781a;
                if (!(obj instanceof f)) {
                    return z4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:33:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.i.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f4781a;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC0816a interfaceFutureC0816a = ((f) obj).f4773i;
            sb.append(interfaceFutureC0816a == this ? "this future" : String.valueOf(interfaceFutureC0816a));
            sb.append("]");
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.f4775a = null;
        while (true) {
            h hVar2 = this.f4783c;
            if (hVar2 == h.f4774c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f4776b;
                if (hVar2.f4775a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f4776b = hVar4;
                    if (hVar3.f4775a == null) {
                        break;
                    }
                } else if (!f4779f.C(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4781a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f4781a != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4781a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
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
            Object obj2 = this.f4781a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f4783c;
            h hVar2 = h.f4774c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0423a abstractC0423a = f4779f;
                    abstractC0423a.V(hVar3, hVar);
                    if (abstractC0423a.C(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4781a;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f4783c;
                } while (hVar != hVar2);
            }
            return e(this.f4781a);
        }
        throw new InterruptedException();
    }
}
