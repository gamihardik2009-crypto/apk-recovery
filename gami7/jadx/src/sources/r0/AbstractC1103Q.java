package r0;

import a.AbstractC0423a;

/* renamed from: r0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1103Q {

    /* renamed from: h, reason: collision with root package name */
    public int f9834h;

    /* renamed from: i, reason: collision with root package name */
    public int f9835i;

    /* renamed from: j, reason: collision with root package name */
    public long f9836j = l0.c.e(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public long f9837k = AbstractC1105T.f9842a;

    /* renamed from: l, reason: collision with root package name */
    public long f9838l = 0;

    public abstract int d0(C1125n c1125n);

    public final int i0() {
        return (int) (this.f9836j >> 32);
    }

    public final void j0() {
        this.f9834h = B1.C.C((int) (this.f9836j >> 32), O0.a.j(this.f9837k), O0.a.h(this.f9837k));
        int C3 = B1.C.C((int) (this.f9836j & 4294967295L), O0.a.i(this.f9837k), O0.a.g(this.f9837k));
        this.f9835i = C3;
        int i2 = this.f9834h;
        long j3 = this.f9836j;
        this.f9838l = AbstractC0423a.m((i2 - ((int) (j3 >> 32))) / 2, (C3 - ((int) (j3 & 4294967295L))) / 2);
    }

    public abstract void l0(long j3, float f3, y2.c cVar);

    public final void n0(long j3) {
        if (O0.j.a(this.f9836j, j3)) {
            return;
        }
        this.f9836j = j3;
        j0();
    }

    public Object p() {
        return null;
    }

    public final void q0(long j3) {
        if (O0.a.b(this.f9837k, j3)) {
            return;
        }
        this.f9837k = j3;
        j0();
    }
}
