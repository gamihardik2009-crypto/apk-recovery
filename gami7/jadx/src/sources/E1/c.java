package E1;

import B1.C0014d;
import B1.s;
import B1.t;
import B1.u;
import C1.o;
import C1.y;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r1.r;
import w1.C1387i;

/* loaded from: classes.dex */
public final class c implements C1.d {

    /* renamed from: m, reason: collision with root package name */
    public static final String f1026m = s.f("CommandHandler");

    /* renamed from: h, reason: collision with root package name */
    public final Context f1027h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f1028i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final Object f1029j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final u f1030k;

    /* renamed from: l, reason: collision with root package name */
    public final K1.c f1031l;

    public c(Context context, u uVar, K1.c cVar) {
        this.f1027h = context;
        this.f1030k = uVar;
        this.f1031l = cVar;
    }

    public static K1.j b(Intent intent) {
        return new K1.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, K1.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f4551a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f4552b);
    }

    public final void a(int i2, l lVar, Intent intent) {
        List<o> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            s.d().a(f1026m, "Handling constraints changed " + intent);
            f fVar = new f(this.f1027h, this.f1030k, i2, lVar);
            ArrayList f3 = lVar.f1069l.f690h.v().f();
            String str = d.f1032a;
            Iterator it = f3.iterator();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            while (it.hasNext()) {
                C0014d c0014d = ((K1.o) it.next()).f4573j;
                z3 |= c0014d.f278d;
                z4 |= c0014d.f276b;
                z5 |= c0014d.f279e;
                z6 |= c0014d.f275a != 1;
                if (z3 && z4 && z5 && z6) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f6948a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = fVar.f1038a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z4).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z6);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(f3.size());
            fVar.f1039b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = f3.iterator();
            while (it2.hasNext()) {
                K1.o oVar = (K1.o) it2.next();
                if (currentTimeMillis >= oVar.a() && (!oVar.b() || fVar.f1041d.b(oVar))) {
                    arrayList.add(oVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                K1.o oVar2 = (K1.o) it3.next();
                String str3 = oVar2.f4564a;
                K1.j v3 = y.v(oVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, v3);
                s.d().a(f.f1037e, "Creating a delay_met command for workSpec with id (" + str3 + ")");
                lVar.f1066i.f5013d.execute(new j(fVar.f1040c, lVar, intent3));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            s.d().a(f1026m, "Handling reschedule " + intent + ", " + i2);
            lVar.f1069l.q0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            s.d().b(f1026m, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            K1.j b3 = b(intent);
            String str4 = f1026m;
            s.d().a(str4, "Handling schedule work for " + b3);
            WorkDatabase workDatabase = lVar.f1069l.f690h;
            workDatabase.c();
            try {
                K1.o i3 = workDatabase.v().i(b3.f4551a);
                if (i3 == null) {
                    s.d().g(str4, "Skipping scheduling " + b3 + " because it's no longer in the DB");
                } else if (t.a(i3.f4565b)) {
                    s.d().g(str4, "Skipping scheduling " + b3 + "because it is finished.");
                } else {
                    long a3 = i3.a();
                    boolean b4 = i3.b();
                    Context context2 = this.f1027h;
                    if (b4) {
                        s.d().a(str4, "Opportunistically setting an alarm for " + b3 + "at " + a3);
                        b.b(context2, workDatabase, b3, a3);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        lVar.f1066i.f5013d.execute(new j(i2, lVar, intent4));
                    } else {
                        s.d().a(str4, "Setting up Alarms for " + b3 + "at " + a3);
                        b.b(context2, workDatabase, b3, a3);
                    }
                    workDatabase.o();
                }
                return;
            } finally {
                workDatabase.j();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f1029j) {
                try {
                    K1.j b5 = b(intent);
                    s d3 = s.d();
                    String str5 = f1026m;
                    d3.a(str5, "Handing delay met for " + b5);
                    if (this.f1028i.containsKey(b5)) {
                        s.d().a(str5, "WorkSpec " + b5 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        h hVar = new h(this.f1027h, i2, lVar, this.f1031l.j(b5));
                        this.f1028i.put(b5, hVar);
                        hVar.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                s.d().g(f1026m, "Ignoring intent " + intent);
                return;
            }
            K1.j b6 = b(intent);
            boolean z7 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            s.d().a(f1026m, "Handling onExecutionCompleted " + intent + ", " + i2);
            e(b6, z7);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        K1.c cVar = this.f1031l;
        if (containsKey) {
            int i4 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            o h2 = cVar.h(new K1.j(string, i4));
            list = arrayList2;
            if (h2 != null) {
                arrayList2.add(h2);
                list = arrayList2;
            }
        } else {
            list = cVar.i(string);
        }
        for (o oVar3 : list) {
            s.d().a(f1026m, "Handing stopWork work for " + string);
            K1.e eVar = lVar.q;
            eVar.getClass();
            z2.h.f(oVar3, "workSpecId");
            eVar.g(oVar3, -512);
            WorkDatabase workDatabase2 = lVar.f1069l.f690h;
            String str6 = b.f1025a;
            K1.i s3 = workDatabase2.s();
            K1.j jVar = oVar3.f667a;
            K1.g c3 = s3.c(jVar);
            if (c3 != null) {
                b.a(this.f1027h, jVar, c3.f4544c);
                s.d().a(b.f1025a, "Removing SystemIdInfo for workSpecId (" + jVar + ")");
                r rVar = (r) s3.f4547i;
                rVar.b();
                K1.h hVar2 = (K1.h) s3.f4549k;
                C1387i a4 = hVar2.a();
                String str7 = jVar.f4551a;
                if (str7 == null) {
                    a4.n(1);
                } else {
                    a4.p(str7, 1);
                }
                a4.t(jVar.f4552b, 2);
                rVar.c();
                try {
                    a4.b();
                    rVar.o();
                } finally {
                    rVar.j();
                    hVar2.c(a4);
                }
            }
            lVar.e(jVar, false);
        }
    }

    @Override // C1.d
    public final void e(K1.j jVar, boolean z3) {
        synchronized (this.f1029j) {
            try {
                h hVar = (h) this.f1028i.remove(jVar);
                this.f1031l.h(jVar);
                if (hVar != null) {
                    hVar.f(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
