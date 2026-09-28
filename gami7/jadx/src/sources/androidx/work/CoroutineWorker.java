package androidx.work;

import B1.C0016f;
import B1.C0017g;
import B1.RunnableC0015e;
import B1.m;
import B1.r;
import J2.B;
import J2.H;
import J2.c0;
import M1.k;
import O2.e;
import Q2.d;
import android.content.Context;
import l2.InterfaceFutureC0816a;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import z2.h;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends r {

    /* renamed from: l, reason: collision with root package name */
    public final c0 f6932l;

    /* renamed from: m, reason: collision with root package name */
    public final k f6933m;

    /* renamed from: n, reason: collision with root package name */
    public final d f6934n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.f(context, "appContext");
        h.f(workerParameters, "params");
        this.f6932l = B.b();
        k kVar = new k();
        this.f6933m = kVar;
        kVar.a(new RunnableC0015e(0, this), workerParameters.f6940d.f5010a);
        this.f6934n = H.f4356a;
    }

    @Override // B1.r
    public final InterfaceFutureC0816a b() {
        c0 b3 = B.b();
        d dVar = this.f6934n;
        dVar.getClass();
        e a3 = B.a(AbstractC0948C.n(dVar, b3));
        m mVar = new m(b3);
        B.r(a3, null, 0, new C0016f(mVar, this, null), 3);
        return mVar;
    }

    @Override // B1.r
    public final void c() {
        this.f6933m.cancel(false);
    }

    @Override // B1.r
    public final k d() {
        c0 c0Var = this.f6932l;
        d dVar = this.f6934n;
        dVar.getClass();
        B.r(B.a(AbstractC0948C.n(dVar, c0Var)), null, 0, new C0017g(this, null), 3);
        return this.f6933m;
    }

    public abstract Object f(InterfaceC1073d interfaceC1073d);

    public Object g() {
        throw new IllegalStateException("Not implemented");
    }
}
