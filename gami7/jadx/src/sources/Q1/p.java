package Q1;

import android.os.CancellationSignal;
import com.example.bulksmsscheduler.data.AppDatabase;
import m2.C0880v;
import n2.AbstractC0949a;
import q2.InterfaceC1073d;
import r1.v;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final AppDatabase f5312a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.h f5313b;

    /* renamed from: c, reason: collision with root package name */
    public final G1.h f5314c;

    /* renamed from: d, reason: collision with root package name */
    public final G1.h f5315d;

    /* renamed from: e, reason: collision with root package name */
    public final G1.h f5316e;

    /* renamed from: f, reason: collision with root package name */
    public final G1.h f5317f;

    public p(AppDatabase appDatabase) {
        z2.h.f(appDatabase, "database");
        this.f5312a = appDatabase;
        e q = appDatabase.q();
        q.getClass();
        a aVar = new a(q, v.a("SELECT * FROM clients ORDER BY orderIndex ASC", 0), 0);
        this.f5313b = AbstractC0949a.i((r1.r) q.f5277a, false, new String[]{"clients"}, aVar);
        r t3 = appDatabase.t();
        t3.getClass();
        d dVar = new d(t3, 3, v.a("SELECT * FROM templates ORDER BY `order` ASC", 0));
        this.f5314c = AbstractC0949a.i((r1.r) t3.f5322b, false, new String[]{"templates"}, dVar);
        k r3 = appDatabase.r();
        r3.getClass();
        h hVar = new h(r3, v.a("SELECT * FROM schedules", 0), 0);
        this.f5315d = AbstractC0949a.i((r1.r) r3.f5292a, false, new String[]{"schedules"}, hVar);
        k r4 = appDatabase.r();
        r4.getClass();
        h hVar2 = new h(r4, v.a("SELECT * FROM schedules", 0), 1);
        AbstractC0949a.i((r1.r) r4.f5292a, true, new String[]{"clients", "schedules"}, hVar2);
        k r5 = appDatabase.r();
        r5.getClass();
        h hVar3 = new h(r5, v.a("\n        SELECT * FROM schedules \n        INNER JOIN clients ON schedules.clientId = clients.id\n        WHERE status IN ('SENT', 'FAILED')\n        ORDER BY scheduledDate DESC, scheduledTime DESC\n        LIMIT 10\n    ", 0), 2);
        this.f5316e = AbstractC0949a.i((r1.r) r5.f5292a, true, new String[]{"clients", "schedules"}, hVar3);
        m s3 = appDatabase.s();
        s3.getClass();
        l lVar = new l(s3, v.a("SELECT * FROM app_settings WHERE id = 0", 0), 0);
        this.f5317f = AbstractC0949a.i((r1.r) s3.f5302a, false, new String[]{"app_settings"}, lVar);
    }

    public final Object a(InterfaceC1073d interfaceC1073d) {
        e q = this.f5312a.q();
        q.getClass();
        v a3 = v.a("SELECT * FROM clients", 0);
        return AbstractC0949a.j((r1.r) q.f5277a, new CancellationSignal(), new a(q, a3, 2), interfaceC1073d);
    }

    public final Object b(InterfaceC1073d interfaceC1073d) {
        e q = this.f5312a.q();
        q.getClass();
        v a3 = v.a("SELECT COUNT(*) FROM clients", 0);
        return AbstractC0949a.j((r1.r) q.f5277a, new CancellationSignal(), new a(q, a3, 4), interfaceC1073d);
    }

    public final G1.h c(String str, R1.c cVar) {
        String name;
        z2.h.f(str, "query");
        k r3 = this.f5312a.r();
        r3.getClass();
        v a3 = v.a("\n        SELECT * FROM schedules \n        INNER JOIN clients ON schedules.clientId = clients.id\n        WHERE (? = '' OR clients.name LIKE '%' || ? || '%' OR clients.phone LIKE '%' || ? || '%')\n        AND (? IS NULL OR schedules.status = ?)\n        ORDER BY scheduledDate ASC, scheduledTime ASC\n    ", 5);
        a3.p(str, 1);
        a3.p(str, 2);
        a3.p(str, 3);
        C1.b bVar = (C1.b) r3.f5294c;
        String str2 = null;
        if (cVar == null) {
            name = null;
        } else {
            bVar.getClass();
            name = cVar.name();
        }
        if (name == null) {
            a3.n(4);
        } else {
            a3.p(name, 4);
        }
        if (cVar != null) {
            bVar.getClass();
            str2 = cVar.name();
        }
        if (str2 == null) {
            a3.n(5);
        } else {
            a3.p(str2, 5);
        }
        return AbstractC0949a.i((r1.r) r3.f5292a, true, new String[]{"clients", "schedules"}, new h(r3, a3, 10));
    }

    public final Object d(String str, InterfaceC1073d interfaceC1073d) {
        k r3 = this.f5312a.r();
        r3.getClass();
        v a3 = v.a("SELECT * FROM schedules WHERE id = ?", 1);
        a3.p(str, 1);
        return AbstractC0949a.j((r1.r) r3.f5292a, new CancellationSignal(), new h(r3, a3, 4), interfaceC1073d);
    }

    public final Object e(R1.e eVar, InterfaceC1073d interfaceC1073d) {
        r t3 = this.f5312a.t();
        t3.getClass();
        Object k3 = AbstractC0949a.k((r1.r) t3.f5322b, new q(t3, eVar, 0), interfaceC1073d);
        return k3 == EnumC1145a.f10026h ? k3 : C0880v.f8657a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(q2.InterfaceC1073d r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof Q1.n
            if (r0 == 0) goto L13
            r0 = r14
            Q1.n r0 = (Q1.n) r0
            int r1 = r0.f5307n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5307n = r1
            goto L18
        L13:
            Q1.n r0 = new Q1.n
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f5305l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f5307n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            C1.y.J(r14)
            goto L89
        L2a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L32:
            Q1.p r2 = r0.f5304k
            C1.y.J(r14)
            goto L66
        L38:
            C1.y.J(r14)
            com.example.bulksmsscheduler.data.AppDatabase r14 = r13.f5312a
            Q1.m r14 = r14.s()
            r0.f5304k = r13
            r0.f5307n = r4
            r14.getClass()
            java.lang.String r2 = "SELECT * FROM app_settings WHERE id = 0"
            r4 = 0
            r1.v r2 = r1.v.a(r2, r4)
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            Q1.l r5 = new Q1.l
            r6 = 1
            r5.<init>(r14, r2, r6)
            java.lang.Object r14 = r14.f5302a
            r1.r r14 = (r1.r) r14
            java.lang.Object r14 = n2.AbstractC0949a.j(r14, r4, r5, r0)
            if (r14 != r1) goto L65
            return r1
        L65:
            r2 = r13
        L66:
            R1.a r14 = (R1.a) r14
            if (r14 != 0) goto L6f
            R1.a r14 = new R1.a
            r14.<init>()
        L6f:
            r4 = r14
            r10 = 1
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 383(0x17f, float:5.37E-43)
            R1.a r14 = R1.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r4 = 0
            r0.f5304k = r4
            r0.f5307n = r3
            java.lang.Object r14 = r2.h(r14, r0)
            if (r14 != r1) goto L89
            return r1
        L89:
            m2.v r14 = m2.C0880v.f8657a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.p.f(q2.d):java.lang.Object");
    }

    public final Object g(R1.f fVar, InterfaceC1073d interfaceC1073d) {
        k r3 = this.f5312a.r();
        r3.getClass();
        Object k3 = AbstractC0949a.k((r1.r) r3.f5292a, new d(r3, 1, fVar), interfaceC1073d);
        return k3 == EnumC1145a.f10026h ? k3 : C0880v.f8657a;
    }

    public final Object h(R1.a aVar, InterfaceC1073d interfaceC1073d) {
        m s3 = this.f5312a.s();
        s3.getClass();
        Object k3 = AbstractC0949a.k((r1.r) s3.f5302a, new d(s3, 2, aVar), interfaceC1073d);
        return k3 == EnumC1145a.f10026h ? k3 : C0880v.f8657a;
    }
}
