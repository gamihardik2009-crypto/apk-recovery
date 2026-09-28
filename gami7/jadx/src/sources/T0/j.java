package T0;

import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class j {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
