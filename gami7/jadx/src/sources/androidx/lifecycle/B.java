package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class B extends AbstractC0459h {
    final /* synthetic */ D this$0;

    public B(D d3) {
        this.this$0 = d3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        z2.h.f(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        z2.h.f(activity, "activity");
        D d3 = this.this$0;
        int i2 = d3.f6809h + 1;
        d3.f6809h = i2;
        if (i2 == 1 && d3.f6812k) {
            d3.f6814m.d(EnumC0465n.ON_START);
            d3.f6812k = false;
        }
    }
}
