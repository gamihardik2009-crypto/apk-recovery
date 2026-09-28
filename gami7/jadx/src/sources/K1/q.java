package K1;

import B1.C0014d;
import android.database.Cursor;
import java.util.ArrayList;
import n2.AbstractC0946A;
import n2.AbstractC0962n;
import r1.v;
import w1.C1387i;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final r1.r f4587a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4588b;

    /* renamed from: c, reason: collision with root package name */
    public final h f4589c;

    /* renamed from: d, reason: collision with root package name */
    public final h f4590d;

    /* renamed from: e, reason: collision with root package name */
    public final h f4591e;

    /* renamed from: f, reason: collision with root package name */
    public final h f4592f;

    /* renamed from: g, reason: collision with root package name */
    public final h f4593g;

    /* renamed from: h, reason: collision with root package name */
    public final h f4594h;

    /* renamed from: i, reason: collision with root package name */
    public final h f4595i;

    /* renamed from: j, reason: collision with root package name */
    public final h f4596j;

    /* renamed from: k, reason: collision with root package name */
    public final h f4597k;

    /* renamed from: l, reason: collision with root package name */
    public final h f4598l;

    /* renamed from: m, reason: collision with root package name */
    public final h f4599m;

    /* renamed from: n, reason: collision with root package name */
    public final h f4600n;

    public q(r1.r rVar) {
        this.f4587a = rVar;
        this.f4588b = new b(rVar, 5);
        new p(rVar, 0);
        this.f4589c = new h(rVar, 12);
        this.f4590d = new h(rVar, 13);
        this.f4591e = new h(rVar, 14);
        this.f4592f = new h(rVar, 15);
        this.f4593g = new h(rVar, 16);
        this.f4594h = new h(rVar, 17);
        this.f4595i = new h(rVar, 18);
        this.f4596j = new h(rVar, 4);
        new h(rVar, 5);
        this.f4597k = new h(rVar, 6);
        this.f4598l = new h(rVar, 7);
        this.f4599m = new h(rVar, 8);
        new h(rVar, 9);
        new h(rVar, 10);
        this.f4600n = new h(rVar, 11);
    }

    public final void a(String str) {
        r1.r rVar = this.f4587a;
        rVar.b();
        h hVar = this.f4589c;
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

    public final ArrayList b() {
        v vVar;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        v a3 = v.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        a3.t(200, 1);
        r1.r rVar = this.f4587a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            int j3 = AbstractC0962n.j(p3, "id");
            int j4 = AbstractC0962n.j(p3, "state");
            int j5 = AbstractC0962n.j(p3, "worker_class_name");
            int j6 = AbstractC0962n.j(p3, "input_merger_class_name");
            int j7 = AbstractC0962n.j(p3, "input");
            int j8 = AbstractC0962n.j(p3, "output");
            int j9 = AbstractC0962n.j(p3, "initial_delay");
            int j10 = AbstractC0962n.j(p3, "interval_duration");
            int j11 = AbstractC0962n.j(p3, "flex_duration");
            int j12 = AbstractC0962n.j(p3, "run_attempt_count");
            int j13 = AbstractC0962n.j(p3, "backoff_policy");
            int j14 = AbstractC0962n.j(p3, "backoff_delay_duration");
            int j15 = AbstractC0962n.j(p3, "last_enqueue_time");
            int j16 = AbstractC0962n.j(p3, "minimum_retention_duration");
            vVar = a3;
            try {
                int j17 = AbstractC0962n.j(p3, "schedule_requested_at");
                int j18 = AbstractC0962n.j(p3, "run_in_foreground");
                int j19 = AbstractC0962n.j(p3, "out_of_quota_policy");
                int j20 = AbstractC0962n.j(p3, "period_count");
                int j21 = AbstractC0962n.j(p3, "generation");
                int j22 = AbstractC0962n.j(p3, "next_schedule_time_override");
                int j23 = AbstractC0962n.j(p3, "next_schedule_time_override_generation");
                int j24 = AbstractC0962n.j(p3, "stop_reason");
                int j25 = AbstractC0962n.j(p3, "required_network_type");
                int j26 = AbstractC0962n.j(p3, "requires_charging");
                int j27 = AbstractC0962n.j(p3, "requires_device_idle");
                int j28 = AbstractC0962n.j(p3, "requires_battery_not_low");
                int j29 = AbstractC0962n.j(p3, "requires_storage_not_low");
                int j30 = AbstractC0962n.j(p3, "trigger_content_update_delay");
                int j31 = AbstractC0962n.j(p3, "trigger_max_content_delay");
                int j32 = AbstractC0962n.j(p3, "content_uri_triggers");
                int i7 = j16;
                ArrayList arrayList = new ArrayList(p3.getCount());
                while (p3.moveToNext()) {
                    byte[] bArr = null;
                    String string = p3.isNull(j3) ? null : p3.getString(j3);
                    int D3 = f.D(p3.getInt(j4));
                    String string2 = p3.isNull(j5) ? null : p3.getString(j5);
                    String string3 = p3.isNull(j6) ? null : p3.getString(j6);
                    B1.h a4 = B1.h.a(p3.isNull(j7) ? null : p3.getBlob(j7));
                    B1.h a5 = B1.h.a(p3.isNull(j8) ? null : p3.getBlob(j8));
                    long j33 = p3.getLong(j9);
                    long j34 = p3.getLong(j10);
                    long j35 = p3.getLong(j11);
                    int i8 = p3.getInt(j12);
                    int A3 = f.A(p3.getInt(j13));
                    long j36 = p3.getLong(j14);
                    long j37 = p3.getLong(j15);
                    int i9 = i7;
                    long j38 = p3.getLong(i9);
                    int i10 = j3;
                    int i11 = j17;
                    long j39 = p3.getLong(i11);
                    j17 = i11;
                    int i12 = j18;
                    if (p3.getInt(i12) != 0) {
                        j18 = i12;
                        i2 = j19;
                        z3 = true;
                    } else {
                        j18 = i12;
                        i2 = j19;
                        z3 = false;
                    }
                    int C3 = f.C(p3.getInt(i2));
                    j19 = i2;
                    int i13 = j20;
                    int i14 = p3.getInt(i13);
                    j20 = i13;
                    int i15 = j21;
                    int i16 = p3.getInt(i15);
                    j21 = i15;
                    int i17 = j22;
                    long j40 = p3.getLong(i17);
                    j22 = i17;
                    int i18 = j23;
                    int i19 = p3.getInt(i18);
                    j23 = i18;
                    int i20 = j24;
                    int i21 = p3.getInt(i20);
                    j24 = i20;
                    int i22 = j25;
                    int B3 = f.B(p3.getInt(i22));
                    j25 = i22;
                    int i23 = j26;
                    if (p3.getInt(i23) != 0) {
                        j26 = i23;
                        i3 = j27;
                        z4 = true;
                    } else {
                        j26 = i23;
                        i3 = j27;
                        z4 = false;
                    }
                    if (p3.getInt(i3) != 0) {
                        j27 = i3;
                        i4 = j28;
                        z5 = true;
                    } else {
                        j27 = i3;
                        i4 = j28;
                        z5 = false;
                    }
                    if (p3.getInt(i4) != 0) {
                        j28 = i4;
                        i5 = j29;
                        z6 = true;
                    } else {
                        j28 = i4;
                        i5 = j29;
                        z6 = false;
                    }
                    if (p3.getInt(i5) != 0) {
                        j29 = i5;
                        i6 = j30;
                        z7 = true;
                    } else {
                        j29 = i5;
                        i6 = j30;
                        z7 = false;
                    }
                    long j41 = p3.getLong(i6);
                    j30 = i6;
                    int i24 = j31;
                    long j42 = p3.getLong(i24);
                    j31 = i24;
                    int i25 = j32;
                    if (!p3.isNull(i25)) {
                        bArr = p3.getBlob(i25);
                    }
                    j32 = i25;
                    arrayList.add(new o(string, D3, string2, string3, a4, a5, j33, j34, j35, new C0014d(B3, z4, z5, z6, z7, j41, j42, f.n(bArr)), i8, A3, j36, j37, j38, j39, z3, C3, i14, i16, j40, i19, i21));
                    j3 = i10;
                    i7 = i9;
                }
                p3.close();
                vVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                p3.close();
                vVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = a3;
        }
    }

    public final ArrayList c(int i2) {
        v vVar;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        v a3 = v.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        a3.t(i2, 1);
        r1.r rVar = this.f4587a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            int j3 = AbstractC0962n.j(p3, "id");
            int j4 = AbstractC0962n.j(p3, "state");
            int j5 = AbstractC0962n.j(p3, "worker_class_name");
            int j6 = AbstractC0962n.j(p3, "input_merger_class_name");
            int j7 = AbstractC0962n.j(p3, "input");
            int j8 = AbstractC0962n.j(p3, "output");
            int j9 = AbstractC0962n.j(p3, "initial_delay");
            int j10 = AbstractC0962n.j(p3, "interval_duration");
            int j11 = AbstractC0962n.j(p3, "flex_duration");
            int j12 = AbstractC0962n.j(p3, "run_attempt_count");
            int j13 = AbstractC0962n.j(p3, "backoff_policy");
            int j14 = AbstractC0962n.j(p3, "backoff_delay_duration");
            int j15 = AbstractC0962n.j(p3, "last_enqueue_time");
            int j16 = AbstractC0962n.j(p3, "minimum_retention_duration");
            vVar = a3;
            try {
                int j17 = AbstractC0962n.j(p3, "schedule_requested_at");
                int j18 = AbstractC0962n.j(p3, "run_in_foreground");
                int j19 = AbstractC0962n.j(p3, "out_of_quota_policy");
                int j20 = AbstractC0962n.j(p3, "period_count");
                int j21 = AbstractC0962n.j(p3, "generation");
                int j22 = AbstractC0962n.j(p3, "next_schedule_time_override");
                int j23 = AbstractC0962n.j(p3, "next_schedule_time_override_generation");
                int j24 = AbstractC0962n.j(p3, "stop_reason");
                int j25 = AbstractC0962n.j(p3, "required_network_type");
                int j26 = AbstractC0962n.j(p3, "requires_charging");
                int j27 = AbstractC0962n.j(p3, "requires_device_idle");
                int j28 = AbstractC0962n.j(p3, "requires_battery_not_low");
                int j29 = AbstractC0962n.j(p3, "requires_storage_not_low");
                int j30 = AbstractC0962n.j(p3, "trigger_content_update_delay");
                int j31 = AbstractC0962n.j(p3, "trigger_max_content_delay");
                int j32 = AbstractC0962n.j(p3, "content_uri_triggers");
                int i8 = j16;
                ArrayList arrayList = new ArrayList(p3.getCount());
                while (p3.moveToNext()) {
                    byte[] bArr = null;
                    String string = p3.isNull(j3) ? null : p3.getString(j3);
                    int D3 = f.D(p3.getInt(j4));
                    String string2 = p3.isNull(j5) ? null : p3.getString(j5);
                    String string3 = p3.isNull(j6) ? null : p3.getString(j6);
                    B1.h a4 = B1.h.a(p3.isNull(j7) ? null : p3.getBlob(j7));
                    B1.h a5 = B1.h.a(p3.isNull(j8) ? null : p3.getBlob(j8));
                    long j33 = p3.getLong(j9);
                    long j34 = p3.getLong(j10);
                    long j35 = p3.getLong(j11);
                    int i9 = p3.getInt(j12);
                    int A3 = f.A(p3.getInt(j13));
                    long j36 = p3.getLong(j14);
                    long j37 = p3.getLong(j15);
                    int i10 = i8;
                    long j38 = p3.getLong(i10);
                    int i11 = j3;
                    int i12 = j17;
                    long j39 = p3.getLong(i12);
                    j17 = i12;
                    int i13 = j18;
                    if (p3.getInt(i13) != 0) {
                        j18 = i13;
                        i3 = j19;
                        z3 = true;
                    } else {
                        j18 = i13;
                        i3 = j19;
                        z3 = false;
                    }
                    int C3 = f.C(p3.getInt(i3));
                    j19 = i3;
                    int i14 = j20;
                    int i15 = p3.getInt(i14);
                    j20 = i14;
                    int i16 = j21;
                    int i17 = p3.getInt(i16);
                    j21 = i16;
                    int i18 = j22;
                    long j40 = p3.getLong(i18);
                    j22 = i18;
                    int i19 = j23;
                    int i20 = p3.getInt(i19);
                    j23 = i19;
                    int i21 = j24;
                    int i22 = p3.getInt(i21);
                    j24 = i21;
                    int i23 = j25;
                    int B3 = f.B(p3.getInt(i23));
                    j25 = i23;
                    int i24 = j26;
                    if (p3.getInt(i24) != 0) {
                        j26 = i24;
                        i4 = j27;
                        z4 = true;
                    } else {
                        j26 = i24;
                        i4 = j27;
                        z4 = false;
                    }
                    if (p3.getInt(i4) != 0) {
                        j27 = i4;
                        i5 = j28;
                        z5 = true;
                    } else {
                        j27 = i4;
                        i5 = j28;
                        z5 = false;
                    }
                    if (p3.getInt(i5) != 0) {
                        j28 = i5;
                        i6 = j29;
                        z6 = true;
                    } else {
                        j28 = i5;
                        i6 = j29;
                        z6 = false;
                    }
                    if (p3.getInt(i6) != 0) {
                        j29 = i6;
                        i7 = j30;
                        z7 = true;
                    } else {
                        j29 = i6;
                        i7 = j30;
                        z7 = false;
                    }
                    long j41 = p3.getLong(i7);
                    j30 = i7;
                    int i25 = j31;
                    long j42 = p3.getLong(i25);
                    j31 = i25;
                    int i26 = j32;
                    if (!p3.isNull(i26)) {
                        bArr = p3.getBlob(i26);
                    }
                    j32 = i26;
                    arrayList.add(new o(string, D3, string2, string3, a4, a5, j33, j34, j35, new C0014d(B3, z4, z5, z6, z7, j41, j42, f.n(bArr)), i9, A3, j36, j37, j38, j39, z3, C3, i15, i17, j40, i20, i22));
                    j3 = i11;
                    i8 = i10;
                }
                p3.close();
                vVar.c();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                p3.close();
                vVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = a3;
        }
    }

    public final ArrayList d() {
        v vVar;
        int j3;
        int j4;
        int j5;
        int j6;
        int j7;
        int j8;
        int j9;
        int j10;
        int j11;
        int j12;
        int j13;
        int j14;
        int j15;
        int j16;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        v a3 = v.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        r1.r rVar = this.f4587a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            j3 = AbstractC0962n.j(p3, "id");
            j4 = AbstractC0962n.j(p3, "state");
            j5 = AbstractC0962n.j(p3, "worker_class_name");
            j6 = AbstractC0962n.j(p3, "input_merger_class_name");
            j7 = AbstractC0962n.j(p3, "input");
            j8 = AbstractC0962n.j(p3, "output");
            j9 = AbstractC0962n.j(p3, "initial_delay");
            j10 = AbstractC0962n.j(p3, "interval_duration");
            j11 = AbstractC0962n.j(p3, "flex_duration");
            j12 = AbstractC0962n.j(p3, "run_attempt_count");
            j13 = AbstractC0962n.j(p3, "backoff_policy");
            j14 = AbstractC0962n.j(p3, "backoff_delay_duration");
            j15 = AbstractC0962n.j(p3, "last_enqueue_time");
            j16 = AbstractC0962n.j(p3, "minimum_retention_duration");
            vVar = a3;
        } catch (Throwable th) {
            th = th;
            vVar = a3;
        }
        try {
            int j17 = AbstractC0962n.j(p3, "schedule_requested_at");
            int j18 = AbstractC0962n.j(p3, "run_in_foreground");
            int j19 = AbstractC0962n.j(p3, "out_of_quota_policy");
            int j20 = AbstractC0962n.j(p3, "period_count");
            int j21 = AbstractC0962n.j(p3, "generation");
            int j22 = AbstractC0962n.j(p3, "next_schedule_time_override");
            int j23 = AbstractC0962n.j(p3, "next_schedule_time_override_generation");
            int j24 = AbstractC0962n.j(p3, "stop_reason");
            int j25 = AbstractC0962n.j(p3, "required_network_type");
            int j26 = AbstractC0962n.j(p3, "requires_charging");
            int j27 = AbstractC0962n.j(p3, "requires_device_idle");
            int j28 = AbstractC0962n.j(p3, "requires_battery_not_low");
            int j29 = AbstractC0962n.j(p3, "requires_storage_not_low");
            int j30 = AbstractC0962n.j(p3, "trigger_content_update_delay");
            int j31 = AbstractC0962n.j(p3, "trigger_max_content_delay");
            int j32 = AbstractC0962n.j(p3, "content_uri_triggers");
            int i7 = j16;
            ArrayList arrayList = new ArrayList(p3.getCount());
            while (p3.moveToNext()) {
                byte[] bArr = null;
                String string = p3.isNull(j3) ? null : p3.getString(j3);
                int D3 = f.D(p3.getInt(j4));
                String string2 = p3.isNull(j5) ? null : p3.getString(j5);
                String string3 = p3.isNull(j6) ? null : p3.getString(j6);
                B1.h a4 = B1.h.a(p3.isNull(j7) ? null : p3.getBlob(j7));
                B1.h a5 = B1.h.a(p3.isNull(j8) ? null : p3.getBlob(j8));
                long j33 = p3.getLong(j9);
                long j34 = p3.getLong(j10);
                long j35 = p3.getLong(j11);
                int i8 = p3.getInt(j12);
                int A3 = f.A(p3.getInt(j13));
                long j36 = p3.getLong(j14);
                long j37 = p3.getLong(j15);
                int i9 = i7;
                long j38 = p3.getLong(i9);
                int i10 = j3;
                int i11 = j17;
                long j39 = p3.getLong(i11);
                j17 = i11;
                int i12 = j18;
                if (p3.getInt(i12) != 0) {
                    j18 = i12;
                    i2 = j19;
                    z3 = true;
                } else {
                    j18 = i12;
                    i2 = j19;
                    z3 = false;
                }
                int C3 = f.C(p3.getInt(i2));
                j19 = i2;
                int i13 = j20;
                int i14 = p3.getInt(i13);
                j20 = i13;
                int i15 = j21;
                int i16 = p3.getInt(i15);
                j21 = i15;
                int i17 = j22;
                long j40 = p3.getLong(i17);
                j22 = i17;
                int i18 = j23;
                int i19 = p3.getInt(i18);
                j23 = i18;
                int i20 = j24;
                int i21 = p3.getInt(i20);
                j24 = i20;
                int i22 = j25;
                int B3 = f.B(p3.getInt(i22));
                j25 = i22;
                int i23 = j26;
                if (p3.getInt(i23) != 0) {
                    j26 = i23;
                    i3 = j27;
                    z4 = true;
                } else {
                    j26 = i23;
                    i3 = j27;
                    z4 = false;
                }
                if (p3.getInt(i3) != 0) {
                    j27 = i3;
                    i4 = j28;
                    z5 = true;
                } else {
                    j27 = i3;
                    i4 = j28;
                    z5 = false;
                }
                if (p3.getInt(i4) != 0) {
                    j28 = i4;
                    i5 = j29;
                    z6 = true;
                } else {
                    j28 = i4;
                    i5 = j29;
                    z6 = false;
                }
                if (p3.getInt(i5) != 0) {
                    j29 = i5;
                    i6 = j30;
                    z7 = true;
                } else {
                    j29 = i5;
                    i6 = j30;
                    z7 = false;
                }
                long j41 = p3.getLong(i6);
                j30 = i6;
                int i24 = j31;
                long j42 = p3.getLong(i24);
                j31 = i24;
                int i25 = j32;
                if (!p3.isNull(i25)) {
                    bArr = p3.getBlob(i25);
                }
                j32 = i25;
                arrayList.add(new o(string, D3, string2, string3, a4, a5, j33, j34, j35, new C0014d(B3, z4, z5, z6, z7, j41, j42, f.n(bArr)), i8, A3, j36, j37, j38, j39, z3, C3, i14, i16, j40, i19, i21));
                j3 = i10;
                i7 = i9;
            }
            p3.close();
            vVar.c();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            p3.close();
            vVar.c();
            throw th;
        }
    }

    public final ArrayList e() {
        v vVar;
        int j3;
        int j4;
        int j5;
        int j6;
        int j7;
        int j8;
        int j9;
        int j10;
        int j11;
        int j12;
        int j13;
        int j14;
        int j15;
        int j16;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        v a3 = v.a("SELECT * FROM workspec WHERE state=1", 0);
        r1.r rVar = this.f4587a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            j3 = AbstractC0962n.j(p3, "id");
            j4 = AbstractC0962n.j(p3, "state");
            j5 = AbstractC0962n.j(p3, "worker_class_name");
            j6 = AbstractC0962n.j(p3, "input_merger_class_name");
            j7 = AbstractC0962n.j(p3, "input");
            j8 = AbstractC0962n.j(p3, "output");
            j9 = AbstractC0962n.j(p3, "initial_delay");
            j10 = AbstractC0962n.j(p3, "interval_duration");
            j11 = AbstractC0962n.j(p3, "flex_duration");
            j12 = AbstractC0962n.j(p3, "run_attempt_count");
            j13 = AbstractC0962n.j(p3, "backoff_policy");
            j14 = AbstractC0962n.j(p3, "backoff_delay_duration");
            j15 = AbstractC0962n.j(p3, "last_enqueue_time");
            j16 = AbstractC0962n.j(p3, "minimum_retention_duration");
            vVar = a3;
        } catch (Throwable th) {
            th = th;
            vVar = a3;
        }
        try {
            int j17 = AbstractC0962n.j(p3, "schedule_requested_at");
            int j18 = AbstractC0962n.j(p3, "run_in_foreground");
            int j19 = AbstractC0962n.j(p3, "out_of_quota_policy");
            int j20 = AbstractC0962n.j(p3, "period_count");
            int j21 = AbstractC0962n.j(p3, "generation");
            int j22 = AbstractC0962n.j(p3, "next_schedule_time_override");
            int j23 = AbstractC0962n.j(p3, "next_schedule_time_override_generation");
            int j24 = AbstractC0962n.j(p3, "stop_reason");
            int j25 = AbstractC0962n.j(p3, "required_network_type");
            int j26 = AbstractC0962n.j(p3, "requires_charging");
            int j27 = AbstractC0962n.j(p3, "requires_device_idle");
            int j28 = AbstractC0962n.j(p3, "requires_battery_not_low");
            int j29 = AbstractC0962n.j(p3, "requires_storage_not_low");
            int j30 = AbstractC0962n.j(p3, "trigger_content_update_delay");
            int j31 = AbstractC0962n.j(p3, "trigger_max_content_delay");
            int j32 = AbstractC0962n.j(p3, "content_uri_triggers");
            int i7 = j16;
            ArrayList arrayList = new ArrayList(p3.getCount());
            while (p3.moveToNext()) {
                byte[] bArr = null;
                String string = p3.isNull(j3) ? null : p3.getString(j3);
                int D3 = f.D(p3.getInt(j4));
                String string2 = p3.isNull(j5) ? null : p3.getString(j5);
                String string3 = p3.isNull(j6) ? null : p3.getString(j6);
                B1.h a4 = B1.h.a(p3.isNull(j7) ? null : p3.getBlob(j7));
                B1.h a5 = B1.h.a(p3.isNull(j8) ? null : p3.getBlob(j8));
                long j33 = p3.getLong(j9);
                long j34 = p3.getLong(j10);
                long j35 = p3.getLong(j11);
                int i8 = p3.getInt(j12);
                int A3 = f.A(p3.getInt(j13));
                long j36 = p3.getLong(j14);
                long j37 = p3.getLong(j15);
                int i9 = i7;
                long j38 = p3.getLong(i9);
                int i10 = j3;
                int i11 = j17;
                long j39 = p3.getLong(i11);
                j17 = i11;
                int i12 = j18;
                if (p3.getInt(i12) != 0) {
                    j18 = i12;
                    i2 = j19;
                    z3 = true;
                } else {
                    j18 = i12;
                    i2 = j19;
                    z3 = false;
                }
                int C3 = f.C(p3.getInt(i2));
                j19 = i2;
                int i13 = j20;
                int i14 = p3.getInt(i13);
                j20 = i13;
                int i15 = j21;
                int i16 = p3.getInt(i15);
                j21 = i15;
                int i17 = j22;
                long j40 = p3.getLong(i17);
                j22 = i17;
                int i18 = j23;
                int i19 = p3.getInt(i18);
                j23 = i18;
                int i20 = j24;
                int i21 = p3.getInt(i20);
                j24 = i20;
                int i22 = j25;
                int B3 = f.B(p3.getInt(i22));
                j25 = i22;
                int i23 = j26;
                if (p3.getInt(i23) != 0) {
                    j26 = i23;
                    i3 = j27;
                    z4 = true;
                } else {
                    j26 = i23;
                    i3 = j27;
                    z4 = false;
                }
                if (p3.getInt(i3) != 0) {
                    j27 = i3;
                    i4 = j28;
                    z5 = true;
                } else {
                    j27 = i3;
                    i4 = j28;
                    z5 = false;
                }
                if (p3.getInt(i4) != 0) {
                    j28 = i4;
                    i5 = j29;
                    z6 = true;
                } else {
                    j28 = i4;
                    i5 = j29;
                    z6 = false;
                }
                if (p3.getInt(i5) != 0) {
                    j29 = i5;
                    i6 = j30;
                    z7 = true;
                } else {
                    j29 = i5;
                    i6 = j30;
                    z7 = false;
                }
                long j41 = p3.getLong(i6);
                j30 = i6;
                int i24 = j31;
                long j42 = p3.getLong(i24);
                j31 = i24;
                int i25 = j32;
                if (!p3.isNull(i25)) {
                    bArr = p3.getBlob(i25);
                }
                j32 = i25;
                arrayList.add(new o(string, D3, string2, string3, a4, a5, j33, j34, j35, new C0014d(B3, z4, z5, z6, z7, j41, j42, f.n(bArr)), i8, A3, j36, j37, j38, j39, z3, C3, i14, i16, j40, i19, i21));
                j3 = i10;
                i7 = i9;
            }
            p3.close();
            vVar.c();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            p3.close();
            vVar.c();
            throw th;
        }
    }

    public final ArrayList f() {
        v vVar;
        int j3;
        int j4;
        int j5;
        int j6;
        int j7;
        int j8;
        int j9;
        int j10;
        int j11;
        int j12;
        int j13;
        int j14;
        int j15;
        int j16;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        v a3 = v.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        r1.r rVar = this.f4587a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            j3 = AbstractC0962n.j(p3, "id");
            j4 = AbstractC0962n.j(p3, "state");
            j5 = AbstractC0962n.j(p3, "worker_class_name");
            j6 = AbstractC0962n.j(p3, "input_merger_class_name");
            j7 = AbstractC0962n.j(p3, "input");
            j8 = AbstractC0962n.j(p3, "output");
            j9 = AbstractC0962n.j(p3, "initial_delay");
            j10 = AbstractC0962n.j(p3, "interval_duration");
            j11 = AbstractC0962n.j(p3, "flex_duration");
            j12 = AbstractC0962n.j(p3, "run_attempt_count");
            j13 = AbstractC0962n.j(p3, "backoff_policy");
            j14 = AbstractC0962n.j(p3, "backoff_delay_duration");
            j15 = AbstractC0962n.j(p3, "last_enqueue_time");
            j16 = AbstractC0962n.j(p3, "minimum_retention_duration");
            vVar = a3;
        } catch (Throwable th) {
            th = th;
            vVar = a3;
        }
        try {
            int j17 = AbstractC0962n.j(p3, "schedule_requested_at");
            int j18 = AbstractC0962n.j(p3, "run_in_foreground");
            int j19 = AbstractC0962n.j(p3, "out_of_quota_policy");
            int j20 = AbstractC0962n.j(p3, "period_count");
            int j21 = AbstractC0962n.j(p3, "generation");
            int j22 = AbstractC0962n.j(p3, "next_schedule_time_override");
            int j23 = AbstractC0962n.j(p3, "next_schedule_time_override_generation");
            int j24 = AbstractC0962n.j(p3, "stop_reason");
            int j25 = AbstractC0962n.j(p3, "required_network_type");
            int j26 = AbstractC0962n.j(p3, "requires_charging");
            int j27 = AbstractC0962n.j(p3, "requires_device_idle");
            int j28 = AbstractC0962n.j(p3, "requires_battery_not_low");
            int j29 = AbstractC0962n.j(p3, "requires_storage_not_low");
            int j30 = AbstractC0962n.j(p3, "trigger_content_update_delay");
            int j31 = AbstractC0962n.j(p3, "trigger_max_content_delay");
            int j32 = AbstractC0962n.j(p3, "content_uri_triggers");
            int i7 = j16;
            ArrayList arrayList = new ArrayList(p3.getCount());
            while (p3.moveToNext()) {
                byte[] bArr = null;
                String string = p3.isNull(j3) ? null : p3.getString(j3);
                int D3 = f.D(p3.getInt(j4));
                String string2 = p3.isNull(j5) ? null : p3.getString(j5);
                String string3 = p3.isNull(j6) ? null : p3.getString(j6);
                B1.h a4 = B1.h.a(p3.isNull(j7) ? null : p3.getBlob(j7));
                B1.h a5 = B1.h.a(p3.isNull(j8) ? null : p3.getBlob(j8));
                long j33 = p3.getLong(j9);
                long j34 = p3.getLong(j10);
                long j35 = p3.getLong(j11);
                int i8 = p3.getInt(j12);
                int A3 = f.A(p3.getInt(j13));
                long j36 = p3.getLong(j14);
                long j37 = p3.getLong(j15);
                int i9 = i7;
                long j38 = p3.getLong(i9);
                int i10 = j3;
                int i11 = j17;
                long j39 = p3.getLong(i11);
                j17 = i11;
                int i12 = j18;
                if (p3.getInt(i12) != 0) {
                    j18 = i12;
                    i2 = j19;
                    z3 = true;
                } else {
                    j18 = i12;
                    i2 = j19;
                    z3 = false;
                }
                int C3 = f.C(p3.getInt(i2));
                j19 = i2;
                int i13 = j20;
                int i14 = p3.getInt(i13);
                j20 = i13;
                int i15 = j21;
                int i16 = p3.getInt(i15);
                j21 = i15;
                int i17 = j22;
                long j40 = p3.getLong(i17);
                j22 = i17;
                int i18 = j23;
                int i19 = p3.getInt(i18);
                j23 = i18;
                int i20 = j24;
                int i21 = p3.getInt(i20);
                j24 = i20;
                int i22 = j25;
                int B3 = f.B(p3.getInt(i22));
                j25 = i22;
                int i23 = j26;
                if (p3.getInt(i23) != 0) {
                    j26 = i23;
                    i3 = j27;
                    z4 = true;
                } else {
                    j26 = i23;
                    i3 = j27;
                    z4 = false;
                }
                if (p3.getInt(i3) != 0) {
                    j27 = i3;
                    i4 = j28;
                    z5 = true;
                } else {
                    j27 = i3;
                    i4 = j28;
                    z5 = false;
                }
                if (p3.getInt(i4) != 0) {
                    j28 = i4;
                    i5 = j29;
                    z6 = true;
                } else {
                    j28 = i4;
                    i5 = j29;
                    z6 = false;
                }
                if (p3.getInt(i5) != 0) {
                    j29 = i5;
                    i6 = j30;
                    z7 = true;
                } else {
                    j29 = i5;
                    i6 = j30;
                    z7 = false;
                }
                long j41 = p3.getLong(i6);
                j30 = i6;
                int i24 = j31;
                long j42 = p3.getLong(i24);
                j31 = i24;
                int i25 = j32;
                if (!p3.isNull(i25)) {
                    bArr = p3.getBlob(i25);
                }
                j32 = i25;
                arrayList.add(new o(string, D3, string2, string3, a4, a5, j33, j34, j35, new C0014d(B3, z4, z5, z6, z7, j41, j42, f.n(bArr)), i8, A3, j36, j37, j38, j39, z3, C3, i14, i16, j40, i19, i21));
                j3 = i10;
                i7 = i9;
            }
            p3.close();
            vVar.c();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            p3.close();
            vVar.c();
            throw th;
        }
    }

    public final int g(String str) {
        v a3 = v.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        r1.r rVar = this.f4587a;
        rVar.b();
        int i2 = 0;
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            if (p3.moveToFirst()) {
                Integer valueOf = p3.isNull(0) ? null : Integer.valueOf(p3.getInt(0));
                if (valueOf != null) {
                    i2 = f.D(valueOf.intValue());
                }
            }
            return i2;
        } finally {
            p3.close();
            a3.c();
        }
    }

    public final ArrayList h(String str) {
        v a3 = v.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        r1.r rVar = this.f4587a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            ArrayList arrayList = new ArrayList(p3.getCount());
            while (p3.moveToNext()) {
                arrayList.add(p3.isNull(0) ? null : p3.getString(0));
            }
            return arrayList;
        } finally {
            p3.close();
            a3.c();
        }
    }

    public final o i(String str) {
        v vVar;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        v a3 = v.a("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        r1.r rVar = this.f4587a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            int j3 = AbstractC0962n.j(p3, "id");
            int j4 = AbstractC0962n.j(p3, "state");
            int j5 = AbstractC0962n.j(p3, "worker_class_name");
            int j6 = AbstractC0962n.j(p3, "input_merger_class_name");
            int j7 = AbstractC0962n.j(p3, "input");
            int j8 = AbstractC0962n.j(p3, "output");
            int j9 = AbstractC0962n.j(p3, "initial_delay");
            int j10 = AbstractC0962n.j(p3, "interval_duration");
            int j11 = AbstractC0962n.j(p3, "flex_duration");
            int j12 = AbstractC0962n.j(p3, "run_attempt_count");
            int j13 = AbstractC0962n.j(p3, "backoff_policy");
            int j14 = AbstractC0962n.j(p3, "backoff_delay_duration");
            int j15 = AbstractC0962n.j(p3, "last_enqueue_time");
            int j16 = AbstractC0962n.j(p3, "minimum_retention_duration");
            vVar = a3;
            try {
                int j17 = AbstractC0962n.j(p3, "schedule_requested_at");
                int j18 = AbstractC0962n.j(p3, "run_in_foreground");
                int j19 = AbstractC0962n.j(p3, "out_of_quota_policy");
                int j20 = AbstractC0962n.j(p3, "period_count");
                int j21 = AbstractC0962n.j(p3, "generation");
                int j22 = AbstractC0962n.j(p3, "next_schedule_time_override");
                int j23 = AbstractC0962n.j(p3, "next_schedule_time_override_generation");
                int j24 = AbstractC0962n.j(p3, "stop_reason");
                int j25 = AbstractC0962n.j(p3, "required_network_type");
                int j26 = AbstractC0962n.j(p3, "requires_charging");
                int j27 = AbstractC0962n.j(p3, "requires_device_idle");
                int j28 = AbstractC0962n.j(p3, "requires_battery_not_low");
                int j29 = AbstractC0962n.j(p3, "requires_storage_not_low");
                int j30 = AbstractC0962n.j(p3, "trigger_content_update_delay");
                int j31 = AbstractC0962n.j(p3, "trigger_max_content_delay");
                int j32 = AbstractC0962n.j(p3, "content_uri_triggers");
                o oVar = null;
                byte[] blob = null;
                if (p3.moveToFirst()) {
                    String string = p3.isNull(j3) ? null : p3.getString(j3);
                    int D3 = f.D(p3.getInt(j4));
                    String string2 = p3.isNull(j5) ? null : p3.getString(j5);
                    String string3 = p3.isNull(j6) ? null : p3.getString(j6);
                    B1.h a4 = B1.h.a(p3.isNull(j7) ? null : p3.getBlob(j7));
                    B1.h a5 = B1.h.a(p3.isNull(j8) ? null : p3.getBlob(j8));
                    long j33 = p3.getLong(j9);
                    long j34 = p3.getLong(j10);
                    long j35 = p3.getLong(j11);
                    int i7 = p3.getInt(j12);
                    int A3 = f.A(p3.getInt(j13));
                    long j36 = p3.getLong(j14);
                    long j37 = p3.getLong(j15);
                    long j38 = p3.getLong(j16);
                    long j39 = p3.getLong(j17);
                    if (p3.getInt(j18) != 0) {
                        i2 = j19;
                        z3 = true;
                    } else {
                        i2 = j19;
                        z3 = false;
                    }
                    int C3 = f.C(p3.getInt(i2));
                    int i8 = p3.getInt(j20);
                    int i9 = p3.getInt(j21);
                    long j40 = p3.getLong(j22);
                    int i10 = p3.getInt(j23);
                    int i11 = p3.getInt(j24);
                    int B3 = f.B(p3.getInt(j25));
                    if (p3.getInt(j26) != 0) {
                        i3 = j27;
                        z4 = true;
                    } else {
                        i3 = j27;
                        z4 = false;
                    }
                    if (p3.getInt(i3) != 0) {
                        i4 = j28;
                        z5 = true;
                    } else {
                        i4 = j28;
                        z5 = false;
                    }
                    if (p3.getInt(i4) != 0) {
                        i5 = j29;
                        z6 = true;
                    } else {
                        i5 = j29;
                        z6 = false;
                    }
                    if (p3.getInt(i5) != 0) {
                        i6 = j30;
                        z7 = true;
                    } else {
                        i6 = j30;
                        z7 = false;
                    }
                    long j41 = p3.getLong(i6);
                    long j42 = p3.getLong(j31);
                    if (!p3.isNull(j32)) {
                        blob = p3.getBlob(j32);
                    }
                    oVar = new o(string, D3, string2, string3, a4, a5, j33, j34, j35, new C0014d(B3, z4, z5, z6, z7, j41, j42, f.n(blob)), i7, A3, j36, j37, j38, j39, z3, C3, i8, i9, j40, i10, i11);
                }
                p3.close();
                vVar.c();
                return oVar;
            } catch (Throwable th) {
                th = th;
                p3.close();
                vVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = a3;
        }
    }

    public final ArrayList j(String str) {
        v a3 = v.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        r1.r rVar = this.f4587a;
        rVar.b();
        Cursor p3 = AbstractC0946A.p(rVar, a3, false);
        try {
            ArrayList arrayList = new ArrayList(p3.getCount());
            while (p3.moveToNext()) {
                String string = p3.isNull(0) ? null : p3.getString(0);
                int D3 = f.D(p3.getInt(1));
                z2.h.f(string, "id");
                n nVar = new n();
                nVar.f4561a = string;
                nVar.f4562b = D3;
                arrayList.add(nVar);
            }
            return arrayList;
        } finally {
            p3.close();
            a3.c();
        }
    }

    public final void k(String str, long j3) {
        r1.r rVar = this.f4587a;
        rVar.b();
        h hVar = this.f4598l;
        C1387i a3 = hVar.a();
        a3.t(j3, 1);
        if (str == null) {
            a3.n(2);
        } else {
            a3.p(str, 2);
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

    public final void l(String str, int i2) {
        r1.r rVar = this.f4587a;
        rVar.b();
        h hVar = this.f4597k;
        C1387i a3 = hVar.a();
        if (str == null) {
            a3.n(1);
        } else {
            a3.p(str, 1);
        }
        a3.t(i2, 2);
        rVar.c();
        try {
            a3.b();
            rVar.o();
        } finally {
            rVar.j();
            hVar.c(a3);
        }
    }

    public final void m(String str, long j3) {
        r1.r rVar = this.f4587a;
        rVar.b();
        h hVar = this.f4594h;
        C1387i a3 = hVar.a();
        a3.t(j3, 1);
        if (str == null) {
            a3.n(2);
        } else {
            a3.p(str, 2);
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

    public final void n(String str, B1.h hVar) {
        r1.r rVar = this.f4587a;
        rVar.b();
        h hVar2 = this.f4593g;
        C1387i a3 = hVar2.a();
        byte[] b3 = B1.h.b(hVar);
        if (b3 == null) {
            a3.n(1);
        } else {
            a3.m(1, b3);
        }
        if (str == null) {
            a3.n(2);
        } else {
            a3.p(str, 2);
        }
        rVar.c();
        try {
            a3.b();
            rVar.o();
        } finally {
            rVar.j();
            hVar2.c(a3);
        }
    }

    public final void o(String str, int i2) {
        r1.r rVar = this.f4587a;
        rVar.b();
        h hVar = this.f4590d;
        C1387i a3 = hVar.a();
        a3.t(f.Q(i2), 1);
        if (str == null) {
            a3.n(2);
        } else {
            a3.p(str, 2);
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

    public final void p(String str, int i2) {
        r1.r rVar = this.f4587a;
        rVar.b();
        h hVar = this.f4600n;
        C1387i a3 = hVar.a();
        a3.t(i2, 1);
        if (str == null) {
            a3.n(2);
        } else {
            a3.p(str, 2);
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
}
