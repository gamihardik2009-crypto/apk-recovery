package androidx.work.impl.workers;

import B1.RunnableC0015e;
import B1.r;
import B1.s;
import G1.b;
import G1.c;
import G1.e;
import K1.o;
import M1.k;
import O1.a;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import z2.h;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends r implements e {

    /* renamed from: l, reason: collision with root package name */
    public final WorkerParameters f6965l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f6966m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f6967n;

    /* renamed from: o, reason: collision with root package name */
    public final k f6968o;

    /* renamed from: p, reason: collision with root package name */
    public r f6969p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.f(context, "appContext");
        h.f(workerParameters, "workerParameters");
        this.f6965l = workerParameters;
        this.f6966m = new Object();
        this.f6968o = new k();
    }

    @Override // G1.e
    public final void a(o oVar, c cVar) {
        h.f(oVar, "workSpec");
        h.f(cVar, "state");
        s.d().a(a.f5157a, "Constraints changed for " + oVar);
        if (cVar instanceof b) {
            synchronized (this.f6966m) {
                this.f6967n = true;
            }
        }
    }

    @Override // B1.r
    public final void c() {
        r rVar = this.f6969p;
        if (rVar == null || rVar.f303j != -256) {
            return;
        }
        rVar.e(Build.VERSION.SDK_INT >= 31 ? this.f303j : 0);
    }

    @Override // B1.r
    public final k d() {
        this.f302i.f6939c.execute(new RunnableC0015e(3, this));
        k kVar = this.f6968o;
        h.e(kVar, "future");
        return kVar;
    }
}
