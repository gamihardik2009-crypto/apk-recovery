package K2;

import C1.y;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import m2.C0867i;
import z2.h;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4611a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object n3;
        try {
            n3 = new d(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            n3 = y.n(th);
        }
        if (n3 instanceof C0867i) {
            n3 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            h.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
