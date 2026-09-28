package L1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.w f4635i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4636j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f4637k = false;

    public c(C1.w wVar, String str) {
        this.f4635i = wVar;
        this.f4636j = str;
    }

    @Override // L1.d
    public final void b() {
        C1.w wVar = this.f4635i;
        WorkDatabase workDatabase = wVar.f690h;
        workDatabase.c();
        try {
            Iterator it = workDatabase.v().h(this.f4636j).iterator();
            while (it.hasNext()) {
                d.a(wVar, (String) it.next());
            }
            workDatabase.o();
            workDatabase.j();
            if (this.f4637k) {
                C1.n.b(wVar.f689g, wVar.f690h, wVar.f692j);
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
