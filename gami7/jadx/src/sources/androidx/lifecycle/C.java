package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class C extends AbstractC0459h {
    final /* synthetic */ D this$0;

    public C(D d3) {
        this.this$0 = d3;
    }

    @Override // androidx.lifecycle.AbstractC0459h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        z2.h.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = L.f6843i;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            z2.h.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((L) findFragmentByTag).f6844h = this.this$0.f6816o;
        }
    }

    @Override // androidx.lifecycle.AbstractC0459h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        z2.h.f(activity, "activity");
        D d3 = this.this$0;
        int i2 = d3.f6810i - 1;
        d3.f6810i = i2;
        if (i2 == 0) {
            Handler handler = d3.f6813l;
            z2.h.c(handler);
            handler.postDelayed(d3.f6815n, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        z2.h.f(activity, "activity");
        A.a(activity, new B(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0459h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        z2.h.f(activity, "activity");
        D d3 = this.this$0;
        int i2 = d3.f6809h - 1;
        d3.f6809h = i2;
        if (i2 == 0 && d3.f6811j) {
            d3.f6814m.d(EnumC0465n.ON_STOP);
            d3.f6812k = true;
        }
    }
}
