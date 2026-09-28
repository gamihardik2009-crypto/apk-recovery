package C1;

import B1.C0011a;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import n2.AbstractC0963o;

/* loaded from: classes.dex */
public final /* synthetic */ class x extends z2.f implements y2.h {

    /* renamed from: p, reason: collision with root package name */
    public static final x f698p = new x(6, y.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        C0011a c0011a = (C0011a) obj2;
        N1.b bVar = (N1.b) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        I1.l lVar = (I1.l) obj5;
        i iVar = (i) obj6;
        z2.h.f(context, "p0");
        z2.h.f(c0011a, "p1");
        z2.h.f(bVar, "p2");
        z2.h.f(workDatabase, "p3");
        z2.h.f(lVar, "p4");
        String str = n.f666a;
        F1.b bVar2 = new F1.b(context, workDatabase, c0011a);
        L1.m.a(context, SystemJobService.class, true);
        B1.s.d().a(n.f666a, "Created SystemJobScheduler and enabled SystemJobService");
        return AbstractC0963o.v(bVar2, new D1.c(context, c0011a, lVar, iVar, new K1.e(iVar, bVar), bVar));
    }
}
