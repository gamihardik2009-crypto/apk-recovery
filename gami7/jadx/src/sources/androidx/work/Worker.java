package androidx.work;

import B1.E;
import B1.F;
import B1.p;
import B1.r;
import M1.k;
import android.content.Context;
import l2.InterfaceFutureC0816a;

/* loaded from: classes.dex */
public abstract class Worker extends r {

    /* renamed from: l, reason: collision with root package name */
    public k f6936l;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // B1.r
    public final InterfaceFutureC0816a b() {
        k kVar = new k();
        this.f302i.f6939c.execute(new F(this, 0, kVar));
        return kVar;
    }

    @Override // B1.r
    public final k d() {
        this.f6936l = new k();
        this.f302i.f6939c.execute(new E(0, this));
        return this.f6936l;
    }

    public abstract p f();
}
