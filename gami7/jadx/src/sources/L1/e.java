package L1;

import B1.A;
import B1.C;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final String f4639j = B1.s.f("EnqueueRunnable");

    /* renamed from: h, reason: collision with root package name */
    public final C1.p f4640h;

    /* renamed from: i, reason: collision with root package name */
    public final B.z f4641i;

    public e(C1.p pVar, B.z zVar) {
        this.f4640h = pVar;
        this.f4641i = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(C1.p r24) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.e.a(C1.p):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.z zVar = this.f4641i;
        C1.p pVar = this.f4640h;
        try {
            pVar.getClass();
            C1.w wVar = pVar.f669h;
            if (C1.p.J(pVar, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + pVar + ")");
            }
            WorkDatabase workDatabase = wVar.f690h;
            workDatabase.c();
            try {
                C.u(workDatabase, wVar.f689g, pVar);
                boolean a3 = a(pVar);
                workDatabase.o();
                if (a3) {
                    m.a(wVar.f688f, RescheduleReceiver.class, true);
                    C1.n.b(wVar.f689g, wVar.f690h, wVar.f692j);
                }
                zVar.e(A.f244a);
            } finally {
                workDatabase.j();
            }
        } catch (Throwable th) {
            zVar.e(new B1.x(th));
        }
    }
}
