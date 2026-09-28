package C1;

import B1.C0011a;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class i implements J1.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f644l = B1.s.f("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f646b;

    /* renamed from: c, reason: collision with root package name */
    public final C0011a f647c;

    /* renamed from: d, reason: collision with root package name */
    public final N1.b f648d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f649e;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f651g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f650f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f653i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f654j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f645a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f655k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f652h = new HashMap();

    public i(Context context, C0011a c0011a, N1.b bVar, WorkDatabase workDatabase) {
        this.f646b = context;
        this.f647c = c0011a;
        this.f648d = bVar;
        this.f649e = workDatabase;
    }

    public static boolean d(String str, A a3, int i2) {
        if (a3 == null) {
            B1.s.d().a(f644l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        a3.f618x = i2;
        a3.h();
        a3.f617w.cancel(true);
        if (a3.f606k == null || !(a3.f617w.f4781a instanceof M1.a)) {
            B1.s.d().a(A.f602y, "WorkSpec " + a3.f605j + " is already done. Not interrupting.");
        } else {
            a3.f606k.e(i2);
        }
        B1.s.d().a(f644l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(d dVar) {
        synchronized (this.f655k) {
            this.f654j.add(dVar);
        }
    }

    public final A b(String str) {
        A a3 = (A) this.f650f.remove(str);
        boolean z3 = a3 != null;
        if (!z3) {
            a3 = (A) this.f651g.remove(str);
        }
        this.f652h.remove(str);
        if (z3) {
            synchronized (this.f655k) {
                try {
                    if (!(true ^ this.f650f.isEmpty())) {
                        Context context = this.f646b;
                        String str2 = J1.c.q;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f646b.startService(intent);
                        } catch (Throwable th) {
                            B1.s.d().c(f644l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f645a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f645a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return a3;
    }

    public final A c(String str) {
        A a3 = (A) this.f650f.get(str);
        return a3 == null ? (A) this.f651g.get(str) : a3;
    }

    public final boolean e(String str) {
        boolean z3;
        synchronized (this.f655k) {
            z3 = c(str) != null;
        }
        return z3;
    }

    public final void f(d dVar) {
        synchronized (this.f655k) {
            this.f654j.remove(dVar);
        }
    }

    public final void g(String str, B1.i iVar) {
        synchronized (this.f655k) {
            try {
                B1.s.d().e(f644l, "Moving WorkSpec (" + str + ") to the foreground");
                A a3 = (A) this.f651g.remove(str);
                if (a3 != null) {
                    if (this.f645a == null) {
                        PowerManager.WakeLock a4 = L1.r.a(this.f646b, "ProcessorForegroundLck");
                        this.f645a = a4;
                        a4.acquire();
                    }
                    this.f650f.put(str, a3);
                    U0.a.b(this.f646b, J1.c.c(this.f646b, y.v(a3.f605j), iVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(o oVar, B1.u uVar) {
        final K1.j jVar = oVar.f667a;
        final String str = jVar.f4551a;
        final ArrayList arrayList = new ArrayList();
        K1.o oVar2 = (K1.o) this.f649e.n(new Callable() { // from class: C1.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = i.this.f649e;
                K1.s w2 = workDatabase.w();
                String str2 = str;
                arrayList.addAll(w2.f(str2));
                return workDatabase.v().i(str2);
            }
        });
        if (oVar2 == null) {
            B1.s.d().g(f644l, "Didn't find WorkSpec for id " + jVar);
            this.f648d.f5013d.execute(new Runnable() { // from class: C1.h

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ boolean f643j = false;

                @Override // java.lang.Runnable
                public final void run() {
                    i iVar = i.this;
                    K1.j jVar2 = jVar;
                    boolean z3 = this.f643j;
                    synchronized (iVar.f655k) {
                        try {
                            Iterator it = iVar.f654j.iterator();
                            while (it.hasNext()) {
                                ((d) it.next()).e(jVar2, z3);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            return false;
        }
        synchronized (this.f655k) {
            try {
                if (e(str)) {
                    Set set = (Set) this.f652h.get(str);
                    if (((o) set.iterator().next()).f667a.f4552b == jVar.f4552b) {
                        set.add(oVar);
                        B1.s.d().a(f644l, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        this.f648d.f5013d.execute(new Runnable() { // from class: C1.h

                            /* renamed from: j, reason: collision with root package name */
                            public final /* synthetic */ boolean f643j = false;

                            @Override // java.lang.Runnable
                            public final void run() {
                                i iVar = i.this;
                                K1.j jVar2 = jVar;
                                boolean z3 = this.f643j;
                                synchronized (iVar.f655k) {
                                    try {
                                        Iterator it = iVar.f654j.iterator();
                                        while (it.hasNext()) {
                                            ((d) it.next()).e(jVar2, z3);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        });
                    }
                    return false;
                }
                if (oVar2.f4582t != jVar.f4552b) {
                    this.f648d.f5013d.execute(new Runnable() { // from class: C1.h

                        /* renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ boolean f643j = false;

                        @Override // java.lang.Runnable
                        public final void run() {
                            i iVar = i.this;
                            K1.j jVar2 = jVar;
                            boolean z3 = this.f643j;
                            synchronized (iVar.f655k) {
                                try {
                                    Iterator it = iVar.f654j.iterator();
                                    while (it.hasNext()) {
                                        ((d) it.next()).e(jVar2, z3);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                    return false;
                }
                A a3 = new A(new Q1.k(this.f646b, this.f647c, this.f648d, this, this.f649e, oVar2, arrayList));
                M1.k kVar = a3.f616v;
                kVar.a(new g(this, kVar, a3, 0), this.f648d.f5013d);
                this.f651g.put(str, a3);
                HashSet hashSet = new HashSet();
                hashSet.add(oVar);
                this.f652h.put(str, hashSet);
                this.f648d.f5010a.execute(a3);
                B1.s.d().a(f644l, i.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
