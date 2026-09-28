package z;

import r0.InterfaceC1129r;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0.H f11788a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1129r f11789b = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1129r f11790c;

    public p0(C0.H h2, InterfaceC1129r interfaceC1129r) {
        this.f11788a = h2;
        this.f11790c = interfaceC1129r;
    }

    public final long a(long j3) {
        b0.d dVar;
        InterfaceC1129r interfaceC1129r = this.f11789b;
        b0.d dVar2 = b0.d.f7059e;
        if (interfaceC1129r != null) {
            if (interfaceC1129r.n()) {
                InterfaceC1129r interfaceC1129r2 = this.f11790c;
                dVar = interfaceC1129r2 != null ? interfaceC1129r2.D(interfaceC1129r, true) : null;
            } else {
                dVar = dVar2;
            }
            if (dVar != null) {
                dVar2 = dVar;
            }
        }
        float d3 = b0.c.d(j3);
        float f3 = dVar2.f7060a;
        if (d3 >= f3) {
            float d4 = b0.c.d(j3);
            f3 = dVar2.f7062c;
            if (d4 <= f3) {
                f3 = b0.c.d(j3);
            }
        }
        float e3 = b0.c.e(j3);
        float f4 = dVar2.f7061b;
        if (e3 >= f4) {
            float e4 = b0.c.e(j3);
            f4 = dVar2.f7063d;
            if (e4 <= f4) {
                f4 = b0.c.e(j3);
            }
        }
        return K1.f.e(f3, f4);
    }

    public final int b(long j3, boolean z3) {
        if (z3) {
            j3 = a(j3);
        }
        return this.f11788a.f462b.e(d(j3));
    }

    public final boolean c(long j3) {
        long d3 = d(a(j3));
        float e3 = b0.c.e(d3);
        C0.H h2 = this.f11788a;
        int c3 = h2.f462b.c(e3);
        return b0.c.d(d3) >= h2.f(c3) && b0.c.d(d3) <= h2.g(c3);
    }

    public final long d(long j3) {
        InterfaceC1129r interfaceC1129r;
        InterfaceC1129r interfaceC1129r2 = this.f11789b;
        if (interfaceC1129r2 == null) {
            return j3;
        }
        if (!interfaceC1129r2.n()) {
            interfaceC1129r2 = null;
        }
        if (interfaceC1129r2 == null || (interfaceC1129r = this.f11790c) == null) {
            return j3;
        }
        InterfaceC1129r interfaceC1129r3 = interfaceC1129r.n() ? interfaceC1129r : null;
        return interfaceC1129r3 == null ? j3 : interfaceC1129r2.N(interfaceC1129r3, j3);
    }

    public final long e(long j3) {
        InterfaceC1129r interfaceC1129r;
        InterfaceC1129r interfaceC1129r2 = this.f11789b;
        if (interfaceC1129r2 == null) {
            return j3;
        }
        if (!interfaceC1129r2.n()) {
            interfaceC1129r2 = null;
        }
        if (interfaceC1129r2 == null || (interfaceC1129r = this.f11790c) == null) {
            return j3;
        }
        InterfaceC1129r interfaceC1129r3 = interfaceC1129r.n() ? interfaceC1129r : null;
        return interfaceC1129r3 == null ? j3 : interfaceC1129r3.N(interfaceC1129r2, j3);
    }
}
