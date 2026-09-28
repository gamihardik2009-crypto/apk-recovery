package K1;

import B1.C0014d;
import B1.t;
import m.AbstractC0837j;
import s.AbstractC1166e;
import t0.AbstractC1265x;
import w1.C1387i;

/* loaded from: classes.dex */
public final class b extends r1.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(r1.r rVar, int i2) {
        super(rVar, 1);
        this.f4531d = i2;
    }

    @Override // r1.x
    public final String b() {
        switch (this.f4531d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case AbstractC1166e.f10138f /* 5 */:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case AbstractC1166e.f10136d /* 6 */:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `clients` (`id`,`name`,`phone`,`notes`,`active`,`orderIndex`,`useNameInTemplate`,`source`) VALUES (?,?,?,?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `app_settings` (`id`,`workStartTime`,`workEndTime`,`skipSunday`,`timeGapMinutes`,`messageRotationCount`,`automationEnabled`,`newDataAdded`,`automationStartDate`) VALUES (?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `templates` (`id`,`title`,`greeting`,`message`,`enabled`,`order`) VALUES (?,?,?,?,?,?)";
        }
    }

    @Override // r1.i
    public final void d(C1387i c1387i, Object obj) {
        int i2;
        switch (this.f4531d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f4529a;
                if (str == null) {
                    c1387i.n(1);
                } else {
                    c1387i.p(str, 1);
                }
                String str2 = aVar.f4530b;
                if (str2 == null) {
                    c1387i.n(2);
                    return;
                } else {
                    c1387i.p(str2, 2);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                String str3 = dVar.f4534a;
                if (str3 == null) {
                    c1387i.n(1);
                } else {
                    c1387i.p(str3, 1);
                }
                Long l3 = dVar.f4535b;
                if (l3 == null) {
                    c1387i.n(2);
                    return;
                } else {
                    c1387i.t(l3.longValue(), 2);
                    return;
                }
            case 2:
                String str4 = ((g) obj).f4542a;
                if (str4 == null) {
                    c1387i.n(1);
                } else {
                    c1387i.p(str4, 1);
                }
                c1387i.t(r12.f4543b, 2);
                c1387i.t(r12.f4544c, 3);
                return;
            case 3:
                k kVar = (k) obj;
                String str5 = kVar.f4553a;
                if (str5 == null) {
                    c1387i.n(1);
                } else {
                    c1387i.p(str5, 1);
                }
                String str6 = kVar.f4554b;
                if (str6 == null) {
                    c1387i.n(2);
                    return;
                } else {
                    c1387i.p(str6, 2);
                    return;
                }
            case 4:
                t.w(obj);
                throw null;
            case AbstractC1166e.f10138f /* 5 */:
                o oVar = (o) obj;
                String str7 = oVar.f4564a;
                int i3 = 1;
                if (str7 == null) {
                    c1387i.n(1);
                } else {
                    c1387i.p(str7, 1);
                }
                c1387i.t(f.Q(oVar.f4565b), 2);
                String str8 = oVar.f4566c;
                if (str8 == null) {
                    c1387i.n(3);
                } else {
                    c1387i.p(str8, 3);
                }
                String str9 = oVar.f4567d;
                if (str9 == null) {
                    c1387i.n(4);
                } else {
                    c1387i.p(str9, 4);
                }
                byte[] b3 = B1.h.b(oVar.f4568e);
                if (b3 == null) {
                    c1387i.n(5);
                } else {
                    c1387i.m(5, b3);
                }
                byte[] b4 = B1.h.b(oVar.f4569f);
                if (b4 == null) {
                    c1387i.n(6);
                } else {
                    c1387i.m(6, b4);
                }
                c1387i.t(oVar.f4570g, 7);
                c1387i.t(oVar.f4571h, 8);
                c1387i.t(oVar.f4572i, 9);
                c1387i.t(oVar.f4574k, 10);
                int i4 = oVar.f4575l;
                AbstractC1265x.f("backoffPolicy", i4);
                int d3 = AbstractC0837j.d(i4);
                if (d3 == 0) {
                    i2 = 0;
                } else {
                    if (d3 != 1) {
                        throw new J2.r();
                    }
                    i2 = 1;
                }
                c1387i.t(i2, 11);
                c1387i.t(oVar.f4576m, 12);
                c1387i.t(oVar.f4577n, 13);
                c1387i.t(oVar.f4578o, 14);
                c1387i.t(oVar.f4579p, 15);
                c1387i.t(oVar.q ? 1L : 0L, 16);
                int i5 = oVar.f4580r;
                AbstractC1265x.f("policy", i5);
                int d4 = AbstractC0837j.d(i5);
                if (d4 == 0) {
                    i3 = 0;
                } else if (d4 != 1) {
                    throw new J2.r();
                }
                c1387i.t(i3, 17);
                c1387i.t(oVar.f4581s, 18);
                c1387i.t(oVar.f4582t, 19);
                c1387i.t(oVar.f4583u, 20);
                c1387i.t(oVar.f4584v, 21);
                c1387i.t(oVar.f4585w, 22);
                C0014d c0014d = oVar.f4573j;
                if (c0014d != null) {
                    c1387i.t(f.K(c0014d.f275a), 23);
                    c1387i.t(c0014d.f276b ? 1L : 0L, 24);
                    c1387i.t(c0014d.f277c ? 1L : 0L, 25);
                    c1387i.t(c0014d.f278d ? 1L : 0L, 26);
                    c1387i.t(c0014d.f279e ? 1L : 0L, 27);
                    c1387i.t(c0014d.f280f, 28);
                    c1387i.t(c0014d.f281g, 29);
                    c1387i.m(30, f.O(c0014d.f282h));
                    return;
                }
                c1387i.n(23);
                c1387i.n(24);
                c1387i.n(25);
                c1387i.n(26);
                c1387i.n(27);
                c1387i.n(28);
                c1387i.n(29);
                c1387i.n(30);
                return;
            case AbstractC1166e.f10136d /* 6 */:
                r rVar = (r) obj;
                String str10 = rVar.f4601a;
                if (str10 == null) {
                    c1387i.n(1);
                } else {
                    c1387i.p(str10, 1);
                }
                String str11 = rVar.f4602b;
                if (str11 == null) {
                    c1387i.n(2);
                    return;
                } else {
                    c1387i.p(str11, 2);
                    return;
                }
            case 7:
                R1.b bVar = (R1.b) obj;
                c1387i.p(bVar.f5475a, 1);
                c1387i.p(bVar.f5476b, 2);
                c1387i.p(bVar.f5477c, 3);
                c1387i.p(bVar.f5478d, 4);
                c1387i.t(bVar.f5479e ? 1L : 0L, 5);
                c1387i.t(bVar.f5480f, 6);
                c1387i.t(bVar.f5481g ? 1L : 0L, 7);
                c1387i.p(bVar.f5482h, 8);
                return;
            case 8:
                R1.a aVar2 = (R1.a) obj;
                c1387i.t(aVar2.f5466a, 1);
                c1387i.p(aVar2.f5467b, 2);
                c1387i.p(aVar2.f5468c, 3);
                c1387i.t(aVar2.f5469d ? 1L : 0L, 4);
                c1387i.t(aVar2.f5470e, 5);
                c1387i.t(aVar2.f5471f, 6);
                c1387i.t(aVar2.f5472g ? 1L : 0L, 7);
                c1387i.t(aVar2.f5473h ? 1L : 0L, 8);
                c1387i.p(aVar2.f5474i, 9);
                return;
            default:
                R1.e eVar = (R1.e) obj;
                c1387i.p(eVar.f5490a, 1);
                c1387i.p(eVar.f5491b, 2);
                c1387i.p(eVar.f5492c, 3);
                c1387i.p(eVar.f5493d, 4);
                c1387i.t(eVar.f5494e ? 1L : 0L, 5);
                c1387i.t(eVar.f5495f, 6);
                return;
        }
    }
}
