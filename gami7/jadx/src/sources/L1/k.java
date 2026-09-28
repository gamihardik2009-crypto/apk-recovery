package L1;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public abstract class k {
    public static final Network a(ConnectivityManager connectivityManager) {
        z2.h.f(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
