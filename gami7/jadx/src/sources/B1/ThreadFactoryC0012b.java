package B1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: B1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0012b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f270a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f271b;

    public ThreadFactoryC0012b(boolean z3) {
        this.f271b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        z2.h.f(runnable, "runnable");
        return new Thread(runnable, (this.f271b ? "WM.task-" : "androidx.work-") + this.f270a.incrementAndGet());
    }
}
