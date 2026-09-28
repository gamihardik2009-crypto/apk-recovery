package androidx.lifecycle;

import J2.q0;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.example.bulksmsscheduler.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import k1.C0783a;
import k1.C0784b;
import m1.C0855a;
import m1.C0858d;
import m2.C0864f;
import q2.C1079j;
import q2.InterfaceC1078i;
import u1.C1325b;
import u1.InterfaceC1327d;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final C1.b f6856a = new C1.b(16, false);

    /* renamed from: b, reason: collision with root package name */
    public static final C1.b f6857b = new C1.b(17, false);

    /* renamed from: c, reason: collision with root package name */
    public static final C1.b f6858c = new C1.b(15, false);

    /* renamed from: d, reason: collision with root package name */
    public static final C0858d f6859d = new C0858d();

    public static final void a(X x2, u1.e eVar, C0472v c0472v) {
        z2.h.f(eVar, "registry");
        z2.h.f(c0472v, "lifecycle");
        O o3 = (O) x2.c("androidx.lifecycle.savedstate.vm.tag");
        if (o3 == null || o3.f6855j) {
            return;
        }
        o3.a(c0472v, eVar);
        m(c0472v, eVar);
    }

    public static final O b(u1.e eVar, C0472v c0472v, String str, Bundle bundle) {
        Bundle a3 = eVar.a(str);
        Class[] clsArr = N.f6847f;
        O o3 = new O(str, c(a3, bundle));
        o3.a(c0472v, eVar);
        m(c0472v, eVar);
        return o3;
    }

    public static N c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new N();
            }
            HashMap hashMap = new HashMap();
            for (String str : bundle2.keySet()) {
                z2.h.e(str, "key");
                hashMap.put(str, bundle2.get(str));
            }
            return new N(hashMap);
        }
        ClassLoader classLoader = N.class.getClassLoader();
        z2.h.c(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = parcelableArrayList.get(i2);
            z2.h.d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
        }
        return new N(linkedHashMap);
    }

    public static final N d(C0784b c0784b) {
        C1.b bVar = f6856a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0784b.f1200h;
        u1.f fVar = (u1.f) linkedHashMap.get(bVar);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        c0 c0Var = (c0) linkedHashMap.get(f6857b);
        if (c0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f6858c);
        String str = (String) linkedHashMap.get(C0858d.f8640a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC1327d b3 = fVar.c().b();
        S s3 = b3 instanceof S ? (S) b3 : null;
        if (s3 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = i(c0Var).f6864b;
        N n3 = (N) linkedHashMap2.get(str);
        if (n3 != null) {
            return n3;
        }
        Class[] clsArr = N.f6847f;
        s3.b();
        Bundle bundle2 = s3.f6862c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = s3.f6862c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = s3.f6862c;
        if (bundle5 != null && bundle5.isEmpty()) {
            s3.f6862c = null;
        }
        N c3 = c(bundle3, bundle);
        linkedHashMap2.put(str, c3);
        return c3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Activity activity, EnumC0465n enumC0465n) {
        z2.h.f(activity, "activity");
        z2.h.f(enumC0465n, "event");
        if (activity instanceof InterfaceC0470t) {
            C0472v e3 = ((InterfaceC0470t) activity).e();
            if (e3 instanceof C0472v) {
                e3.d(enumC0465n);
            }
        }
    }

    public static final void f(u1.f fVar) {
        z2.h.f(fVar, "<this>");
        EnumC0466o enumC0466o = fVar.e().f6909c;
        if (enumC0466o != EnumC0466o.f6899i && enumC0466o != EnumC0466o.f6900j) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (fVar.c().b() == null) {
            S s3 = new S(fVar.c(), (c0) fVar);
            fVar.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider", s3);
            fVar.e().a(new C1325b(2, s3));
        }
    }

    public static final InterfaceC0470t g(View view) {
        z2.h.f(view, "<this>");
        return (InterfaceC0470t) G2.i.h0(G2.i.j0(G2.i.i0(view, d0.f6888j), d0.f6889k));
    }

    public static final c0 h(View view) {
        z2.h.f(view, "<this>");
        return (c0) G2.i.h0(G2.i.j0(G2.i.i0(view, d0.f6890l), d0.f6891m));
    }

    public static final T i(c0 c0Var) {
        z2.h.f(c0Var, "<this>");
        P p3 = new P();
        b0 d3 = c0Var.d();
        G.s a3 = c0Var instanceof InterfaceC0461j ? ((InterfaceC0461j) c0Var).a() : C0783a.f8106i;
        z2.h.f(a3, "defaultCreationExtras");
        return (T) new K1.m(d3, (Z) p3, a3).k(z2.t.a(T.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final C0855a j(X x2) {
        C0855a c0855a;
        z2.h.f(x2, "<this>");
        synchronized (f6859d) {
            c0855a = (C0855a) x2.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c0855a == null) {
                InterfaceC1078i interfaceC1078i = C1079j.f9784h;
                try {
                    Q2.d dVar = J2.H.f4356a;
                    interfaceC1078i = O2.o.f5202a.f4610m;
                } catch (IllegalStateException | C0864f unused) {
                }
                C0855a c0855a2 = new C0855a(interfaceC1078i.A(new q0(null)));
                x2.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c0855a2);
                c0855a = c0855a2;
            }
        }
        return c0855a;
    }

    public static void k(Activity activity) {
        z2.h.f(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            K.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new K());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new L(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final void l(View view, InterfaceC0470t interfaceC0470t) {
        z2.h.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0470t);
    }

    public static void m(C0472v c0472v, u1.e eVar) {
        EnumC0466o enumC0466o = c0472v.f6909c;
        if (enumC0466o == EnumC0466o.f6899i || enumC0466o.compareTo(EnumC0466o.f6901k) >= 0) {
            eVar.d();
        } else {
            c0472v.a(new C0458g(c0472v, eVar));
        }
    }
}
