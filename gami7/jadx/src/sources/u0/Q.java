package u0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import y0.C1398b;

/* loaded from: classes.dex */
public final class Q implements ComponentCallbacks2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1398b f10967h;

    public Q(C1398b c1398b) {
        this.f10967h = c1398b;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C1398b c1398b = this.f10967h;
        synchronized (c1398b) {
            c1398b.f11488a.a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C1398b c1398b = this.f10967h;
        synchronized (c1398b) {
            c1398b.f11488a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        C1398b c1398b = this.f10967h;
        synchronized (c1398b) {
            c1398b.f11488a.a();
        }
    }
}
