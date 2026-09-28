package L1;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final z f4682h;

    /* renamed from: i, reason: collision with root package name */
    public final K1.j f4683i;

    public y(z zVar, K1.j jVar) {
        this.f4682h = zVar;
        this.f4683i = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4682h.f4688d) {
            try {
                if (((y) this.f4682h.f4686b.remove(this.f4683i)) != null) {
                    x xVar = (x) this.f4682h.f4687c.remove(this.f4683i);
                    if (xVar != null) {
                        K1.j jVar = this.f4683i;
                        E1.h hVar = (E1.h) xVar;
                        B1.s.d().a(E1.h.f1044v, "Exceeded time limits on execution for " + jVar);
                        hVar.f1052o.execute(new E1.g(hVar, 0));
                    }
                } else {
                    B1.s.d().a("WrkTimerRunnable", "Timer with " + this.f4683i + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
