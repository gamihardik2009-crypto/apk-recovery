package J1;

import android.app.Notification;
import android.app.Service;

/* loaded from: classes.dex */
public abstract class g {
    public static void a(Service service, int i2, Notification notification, int i3) {
        service.startForeground(i2, notification, i3);
    }
}
