package m0;

import B.y;
import J2.InterfaceC0328z;
import Q1.r;
import V.n;
import p.C1028l0;
import t0.AbstractC1248f;
import t0.p0;

/* loaded from: classes.dex */
public final class f extends n implements p0, InterfaceC0853a {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0853a f8631u;

    /* renamed from: v, reason: collision with root package name */
    public final r f8632v;

    /* renamed from: w, reason: collision with root package name */
    public final String f8633w = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public f(C1028l0 c1028l0, r rVar) {
        this.f8631u = c1028l0;
        this.f8632v = rVar;
    }

    @Override // V.n
    public final void C0() {
        r rVar = this.f8632v;
        rVar.f5322b = this;
        rVar.f5323c = new y(27, this);
        rVar.f5324d = y0();
    }

    @Override // V.n
    public final void D0() {
        r rVar = this.f8632v;
        if (((f) rVar.f5322b) == this) {
            rVar.f5322b = null;
        }
    }

    @Override // m0.InterfaceC0853a
    public final long K(long j3, long j4, int i2) {
        long K3 = this.f8631u.K(j3, j4, i2);
        boolean z3 = this.f5869t;
        f fVar = null;
        if (z3 && z3) {
            fVar = (f) AbstractC1248f.k(this);
        }
        f fVar2 = fVar;
        return b0.c.h(K3, fVar2 != null ? fVar2.K(b0.c.h(j3, K3), b0.c.g(j4, K3), i2) : 0L);
    }

    public final InterfaceC0328z K0() {
        f fVar = this.f5869t ? (f) AbstractC1248f.k(this) : null;
        if (fVar != null) {
            return fVar.K0();
        }
        InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f8632v.f5324d;
        if (interfaceC0328z != null) {
            return interfaceC0328z;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // m0.InterfaceC0853a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(long r16, long r18, q2.InterfaceC1073d r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof m0.d
            if (r2 == 0) goto L16
            r2 = r1
            m0.d r2 = (m0.d) r2
            int r3 = r2.f8625p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f8625p = r3
            goto L1b
        L16:
            m0.d r2 = new m0.d
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.f8623n
            r2.a r9 = r2.EnumC1145a.f10026h
            int r3 = r2.f8625p
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L44
            if (r3 == r4) goto L38
            if (r3 != r10) goto L30
            long r2 = r2.f8621l
            C1.y.J(r1)
            goto L92
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            long r3 = r2.f8622m
            long r5 = r2.f8621l
            m0.f r7 = r2.f8620k
            C1.y.J(r1)
            r13 = r3
            r11 = r5
            goto L62
        L44:
            C1.y.J(r1)
            r2.f8620k = r0
            r11 = r16
            r2.f8621l = r11
            r13 = r18
            r2.f8622m = r13
            r2.f8625p = r4
            m0.a r3 = r0.f8631u
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.L(r4, r6, r8)
            if (r1 != r9) goto L61
            return r9
        L61:
            r7 = r0
        L62:
            O0.o r1 = (O0.o) r1
            long r4 = r1.f5156a
            boolean r1 = r7.f5869t
            r3 = 0
            if (r1 == 0) goto L74
            if (r1 == 0) goto L74
            t0.p0 r1 = t0.AbstractC1248f.k(r7)
            m0.f r1 = (m0.f) r1
            goto L75
        L74:
            r1 = r3
        L75:
            if (r1 == 0) goto L98
            long r6 = O0.o.e(r11, r4)
            long r11 = O0.o.d(r13, r4)
            r2.f8620k = r3
            r2.f8621l = r4
            r2.f8625p = r10
            r3 = r1
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.L(r4, r6, r8)
            if (r1 != r9) goto L91
            return r9
        L91:
            r2 = r13
        L92:
            O0.o r1 = (O0.o) r1
            long r4 = r1.f5156a
            r13 = r2
            goto L9b
        L98:
            r13 = r4
            r4 = 0
        L9b:
            long r1 = O0.o.e(r13, r4)
            O0.o r3 = new O0.o
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.f.L(long, long, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // m0.InterfaceC0853a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(long r10, q2.InterfaceC1073d r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof m0.e
            if (r0 == 0) goto L13
            r0 = r12
            m0.e r0 = (m0.e) r0
            int r1 = r0.f8630o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8630o = r1
            goto L18
        L13:
            m0.e r0 = new m0.e
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f8628m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8630o
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            long r10 = r0.f8627l
            C1.y.J(r12)
            goto L7d
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            long r10 = r0.f8627l
            m0.f r2 = r0.f8626k
            C1.y.J(r12)
            goto L5e
        L3d:
            C1.y.J(r12)
            boolean r12 = r9.f5869t
            if (r12 == 0) goto L4d
            if (r12 == 0) goto L4d
            t0.p0 r12 = t0.AbstractC1248f.k(r9)
            m0.f r12 = (m0.f) r12
            goto L4e
        L4d:
            r12 = r3
        L4e:
            if (r12 == 0) goto L66
            r0.f8626k = r9
            r0.f8627l = r10
            r0.f8630o = r5
            java.lang.Object r12 = r12.T(r10, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            r2 = r9
        L5e:
            O0.o r12 = (O0.o) r12
            long r5 = r12.f5156a
        L62:
            r7 = r10
            r10 = r5
            r5 = r7
            goto L6a
        L66:
            r5 = 0
            r2 = r9
            goto L62
        L6a:
            m0.a r12 = r2.f8631u
            long r5 = O0.o.d(r5, r10)
            r0.f8626k = r3
            r0.f8627l = r10
            r0.f8630o = r4
            java.lang.Object r12 = r12.T(r5, r0)
            if (r12 != r1) goto L7d
            return r1
        L7d:
            O0.o r12 = (O0.o) r12
            long r0 = r12.f5156a
            long r10 = O0.o.e(r10, r0)
            O0.o r12 = new O0.o
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.f.T(long, q2.d):java.lang.Object");
    }

    @Override // m0.InterfaceC0853a
    public final long r(long j3, int i2) {
        boolean z3 = this.f5869t;
        f fVar = null;
        if (z3 && z3) {
            fVar = (f) AbstractC1248f.k(this);
        }
        long r3 = fVar != null ? fVar.r(j3, i2) : 0L;
        return b0.c.h(r3, this.f8631u.r(b0.c.g(j3, r3), i2));
    }

    @Override // t0.p0
    public final Object w() {
        return this.f8633w;
    }
}
