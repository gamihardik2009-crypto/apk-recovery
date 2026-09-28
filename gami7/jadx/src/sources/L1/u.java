package L1;

import android.content.Context;
import java.util.UUID;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M1.k f4674h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ UUID f4675i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B1.i f4676j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f4677k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f4678l;

    public u(v vVar, M1.k kVar, UUID uuid, B1.i iVar, Context context) {
        this.f4678l = vVar;
        this.f4674h = kVar;
        this.f4675i = uuid;
        this.f4676j = iVar;
        this.f4677k = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f4674h.f4781a instanceof M1.a)) {
                String uuid = this.f4675i.toString();
                K1.o i2 = this.f4678l.f4681c.i(uuid);
                if (i2 == null || B1.t.a(i2.f4565b)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((C1.i) this.f4678l.f4680b).g(uuid, this.f4676j);
                this.f4677k.startService(J1.c.b(this.f4677k, C1.y.v(i2), this.f4676j));
            }
            this.f4674h.j(null);
        } catch (Throwable th) {
            this.f4674h.k(th);
        }
    }
}
