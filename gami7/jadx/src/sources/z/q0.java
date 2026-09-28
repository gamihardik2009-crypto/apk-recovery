package z;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11793a = 100000;

    /* renamed from: b, reason: collision with root package name */
    public Q1.m f11794b;

    /* renamed from: c, reason: collision with root package name */
    public Q1.m f11795c;

    /* renamed from: d, reason: collision with root package name */
    public int f11796d;

    /* renamed from: e, reason: collision with root package name */
    public Long f11797e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11798f;

    public static void b(q0 q0Var, I0.z zVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!q0Var.f11798f) {
            Long l3 = q0Var.f11797e;
            if (currentTimeMillis <= (l3 != null ? l3.longValue() : 0L) + 5000) {
                return;
            }
        }
        q0Var.f11797e = Long.valueOf(currentTimeMillis);
        q0Var.a(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[LOOP:0: B:26:0x0060->B:31:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[EDGE_INSN: B:32:0x0075->B:33:0x0075 BREAK  A[LOOP:0: B:26:0x0060->B:31:0x0070], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(I0.z r4) {
        /*
            r3 = this;
            r0 = 0
            r3.f11798f = r0
            Q1.m r0 = r3.f11794b
            r1 = 0
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.f5303b
            I0.z r0 = (I0.z) r0
            goto Le
        Ld:
            r0 = r1
        Le:
            boolean r0 = z2.h.a(r4, r0)
            if (r0 == 0) goto L15
            return
        L15:
            C0.g r0 = r4.f3932a
            java.lang.String r0 = r0.f500a
            Q1.m r2 = r3.f11794b
            if (r2 == 0) goto L28
            java.lang.Object r2 = r2.f5303b
            I0.z r2 = (I0.z) r2
            if (r2 == 0) goto L28
            C0.g r2 = r2.f3932a
            java.lang.String r2 = r2.f500a
            goto L29
        L28:
            r2 = r1
        L29:
            boolean r0 = z2.h.a(r0, r2)
            if (r0 == 0) goto L37
            Q1.m r0 = r3.f11794b
            if (r0 != 0) goto L34
            goto L36
        L34:
            r0.f5303b = r4
        L36:
            return
        L37:
            Q1.m r0 = r3.f11794b
            Q1.m r2 = new Q1.m
            r2.<init>(r0, r4)
            r3.f11794b = r2
            r3.f11795c = r1
            int r0 = r3.f11796d
            C0.g r4 = r4.f3932a
            java.lang.String r4 = r4.f500a
            int r4 = r4.length()
            int r4 = r4 + r0
            r3.f11796d = r4
            int r0 = r3.f11793a
            if (r4 <= r0) goto L7a
            Q1.m r4 = r3.f11794b
            if (r4 == 0) goto L5c
            java.lang.Object r0 = r4.f5302a
            Q1.m r0 = (Q1.m) r0
            goto L5d
        L5c:
            r0 = r1
        L5d:
            if (r0 != 0) goto L60
            goto L7a
        L60:
            if (r4 == 0) goto L6d
            java.lang.Object r0 = r4.f5302a
            Q1.m r0 = (Q1.m) r0
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r0.f5302a
            Q1.m r0 = (Q1.m) r0
            goto L6e
        L6d:
            r0 = r1
        L6e:
            if (r0 == 0) goto L75
            java.lang.Object r4 = r4.f5302a
            Q1.m r4 = (Q1.m) r4
            goto L60
        L75:
            if (r4 != 0) goto L78
            goto L7a
        L78:
            r4.f5302a = r1
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.q0.a(I0.z):void");
    }
}
