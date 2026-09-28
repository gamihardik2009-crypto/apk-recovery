package Q2;

import B1.t;
import J2.AbstractC0324v;
import J2.S;
import O2.AbstractC0369a;
import O2.w;
import java.util.concurrent.Executor;
import q2.C1079j;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class c extends S implements Executor {

    /* renamed from: j, reason: collision with root package name */
    public static final c f5344j = new c();

    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC0324v f5345k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [O2.i] */
    static {
        l lVar = l.f5361j;
        int i2 = w.f5210a;
        if (64 >= i2) {
            i2 = 64;
        }
        int j3 = AbstractC0369a.j("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (j3 < 1) {
            throw new IllegalArgumentException(t.h("Expected positive parallelism level, but got ", j3).toString());
        }
        if (j3 < k.f5356d) {
            if (j3 < 1) {
                throw new IllegalArgumentException(t.h("Expected positive parallelism level, but got ", j3).toString());
            }
            lVar = new O2.i(lVar, j3);
        }
        f5345k = lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        r(C1079j.f9784h, runnable);
    }

    @Override // J2.AbstractC0324v
    public final void r(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        f5345k.r(interfaceC1078i, runnable);
    }

    @Override // J2.AbstractC0324v
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // J2.AbstractC0324v
    public final void v(InterfaceC1078i interfaceC1078i, Runnable runnable) {
        f5345k.v(interfaceC1078i, runnable);
    }
}
