package L1;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class l {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        z2.h.f(connectivityManager, "<this>");
        z2.h.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
