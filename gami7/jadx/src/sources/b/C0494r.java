package b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: b.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494r {

    /* renamed from: a, reason: collision with root package name */
    public static final C0494r f7028a = new C0494r();

    public final OnBackInvokedCallback a(y2.a aVar) {
        z2.h.f(aVar, "onBackInvoked");
        return new R0.l(aVar, 1);
    }

    public final void b(Object obj, int i2, Object obj2) {
        z2.h.f(obj, "dispatcher");
        z2.h.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        z2.h.f(obj, "dispatcher");
        z2.h.f(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
