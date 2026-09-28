package L1;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.w f4633i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ UUID f4634j;

    public b(C1.w wVar, UUID uuid) {
        this.f4633i = wVar;
        this.f4634j = uuid;
    }

    @Override // L1.d
    public final void b() {
        C1.w wVar = this.f4633i;
        WorkDatabase workDatabase = wVar.f690h;
        workDatabase.c();
        try {
            d.a(wVar, this.f4634j.toString());
            workDatabase.o();
            workDatabase.j();
            C1.n.b(wVar.f689g, wVar.f690h, wVar.f692j);
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
