package C1;

import B1.C0011a;
import B1.F;
import B1.G;
import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import n2.AbstractC0946A;
import w1.C1387i;

/* loaded from: classes.dex */
public final class A implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    public static final String f602y = B1.s.f("WorkerWrapper");

    /* renamed from: h, reason: collision with root package name */
    public final Context f603h;

    /* renamed from: i, reason: collision with root package name */
    public final String f604i;

    /* renamed from: j, reason: collision with root package name */
    public final K1.o f605j;

    /* renamed from: k, reason: collision with root package name */
    public B1.r f606k;

    /* renamed from: l, reason: collision with root package name */
    public final N1.b f607l;

    /* renamed from: n, reason: collision with root package name */
    public final C0011a f609n;

    /* renamed from: o, reason: collision with root package name */
    public final B1.u f610o;

    /* renamed from: p, reason: collision with root package name */
    public final J1.a f611p;
    public final WorkDatabase q;

    /* renamed from: r, reason: collision with root package name */
    public final K1.q f612r;

    /* renamed from: s, reason: collision with root package name */
    public final K1.c f613s;

    /* renamed from: t, reason: collision with root package name */
    public final List f614t;

    /* renamed from: u, reason: collision with root package name */
    public String f615u;

    /* renamed from: m, reason: collision with root package name */
    public B1.q f608m = new B1.n();

    /* renamed from: v, reason: collision with root package name */
    public final M1.k f616v = new M1.k();

    /* renamed from: w, reason: collision with root package name */
    public final M1.k f617w = new M1.k();

    /* renamed from: x, reason: collision with root package name */
    public volatile int f618x = -256;

    public A(Q1.k kVar) {
        this.f603h = (Context) kVar.f5292a;
        this.f607l = (N1.b) kVar.f5294c;
        this.f611p = (J1.a) kVar.f5293b;
        K1.o oVar = (K1.o) kVar.f5297f;
        this.f605j = oVar;
        this.f604i = oVar.f4564a;
        this.f606k = null;
        C0011a c0011a = (C0011a) kVar.f5295d;
        this.f609n = c0011a;
        this.f610o = c0011a.f262c;
        WorkDatabase workDatabase = (WorkDatabase) kVar.f5296e;
        this.q = workDatabase;
        this.f612r = workDatabase.v();
        this.f613s = workDatabase.q();
        this.f614t = (List) kVar.f5298g;
    }

    public final void a(B1.q qVar) {
        boolean z3 = qVar instanceof B1.p;
        K1.o oVar = this.f605j;
        String str = f602y;
        if (!z3) {
            if (qVar instanceof B1.o) {
                B1.s.d().e(str, "Worker result RETRY for " + this.f615u);
                c();
                return;
            }
            B1.s.d().e(str, "Worker result FAILURE for " + this.f615u);
            if (oVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        B1.s.d().e(str, "Worker result SUCCESS for " + this.f615u);
        if (oVar.c()) {
            d();
            return;
        }
        K1.c cVar = this.f613s;
        String str2 = this.f604i;
        K1.q qVar2 = this.f612r;
        WorkDatabase workDatabase = this.q;
        workDatabase.c();
        try {
            qVar2.o(str2, 3);
            qVar2.n(str2, ((B1.p) this.f608m).f300a);
            this.f610o.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = cVar.e(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (qVar2.g(str3) == 5 && cVar.f(str3)) {
                    B1.s.d().e(str, "Setting status to enqueued for " + str3);
                    qVar2.o(str3, 1);
                    qVar2.m(str3, currentTimeMillis);
                }
            }
            workDatabase.o();
            workDatabase.j();
            e(false);
        } catch (Throwable th) {
            workDatabase.j();
            e(false);
            throw th;
        }
    }

    public final void b() {
        if (h()) {
            return;
        }
        this.q.c();
        try {
            int g3 = this.f612r.g(this.f604i);
            this.q.u().b(this.f604i);
            if (g3 == 0) {
                e(false);
            } else if (g3 == 2) {
                a(this.f608m);
            } else if (!B1.t.a(g3)) {
                this.f618x = -512;
                c();
            }
            this.q.o();
            this.q.j();
        } catch (Throwable th) {
            this.q.j();
            throw th;
        }
    }

    public final void c() {
        String str = this.f604i;
        K1.q qVar = this.f612r;
        WorkDatabase workDatabase = this.q;
        workDatabase.c();
        try {
            qVar.o(str, 1);
            this.f610o.getClass();
            qVar.m(str, System.currentTimeMillis());
            qVar.l(str, this.f605j.f4584v);
            qVar.k(str, -1L);
            workDatabase.o();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.f604i;
        K1.q qVar = this.f612r;
        WorkDatabase workDatabase = this.q;
        workDatabase.c();
        try {
            this.f610o.getClass();
            qVar.m(str, System.currentTimeMillis());
            r1.r rVar = qVar.f4587a;
            qVar.o(str, 1);
            rVar.b();
            K1.h hVar = qVar.f4596j;
            C1387i a3 = hVar.a();
            if (str == null) {
                a3.n(1);
            } else {
                a3.p(str, 1);
            }
            rVar.c();
            try {
                a3.b();
                rVar.o();
                rVar.j();
                hVar.c(a3);
                qVar.l(str, this.f605j.f4584v);
                rVar.b();
                K1.h hVar2 = qVar.f4592f;
                C1387i a4 = hVar2.a();
                if (str == null) {
                    a4.n(1);
                } else {
                    a4.p(str, 1);
                }
                rVar.c();
                try {
                    a4.b();
                    rVar.o();
                    rVar.j();
                    hVar2.c(a4);
                    qVar.k(str, -1L);
                    workDatabase.o();
                } catch (Throwable th) {
                    rVar.j();
                    hVar2.c(a4);
                    throw th;
                }
            } catch (Throwable th2) {
                rVar.j();
                hVar.c(a3);
                throw th2;
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0005, B:10:0x0030, B:12:0x0038, B:14:0x0044, B:15:0x005d, B:22:0x0071, B:23:0x0077, B:5:0x001e, B:7:0x0025), top: B:2:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0005, B:10:0x0030, B:12:0x0038, B:14:0x0044, B:15:0x005d, B:22:0x0071, B:23:0x0077, B:5:0x001e, B:7:0x0025), top: B:2:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.q
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.q     // Catch: java.lang.Throwable -> L40
            K1.q r0 = r0.v()     // Catch: java.lang.Throwable -> L40
            r0.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            r1.v r1 = r1.v.a(r1, r2)     // Catch: java.lang.Throwable -> L40
            r1.r r0 = r0.f4587a     // Catch: java.lang.Throwable -> L40
            r0.b()     // Catch: java.lang.Throwable -> L40
            android.database.Cursor r0 = n2.AbstractC0946A.p(r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2d
            r4 = 1
            if (r3 == 0) goto L2f
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            r3 = r4
            goto L30
        L2d:
            r6 = move-exception
            goto L71
        L2f:
            r3 = r2
        L30:
            r0.close()     // Catch: java.lang.Throwable -> L40
            r1.c()     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L42
            android.content.Context r0 = r5.f603h     // Catch: java.lang.Throwable -> L40
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            L1.m.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r6 = move-exception
            goto L78
        L42:
            if (r6 == 0) goto L5d
            K1.q r0 = r5.f612r     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f604i     // Catch: java.lang.Throwable -> L40
            r0.o(r1, r4)     // Catch: java.lang.Throwable -> L40
            K1.q r0 = r5.f612r     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f604i     // Catch: java.lang.Throwable -> L40
            int r2 = r5.f618x     // Catch: java.lang.Throwable -> L40
            r0.p(r1, r2)     // Catch: java.lang.Throwable -> L40
            K1.q r0 = r5.f612r     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f604i     // Catch: java.lang.Throwable -> L40
            r2 = -1
            r0.k(r1, r2)     // Catch: java.lang.Throwable -> L40
        L5d:
            androidx.work.impl.WorkDatabase r0 = r5.q     // Catch: java.lang.Throwable -> L40
            r0.o()     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.WorkDatabase r0 = r5.q
            r0.j()
            M1.k r0 = r5.f616v
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.j(r6)
            return
        L71:
            r0.close()     // Catch: java.lang.Throwable -> L40
            r1.c()     // Catch: java.lang.Throwable -> L40
            throw r6     // Catch: java.lang.Throwable -> L40
        L78:
            androidx.work.impl.WorkDatabase r0 = r5.q
            r0.j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.A.e(boolean):void");
    }

    public final void f() {
        K1.q qVar = this.f612r;
        String str = this.f604i;
        int g3 = qVar.g(str);
        String str2 = f602y;
        if (g3 == 2) {
            B1.s.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        B1.s.d().a(str2, "Status for " + str + " is " + B1.t.C(g3) + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.f604i;
        WorkDatabase workDatabase = this.q;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                K1.q qVar = this.f612r;
                if (isEmpty) {
                    B1.h hVar = ((B1.n) this.f608m).f299a;
                    qVar.l(str, this.f605j.f4584v);
                    qVar.n(str, hVar);
                    workDatabase.o();
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (qVar.g(str2) != 6) {
                    qVar.o(str2, 4);
                }
                linkedList.addAll(this.f613s.e(str2));
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (this.f618x == -256) {
            return false;
        }
        B1.s.d().a(f602y, "Work interrupted for " + this.f615u);
        if (this.f612r.g(this.f604i) == 0) {
            e(false);
        } else {
            e(!B1.t.a(r0));
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        B1.k kVar;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f604i;
        sb.append(str);
        sb.append(", tags={ ");
        List<String> list = this.f614t;
        boolean z4 = true;
        for (String str2 : list) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f615u = sb.toString();
        K1.o oVar = this.f605j;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.q;
        workDatabase.c();
        try {
            int i2 = oVar.f4565b;
            String str3 = oVar.f4566c;
            String str4 = f602y;
            if (i2 == 1) {
                if (oVar.c() || (oVar.f4565b == 1 && oVar.f4574k > 0)) {
                    this.f610o.getClass();
                    if (System.currentTimeMillis() < oVar.a()) {
                        B1.s.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                        e(true);
                        workDatabase.o();
                    }
                }
                workDatabase.o();
                workDatabase.j();
                boolean c3 = oVar.c();
                B1.h hVar = oVar.f4568e;
                K1.q qVar = this.f612r;
                C0011a c0011a = this.f609n;
                if (!c3) {
                    c0011a.f264e.getClass();
                    String str5 = oVar.f4567d;
                    z2.h.f(str5, "className");
                    String str6 = B1.l.f297a;
                    try {
                        Object newInstance = Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                        z2.h.d(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                        kVar = (B1.k) newInstance;
                    } catch (Exception e3) {
                        B1.s.d().c(B1.l.f297a, "Trouble instantiating ".concat(str5), e3);
                        kVar = null;
                    }
                    if (kVar == null) {
                        B1.s.d().b(str4, "Could not create Input Merger ".concat(str5));
                        g();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(hVar);
                    qVar.getClass();
                    r1.v a3 = r1.v.a("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                    if (str == null) {
                        a3.n(1);
                    } else {
                        a3.p(str, 1);
                    }
                    r1.r rVar = qVar.f4587a;
                    rVar.b();
                    Cursor p3 = AbstractC0946A.p(rVar, a3, false);
                    try {
                        ArrayList arrayList2 = new ArrayList(p3.getCount());
                        while (p3.moveToNext()) {
                            arrayList2.add(B1.h.a(p3.isNull(0) ? null : p3.getBlob(0)));
                        }
                        p3.close();
                        a3.c();
                        arrayList.addAll(arrayList2);
                        hVar = kVar.a(arrayList);
                    } catch (Throwable th) {
                        p3.close();
                        a3.c();
                        throw th;
                    }
                }
                UUID fromString = UUID.fromString(str);
                ExecutorService executorService = c0011a.f260a;
                J1.a aVar = this.f611p;
                N1.b bVar = this.f607l;
                L1.v vVar = new L1.v(workDatabase, aVar, bVar);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f6937a = fromString;
                workerParameters.f6938b = hVar;
                new HashSet(list);
                workerParameters.f6939c = executorService;
                workerParameters.f6940d = bVar;
                G g3 = c0011a.f263d;
                workerParameters.f6941e = g3;
                if (this.f606k == null) {
                    Context context = this.f603h;
                    g3.getClass();
                    this.f606k = G.a(context, str3, workerParameters);
                }
                B1.r rVar2 = this.f606k;
                if (rVar2 == null) {
                    B1.s.d().b(str4, "Could not create Worker " + str3);
                    g();
                    return;
                }
                if (rVar2.f304k) {
                    B1.s.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                    g();
                    return;
                }
                rVar2.f304k = true;
                workDatabase.c();
                try {
                    if (qVar.g(str) == 1) {
                        qVar.o(str, 2);
                        r1.r rVar3 = qVar.f4587a;
                        rVar3.b();
                        K1.h hVar2 = qVar.f4595i;
                        C1387i a4 = hVar2.a();
                        if (str == null) {
                            a4.n(1);
                        } else {
                            a4.p(str, 1);
                        }
                        rVar3.c();
                        try {
                            a4.b();
                            rVar3.o();
                            rVar3.j();
                            hVar2.c(a4);
                            qVar.p(str, -256);
                            z3 = true;
                        } catch (Throwable th2) {
                            rVar3.j();
                            hVar2.c(a4);
                            throw th2;
                        }
                    } else {
                        z3 = false;
                    }
                    workDatabase.o();
                    if (!z3) {
                        f();
                        return;
                    }
                    if (h()) {
                        return;
                    }
                    L1.t tVar = new L1.t(this.f603h, this.f605j, this.f606k, vVar, this.f607l);
                    bVar.f5013d.execute(tVar);
                    M1.k kVar2 = tVar.f4668h;
                    z zVar = new z(this, 0, kVar2);
                    L1.q qVar2 = new L1.q();
                    M1.k kVar3 = this.f617w;
                    kVar3.a(zVar, qVar2);
                    kVar2.a(new F(this, 1, kVar2), bVar.f5013d);
                    kVar3.a(new F(this, 2, this.f615u), bVar.f5010a);
                    return;
                } finally {
                }
            }
            f();
            workDatabase.o();
            B1.s.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
        } finally {
            workDatabase.j();
        }
    }
}
