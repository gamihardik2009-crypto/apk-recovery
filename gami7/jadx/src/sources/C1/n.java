package C1;

import B1.C0011a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f666a = B1.s.f("Schedulers");

    public static void a(K1.q qVar, B1.u uVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            uVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qVar.k(((K1.o) it.next()).f4564a, currentTimeMillis);
            }
        }
    }

    public static void b(C0011a c0011a, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        K1.q v3 = workDatabase.v();
        workDatabase.c();
        try {
            ArrayList d3 = v3.d();
            a(v3, c0011a.f262c, d3);
            ArrayList c3 = v3.c(c0011a.f269j);
            a(v3, c0011a.f262c, c3);
            c3.addAll(d3);
            ArrayList b3 = v3.b();
            workDatabase.o();
            workDatabase.j();
            if (c3.size() > 0) {
                K1.o[] oVarArr = (K1.o[]) c3.toArray(new K1.o[c3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.d()) {
                        kVar.c(oVarArr);
                    }
                }
            }
            if (b3.size() > 0) {
                K1.o[] oVarArr2 = (K1.o[]) b3.toArray(new K1.o[b3.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    k kVar2 = (k) it2.next();
                    if (!kVar2.d()) {
                        kVar2.c(oVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
