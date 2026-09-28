package C1;

import B1.C;
import B1.C0011a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w1.C1387i;

/* loaded from: classes.dex */
public final class w extends C {

    /* renamed from: p, reason: collision with root package name */
    public static w f686p;
    public static w q;

    /* renamed from: r, reason: collision with root package name */
    public static final Object f687r;

    /* renamed from: f, reason: collision with root package name */
    public final Context f688f;

    /* renamed from: g, reason: collision with root package name */
    public final C0011a f689g;

    /* renamed from: h, reason: collision with root package name */
    public final WorkDatabase f690h;

    /* renamed from: i, reason: collision with root package name */
    public final N1.b f691i;

    /* renamed from: j, reason: collision with root package name */
    public final List f692j;

    /* renamed from: k, reason: collision with root package name */
    public final i f693k;

    /* renamed from: l, reason: collision with root package name */
    public final L1.i f694l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f695m;

    /* renamed from: n, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f696n;

    /* renamed from: o, reason: collision with root package name */
    public final I1.l f697o;

    static {
        B1.s.f("WorkManagerImpl");
        f686p = null;
        q = null;
        f687r = new Object();
    }

    public w(Context context, final C0011a c0011a, N1.b bVar, final WorkDatabase workDatabase, final List list, i iVar, I1.l lVar) {
        super(0);
        this.f695m = false;
        Context applicationContext = context.getApplicationContext();
        if (v.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        B1.s sVar = new B1.s(c0011a.f266g);
        synchronized (B1.s.f305b) {
            B1.s.f306c = sVar;
        }
        this.f688f = applicationContext;
        this.f691i = bVar;
        this.f690h = workDatabase;
        this.f693k = iVar;
        this.f697o = lVar;
        this.f689g = c0011a;
        this.f692j = list;
        this.f694l = new L1.i(workDatabase, 1);
        final L1.o oVar = bVar.f5010a;
        String str = n.f666a;
        iVar.a(new d() { // from class: C1.l
            @Override // C1.d
            public final void e(final K1.j jVar, boolean z3) {
                final C0011a c0011a2 = c0011a;
                final WorkDatabase workDatabase2 = workDatabase;
                final List list2 = list;
                oVar.execute(new Runnable() { // from class: C1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((k) it.next()).b(jVar.f4551a);
                        }
                        n.b(c0011a2, workDatabase2, list3);
                    }
                });
            }
        });
        bVar.a(new L1.f(applicationContext, this));
    }

    public static w o0(Context context) {
        w wVar;
        Object obj = f687r;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    wVar = f686p;
                    if (wVar == null) {
                        wVar = q;
                    }
                }
                return wVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (wVar != null) {
            return wVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void p0() {
        synchronized (f687r) {
            try {
                this.f695m = true;
                BroadcastReceiver.PendingResult pendingResult = this.f696n;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f696n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q0() {
        ArrayList e3;
        String str = F1.b.f1117m;
        Context context = this.f688f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e3 = F1.b.e(context, jobScheduler)) != null && !e3.isEmpty()) {
            Iterator it = e3.iterator();
            while (it.hasNext()) {
                F1.b.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f690h;
        K1.q v3 = workDatabase.v();
        r1.r rVar = v3.f4587a;
        rVar.b();
        K1.h hVar = v3.f4599m;
        C1387i a3 = hVar.a();
        rVar.c();
        try {
            a3.b();
            rVar.o();
            rVar.j();
            hVar.c(a3);
            n.b(this.f689g, workDatabase, this.f692j);
        } catch (Throwable th) {
            rVar.j();
            hVar.c(a3);
            throw th;
        }
    }
}
