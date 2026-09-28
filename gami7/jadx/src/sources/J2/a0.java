package J2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a0 extends CancellationException {

    /* renamed from: h, reason: collision with root package name */
    public final transient Z f4382h;

    public a0(String str, Throwable th, Z z3) {
        super(str);
        this.f4382h = z3;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!z2.h.a(a0Var.getMessage(), getMessage()) || !z2.h.a(a0Var.f4382h, this.f4382h) || !z2.h.a(a0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        z2.h.c(message);
        int hashCode = (this.f4382h.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f4382h;
    }
}
