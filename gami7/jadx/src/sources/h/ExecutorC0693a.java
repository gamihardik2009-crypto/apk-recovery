package h;

import java.util.concurrent.Executor;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0693a implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7776h;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7776h) {
            case 0:
                C0694b.N().f7779f.f7782g.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
