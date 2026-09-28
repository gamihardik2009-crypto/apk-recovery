package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import m2.C0870l;
import u1.InterfaceC1327d;

/* loaded from: classes.dex */
public final class S implements InterfaceC1327d {

    /* renamed from: a, reason: collision with root package name */
    public final u1.e f6860a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6861b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f6862c;

    /* renamed from: d, reason: collision with root package name */
    public final C0870l f6863d;

    public S(u1.e eVar, c0 c0Var) {
        z2.h.f(eVar, "savedStateRegistry");
        z2.h.f(c0Var, "viewModelStoreOwner");
        this.f6860a = eVar;
        this.f6863d = new C0870l(new B.y(22, c0Var));
    }

    @Override // u1.InterfaceC1327d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6862c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((T) this.f6863d.getValue()).f6864b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a3 = ((N) entry.getValue()).f6852e.a();
            if (!z2.h.a(a3, Bundle.EMPTY)) {
                bundle.putBundle(str, a3);
            }
        }
        this.f6861b = false;
        return bundle;
    }

    public final void b() {
        if (this.f6861b) {
            return;
        }
        Bundle a3 = this.f6860a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6862c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (a3 != null) {
            bundle.putAll(a3);
        }
        this.f6862c = bundle;
        this.f6861b = true;
    }
}
