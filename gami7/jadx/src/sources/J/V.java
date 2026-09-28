package J;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class V extends CancellationException {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4103h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(String str, int i2) {
        super(str);
        this.f4103h = i2;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f4103h) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(V.a.f5830c);
                break;
            case 2:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 3:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(n0.w.f8986b);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V() {
        super("The coroutine scope left the composition");
        this.f4103h = 0;
    }
}
