package t0;

import java.util.LinkedHashMap;
import m2.C0880v;
import r0.C1092F;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1129r;

/* loaded from: classes.dex */
public abstract class O extends N implements InterfaceC1093G {

    /* renamed from: s, reason: collision with root package name */
    public final Z f10490s;

    /* renamed from: u, reason: collision with root package name */
    public LinkedHashMap f10492u;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC1095I f10494w;

    /* renamed from: t, reason: collision with root package name */
    public long f10491t = 0;

    /* renamed from: v, reason: collision with root package name */
    public final C1092F f10493v = new C1092F(this);

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f10495x = new LinkedHashMap();

    public O(Z z3) {
        this.f10490s = z3;
    }

    public static final void H0(O o3, InterfaceC1095I interfaceC1095I) {
        C0880v c0880v;
        LinkedHashMap linkedHashMap;
        if (interfaceC1095I != null) {
            o3.getClass();
            o3.n0(l0.c.e(interfaceC1095I.f(), interfaceC1095I.h()));
            c0880v = C0880v.f8657a;
        } else {
            c0880v = null;
        }
        if (c0880v == null) {
            o3.n0(0L);
        }
        if (!z2.h.a(o3.f10494w, interfaceC1095I) && interfaceC1095I != null && ((((linkedHashMap = o3.f10492u) != null && !linkedHashMap.isEmpty()) || (!interfaceC1095I.i().isEmpty())) && !z2.h.a(interfaceC1095I.i(), o3.f10492u))) {
            C1241J c1241j = o3.f10490s.f10546s.f10379D.f10481s;
            z2.h.c(c1241j);
            c1241j.f10436y.g();
            LinkedHashMap linkedHashMap2 = o3.f10492u;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                o3.f10492u = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC1095I.i());
        }
        o3.f10494w = interfaceC1095I;
    }

    @Override // t0.N
    public final boolean A0() {
        return this.f10494w != null;
    }

    @Override // t0.N
    public final C1236E B0() {
        return this.f10490s.f10546s;
    }

    @Override // t0.N
    public final InterfaceC1095I C0() {
        InterfaceC1095I interfaceC1095I = this.f10494w;
        if (interfaceC1095I != null) {
            return interfaceC1095I;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // t0.N
    public final N D0() {
        Z z3 = this.f10490s.f10549v;
        if (z3 != null) {
            return z3.R0();
        }
        return null;
    }

    @Override // t0.N
    public final long E0() {
        return this.f10491t;
    }

    @Override // t0.N, r0.InterfaceC1126o
    public final boolean F() {
        return true;
    }

    @Override // t0.N
    public final void G0() {
        l0(this.f10491t, 0.0f, null);
    }

    public void I0() {
        C0().j();
    }

    public final void J0(long j3) {
        if (!O0.h.a(this.f10491t, j3)) {
            this.f10491t = j3;
            Z z3 = this.f10490s;
            C1241J c1241j = z3.f10546s.f10379D.f10481s;
            if (c1241j != null) {
                c1241j.y0();
            }
            N.F0(z3);
        }
        if (this.f10487o) {
            return;
        }
        t0(new j0(C0(), this));
    }

    public final long K0(O o3, boolean z3) {
        long j3 = 0;
        O o4 = this;
        while (!z2.h.a(o4, o3)) {
            if (!o4.f10485m || !z3) {
                j3 = O0.h.c(j3, o4.f10491t);
            }
            Z z4 = o4.f10490s.f10549v;
            z2.h.c(z4);
            o4 = z4.R0();
            z2.h.c(o4);
        }
        return j3;
    }

    @Override // O0.b
    public final float c() {
        return this.f10490s.c();
    }

    @Override // r0.InterfaceC1126o
    public final O0.k getLayoutDirection() {
        return this.f10490s.f10546s.f10403y;
    }

    @Override // r0.AbstractC1103Q
    public final void l0(long j3, float f3, y2.c cVar) {
        J0(j3);
        if (this.f10486n) {
            return;
        }
        I0();
    }

    @Override // r0.AbstractC1103Q, r0.InterfaceC1093G
    public final Object p() {
        return this.f10490s.p();
    }

    @Override // O0.b
    public final float s() {
        return this.f10490s.s();
    }

    @Override // t0.N
    public final N y0() {
        Z z3 = this.f10490s.f10548u;
        if (z3 != null) {
            return z3.R0();
        }
        return null;
    }

    @Override // t0.N
    public final InterfaceC1129r z0() {
        return this.f10493v;
    }
}
