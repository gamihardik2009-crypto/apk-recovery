package u0;

import android.view.Choreographer;
import java.util.List;

/* loaded from: classes.dex */
public final class X implements Choreographer.FrameCallback, Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f10985h;

    public X(Y y3) {
        this.f10985h = y3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f10985h.f11008k.removeCallbacks(this);
        Y.x(this.f10985h);
        Y y3 = this.f10985h;
        synchronized (y3.f11009l) {
            if (y3.q) {
                y3.q = false;
                List list = y3.f11011n;
                y3.f11011n = y3.f11012o;
                y3.f11012o = list;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Choreographer.FrameCallback) list.get(i2)).doFrame(j3);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y.x(this.f10985h);
        Y y3 = this.f10985h;
        synchronized (y3.f11009l) {
            if (y3.f11011n.isEmpty()) {
                y3.f11007j.removeFrameCallback(this);
                y3.q = false;
            }
        }
    }
}
