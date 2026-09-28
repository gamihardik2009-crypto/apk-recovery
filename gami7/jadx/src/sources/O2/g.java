package O2;

import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: h, reason: collision with root package name */
    public final transient InterfaceC1078i f5177h;

    public g(InterfaceC1078i interfaceC1078i) {
        this.f5177h = interfaceC1078i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f5177h.toString();
    }
}
