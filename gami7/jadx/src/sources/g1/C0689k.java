package g1;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: g1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689k extends l0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.c f7731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f7732e;

    public C0689k(l0.c cVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f7731d = cVar;
        this.f7732e = threadPoolExecutor;
    }

    @Override // l0.c
    public final void H(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f7732e;
        try {
            this.f7731d.H(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // l0.c
    public final void I(K1.i iVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f7732e;
        try {
            this.f7731d.I(iVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
