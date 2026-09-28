package h;

import C1.y;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696d extends y {

    /* renamed from: f, reason: collision with root package name */
    public final Object f7781f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f7782g = Executors.newFixedThreadPool(4, new ThreadFactoryC0695c());

    /* renamed from: h, reason: collision with root package name */
    public volatile Handler f7783h;

    public static Handler m(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Y0.d.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
