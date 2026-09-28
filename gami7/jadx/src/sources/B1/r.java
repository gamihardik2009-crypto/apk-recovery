package B1;

import android.content.Context;
import androidx.work.WorkerParameters;
import l2.InterfaceFutureC0816a;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: h, reason: collision with root package name */
    public final Context f301h;

    /* renamed from: i, reason: collision with root package name */
    public final WorkerParameters f302i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f303j = -256;

    /* renamed from: k, reason: collision with root package name */
    public boolean f304k;

    public r(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f301h = context;
        this.f302i = workerParameters;
    }

    public InterfaceFutureC0816a b() {
        M1.k kVar = new M1.k();
        kVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public void c() {
    }

    public abstract M1.k d();

    public final void e(int i2) {
        this.f303j = i2;
        c();
    }
}
