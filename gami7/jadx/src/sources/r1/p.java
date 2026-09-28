package r1;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class p extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f9969a;

    public p(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f9969a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        z2.h.f((k) iInterface, "callback");
        z2.h.f(obj, "cookie");
        this.f9969a.f6928i.remove((Integer) obj);
    }
}
