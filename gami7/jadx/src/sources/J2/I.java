package J2;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class I implements J {

    /* renamed from: h, reason: collision with root package name */
    public final Future f4358h;

    public I(ScheduledFuture scheduledFuture) {
        this.f4358h = scheduledFuture;
    }

    @Override // J2.J
    public final void a() {
        this.f4358h.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f4358h + ']';
    }
}
