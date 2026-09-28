package L1;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class v implements B1.j {

    /* renamed from: a, reason: collision with root package name */
    public final N1.b f4679a;

    /* renamed from: b, reason: collision with root package name */
    public final J1.a f4680b;

    /* renamed from: c, reason: collision with root package name */
    public final K1.q f4681c;

    static {
        B1.s.f("WMFgUpdater");
    }

    public v(WorkDatabase workDatabase, J1.a aVar, N1.b bVar) {
        this.f4680b = aVar;
        this.f4679a = bVar;
        this.f4681c = workDatabase.v();
    }
}
