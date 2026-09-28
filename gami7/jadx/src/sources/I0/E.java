package I0;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Choreographer.FrameCallback {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3860h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f3861i;

    public /* synthetic */ E(Runnable runnable, int i2) {
        this.f3860h = i2;
        this.f3861i = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        switch (this.f3860h) {
            case 0:
                this.f3861i.run();
                break;
            default:
                this.f3861i.run();
                break;
        }
    }
}
