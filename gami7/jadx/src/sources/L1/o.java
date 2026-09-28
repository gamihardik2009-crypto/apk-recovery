package L1;

import B1.F;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class o implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4655h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f4656i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f4657j;

    /* renamed from: k, reason: collision with root package name */
    public Runnable f4658k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4659l;

    public o(Executor executor) {
        this.f4655h = 1;
        z2.h.f(executor, "executor");
        this.f4656i = executor;
        this.f4657j = new ArrayDeque();
        this.f4659l = new Object();
    }

    public final void a() {
        switch (this.f4655h) {
            case 0:
                Runnable runnable = (Runnable) this.f4657j.poll();
                this.f4658k = runnable;
                if (runnable != null) {
                    this.f4656i.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f4659l) {
                    Object poll = this.f4657j.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.f4658k = runnable2;
                    if (poll != null) {
                        this.f4656i.execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4655h) {
            case 0:
                synchronized (this.f4659l) {
                    try {
                        this.f4657j.add(new F(7, (Object) this, (Object) runnable, false));
                        if (this.f4658k == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                z2.h.f(runnable, "command");
                synchronized (this.f4659l) {
                    this.f4657j.offer(new C1.z(runnable, 8, this));
                    if (this.f4658k == null) {
                        a();
                    }
                }
                return;
        }
    }

    public o(ExecutorService executorService) {
        this.f4655h = 0;
        this.f4656i = executorService;
        this.f4657j = new ArrayDeque();
        this.f4659l = new Object();
    }
}
