package O2;

import a.AbstractC0423a;
import m2.AbstractC0868j;
import s2.AbstractC1196a;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5207a = 0;

    static {
        Object n3;
        Object n4;
        Exception exc = new Exception();
        String simpleName = AbstractC0423a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            n3 = AbstractC1196a.class.getCanonicalName();
        } catch (Throwable th) {
            n3 = C1.y.n(th);
        }
        if (AbstractC0868j.a(n3) != null) {
            n3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            n4 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            n4 = C1.y.n(th2);
        }
        if (AbstractC0868j.a(n4) != null) {
            n4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
