package L1;

import B1.F;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final String f4667n = B1.s.f("WorkForegroundRunnable");

    /* renamed from: h, reason: collision with root package name */
    public final M1.k f4668h = new M1.k();

    /* renamed from: i, reason: collision with root package name */
    public final Context f4669i;

    /* renamed from: j, reason: collision with root package name */
    public final K1.o f4670j;

    /* renamed from: k, reason: collision with root package name */
    public final B1.r f4671k;

    /* renamed from: l, reason: collision with root package name */
    public final B1.j f4672l;

    /* renamed from: m, reason: collision with root package name */
    public final N1.b f4673m;

    public t(Context context, K1.o oVar, B1.r rVar, v vVar, N1.b bVar) {
        this.f4669i = context;
        this.f4670j = oVar;
        this.f4671k = rVar;
        this.f4672l = vVar;
        this.f4673m = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f4670j.q || Build.VERSION.SDK_INT >= 31) {
            this.f4668h.j(null);
            return;
        }
        M1.k kVar = new M1.k();
        N1.b bVar = this.f4673m;
        bVar.f5013d.execute(new C1.z(this, 3, kVar));
        kVar.a(new F(this, 8, kVar), bVar.f5013d);
    }
}
