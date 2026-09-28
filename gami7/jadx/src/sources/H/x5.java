package H;

import J.InterfaceC0258c0;

/* loaded from: classes.dex */
public final class x5 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3311i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M5 f3312j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f3313k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(M5 m5, InterfaceC0258c0 interfaceC0258c0, int i2) {
        super(1);
        this.f3311i = i2;
        this.f3312j = m5;
        this.f3313k = interfaceC0258c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (((int) (r5 >> 32)) == 0) goto L12;
     */
    @Override // y2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r14) {
        /*
            r13 = this;
            H.M5 r0 = r13.f3312j
            r1 = 32
            m2.v r2 = m2.C0880v.f8657a
            r3 = 2
            r4 = 1
            J.c0 r5 = r13.f3313k
            int r6 = r13.f3311i
            switch(r6) {
                case 0: goto L74;
                case 1: goto L50;
                case 2: goto L29;
                default: goto Lf;
            }
        Lf:
            r9 = r14
            I0.z r9 = (I0.z) r9
            float r14 = H.K5.f1682a
            java.lang.Object r14 = r5.getValue()
            r10 = r14
            I0.z r10 = (I0.z) r10
            H.w0 r12 = new H.w0
            r12.<init>(r5, r3)
            H.M5 r8 = r13.f3312j
            r11 = 59
            r7 = 1
            H.K5.i(r7, r8, r9, r10, r11, r12)
            return r2
        L29:
            l0.b r14 = (l0.b) r14
            android.view.KeyEvent r14 = r14.f8278a
            int r14 = r14.getUnicodeChar()
            r2 = 0
            if (r14 != 0) goto L45
            float r14 = H.K5.f1682a
            java.lang.Object r14 = r5.getValue()
            I0.z r14 = (I0.z) r14
            long r5 = r14.f3933b
            int r14 = C0.J.f472c
            long r5 = r5 >> r1
            int r14 = (int) r5
            if (r14 != 0) goto L45
            goto L46
        L45:
            r4 = r2
        L46:
            if (r4 == 0) goto L4b
            r0.g(r2)
        L4b:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)
            return r14
        L50:
            I0.z r14 = (I0.z) r14
            float r0 = H.K5.f1682a
            java.lang.Object r0 = r5.getValue()
            r6 = r0
            I0.z r6 = (I0.z) r6
            H.M5 r0 = r13.f3312j
            boolean r1 = r0.f1753a
            if (r1 == 0) goto L65
            r1 = 23
        L63:
            r7 = r1
            goto L68
        L65:
            r1 = 12
            goto L63
        L68:
            H.w0 r8 = new H.w0
            r8.<init>(r5, r4)
            r3 = 0
            r4 = r0
            r5 = r14
            H.K5.i(r3, r4, r5, r6, r7, r8)
            return r2
        L74:
            l0.b r14 = (l0.b) r14
            android.view.KeyEvent r14 = r14.f8278a
            int r14 = r14.getUnicodeChar()
            r2 = 48
            if (r2 > r14) goto La8
            r2 = 58
            if (r14 >= r2) goto La8
            float r14 = H.K5.f1682a
            java.lang.Object r14 = r5.getValue()
            I0.z r14 = (I0.z) r14
            long r6 = r14.f3933b
            int r14 = C0.J.f472c
            long r1 = r6 >> r1
            int r14 = (int) r1
            if (r14 != r3) goto La8
            java.lang.Object r14 = r5.getValue()
            I0.z r14 = (I0.z) r14
            C0.g r14 = r14.f3932a
            java.lang.String r14 = r14.f500a
            int r14 = r14.length()
            if (r14 != r3) goto La8
            r0.g(r4)
        La8:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: H.x5.l(java.lang.Object):java.lang.Object");
    }
}
