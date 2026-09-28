package E1;

import B1.s;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1025a = s.f("Alarms");

    public static void a(Context context, K1.j jVar, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f1026m;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.c(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i2, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        s.d().a(f1025a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i2 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, K1.j jVar, long j3) {
        K1.i s3 = workDatabase.s();
        K1.g c3 = s3.c(jVar);
        if (c3 != null) {
            int i2 = c3.f4544c;
            a(context, jVar, i2);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f1026m;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.c(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i2, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j3, service);
                return;
            }
            return;
        }
        final L1.i iVar = new L1.i(workDatabase, 0);
        Object n3 = workDatabase.n(new Callable() { // from class: L1.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                i iVar2 = i.this;
                z2.h.f(iVar2, "this$0");
                WorkDatabase workDatabase2 = iVar2.f4652a;
                Long d3 = workDatabase2.r().d("next_alarm_manager_id");
                int longValue = d3 != null ? (int) d3.longValue() : 0;
                workDatabase2.r().e(new K1.d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
            }
        });
        z2.h.e(n3, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int intValue = ((Number) n3).intValue();
        s3.d(new K1.g(jVar.f4552b, intValue, jVar.f4551a));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f1026m;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.c(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j3, service2);
        }
    }
}
