package D1;

import B.F;
import B1.C0011a;
import B1.s;
import B1.u;
import C1.i;
import C1.k;
import C1.y;
import G1.e;
import I1.l;
import J2.Z;
import K1.j;
import K1.o;
import L1.n;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements k, e, C1.d {

    /* renamed from: v, reason: collision with root package name */
    public static final String f996v = s.f("GreedyScheduler");

    /* renamed from: h, reason: collision with root package name */
    public final Context f997h;

    /* renamed from: j, reason: collision with root package name */
    public final a f999j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1000k;

    /* renamed from: n, reason: collision with root package name */
    public final i f1003n;

    /* renamed from: o, reason: collision with root package name */
    public final K1.e f1004o;

    /* renamed from: p, reason: collision with root package name */
    public final C0011a f1005p;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f1006r;

    /* renamed from: s, reason: collision with root package name */
    public final G1.i f1007s;

    /* renamed from: t, reason: collision with root package name */
    public final N1.b f1008t;

    /* renamed from: u, reason: collision with root package name */
    public final d f1009u;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f998i = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final Object f1001l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final K1.c f1002m = new K1.c(1);
    public final HashMap q = new HashMap();

    public c(Context context, C0011a c0011a, l lVar, i iVar, K1.e eVar, N1.b bVar) {
        this.f997h = context;
        F f3 = c0011a.f265f;
        this.f999j = new a(this, f3, c0011a.f262c);
        this.f1009u = new d(f3, eVar);
        this.f1008t = bVar;
        this.f1007s = new G1.i(lVar);
        this.f1005p = c0011a;
        this.f1003n = iVar;
        this.f1004o = eVar;
    }

    @Override // G1.e
    public final void a(o oVar, G1.c cVar) {
        j v3 = y.v(oVar);
        boolean z3 = cVar instanceof G1.a;
        K1.e eVar = this.f1004o;
        d dVar = this.f1009u;
        String str = f996v;
        K1.c cVar2 = this.f1002m;
        if (z3) {
            if (cVar2.b(v3)) {
                return;
            }
            s.d().a(str, "Constraints met: Scheduling work ID " + v3);
            C1.o j3 = cVar2.j(v3);
            dVar.b(j3);
            ((N1.b) eVar.f4537b).a(new E1.e((i) eVar.f4536a, j3, (u) null));
            return;
        }
        s.d().a(str, "Constraints not met: Cancelling work ID " + v3);
        C1.o h2 = cVar2.h(v3);
        if (h2 != null) {
            dVar.a(h2);
            int i2 = ((G1.b) cVar).f1230a;
            eVar.getClass();
            eVar.g(h2, i2);
        }
    }

    @Override // C1.k
    public final void b(String str) {
        Runnable runnable;
        if (this.f1006r == null) {
            this.f1006r = Boolean.valueOf(n.a(this.f997h, this.f1005p));
        }
        boolean booleanValue = this.f1006r.booleanValue();
        String str2 = f996v;
        if (!booleanValue) {
            s.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f1000k) {
            this.f1003n.a(this);
            this.f1000k = true;
        }
        s.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f999j;
        if (aVar != null && (runnable = (Runnable) aVar.f993d.remove(str)) != null) {
            ((Handler) aVar.f991b.f165i).removeCallbacks(runnable);
        }
        for (C1.o oVar : this.f1002m.i(str)) {
            this.f1009u.a(oVar);
            K1.e eVar = this.f1004o;
            eVar.getClass();
            eVar.g(oVar, -512);
        }
    }

    @Override // C1.k
    public final void c(o... oVarArr) {
        long max;
        if (this.f1006r == null) {
            this.f1006r = Boolean.valueOf(n.a(this.f997h, this.f1005p));
        }
        if (!this.f1006r.booleanValue()) {
            s.d().e(f996v, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f1000k) {
            this.f1003n.a(this);
            this.f1000k = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o oVar : oVarArr) {
            if (!this.f1002m.b(y.v(oVar))) {
                synchronized (this.f1001l) {
                    try {
                        j v3 = y.v(oVar);
                        b bVar = (b) this.q.get(v3);
                        if (bVar == null) {
                            int i2 = oVar.f4574k;
                            this.f1005p.f262c.getClass();
                            bVar = new b(System.currentTimeMillis(), i2);
                            this.q.put(v3, bVar);
                        }
                        max = (Math.max((oVar.f4574k - bVar.f994a) - 5, 0) * 30000) + bVar.f995b;
                    } finally {
                    }
                }
                long max2 = Math.max(oVar.a(), max);
                this.f1005p.f262c.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (oVar.f4565b == 1) {
                    if (currentTimeMillis < max2) {
                        a aVar = this.f999j;
                        if (aVar != null) {
                            HashMap hashMap = aVar.f993d;
                            Runnable runnable = (Runnable) hashMap.remove(oVar.f4564a);
                            F f3 = aVar.f991b;
                            if (runnable != null) {
                                ((Handler) f3.f165i).removeCallbacks(runnable);
                            }
                            B1.F f4 = new B1.F(aVar, 3, oVar);
                            hashMap.put(oVar.f4564a, f4);
                            aVar.f992c.getClass();
                            ((Handler) f3.f165i).postDelayed(f4, max2 - System.currentTimeMillis());
                        }
                    } else if (oVar.b()) {
                        if (oVar.f4573j.f277c) {
                            s.d().a(f996v, "Ignoring " + oVar + ". Requires device idle.");
                        } else if (!r7.f282h.isEmpty()) {
                            s.d().a(f996v, "Ignoring " + oVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(oVar);
                            hashSet2.add(oVar.f4564a);
                        }
                    } else if (!this.f1002m.b(y.v(oVar))) {
                        s.d().a(f996v, "Starting work for " + oVar.f4564a);
                        K1.c cVar = this.f1002m;
                        cVar.getClass();
                        C1.o j3 = cVar.j(y.v(oVar));
                        this.f1009u.b(j3);
                        K1.e eVar = this.f1004o;
                        ((N1.b) eVar.f4537b).a(new E1.e((i) eVar.f4536a, j3, (u) null));
                    }
                }
            }
        }
        synchronized (this.f1001l) {
            try {
                if (!hashSet.isEmpty()) {
                    s.d().a(f996v, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        o oVar2 = (o) it.next();
                        j v4 = y.v(oVar2);
                        if (!this.f998i.containsKey(v4)) {
                            this.f998i.put(v4, G1.k.a(this.f1007s, oVar2, this.f1008t.f5011b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // C1.k
    public final boolean d() {
        return false;
    }

    @Override // C1.d
    public final void e(j jVar, boolean z3) {
        Z z4;
        C1.o h2 = this.f1002m.h(jVar);
        if (h2 != null) {
            this.f1009u.a(h2);
        }
        synchronized (this.f1001l) {
            z4 = (Z) this.f998i.remove(jVar);
        }
        if (z4 != null) {
            s.d().a(f996v, "Stopping tracking for " + jVar);
            z4.a(null);
        }
        if (z3) {
            return;
        }
        synchronized (this.f1001l) {
            this.q.remove(jVar);
        }
    }
}
