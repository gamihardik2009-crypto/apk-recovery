package m;

import J.C0257c;
import J.C0266g0;
import J.C0274k0;
import J2.InterfaceC0310g;
import j.C0767w;
import m2.C0880v;
import n1.C0945f;
import n2.AbstractC0959k;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class W extends G.s {

    /* renamed from: y, reason: collision with root package name */
    public static final C0842o f8370y = new C0842o(0.0f);

    /* renamed from: z, reason: collision with root package name */
    public static final C0842o f8371z = new C0842o(1.0f);

    /* renamed from: i, reason: collision with root package name */
    public final C0274k0 f8372i;

    /* renamed from: j, reason: collision with root package name */
    public final C0274k0 f8373j;

    /* renamed from: k, reason: collision with root package name */
    public Object f8374k;

    /* renamed from: l, reason: collision with root package name */
    public p0 f8375l;

    /* renamed from: m, reason: collision with root package name */
    public long f8376m;

    /* renamed from: n, reason: collision with root package name */
    public final B.y f8377n;

    /* renamed from: o, reason: collision with root package name */
    public final C0266g0 f8378o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0310g f8379p;
    public final S2.d q;

    /* renamed from: r, reason: collision with root package name */
    public final J f8380r;

    /* renamed from: s, reason: collision with root package name */
    public long f8381s;

    /* renamed from: t, reason: collision with root package name */
    public final C0767w f8382t;

    /* renamed from: u, reason: collision with root package name */
    public K f8383u;

    /* renamed from: v, reason: collision with root package name */
    public final L f8384v;

    /* renamed from: w, reason: collision with root package name */
    public float f8385w;

    /* renamed from: x, reason: collision with root package name */
    public final L f8386x;

    public W(C0945f c0945f) {
        super(2);
        J.W w2 = J.W.f4109m;
        this.f8372i = C0257c.N(c0945f, w2);
        this.f8373j = C0257c.N(c0945f, w2);
        this.f8374k = c0945f;
        this.f8377n = new B.y(25, this);
        this.f8378o = C0257c.L(0.0f);
        this.q = S2.e.a();
        this.f8380r = new J();
        this.f8381s = Long.MIN_VALUE;
        this.f8382t = new C0767w();
        this.f8384v = new L(this, 1);
        this.f8386x = new L(this, 0);
    }

    public static final void m(W w2) {
        p0 p0Var = w2.f8375l;
        if (p0Var == null) {
            return;
        }
        K k3 = w2.f8383u;
        if (k3 == null) {
            if (w2.f8376m > 0) {
                C0266g0 c0266g0 = w2.f8378o;
                if (c0266g0.g() != 1.0f && !z2.h.a(w2.f8373j.getValue(), w2.f8372i.getValue())) {
                    K k4 = new K();
                    k4.f8321d = c0266g0.g();
                    long j3 = w2.f8376m;
                    k4.f8324g = j3;
                    k4.f8325h = B2.a.E((1.0d - c0266g0.g()) * j3);
                    k4.f8322e.e(c0266g0.g(), 0);
                    k3 = k4;
                }
            }
            k3 = null;
        }
        if (k3 != null) {
            k3.f8324g = w2.f8376m;
            w2.f8382t.a(k3);
            p0Var.n(k3);
        }
        w2.f8383u = null;
    }

    public static final void n(W w2, K k3, long j3) {
        w2.getClass();
        long j4 = k3.f8318a + j3;
        k3.f8318a = j4;
        long j5 = k3.f8325h;
        if (j4 >= j5) {
            k3.f8321d = 1.0f;
            return;
        }
        z0 z0Var = k3.f8319b;
        if (z0Var == null) {
            float a3 = k3.f8322e.a(0);
            float f3 = j4 / j5;
            x0 x0Var = y0.f8602a;
            k3.f8321d = (1.0f * f3) + ((1 - f3) * a3);
            return;
        }
        C0842o c0842o = f8371z;
        C0842o c0842o2 = k3.f8323f;
        if (c0842o2 == null) {
            c0842o2 = f8370y;
        }
        k3.f8321d = B1.C.B(((C0842o) z0Var.g(j4, k3.f8322e, c0842o, c0842o2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(m.W r10, q2.InterfaceC1073d r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof m.O
            if (r0 == 0) goto L16
            r0 = r11
            m.O r0 = (m.O) r0
            int r1 = r0.f8342n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8342n = r1
            goto L1b
        L16:
            m.O r0 = new m.O
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f8340l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8342n
            m2.v r3 = m2.C0880v.f8657a
            r4 = 2
            r5 = 1
            r6 = -9223372036854775808
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            goto L36
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            m.W r10 = r0.f8339k
            C1.y.J(r11)
            goto L79
        L3c:
            C1.y.J(r11)
            j.w r11 = r10.f8382t
            int r11 = r11.f8058b
            if (r11 != 0) goto L4b
            m.K r11 = r10.f8383u
            if (r11 != 0) goto L4b
        L49:
            r1 = r3
            goto L92
        L4b:
            q2.i r11 = r0.f10205i
            z2.h.c(r11)
            float r2 = m.AbstractC0831e.l(r11)
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L5f
            r10.s()
            r10.f8381s = r6
            goto L49
        L5f:
            long r8 = r10.f8381s
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L79
            r0.f8339k = r10
            r0.f8342n = r5
            z2.h.c(r11)
            J.X r11 = J.C0257c.H(r11)
            m.L r2 = r10.f8384v
            java.lang.Object r11 = r11.d(r2, r0)
            if (r11 != r1) goto L79
            goto L92
        L79:
            j.w r11 = r10.f8382t
            int r11 = r11.f8058b
            if (r11 == 0) goto L80
            goto L84
        L80:
            m.K r11 = r10.f8383u
            if (r11 == 0) goto L8f
        L84:
            r0.f8339k = r10
            r0.f8342n = r4
            java.lang.Object r11 = r10.r(r0)
            if (r11 != r1) goto L79
            goto L92
        L8f:
            r10.f8381s = r6
            goto L49
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.W.o(m.W, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(m.W r7, q2.InterfaceC1073d r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof m.U
            if (r0 == 0) goto L16
            r0 = r8
            m.U r0 = (m.U) r0
            int r1 = r0.f8364o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8364o = r1
            goto L1b
        L16:
            m.U r0 = new m.U
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f8362m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8364o
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.f8361l
            m.W r0 = r0.f8360k
            C1.y.J(r8)
            goto L80
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.f8361l
            m.W r2 = r0.f8360k
            C1.y.J(r8)
            r8 = r7
            r7 = r2
            goto L5c
        L44:
            C1.y.J(r8)
            J.k0 r8 = r7.f8372i
            java.lang.Object r8 = r8.getValue()
            r0.f8360k = r7
            r0.f8361l = r8
            r0.f8364o = r5
            S2.d r2 = r7.q
            java.lang.Object r2 = r2.c(r3, r0)
            if (r2 != r1) goto L5c
            goto L88
        L5c:
            r0.f8360k = r7
            r0.f8361l = r8
            r0.f8364o = r4
            J2.h r2 = new J2.h
            q2.d r0 = n2.AbstractC0948C.i(r0)
            r2.<init>(r5, r0)
            r2.r()
            r7.f8379p = r2
            S2.d r0 = r7.q
            r0.d(r3)
            java.lang.Object r0 = r2.q()
            if (r0 != r1) goto L7c
            goto L88
        L7c:
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r6
        L80:
            boolean r7 = z2.h.a(r8, r7)
            if (r7 == 0) goto L89
            m2.v r1 = m2.C0880v.f8657a
        L88:
            return r1
        L89:
            r7 = -9223372036854775808
            r0.f8381s = r7
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "targetState while waiting for composition"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m.W.p(m.W, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(m.W r7, q2.InterfaceC1073d r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof m.V
            if (r0 == 0) goto L16
            r0 = r8
            m.V r0 = (m.V) r0
            int r1 = r0.f8369o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8369o = r1
            goto L1b
        L16:
            m.V r0 = new m.V
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f8367m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8369o
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.f8366l
            m.W r0 = r0.f8365k
            C1.y.J(r8)
            goto L89
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.f8366l
            m.W r2 = r0.f8365k
            C1.y.J(r8)
            goto L5c
        L42:
            C1.y.J(r8)
            J.k0 r8 = r7.f8372i
            java.lang.Object r8 = r8.getValue()
            r0.f8365k = r7
            r0.f8366l = r8
            r0.f8369o = r5
            S2.d r2 = r7.q
            java.lang.Object r2 = r2.c(r3, r0)
            if (r2 != r1) goto L5a
            goto L91
        L5a:
            r2 = r7
            r7 = r8
        L5c:
            java.lang.Object r8 = r2.f8374k
            boolean r8 = z2.h.a(r7, r8)
            S2.d r6 = r2.q
            if (r8 == 0) goto L6a
            r6.d(r3)
            goto L8f
        L6a:
            r0.f8365k = r2
            r0.f8366l = r7
            r0.f8369o = r4
            J2.h r8 = new J2.h
            q2.d r0 = n2.AbstractC0948C.i(r0)
            r8.<init>(r5, r0)
            r8.r()
            r2.f8379p = r8
            r6.d(r3)
            java.lang.Object r8 = r8.q()
            if (r8 != r1) goto L88
            goto L91
        L88:
            r0 = r2
        L89:
            boolean r1 = z2.h.a(r8, r7)
            if (r1 == 0) goto L92
        L8f:
            m2.v r1 = m2.C0880v.f8657a
        L91:
            return r1
        L92:
            r1 = -9223372036854775808
            r0.f8381s = r1
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " instead of "
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.W.q(m.W, q2.d):java.lang.Object");
    }

    @Override // G.s
    public final Object g() {
        return this.f8373j.getValue();
    }

    @Override // G.s
    public final Object h() {
        return this.f8372i.getValue();
    }

    @Override // G.s
    public final void j(Object obj) {
        this.f8373j.setValue(obj);
    }

    @Override // G.s
    public final void k(p0 p0Var) {
        p0 p0Var2 = this.f8375l;
        if (p0Var2 == null || z2.h.a(p0Var, p0Var2)) {
            this.f8375l = p0Var;
            return;
        }
        throw new IllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f8375l + ", new instance: " + p0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:4:0x0010, B:6:0x0018, B:9:0x007d, B:12:0x0087, B:14:0x008a, B:16:0x009a, B:18:0x008f, B:22:0x002b, B:25:0x0037, B:27:0x004c, B:29:0x0058, B:31:0x0062, B:33:0x006f, B:39:0x0077, B:42:0x009f), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    @Override // G.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r22 = this;
            r1 = r22
            r0 = 0
            r1.f8375l = r0
            m2.d r2 = m.v0.f8587a
            java.lang.Object r2 = r2.getValue()
            T.w r2 = (T.w) r2
            L.d r3 = r2.f5751f
            monitor-enter(r3)
            L.d r2 = r2.f5751f     // Catch: java.lang.Throwable -> L98
            int r4 = r2.f4620j     // Catch: java.lang.Throwable -> L98
            r6 = 0
            r7 = 0
        L16:
            if (r6 >= r4) goto L9f
            java.lang.Object[] r8 = r2.f4618h     // Catch: java.lang.Throwable -> L98
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L98
            T.v r8 = (T.v) r8     // Catch: java.lang.Throwable -> L98
            j.y r9 = r8.f5739f     // Catch: java.lang.Throwable -> L98
            java.lang.Object r9 = r9.g(r1)     // Catch: java.lang.Throwable -> L98
            j.v r9 = (j.C0766v) r9     // Catch: java.lang.Throwable -> L98
            if (r9 != 0) goto L2b
        L28:
            r16 = r6
            goto L7d
        L2b:
            java.lang.Object[] r10 = r9.f8052b     // Catch: java.lang.Throwable -> L98
            int[] r11 = r9.f8053c     // Catch: java.lang.Throwable -> L98
            long[] r9 = r9.f8051a     // Catch: java.lang.Throwable -> L98
            int r12 = r9.length     // Catch: java.lang.Throwable -> L98
            int r12 = r12 + (-2)
            if (r12 < 0) goto L28
            r13 = 0
        L37:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L98
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L98
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L75
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L98
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r0 = 0
        L56:
            if (r0 >= r5) goto L73
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L6f
            int r18 = r13 << 3
            int r18 = r18 + r0
            r6 = r10[r18]     // Catch: java.lang.Throwable -> L98
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L98
            r8.d(r1, r6)     // Catch: java.lang.Throwable -> L98
            r6 = 8
        L6f:
            long r14 = r14 >> r6
            int r0 = r0 + 1
            goto L56
        L73:
            if (r5 != r6) goto L7d
        L75:
            if (r13 == r12) goto L7d
            int r13 = r13 + 1
            r6 = r16
            r0 = 0
            goto L37
        L7d:
            j.y r0 = r8.f5739f     // Catch: java.lang.Throwable -> L98
            int r0 = r0.f8069e     // Catch: java.lang.Throwable -> L98
            r5 = 1
            if (r0 == 0) goto L86
            r0 = r5
            goto L87
        L86:
            r0 = 0
        L87:
            r0 = r0 ^ r5
            if (r0 == 0) goto L8d
            int r7 = r7 + 1
            goto L9a
        L8d:
            if (r7 <= 0) goto L9a
            java.lang.Object[] r0 = r2.f4618h     // Catch: java.lang.Throwable -> L98
            int r6 = r16 - r7
            r5 = r0[r16]     // Catch: java.lang.Throwable -> L98
            r0[r6] = r5     // Catch: java.lang.Throwable -> L98
            goto L9a
        L98:
            r0 = move-exception
            goto Lab
        L9a:
            int r6 = r16 + 1
            r0 = 0
            goto L16
        L9f:
            java.lang.Object[] r0 = r2.f4618h     // Catch: java.lang.Throwable -> L98
            int r5 = r4 - r7
            r6 = 0
            n2.AbstractC0959k.u(r0, r6, r5, r4)     // Catch: java.lang.Throwable -> L98
            r2.f4620j = r5     // Catch: java.lang.Throwable -> L98
            monitor-exit(r3)
            return
        Lab:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.W.l():void");
    }

    public final Object r(InterfaceC1073d interfaceC1073d) {
        float l3 = AbstractC0831e.l(interfaceC1073d.n());
        C0880v c0880v = C0880v.f8657a;
        if (l3 <= 0.0f) {
            s();
            return c0880v;
        }
        this.f8385w = l3;
        Object d3 = C0257c.H(interfaceC1073d.n()).d(this.f8386x, interfaceC1073d);
        return d3 == EnumC1145a.f10026h ? d3 : c0880v;
    }

    public final void s() {
        p0 p0Var = this.f8375l;
        if (p0Var != null) {
            p0Var.c();
        }
        C0767w c0767w = this.f8382t;
        AbstractC0959k.u(c0767w.f8057a, null, 0, c0767w.f8058b);
        c0767w.f8058b = 0;
        if (this.f8383u != null) {
            this.f8383u = null;
            v(1.0f);
            u();
        }
    }

    public final Object t(float f3, Object obj, InterfaceC1073d interfaceC1073d) {
        if (0.0f > f3 || f3 > 1.0f) {
            throw new IllegalArgumentException("Expecting fraction between 0 and 1. Got " + f3);
        }
        p0 p0Var = this.f8375l;
        C0880v c0880v = C0880v.f8657a;
        if (p0Var == null) {
            return c0880v;
        }
        Object a3 = J.a(this.f8380r, new S(obj, this.f8372i.getValue(), this, p0Var, f3, null), interfaceC1073d);
        return a3 == EnumC1145a.f10026h ? a3 : c0880v;
    }

    public final void u() {
        p0 p0Var = this.f8375l;
        if (p0Var == null) {
            return;
        }
        p0Var.m(B2.a.E(this.f8378o.g() * ((Number) p0Var.f8559m.getValue()).longValue()));
    }

    public final void v(float f3) {
        this.f8378o.h(f3);
    }
}
