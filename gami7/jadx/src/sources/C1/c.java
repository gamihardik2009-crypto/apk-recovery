package C1;

import w1.C1380b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final B1.u f622a;

    public c(B1.u uVar) {
        this.f622a = uVar;
    }

    public final void a(C1380b c1380b) {
        c1380b.a();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.f622a.getClass();
            sb.append(System.currentTimeMillis() - r.f678a);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            c1380b.e(sb.toString());
            c1380b.r();
        } finally {
            c1380b.d();
        }
    }
}
