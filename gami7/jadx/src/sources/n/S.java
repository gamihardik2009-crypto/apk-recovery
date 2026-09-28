package n;

import n0.AbstractC0937p;
import n0.C0930i;
import n0.EnumC0931j;

/* loaded from: classes.dex */
public final class S extends V.n implements t0.k0 {

    /* renamed from: u, reason: collision with root package name */
    public r.l f8714u;

    /* renamed from: v, reason: collision with root package name */
    public r.h f8715v;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K0(n.S r4, q2.InterfaceC1073d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof n.N
            if (r0 == 0) goto L16
            r0 = r5
            n.N r0 = (n.N) r0
            int r1 = r0.f8705o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8705o = r1
            goto L1b
        L16:
            n.N r0 = new n.N
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f8703m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8705o
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            r.h r4 = r0.f8702l
            n.S r0 = r0.f8701k
            C1.y.J(r5)
            r5 = r4
            r4 = r0
            goto L53
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            C1.y.J(r5)
            r.h r5 = r4.f8715v
            if (r5 != 0) goto L55
            r.h r5 = new r.h
            r5.<init>()
            r.l r2 = r4.f8714u
            r0.f8701k = r4
            r0.f8702l = r5
            r0.f8705o = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L53
            goto L57
        L53:
            r4.f8715v = r5
        L55:
            m2.v r1 = m2.C0880v.f8657a
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.S.K0(n.S, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L0(n.S r4, q2.InterfaceC1073d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof n.O
            if (r0 == 0) goto L16
            r0 = r5
            n.O r0 = (n.O) r0
            int r1 = r0.f8709n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8709n = r1
            goto L1b
        L16:
            n.O r0 = new n.O
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f8707l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8709n
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            n.S r4 = r0.f8706k
            C1.y.J(r5)
            goto L4d
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            C1.y.J(r5)
            r.h r5 = r4.f8715v
            if (r5 == 0) goto L50
            r.i r2 = new r.i
            r2.<init>(r5)
            r.l r5 = r4.f8714u
            r0.f8706k = r4
            r0.f8709n = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L4d
            goto L52
        L4d:
            r5 = 0
            r4.f8715v = r5
        L50:
            m2.v r1 = m2.C0880v.f8657a
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.S.L0(n.S, q2.d):java.lang.Object");
    }

    @Override // V.n
    public final void D0() {
        M0();
    }

    public final void M0() {
        r.h hVar = this.f8715v;
        if (hVar != null) {
            this.f8714u.c(new r.i(hVar));
            this.f8715v = null;
        }
    }

    @Override // t0.k0
    public final void Y() {
        M0();
    }

    @Override // t0.k0
    public final void t0(C0930i c0930i, EnumC0931j enumC0931j, long j3) {
        if (enumC0931j == EnumC0931j.f8947i) {
            int i2 = c0930i.f8945c;
            if (AbstractC0937p.d(i2, 4)) {
                J2.B.r(y0(), null, 0, new P(this, null), 3);
            } else if (AbstractC0937p.d(i2, 5)) {
                J2.B.r(y0(), null, 0, new Q(this, null), 3);
            }
        }
    }
}
