package D1;

import B.F;
import C1.o;
import C1.z;
import K1.e;
import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import z2.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final F f1010a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1011b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1012c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1013d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1014e;

    public d(F f3, e eVar) {
        h.f(f3, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f1010a = f3;
        this.f1011b = eVar;
        this.f1012c = millis;
        this.f1013d = new Object();
        this.f1014e = new LinkedHashMap();
    }

    public final void a(o oVar) {
        Runnable runnable;
        h.f(oVar, "token");
        synchronized (this.f1013d) {
            runnable = (Runnable) this.f1014e.remove(oVar);
        }
        if (runnable != null) {
            ((Handler) this.f1010a.f165i).removeCallbacks(runnable);
        }
    }

    public final void b(o oVar) {
        z zVar = new z(this, 1, oVar);
        synchronized (this.f1013d) {
        }
        F f3 = this.f1010a;
        ((Handler) f3.f165i).postDelayed(zVar, this.f1012c);
    }
}
