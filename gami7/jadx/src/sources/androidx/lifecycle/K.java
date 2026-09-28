package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class K implements Application.ActivityLifecycleCallbacks {
    public static final J Companion = new J();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        z2.h.f(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new K());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        z2.h.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        z2.h.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        z2.h.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        z2.h.f(activity, "activity");
        int i2 = L.f6843i;
        Q.e(activity, EnumC0465n.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        z2.h.f(activity, "activity");
        int i2 = L.f6843i;
        Q.e(activity, EnumC0465n.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        z2.h.f(activity, "activity");
        int i2 = L.f6843i;
        Q.e(activity, EnumC0465n.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        z2.h.f(activity, "activity");
        int i2 = L.f6843i;
        Q.e(activity, EnumC0465n.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        z2.h.f(activity, "activity");
        int i2 = L.f6843i;
        Q.e(activity, EnumC0465n.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        z2.h.f(activity, "activity");
        int i2 = L.f6843i;
        Q.e(activity, EnumC0465n.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        z2.h.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        z2.h.f(activity, "activity");
        z2.h.f(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        z2.h.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        z2.h.f(activity, "activity");
    }
}
