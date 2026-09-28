package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class L extends Fragment {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f6843i = 0;

    /* renamed from: h, reason: collision with root package name */
    public B.F f6844h;

    public final void a(EnumC0465n enumC0465n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            z2.h.e(activity, "activity");
            Q.e(activity, enumC0465n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0465n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0465n.ON_DESTROY);
        this.f6844h = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0465n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B.F f3 = this.f6844h;
        if (f3 != null) {
            ((D) f3.f165i).a();
        }
        a(EnumC0465n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B.F f3 = this.f6844h;
        if (f3 != null) {
            D d3 = (D) f3.f165i;
            int i2 = d3.f6809h + 1;
            d3.f6809h = i2;
            if (i2 == 1 && d3.f6812k) {
                d3.f6814m.d(EnumC0465n.ON_START);
                d3.f6812k = false;
            }
        }
        a(EnumC0465n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0465n.ON_STOP);
    }
}
