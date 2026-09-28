package n0;

import java.util.concurrent.CancellationException;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923b extends CancellationException {

    /* renamed from: h, reason: collision with root package name */
    public static final C0923b f8921h = new C0923b();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(w.f8986b);
        return this;
    }
}
