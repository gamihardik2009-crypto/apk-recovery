package b;

import B1.RunnableC0015e;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* renamed from: b.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0485i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: h, reason: collision with root package name */
    public final long f6982h = SystemClock.uptimeMillis() + 10000;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f6983i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6984j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0489m f6985k;

    public ViewTreeObserverOnDrawListenerC0485i(AbstractActivityC0489m abstractActivityC0489m) {
        this.f6985k = abstractActivityC0489m;
    }

    public final void a(View view) {
        if (this.f6984j) {
            return;
        }
        this.f6984j = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z2.h.f(runnable, "runnable");
        this.f6983i = runnable;
        View decorView = this.f6985k.getWindow().getDecorView();
        z2.h.e(decorView, "window.decorView");
        if (!this.f6984j) {
            decorView.postOnAnimation(new RunnableC0015e(7, this));
        } else if (z2.h.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f6983i;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f6982h) {
                this.f6984j = false;
                this.f6985k.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f6983i = null;
        C0490n c0490n = (C0490n) this.f6985k.f7007n.getValue();
        synchronized (c0490n.f7018a) {
            z3 = c0490n.f7019b;
        }
        if (z3) {
            this.f6984j = false;
            this.f6985k.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6985k.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
