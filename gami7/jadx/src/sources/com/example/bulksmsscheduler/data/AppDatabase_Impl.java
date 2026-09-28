package com.example.bulksmsscheduler.data;

import C1.u;
import K1.b;
import Q1.e;
import Q1.k;
import Q1.m;
import Q1.r;
import android.content.Context;
import java.util.ArrayList;
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
import v1.c;
import z2.h;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: o, reason: collision with root package name */
    public volatile e f7384o;

    /* renamed from: p, reason: collision with root package name */
    public volatile r f7385p;
    public volatile k q;

    /* renamed from: r, reason: collision with root package name */
    public volatile m f7386r;

    @Override // r1.r
    public final n d() {
        return new n(this, new HashMap(0), new HashMap(0), "clients", "templates", "schedules", "app_settings");
    }

    @Override // r1.r
    public final c e(C1144g c1144g) {
        C1058a c1058a = new C1058a(c1144g, new u(this), "9a8284f2d0f662445898d13d9f198860", "d1b86a8328648e03417555abd1bfa27a");
        Context context = c1144g.f9933a;
        h.f(context, "context");
        return c1144g.f9935c.a(new C1369a(context, c1144g.f9934b, c1058a, false, false));
    }

    @Override // r1.r
    public final List f(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // r1.r
    public final Set h() {
        return new HashSet();
    }

    @Override // r1.r
    public final Map i() {
        HashMap hashMap = new HashMap();
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(r.class, Collections.emptyList());
        hashMap.put(k.class, Collections.emptyList());
        hashMap.put(m.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.example.bulksmsscheduler.data.AppDatabase
    public final e q() {
        e eVar;
        if (this.f7384o != null) {
            return this.f7384o;
        }
        synchronized (this) {
            try {
                if (this.f7384o == null) {
                    this.f7384o = new e(this);
                }
                eVar = this.f7384o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // com.example.bulksmsscheduler.data.AppDatabase
    public final k r() {
        k kVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new k(this);
                }
                kVar = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // com.example.bulksmsscheduler.data.AppDatabase
    public final m s() {
        m mVar;
        if (this.f7386r != null) {
            return this.f7386r;
        }
        synchronized (this) {
            try {
                if (this.f7386r == null) {
                    m mVar2 = new m();
                    mVar2.f5302a = this;
                    mVar2.f5303b = new b(this, 8);
                    this.f7386r = mVar2;
                }
                mVar = this.f7386r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // com.example.bulksmsscheduler.data.AppDatabase
    public final r t() {
        r rVar;
        if (this.f7385p != null) {
            return this.f7385p;
        }
        synchronized (this) {
            try {
                if (this.f7385p == null) {
                    this.f7385p = new r(this);
                }
                rVar = this.f7385p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }
}
