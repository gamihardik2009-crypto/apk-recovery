package J1;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4335h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Notification f4336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4337j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f4338k;

    public d(SystemForegroundService systemForegroundService, int i2, Notification notification, int i3) {
        this.f4338k = systemForegroundService;
        this.f4335h = i2;
        this.f4336i = notification;
        this.f4337j = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f4337j;
        Notification notification = this.f4336i;
        int i4 = this.f4335h;
        SystemForegroundService systemForegroundService = this.f4338k;
        if (i2 >= 31) {
            g.a(systemForegroundService, i4, notification, i3);
        } else if (i2 >= 29) {
            f.a(systemForegroundService, i4, notification, i3);
        } else {
            systemForegroundService.startForeground(i4, notification);
        }
    }
}
