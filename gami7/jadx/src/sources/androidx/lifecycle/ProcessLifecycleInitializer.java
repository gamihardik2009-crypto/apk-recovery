package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import n2.C0970v;
import y1.C1399a;
import y1.InterfaceC1400b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1400b {
    @Override // y1.InterfaceC1400b
    public final List a() {
        return C0970v.f9165h;
    }

    @Override // y1.InterfaceC1400b
    public final Object b(Context context) {
        z2.h.f(context, "context");
        C1399a c3 = C1399a.c(context);
        z2.h.e(c3, "getInstance(context)");
        if (!c3.f11492b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!AbstractC0468q.f6904a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            z2.h.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0467p());
        }
        D d3 = D.f6808p;
        d3.getClass();
        d3.f6813l = new Handler();
        d3.f6814m.d(EnumC0465n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        z2.h.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C(d3));
        return d3;
    }
}
