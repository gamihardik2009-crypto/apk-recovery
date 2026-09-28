package F1;

import B1.C0011a;
import B1.C0013c;
import B1.C0014d;
import B1.s;
import B1.t;
import C1.k;
import C1.y;
import K1.g;
import K1.h;
import K1.i;
import K1.j;
import K1.o;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import m.AbstractC0837j;
import r1.r;
import w1.C1387i;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: m, reason: collision with root package name */
    public static final String f1117m = s.f("SystemJobScheduler");

    /* renamed from: h, reason: collision with root package name */
    public final Context f1118h;

    /* renamed from: i, reason: collision with root package name */
    public final JobScheduler f1119i;

    /* renamed from: j, reason: collision with root package name */
    public final a f1120j;

    /* renamed from: k, reason: collision with root package name */
    public final WorkDatabase f1121k;

    /* renamed from: l, reason: collision with root package name */
    public final C0011a f1122l;

    public b(Context context, WorkDatabase workDatabase, C0011a c0011a) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context, c0011a.f262c);
        this.f1118h = context;
        this.f1119i = jobScheduler;
        this.f1120j = aVar;
        this.f1121k = workDatabase;
        this.f1122l = c0011a;
    }

    public static void a(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            s.d().c(f1117m, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            s.d().c(f1117m, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // C1.k
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.f1118h;
        JobScheduler jobScheduler = this.f1119i;
        ArrayList e3 = e(context, jobScheduler);
        if (e3 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = e3.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                j f3 = f(jobInfo);
                if (f3 != null && str.equals(f3.f4551a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a(jobScheduler, ((Integer) it2.next()).intValue());
        }
        i s3 = this.f1121k.s();
        r rVar = (r) s3.f4547i;
        rVar.b();
        h hVar = (h) s3.f4550l;
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
        } finally {
            rVar.j();
            hVar.c(a3);
        }
    }

    @Override // C1.k
    public final void c(o... oVarArr) {
        int intValue;
        C0011a c0011a = this.f1122l;
        WorkDatabase workDatabase = this.f1121k;
        final L1.i iVar = new L1.i(workDatabase, 0);
        for (o oVar : oVarArr) {
            workDatabase.c();
            try {
                o i2 = workDatabase.v().i(oVar.f4564a);
                String str = f1117m;
                String str2 = oVar.f4564a;
                if (i2 == null) {
                    s.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (i2.f4565b != 1) {
                    s.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j v3 = y.v(oVar);
                    g c3 = workDatabase.s().c(v3);
                    if (c3 != null) {
                        intValue = c3.f4544c;
                    } else {
                        c0011a.getClass();
                        final int i3 = c0011a.f267h;
                        Object n3 = iVar.f4652a.n(new Callable() { // from class: L1.h

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ int f4650b = 0;

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                i iVar2 = i.this;
                                z2.h.f(iVar2, "this$0");
                                WorkDatabase workDatabase2 = iVar2.f4652a;
                                Long d3 = workDatabase2.r().d("next_job_scheduler_id");
                                int longValue = d3 != null ? (int) d3.longValue() : 0;
                                workDatabase2.r().e(new K1.d("next_job_scheduler_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                                int i4 = this.f4650b;
                                if (i4 > longValue || longValue > i3) {
                                    workDatabase2.r().e(new K1.d("next_job_scheduler_id", Long.valueOf(i4 + 1)));
                                    longValue = i4;
                                }
                                return Integer.valueOf(longValue);
                            }
                        });
                        z2.h.e(n3, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) n3).intValue();
                    }
                    if (c3 == null) {
                        workDatabase.s().d(new g(v3.f4552b, intValue, v3.f4551a));
                    }
                    g(oVar, intValue);
                    workDatabase.o();
                }
            } finally {
                workDatabase.j();
            }
        }
    }

    @Override // C1.k
    public final boolean d() {
        return true;
    }

    public final void g(o oVar, int i2) {
        int i3;
        JobScheduler jobScheduler = this.f1119i;
        a aVar = this.f1120j;
        aVar.getClass();
        C0014d c0014d = oVar.f4573j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = oVar.f4564a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", oVar.f4582t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i2, aVar.f1115a).setRequiresCharging(c0014d.f276b);
        boolean z3 = c0014d.f277c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z3).setExtras(persistableBundle);
        int i4 = Build.VERSION.SDK_INT;
        int i5 = c0014d.f275a;
        if (i4 < 30 || i5 != 6) {
            int d3 = AbstractC0837j.d(i5);
            if (d3 != 0) {
                if (d3 != 1) {
                    if (d3 != 2) {
                        i3 = 3;
                        if (d3 != 3) {
                            i3 = 4;
                            if (d3 != 4) {
                                s.d().a(a.f1114c, "API version too low. Cannot convert network type value ".concat(t.B(i5)));
                            }
                        }
                    } else {
                        i3 = 2;
                    }
                }
                i3 = 1;
            } else {
                i3 = 0;
            }
            extras.setRequiredNetworkType(i3);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z3) {
            extras.setBackoffCriteria(oVar.f4576m, oVar.f4575l == 2 ? 0 : 1);
        }
        long a3 = oVar.a();
        aVar.f1116b.getClass();
        long max = Math.max(a3 - System.currentTimeMillis(), 0L);
        if (i4 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!oVar.q) {
            extras.setImportantWhileForeground(true);
        }
        Set<C0013c> set = c0014d.f282h;
        if (!set.isEmpty()) {
            for (C0013c c0013c : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(c0013c.f272a, c0013c.f273b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c0014d.f280f);
            extras.setTriggerContentMaxDelay(c0014d.f281g);
        }
        extras.setPersisted(false);
        int i6 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(c0014d.f278d);
        extras.setRequiresStorageNotLow(c0014d.f279e);
        boolean z4 = oVar.f4574k > 0;
        boolean z5 = max > 0;
        if (i6 >= 31 && oVar.q && !z4 && !z5) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f1117m;
        s.d().a(str2, "Scheduling work ID " + str + "Job ID " + i2);
        try {
            if (jobScheduler.schedule(build) == 0) {
                s.d().g(str2, "Unable to schedule work ID " + str);
                if (oVar.q && oVar.f4580r == 1) {
                    oVar.q = false;
                    s.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(oVar, i2);
                }
            }
        } catch (IllegalStateException e3) {
            ArrayList e4 = e(this.f1118h, jobScheduler);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(e4 != null ? e4.size() : 0), Integer.valueOf(this.f1121k.v().f().size()), Integer.valueOf(this.f1122l.f269j));
            s.d().b(str2, format);
            throw new IllegalStateException(format, e3);
        } catch (Throwable th) {
            s.d().c(str2, "Unable to schedule " + oVar, th);
        }
    }
}
