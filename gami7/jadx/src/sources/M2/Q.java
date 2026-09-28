package M2;

import J2.C0311h;
import N2.AbstractC0363b;
import N2.AbstractC0365d;
import q2.InterfaceC1073d;

/* loaded from: classes.dex */
public final class Q extends AbstractC0365d {

    /* renamed from: a, reason: collision with root package name */
    public long f4832a;

    /* renamed from: b, reason: collision with root package name */
    public C0311h f4833b;

    @Override // N2.AbstractC0365d
    public final boolean a(AbstractC0363b abstractC0363b) {
        O o3 = (O) abstractC0363b;
        if (this.f4832a >= 0) {
            return false;
        }
        long j3 = o3.f4826p;
        if (j3 < o3.q) {
            o3.q = j3;
        }
        this.f4832a = j3;
        return true;
    }

    @Override // N2.AbstractC0365d
    public final InterfaceC1073d[] b(AbstractC0363b abstractC0363b) {
        long j3 = this.f4832a;
        this.f4832a = -1L;
        this.f4833b = null;
        return ((O) abstractC0363b).w(j3);
    }
}
