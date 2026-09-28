package L1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public abstract class j {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        z2.h.f(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i2) {
        z2.h.f(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i2);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        z2.h.f(connectivityManager, "<this>");
        z2.h.f(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
