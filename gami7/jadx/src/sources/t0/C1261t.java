package t0;

import c0.AbstractC0571K;
import c0.C0589h;
import c0.C0603v;
import c0.InterfaceC0600s;
import f0.C0663b;
import r0.AbstractC1103Q;
import r0.C1125n;
import r0.InterfaceC1094H;
import u0.C1314v;

/* renamed from: t0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261t extends Z {

    /* renamed from: U, reason: collision with root package name */
    public static final C0589h f10625U;

    /* renamed from: S, reason: collision with root package name */
    public final n0 f10626S;

    /* renamed from: T, reason: collision with root package name */
    public O f10627T;

    static {
        C0589h g3 = AbstractC0571K.g();
        int i2 = C0603v.f7278h;
        g3.e(C0603v.f7274d);
        g3.k(1.0f);
        g3.l(1);
        f10625U = g3;
    }

    public C1261t(C1236E c1236e) {
        super(c1236e);
        n0 n0Var = new n0();
        n0Var.f5861k = 0;
        this.f10626S = n0Var;
        n0Var.f5865o = this;
        this.f10627T = c1236e.f10389j != null ? new C1260s(this) : null;
    }

    @Override // r0.InterfaceC1093G
    public final int L(int i2) {
        K1.s r3 = this.f10546s.r();
        InterfaceC1094H e3 = r3.e();
        C1236E c1236e = (C1236E) r3.f4603h;
        return e3.c((Z) c1236e.f10378C.f4242d, c1236e.m(), i2);
    }

    @Override // t0.Z
    public final void O0() {
        if (this.f10627T == null) {
            this.f10627T = new C1260s(this);
        }
    }

    @Override // t0.Z
    public final O R0() {
        return this.f10627T;
    }

    @Override // t0.Z
    public final V.n T0() {
        return this.f10626S;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // t0.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y0(t0.C1246d r18, long r19, t0.r r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r0 = r17
            r8 = r19
            r10 = r21
            t0.E r1 = r0.f10546s
            r11 = r18
            boolean r2 = r11.d(r1)
            r12 = 1
            r3 = 0
            if (r2 == 0) goto L44
            boolean r2 = K1.f.E(r19)
            if (r2 != 0) goto L19
            goto L28
        L19:
            t0.e0 r2 = r0.f10544L
            if (r2 == 0) goto L41
            boolean r4 = r0.f10551x
            if (r4 == 0) goto L41
            boolean r2 = r2.j(r8)
            if (r2 == 0) goto L28
            goto L41
        L28:
            if (r22 == 0) goto L44
            long r4 = r17.S0()
            float r2 = r0.K0(r8, r4)
            boolean r4 = java.lang.Float.isInfinite(r2)
            if (r4 != 0) goto L44
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L44
            r13 = r3
        L3f:
            r3 = r12
            goto L46
        L41:
            r13 = r23
            goto L3f
        L44:
            r13 = r23
        L46:
            if (r3 == 0) goto L98
            int r14 = r10.f10619j
            L.d r1 = r1.u()
            int r2 = r1.f4620j
            if (r2 <= 0) goto L96
            int r2 = r2 - r12
            java.lang.Object[] r15 = r1.f4618h
            r16 = r2
        L57:
            r1 = r15[r16]
            r2 = r1
            t0.E r2 = (t0.C1236E) r2
            boolean r1 = r2.E()
            if (r1 == 0) goto L92
            r1 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r13
            r1.a(r2, r3, r5, r6, r7)
            long r1 = r21.a()
            r3 = 32
            long r3 = r1 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L92
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            if (r1 == 0) goto L92
            boolean r1 = r10.f10621l
            if (r1 == 0) goto L96
            int r1 = r10.f10620k
            int r1 = r1 - r12
            r10.f10619j = r1
        L92:
            int r16 = r16 + (-1)
            if (r16 >= 0) goto L57
        L96:
            r10.f10619j = r14
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1261t.Y0(t0.d, long, t0.r, boolean, boolean):void");
    }

    @Override // r0.InterfaceC1093G
    public final AbstractC1103Q a(long j3) {
        q0(j3);
        C1236E c1236e = this.f10546s;
        L.d v3 = c1236e.v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            Object[] objArr = v3.f4618h;
            int i3 = 0;
            do {
                ((C1236E) objArr[i3]).f10379D.f10480r.f10455r = 3;
                i3++;
            } while (i3 < i2);
        }
        j1(c1236e.f10400v.f(this, c1236e.m(), j3));
        d1();
        return this;
    }

    @Override // r0.InterfaceC1093G
    public final int a0(int i2) {
        K1.s r3 = this.f10546s.r();
        InterfaceC1094H e3 = r3.e();
        C1236E c1236e = (C1236E) r3.f4603h;
        return e3.h((Z) c1236e.f10378C.f4242d, c1236e.m(), i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b(int i2) {
        K1.s r3 = this.f10546s.r();
        InterfaceC1094H e3 = r3.e();
        C1236E c1236e = (C1236E) r3.f4603h;
        return e3.a((Z) c1236e.f10378C.f4242d, c1236e.m(), i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b0(int i2) {
        K1.s r3 = this.f10546s.r();
        InterfaceC1094H e3 = r3.e();
        C1236E c1236e = (C1236E) r3.f4603h;
        return e3.d((Z) c1236e.f10378C.f4242d, c1236e.m(), i2);
    }

    @Override // t0.Z
    public final void f1(InterfaceC0600s interfaceC0600s, C0663b c0663b) {
        C1236E c1236e = this.f10546s;
        f0 a3 = AbstractC1239H.a(c1236e);
        L.d u3 = c1236e.u();
        int i2 = u3.f4620j;
        if (i2 > 0) {
            Object[] objArr = u3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e2 = (C1236E) objArr[i3];
                if (c1236e2.E()) {
                    c1236e2.j(interfaceC0600s, c0663b);
                }
                i3++;
            } while (i3 < i2);
        }
        if (((C1314v) a3).getShowLayoutBounds()) {
            M0(interfaceC0600s, f10625U);
        }
    }

    @Override // t0.Z
    public final void g1(long j3, float f3, C0663b c0663b) {
        if (this.f10547t) {
            O R02 = R0();
            z2.h.c(R02);
            h1(R02.f10491t, f3, null, c0663b);
        } else {
            h1(j3, f3, null, c0663b);
        }
        if (this.f10486n) {
            return;
        }
        e1();
        this.f10546s.f10379D.f10480r.B0();
    }

    @Override // r0.AbstractC1103Q
    public final void l0(long j3, float f3, y2.c cVar) {
        if (this.f10547t) {
            O R02 = R0();
            z2.h.c(R02);
            h1(R02.f10491t, f3, cVar, null);
        } else {
            h1(j3, f3, cVar, null);
        }
        if (this.f10486n) {
            return;
        }
        e1();
        this.f10546s.f10379D.f10480r.B0();
    }

    @Override // t0.N
    public final int s0(C1125n c1125n) {
        O o3 = this.f10627T;
        if (o3 != null) {
            return o3.s0(c1125n);
        }
        C1242K c1242k = this.f10546s.f10379D.f10480r;
        boolean z3 = c1242k.f10456s;
        C1237F c1237f = c1242k.f10439B;
        if (!z3) {
            L l3 = c1242k.f10450O;
            if (l3.f10466c == 1) {
                c1237f.f10410f = true;
                if (c1237f.f10406b) {
                    l3.f10468e = true;
                    l3.f10469f = true;
                }
            } else {
                c1237f.f10411g = true;
            }
        }
        c1242k.T().f10487o = true;
        c1242k.g();
        c1242k.T().f10487o = false;
        Integer num = (Integer) c1237f.f10413i.get(c1125n);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
