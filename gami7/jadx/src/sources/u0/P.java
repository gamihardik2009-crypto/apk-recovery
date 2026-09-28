package u0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import y0.C1397a;

/* loaded from: classes.dex */
public final class P implements ComponentCallbacks2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Configuration f10963h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1397a f10964i;

    public P(Configuration configuration, C1397a c1397a) {
        this.f10963h = configuration;
        this.f10964i = c1397a;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f10963h;
        configuration2.updateFrom(configuration);
        Iterator it = this.f10964i.f11487a.entrySet().iterator();
        while (it.hasNext()) {
            B1.t.w(((WeakReference) ((Map.Entry) it.next()).getValue()).get());
            it.remove();
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f10964i.f11487a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        this.f10964i.f11487a.clear();
    }
}
