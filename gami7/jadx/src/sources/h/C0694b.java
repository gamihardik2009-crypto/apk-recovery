package h;

import C1.y;
import android.os.Looper;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694b extends y {

    /* renamed from: g, reason: collision with root package name */
    public static volatile C0694b f7777g;

    /* renamed from: h, reason: collision with root package name */
    public static final ExecutorC0693a f7778h = new ExecutorC0693a(0);

    /* renamed from: f, reason: collision with root package name */
    public final C0696d f7779f = new C0696d();

    public static C0694b N() {
        if (f7777g != null) {
            return f7777g;
        }
        synchronized (C0694b.class) {
            try {
                if (f7777g == null) {
                    f7777g = new C0694b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7777g;
    }

    public final void O(Runnable runnable) {
        C0696d c0696d = this.f7779f;
        if (c0696d.f7783h == null) {
            synchronized (c0696d.f7781f) {
                try {
                    if (c0696d.f7783h == null) {
                        c0696d.f7783h = C0696d.m(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c0696d.f7783h.post(runnable);
    }
}
