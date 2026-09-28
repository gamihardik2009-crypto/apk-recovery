package L2;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends z2.f implements y2.f {

    /* renamed from: p, reason: collision with root package name */
    public static final b f4692p = new b(3, g.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        return m2.C0880v.f8657a;
     */
    @Override // y2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            L2.g r10 = (L2.g) r10
            R2.f r11 = (R2.f) r11
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = L2.g.f4704k
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = L2.g.f4709p
            java.lang.Object r12 = r12.get(r10)
            L2.o r12 = (L2.o) r12
        L11:
            boolean r0 = r10.y()
            if (r0 == 0) goto L1e
            O2.v r10 = L2.i.f4727l
            R2.e r11 = (R2.e) r11
            r11.f5528l = r10
            goto L70
        L1e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = L2.g.f4705l
            long r6 = r0.getAndIncrement(r10)
            int r0 = L2.i.f4717b
            long r0 = (long) r0
            long r2 = r6 / r0
            long r0 = r6 % r0
            int r8 = (int) r0
            long r0 = r12.f5206j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3a
            L2.o r0 = r10.l(r2, r12)
            if (r0 != 0) goto L39
            goto L11
        L39:
            r12 = r0
        L3a:
            r0 = r10
            r1 = r12
            r2 = r8
            r3 = r6
            r5 = r11
            java.lang.Object r0 = r0.J(r1, r2, r3, r5)
            O2.v r1 = L2.i.f4728m
            if (r0 != r1) goto L55
            boolean r10 = r11 instanceof J2.w0
            if (r10 == 0) goto L4e
            J2.w0 r11 = (J2.w0) r11
            goto L4f
        L4e:
            r11 = 0
        L4f:
            if (r11 == 0) goto L70
            r11.a(r12, r8)
            goto L70
        L55:
            O2.v r1 = L2.i.f4730o
            if (r0 != r1) goto L65
            long r0 = r10.s()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L11
            r12.a()
            goto L11
        L65:
            O2.v r10 = L2.i.f4729n
            if (r0 == r10) goto L73
            r12.a()
            R2.e r11 = (R2.e) r11
            r11.f5528l = r0
        L70:
            m2.v r10 = m2.C0880v.f8657a
            return r10
        L73:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "unexpected"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
