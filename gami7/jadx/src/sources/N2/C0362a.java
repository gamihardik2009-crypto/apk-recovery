package N2;

import M2.InterfaceC0344h;
import java.util.concurrent.CancellationException;

/* renamed from: N2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362a extends CancellationException {

    /* renamed from: h, reason: collision with root package name */
    public final transient InterfaceC0344h f5027h;

    public C0362a(InterfaceC0344h interfaceC0344h) {
        super("Flow was aborted, no more elements needed");
        this.f5027h = interfaceC0344h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
