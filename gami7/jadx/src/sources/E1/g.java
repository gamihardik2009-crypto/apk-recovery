package E1;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1042h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f1043i;

    public /* synthetic */ g(h hVar, int i2) {
        this.f1042h = i2;
        this.f1043i = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1042h) {
            case 0:
                h.b(this.f1043i);
                break;
            default:
                h.c(this.f1043i);
                break;
        }
    }
}
