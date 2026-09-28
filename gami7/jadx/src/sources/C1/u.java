package C1;

import androidx.work.impl.WorkDatabase_Impl;
import com.example.bulksmsscheduler.data.AppDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n2.AbstractC0946A;
import p.C1028l0;
import t1.C1268a;
import w1.C1380b;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.r f685c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(AppDatabase_Impl appDatabase_Impl) {
        this(10);
        this.f684b = 1;
        this.f685c = appDatabase_Impl;
    }

    public final void a(C1380b c1380b) {
        switch (this.f684b) {
            case 0:
                c1380b.e("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                c1380b.e("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                c1380b.e("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                c1380b.e("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1380b.e("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                c1380b.e("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                c1380b.e("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                c1380b.e("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c1380b.e("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
                break;
            default:
                c1380b.e("CREATE TABLE IF NOT EXISTS `clients` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `phone` TEXT NOT NULL, `notes` TEXT NOT NULL, `active` INTEGER NOT NULL, `orderIndex` INTEGER NOT NULL, `useNameInTemplate` INTEGER NOT NULL, `source` TEXT NOT NULL, PRIMARY KEY(`id`))");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_clients_phone` ON `clients` (`phone`)");
                c1380b.e("CREATE TABLE IF NOT EXISTS `templates` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `greeting` TEXT NOT NULL, `message` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `order` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                c1380b.e("CREATE TABLE IF NOT EXISTS `schedules` (`id` TEXT NOT NULL, `clientId` TEXT NOT NULL, `templateId` TEXT NOT NULL, `scheduledDate` TEXT NOT NULL, `scheduledTime` TEXT NOT NULL, `status` TEXT NOT NULL, `retryCount` INTEGER NOT NULL, `campaignId` TEXT, `week` TEXT NOT NULL, `message` TEXT NOT NULL, PRIMARY KEY(`id`))");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_schedules_status_scheduledDate_scheduledTime` ON `schedules` (`status`, `scheduledDate`, `scheduledTime`)");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_schedules_clientId` ON `schedules` (`clientId`)");
                c1380b.e("CREATE INDEX IF NOT EXISTS `index_schedules_scheduledDate` ON `schedules` (`scheduledDate`)");
                c1380b.e("CREATE TABLE IF NOT EXISTS `app_settings` (`id` INTEGER NOT NULL, `workStartTime` TEXT NOT NULL, `workEndTime` TEXT NOT NULL, `skipSunday` INTEGER NOT NULL, `timeGapMinutes` INTEGER NOT NULL, `messageRotationCount` INTEGER NOT NULL, `automationEnabled` INTEGER NOT NULL, `newDataAdded` INTEGER NOT NULL, `automationStartDate` TEXT NOT NULL, PRIMARY KEY(`id`))");
                c1380b.e("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c1380b.e("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9a8284f2d0f662445898d13d9f198860')");
                break;
        }
    }

    public final void b(C1380b c1380b) {
        switch (this.f684b) {
            case 0:
                c1380b.e("DROP TABLE IF EXISTS `Dependency`");
                c1380b.e("DROP TABLE IF EXISTS `WorkSpec`");
                c1380b.e("DROP TABLE IF EXISTS `WorkTag`");
                c1380b.e("DROP TABLE IF EXISTS `SystemIdInfo`");
                c1380b.e("DROP TABLE IF EXISTS `WorkName`");
                c1380b.e("DROP TABLE IF EXISTS `WorkProgress`");
                c1380b.e("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f685c;
                List list = workDatabase_Impl.f9992g;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((c) workDatabase_Impl.f9992g.get(i2)).getClass();
                    }
                    break;
                }
                break;
            default:
                c1380b.e("DROP TABLE IF EXISTS `clients`");
                c1380b.e("DROP TABLE IF EXISTS `templates`");
                c1380b.e("DROP TABLE IF EXISTS `schedules`");
                c1380b.e("DROP TABLE IF EXISTS `app_settings`");
                List list2 = ((AppDatabase_Impl) this.f685c).f9992g;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).getClass();
                    }
                    break;
                }
                break;
        }
    }

    public final void c(C1380b c1380b) {
        switch (this.f684b) {
            case 0:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f685c;
                List list = workDatabase_Impl.f9992g;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((c) workDatabase_Impl.f9992g.get(i2)).getClass();
                    }
                    break;
                }
                break;
            default:
                List list2 = ((AppDatabase_Impl) this.f685c).f9992g;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).getClass();
                    }
                    break;
                }
                break;
        }
    }

    public final void d(C1380b c1380b) {
        switch (this.f684b) {
            case 0:
                ((WorkDatabase_Impl) this.f685c).f9986a = c1380b;
                c1380b.e("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f685c).k(c1380b);
                List list = ((WorkDatabase_Impl) this.f685c).f9992g;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((c) ((WorkDatabase_Impl) this.f685c).f9992g.get(i2)).a(c1380b);
                    }
                    break;
                }
                break;
            default:
                ((AppDatabase_Impl) this.f685c).f9986a = c1380b;
                ((AppDatabase_Impl) this.f685c).k(c1380b);
                List list2 = ((AppDatabase_Impl) this.f685c).f9992g;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a(c1380b);
                    }
                    break;
                }
                break;
        }
    }

    public final void e(C1380b c1380b) {
        switch (this.f684b) {
            case 0:
                AbstractC0946A.h(c1380b);
                break;
            default:
                AbstractC0946A.h(c1380b);
                break;
        }
    }

    public final C1028l0 f(C1380b c1380b) {
        switch (this.f684b) {
            case 0:
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new C1268a("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap.put("prerequisite_id", new C1268a("prerequisite_id", "TEXT", true, 2, null, 1));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new t1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new t1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new t1.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                hashSet2.add(new t1.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                t1.e eVar = new t1.e("Dependency", hashMap, hashSet, hashSet2);
                t1.e a3 = t1.e.a(c1380b, "Dependency");
                if (!eVar.equals(a3)) {
                    break;
                } else {
                    HashMap hashMap2 = new HashMap(30);
                    hashMap2.put("id", new C1268a("id", "TEXT", true, 1, null, 1));
                    hashMap2.put("state", new C1268a("state", "INTEGER", true, 0, null, 1));
                    hashMap2.put("worker_class_name", new C1268a("worker_class_name", "TEXT", true, 0, null, 1));
                    hashMap2.put("input_merger_class_name", new C1268a("input_merger_class_name", "TEXT", true, 0, null, 1));
                    hashMap2.put("input", new C1268a("input", "BLOB", true, 0, null, 1));
                    hashMap2.put("output", new C1268a("output", "BLOB", true, 0, null, 1));
                    hashMap2.put("initial_delay", new C1268a("initial_delay", "INTEGER", true, 0, null, 1));
                    hashMap2.put("interval_duration", new C1268a("interval_duration", "INTEGER", true, 0, null, 1));
                    hashMap2.put("flex_duration", new C1268a("flex_duration", "INTEGER", true, 0, null, 1));
                    hashMap2.put("run_attempt_count", new C1268a("run_attempt_count", "INTEGER", true, 0, null, 1));
                    hashMap2.put("backoff_policy", new C1268a("backoff_policy", "INTEGER", true, 0, null, 1));
                    hashMap2.put("backoff_delay_duration", new C1268a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                    hashMap2.put("last_enqueue_time", new C1268a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
                    hashMap2.put("minimum_retention_duration", new C1268a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                    hashMap2.put("schedule_requested_at", new C1268a("schedule_requested_at", "INTEGER", true, 0, null, 1));
                    hashMap2.put("run_in_foreground", new C1268a("run_in_foreground", "INTEGER", true, 0, null, 1));
                    hashMap2.put("out_of_quota_policy", new C1268a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                    hashMap2.put("period_count", new C1268a("period_count", "INTEGER", true, 0, "0", 1));
                    hashMap2.put("generation", new C1268a("generation", "INTEGER", true, 0, "0", 1));
                    hashMap2.put("next_schedule_time_override", new C1268a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
                    hashMap2.put("next_schedule_time_override_generation", new C1268a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
                    hashMap2.put("stop_reason", new C1268a("stop_reason", "INTEGER", true, 0, "-256", 1));
                    hashMap2.put("required_network_type", new C1268a("required_network_type", "INTEGER", true, 0, null, 1));
                    hashMap2.put("requires_charging", new C1268a("requires_charging", "INTEGER", true, 0, null, 1));
                    hashMap2.put("requires_device_idle", new C1268a("requires_device_idle", "INTEGER", true, 0, null, 1));
                    hashMap2.put("requires_battery_not_low", new C1268a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                    hashMap2.put("requires_storage_not_low", new C1268a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                    hashMap2.put("trigger_content_update_delay", new C1268a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                    hashMap2.put("trigger_max_content_delay", new C1268a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                    hashMap2.put("content_uri_triggers", new C1268a("content_uri_triggers", "BLOB", true, 0, null, 1));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(2);
                    hashSet4.add(new t1.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
                    hashSet4.add(new t1.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
                    t1.e eVar2 = new t1.e("WorkSpec", hashMap2, hashSet3, hashSet4);
                    t1.e a4 = t1.e.a(c1380b, "WorkSpec");
                    if (!eVar2.equals(a4)) {
                        break;
                    } else {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("tag", new C1268a("tag", "TEXT", true, 1, null, 1));
                        hashMap3.put("work_spec_id", new C1268a("work_spec_id", "TEXT", true, 2, null, 1));
                        HashSet hashSet5 = new HashSet(1);
                        hashSet5.add(new t1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                        HashSet hashSet6 = new HashSet(1);
                        hashSet6.add(new t1.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                        t1.e eVar3 = new t1.e("WorkTag", hashMap3, hashSet5, hashSet6);
                        t1.e a5 = t1.e.a(c1380b, "WorkTag");
                        if (!eVar3.equals(a5)) {
                            break;
                        } else {
                            HashMap hashMap4 = new HashMap(3);
                            hashMap4.put("work_spec_id", new C1268a("work_spec_id", "TEXT", true, 1, null, 1));
                            hashMap4.put("generation", new C1268a("generation", "INTEGER", true, 2, "0", 1));
                            hashMap4.put("system_id", new C1268a("system_id", "INTEGER", true, 0, null, 1));
                            HashSet hashSet7 = new HashSet(1);
                            hashSet7.add(new t1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                            t1.e eVar4 = new t1.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                            t1.e a6 = t1.e.a(c1380b, "SystemIdInfo");
                            if (!eVar4.equals(a6)) {
                                break;
                            } else {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put("name", new C1268a("name", "TEXT", true, 1, null, 1));
                                hashMap5.put("work_spec_id", new C1268a("work_spec_id", "TEXT", true, 2, null, 1));
                                HashSet hashSet8 = new HashSet(1);
                                hashSet8.add(new t1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new t1.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                                t1.e eVar5 = new t1.e("WorkName", hashMap5, hashSet8, hashSet9);
                                t1.e a7 = t1.e.a(c1380b, "WorkName");
                                if (!eVar5.equals(a7)) {
                                    break;
                                } else {
                                    HashMap hashMap6 = new HashMap(2);
                                    hashMap6.put("work_spec_id", new C1268a("work_spec_id", "TEXT", true, 1, null, 1));
                                    hashMap6.put("progress", new C1268a("progress", "BLOB", true, 0, null, 1));
                                    HashSet hashSet10 = new HashSet(1);
                                    hashSet10.add(new t1.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                                    t1.e eVar6 = new t1.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                                    t1.e a8 = t1.e.a(c1380b, "WorkProgress");
                                    if (!eVar6.equals(a8)) {
                                        break;
                                    } else {
                                        HashMap hashMap7 = new HashMap(2);
                                        hashMap7.put("key", new C1268a("key", "TEXT", true, 1, null, 1));
                                        hashMap7.put("long_value", new C1268a("long_value", "INTEGER", false, 0, null, 1));
                                        t1.e eVar7 = new t1.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
                                        t1.e a9 = t1.e.a(c1380b, "Preference");
                                        if (!eVar7.equals(a9)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            default:
                HashMap hashMap8 = new HashMap(8);
                hashMap8.put("id", new C1268a("id", "TEXT", true, 1, null, 1));
                hashMap8.put("name", new C1268a("name", "TEXT", true, 0, null, 1));
                hashMap8.put("phone", new C1268a("phone", "TEXT", true, 0, null, 1));
                hashMap8.put("notes", new C1268a("notes", "TEXT", true, 0, null, 1));
                hashMap8.put("active", new C1268a("active", "INTEGER", true, 0, null, 1));
                hashMap8.put("orderIndex", new C1268a("orderIndex", "INTEGER", true, 0, null, 1));
                hashMap8.put("useNameInTemplate", new C1268a("useNameInTemplate", "INTEGER", true, 0, null, 1));
                hashMap8.put("source", new C1268a("source", "TEXT", true, 0, null, 1));
                HashSet hashSet11 = new HashSet(0);
                HashSet hashSet12 = new HashSet(1);
                hashSet12.add(new t1.d("index_clients_phone", false, Arrays.asList("phone"), Arrays.asList("ASC")));
                t1.e eVar8 = new t1.e("clients", hashMap8, hashSet11, hashSet12);
                t1.e a10 = t1.e.a(c1380b, "clients");
                if (!eVar8.equals(a10)) {
                    break;
                } else {
                    HashMap hashMap9 = new HashMap(6);
                    hashMap9.put("id", new C1268a("id", "TEXT", true, 1, null, 1));
                    hashMap9.put("title", new C1268a("title", "TEXT", true, 0, null, 1));
                    hashMap9.put("greeting", new C1268a("greeting", "TEXT", true, 0, null, 1));
                    hashMap9.put("message", new C1268a("message", "TEXT", true, 0, null, 1));
                    hashMap9.put("enabled", new C1268a("enabled", "INTEGER", true, 0, null, 1));
                    hashMap9.put("order", new C1268a("order", "INTEGER", true, 0, null, 1));
                    t1.e eVar9 = new t1.e("templates", hashMap9, new HashSet(0), new HashSet(0));
                    t1.e a11 = t1.e.a(c1380b, "templates");
                    if (!eVar9.equals(a11)) {
                        break;
                    } else {
                        HashMap hashMap10 = new HashMap(10);
                        hashMap10.put("id", new C1268a("id", "TEXT", true, 1, null, 1));
                        hashMap10.put("clientId", new C1268a("clientId", "TEXT", true, 0, null, 1));
                        hashMap10.put("templateId", new C1268a("templateId", "TEXT", true, 0, null, 1));
                        hashMap10.put("scheduledDate", new C1268a("scheduledDate", "TEXT", true, 0, null, 1));
                        hashMap10.put("scheduledTime", new C1268a("scheduledTime", "TEXT", true, 0, null, 1));
                        hashMap10.put("status", new C1268a("status", "TEXT", true, 0, null, 1));
                        hashMap10.put("retryCount", new C1268a("retryCount", "INTEGER", true, 0, null, 1));
                        hashMap10.put("campaignId", new C1268a("campaignId", "TEXT", false, 0, null, 1));
                        hashMap10.put("week", new C1268a("week", "TEXT", true, 0, null, 1));
                        hashMap10.put("message", new C1268a("message", "TEXT", true, 0, null, 1));
                        HashSet hashSet13 = new HashSet(0);
                        HashSet hashSet14 = new HashSet(3);
                        hashSet14.add(new t1.d("index_schedules_status_scheduledDate_scheduledTime", false, Arrays.asList("status", "scheduledDate", "scheduledTime"), Arrays.asList("ASC", "ASC", "ASC")));
                        hashSet14.add(new t1.d("index_schedules_clientId", false, Arrays.asList("clientId"), Arrays.asList("ASC")));
                        hashSet14.add(new t1.d("index_schedules_scheduledDate", false, Arrays.asList("scheduledDate"), Arrays.asList("ASC")));
                        t1.e eVar10 = new t1.e("schedules", hashMap10, hashSet13, hashSet14);
                        t1.e a12 = t1.e.a(c1380b, "schedules");
                        if (!eVar10.equals(a12)) {
                            break;
                        } else {
                            HashMap hashMap11 = new HashMap(9);
                            hashMap11.put("id", new C1268a("id", "INTEGER", true, 1, null, 1));
                            hashMap11.put("workStartTime", new C1268a("workStartTime", "TEXT", true, 0, null, 1));
                            hashMap11.put("workEndTime", new C1268a("workEndTime", "TEXT", true, 0, null, 1));
                            hashMap11.put("skipSunday", new C1268a("skipSunday", "INTEGER", true, 0, null, 1));
                            hashMap11.put("timeGapMinutes", new C1268a("timeGapMinutes", "INTEGER", true, 0, null, 1));
                            hashMap11.put("messageRotationCount", new C1268a("messageRotationCount", "INTEGER", true, 0, null, 1));
                            hashMap11.put("automationEnabled", new C1268a("automationEnabled", "INTEGER", true, 0, null, 1));
                            hashMap11.put("newDataAdded", new C1268a("newDataAdded", "INTEGER", true, 0, null, 1));
                            hashMap11.put("automationStartDate", new C1268a("automationStartDate", "TEXT", true, 0, null, 1));
                            t1.e eVar11 = new t1.e("app_settings", hashMap11, new HashSet(0), new HashSet(0));
                            t1.e a13 = t1.e.a(c1380b, "app_settings");
                            if (!eVar11.equals(a13)) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                }
        }
        return new C1028l0((String) null, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(WorkDatabase_Impl workDatabase_Impl) {
        this(20);
        this.f684b = 0;
        this.f685c = workDatabase_Impl;
    }

    public u(int i2) {
        this.f683a = i2;
    }
}
