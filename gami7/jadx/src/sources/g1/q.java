package g1;

import B1.RunnableC0015e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements InterfaceC0686h {

    /* renamed from: h, reason: collision with root package name */
    public final Context f7744h;

    /* renamed from: i, reason: collision with root package name */
    public final K1.i f7745i;

    /* renamed from: j, reason: collision with root package name */
    public final C1.b f7746j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7747k;

    /* renamed from: l, reason: collision with root package name */
    public Handler f7748l;

    /* renamed from: m, reason: collision with root package name */
    public Executor f7749m;

    /* renamed from: n, reason: collision with root package name */
    public ThreadPoolExecutor f7750n;

    /* renamed from: o, reason: collision with root package name */
    public l0.c f7751o;

    public q(Context context, K1.i iVar) {
        C1.b bVar = r.f7752d;
        this.f7747k = new Object();
        l0.c.r(context, "Context cannot be null");
        this.f7744h = context.getApplicationContext();
        this.f7745i = iVar;
        this.f7746j = bVar;
    }

    public final void a() {
        synchronized (this.f7747k) {
            try {
                this.f7751o = null;
                Handler handler = this.f7748l;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f7748l = null;
                ThreadPoolExecutor threadPoolExecutor = this.f7750n;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f7749m = null;
                this.f7750n = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f7747k) {
            try {
                if (this.f7751o == null) {
                    return;
                }
                if (this.f7749m == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0679a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f7750n = threadPoolExecutor;
                    this.f7749m = threadPoolExecutor;
                }
                this.f7749m.execute(new RunnableC0015e(11, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g1.InterfaceC0686h
    public final void c(l0.c cVar) {
        synchronized (this.f7747k) {
            this.f7751o = cVar;
        }
        b();
    }

    public final Z0.b d() {
        try {
            C1.b bVar = this.f7746j;
            Context context = this.f7744h;
            K1.i iVar = this.f7745i;
            bVar.getClass();
            O.m a3 = Z0.a.a(context, iVar);
            int i2 = a3.f5120a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            Z0.b[] bVarArr = (Z0.b[]) a3.f5121b;
            if (bVarArr == null || bVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return bVarArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }
}
