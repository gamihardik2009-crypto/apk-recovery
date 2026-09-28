package r0;

import a.AbstractC0423a;
import n2.AbstractC0946A;

/* renamed from: r0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092F implements InterfaceC1129r {

    /* renamed from: h, reason: collision with root package name */
    public final t0.O f9825h;

    public C1092F(t0.O o3) {
        this.f9825h = o3;
    }

    @Override // r0.InterfaceC1129r
    public final b0.d D(InterfaceC1129r interfaceC1129r, boolean z3) {
        return this.f9825h.f10490s.D(interfaceC1129r, z3);
    }

    @Override // r0.InterfaceC1129r
    public final long H() {
        t0.O o3 = this.f9825h;
        return l0.c.e(o3.f9834h, o3.f9835i);
    }

    @Override // r0.InterfaceC1129r
    public final long K(long j3) {
        return this.f9825h.f10490s.K(b0.c.h(j3, a()));
    }

    @Override // r0.InterfaceC1129r
    public final long N(InterfaceC1129r interfaceC1129r, long j3) {
        return b(interfaceC1129r, j3);
    }

    public final long a() {
        t0.O o3 = this.f9825h;
        t0.O h2 = AbstractC1108W.h(o3);
        return b0.c.g(b(h2.f10493v, 0L), o3.f10490s.b1(h2.f10490s, 0L));
    }

    public final long b(InterfaceC1129r interfaceC1129r, long j3) {
        boolean z3 = interfaceC1129r instanceof C1092F;
        t0.O o3 = this.f9825h;
        if (!z3) {
            t0.O h2 = AbstractC1108W.h(o3);
            long b3 = b(h2.f10493v, j3);
            t0.Z z4 = h2.f10490s;
            z4.getClass();
            return b0.c.h(b3, z4.b1(interfaceC1129r, 0L));
        }
        t0.O o4 = ((C1092F) interfaceC1129r).f9825h;
        o4.f10490s.c1();
        t0.O R02 = o3.f10490s.P0(o4.f10490s).R0();
        if (R02 != null) {
            long b4 = O0.h.b(O0.h.c(o4.K0(R02, false), AbstractC0423a.Z(j3)), o3.K0(R02, false));
            return K1.f.e((int) (b4 >> 32), (int) (b4 & 4294967295L));
        }
        t0.O h3 = AbstractC1108W.h(o4);
        long c3 = O0.h.c(O0.h.c(o4.K0(h3, false), h3.f10491t), AbstractC0423a.Z(j3));
        t0.O h4 = AbstractC1108W.h(o3);
        long b5 = O0.h.b(c3, O0.h.c(o3.K0(h4, false), h4.f10491t));
        long e3 = K1.f.e((int) (b5 >> 32), (int) (b5 & 4294967295L));
        t0.Z z5 = h4.f10490s.f10549v;
        z2.h.c(z5);
        t0.Z z6 = h3.f10490s.f10549v;
        z2.h.c(z6);
        return z5.b1(z6, e3);
    }

    @Override // r0.InterfaceC1129r
    public final long d(long j3) {
        return b0.c.h(this.f9825h.f10490s.d(j3), a());
    }

    @Override // r0.InterfaceC1129r
    public final long k(long j3) {
        return this.f9825h.f10490s.k(b0.c.h(j3, a()));
    }

    @Override // r0.InterfaceC1129r
    public final long m(long j3) {
        return b0.c.h(this.f9825h.f10490s.m(j3), a());
    }

    @Override // r0.InterfaceC1129r
    public final boolean n() {
        return this.f9825h.f10490s.T0().f5869t;
    }

    @Override // r0.InterfaceC1129r
    public final void r(float[] fArr) {
        this.f9825h.f10490s.r(fArr);
    }

    @Override // r0.InterfaceC1129r
    public final InterfaceC1129r t() {
        t0.O R02;
        if (!n()) {
            AbstractC0946A.r("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        t0.Z z3 = ((t0.Z) this.f9825h.f10490s.f10546s.f10378C.f4242d).f10549v;
        if (z3 == null || (R02 = z3.R0()) == null) {
            return null;
        }
        return R02.f10493v;
    }

    @Override // r0.InterfaceC1129r
    public final void z(InterfaceC1129r interfaceC1129r, float[] fArr) {
        this.f9825h.f10490s.z(interfaceC1129r, fArr);
    }
}
