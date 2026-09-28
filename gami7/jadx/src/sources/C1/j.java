package C1;

import android.content.Context;
import android.content.SharedPreferences;
import s1.AbstractC1195a;
import w1.C1380b;

/* loaded from: classes.dex */
public final class j extends AbstractC1195a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f656c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f657d;

    public j(Context context, int i2, int i3) {
        super(i2, i3);
        this.f657d = context;
    }

    @Override // s1.AbstractC1195a
    public final void a(C1380b c1380b) {
        switch (this.f656c) {
            case 0:
                if (this.f10202b >= 10) {
                    c1380b.f(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f657d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c1380b.e("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f657d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j3 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j4 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c1380b.a();
                    try {
                        c1380b.f(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j3)});
                        c1380b.f(new Object[]{"reschedule_needed", Long.valueOf(j4)});
                        sharedPreferences.edit().clear().apply();
                        c1380b.r();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c1380b.a();
                    try {
                        c1380b.f(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        c1380b.f(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        c1380b.r();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public j(Context context) {
        super(9, 10);
        this.f657d = context;
    }
}
