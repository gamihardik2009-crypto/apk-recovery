package E1;

import android.app.Notification;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1060h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f1061i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1062j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1063k;

    public j(SystemForegroundService systemForegroundService, int i2, Notification notification) {
        this.f1063k = systemForegroundService;
        this.f1061i = i2;
        this.f1062j = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1060h) {
            case 0:
                ((l) this.f1062j).a((Intent) this.f1063k, this.f1061i);
                break;
            default:
                ((SystemForegroundService) this.f1063k).f6963l.notify(this.f1061i, (Notification) this.f1062j);
                break;
        }
    }

    public j(int i2, l lVar, Intent intent) {
        this.f1062j = lVar;
        this.f1063k = intent;
        this.f1061i = i2;
    }
}
