package androidx.work.impl.workers;

import B1.C0014d;
import B1.p;
import C1.w;
import K1.f;
import K1.i;
import K1.l;
import K1.o;
import K1.q;
import K1.s;
import O1.b;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import n2.AbstractC0946A;
import n2.AbstractC0962n;
import r1.r;
import r1.v;
import z2.h;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.f(context, "context");
        h.f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final p f() {
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
        i iVar;
        l lVar;
        s sVar;
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
        w o02 = w.o0(this.f301h);
        WorkDatabase workDatabase = o02.f690h;
        h.e(workDatabase, "workManager.workDatabase");
        q v3 = workDatabase.v();
        l t3 = workDatabase.t();
        s w2 = workDatabase.w();
        i s3 = workDatabase.s();
        o02.f689g.f262c.getClass();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        v3.getClass();
        v a3 = v.a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        a3.t(currentTimeMillis, 1);
        r rVar = v3.f4587a;
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
            ArrayList e3 = v3.e();
            ArrayList b3 = v3.b();
            if (!arrayList.isEmpty()) {
                B1.s d3 = B1.s.d();
                String str = b.f5158a;
                d3.e(str, "Recently completed work:\n\n");
                iVar = s3;
                lVar = t3;
                sVar = w2;
                B1.s.d().e(str, b.a(lVar, sVar, iVar, arrayList));
            } else {
                iVar = s3;
                lVar = t3;
                sVar = w2;
            }
            if (!e3.isEmpty()) {
                B1.s d4 = B1.s.d();
                String str2 = b.f5158a;
                d4.e(str2, "Running work:\n\n");
                B1.s.d().e(str2, b.a(lVar, sVar, iVar, e3));
            }
            if (!b3.isEmpty()) {
                B1.s d5 = B1.s.d();
                String str3 = b.f5158a;
                d5.e(str3, "Enqueued work:\n\n");
                B1.s.d().e(str3, b.a(lVar, sVar, iVar, b3));
            }
            return B1.q.a();
        } catch (Throwable th2) {
            th = th2;
            p3.close();
            vVar.c();
            throw th;
        }
    }
}
