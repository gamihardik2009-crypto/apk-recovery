package J2;

import n2.C0958j;

/* loaded from: classes.dex */
public abstract class Q extends AbstractC0324v {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f4369m = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f4370j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4371k;

    /* renamed from: l, reason: collision with root package name */
    public C0958j f4372l;

    public abstract Thread B();

    public final void D(boolean z3) {
        this.f4370j = (z3 ? 4294967296L : 1L) + this.f4370j;
        if (z3) {
            return;
        }
        this.f4371k = true;
    }

    public final boolean E() {
        return this.f4370j >= 4294967296L;
    }

    public abstract long F();

    public final boolean G() {
        C0958j c0958j = this.f4372l;
        if (c0958j == null) {
            return false;
        }
        G g3 = (G) (c0958j.isEmpty() ? null : c0958j.o());
        if (g3 == null) {
            return false;
        }
        g3.run();
        return true;
    }

    public void H(long j3, N n3) {
        C.q.M(j3, n3);
    }

    public abstract void I();

    public final void x(boolean z3) {
        long j3 = this.f4370j - (z3 ? 4294967296L : 1L);
        this.f4370j = j3;
        if (j3 <= 0 && this.f4371k) {
            I();
        }
    }

    public final void z(G g3) {
        C0958j c0958j = this.f4372l;
        if (c0958j == null) {
            c0958j = new C0958j();
            this.f4372l = c0958j;
        }
        c0958j.f(g3);
    }
}
