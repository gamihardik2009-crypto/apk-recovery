package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import k1.C0784b;
import m1.C0858d;

/* loaded from: classes.dex */
public final class U implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final Application f6865a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f6866b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f6867c;

    /* renamed from: d, reason: collision with root package name */
    public final C0472v f6868d;

    /* renamed from: e, reason: collision with root package name */
    public final u1.e f6869e;

    public U(Application application, u1.f fVar, Bundle bundle) {
        Y y3;
        z2.h.f(fVar, "owner");
        this.f6869e = fVar.c();
        this.f6868d = fVar.e();
        this.f6867c = bundle;
        this.f6865a = application;
        if (application != null) {
            if (Y.f6876c == null) {
                Y.f6876c = new Y(application);
            }
            y3 = Y.f6876c;
            z2.h.c(y3);
        } else {
            y3 = new Y(null);
        }
        this.f6866b = y3;
    }

    @Override // androidx.lifecycle.Z
    public final X a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.Z
    public final X b(Class cls, C0784b c0784b) {
        C0858d c0858d = C0858d.f8640a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0784b.f1200h;
        String str = (String) linkedHashMap.get(c0858d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(Q.f6856a) == null || linkedHashMap.get(Q.f6857b) == null) {
            if (this.f6868d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(Y.f6877d);
        boolean isAssignableFrom = AbstractC0452a.class.isAssignableFrom(cls);
        Constructor a3 = (!isAssignableFrom || application == null) ? V.a(cls, V.f6871b) : V.a(cls, V.f6870a);
        return a3 == null ? this.f6866b.b(cls, c0784b) : (!isAssignableFrom || application == null) ? V.b(cls, a3, Q.d(c0784b)) : V.b(cls, a3, application, Q.d(c0784b));
    }

    public final X d(String str, Class cls) {
        C0472v c0472v = this.f6868d;
        if (c0472v == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0452a.class.isAssignableFrom(cls);
        Application application = this.f6865a;
        Constructor a3 = (!isAssignableFrom || application == null) ? V.a(cls, V.f6871b) : V.a(cls, V.f6870a);
        if (a3 == null) {
            if (application != null) {
                return this.f6866b.a(cls);
            }
            if (a0.f6879a == null) {
                a0.f6879a = new a0();
            }
            a0 a0Var = a0.f6879a;
            z2.h.c(a0Var);
            return a0Var.a(cls);
        }
        u1.e eVar = this.f6869e;
        z2.h.c(eVar);
        O b3 = Q.b(eVar, c0472v, str, this.f6867c);
        N n3 = b3.f6854i;
        X b4 = (!isAssignableFrom || application == null) ? V.b(cls, a3, n3) : V.b(cls, a3, application, n3);
        b4.a("androidx.lifecycle.savedstate.vm.tag", b3);
        return b4;
    }

    public final void e(X x2) {
        C0472v c0472v = this.f6868d;
        if (c0472v != null) {
            u1.e eVar = this.f6869e;
            z2.h.c(eVar);
            Q.a(x2, eVar, c0472v);
        }
    }
}
