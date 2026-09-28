package D0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f973a;

    /* renamed from: b, reason: collision with root package name */
    public float f974b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f975c;

    public n(int i2, z0.e eVar) {
        this.f973a = i2;
        this.f975c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r5.f975c
            D0.D r2 = (D0.D) r2
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r2.f949f
            int r3 = D0.y.c(r3, r6, r7)
            android.text.Layout r4 = r2.f949f
            int r4 = r4.getLineStart(r3)
            int r3 = r2.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r1
            goto L20
        L1f:
            r3 = r0
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r0 = r1
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r0 = 2
            goto L2d
        L2c:
            r0 = 3
        L2d:
            int r4 = r4 + r0
            int r0 = r5.f973a
            if (r0 != r4) goto L35
            float r6 = r5.f974b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r2.h(r6, r7)
            goto L40
        L3c:
            float r6 = r2.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.f973a = r4
            r5.f974b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.n.a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(float r5, q2.InterfaceC1073d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof z0.h
            if (r0 == 0) goto L13
            r0 = r6
            z0.h r0 = (z0.h) r0
            int r1 = r0.f11881n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11881n = r1
            goto L18
        L13:
            z0.h r0 = new z0.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11879l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f11881n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            D0.n r5 = r0.f11878k
            C1.y.J(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            C1.y.J(r6)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.f11878k = r4
            r0.f11881n = r3
            java.lang.Object r5 = r4.f975c
            y2.e r5 = (y2.e) r5
            java.lang.Object r6 = r5.j(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.f974b
            float r0 = r0 + r6
            r5.f974b = r0
            m2.v r5 = m2.C0880v.f8657a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.n.b(float, q2.d):java.lang.Object");
    }

    public n(D d3) {
        this.f975c = d3;
        this.f973a = -1;
    }
}
