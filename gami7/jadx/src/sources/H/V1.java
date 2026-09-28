package H;

import m.C0829d;

/* loaded from: classes.dex */
public final class V1 {

    /* renamed from: a, reason: collision with root package name */
    public float f2072a;

    /* renamed from: b, reason: collision with root package name */
    public float f2073b;

    /* renamed from: c, reason: collision with root package name */
    public float f2074c;

    /* renamed from: d, reason: collision with root package name */
    public float f2075d;

    /* renamed from: e, reason: collision with root package name */
    public final C0829d f2076e;

    /* renamed from: f, reason: collision with root package name */
    public r.j f2077f;

    /* renamed from: g, reason: collision with root package name */
    public r.j f2078g;

    public V1(float f3, float f4, float f5, float f6) {
        this.f2072a = f3;
        this.f2073b = f4;
        this.f2074c = f5;
        this.f2075d = f6;
        this.f2076e = new C0829d(new O0.e(f3), m.y0.f8604c, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(r.j r6, q2.InterfaceC1073d r7) {
        /*
            r5 = this;
            m.d r0 = r5.f2076e
            boolean r1 = r7 instanceof H.T1
            if (r1 == 0) goto L15
            r1 = r7
            H.T1 r1 = (H.T1) r1
            int r2 = r1.f2004o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f2004o = r2
            goto L1a
        L15:
            H.T1 r1 = new H.T1
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.f2002m
            r2.a r2 = r2.EnumC1145a.f10026h
            int r3 = r1.f2004o
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            r.j r6 = r1.f2001l
            H.V1 r0 = r1.f2000k
            C1.y.J(r7)     // Catch: java.lang.Throwable -> L2d
            goto L76
        L2d:
            r7 = move-exception
            goto L7b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            C1.y.J(r7)
            boolean r7 = r6 instanceof r.n
            if (r7 == 0) goto L41
            float r7 = r5.f2073b
            goto L51
        L41:
            boolean r7 = r6 instanceof r.h
            if (r7 == 0) goto L48
            float r7 = r5.f2074c
            goto L51
        L48:
            boolean r7 = r6 instanceof r.C1084d
            if (r7 == 0) goto L4f
            float r7 = r5.f2075d
            goto L51
        L4f:
            float r7 = r5.f2072a
        L51:
            r5.f2078g = r6
            J.k0 r3 = r0.f8426e     // Catch: java.lang.Throwable -> L72
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L72
            O0.e r3 = (O0.e) r3     // Catch: java.lang.Throwable -> L72
            float r3 = r3.f5138h     // Catch: java.lang.Throwable -> L72
            boolean r3 = O0.e.a(r3, r7)     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L75
            r.j r3 = r5.f2077f     // Catch: java.lang.Throwable -> L72
            r1.f2000k = r5     // Catch: java.lang.Throwable -> L72
            r1.f2001l = r6     // Catch: java.lang.Throwable -> L72
            r1.f2004o = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = H.I1.a(r0, r7, r3, r6, r1)     // Catch: java.lang.Throwable -> L72
            if (r7 != r2) goto L75
            return r2
        L72:
            r7 = move-exception
            r0 = r5
            goto L7b
        L75:
            r0 = r5
        L76:
            r0.f2077f = r6
            m2.v r6 = m2.C0880v.f8657a
            return r6
        L7b:
            r0.f2077f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H.V1.a(r.j, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(q2.InterfaceC1073d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof H.U1
            if (r0 == 0) goto L13
            r0 = r6
            H.U1 r0 = (H.U1) r0
            int r1 = r0.f2040n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2040n = r1
            goto L18
        L13:
            H.U1 r0 = new H.U1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2038l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f2040n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            H.V1 r0 = r0.f2037k
            C1.y.J(r6)     // Catch: java.lang.Throwable -> L29
            goto L72
        L29:
            r6 = move-exception
            goto L79
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            C1.y.J(r6)
            r.j r6 = r5.f2078g
            boolean r2 = r6 instanceof r.n
            if (r2 == 0) goto L3f
            float r6 = r5.f2073b
            goto L4f
        L3f:
            boolean r2 = r6 instanceof r.h
            if (r2 == 0) goto L46
            float r6 = r5.f2074c
            goto L4f
        L46:
            boolean r6 = r6 instanceof r.C1084d
            if (r6 == 0) goto L4d
            float r6 = r5.f2075d
            goto L4f
        L4d:
            float r6 = r5.f2072a
        L4f:
            m.d r2 = r5.f2076e
            J.k0 r4 = r2.f8426e
            java.lang.Object r4 = r4.getValue()
            O0.e r4 = (O0.e) r4
            float r4 = r4.f5138h
            boolean r4 = O0.e.a(r4, r6)
            if (r4 != 0) goto L7e
            O0.e r4 = new O0.e     // Catch: java.lang.Throwable -> L77
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77
            r0.f2037k = r5     // Catch: java.lang.Throwable -> L77
            r0.f2040n = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L77
            if (r6 != r1) goto L71
            return r1
        L71:
            r0 = r5
        L72:
            r.j r6 = r0.f2078g
            r0.f2077f = r6
            goto L7e
        L77:
            r6 = move-exception
            r0 = r5
        L79:
            r.j r1 = r0.f2078g
            r0.f2077f = r1
            throw r6
        L7e:
            m2.v r6 = m2.C0880v.f8657a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: H.V1.b(q2.d):java.lang.Object");
    }
}
