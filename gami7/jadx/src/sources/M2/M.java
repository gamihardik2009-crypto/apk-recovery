package M2;

import J2.C0311h;
import q2.InterfaceC1073d;

/* loaded from: classes.dex */
public final class M implements J2.J {

    /* renamed from: h, reason: collision with root package name */
    public final O f4812h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4813i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4814j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1073d f4815k;

    public M(O o3, long j3, Object obj, C0311h c0311h) {
        this.f4812h = o3;
        this.f4813i = j3;
        this.f4814j = obj;
        this.f4815k = c0311h;
    }

    @Override // J2.J
    public final void a() {
        O o3 = this.f4812h;
        synchronized (o3) {
            if (this.f4813i < o3.q()) {
                return;
            }
            Object[] objArr = o3.f4825o;
            z2.h.c(objArr);
            long j3 = this.f4813i;
            if (objArr[((int) j3) & (objArr.length - 1)] != this) {
                return;
            }
            P.d(objArr, j3, P.f4829a);
            o3.l();
        }
    }
}
