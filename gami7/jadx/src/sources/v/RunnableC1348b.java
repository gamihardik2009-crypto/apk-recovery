package v;

import J.A0;
import android.view.Choreographer;
import android.view.View;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1348b implements A0, Runnable, Choreographer.FrameCallback {

    /* renamed from: n, reason: collision with root package name */
    public static long f11330n;

    /* renamed from: h, reason: collision with root package name */
    public final View f11331h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11333j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11335l;

    /* renamed from: m, reason: collision with root package name */
    public long f11336m;

    /* renamed from: i, reason: collision with root package name */
    public final L.d f11332i = new L.d(new T[16]);

    /* renamed from: k, reason: collision with root package name */
    public final Choreographer f11334k = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC1348b(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f11331h = r5
            L.d r0 = new L.d
            r1 = 16
            v.T[] r1 = new v.T[r1]
            r0.<init>(r1)
            r4.f11332i = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f11334k = r0
            long r0 = v.RunnableC1348b.f11330n
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3f
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L35
            if (r0 == 0) goto L35
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L37
        L35:
            r5 = 1114636288(0x42700000, float:60.0)
        L37:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            v.RunnableC1348b.f11330n = r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.RunnableC1348b.<init>(android.view.View):void");
    }

    @Override // J.A0
    public final void a() {
        this.f11335l = false;
        this.f11331h.removeCallbacks(this);
        this.f11334k.removeFrameCallback(this);
    }

    @Override // J.A0
    public final void b() {
        this.f11335l = true;
    }

    @Override // J.A0
    public final void c() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (this.f11335l) {
            this.f11336m = j3;
            this.f11331h.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        L.d dVar = this.f11332i;
        if (dVar.k() || !this.f11333j || !this.f11335l || this.f11331h.getWindowVisibility() != 0) {
            this.f11333j = false;
            return;
        }
        C1347a c1347a = new C1347a(this.f11336m + f11330n);
        boolean z3 = false;
        while (dVar.l() && !z3) {
            if (c1347a.a() <= 0 || ((T) dVar.f4618h[0]).b(c1347a)) {
                z3 = true;
            } else {
                dVar.n(0);
            }
        }
        if (z3) {
            this.f11334k.postFrameCallback(this);
        } else {
            this.f11333j = false;
        }
    }
}
