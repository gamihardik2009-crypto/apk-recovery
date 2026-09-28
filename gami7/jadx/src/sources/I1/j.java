package I1;

import B1.s;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3951a;

    static {
        String f3 = s.f("NetworkStateTracker");
        z2.h.e(f3, "tagWithPrefix(\"NetworkStateTracker\")");
        f3951a = f3;
    }

    public static final G1.d a(ConnectivityManager connectivityManager) {
        boolean z3;
        NetworkCapabilities a3;
        z2.h.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z4 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a3 = L1.j.a(connectivityManager, L1.k.a(connectivityManager));
        } catch (SecurityException e3) {
            s.d().c(f3951a, "Unable to validate active network", e3);
        }
        if (a3 != null) {
            z3 = L1.j.b(a3, 16);
            return new G1.d(z4, z3, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z3 = false;
        return new G1.d(z4, z3, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
