package T0;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f5770a;

    static {
        new HashSet();
    }

    public k(Context context) {
        this.f5770a = (NotificationManager) context.getSystemService("notification");
    }
}
