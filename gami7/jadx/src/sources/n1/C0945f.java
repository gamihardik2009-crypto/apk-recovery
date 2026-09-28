package n1;

import D.S;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0466o;
import androidx.lifecycle.InterfaceC0461j;
import androidx.lifecycle.InterfaceC0470t;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import k1.C0784b;
import m2.C0870l;

/* renamed from: n1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945f implements InterfaceC0470t, c0, InterfaceC0461j, u1.f {

    /* renamed from: h, reason: collision with root package name */
    public final Context f9027h;

    /* renamed from: i, reason: collision with root package name */
    public s f9028i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f9029j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0466o f9030k;

    /* renamed from: l, reason: collision with root package name */
    public final m f9031l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9032m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f9033n;

    /* renamed from: o, reason: collision with root package name */
    public final C0472v f9034o = new C0472v(this);

    /* renamed from: p, reason: collision with root package name */
    public final S f9035p = new S(this);
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0466o f9036r;

    /* renamed from: s, reason: collision with root package name */
    public final U f9037s;

    public C0945f(Context context, s sVar, Bundle bundle, EnumC0466o enumC0466o, m mVar, String str, Bundle bundle2) {
        this.f9027h = context;
        this.f9028i = sVar;
        this.f9029j = bundle;
        this.f9030k = enumC0466o;
        this.f9031l = mVar;
        this.f9032m = str;
        this.f9033n = bundle2;
        C0870l c0870l = new C0870l(new C0944e(0, this));
        this.f9036r = EnumC0466o.f6899i;
        this.f9037s = (U) c0870l.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0461j
    public final C0784b a() {
        C0784b c0784b = new C0784b();
        Context context = this.f9027h;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0784b.f1200h;
        if (application != null) {
            linkedHashMap.put(Y.f6877d, application);
        }
        linkedHashMap.put(Q.f6856a, this);
        linkedHashMap.put(Q.f6857b, this);
        Bundle g3 = g();
        if (g3 != null) {
            linkedHashMap.put(Q.f6858c, g3);
        }
        return c0784b;
    }

    @Override // u1.f
    public final u1.e c() {
        return (u1.e) this.f9035p.f764d;
    }

    @Override // androidx.lifecycle.c0
    public final b0 d() {
        if (!this.q) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.f9034o.f6909c == EnumC0466o.f6898h) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        m mVar = this.f9031l;
        if (mVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
        }
        String str = this.f9032m;
        z2.h.f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = mVar.f9060b;
        b0 b0Var = (b0) linkedHashMap.get(str);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0();
        linkedHashMap.put(str, b0Var2);
        return b0Var2;
    }

    @Override // androidx.lifecycle.InterfaceC0470t
    public final C0472v e() {
        return this.f9034o;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof C0945f)) {
            return false;
        }
        C0945f c0945f = (C0945f) obj;
        if (!z2.h.a(this.f9032m, c0945f.f9032m) || !z2.h.a(this.f9028i, c0945f.f9028i) || !z2.h.a(this.f9034o, c0945f.f9034o) || !z2.h.a((u1.e) this.f9035p.f764d, (u1.e) c0945f.f9035p.f764d)) {
            return false;
        }
        Bundle bundle = this.f9029j;
        Bundle bundle2 = c0945f.f9029j;
        if (!z2.h.a(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!z2.h.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.InterfaceC0461j
    public final Z f() {
        return this.f9037s;
    }

    public final Bundle g() {
        Bundle bundle = this.f9029j;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void h(EnumC0466o enumC0466o) {
        z2.h.f(enumC0466o, "maxState");
        this.f9036r = enumC0466o;
        i();
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f9028i.hashCode() + (this.f9032m.hashCode() * 31);
        Bundle bundle = this.f9029j;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i2 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i2 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((u1.e) this.f9035p.f764d).hashCode() + ((this.f9034o.hashCode() + (hashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.q) {
            S s3 = this.f9035p;
            s3.g();
            this.q = true;
            if (this.f9031l != null) {
                Q.f(this);
            }
            s3.h(this.f9033n);
        }
        int ordinal = this.f9030k.ordinal();
        int ordinal2 = this.f9036r.ordinal();
        C0472v c0472v = this.f9034o;
        if (ordinal < ordinal2) {
            c0472v.g(this.f9030k);
        } else {
            c0472v.g(this.f9036r);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0945f.class.getSimpleName());
        sb.append("(" + this.f9032m + ')');
        sb.append(" destination=");
        sb.append(this.f9028i);
        String sb2 = sb.toString();
        z2.h.e(sb2, "sb.toString()");
        return sb2;
    }
}
