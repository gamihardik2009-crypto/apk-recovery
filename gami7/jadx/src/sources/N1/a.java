package N1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f5009h;

    public a(b bVar) {
        this.f5009h = bVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5009h.f5012c.post(runnable);
    }
}
