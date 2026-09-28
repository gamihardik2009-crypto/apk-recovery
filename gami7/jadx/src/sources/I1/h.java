package I1;

import B1.s;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3948a;

    public h(i iVar) {
        this.f3948a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        z2.h.f(network, "network");
        z2.h.f(networkCapabilities, "capabilities");
        s.d().a(j.f3951a, "Network capabilities changed: " + networkCapabilities);
        i iVar = this.f3948a;
        iVar.b(j.a(iVar.f3949f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        z2.h.f(network, "network");
        s.d().a(j.f3951a, "Network connection lost");
        i iVar = this.f3948a;
        iVar.b(j.a(iVar.f3949f));
    }
}
