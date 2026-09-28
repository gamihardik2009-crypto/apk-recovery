package J2;

/* loaded from: classes.dex */
public final class L extends N {

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0310g f4360j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f4361k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(P p3, long j3, C0311h c0311h) {
        super(j3);
        this.f4361k = p3;
        this.f4360j = c0311h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4360j.D(this.f4361k);
    }

    @Override // J2.N
    public final String toString() {
        return super.toString() + this.f4360j;
    }
}
