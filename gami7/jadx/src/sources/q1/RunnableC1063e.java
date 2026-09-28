package q1;

import android.content.Context;
import h.ExecutorC0693a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1063e implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9764h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f9765i;

    public /* synthetic */ RunnableC1063e(Context context, int i2) {
        this.f9764h = i2;
        this.f9765i = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9764h) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC1063e(this.f9765i, 1));
                break;
            default:
                AbstractC1062d.t(this.f9765i, new ExecutorC0693a(1), AbstractC1062d.f9754a, false);
                break;
        }
    }
}
