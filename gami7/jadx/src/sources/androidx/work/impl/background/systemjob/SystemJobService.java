package androidx.work.impl.background.systemjob;

import B1.s;
import B1.u;
import C1.d;
import C1.i;
import C1.o;
import C1.w;
import K1.c;
import K1.e;
import K1.j;
import N1.b;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements d {

    /* renamed from: l, reason: collision with root package name */
    public static final String f6953l = s.f("SystemJobService");

    /* renamed from: h, reason: collision with root package name */
    public w f6954h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f6955i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final c f6956j = new c(1);

    /* renamed from: k, reason: collision with root package name */
    public e f6957k;

    public static j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // C1.d
    public final void e(j jVar, boolean z3) {
        JobParameters jobParameters;
        s.d().a(f6953l, jVar.f4551a + " executed on JobScheduler");
        synchronized (this.f6955i) {
            jobParameters = (JobParameters) this.f6955i.remove(jVar);
        }
        this.f6956j.h(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z3);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            w o02 = w.o0(getApplicationContext());
            this.f6954h = o02;
            i iVar = o02.f693k;
            this.f6957k = new e(iVar, o02.f691i);
            iVar.a(this);
        } catch (IllegalStateException e3) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e3);
            }
            s.d().g(f6953l, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        w wVar = this.f6954h;
        if (wVar != null) {
            wVar.f693k.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f6954h == null) {
            s.d().a(f6953l, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j a3 = a(jobParameters);
        if (a3 == null) {
            s.d().b(f6953l, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f6955i) {
            try {
                if (this.f6955i.containsKey(a3)) {
                    s.d().a(f6953l, "Job is already being executed by SystemJobService: " + a3);
                    return false;
                }
                s.d().a(f6953l, "onStartJob for " + a3);
                this.f6955i.put(a3, jobParameters);
                int i2 = Build.VERSION.SDK_INT;
                u uVar = new u();
                if (F1.c.b(jobParameters) != null) {
                    Arrays.asList(F1.c.b(jobParameters));
                }
                if (F1.c.a(jobParameters) != null) {
                    Arrays.asList(F1.c.a(jobParameters));
                }
                if (i2 >= 28) {
                    F1.d.a(jobParameters);
                }
                e eVar = this.f6957k;
                ((b) eVar.f4537b).a(new E1.e((i) eVar.f4536a, this.f6956j.j(a3), uVar));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f6954h == null) {
            s.d().a(f6953l, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j a3 = a(jobParameters);
        if (a3 == null) {
            s.d().b(f6953l, "WorkSpec id not found!");
            return false;
        }
        s.d().a(f6953l, "onStopJob for " + a3);
        synchronized (this.f6955i) {
            this.f6955i.remove(a3);
        }
        o h2 = this.f6956j.h(a3);
        if (h2 != null) {
            int a4 = Build.VERSION.SDK_INT >= 31 ? F1.e.a(jobParameters) : -512;
            e eVar = this.f6957k;
            eVar.getClass();
            eVar.g(h2, a4);
        }
        i iVar = this.f6954h.f693k;
        String str = a3.f4551a;
        synchronized (iVar.f655k) {
            contains = iVar.f653i.contains(str);
        }
        return !contains;
    }
}
