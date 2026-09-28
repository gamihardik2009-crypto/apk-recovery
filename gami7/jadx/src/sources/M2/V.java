package M2;

/* loaded from: classes.dex */
public final class V implements U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4840a;

    @Override // M2.U
    public final InterfaceC0343g a(N2.F f3) {
        switch (this.f4840a) {
            case 0:
                return new G1.h();
            default:
                return new G1.h(2, new X(f3, null));
        }
    }

    public final String toString() {
        switch (this.f4840a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
