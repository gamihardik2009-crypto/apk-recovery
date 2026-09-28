package p;

import n0.C0921D;
import n0.C0930i;
import n0.EnumC0931j;
import q2.InterfaceC1073d;
import r.C1081a;
import r.C1082b;
import t0.AbstractC1256n;
import t0.InterfaceC1254l;

/* loaded from: classes.dex */
public abstract class M extends AbstractC1256n implements t0.k0, InterfaceC1254l {

    /* renamed from: A, reason: collision with root package name */
    public L2.k f9464A;

    /* renamed from: B, reason: collision with root package name */
    public C1082b f9465B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f9466C;

    /* renamed from: D, reason: collision with root package name */
    public C0921D f9467D;

    /* renamed from: w, reason: collision with root package name */
    public X f9468w;

    /* renamed from: x, reason: collision with root package name */
    public y2.c f9469x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9470y;

    /* renamed from: z, reason: collision with root package name */
    public r.l f9471z;

    public M(y2.c cVar, boolean z3, r.l lVar, X x2) {
        this.f9468w = x2;
        this.f9469x = cVar;
        this.f9470y = z3;
        this.f9471z = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N0(p.M r5, q2.InterfaceC1073d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof p.H
            if (r0 == 0) goto L16
            r0 = r6
            p.H r0 = (p.H) r0
            int r1 = r0.f9425n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f9425n = r1
            goto L1b
        L16:
            p.H r0 = new p.H
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f9423l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9425n
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            p.M r5 = r0.f9422k
            C1.y.J(r6)
            goto L4f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            C1.y.J(r6)
            r.b r6 = r5.f9465B
            if (r6 == 0) goto L52
            r.l r2 = r5.f9471z
            if (r2 == 0) goto L4f
            r.a r4 = new r.a
            r4.<init>(r6)
            r0.f9422k = r5
            r0.f9425n = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 != r1) goto L4f
            goto L59
        L4f:
            r6 = 0
            r5.f9465B = r6
        L52:
            r0 = 0
            r5.T0(r0)
            m2.v r1 = m2.C0880v.f8657a
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.M.N0(p.M, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(p.M r6, p.C1044u r7, q2.InterfaceC1073d r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof p.I
            if (r0 == 0) goto L16
            r0 = r8
            p.I r0 = (p.I) r0
            int r1 = r0.f9435p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f9435p = r1
            goto L1b
        L16:
            p.I r0 = new p.I
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f9433n
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9435p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            r.b r6 = r0.f9432m
            p.u r7 = r0.f9431l
            p.M r0 = r0.f9430k
            C1.y.J(r8)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            p.u r7 = r0.f9431l
            p.M r6 = r0.f9430k
            C1.y.J(r8)
            goto L60
        L43:
            C1.y.J(r8)
            r.b r8 = r6.f9465B
            if (r8 == 0) goto L60
            r.l r2 = r6.f9471z
            if (r2 == 0) goto L60
            r.a r5 = new r.a
            r5.<init>(r8)
            r0.f9430k = r6
            r0.f9431l = r7
            r0.f9435p = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 != r1) goto L60
            goto L85
        L60:
            r.b r8 = new r.b
            r8.<init>()
            r.l r2 = r6.f9471z
            if (r2 == 0) goto L7c
            r0.f9430k = r6
            r0.f9431l = r7
            r0.f9432m = r8
            r0.f9435p = r3
            java.lang.Object r0 = r2.b(r8, r0)
            if (r0 != r1) goto L78
            goto L85
        L78:
            r0 = r6
            r6 = r8
        L7a:
            r8 = r6
            r6 = r0
        L7c:
            r6.f9465B = r8
            long r7 = r7.f9686a
            r6.S0(r7)
            m2.v r1 = m2.C0880v.f8657a
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.M.O0(p.M, p.u, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P0(p.M r5, p.C1046v r6, q2.InterfaceC1073d r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof p.J
            if (r0 == 0) goto L16
            r0 = r7
            p.J r0 = (p.J) r0
            int r1 = r0.f9441o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f9441o = r1
            goto L1b
        L16:
            p.J r0 = new p.J
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f9439m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f9441o
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            p.v r6 = r0.f9438l
            p.M r5 = r0.f9437k
            C1.y.J(r7)
            goto L53
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            C1.y.J(r7)
            r.b r7 = r5.f9465B
            if (r7 == 0) goto L56
            r.l r2 = r5.f9471z
            if (r2 == 0) goto L53
            r.c r4 = new r.c
            r4.<init>(r7)
            r0.f9437k = r5
            r0.f9438l = r6
            r0.f9441o = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 != r1) goto L53
            goto L5d
        L53:
            r7 = 0
            r5.f9465B = r7
        L56:
            long r6 = r6.f9696a
            r5.T0(r6)
            m2.v r1 = m2.C0880v.f8657a
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.M.P0(p.M, p.v, q2.d):java.lang.Object");
    }

    @Override // V.n
    public final void D0() {
        this.f9466C = false;
        Q0();
    }

    public final void Q0() {
        C1082b c1082b = this.f9465B;
        if (c1082b != null) {
            r.l lVar = this.f9471z;
            if (lVar != null) {
                lVar.c(new C1081a(c1082b));
            }
            this.f9465B = null;
        }
    }

    public abstract Object R0(K k3, InterfaceC1073d interfaceC1073d);

    public abstract void S0(long j3);

    public abstract void T0(long j3);

    public abstract boolean U0();

    public final void V0(y2.c cVar, boolean z3, r.l lVar, X x2, boolean z4) {
        this.f9469x = cVar;
        if (this.f9470y != z3) {
            this.f9470y = z3;
            if (!z3) {
                Q0();
                C0921D c0921d = this.f9467D;
                if (c0921d != null) {
                    L0(c0921d);
                }
                this.f9467D = null;
            }
            z4 = true;
        }
        if (!z2.h.a(this.f9471z, lVar)) {
            Q0();
            this.f9471z = lVar;
        }
        if (this.f9468w != x2) {
            this.f9468w = x2;
        } else if (!z4) {
            return;
        }
        C0921D c0921d2 = this.f9467D;
        if (c0921d2 != null) {
            c0921d2.M0();
        }
    }

    @Override // t0.k0
    public final void Y() {
        C0921D c0921d = this.f9467D;
        if (c0921d != null) {
            c0921d.Y();
        }
    }

    @Override // t0.k0
    public void t0(C0930i c0930i, EnumC0931j enumC0931j, long j3) {
        if (this.f9470y && this.f9467D == null) {
            G g3 = new G(this, null);
            C0930i c0930i2 = n0.w.f8985a;
            C0921D c0921d = new C0921D(null, null, null, g3);
            K0(c0921d);
            this.f9467D = c0921d;
        }
        C0921D c0921d2 = this.f9467D;
        if (c0921d2 != null) {
            c0921d2.t0(c0930i, enumC0931j, j3);
        }
    }
}
