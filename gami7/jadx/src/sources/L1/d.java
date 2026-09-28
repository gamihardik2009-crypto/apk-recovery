package L1;

import C1.A;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import w1.C1387i;

/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final B.z f4638h = new B.z(1);

    public static void a(C1.w wVar, String str) {
        A b3;
        WorkDatabase workDatabase = wVar.f690h;
        K1.q v3 = workDatabase.v();
        K1.c q = workDatabase.q();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int g3 = v3.g(str2);
            if (g3 != 3 && g3 != 4) {
                r1.r rVar = v3.f4587a;
                rVar.b();
                K1.h hVar = v3.f4591e;
                C1387i a3 = hVar.a();
                if (str2 == null) {
                    a3.n(1);
                } else {
                    a3.p(str2, 1);
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
            linkedList.addAll(q.e(str2));
        }
        C1.i iVar = wVar.f693k;
        synchronized (iVar.f655k) {
            B1.s.d().a(C1.i.f644l, "Processor cancelling " + str);
            iVar.f653i.add(str);
            b3 = iVar.b(str);
        }
        C1.i.d(str, b3, 1);
        Iterator it = wVar.f692j.iterator();
        while (it.hasNext()) {
            ((C1.k) it.next()).b(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        B.z zVar = this.f4638h;
        try {
            b();
            zVar.e(B1.A.f244a);
        } catch (Throwable th) {
            zVar.e(new B1.x(th));
        }
    }
}
