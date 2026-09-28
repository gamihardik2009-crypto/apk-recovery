package J2;

/* loaded from: classes.dex */
public final class M extends N {

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f4362j;

    public M(long j3, Runnable runnable) {
        super(j3);
        this.f4362j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4362j.run();
    }

    @Override // J2.N
    public final String toString() {
        return super.toString() + this.f4362j;
    }
}
