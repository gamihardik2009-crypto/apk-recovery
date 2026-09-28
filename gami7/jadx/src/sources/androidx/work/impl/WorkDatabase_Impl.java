package androidx.work.impl;

import C1.t;
import C1.u;
import K1.c;
import K1.e;
import K1.f;
import K1.i;
import K1.l;
import K1.m;
import K1.q;
import K1.s;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p1.C1058a;
import r1.C1144g;
import r1.n;
import v1.C1369a;
import z2.h;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile q f6942m;

    /* renamed from: n, reason: collision with root package name */
    public volatile c f6943n;

    /* renamed from: o, reason: collision with root package name */
    public volatile s f6944o;

    /* renamed from: p, reason: collision with root package name */
    public volatile i f6945p;
    public volatile l q;

    /* renamed from: r, reason: collision with root package name */
    public volatile m f6946r;

    /* renamed from: s, reason: collision with root package name */
    public volatile e f6947s;

    @Override // r1.r
    public final n d() {
        return new n(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // r1.r
    public final v1.c e(C1144g c1144g) {
        C1058a c1058a = new C1058a(c1144g, new u(this), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032");
        Context context = c1144g.f9933a;
        h.f(context, "context");
        return c1144g.f9935c.a(new C1369a(context, c1144g.f9934b, c1058a, false, false));
    }

    @Override // r1.r
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new C1.e(13, 14, 10), new t(0), new C1.e(16, 17, 11), new C1.e(17, 18, 12), new C1.e(18, 19, 13), new t(1));
    }

    @Override // r1.r
    public final Set h() {
        return new HashSet();
    }

    @Override // r1.r
    public final Map i() {
        HashMap hashMap = new HashMap();
        hashMap.put(q.class, Collections.emptyList());
        hashMap.put(c.class, Collections.emptyList());
        hashMap.put(s.class, Collections.emptyList());
        hashMap.put(i.class, Collections.emptyList());
        hashMap.put(l.class, Collections.emptyList());
        hashMap.put(m.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(f.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c q() {
        c cVar;
        if (this.f6943n != null) {
            return this.f6943n;
        }
        synchronized (this) {
            try {
                if (this.f6943n == null) {
                    this.f6943n = new c(this);
                }
                cVar = this.f6943n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e r() {
        e eVar;
        if (this.f6947s != null) {
            return this.f6947s;
        }
        synchronized (this) {
            try {
                if (this.f6947s == null) {
                    this.f6947s = new e(this);
                }
                eVar = this.f6947s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i s() {
        i iVar;
        if (this.f6945p != null) {
            return this.f6945p;
        }
        synchronized (this) {
            try {
                if (this.f6945p == null) {
                    this.f6945p = new i(this);
                }
                iVar = this.f6945p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l t() {
        l lVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new l(this);
                }
                lVar = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m u() {
        m mVar;
        if (this.f6946r != null) {
            return this.f6946r;
        }
        synchronized (this) {
            try {
                if (this.f6946r == null) {
                    this.f6946r = new m(this);
                }
                mVar = this.f6946r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q v() {
        q qVar;
        if (this.f6942m != null) {
            return this.f6942m;
        }
        synchronized (this) {
            try {
                if (this.f6942m == null) {
                    this.f6942m = new q(this);
                }
                qVar = this.f6942m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s w() {
        s sVar;
        if (this.f6944o != null) {
            return this.f6944o;
        }
        synchronized (this) {
            try {
                if (this.f6944o == null) {
                    this.f6944o = new s(this);
                }
                sVar = this.f6944o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}
