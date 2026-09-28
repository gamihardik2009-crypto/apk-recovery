package E1;

import B1.s;
import J2.T;
import J2.c0;
import L1.o;
import L1.r;
import L1.x;
import L1.y;
import L1.z;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public final class h implements G1.e, x {

    /* renamed from: v, reason: collision with root package name */
    public static final String f1044v = s.f("DelayMetCommandHandler");

    /* renamed from: h, reason: collision with root package name */
    public final Context f1045h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1046i;

    /* renamed from: j, reason: collision with root package name */
    public final K1.j f1047j;

    /* renamed from: k, reason: collision with root package name */
    public final l f1048k;

    /* renamed from: l, reason: collision with root package name */
    public final G1.i f1049l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1050m;

    /* renamed from: n, reason: collision with root package name */
    public int f1051n;

    /* renamed from: o, reason: collision with root package name */
    public final o f1052o;

    /* renamed from: p, reason: collision with root package name */
    public final N1.a f1053p;
    public PowerManager.WakeLock q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1054r;

    /* renamed from: s, reason: collision with root package name */
    public final C1.o f1055s;

    /* renamed from: t, reason: collision with root package name */
    public final T f1056t;

    /* renamed from: u, reason: collision with root package name */
    public volatile c0 f1057u;

    public h(Context context, int i2, l lVar, C1.o oVar) {
        this.f1045h = context;
        this.f1046i = i2;
        this.f1048k = lVar;
        this.f1047j = oVar.f667a;
        this.f1055s = oVar;
        I1.l lVar2 = lVar.f1069l.f697o;
        N1.b bVar = lVar.f1066i;
        this.f1052o = bVar.f5010a;
        this.f1053p = bVar.f5013d;
        this.f1056t = bVar.f5011b;
        this.f1049l = new G1.i(lVar2);
        this.f1054r = false;
        this.f1051n = 0;
        this.f1050m = new Object();
    }

    public static void b(h hVar) {
        K1.j jVar = hVar.f1047j;
        String str = jVar.f4551a;
        int i2 = hVar.f1051n;
        String str2 = f1044v;
        if (i2 >= 2) {
            s.d().a(str2, "Already stopped work for " + str);
            return;
        }
        hVar.f1051n = 2;
        s.d().a(str2, "Stopping work for WorkSpec " + str);
        Context context = hVar.f1045h;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.c(intent, jVar);
        l lVar = hVar.f1048k;
        int i3 = hVar.f1046i;
        j jVar2 = new j(i3, lVar, intent);
        N1.a aVar = hVar.f1053p;
        aVar.execute(jVar2);
        if (!lVar.f1068k.e(jVar.f4551a)) {
            s.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        s.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.c(intent2, jVar);
        aVar.execute(new j(i3, lVar, intent2));
    }

    public static void c(h hVar) {
        if (hVar.f1051n != 0) {
            s.d().a(f1044v, "Already started work for " + hVar.f1047j);
            return;
        }
        hVar.f1051n = 1;
        s.d().a(f1044v, "onAllConstraintsMet for " + hVar.f1047j);
        if (!hVar.f1048k.f1068k.h(hVar.f1055s, null)) {
            hVar.d();
            return;
        }
        z zVar = hVar.f1048k.f1067j;
        K1.j jVar = hVar.f1047j;
        synchronized (zVar.f4688d) {
            s.d().a(z.f4684e, "Starting timer for " + jVar);
            zVar.a(jVar);
            y yVar = new y(zVar, jVar);
            zVar.f4686b.put(jVar, yVar);
            zVar.f4687c.put(jVar, hVar);
            ((Handler) zVar.f4685a.f165i).postDelayed(yVar, 600000L);
        }
    }

    @Override // G1.e
    public final void a(K1.o oVar, G1.c cVar) {
        boolean z3 = cVar instanceof G1.a;
        o oVar2 = this.f1052o;
        if (z3) {
            oVar2.execute(new g(this, 1));
        } else {
            oVar2.execute(new g(this, 0));
        }
    }

    public final void d() {
        synchronized (this.f1050m) {
            try {
                if (this.f1057u != null) {
                    this.f1057u.a(null);
                }
                this.f1048k.f1067j.a(this.f1047j);
                PowerManager.WakeLock wakeLock = this.q;
                if (wakeLock != null && wakeLock.isHeld()) {
                    s.d().a(f1044v, "Releasing wakelock " + this.q + "for WorkSpec " + this.f1047j);
                    this.q.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        String str = this.f1047j.f4551a;
        this.q = r.a(this.f1045h, str + " (" + this.f1046i + ")");
        s d3 = s.d();
        String str2 = f1044v;
        d3.a(str2, "Acquiring wakelock " + this.q + "for WorkSpec " + str);
        this.q.acquire();
        K1.o i2 = this.f1048k.f1069l.f690h.v().i(str);
        if (i2 == null) {
            this.f1052o.execute(new g(this, 0));
            return;
        }
        boolean b3 = i2.b();
        this.f1054r = b3;
        if (b3) {
            this.f1057u = G1.k.a(this.f1049l, i2, this.f1056t, this);
            return;
        }
        s.d().a(str2, "No constraints for " + str);
        this.f1052o.execute(new g(this, 1));
    }

    public final void f(boolean z3) {
        s d3 = s.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        K1.j jVar = this.f1047j;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z3);
        d3.a(f1044v, sb.toString());
        d();
        int i2 = this.f1046i;
        l lVar = this.f1048k;
        N1.a aVar = this.f1053p;
        Context context = this.f1045h;
        if (z3) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.c(intent, jVar);
            aVar.execute(new j(i2, lVar, intent));
        }
        if (this.f1054r) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new j(i2, lVar, intent2));
        }
    }
}
