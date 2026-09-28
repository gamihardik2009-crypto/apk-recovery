package M2;

import J2.AbstractC0304a;
import J2.C0325w;
import J2.InterfaceC0328z;
import J2.j0;
import J2.p0;
import N2.AbstractC0364c;
import N2.AbstractC0368g;
import m2.C0880v;
import q2.C1074e;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final O2.v f4829a = new O2.v("NO_VALUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final O2.v f4830b = new O2.v("NONE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final O2.v f4831c = new O2.v("PENDING", 0);

    public static O a(int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(B1.t.h("replay cannot be negative, but was ", i2).toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(B1.t.h("extraBufferCapacity cannot be negative, but was ", i3).toString());
        }
        if (i2 <= 0 && i3 <= 0 && i4 != 1) {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(B1.t.F(i4)).toString());
        }
        int i6 = i3 + i2;
        if (i6 < 0) {
            i6 = Integer.MAX_VALUE;
        }
        return new O(i2, i6, i4);
    }

    public static final d0 b(Object obj) {
        if (obj == null) {
            obj = AbstractC0364c.f5033b;
        }
        return new d0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(M2.f0 r4, y2.f r5, java.lang.Throwable r6, q2.InterfaceC1073d r7) {
        /*
            boolean r0 = r7 instanceof M2.r
            if (r0 == 0) goto L13
            r0 = r7
            M2.r r0 = (M2.r) r0
            int r1 = r0.f4916m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4916m = r1
            goto L18
        L13:
            M2.r r0 = new M2.r
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4915l
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f4916m
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f4914k
            C1.y.J(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            C1.y.J(r7)
            r0.f4914k = r6     // Catch: java.lang.Throwable -> L29
            r0.f4916m = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.i(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            goto L43
        L41:
            m2.v r1 = m2.C0880v.f8657a
        L43:
            return r1
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            B1.C.p(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.P.c(M2.f0, y2.f, java.lang.Throwable, q2.d):java.lang.Object");
    }

    public static final void d(Object[] objArr, long j3, Object obj) {
        objArr[((int) j3) & (objArr.length - 1)] = obj;
    }

    public static final Object e(InterfaceC0343g interfaceC0343g, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        int i2 = AbstractC0358w.f4934a;
        Object b3 = AbstractC0364c.a(o(interfaceC0343g, new C0357v(eVar, null, 0)), null, 0, 1, 1).b(N2.y.f5090h, interfaceC1073d);
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        C0880v c0880v = C0880v.f8657a;
        if (b3 != enumC1145a) {
            b3 = c0880v;
        }
        return b3 == enumC1145a ? b3 : c0880v;
    }

    public static final InterfaceC0343g f(InterfaceC0343g interfaceC0343g, long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
        }
        if (j3 == 0) {
            return interfaceC0343g;
        }
        return new G1.h(3, new C0351o(new C0346j(j3, 0), interfaceC0343g, null));
    }

    public static final InterfaceC0343g g(InterfaceC0343g interfaceC0343g) {
        if (interfaceC0343g instanceof b0) {
            return interfaceC0343g;
        }
        C0353q c0353q = C0353q.f4913i;
        C0352p c0352p = C0352p.f4912i;
        if (interfaceC0343g instanceof C0342f) {
            C0342f c0342f = (C0342f) interfaceC0343g;
            if (c0342f.f4881i == c0353q && c0342f.f4882j == c0352p) {
                return interfaceC0343g;
            }
        }
        return new C0342f(interfaceC0343g);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0055, B:19:0x006a, B:21:0x0072, B:32:0x0046, B:35:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(M2.InterfaceC0344h r6, L2.w r7, boolean r8, q2.InterfaceC1073d r9) {
        /*
            boolean r0 = r9 instanceof M2.C0345i
            if (r0 == 0) goto L13
            r0 = r9
            M2.i r0 = (M2.C0345i) r0
            int r1 = r0.f4889p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4889p = r1
            goto L18
        L13:
            M2.i r0 = new M2.i
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4888o
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f4889p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f4887n
            L2.a r6 = r0.f4886m
            L2.w r7 = r0.f4885l
            M2.h r2 = r0.f4884k
            C1.y.J(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L55
        L34:
            r6 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f4887n
            L2.a r6 = r0.f4886m
            L2.w r7 = r0.f4885l
            M2.h r2 = r0.f4884k
            C1.y.J(r9)     // Catch: java.lang.Throwable -> L34
            goto L6a
        L4a:
            C1.y.J(r9)
            boolean r9 = r6 instanceof M2.f0
            if (r9 != 0) goto L98
            L2.a r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L55:
            r0.f4884k = r6     // Catch: java.lang.Throwable -> L34
            r0.f4885l = r7     // Catch: java.lang.Throwable -> L34
            r0.f4886m = r9     // Catch: java.lang.Throwable -> L34
            r0.f4887n = r8     // Catch: java.lang.Throwable -> L34
            r0.f4889p = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L66
            return r1
        L66:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L87
            java.lang.Object r9 = r6.c()     // Catch: java.lang.Throwable -> L34
            r0.f4884k = r2     // Catch: java.lang.Throwable -> L34
            r0.f4885l = r7     // Catch: java.lang.Throwable -> L34
            r0.f4886m = r6     // Catch: java.lang.Throwable -> L34
            r0.f4887n = r8     // Catch: java.lang.Throwable -> L34
            r0.f4889p = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.f(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
            return r1
        L87:
            if (r8 == 0) goto L8d
            r6 = 0
            C1.y.k(r7, r6)
        L8d:
            m2.v r6 = m2.C0880v.f8657a
            return r6
        L90:
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r9 = move-exception
            if (r8 == 0) goto L97
            C1.y.k(r7, r6)
        L97:
            throw r9
        L98:
            M2.f0 r6 = (M2.f0) r6
            java.lang.Throwable r6 = r6.f4883h
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.P.h(M2.h, L2.w, boolean, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(G1.h r6, q2.InterfaceC1073d r7) {
        /*
            boolean r0 = r7 instanceof M2.C0361z
            if (r0 == 0) goto L13
            r0 = r7
            M2.z r0 = (M2.C0361z) r0
            int r1 = r0.f4945n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4945n = r1
            goto L18
        L13:
            M2.z r0 = new M2.z
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4944m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f4945n
            O2.v r3 = N2.AbstractC0364c.f5033b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            M2.x r6 = r0.f4943l
            z2.s r0 = r0.f4942k
            C1.y.J(r7)     // Catch: N2.C0362a -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            C1.y.J(r7)
            z2.s r7 = new z2.s
            r7.<init>()
            r7.f11909h = r3
            M2.x r2 = new M2.x
            r5 = 0
            r2.<init>(r7, r5)
            r0.f4942k = r7     // Catch: N2.C0362a -> L56
            r0.f4943l = r2     // Catch: N2.C0362a -> L56
            r0.f4945n = r4     // Catch: N2.C0362a -> L56
            java.lang.Object r6 = r6.b(r2, r0)     // Catch: N2.C0362a -> L56
            if (r6 != r1) goto L54
            goto L62
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            M2.h r1 = r7.f5027h
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r1 = r0.f11909h
            if (r1 == r3) goto L63
        L62:
            return r1
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.P.i(G1.h, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(M2.InterfaceC0343g r6, y2.e r7, q2.InterfaceC1073d r8) {
        /*
            boolean r0 = r8 instanceof M2.A
            if (r0 == 0) goto L13
            r0 = r8
            M2.A r0 = (M2.A) r0
            int r1 = r0.f4790o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4790o = r1
            goto L18
        L13:
            M2.A r0 = new M2.A
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4789n
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f4790o
            O2.v r3 = N2.AbstractC0364c.f5033b
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            D.J r6 = r0.f4788m
            z2.s r7 = r0.f4787l
            y2.e r0 = r0.f4786k
            C1.y.J(r8)     // Catch: N2.C0362a -> L2f
            goto L64
        L2f:
            r8 = move-exception
            goto L60
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            C1.y.J(r8)
            z2.s r8 = new z2.s
            r8.<init>()
            r8.f11909h = r3
            D.J r2 = new D.J
            r5 = 4
            r2.<init>(r7, r5, r8)
            r0.f4786k = r7     // Catch: N2.C0362a -> L5b
            r0.f4787l = r8     // Catch: N2.C0362a -> L5b
            r0.f4788m = r2     // Catch: N2.C0362a -> L5b
            r0.f4790o = r4     // Catch: N2.C0362a -> L5b
            java.lang.Object r6 = r6.b(r2, r0)     // Catch: N2.C0362a -> L5b
            if (r6 != r1) goto L58
            goto L68
        L58:
            r0 = r7
            r7 = r8
            goto L64
        L5b:
            r6 = move-exception
            r0 = r7
            r7 = r8
            r8 = r6
            r6 = r2
        L60:
            M2.h r1 = r8.f5027h
            if (r1 != r6) goto L7d
        L64:
            java.lang.Object r1 = r7.f11909h
            if (r1 == r3) goto L69
        L68:
            return r1
        L69:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L7d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.P.j(M2.g, y2.e, q2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(G1.h r5, q2.InterfaceC1073d r6) {
        /*
            boolean r0 = r6 instanceof M2.B
            if (r0 == 0) goto L13
            r0 = r6
            M2.B r0 = (M2.B) r0
            int r1 = r0.f4794n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4794n = r1
            goto L18
        L13:
            M2.B r0 = new M2.B
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4793m
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f4794n
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            M2.x r5 = r0.f4792l
            z2.s r0 = r0.f4791k
            C1.y.J(r6)     // Catch: N2.C0362a -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            C1.y.J(r6)
            z2.s r6 = new z2.s
            r6.<init>()
            M2.x r2 = new M2.x
            r4 = 1
            r2.<init>(r6, r4)
            r0.f4791k = r6     // Catch: N2.C0362a -> L52
            r0.f4792l = r2     // Catch: N2.C0362a -> L52
            r0.f4794n = r3     // Catch: N2.C0362a -> L52
            java.lang.Object r5 = r5.b(r2, r0)     // Catch: N2.C0362a -> L52
            if (r5 != r1) goto L50
            goto L5c
        L50:
            r0 = r6
            goto L5a
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            M2.h r1 = r6.f5027h
            if (r1 != r5) goto L5d
        L5a:
            java.lang.Object r1 = r0.f11909h
        L5c:
            return r1
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.P.k(G1.h, q2.d):java.lang.Object");
    }

    public static final InterfaceC0343g l(InterfaceC0343g interfaceC0343g, Q2.d dVar) {
        if (dVar.s(C0325w.f4437i) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dVar).toString());
        }
        if (z2.h.a(dVar, C1079j.f9784h)) {
            return interfaceC0343g;
        }
        if (interfaceC0343g instanceof N2.w) {
            return AbstractC0364c.a((N2.w) interfaceC0343g, dVar, 0, 0, 6);
        }
        InterfaceC1078i interfaceC1078i = dVar;
        if ((12 & 2) != 0) {
            interfaceC1078i = C1079j.f9784h;
        }
        return new N2.j(interfaceC0343g, interfaceC1078i, (12 & 4) != 0 ? -3 : 0, (12 & 8) != 0 ? 1 : 0);
    }

    public static final InterfaceC0343g m(L l3, InterfaceC1078i interfaceC1078i, int i2, int i3) {
        return ((i2 == 0 || i2 == -3) && i3 == 1) ? l3 : new N2.j(l3, interfaceC1078i, i2, i3);
    }

    public static final K n(InterfaceC0343g interfaceC0343g, InterfaceC0328z interfaceC0328z, a0 a0Var, Object obj) {
        K1.c cVar;
        AbstractC0368g abstractC0368g;
        InterfaceC0343g h2;
        L2.k.f4736d.getClass();
        L2.j jVar = L2.j.f4734a;
        if (!(interfaceC0343g instanceof AbstractC0368g) || (h2 = (abstractC0368g = (AbstractC0368g) interfaceC0343g).h()) == null) {
            cVar = new K1.c(interfaceC0343g, C1079j.f9784h);
        } else {
            if (abstractC0368g.f5044i != -3) {
            }
            cVar = new K1.c(h2, abstractC0368g.f5043h);
        }
        d0 b3 = b(obj);
        int i2 = z2.h.a(a0Var, T.f4838a) ? 1 : 4;
        E e3 = new E(a0Var, (InterfaceC0343g) cVar.f4532a, b3, obj, null);
        InterfaceC1078i h3 = J2.B.h(interfaceC0328z.r(), (InterfaceC1078i) cVar.f4533b, true);
        Q2.d dVar = J2.H.f4356a;
        if (h3 != dVar && h3.s(C1074e.f9782h) == null) {
            h3 = h3.A(dVar);
        }
        if (i2 == 0) {
            throw null;
        }
        AbstractC0304a j0Var = i2 == 2 ? new j0(h3, e3) : new p0(h3, true);
        j0Var.m0(i2, j0Var, e3);
        return new K(b3);
    }

    public static final N2.n o(InterfaceC0343g interfaceC0343g, y2.f fVar) {
        int i2 = AbstractC0358w.f4934a;
        return new N2.n(fVar, interfaceC0343g, C1079j.f9784h, -2, 1);
    }
}
