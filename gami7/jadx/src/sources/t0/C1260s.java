package t0;

import r0.AbstractC1103Q;
import r0.C1125n;
import r0.InterfaceC1094H;

/* renamed from: t0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1260s extends O {
    @Override // t0.O
    public final void I0() {
        C1241J c1241j = this.f10490s.f10546s.f10379D.f10481s;
        z2.h.c(c1241j);
        c1241j.A0();
    }

    @Override // r0.InterfaceC1093G
    public final int L(int i2) {
        K1.s r3 = this.f10490s.f10546s.r();
        InterfaceC1094H e3 = r3.e();
        C1236E c1236e = (C1236E) r3.f4603h;
        return e3.c((Z) c1236e.f10378C.f4242d, c1236e.l(), i2);
    }

    @Override // r0.InterfaceC1093G
    public final AbstractC1103Q a(long j3) {
        q0(j3);
        Z z3 = this.f10490s;
        L.d v3 = z3.f10546s.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                C1241J c1241j = ((C1236E) objArr[i3]).f10379D.f10481s;
                z2.h.c(c1241j);
                c1241j.f10428p = 3;
                i3++;
            } while (i3 < i2);
        }
        C1236E c1236e = z3.f10546s;
        O.H0(this, c1236e.f10400v.f(this, c1236e.l(), j3));
        return this;
    }

    @Override // r0.InterfaceC1093G
    public final int a0(int i2) {
        K1.s r3 = this.f10490s.f10546s.r();
        InterfaceC1094H e3 = r3.e();
        C1236E c1236e = (C1236E) r3.f4603h;
        return e3.h((Z) c1236e.f10378C.f4242d, c1236e.l(), i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b(int i2) {
        K1.s r3 = this.f10490s.f10546s.r();
        InterfaceC1094H e3 = r3.e();
        C1236E c1236e = (C1236E) r3.f4603h;
        return e3.a((Z) c1236e.f10378C.f4242d, c1236e.l(), i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b0(int i2) {
        K1.s r3 = this.f10490s.f10546s.r();
        InterfaceC1094H e3 = r3.e();
        C1236E c1236e = (C1236E) r3.f4603h;
        return e3.d((Z) c1236e.f10378C.f4242d, c1236e.l(), i2);
    }

    @Override // t0.N
    public final int s0(C1125n c1125n) {
        C1241J c1241j = this.f10490s.f10546s.f10379D.f10481s;
        z2.h.c(c1241j);
        boolean z3 = c1241j.q;
        C1237F c1237f = c1241j.f10436y;
        if (!z3) {
            L l3 = c1241j.F;
            if (l3.f10466c == 2) {
                c1237f.f10410f = true;
                if (c1237f.f10406b) {
                    l3.f10471h = true;
                    l3.f10472i = true;
                }
            } else {
                c1237f.f10411g = true;
            }
        }
        O o3 = c1241j.T().f10627T;
        if (o3 != null) {
            o3.f10487o = true;
        }
        c1241j.g();
        O o4 = c1241j.T().f10627T;
        if (o4 != null) {
            o4.f10487o = false;
        }
        Integer num = (Integer) c1237f.f10413i.get(c1125n);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f10495x.put(c1125n, Integer.valueOf(intValue));
        return intValue;
    }
}
