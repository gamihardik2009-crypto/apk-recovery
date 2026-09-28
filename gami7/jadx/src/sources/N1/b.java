package N1;

import J2.T;
import L1.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final o f5010a;

    /* renamed from: b, reason: collision with root package name */
    public final T f5011b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f5012c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final a f5013d = new a(this);

    public b(ExecutorService executorService) {
        o oVar = new o(executorService);
        this.f5010a = oVar;
        this.f5011b = new T(oVar);
    }

    public final void a(Runnable runnable) {
        this.f5010a.execute(runnable);
    }
}
