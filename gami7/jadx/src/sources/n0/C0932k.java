package n0;

import java.util.concurrent.CancellationException;

/* renamed from: n0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932k extends CancellationException {
    public C0932k(long j3) {
        super("Timed out waiting for " + j3 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(w.f8986b);
        return this;
    }
}
