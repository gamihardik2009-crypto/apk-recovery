package H;

import m.C0850x;
import m.InterfaceC0840m;
import t.C1228w;

/* renamed from: H.s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193s4 implements p.U {

    /* renamed from: a, reason: collision with root package name */
    public final C1228w f3089a;

    /* renamed from: b, reason: collision with root package name */
    public final C0850x f3090b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0840m f3091c;

    /* renamed from: d, reason: collision with root package name */
    public final O0.b f3092d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3093e;

    /* renamed from: f, reason: collision with root package name */
    public final C0174p4 f3094f = new C0174p4(this);

    /* renamed from: g, reason: collision with root package name */
    public final float f3095g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public final float f3096h = 400;

    public C0193s4(C1228w c1228w, C0850x c0850x, m.Z z3, O0.b bVar) {
        this.f3089a = c1228w;
        this.f3090b = c0850x;
        this.f3091c = z3;
        this.f3092d = bVar;
        this.f3093e = bVar.P(this.f3096h);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(float r11, H.C0193s4 r12, p.InterfaceC1012d0 r13, q2.InterfaceC1073d r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0193s4.b(float, H.s4, p.d0, q2.d):java.lang.Object");
    }

    public static float e(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        return f4 > 0.0f ? B1.C.z(f3, f4) : B1.C.x(f3, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (java.lang.Math.abs(r6) <= java.lang.Math.abs(r5)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float f(float r13, t.C1228w r14) {
        /*
            t.n r14 = r14.h()
            java.util.List r0 = r14.f10296j
            int r1 = r0.size()
            r2 = 2139095040(0x7f800000, float:Infinity)
            r3 = -8388608(0xffffffffff800000, float:-Infinity)
            r4 = 0
            r6 = r2
            r5 = r3
        L11:
            r7 = 0
            if (r4 >= r1) goto L6f
            java.lang.Object r8 = r0.get(r4)
            t.o r8 = (t.C1220o) r8
            p.X r9 = p.X.f9518h
            p.X r10 = r14.f10300n
            r0.I r11 = r14.q
            if (r10 != r9) goto L36
            int r9 = r11.f()
            int r10 = r11.h()
            long r9 = l0.c.e(r9, r10)
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
        L34:
            int r9 = (int) r9
            goto L46
        L36:
            int r9 = r11.f()
            int r10 = r11.h()
            long r9 = l0.c.e(r9, r10)
            r11 = 32
            long r9 = r9 >> r11
            goto L34
        L46:
            int r10 = r14.f10297k
            int r10 = -r10
            int r9 = r9 - r10
            int r10 = r14.f10301o
            int r9 = r9 - r10
            float r9 = (float) r9
            r10 = 2
            float r10 = (float) r10
            float r9 = r9 / r10
            int r11 = r8.f10316n
            float r11 = (float) r11
            float r11 = r11 / r10
            float r9 = r9 - r11
            int r8 = r8.f10315m
            float r8 = (float) r8
            float r8 = r8 - r9
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 > 0) goto L63
            int r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r9 <= 0) goto L63
            r5 = r8
        L63:
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 < 0) goto L6c
            int r7 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r7 >= 0) goto L6c
            r6 = r8
        L6c:
            int r4 = r4 + 1
            goto L11
        L6f:
            float r13 = java.lang.Math.signum(r13)
            int r14 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r14 != 0) goto L84
            float r13 = java.lang.Math.abs(r6)
            float r14 = java.lang.Math.abs(r5)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 > 0) goto L94
            goto L8a
        L84:
            r14 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 != 0) goto L8c
        L8a:
            r5 = r6
            goto L94
        L8c:
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto L93
            goto L94
        L93:
            r5 = r7
        L94:
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 != 0) goto L99
            goto L9f
        L99:
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L9e
            goto L9f
        L9e:
            r7 = r5
        L9f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0193s4.f(float, t.w):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // p.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p.C1051x0 r5, float r6, q2.InterfaceC1073d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof H.C0181q4
            if (r0 == 0) goto L13
            r0 = r7
            H.q4 r0 = (H.C0181q4) r0
            int r1 = r0.f3039m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3039m = r1
            goto L18
        L13:
            H.q4 r0 = new H.q4
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f3037k
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f3039m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            C1.y.J(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            C1.y.J(r7)
            r0.f3039m = r3
            java.lang.Object r7 = r4.g(r5, r6, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            H.p r7 = (H.C0169p) r7
            java.lang.Object r5 = r7.f2988a
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L57
        L4b:
            m.n r5 = r7.f2989b
            java.lang.Object r5 = r5.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r6 = r5.floatValue()
        L57:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0193s4.a(p.x0, float, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p.InterfaceC1012d0 r6, float r7, m.C0841n r8, m.C0850x r9, q2.InterfaceC1073d r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof H.C0132j4
            if (r0 == 0) goto L13
            r0 = r10
            H.j4 r0 = (H.C0132j4) r0
            int r1 = r0.f2778p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2778p = r1
            goto L18
        L13:
            H.j4 r0 = new H.j4
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f2776n
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f2778p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r7 = r0.f2773k
            z2.p r6 = r0.f2775m
            m.n r8 = r0.f2774l
            C1.y.J(r10)
            goto L65
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            C1.y.J(r10)
            z2.p r10 = new z2.p
            r10.<init>()
            java.lang.Object r2 = r8.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L4e
            r2 = r3
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r2 = r2 ^ r3
            H.k4 r4 = new H.k4
            r4.<init>(r7, r5, r10, r6)
            r0.f2774l = r8
            r0.f2775m = r10
            r0.f2773k = r7
            r0.f2778p = r3
            java.lang.Object r6 = m.AbstractC0831e.e(r8, r9, r2, r4, r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            r6 = r10
        L65:
            H.p r9 = new H.p
            float r6 = r6.f11906h
            float r7 = r7 - r6
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            r9.<init>(r6, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0193s4.c(p.d0, float, m.n, m.x, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p.InterfaceC1012d0 r10, float r11, float r12, m.C0841n r13, m.InterfaceC0840m r14, q2.InterfaceC1073d r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof H.C0146l4
            if (r0 == 0) goto L14
            r0 = r15
            H.l4 r0 = (H.C0146l4) r0
            int r1 = r0.f2862r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f2862r = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            H.l4 r0 = new H.l4
            r0.<init>(r9, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f2861p
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r6.f2862r
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            float r10 = r6.f2860o
            float r11 = r6.f2859n
            z2.p r12 = r6.f2858m
            m.n r13 = r6.f2857l
            H.s4 r14 = r6.f2856k
            C1.y.J(r15)
            goto L84
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            C1.y.J(r15)
            z2.p r15 = new z2.p
            r15.<init>()
            java.lang.Object r1 = r13.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r11)
            java.lang.Object r1 = r13.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L63
            r1 = r2
            goto L64
        L63:
            r1 = 0
        L64:
            r4 = r1 ^ 1
            H.k4 r5 = new H.k4
            r5.<init>(r9, r12, r15, r10)
            r6.f2856k = r9
            r6.f2857l = r13
            r6.f2858m = r15
            r6.f2859n = r11
            r6.f2860o = r8
            r6.f2862r = r2
            r1 = r13
            r2 = r3
            r3 = r14
            java.lang.Object r10 = m.AbstractC0831e.f(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L81
            return r0
        L81:
            r14 = r9
            r12 = r15
            r10 = r8
        L84:
            java.lang.Object r15 = r13.a()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r14.getClass()
            float r10 = e(r15, r10)
            H.p r14 = new H.p
            float r12 = r12.f11906h
            float r11 = r11 - r12
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r11)
            r11 = 29
            m.n r10 = m.AbstractC0831e.j(r13, r7, r10, r11)
            r14.<init>(r12, r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0193s4.d(p.d0, float, float, m.n, m.m, q2.d):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0193s4)) {
            return false;
        }
        C0193s4 c0193s4 = (C0193s4) obj;
        return z2.h.a(c0193s4.f3091c, this.f3091c) && z2.h.a(c0193s4.f3090b, this.f3090b) && z2.h.a(c0193s4.f3089a, this.f3089a) && z2.h.a(c0193s4.f3092d, this.f3092d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(p.C1051x0 r5, float r6, q2.InterfaceC1073d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof H.C0153m4
            if (r0 == 0) goto L13
            r0 = r7
            H.m4 r0 = (H.C0153m4) r0
            int r1 = r0.f2914m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2914m = r1
            goto L18
        L13:
            H.m4 r0 = new H.m4
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f2912k
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f2914m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            C1.y.J(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            C1.y.J(r7)
            H.n4 r7 = new H.n4
            r2 = 0
            r7.<init>(r6, r4, r5, r2)
            r0.f2914m = r3
            H.p4 r5 = r4.f3094f
            java.lang.Object r7 = J2.B.z(r5, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            H.p r7 = (H.C0169p) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0193s4.g(p.x0, float, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(p.InterfaceC1012d0 r8, float r9, float r10, q2.InterfaceC1073d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof H.C0187r4
            if (r0 == 0) goto L14
            r0 = r11
            H.r4 r0 = (H.C0187r4) r0
            int r1 = r0.f3067n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f3067n = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            H.r4 r0 = new H.r4
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f3065l
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r6.f3067n
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            H.s4 r8 = r6.f3064k
            C1.y.J(r11)
            goto L4d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            C1.y.J(r11)
            r11 = 28
            m.n r4 = m.AbstractC0831e.b(r10, r11)
            r6.f3064k = r7
            r6.f3067n = r2
            m.x r5 = r7.f3090b
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Object r11 = r1.c(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L4c
            return r0
        L4c:
            r8 = r7
        L4d:
            H.p r11 = (H.C0169p) r11
            m.n r9 = r11.f2989b
            java.lang.Object r10 = r9.a()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            t.w r8 = r8.f3089a
            float r8 = f(r10, r8)
            H.p r10 = new H.p
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r8)
            r10.<init>(r11, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0193s4.h(p.d0, float, float, q2.d):java.lang.Object");
    }

    public final int hashCode() {
        return this.f3092d.hashCode() + ((this.f3089a.hashCode() + ((this.f3090b.hashCode() + (this.f3091c.hashCode() * 31)) * 31)) * 31);
    }
}
